# Indexing
- An [index](https://www.geeksforgeeks.org/indexing-in-databases-set-1/) is a data structure that is used to find and access data available in a table of a database faster.
- Generally, an index has two sections: the search key and the data reference.

# :+1: Advantages of Indexes
- Indexes are used to speed up lookups (log-time instead of scanning the entire table) and to keep the data in memory. This will increase performance of SQL queries.
- Indices are usually represented as self-balancing B-tree that keeps data sorted and allows searches, sequential access, insertions, and deletions in logarithmic time.
- [Read more](https://github.com/donnemartin/system-design-primer#use-good-indices)

# :-1: Disadvantages of Indexes
- Placing an index can keep the data in memory, requiring more space.
- Writes could also be slower since the index also needs to be updated. Hence, we should create only required indexes.
- When loading large amounts of data, it might be faster to disable indices, load the data, then rebuild the indices.
- [Read more](https://github.com/donnemartin/system-design-primer#use-good-indices)

# Types of Indexes

| Type                                                                                              | Description                                                                                                 | Examples                                                                                                                   | Supported DBs                                                                                                                                                                                            |
|---------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Primary Index](https://pediaa.com/what-is-the-difference-between-primary-and-secondary-index/)   | Primary index is an index on a set of fields that includes the primary key and does not contain duplicates. | - Find a user with user123 user                                                                                            | All Data-stores                                                                                                                                                                                          |
| [Secondary Index](https://pediaa.com/what-is-the-difference-between-primary-and-secondary-index/) | Secondary index is an index that is not a primary index and can contain duplicates.                         | - Find all actions by user123 <br/>- Find all articles containing the word hogwash<br/>- Find all cars whose color is red. | - Bread & Butter of SQL Databases<br/>- Reason of existing for Search servers like ElasticSearch etc.<br/>- Common in document databases<br/>- Not implemented in wide-column databases like Casandra.   |

[Read more](https://pediaa.com/what-is-the-difference-between-primary-and-secondary-index/)
