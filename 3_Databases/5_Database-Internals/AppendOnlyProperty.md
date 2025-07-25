# Append-Only DB Property
- [Append-Only](https://en.wikipedia.org/wiki/Append-only) is a property of computer data storage such that new data can be appended to the storage, but where [existing data is immutable](https://en.wikipedia.org/wiki/Immutable_object).
- This makes [writes (i.e. throughput)](../../7_Scalability/Throughput.md) generally very fast.
- Many data structures and databases implement [immutable objects](https://en.wikipedia.org/wiki/Immutable_object), effectively making their data structures append-only. 

# Benefits
- [Ensuring data consistency](../4_Consistency-Replication/Readme.md) 
- [Improving performance](../3_Scalability-Techniques/Readme.md) 
- And permitting rollbacks.

# Supported Databases

| DB                                                                                                                           |
|------------------------------------------------------------------------------------------------------------------------------|
| :star: [LSM-Tree based NoSQL DBs like Casandra, RocksDB etc.](LSMTree.md)                                                    |
| :star: [Kafka](../../4_MessageBrokersEDA/Kafka/Readme.md)                                                                    |
| :star: [Amazon S3](../../2_AWS/6_StorageServices/3_S3ObjectStorage/Readme.md)                                                |
| [Apache Lucene](../9_Search-Databases/Readme.md)                                                                             |
| [ElasticSearch Data Stream](../15_Streaming-Databases/ElasticSearchStreams.md)                                               |
| [Amazon Kinesis](../../2_AWS/4_MessageBrokerServices/AmazonKinesis/Readme.md)                                                |
| [Redis Streams](../15_Streaming-Databases/RedisStreams.md)                                                                   |
| [Amazon Aurora Global Database - Replication](../../2_AWS/1_DatabaseServices/AmazonRDS/AmazonAurora/AuroraGlobalDatabase.md) |

# References
- [Building an Append-only Log From Scratch](https://eileen-code4fun.medium.com/building-an-append-only-log-from-scratch-e8712b49c924)
- [Power of the Log: LSM & Append Only Data Structures](https://www.slideshare.net/ConfluentInc/power-of-the-loglsm-append-only-data-structures)