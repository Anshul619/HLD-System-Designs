# Key Characteristics of Distributed Systems

| Basis                                                                                  | Applicable Components              |
|----------------------------------------------------------------------------------------|------------------------------------|
| :star: [Efficiency - Latency, Throughput](src/1_HLDDesignComponents/0_SystemGlossaries/LatencyThroughput.md)                        | ALL                                |
| :star: [Scalability](src/1_HLDDesignComponents/0_SystemGlossaries/Scalability.md)                                                   | ALL                                |
| :star: [High Availability](src/1_HLDDesignComponents/0_SystemGlossaries/HighAvailability.md)                                        | ALL                                |
| :star: [Servers Cluster](src/1_HLDDesignComponents/0_SystemGlossaries/ServersCluster.md)                                            | `Data Stores` or `Message Brokers` |
| :star: [Event Driven Architecture](src/1_HLDDesignComponents/0_SystemGlossaries/EventDrivenArchitecture.md)                         | `Message Brokers`                  |
| :star: [ACID Properties of the Transaction](src/1_HLDDesignComponents/0_SystemGlossaries/ACIDPropertyTransaction.md)                | `Data Stores`                      |
| :star: [CAP Theorem of the Distributed Systems](src/1_HLDDesignComponents/0_SystemGlossaries/CAPTheorem.md)                         | `Data Stores`                      |
| :star: [Replication & Data Consistency](src/1_HLDDesignComponents/0_SystemGlossaries/ReplicationAndDataConsistency.md)              | `Data Stores`                      |
| [Reliability - Fault Tolerance, Disaster Recovery](src/1_HLDDesignComponents/0_SystemGlossaries/FaultTolerance&DisasterRecovery.md) | ALL                                |
| [Load Balancer](src/1_HLDDesignComponents/0_SystemGlossaries/LoadBalancer.md)                                                       | ALL                                |
| [Atomicity](src/1_HLDDesignComponents/0_SystemGlossaries/Atomicity.md)                                                              | `Data Stores`                      |
| [Durability](src/1_HLDDesignComponents/0_SystemGlossaries/Durability.md)                                                            | `Data Stores`                      |
| [Content Delivery Network (CDN)](src/1_HLDDesignComponents/0_SystemGlossaries/CDNs.md)                                              | `Static Content`                    |

This repo contains the various system design components info, questions and solutions.
- :star: [AWS Components](src/2_AWSComponents)
- :star: [System Estimation Tips](src/1_HLDDesignComponents/SystemEstimationTips.md)
- [System Design Tips](src/1_HLDDesignComponents/SystemDesignTips.md)
- [MicroServices - Modern SOA Architecture](src/1_HLDDesignComponents/1_MicroServicesSOA)
- [Other Glossaries](src/1_HLDDesignComponents/0_SystemGlossaries/README.md)

# [Message Brokers](src/1_HLDDesignComponents/4_MessageBrokers)
Message brokers are used to decouple & enable [Event Driven Architectures](src/1_HLDDesignComponents/0_SystemGlossaries/EventDrivenArchitecture.md) i.e. communicate the events & pass the data between [microservices](src/1_HLDDesignComponents/1_MicroServicesSOA).
- :star: [Comparison between Various Message Brokers](src/1_HLDDesignComponents/4_MessageBrokers/KafkaVsRabbitMQVsSQSVsSNS.md)
- :star: [Kafka](src/1_HLDDesignComponents/4_MessageBrokers/Kafka.md)
- :star: [Amazon SQS](src/2_AWSComponents/5_MessageBrokerServices/AmazonSQS.md)
- [RabbitMQ](src/1_HLDDesignComponents/4_MessageBrokers/RabbitMQ.md)
- [Amazon SNS](src/2_AWSComponents/5_MessageBrokerServices/AmazonSNS.md)
- [Active MQ](src/1_HLDDesignComponents/4_MessageBrokers/ActiveMQ.md)

# Various Databases
- :star: [SQL & NoSQL databases](src/1_HLDDesignComponents/3_DatabaseComponents)
- :star: [Redis](src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis)
- :star: [ElasticSearch](src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ElasticSearch)
- :star: [MongoDB](src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/MongoDB)
- [Casandra](src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md)
- [AeroSpike](src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/AeroSpike.md)
- [Postgres](src/1_HLDDesignComponents/3_DatabaseComponents/PostgresQuery.md)

# API Technology Options

| API Option| Description                                                                                                                     |
| -----------|---------------------------------------------------------------------------------------------------------------------------------|
| :star: [REST](src/1_HLDDesignComponents/2_APITechOptions/REST.md) | Used for CRUD style public APis and web app.                                                                                    |
| :star: [gPRC](src/1_HLDDesignComponents/2_APITechOptions/gPRC.md) | Used for communication b/w [microservices](src/1_HLDDesignComponents/1_MicroServicesSOA) or to collect data from IoT devices. It is relatively faster than REST or GraphQL. |
| [GraphQL](src/1_HLDDesignComponents/2_APITechOptions/GraphQL.md) | Used for public API with customizable request body or to aggregate internal data from multiple sources in a public API.         |

