# Data Structures which power DBs?

| Data Structure                                     | Key Purpose                                                                  | Supported DBs                                                                                                                    |
|----------------------------------------------------|------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| [B-Tree - Balanced tree](Indexing/BTree.md)        | [Indexing in SQL-DBs](Indexing/Readme.md) (read is O(log n))                 | [PostgreSQL, MySQL](../SQL-Databases/Readme.md), [MongoDB](../NoSQL-Databases/DocumentDB/MongoDB/Readme.md) etc.                 |
| [LSM-Tree - Log-structured merge tree](LSMTree.md) | [Storage in NoSQL-DBs](Indexing/Readme.md) (write is quite fast - in-memory) | [Casandra](../NoSQL-Databases/WideColumnDB/ApacheCasandra.md), [ElasticSearch](../Search-Databases/ElasticSearch/Readme.md) etc. |
| [Inverted Index](InvertedIndex.md)                 | [Indexing in Search DBs](../Search-Databases/Readme.md)                      | [ElasticSearch](../Search-Databases/ElasticSearch/Readme.md)                                                                     |

# Read more
- [8 Key Data Structures That Power Modern Databases](https://www.youtube.com/watch?v=W_v05d_2RTo)