# System-Designs

This repo contains the various system design questions and solutions. [Read system design glossaries](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/SystemDesignGlossaries.md).

# Various components & Performance Metrics

| Component                                                                                                            | Strength                         | Component Type                                                | Very Rough Throughput (QPS)                       | Latency | Free |
|----------------------------------------------------------------------------------------------------------------------|----------------------------------|---------------------------------------------------------------|---------------------------------------------------|----------------|------|
| [Kafka](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/Kafka)                            | High-throughput MQ               | Message Queue (Pub-Sub)            | 1 million ( 1000K ) messages ( write ) per second | ~5ms | Yes   |
| [RabbitMQ](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/Kafka#kafka-vs-rabbitmq)       | Low-Latency MQ                   | Message Queue (Point-2-Point)         | 20K messages ( write ) per second                | ~1ms |  Yes   |
| [Redis](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/Redis)                            | -                                | Caching                          | 100K queries per second                         | -|  Yes   |
| [MySQL](https://www.mysql.com/)                                                                                      | -                                | SQL DB                           | 1000 concurrent requests ( 100 as default )     | [< 10ms ( to get a row from 1 million records )](https://www.quora.com/How-can-we-calculate-the-throughput-of-MySQL?share=1)|Yes|
| [DynomoDB](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/SQLvsNoSQL/ReadMe.md#dynomodb) | Predictable performance and cost | NoSQL DB as a Service ( AWS )  | More than 20 million requests per second         | less than 10-20 ms | No  |
| [MongoDB](https://www.mongodb.com)                                                                                   | -                                | NoSQL DB                         | -                                               | -|  No                                      |
| [ElasticSearch](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/ElasticSearch)            | -                                | Search Engine                    | -                                               |-|No|
| [Apache](https://apache.org/)                                                                                        | -                                | Web Server                       | 512 concurrent requests                         |-|Yes|

> Tech Guidelines ( from Scalability perspective )
> - Develop the microservice based architecture
> - Generally, we should aim for `MAXIMAL throughput` with `ACCEPTABLE latency`.
> - We must consider `cloud-agnostic approach` ( & onPerm customer approach ) while designing the solution.
> - If it's a READ heavy microservice, the best decision would be to use `Redis` or `multi-read database instances`.
> - If it's WRITE heavy microservice ( `HIGH throughput` ), the best decision would be to use either use `Kafka` ( as message queue ) or `DynmoDB`. Both can handle `HIGH throughput`.

## Design Components
- [SQL vs NoSQL](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/SQLvsNoSQL/ReadMe.md)
- [MQs like Kafka, RabbitMQ, Amazon MQ, SQS, SNS](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/Kafka/ReadMe.md)
- [Redis](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/Redis/Redis-ReadMe.md)
- [AWS](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/AWS.md)
- [ElasticSearch](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/ElasticSearch/ReadMe.md)
- [EFS vs S3](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/EFSvsS3/ReadMe.md)

## HLD - Design Problems
- [Design a system that scales to million of users on AWS](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/DesignScalableSystemWithRDMS)
- [Zomoto HLD Design](https://github.com/Anshul619/System-Designs/tree/main/src/ZomatoDesignHLD)
- [Twillo Send Message API](https://github.com/Anshul619/System-Designs/tree/main/src/TwilloSendMessageAPI)
- [Rate Limiter API](https://github.com/Anshul619/System-Designs/tree/main/src/RateLimiterAPI)
- [Notification System](https://github.com/Anshul619/System-Designs/tree/main/src/NotificationSystem)
- [Logging Solution](https://github.com/Anshul619/System-Designs/tree/main/src/LoggingSolution)
- [Monolothic to MicroService](https://github.com/Anshul619/System-Designs/tree/main/src/MonolothicToMicroservice)
- [MakeMyTrip Search](https://github.com/Anshul619/System-Designs/tree/main/src/MakeMyTripSearch)

## Engineering Principles
- [SOLID](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/SOLID.md)
- [OOPS](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/OOPS.md)
- [Design Patterns](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/DesignPatterns)
- [DRY](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/DRY.md)

## LLD - Design Problems
- [LLD Design - Tips & Techniques](https://github.com/Anshul619/System-Designs/tree/main/src/DesignLLDProblems/LLDDesignTipsAndTechniques.md)
- [Chess Game](https://github.com/Anshul619/System-Designs/tree/main/src/DesignLLDProblems/ChessGame)
- [Snack & Ladder Game](https://github.com/Anshul619/System-Designs/tree/main/src/DesignLLDProblems/SnackAndLadderGame)
- [Book My Show](https://github.com/Anshul619/System-Designs/tree/main/src/DesignLLDProblems/BookMyShow)
- [Car Rental System](https://github.com/Anshul619/System-Designs/tree/main/src/DesignLLDProblems/CarRentalSystem)
- [Vendor Machine](https://github.com/Anshul619/System-Designs/tree/main/src/DesignLLDProblems/VendorMachine)
- [Hotel Booking System](https://github.com/Anshul619/System-Designs/tree/main/src/DesignLLDProblems/HotelBookingSystem)
- [Parking Lot](https://github.com/Anshul619/System-Designs/tree/main/src/DesignLLDProblems/ParkingLot)
- [Generic Cache Implementation](https://github.com/Anshul619/System-Designs/tree/main/src/DesignLLDProblems/GenericCacheImpl)
- [Insurance Agent Flow](https://github.com/Anshul619/System-Designs/tree/main/src/DesignLLDProblems/InsuranceAgentFlow.md)

## Tech Skills
- [Spring Boot & Microservices](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/SpringBootAndMicroServices)
- [Java](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/Java)
- [Hibernate](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/Hiberate.md)
- [JS](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/JavaScript)
- [Testing](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/Testing.md)
- [JavaScript](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/JavaScript)
- [TypeScript](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/TypeScript.md)
- [Angular8](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/Angular8.md)

# References
- [System Design Primer](https://github.com/donnemartin/system-design-primer)
- [Grokking the System Design](https://www.educative.io/courses/grokking-the-system-design-interview/39RwZr5PBwn)
- [System Design by Gaurav Sen](https://www.youtube.com/watch?v=xpDnVSmNFX0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX)
- [Benchmarking Apache Kafka, Apache Pulsar, and RabbitMQ: Which is the Fastest?](https://www.confluent.io/blog/kafka-fastest-messaging-system/)
- [System Design - Interview Questions](https://leetcode.com/discuss/interview-question/system-design?currentPage=1&orderBy=hot&query=)