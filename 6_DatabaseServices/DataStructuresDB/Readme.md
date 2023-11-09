# Data Structures which power DBs?

| Data Structure                                     | Key Purpose                                                                       | Supported DBs                                                                                                                    |
|----------------------------------------------------|-----------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| [B-Tree - Balanced tree](Indexing/BTree.md)        | [Indexing in SQL-DBs, since read is O(log n)](Indexing/Readme.md)                 | [PostgreSQL, MySQL](../SQL-Databases/Readme.md), [MongoDB](../NoSQL-Databases/MongoDB/Readme.md) etc.                            |
| [LSM-Tree - Log-structured merge tree](LSMTree.md) | [Storage in NoSQL-DBs, since write is quite fast (in-memory)](Indexing/Readme.md) | [Casandra](../NoSQL-Databases/WideColumnDB/ApacheCasandra.md), [ElasticSearch](../Search-Databases/ElasticSearch/Readme.md) etc. |
| [Inverted Index](InvertedIndex.md)                 | [Indexing in Search DBs](../Search-Databases/Readme.md)                           | [ElasticSearch](../Search-Databases/ElasticSearch/Readme.md)                                                                     |

# Read more
- [8 Key Data Structures That Power Modern Databases](https://www.youtube.com/watch?v=W_v05d_2RTo)