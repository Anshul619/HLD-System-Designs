
# Design Amazon's sales rank by category feature

# Use Cases
- Service calculates the past week's most popular products by category.
- User views the past week's most popular products by category.
- Service should have [high availability](../../5_HighAvailability/Readme.md).

# Estimation
- [Sales Rank estimation](https://docs.google.com/spreadsheets/d/15vApko2QrmZmv5qTEIyU_IAWvgY3MD23TR3TuLUiPc8/edit#gid=1814606830)

# System Design

![](https://camo.githubusercontent.com/9998bc0bfdd975524dc971f539306dfa53fccd5ae74f2559729bfd8b37cd475e/687474703a2f2f692e696d6775722e636f6d2f4d7a45785030362e706e67)

# DB Design

## Sales Rank table

| timestamp | product_id   | category_id | qty | total_price | seller_id | buyer_id |
|-----------|--------------|-------------|-----|-------------|-----------|----------|
| t1        | product1     | category1   | 2   | 20.00       | 1         | 1        |
| t2        | product1     | category2   | 2   | 20.00       | 2         | 2        |
| t2        | product1     | category2   | 1   | 10.00       | 2         | 3        |
| t3        | product2     | category1   | 3   | 7.00        | 3         | 4        |
| t4        | product3     | category2   | 7   | 2.00        | 4         | 5        |
| t5        | product4     | category1   | 1   | 5.00        | 5         | 6        |

> Note - `id`, `category_id`, `product_id` columns should be [indexed](https://github.com/Anshul619/Database-Internals/blob/main/DataStructures/Index.md), for faster performance.

# How to populate Sales Rank table?
- SalesRank service would get the sales data from sales table, then apply [Map Reduce](https://github.com/Anshul619/data-engineering/tree/main/DataProcessing/ApacheSpark/Readme.md) and populate `sales_rank` table. 
- And then sort those records.
- A nightly job to update Sales Rank for last week.

````python
class SalesRanker(MRJob):

    def within_past_week(self, timestamp):
        """Return True if timestamp is within past week, False otherwise."""
        ...

    def mapper(self, _ line):
        """Parse each log line, extract and transform relevant lines.

        Emit key value pairs of the form:

        (category1, product1), 2
        (category2, product1), 2
        (category2, product1), 1
        (category1, product2), 3
        (category2, product3), 7
        (category1, product4), 1
        """
        timestamp, product_id, category_id, quantity, total_price, seller_id, \
            buyer_id = line.split('\t')
        if self.within_past_week(timestamp):
            yield (category_id, product_id), quantity

    def reducer(self, key, value):
        """Sum values for each key.

        (category1, product1), 2
        (category2, product1), 3
        (category1, product2), 3
        (category2, product3), 7
        (category1, product4), 1
        """
        yield key, sum(values)

    def mapper_sort(self, key, value):
        """Construct key to ensure proper sorting.

        Transform key and value to the form:

        (category1, 2), product1
        (category2, 3), product1
        (category1, 3), product2
        (category2, 7), product3
        (category1, 1), product4

        The shuffle/sort step of MapReduce will then do a
        distributed sort on the keys, resulting in:

        (category1, 1), product4
        (category1, 2), product1
        (category1, 3), product2
        (category2, 3), product1
        (category2, 7), product3
        """
        category_id, product_id = key
        quantity = value
        yield (category_id, quantity), product_id

    def reducer_identity(self, key, value):
        yield key, value

    def steps(self):
        """Run the map and reduce steps."""
        return [
            self.mr(mapper=self.mapper,
                    reducer=self.reducer),
            self.mr(mapper=self.mapper_sort,
                    reducer=self.reducer_identity),
        ]
````

The result would be the following sorted list, which we could insert into the sales_rank table:
````
(category1, 1), product4
(category1, 2), product1
(category1, 3), product2
(category2, 3), product1
(category2, 7), product3
````

# Scaling the design
- To address the 40,000 average read requests per second (higher at peak), traffic for popular content (and their sales rank) should be handled by the [Redis Cache](../../1_Databases/8_Caching-InMemory-Databases/Redis/Readme.md) instead of the database.
- With the large volume of reads, the SQL Read Replicas might not be able to handle the cache misses. 
- We'll probably need to employ additional SQL scaling patterns (like Federation, Sharding, Renormalization, SQL Tuning etc.).

# References
- [Design Amazon's sales rank by category feature](https://github.com/donnemartin/system-design-primer/blob/master/solutions/system_design/sales_rank/README.md)
- [Create a Redis Leaderboard with Golang](https://www.vultr.com/docs/create-a-redis-leaderboard-with-golang/)