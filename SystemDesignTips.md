# General System Design Tips

| Title                                                                        | Remarks                                                                                                                                                                                                                                                                                                                                                                                                                                    |
|------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Understand the system requirements carefully                                 | Identify access patterns, key components in the required architecture like `Data Chunking`, `Data Aggregation` etc.                                                                                                                                                                                                                                                                                                                        |
| Design system with High Throughput & Acceptable Latency                      | While designing the solution, generally we should aim for `MAXIMAL throughput` with `ACCEPTABLE latency`.                                                                                                                                                                                                                                                                                                                                  |
| [Design Microservice Based architecture](1_MicroServicesSOA/Readme.md)       | Design system using [Event Driven Architecture](1_MicroServicesSOA/EventDrivenArchitecture.md).                                                                                                                                                                                                                                                                                                                                            |
| Choose database based on query patterns                                      | [How to choose database in the system design?](3_DatabaseServices/DecideDatabase.md)                                                                                                                                                                                                                                                                                                                                            |
| Understand read vs write heaviness                                           | If it's a READ heavy microservice, the best decision would be to use [Redis](3_DatabaseServices/In-Memory-DB/Redis) or `multi-read database instances`.<br/>- If it's a WRITE heavy microservice (`HIGH throughput`), the best decision would be to use either NoSQLDB like [DynamoDB](11_AWSServices/6_DatabaseServices/AmazonDynamoDB/Readme.md) (as data store) or [Kafka](4_MessageBrokers/Kafka/Readme.md) (as message broker). |
| Sharding of the database                                                     | To scale the data store horizontally (i.e. improve `write throughput`), [shard the databases]() (through consistent hashing technique etc.).                                                                                                                                                                                                                                                                                               |
| Partition Key of database                                                    | Decide partition key carefully (to prevent hot partition problem).                                                                                                                                                                                                                                                                                                                                                                         |
| Use Leverage Managed Infrastructures like AWS etc.                           | We should use `Leverage Managed Infrastructures` like [Amazon S3](11_AWSServices/7_StorageServices/3_ObjectStorageS3/Readme.md), [Amazon Aurora](11_AWSServices/6_DatabaseServices/AmazonRDS/AmazonAurora/Readme.md), [DynamoDB](11_AWSServices/6_DatabaseServices/AmazonDynamoDB/Readme.md) etc.- Sometimes, we must have to consider `cloud-agnostic approach` (& onPerm customer approach) while designing the solution.    |
| [API - Performance Considerations](2_APITechOptions/APIPerformanceTuning.md) |                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| [SQL Tunning](3_DatabaseServices/SQL-Databases/SQLTuning.md)               |                                                                                                                                                                                                                                                                                                                                                                                                                                            |

# References
- [Scalable Architecture: A Definition and How-To Guide](https://www.sentinelone.com/blog/scalable-architecture/)