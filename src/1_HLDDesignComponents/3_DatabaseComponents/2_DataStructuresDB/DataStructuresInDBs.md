# Data Structures which power DBs

| Types                                                                                           | Illustration                                                                            | Use-Case      | Used by?                                                                                                    | Remarks                                     |
|-------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------|---------------|-------------------------------------------------------------------------------------------------------------|---------------------------------------------|
| [B-Tree (Balanced tree)](https://www.geeksforgeeks.org/introduction-of-b-tree-2/)               | ![](https://media.geeksforgeeks.org/wp-content/uploads/20200507002619/output256.png)    | Disk-Based    | [MySQL](../Readme.md), [MongoDB](../NoSQL-Databases/MongoDB/Readme.md) etc.                                       | Most popular database index implementation. |
| [LSM-Tree (Log-structured merge tree)](https://en.wikipedia.org/wiki/Log-structured_merge-tree) | ![](https://yetanotherdevblog.com/content/images/2020/06/output-onlinepngtools--7-.png) | Memory + Disk | [Casandra](../NoSQL-Databases/ApacheCasandra.md), [ElasticSearch](../Search-Indexes/ElasticSearch/Readme.md) etc. | High write throughput.                      |

# B-Tree
- [B-Tree](https://www.geeksforgeeks.org/introduction-of-b-tree-2/) is the most widely used indexing data structure in almost all relational databases.
- The basic unit of information storage in B-Tree is usually called a [page](https://stackoverflow.com/questions/2502551/what-is-a-b-tree-page). 
- To look up a key, it traces down the range of keys until the actual value is found.

![](https://media.geeksforgeeks.org/wp-content/uploads/20200507002619/output256.png)

# LSM-Tree
- [LSM-Tree (Log-Structured Merge Tree)](https://en.wikipedia.org/wiki/Log-structured_merge-tree) is widely used by many NoSQL databases, such as [Cassandra](../NoSQL-Databases/ApacheCasandra.md), [RocksDB](../NoSQL-Databases/RocksDB.md), [ElasticSearch](../Search-Indexes/ElasticSearch/Readme.md), LevelDB etc.
- LSM-trees maintain key-value pairs and are persisted to disk using a [Sorted Strings Table (SSTable)](https://www.geeksforgeeks.org/sstable-in-apache-cassandra/), in which the keys are sorted.