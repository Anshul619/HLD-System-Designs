# Tech Stack

| Purpose                                                      | Service                                                                                                                                                                                                                                  |
|--------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Cloud Platform                                               | [Azure](https://engineering.linkedin.com/blog/2023/costwiz--saving-cost-for-linkedin-enterprise-on-azure)                                                                                                                                |
| Document DB - Profiles, recommendations, posts, ratings etc. | [Espresso (inhouse built-in, on top of MySQL)](https://engineering.linkedin.com/espresso/introducing-espresso-linkedins-hot-new-distributed-document-store)                                                                              |
| Relation Database, OLAP                                      | [MySQL](../3_DatabaseServices/SQL-Databases/Readme.md) - [Read more](https://engineering.linkedin.com/blog/topic/mysql)                                                                                       |
| Data Streaming                                               | [Kafka](../4_MessageBrokersEDA/Kafka/Readme.md)                                                                                                                                                                    |
| Search-DB (derived data)                                     | [Galene (inhouse built-in)](https://engineering.linkedin.com/search/did-you-mean-galene)                                                                                                                                                 |
| Container Orchestration                                      | [Kubernates](../9_ContainerOrchestrationServices/Kubernates/Readme.md)                                                                                                                                                 |
| Batch Processing                                             | [Hadoop (HDFS, Yarn), Apache Spark](https://engineering.linkedin.com/blog/2023/reducing-apache-spark-application-dependencies-upload-by-99-)                                                                                             |
| Graph Database                                               | [Skills Graph](https://engineering.linkedin.com/blog/2022/building-linkedin-s-skills-graph-to-power-a-skills-first-world)                                                                                                                |
| API Tech                                                     | [HTTP 2.0](https://engineering.linkedin.com/blog/2021/http-2-in-infrastructure--ambry-network-stack-refactoring), [GraphQL](https://engineering.linkedin.com/blog/2023/how-linkedin-adopted-a-graphql-architecture-for-product-developm) |
| Home Feed DB                                                 | [RocksDB](../3_DatabaseServices/NoSQL-Databases/EmbededKeyValueDB/RocksDB.md) - [Read more](https://engineering.linkedin.com/blog/2016/03/followfeed--linkedin-s-feed-made-faster-and-smarter)                |

# Kafka Stats in LinkedIn

| Feature                   | Number                                                                                                    |
|---------------------------|----------------------------------------------------------------------------------------------------------|
| Average writes per second | 324 K                                                                                                    |
| Average reads per second  | 2.3 million                                                                                              |
| Topics                    | ~700 topics                                                                                              |
| Producers                 | Thousands of producers                                                                                   |
| Consumers                 | ~1000 consumers                                                                                          |
| Data Centers              | LinkedIn has 4 data centers in US (texas, virginia, oregon etc.)                                         |
| Kafka Clusters            | LinkedIn has separate kafka clusters in every data center (for high scalability, disaster recovery etc.) |

# Benchmarking
- [Apache Kafka](../Benchmarking.md)

# References
- [Introduction and Overview of Apache Kafka](https://www.slideshare.net/mumrah/kafka-talk-tri-hug)
- [FollowFeed: LinkedIn's Feed Made Faster and Smarter](https://engineering.linkedin.com/blog/2016/03/followfeed--linkedin-s-feed-made-faster-and-smarter)
- [A Brief History of Scaling LinkedIn](https://engineering.linkedin.com/architecture/brief-history-scaling-linkedin)
