# LSM-Tree
- [LSM-Tree (Log-Structured Merge Tree)](https://en.wikipedia.org/wiki/Log-structured_merge-tree) is widely used by many NoSQL databases, such as [Cassandra](../NoSQL-Databases/ApacheCasandra.md), [RocksDB](../NoSQL-Databases/RocksDB.md), [ElasticSearch](../Search-Databases/ElasticSearch/Readme.md), LevelDB etc.
- LSM-trees maintain key-value pairs and are persisted to disk using a [Sorted Strings Table (SSTable)](https://docs.datastax.com/en/archived/cassandra/3.0/cassandra/dml/dmlHowDataWritten.html), in which the keys are sorted.

![](https://www.scylladb.com/wp-content/uploads/sstable-diagram.png)

# Advantage - Avoid Read-Before-Write
- To avoid using read-before-write for most writes, the storage engine groups inserts and updates in memory, and at intervals, sequentially writes the data to disk in append mode. 
- Once written to disk, the data is immutable and is never overwritten. 
- Reading data involves combining this immutable sequentially-written data to discover the correct query results.

# Read more
- [Storage engine](https://docs.datastax.com/en/cassandra-oss/3.x/cassandra/dml/dmlManageOndisk.html)
- [SSTable](https://www.scylladb.com/glossary/sstable/)