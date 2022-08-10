# System-Designs

This repo contains the various system design components info, questions and solutions.
- :star: [AWS Components](src/2_AWSComponents)
- [System Design Glossaries](src/1_HLDDesignComponents/SystemGlossaries.md)
- [System Design Tips](src/1_HLDDesignComponents/SystemDesignTips.md)
- [System Estimation Guide](src/1_HLDDesignComponents/SystemEstimations.md)
- [MicroServices Based Architecture](src/1_HLDDesignComponents/1_MicroServicesArchitecture)

# [Message Brokers](src/1_HLDDesignComponents/4_MessageBrokers)
Message brokers are used to decouple and enable `Event Driven Architectures` i.e. communicate the events between microservices to pass the data.

| Basis                                 | :star: [Kafka](src/1_HLDDesignComponents/4_MessageBrokers/Kafka.md)                              | [RabbitMQ](src/1_HLDDesignComponents/4_MessageBrokers/RabbitMQ.md)                                                                                                        | [Amazon SQS](src/2_AWSComponents/5_MessageBrokerServices/AmazonSQS.md)                                                                                      | [Amazon SNS](src/2_AWSComponents/5_MessageBrokerServices/AmazonSNS.md)                                                                                                                           | [Active MQ](src/1_HLDDesignComponents/4_MessageBrokers/ActiveMQ.md)                                     |
|---------------------------------------|-------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
|  Strength                             | High-Throughput Broker                                                                    | Low-Latency MQ                                                                                                                                                     | -                                                                                                                                                              | Push-Notification-Based-Broker                                                                                                                                                                      | Enterprise-Based MQ                                                                              |
|  Performance                          | Up to `1 million ( 1000K ) messages per second`                                           | Up to `10K messages per second` ( ie. around 100 nodes are needed to match with 1 kafka broker )                                                                   | Up to `30K messages per second`                                                                                                                                |
|  Latency                              | ~5ms                                                                                      | ~1ms                                                                                                                                                               | Low message send latency, but processing latency as 100ms-1sec                                                                                                 |
|  Message Transfer Model               | `Pub-Sub` (Pull Based)                                                                    | `Point-2-Point` (Push Based)                                                                                                                                       | `Point-2-Point` (Pull Based)                                                                                                                                   | `Pub-Sub` (Push Based, through push notification)                                                                                                                                                   | Both `Point-To-Point` & `Pub-Sub` model supported                                                |
|  Event storage structure              | `Logs`                                                                                    | `Queue`                                                                                                                                                            | `Queue` ( Standard Queues, FIFO Queues )                                                                                                                       | `Topic`                                                                                                                                                                                             | `Queue`                                                                                          |
|  Lifetime Of Messages                 | As per the retension policy, messages are retained in Kafka. And `these can be replayed`. | Once message is consumed and acknowledgement is sent, it would be removed from RabbitMQ message queue.                                                             | Message can be stored in SQS for short duration of time ( max 14 days, default 4 days ). Once message is consumed, it would be removed from SQS message queue. | No persistence. When an SNS Topic receives an event notification (from publisher), it is broadcasted (`fan-out`) to all Subscribers (Amazon SQS queues, AWS Lambda functions, HTTPS endpoints etc.) | Message would be removed once consumed.                                                          |
|  Pricing Model                        | `Open Source` ( [Amazon MSK](https://aws.amazon.com/msk/) on AWS )                        | `Open Source` ( [Amazon MQ](src/2_AWSComponents/5_MessageBrokerServices/AmazonMQ.md) on AWS )                                                                                         | `AWS Managed Service`                                                                                                                                          | `AWS Managed Service`                                                                                                                                                                               | `Open Source` ( [Amazon MQ](src/2_AWSComponents/5_MessageBrokerServices/AmazonMQ.md) on AWS ) |
|  Use Cases                            | `Massive data`/`HIGH THROUGHPUT cases` ( like `analytics` )                               | Simple `low-latency use cases` when message guarantee is needed or some consistent behaviour is needed for every message ( like order workflow, failed orders etc. ) |                                                                                                                                                                | Monitoring Apps, workflow systems, mobile apps, Push notifications to Apple, Android, FireOS, Windows devices, Send SMS to mobile users, Send Emails etc.                                           |
|  Broker/Publisher Type                | Dump                                                                                      | `Smart` ( Consistent transmission of messages to consumers at about the same speed as the broker monitors the consumer's status)                                   | Dump                                                                                                                                                           | `Smart`                                                                                                                                                                                             | Dump                                                                                             |
|  Consumer Type                        | `Smart` ( Consumers maintain their own state i.e. `dump brokers` )                        | Dumb                                                                                                                                                               | `Smart` ( All consumers need to be identical )                                                                                                                 | Dump ( All consumers might be processing messages in differently way )                                                                                                                              | Smart                                                                                            |
|  Ordering Of Messages                 | `Supported ( using partition key )`                                                       | Not-Supported                                                                                                                                                      | Supported in `FIFO SQS Queues` ( not in Standard SQS Queues )                                                                                                  | Supported in `FIFO SNS Topics`                                                                                                                                                                      |                                                                                                  |
|  Prioritizing Messages for consumption | Not-Supported                                                                             | `Supported`                                                                                                                                                        | Not-Supported                                                                                                                                                  | Not-Supported |
|  Payload Size                         | `Default 1MB limit`                                                                       | No constraints                                                                                                                                                     | No constraints                                                                                                                                                                | No constraints| No constraints                                                                                   |
|  API Endpoints available              | Yes                                                                                       | Yes | Yes                                                                                                                                                            | Yes | Yes                                                                                              |

# API Technology Options

| API Option| Description                                                                                                                     |
| -----------|---------------------------------------------------------------------------------------------------------------------------------|
| :star: [REST](src/1_HLDDesignComponents/2_APITechOptions/REST.md) | Used for CRUD style public APis and web app.                                                                                    |
| [gPRC](src/1_HLDDesignComponents/2_APITechOptions/gPRC.md) | Used for communication b/w [microservices](src/1_HLDDesignComponents/1_MicroServicesArchitecture) or to collect data from IoT devices. It is relatively faster than REST or GraphQL. |
| [GraphQL](src/1_HLDDesignComponents/2_APITechOptions/GraphQL.md) | Used for public API with customizable request body or to aggregate internal data from multiple sources in a public API.         |

# [SQL & NoSQL databases](src/1_HLDDesignComponents/3_DatabaseComponents)

| Component                                                               | Strength                                | Component Type                | Very Rough Throughput (QPS)                 | Latency | Pricing Model                                                   |
|-------------------------------------------------------------------------|-----------------------------------------|-------------------------------|---------------------------------------------|----------------|-----------------------------------------------------------------|
| [MySQL](src/1_HLDDesignComponents/3_DatabaseComponents)                                | -                                       | SQL DB                        | 1000 concurrent requests ( 100 as default ) | [< 10ms ( to get a row from 1 million records )](https://www.quora.com/How-can-we-calculate-the-throughput-of-MySQL?share=1)| `Open Source` ( [RDS](src/2_AWSComponents/RDS.md) on AWS ) |
| [DynamoDB](src/2_AWSComponents/6_DatabaseServices/AmazonDynamoDB.md) | Predictable performance and cost        | NoSQL DB as a Service ( AWS ) | More than 20 million requests per second    | less than 10-20 ms | `AWS Managed Service`   |
| :star: [ElasticSearch](src/1_HLDDesignComponents/3_DatabaseComponents/ElasticSearch)              | `Full-Text-Search`, `Logs-Analysis (ELK)` | NoSQL Search Engine           | -                                           |-| `Open Source`                                                             |
| [MongoDB](src/1_HLDDesignComponents/3_DatabaseComponents/MongoDB)                      | -                                       | NoSQL DB                      | -                                           | -| `Open Source`                                                              |

# [In Memory Cache](src/1_HLDDesignComponents/5_Redis)

| Component                                  | Strength                                                                               | Very Rough Throughput (QPS)                       | Latency | Pricing Model                                                         |
|--------------------------------------------|-----------------------------------------|---------------------------------------------------|----------------|-----------------------------------------------------------------------|
| :star: [Redis](src/1_HLDDesignComponents/5_Redis) | In-Memory fast Data-Store (Caching)     | 100K queries per second                           | -| `Open Source` ( [Elastic Cache](https://aws.amazon.com/elasticache/) on AWS ) |

[Read about Redis vs MemCache](src/1_HLDDesignComponents/5_Redis/RedisVsMemCache.md)

# HLD - Design Problems
- :star: [Zomoto HLD Design](src/3_HLDDesignProblems/ZomatoDesign)
- [Design a system that scales to million of users on AWS](src/3_HLDDesignProblems/DesignScalableSystemWithRDMS)
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
- [DRY Principle](src/4_ObjectOrientedDesign/DRY.md)
- [Design Patterns](src/4_ObjectOrientedDesign/DesignPatterns)
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
- [Docker](src/1_HLDDesignComponents/6_DevOps/Docker.md)

# Monitoring Tools
- :star: [New Relic](src/1_HLDDesignComponents/7_MonitoringTools/NewRelic.md)
- [ELK](src/1_HLDDesignComponents/7_MonitoringTools/ELK.md)

# Other Design Components
- [Apache Spark](src/1_HLDDesignComponents/8_BigDataTools/ApacheSpark.md)
- [Apache Web Server](https://apache.org/)
  - Web Server which can handle 512 concurrent requests.
- [Testing](src/6_Others/QATools/Readme.md)

# References
- [System Design Primer](https://github.com/donnemartin/system-design-primer)
- [Grokking the System Design](https://www.educative.io/courses/grokking-the-system-design-interview/39RwZr5PBwn)
- [System Design by Gaurav Sen](https://www.youtube.com/watch?v=xpDnVSmNFX0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX)
- [Benchmarking Apache Kafka, Apache Pulsar, and RabbitMQ: Which is the Fastest?](https://www.confluent.io/blog/kafka-fastest-messaging-system/)
- [System Design - Interview Questions](https://leetcode.com/discuss/interview-question/system-design?currentPage=1&orderBy=hot&query=)