# [In Memory Cache](src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis)
- :star: [Redis](src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis)
- [Redis vs MemCache](src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis/RedisVsMemCache.md)

# HLD - Design Problems
- :star: [Zomoto HLD Design](src/3_HLDDesignProblems/ZomatoDesign)
- :star: [Design a system that scales to million of users on AWS](src/2_AWSComponents/0_AWSDesigns/DesignScalableSystemWithRDMS)
- :star: [Personalization at Spotify using Casandra](src/3_HLDDesignProblems/PersonalizationSpotify)
- [Twillo Send Message API](src/3_HLDDesignProblems/TwilloSendMessageAPI)
- [Rate Limiter API](src/3_HLDDesignProblems/RateLimiterAPI)
- [Notification System](src/3_HLDDesignProblems/NotificationSystem)
- [Logging Solution](src/3_HLDDesignProblems/LoggingSolution)
- [MakeMyTrip Search](src/3_HLDDesignProblems/MakeMyTripSearch)
- [URL Shortening Service](src/3_HLDDesignProblems/URLShorteningService)

# [OOP Design & Problems](src/4_ObjectOrientedDesign)
- :star: [OOP Design](src/4_ObjectOrientedDesign/OOP.md)
- :star: [SOLID Principles](src/4_ObjectOrientedDesign/SOLID.md)
- :star: [Design Tips & Techniques](src/4_ObjectOrientedDesign/TipsAndTechniques.md)
- :star: [Design Patterns](src/4_ObjectOrientedDesign/DesignPatterns)
- [DRY Principle](src/4_ObjectOrientedDesign/DRY.md)
- [Design Problems](src/4_ObjectOrientedDesign/OOPDesignProblems)
  - [Chess Game](src/4_ObjectOrientedDesign/OOPDesignProblems/ChessGame)
  - [Parking Lot](src/4_ObjectOrientedDesign/OOPDesignProblems/ParkingLot)
  - [Snack & Ladder Game](src/4_ObjectOrientedDesign/OOPDesignProblems/SnackAndLadderGame)
  - [Book My Show](src/4_ObjectOrientedDesign/OOPDesignProblems/BookMyShow)
  - [Car Rental System](src/4_ObjectOrientedDesign/OOPDesignProblems/CarRentalSystem)
  - [Vendor Machine](src/4_ObjectOrientedDesign/OOPDesignProblems/VendingMachine)
  - [Hotel Booking System](src/4_ObjectOrientedDesign/OOPDesignProblems/HotelBookingSystem)
  - [Insurance Agent Flow](src/4_ObjectOrientedDesign/OOPDesignProblems/Others/InsuranceAgentFlow.md)

# [Programming Languages](src/5_ProgrammingLanguages)
- :star: [GoLang](src/5_ProgrammingLanguages/1_GoLang)
- [Spring Boot & Microservices](src/5_ProgrammingLanguages/2_Java/SpringBootAndMicroServices)
- [Hibernate](src/5_ProgrammingLanguages/2_Java/Hibernate.md)
- [Java](src/5_ProgrammingLanguages/2_Java)
- [Hibernate](src/5_ProgrammingLanguages/2_Java/Hibernate.md)
- [JavaScript](src/5_ProgrammingLanguages/3_JavaScript)
- [TypeScript](src/5_ProgrammingLanguages/4_FrontEnd/TypeScript.md)
- [Angular8](src/5_ProgrammingLanguages/4_FrontEnd/Angular8.md)

# DevOps Skills
- :star: [Kubernates](src/1_HLDDesignComponents/6_DevOps/Kubernates.md)
- :star: [Docker](src/1_HLDDesignComponents/6_DevOps/Docker.md)

# Monitoring Tools
- :star: [New Relic](src/1_HLDDesignComponents/7_MonitoringTools/NewRelic.md)
- [ELK](src/1_HLDDesignComponents/7_MonitoringTools/ELK.md)

# Other Design Components
- [Apache Spark](src/1_HLDDesignComponents/8_BigDataTools/ApacheSpark.md)
- [Apache Web Server](https://apache.org/)
  - Web Server which can handle 512 concurrent requests.
- [Testing](src/6_Others/QATools/Readme.md)

# Source(s) and further reading
- [System Design Primer](https://github.com/donnemartin/system-design-primer)
- [Grokking the System Design](https://www.educative.io/courses/grokking-the-system-design-interview/39RwZr5PBwn)
- [System Design by Gaurav Sen](https://www.youtube.com/watch?v=xpDnVSmNFX0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX)
- [Benchmarking Apache Kafka, Apache Pulsar, and RabbitMQ: Which is the Fastest?](https://www.confluent.io/blog/kafka-fastest-messaging-system/)
- [System Design - Interview Questions](https://leetcode.com/discuss/interview-question/system-design?currentPage=1&orderBy=hot&query=)
