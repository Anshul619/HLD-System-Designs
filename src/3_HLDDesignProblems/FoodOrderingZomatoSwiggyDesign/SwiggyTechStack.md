# Tech Stack

| Use Case                                                                       | Service                                                                                         |
|--------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|
| Cloud platform                                                                 | [AWS - EC2, Lambda, S3, DynamoDB, CodePipeline etc.](../../2_AWSComponents/Readme.md)           |
| Container Orchestration                                                        | [Kubernates with Docker](../../1_HLDDesignComponents/6_ContainerOrchestrationServices/Readme.md) |
| InMemory-Cache                                                                 | [Redis cache](../../1_HLDDesignComponents/3_DatabaseComponents/In-Memory-DB/Redis/Readme.md) |
| Message Broker - Pub/Sub                                                       | [Apache Kafka (using confluent)](../../1_HLDDesignComponents/4_MessageBrokers/Kafka/Readme.md)  |
| Map-Reduce Jobs (like select driver, generate recommendations etc.)            | [Apache Spark](../../1_HLDDesignComponents/5_BigDataComponents/ETLServices/ApacheSpark.md) |
| Socket Connection                                                              | Web Sockets                                                                                     |
| OLTP-DB (like pickers, orders, shipment, restaurants, delivery, shipment etc.) | MySQL, [DynamoDB]()                                                                             |
| Key-Value-DB (high throughput/read/writes)                                     | [DynamoDB]()                                                                                    |
| Search-DB                                                                      |                                                                                                 |
| Backend APIs                                                                   | NodeJS                                                                                          |
| Data Lake                                                                      | S3                                                                                              |

# CDC - System Design

![](https://miro.medium.com/v2/resize:fit:1400/0*nP8YV-H-FBTPXBUg)

![](https://miro.medium.com/v2/resize:fit:1400/format:webp/1*V8PvRfNVyd0OM2E4AKstgg.png)

[Read more](https://bytes.swiggy.com/architecture-of-cdc-system-a975a081691f)

# References
- [How Swiggy migrated its k8s workload to Graviton?](https://bytes.swiggy.com/how-swiggy-migrated-its-k8s-workload-to-graviton-d2643bbc7871)
- [Optimizing batch writes to Redis using Pipelining](https://bytes.swiggy.com/optimizing-batch-writes-to-redis-using-pipelining-d480ebaf4653)
- [#BehindTheBug — Indexing Gone Wrong](https://bytes.swiggy.com/behindthebug-indexing-gone-wrong-6b4d682fd805)
- [Architecture of CDC System](https://bytes.swiggy.com/architecture-of-cdc-system-a975a081691f)
- [All doors shall not lead to Production](https://bytes.swiggy.com/all-doors-shall-not-lead-to-production-e33bf293265f)
- [Introduction to CDC System — An efficient way to replicate Transactional data into Data Lake](https://bytes.swiggy.com/introduction-to-cdc-system-an-efficient-way-to-replicate-transactional-data-into-data-lake-c10f99c7a3fd)
- [How to limit autoscaling in on-demand DynamoDB tables?](https://bytes.swiggy.com/how-to-limit-autoscaling-in-on-demand-dynamodb-tables-c57e20cbbbcf)