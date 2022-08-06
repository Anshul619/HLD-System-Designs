# System-Designs

This repo contains the various system design components info, questions and solutions.
- [System Design Glossaries](src/DesignComponents/SystemGlossaries.md)
- [System Design Tips](src/DesignComponents/SystemDesignTips.md)
- [System Estimation Guide](src/DesignComponents/SystemEstimations.md)
- [AWS Components](src/DesignComponents/AWS)
- [MicroServices Based Architecture](src/DesignComponents/MicroServicesArchitecture)

# [SQL & NoSQL databases](src/DesignComponents/SQLvsNoSQL)

| Component                                                         | Strength                                | Component Type                | Very Rough Throughput (QPS)                 | Latency | Pricing Model                                                   |
|-------------------------------------------------------------------|-----------------------------------------|-------------------------------|---------------------------------------------|----------------|-----------------------------------------------------------------|
| [MySQL](src/DesignComponents/SQLvsNoSQL)                          | -                                       | SQL DB                        | 1000 concurrent requests ( 100 as default ) | [< 10ms ( to get a row from 1 million records )](https://www.quora.com/How-can-we-calculate-the-throughput-of-MySQL?share=1)| `Open Source` ( [RDS](src/DesignComponents/AWS/RDS.md) on AWS ) |
| [DynamoDB](src/DesignComponents/AWS/DatabaseServices/DynamoDB.md) | Predictable performance and cost        | NoSQL DB as a Service ( AWS ) | More than 20 million requests per second    | less than 10-20 ms | `AWS Managed Service`   |
| [ElasticSearch](src/DesignComponents/ElasticSearch)               | `Full-Text-Search`, `Logs-Analysis (ELK)` | NoSQL Search Engine           | -                                           |-| `Open Source`                                                             |
| [MongoDB](src/DesignComponents/SQLvsNoSQL)                        | -                                       | NoSQL DB                      | -                                           | -| `Open Source`                                                              |

# [In Memory Cache](src/DesignComponents/Redis)

| Component                                                         | Strength                                                                               | Very Rough Throughput (QPS)                       | Latency | Pricing Model                                                         |
|-------------------------------------------------------------------|-----------------------------------------|---------------------------------------------------|----------------|-----------------------------------------------------------------------|
| [Redis](src/DesignComponents/Redis)                               | In-Memory fast Data-Store (Caching)     | 100K queries per second                           | -| `Open Source` ( [Elastic Cache](https://aws.amazon.com/elasticache/) on AWS ) |

[Read about Redis vs MemCache](src/DesignComponents/Redis/RedisVsMemCache.md)

# [Message Brokers](src/DesignComponents/MessageBrokers)

Message brokers are used to decouple and enable `Event Driven Architectures` i.e. communicate the events between microservices.

| Basis                                 | [Kafka](src/DesignComponents/MessageBrokers/Kafka.md)                                     | [RabbitMQ](src/DesignComponents/MessageBrokers/RabbitMQ.md)                                                                                                        | [Amazon SQS](src/DesignComponents/AWS/MessageBrokerServices/AmazonSQS.md)                                                                                      | [Amazon SNS](src/DesignComponents/AWS/MessageBrokerServices/AmazonSNS.md)                                                                                                                           | [Active MQ](src/DesignComponents/MessageBrokers/ActiveMQ.md)                                     |
|---------------------------------------|-------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
|  Strength                             | High-Throughput Broker                                                                    | Low-Latency MQ                                                                                                                                                     | -                                                                                                                                                              | Push-Notification-Based-Broker                                                                                                                                                                      | Enterprise-Based MQ                                                                              |
|  Performance                          | Up to `1 million ( 1000K ) messages per second`                                           | Up to `10K messages per second` ( ie. around 100 nodes are needed to match with 1 kafka broker )                                                                   | Up to `30K messages per second`                                                                                                                                |
|  Latency                              | ~5ms                                                                                      | ~1ms                                                                                                                                                               | Low message send latency, but processing latency as 100ms-1sec                                                                                                 |
|  Message Transfer Model               | `Pub-Sub` (Pull Based)                                                                    | `Point-2-Point` (Push Based)                                                                                                                                       | `Point-2-Point` (Pull Based)                                                                                                                                   | `Pub-Sub` (Push Based, through push notification)                                                                                                                                                   | Both `Point-To-Point` & `Pub-Sub` model supported                                                |
|  Event storage structure              | `Logs`                                                                                    | `Queue`                                                                                                                                                            | `Queue` ( Standard Queues, FIFO Queues )                                                                                                                       | `Topic`                                                                                                                                                                                             | `Queue`                                                                                          |
|  Lifetime Of Messages                 | As per the retension policy, messages are retained in Kafka. And `these can be replayed`. | Once message is consumed and acknowledgement is sent, it would be removed from RabbitMQ message queue.                                                             | Message can be stored in SQS for short duration of time ( max 14 days, default 4 days ). Once message is consumed, it would be removed from SQS message queue. | No persistence. When an SNS Topic receives an event notification (from publisher), it is broadcasted (`fan-out`) to all Subscribers (Amazon SQS queues, AWS Lambda functions, HTTPS endpoints etc.) | Message would be removed once consumed.                                                          |
|  Pricing Model                        | `Open Source` ( [Amazon MSK](https://aws.amazon.com/msk/) on AWS )                        | `Open Source` ( [Amazon MQ](src/DesignComponents/AWS/MessageBrokerServices/AmazonMQ.md) on AWS )                                                                                         | `AWS Managed Service`                                                                                                                                          | `AWS Managed Service`                                                                                                                                                                               | `Open Source` ( [Amazon MQ](src/DesignComponents/AWS/MessageBrokerServices/AmazonMQ.md) on AWS ) |
|  Use Cases                            | `Massive data`/`HIGH THROUGHPUT cases` ( like `analytics` )                               | Simple `low-latency use cases` when message guarantee is needed or some consistent behaviour is needed for every message ( like order workflow, failed orders etc. ) |                                                                                                                                                                | Monitoring Apps, workflow systems, mobile apps, Push notifications to Apple, Android, FireOS, Windows devices, Send SMS to mobile users, Send Emails etc.                                           |
|  Broker/Publisher Type                | Dump                                                                                      | `Smart` ( Consistent transmission of messages to consumers at about the same speed as the broker monitors the consumer's status)                                   | Dump                                                                                                                                                           | `Smart`                                                                                                                                                                                             | Dump                                                                                             |
|  Consumer Type                        | `Smart` ( Consumers maintain their own state i.e. `dump brokers` )                        | Dumb                                                                                                                                                               | `Smart` ( All consumers need to be identical )                                                                                                                 | Dump ( All consumers might be processing messages in differently way )                                                                                                                              | Smart                                                                                            |
|  Ordering Of Messages                 | `Supported ( using partition key )`                                                       | Not-Supported                                                                                                                                                      | Supported in `FIFO SQS Queues` ( not in Standard SQS Queues )                                                                                                  | Supported in `FIFO SNS Topics`                                                                                                                                                                      |                                                                                                  |
|  Prioritizing Messages for consumption | Not-Supported                                                                             | `Supported`                                                                                                                                                        | Not-Supported                                                                                                                                                  | Not-Supported |
|  Payload Size                         | `Default 1MB limit`                                                                       | No constraints                                                                                                                                                     | No constraints                                                                                                                                                                | No constraints| No constraints                                                                                   |
|  API Endpoints available              | Yes                                                                                       | Yes | Yes                                                                                                                                                            | Yes | Yes                                                                                              |

# [Storage Services on AWS](src/DesignComponents/AWS/StorageServices)

| Basis                                 | [S3](src/DesignComponents/AWS/StorageServices/AmazonS3.md)                        | [EFS](src/DesignComponents/AWS/StorageServices/AmazonEFS.md)                    | EBS                                                   |
| ---------------------------------------|-----------------------------------------------------------------------------------|------------------------------------------------------------------------------|-------------------------------------------------------|
| Storage | Object Storage ( can be mounted using s3fs plugin or accessed over HTTP )         | Actual FileSystem ( NFS interface, which can be shared b/w `EC2 instances` ) |
| IO Speed | Relatively slower than EFS                                                        | Faster than S3                                                               |
| Rough Costing | [$0.021/GB-Month](https://aws.amazon.com/s3/pricing/)                             | [$0.30/GB-Month](https://aws.amazon.com/efs/pricing/)                        | [$0.10/GB-month](https://aws.amazon.com/ebs/pricing/) |
| Use Cases | Static Web Content, Media Data ( like image, video, documents )                   | Shared Volume b/w EC2 instances                                              | Volume for a single EC2 instance                      |
| Availability | `99.999999999% availability`, durability in at least 3 AZs in S3 Region | `99.9% availability`, with multiple AZs                                      | `99.999% availability`, with multiple AZs             |
| Storage Size | No limit                                                                          | No limit                                                                     | Max Storage size of 16TB                              |
| File Size Limitation | Max Object Size of 5TB ( Max Object Size of 5GB through PUT API )                 | Max File Size of 48TB                                                        | No Limit                                              |

# API Technology Options

| API Option| Description                                                                                                                |
| -----------|----------------------------------------------------------------------------------------------------------------------------|
| [REST](src/DesignComponents/APITechOptions/REST.md) | Used for CRUD style public APis and web app.                                                 |
| [gPRC](src/DesignComponents/APITechOptions/gPRC.md) | Used for communication b/w microservices or to collect data from IoT devices. It is relatively faster than REST or GraphQL. |
| [GraphQL](src/DesignComponents/APITechOptions/GraphQL.md) | Used for public API with customizable request body or to aggregate internal data from multiple sources in a public API.    |

# App Servers

| Component                                                         | Strength                                                                               | Very Rough Throughput (QPS)                       | Latency | Pricing Model                                                         |
|-------------------------------------------------------------------|-----------------------------------------|---------------------------------------------------|----------------|-----------------------------------------------------------------------|
| [Apache](https://apache.org/)                                     | -                                       | Web Server                       | 512 concurrent requests                           |-|Yes|

# Other Design Components
- [ELK](src/DesignComponents/ElasticSearch/ELK.md)

# HLD - Design Problems
- [Zomoto HLD Design](src/ZomatoDesign)
- [Design a system that scales to million of users on AWS](src/DesignScalableSystemWithRDMS)
- [Twillo Send Message API](src/TwilloSendMessageAPI)
- [Rate Limiter API](src/RateLimiterAPI)
- [Notification System](src/NotificationSystem)
- [Logging Solution](src/LoggingSolution)
- [MakeMyTrip Search](src/MakeMyTripSearch)
- [URL Shortening Service](src/URLShorteningService)

# Engineering Principles
- [SOLID](src/DesignComponents/SOLID.md)
- [OOPS](src/DesignComponents/OOPS.md)
- [Design Patterns](src/DesignComponents/DesignPatterns)
- [DRY](src/DesignComponents/DRY.md)

# LLD - Design Problems
- [LLD Design - Tips & Techniques](src/LLDDesignProblems/LLDDesignTipsAndTechniques.md)
- [Chess Game](src/LLDDesignProblems/ChessGame)
- [Snack & Ladder Game](src/LLDDesignProblems/SnackAndLadderGame)
- [Book My Show](src/LLDDesignProblems/BookMyShow)
- [Car Rental System](src/LLDDesignProblems/CarRentalSystem)
- [Vendor Machine](src/LLDDesignProblems/VendingMachine)
- [Hotel Booking System](src/LLDDesignProblems/HotelBookingSystem)
- [Parking Lot](src/LLDDesignProblems/ParkingLot)
- [Insurance Agent Flow](src/LLDDesignProblems/Others/InsuranceAgentFlow.md)

# Tech Skills
- [GoLang](src/DesignComponents/GoLang)
- [Spring Boot & Microservices](src/DesignComponents/SpringBootAndMicroServices)
- [Hibernate](src/DesignComponents/Hibernate.md)
- [Java](src/DesignComponents/Java)
- [Hibernate](src/DesignComponents/Hibernate.md)
- [JS](src/DesignComponents/JavaScript)
- [Testing](src/DesignComponents/Testing.md)
- [JavaScript](src/DesignComponents/JavaScript)
- [TypeScript](src/DesignComponents/TypeScript.md)
- [Angular8](src/DesignComponents/Angular8.md)

# DevOps Skills
- [Docker](src/DesignComponents/DevOps/Docker.md)
- [Kubernates](src/DesignComponents/DevOps/Kubernates.md)

# References
- [System Design Primer](https://github.com/donnemartin/system-design-primer)
- [Grokking the System Design](https://www.educative.io/courses/grokking-the-system-design-interview/39RwZr5PBwn)
- [System Design by Gaurav Sen](https://www.youtube.com/watch?v=xpDnVSmNFX0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX)
- [Benchmarking Apache Kafka, Apache Pulsar, and RabbitMQ: Which is the Fastest?](https://www.confluent.io/blog/kafka-fastest-messaging-system/)
- [System Design - Interview Questions](https://leetcode.com/discuss/interview-question/system-design?currentPage=1&orderBy=hot&query=)