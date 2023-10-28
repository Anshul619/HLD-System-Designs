# Grab Tech Stack

| Purpose                                             | Service                                                                                              |
|-----------------------------------------------------|------------------------------------------------------------------------------------------------------|
| Cloud Platform                                      | [AWS](../../2_AWSComponents/Readme.md)                                                               |
| OLTP - Transaction-DB (like orders etc.)            | [DynamoDB](../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md)                        |
| OLAP - Analytical-Queries (like order history etc.) | [MySQL - Amazon RDS](../../1_HLDDesignComponents/3_DatabaseComponents/SQL-DBs.md)                    |
| Data Streaming                                      | [Kafka](../../1_HLDDesignComponents/4_MessageBrokers/Kafka/Readme.md)                                |
| Search-DB (derived data)                            | [ElasticSearch](../../1_HLDDesignComponents/3_DatabaseComponents/Search-Databases/ElasticSearch/Readme.md) |
| Backend Language - GoLang                           | [GoLang](GoLangBackend.md)                                                                           |
| Container Orchestration                             | [Kubernates](../../1_HLDDesignComponents/6_ContainerOrchestrationServices/Kubernates.md)             |
| Object Store, Data Lake                             | [Amazon S3](../../2_AWSComponents/7_StorageServices/3_ObjectStorageS3/Readme.md)                     |
| Graph Database                                      | [Amazon Neptune](../../2_AWSComponents/6_DatabaseServices/AmazonNeptune.md)                          |
| InMemory Cache                                      | [Redis](../../1_HLDDesignComponents/3_DatabaseComponents/In-Memory-Cache/Redis/Readme.md)            |
| Logging                                             | [ELK](https://engineering.grab.com/structured-logging)                                                                                              |

# Use Cases

| Use Case                                          |
|---------------------------------------------------|
| [Grab Order Processing](OrdersProcessing.md)      |
| [Search Indexes Optimization](SearchIndexing.md)  |
| [Graph Service Platform](GraphServicePlatform.md) |
| [Kafka as Message Broker](KafkaMessageBroker.md)  |

# Read more
- [Real-time data ingestion in Grab](https://engineering.grab.com/real-time-data-ingestion)
- [Trident - Real-time Event Processing at Scale](https://engineering.grab.com/trident-real-time-event-processing-at-scale)
- [Plumbing At Scale](https://engineering.grab.com/plumbing-at-scale)
- [A Lean and Scalable Data Pipeline to Capture Large Scale Events and Support Experimentation Platform](https://engineering.grab.com/experimentation-platform-data-pipeline)
- [How We Designed the Quotas Microservice to Prevent Resource Abuse?](https://engineering.grab.com/quotas-service)
