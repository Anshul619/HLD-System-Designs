# Append-Only or log-structured Data Structure (LSM)
- [Append-Only](https://en.wikipedia.org/wiki/Append-only) is a property of computer data storage such that new data can be appended to the storage, but where [existing data is immutable](https://en.wikipedia.org/wiki/Immutable_object).
- This makes [writes (i.e. throughput) generally very fast](../../0_SystemGlossaries/Scalability/LatencyThroughput.md).
- Many data structures and databases implement [immutable objects](https://en.wikipedia.org/wiki/Immutable_object), effectively making their data structures append-only. 
- Implementing an append-only data structure has many benefits, such as [ensuring data consistency](Consistenc.md), [improving performance](../1_Glossaries/DBScalability.md), and permitting rollbacks.

# Log file
- The prototypical append-only data structure is the log file. 

[Log-structured data structures](DataStructuresInDBs.md) found in Log-structured file systems and databases work in a similar way: 
- Every change (transaction) that happens to the data is logged by the program, 
- And on retrieval the program must combine the pieces of data found in this log file.

# Supported Databases

| DB                                                                                                                                        |
|-------------------------------------------------------------------------------------------------------------------------------------------|
| [Casandra](../NoSQL-Databases/ApacheCasandra.md)                                                                                          |
| [Kafka](../../4_MessageBrokers/Kafka/Readme.md)                                                                                           |
| [ElasticSearch Data Stream](../Search-Indexes/ElasticSearch/ElasticSearchDataStreams.md)                                                  |
| [Amazon Aurora Global Database - Replication](../../../2_AWSComponents/6_DatabaseServices/AmazonRDS/AmazonAurora/AuroraGlobalDatabase.md) |
| [RocksDB](../NoSQL-Databases/RocksDB.md)                                                                                                  |
| [Amazon Kinesis](../../../2_AWSComponents/10_BigDataComponents/StreamProcessing/AmazonKinesis/Readme.md)                                  |
| [Amazon S3](../../../2_AWSComponents/7_StorageServices/3_ObjectStorageS3/Readme.md)                                                       |
| [Apache Lucene](../Search-Indexes/ApacheLucene.md)                                                                                        |
| [Redis Streams](../In-Memory-Cache/Redis/Readme.md)                                                                                       |

# References
- [Building an Append-only Log From Scratch](https://eileen-code4fun.medium.com/building-an-append-only-log-from-scratch-e8712b49c924)
