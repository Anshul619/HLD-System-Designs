# Indexing
- An [index](https://www.geeksforgeeks.org/indexing-in-databases-set-1/) is a data structure that is used to find and access data available in a table of a database faster.

# :+1: Advantages of Indexes

| Title                                | Remarks                                                                                                                                                                            |
|--------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| O(log n) query time, instead of O(n) | Indexes are used to speed up lookups (log-time instead of scanning the entire table) and to keep the data in memory. <br/>- This increases performance of queries.                 |

> Note - SQL indexes stop working after a certain data threshold (like after 1 billion records).

# :-1: Disadvantages of Indexes

| Title                                          | Remarks                                                                                                               |
|------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| Increased storage space                        | Placing an index would add BTree data structure in disk, hence increasing space.                                      |
| Slow Writes                                    | Writes could be slower since the index also needs to be updated. Hence, we should create only required indexes.       |
| Drop indices before loading big-data           | When loading large amounts of data, it might be faster to disable indices, load the data, then rebuild the indices.   |
| Incorrect compound indexes can be inconsistent | [Swiggy - BehindTheBug — Indexing Gone Wrong](https://bytes.swiggy.com/behindthebug-indexing-gone-wrong-6b4d682fd805) |

# Data Structure Used

| Data Structure                                        | Service                                                                                                                |
|-------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|
| [B-Tree](BTree.md)                                    | [SQL-DBs like Postgres, MySQL etc.](../7_SQL-Databases/Readme.md)<br/>- [MongoDB](../10_Document-Databases/MongoDB.md) |
| [MemTables and Bloom Filters in LMS-Tree](LSMTree.md) | [NoSQL-DBs like Casandra, HBase](../11_WideColumn-Databases)                                                           |

# Types of Indexes

| Type                                                                                                          | Supported DBs     | Description                                                                                                                                                                                                                                        |
|---------------------------------------------------------------------------------------------------------------|-------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Primary Index](https://pediaa.com/what-is-the-difference-between-primary-and-secondary-index/)               | All Data-stores   | Primary index is an index on a set of fields that includes the primary key and does not contain duplicates.                                                                                                                                        |
| [Secondary Index](https://pediaa.com/what-is-the-difference-between-primary-and-secondary-index/)             | SQL Databases     | Secondary index is an index that is not a primary index and can contain duplicates.<br/>- Common in document databases<br/>- Not implemented in wide-column databases like Casandra.                                                               |
| [Full-Text Index](https://www.mongodb.com/basics/full-text-search)                                            | Search-DBs        | Full-text search refers to searching some text inside extensive text data stored electronically and returning results that contain some or all of the words from the query.                                                                        |
| [Range Index](https://docs.pinot.apache.org/basics/indexing/range-index)                                      | Search-DBs        | Range indexing allows you to get better performance for queries that involve filtering over a range.                                                                                                                                               |
| [Spatial Index](https://stackoverflow.com/questions/2256364/what-is-a-spatial-index-and-when-should-i-use-it) | Search-DBs        | You can use a spatial index for indexing geo-objects - shapes. The spatial index makes it possible to efficiently search for objects that overlap in space.                                                                                        |
| [Multikey Indexes](https://www.mongodb.com/docs/manual/core/index-multikey/)                                  | MongoDB           | To index a field that holds an array value, MongoDB creates an index key for each element in the array. <br/>- These multikey indexes support efficient queries against array fields.                                                              |
| [Compound Indexes](https://www.mongodb.com/docs/manual/core/index-compound/)                                  | MongoDB, SQL etc. | MongoDB supports compound indexes, where a single index structure holds references to multiple fields within a collection's documents.                                                                                                             |
| [Partial Indexes](https://www.postgresql.org/docs/current/indexes-partial.html)                               | All Data-stores   | A partial index is an index built over a subset of a table; the subset is defined by a conditional expression (called the predicate of the partial index). <br/>- The index contains entries only for those table rows that satisfy the predicate. |

# Partitioning/Sharding - Types of Secondary Indexes

| Type                   | Description                                                                                                                                                                                                                                                                               | Consistency                                                   | Examples                                                                                                   |
|------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| Local Secondary Index  | A local secondary index is **local** in the sense that every partition of a local secondary index is scoped to a base table partition that has the same partition key value.                                                                                                              | Eventual consistency only                                     | [Amazon DynamoDB](../../2_AWS/6_DatabaseServices/AmazonDynamoDB/Readme.md), MongoDB, Casandra etc. |
| Global Secondary Index | A global secondary index is considered **global** because queries on the index can span all of the data in the base table, across all partitions.<br/>- A global secondary index is stored in its own partition space away from the base table and scales separately from the base table. | Can choose either eventual consistency or strong consistency. | [Amazon DynamoDB](../../2_AWS/6_DatabaseServices/AmazonDynamoDB/Readme.md), MongoDB etc.           |

# References
- [How does database indexing work?](https://stackoverflow.com/questions/1108/how-does-database-indexing-work)
- [What Does Indexing Do?](https://chartio.com/learn/databases/how-does-indexing-work/)
- [Donnemartin - Good Indices](https://github.com/donnemartin/system-design-primer#use-good-indices)
- [Difference between Primary and Secondary](https://pediaa.com/what-is-the-difference-between-primary-and-secondary-index/)
- [DynamoDB - Types of Secondary Indexes](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/SecondaryIndexes.html)
- [Database Index: usage of B+ tree in the practical database system](https://www.callibrity.com/blog/database-index-usage-of-b-tree-in-the-practical-database-system)
- [Gojek - The Case(s) Of Postgres Not Using Index](https://www.gojek.io/blog/the-case-s-of-postgres-not-using-index)
- [Use the indexes, Luke!](https://use-the-index-luke.com/sql/preface)