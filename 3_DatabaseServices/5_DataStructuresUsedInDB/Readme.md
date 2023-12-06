# Data Structures which power DBs?

| Data Structure                                     | Key Purpose                                                                  | Supported DBs                                                                                                                    |
|----------------------------------------------------|------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| [B-Tree - Balanced tree](Indexing/BTree.md)        | [Indexing in SQL-DBs](Indexing/Readme.md) (read is O(log n))                 | [PostgreSQL, MySQL](../7_SQL-Databases/Readme.md), [MongoDB](../10_Document-Databases/MongoDB.md) etc.                 |
| [LSM-Tree - Log-structured merge tree](LSMTree.md) | [Storage in NoSQL-DBs](Indexing/Readme.md) (write is quite fast - in-memory) | [Casandra](../11_WideColumn-Databases/ApacheCasandra.md), [ElasticSearch](../9_Search-Databases/ElasticSearch/Readme.md) etc. |
| [Inverted Index](InvertedIndex.md)                 | [Indexing in Search DBs](../9_Search-Databases/Readme.md)                      | [ElasticSearch](../9_Search-Databases/ElasticSearch/Readme.md)                                                                     |

# Read more
- [8 Key Data Structures That Power Modern Databases](https://www.youtube.com/watch?v=W_v05d_2RTo)