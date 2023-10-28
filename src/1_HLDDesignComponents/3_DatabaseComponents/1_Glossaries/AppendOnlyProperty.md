# Append-Only DB Property
- [Append-Only](https://en.wikipedia.org/wiki/Append-only) is a property of computer data storage such that new data can be appended to the storage, but where [existing data is immutable](https://en.wikipedia.org/wiki/Immutable_object).
- This makes [writes (i.e. throughput) generally very fast](../../0_SystemGlossaries/Scalability/LatencyThroughput.md).
- Many data structures and databases implement [immutable objects](https://en.wikipedia.org/wiki/Immutable_object), effectively making their data structures append-only. 
- Implementing an append-only data structure has many benefits, such as [ensuring data consistency](Consistency&Replication/Readme.md), [improving performance](DBScalability.md), and permitting rollbacks.

# Supported Databases

| DB                                                                                                                                        |
|-------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Kafka](../../4_MessageBrokers/Kafka/Readme.md)                                                                                    |
| :star: [Amazon S3](../../../2_AWSComponents/7_StorageServices/3_ObjectStorageS3/Readme.md)                                                |
| [Casandra](../NoSQL-Databases/ApacheCasandra.md)                                                                                          |
| [ElasticSearch Data Stream](../Search-Databases/ElasticSearch/ElasticSearchDataStreams.md)                                                  |
| [Redis Streams](../In-Memory-Cache/Redis/Readme.md)                                                                                       |
| [Amazon Aurora Global Database - Replication](../../../2_AWSComponents/6_DatabaseServices/AmazonRDS/AmazonAurora/AuroraGlobalDatabase.md) |
| [RocksDB](../NoSQL-Databases/RocksDB.md)                                                                                                  |
| [Amazon Kinesis](../../../2_AWSComponents/10_BigDataComponents/ETLServices/StreamProcessing/AmazonKinesis.md)                                  |
| [Apache Lucene](../Search-Databases/Readme.md)                                                                                        |

# References
- [Building an Append-only Log From Scratch](https://eileen-code4fun.medium.com/building-an-append-only-log-from-scratch-e8712b49c924)
