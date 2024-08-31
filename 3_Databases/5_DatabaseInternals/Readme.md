# Data Structures which power DBs?

| Data Structure                                           | Key Purpose            | Storage                       | Supported DBs                                                                                                                 |
|----------------------------------------------------------|------------------------|-------------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| [B-Tree - Balanced tree](BTree.md)                       | Indexing in SQL-DBs    | In-Memory (**O(log n)** time) | [PostgreSQL, MySQL](../7_SQL-Databases/Readme.md), [MongoDB](../10_Document-Databases/MongoDB.md) etc.                        |
| [LSM-Tree - Log-structured merge tree](LSMTree.md)       | Storage in NoSQL-DBs   | In-Memory (writes)            | [Casandra](../11_WideColumn-Databases/ApacheCasandra.md), [ElasticSearch](../9_Search-Databases/ElasticSearch/Readme.md) etc. |
| [Inverted Index](../9_Search-Databases/Internals/InvertedIndex.md) | Indexing in Search DBs |                               | [ElasticSearch](../9_Search-Databases/ElasticSearch/Readme.md)                                                                |

# Read more
- [8 Key Data Structures That Power Modern Databases](https://www.youtube.com/watch?v=W_v05d_2RTo)