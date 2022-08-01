# System-Designs

This repo contains the various system design questions and solutions. 
- Read [System Design Glossaries](src/DesignComponents/SystemGlossaries.md)
- Read [System Scalability Guide](src/DesignComponents/SystemScalabilityGuidelines.md)
- Read [System Estimation Guide](src/DesignComponents/SystemEstimations.md)

# Various components & Performance Metrics

| Component                                                | Strength                                | Component Type                                                | Very Rough Throughput (QPS)                       | Latency | Free |
|----------------------------------------------------------|-----------------------------------------|---------------------------------------------------------------|---------------------------------------------------|----------------|------|
| [Redis](src/DesignComponents/Redis)                      | In-Memory fast Data-Store (Caching)     | Caching                          | 100K queries per second                           | -|  Yes   |
| [MySQL](src/DesignComponents/SQLvsNoSQL)                 | -                                       | SQL DB                           | 1000 concurrent requests ( 100 as default )       | [< 10ms ( to get a row from 1 million records )](https://www.quora.com/How-can-we-calculate-the-throughput-of-MySQL?share=1)|Yes|
| [DynomoDB](src/DesignComponents/AWS/DynamoDB.md)         | Predictable performance and cost        | NoSQL DB as a Service ( AWS )  | More than 20 million requests per second          | less than 10-20 ms | No  |
| [ElasticSearch](src/DesignComponents/ElasticSearch)      | `Full-Text-Search`, Logs-Analysis (ELK) | Search Engine                    | -                                                 |-|No|
| [MongoDB](src/DesignComponents/SQLvsNoSQL)               | -                                       | NoSQL DB                         | -                                                 | -|  No                                      |
| [Apache](https://apache.org/)                            | -                                       | Web Server                       | 512 concurrent requests                           |-|Yes|

# Design Components
- [SQL vs NoSQL - MySQL, DynomoDB etc.](src/DesignComponents/SQLvsNoSQL)
  - [DynamoDB](src/DesignComponents/AWS/DynamoDB.md)
- [ElasticSearch - "NoSQL" Search Engine](src/DesignComponents/ElasticSearch)
- [In-Memory Cache like Redis, MemCache etc.](src/DesignComponents/Redis)
- [AWS - Various Components, Guide](src/DesignComponents/AWS/README.md)
  - [S3 vs EFS vs EBS](src/DesignComponents/AWS/S3vsEFS)
- [Monolothic to MicroService](src/DesignComponents/MonolothicToMicroservice)
- [Design a system that scales to million of users on AWS](src/DesignComponents/AWS/DesignScalableSystemWithRDMS)

## [Message Brokers](src/DesignComponents/MessageBrokers)

Message brokers are used to decouple and enable `Event Driven Architectures` i.e. communicate the events between microservices.

Basis                                 | [Kafka](src/DesignComponents/MessageBrokers/Kafka.md)                                 | [RabbitMQ](src/DesignComponents/MessageBrokers/RabbitMQ.md)                                                                                                          | [Amazon SQS](src/DesignComponents/AWS/AmazonSQS.md)                  | [Amazon SNS](src/DesignComponents/AWS/AmazonSNS.md)                                                                                                                                 | [Active MQ](src/DesignComponents/MessageBrokers/ActiveMQ.md)               |
---------------------------------------|---------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
Strength | High-Throughput MQ                                                                    | Low-Latency MQ                                                                                                                                                       | -                                                                    | -                                                                                                                                                                                   | Enterprise-Based MQ                                                        ||
Performance | Up to `1 million ( 1000K ) messages per second`                                       | Up to `10K messages per second` ( ie. around 100 nodes are needed to match with 1 kafka broker )                                                                     | Up to `30K messages per second`                                      |
Latency | ~5ms                                                                                  | ~1ms                                                                                                                                                                 |                                                                      |
Message Transfer Model | `Pub-Sub` (`Pull Based`)                                                 | `Point-2-Point` (`Push Based`)                                                                                                                                       | `Point-2-Point` (`Pull Based`)                                       | `Pub-Sub` (`Push Based`)                                                                                                                                                            | Both `Point-To-Point` & `Pub-Sub` model supported                          |
Event storage structure | `Logs`                                                                                | `Queue`                                                                                                                                                              | `Queue` ( Standard Queues, FIFO Queues )                             | `Topic`                                                                                                                                                                             | `Queue`                                                                    |
Lifetime Of Messages                  | As per retension policy, messages are retained in Kafka. And `these can be replayed`. | Once message is consumed and acknowledgement is sent, it would be removed from RabbitMQ message queue.                                                               | Once message is consumed, it would be removed from SQS message queue | When an SNS Topic receives an event notification (from publisher), it is broadcasted (`fan-out`) to all Subscribers (Amazon SQS queues, AWS Lambda functions, HTTPS endpoints etc.) ||                                      |                                                                                       |                                                                                                                                                                      |                                                                     |                                                                                                                                                                                                                   |                                                                            |
Component Type | `Open Source` ( [Amazon MSK](https://aws.amazon.com/msk/) on AWS )                    | `Open Source` ( [Amazon MQ](src/DesignComponents/AWS/AmazonMQ.md) on AWS )                                                                                           | `AWS Managed Service`                                                | `AWS Managed Service`                                                                                                                                                               | `Open Source` ( [Amazon MQ](src/DesignComponents/AWS/AmazonMQ.md) on AWS ) |
Use Cases | `Massive data`/`HIGH THROUGHPUT cases` ( like `analytics` )                           | Simple `low-latency use cases` when message guarantee is needed or some consistent behaviour is needed for every message ( like order workflow, failed orders etc. ) |                                                                      | Monitoring Apps, workflow systems, mobile apps, Push notifications to Apple, Android, FireOS, Windows devices, Send SMS to mobile users, Send Emails etc.                           |
Data Type | Operational                                                                           | Transactional                                                                                                                                                        |                                                                      |
Broker/Publisher Type | Dump                                                                                  | `Smart` ( Consistent transmission of messages to consumers at about the same speed as the broker monitors the consumer's status)                                     |                                                                      |
Consumer Type | `Smart` ( Consumers maintain their own state i.e. "dump" brokers )                    | Dumb                                                                                                                                                                 |                                                                      |
Ordering Of Messages                  | `Supported ( using partition key )`                                                   | Not-Supported                                                                                                                                                        | `Supported in FIFO SQS Queues` ( not in Standard SQS Queues )        | `Supported in FIFO SNS Topics`                                                                                                                                                      |                                                                            |                                                                                                                                                                      |                                                                      |                                                     |                                                                            |
Prioritizing Messages for consumption | Not-Supported.                                                                        | `Supported`                                                                                                                                                          |                                                                      |
Payload Size | `Default 1MB limit`                                                                   | No constraints                                                                                                                                                       |                                                                      |

# HLD - Design Problems
- [Zomoto HLD Design](src/ZomatoDesign)
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
- [LLD Design - Tips & Techniques](src/DesignLLDProblems/LLDDesignTipsAndTechniques.md)
- [Chess Game](src/DesignLLDProblems/ChessGame)
- [Snack & Ladder Game](src/DesignLLDProblems/SnackAndLadderGame)
- [Book My Show](src/DesignLLDProblems/BookMyShow)
- [Car Rental System](src/DesignLLDProblems/CarRentalSystem)
- [Vendor Machine](src/DesignLLDProblems/VendingMachine)
- [Hotel Booking System](src/DesignLLDProblems/HotelBookingSystem)
- [Parking Lot](src/DesignLLDProblems/ParkingLot)
- Others
  - [Insurance Agent Flow](src/DesignLLDProblems/Others/InsuranceAgentFlow.md)

# Tech Skills
- [Spring Boot & Microservices](src/DesignComponents/SpringBootAndMicroServices)
- [Java](src/DesignComponents/Java)
- [Hibernate](src/DesignComponents/Hibernate.md)
- [JS](src/DesignComponents/JavaScript)
- [Testing](src/DesignComponents/Testing.md)
- [JavaScript](src/DesignComponents/JavaScript)
- [TypeScript](src/DesignComponents/TypeScript.md)
- [Angular8](src/DesignComponents/Angular8.md)

# References
- [System Design Primer](https://github.com/donnemartin/system-design-primer)
- [Grokking the System Design](https://www.educative.io/courses/grokking-the-system-design-interview/39RwZr5PBwn)
- [System Design by Gaurav Sen](https://www.youtube.com/watch?v=xpDnVSmNFX0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX)
- [Benchmarking Apache Kafka, Apache Pulsar, and RabbitMQ: Which is the Fastest?](https://www.confluent.io/blog/kafka-fastest-messaging-system/)
- [System Design - Interview Questions](https://leetcode.com/discuss/interview-question/system-design?currentPage=1&orderBy=hot&query=)
