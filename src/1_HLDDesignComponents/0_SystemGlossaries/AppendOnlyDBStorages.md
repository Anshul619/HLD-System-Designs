# Append only DB storages
- Messages ( events ) in the DB store are immutable and can't be changed once it's pushed.
- Write appends ( `sequential write` ) to the store/logs, without modifying the existing data.
- This makes [writes (i.e. throughput)](LatencyThroughput.md) generally very fast.

# Supported Databases

| DB                                                                                                             | Remarks |
|----------------------------------------------------------------------------------------------------------------|---------|
| [Casandra](../3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md)                                          | -       |
| [Kafka](../4_MessageBrokers/Kafka.md)                                                                          | -       |
| [ElasticSearch Data Stream](../3_DatabaseComponents/Search-Engines/ElasticSearch/ElasticSearchDataStreams.md) | -       |
| [RocksDB](../3_DatabaseComponents/NoSQL-Databases/RocksDB.md)                                                  | -       |

# Reference
- [Append-Only-Wiki](https://en.wikipedia.org/wiki/Append-only)