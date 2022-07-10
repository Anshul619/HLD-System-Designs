
# Use Cases
- Service calculates the `past week's most popular products by category`.
- User views the past week's most popular products by category.
- Service has high availability.

# Assumptions
- 10 million products
- 1000 categories
- 1 billion transactions per month
- 100 billion read requests per month
- 100 reads per write ( 100:1 read:write ) ratio

# DB Design

## Sales Rank table
- `id`, `category_id`, `product_id` columns should be indexed.
- SalesRank service would get the corresponding sales data from sales table and populate this table. And then sort those records.

```
id int NOT NULL AUTO_INCREMENT
category_id int NOT NULL
product_id int NOT NULL
total_sold int NOT NULL
PRIMARY KEY(id)
FOREIGN KEY(category_id) REFERENCES Categories(id)
FOREIGN KEY(product_id) REFERENCES Products(id)
```

# References
- [Design Amazon's sales rank by category feature](https://github.com/donnemartin/system-design-primer/blob/master/solutions/system_design/sales_rank/README.md)