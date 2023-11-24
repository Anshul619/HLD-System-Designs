# Grab Tech Stack

| Purpose                                             | Service                                                                                                    |
|-----------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| Cloud Platform                                      | [AWS](../../2_AWSServices/Readme.md)                                                                     |
| OLTP - Transaction-DB (like orders etc.)            | [DynamoDB](../../2_AWSServices/6_DatabaseServices/AmazonDynamoDB/Readme.md)                              |
| OLAP - Analytical-Queries (like order history etc.) | [MySQL - Amazon RDS](../../3_DatabaseServices/SQL-Databases/Readme.md)                          |
| Data Streaming                                      | [Kafka](../../4_MessageBrokersEDA/Kafka/Readme.md)                                      |
| Search-DB (derived data)                            | [ElasticSearch](../../3_DatabaseServices/Search-Databases/ElasticSearch/Readme.md) |
| Backend Language - GoLang                           | [GoLang](GoLangBackend.md)                                                                                 |
| Container Orchestration                             | [Kubernates](../../9_ContainerOrchestrationServices/Kubernates/Readme.md)                   |
| Object Store, Data Lake                             | [Amazon S3](../../2_AWSServices/7_StorageServices/3_ObjectStorageS3/Readme.md)                           |
| Graph Database                                      | [Amazon Neptune](../../2_AWSServices/6_DatabaseServices/AmazonNeptune.md)                                |
| InMemory Cache                                      | [Redis](../../3_DatabaseServices/In-Memory-Databases/Redis/Readme.md)                  |
| Logging                                             | [ELK](https://engineering.grab.com/structured-logging)                                                     |

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
