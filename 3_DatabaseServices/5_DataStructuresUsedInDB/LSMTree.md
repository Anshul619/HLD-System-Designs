# LSM-Tree (Log-Structured Merge Tree)
- [LSM-Tree](https://en.wikipedia.org/wiki/Log-structured_merge-tree) maintain key-value pairs and are persisted to disk using a [Sorted Strings Table (SSTable)](https://docs.datastax.com/en/archived/cassandra/3.0/cassandra/dml/dmlHowDataWritten.html).

![](https://www.scylladb.com/wp-content/uploads/sstable-diagram.png)

# How write operations handled in LSM tree?

|                            | Sub Data Structure | Target   | Remarks                                                                                                                                                                        |
|----------------------------|--------------------|----------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Append to Log-file in disk | Commit Log         | Disk     | It first sequentially writes the data [to log-file in disk in-append mode](AppendOnlyProperty.md).<br/>- Once written to disk, the data is immutable and is never overwritten. |
| Append data in Memtables   | Memtables          | InMemory | Data is also pushed in an in-memory sorted data structure known as MemTables.                                                                                                  |
| Periodic flush to SSTables | SStables           | Disk     | Periodically, all the data is flushed from MemTables to on-disk storage known as SSTables.                                                                                     |
| Indexing in SSTables       | Bloom filters      | InMemory | SSTables also maintain in-memory data structures known as Bloom filters which helps us to speed up the search while reading the data.                                          |

# How searching will work?

|                         | Storage         | Remarks                                                                                                                                                                                                                                                                                                |
|-------------------------|-----------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| First search - MemTable | InMemory        | When we are searching for a particular key, we search the MemTables first.                                                                                                                                                                                                                             |
| 1st Fallback - SSTable  | InMemory + Disk | If the key is not available on the Memtables, then we search for the key on the SStables and we are helped here by the Bloom filters which narrow down our scope of search.<br/>- If the records are found on the SStables, then we return that row to the client else we return the record not found. |

# Supported Databases
- It is mostly used in NoSQL databases.

| DB                                                            |
|---------------------------------------------------------------|
| [MongoDB](../10_Document-Databases/MongoDB/Readme.md)               |
| [Casandra](../11_WideColumn-Databases/ApacheCasandra.md) |
| [ElasticSearch](../9_Search-Databases/ElasticSearch/Readme.md)  |
| [RocksDB](../14_EmbededKeyValue-Databases/RocksDB.md)    |
| [InfluxDB](../12_TimeSeries-Databases/InfluxDB.md)       |

# Read more
- [Understanding How Databases Store our Data: Introduction to LSM trees](https://javascript.plainenglish.io/understanding-how-databases-store-our-data-introduction-to-lsm-trees-ec1c46096570)
- [Power of the Log: LSM & Append Only Data Structures](https://www.slideshare.net/ConfluentInc/power-of-the-loglsm-append-only-data-structures)
- [Casandra - Storage engine](https://docs.datastax.com/en/cassandra-oss/3.x/cassandra/dml/dmlManageOndisk.html)
- [Scylladb - SSTable](https://www.scylladb.com/glossary/sstable/)
- [BytesBytesGo - The Secret Sauce Behind NoSQL: LSM Tree](https://www.youtube.com/watch?v=I6jB0nM9SKU)