# Append-Only Data Structure
- [Append-Only](https://en.wikipedia.org/wiki/Append-only) is a property of computer data storage such that new data can be appended to the storage, but where [existing data is immutable](https://en.wikipedia.org/wiki/Immutable_object).
- This makes [writes (i.e. throughput) generally very fast](LatencyThroughput.md).

# Data structures
- Many data structures and databases implement [immutable objects](https://en.wikipedia.org/wiki/Immutable_object), effectively making their data structures append-only. 
- Implementing an append-only data structure has many benefits, such as [ensuring data consistency](ReplicationLagAndDataConsistency.md), [improving performance](Scalability/DBScalability.md), and permitting rollbacks.

The prototypical append-only data structure is the log file. 

Log-structured data structures found in Log-structured file systems and databases work in a similar way: 
- every change (transaction) that happens to the data is logged by the program, 
- And on retrieval the program must combine the pieces of data found in this log file.

# Supported Databases

| DB                                                                                                                              | Remarks |
|---------------------------------------------------------------------------------------------------------------------------------|---------|
| [Casandra](../3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md)                                                           | -       |
| [Kafka](../4_MessageBrokers/Kafka/Readme.md)                                                                                           | -       |
| [ElasticSearch Data Stream](../3_DatabaseComponents/Search-Engines/ElasticSearch/ElasticSearchDataStreams.md)                   | -       |
| [Amazon Aurora Global Database - Replication](../../2_AWSComponents/6_DatabaseServices/AmazonRDSAurora/AuroraGlobalDatabase.md) | -       |
| [RocksDB](../3_DatabaseComponents/NoSQL-Databases/RocksDB.md)                                                                   | -       |
| [Amazon Kinesis](../../2_AWSComponents/5_MessageBrokerServices/AmazonKinesis/Readme.md)                                         | -       |
| [Amazon S3](../../2_AWSComponents/7_StorageServices/AmazonS3.md)                                                                                                                   ||

# References
- [Building an Append-only Log From Scratch](https://eileen-code4fun.medium.com/building-an-append-only-log-from-scratch-e8712b49c924)
