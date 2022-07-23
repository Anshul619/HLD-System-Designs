# System-Designs

This repo contains the various system design questions and solutions. [Read system design glossaries](src/DesignComponents/SystemDesignGlossaries.md).

# Various components & Performance Metrics

| Component                                                                                                           | Strength                         | Component Type                                                | Very Rough Throughput (QPS)                       | Latency | Free |
|---------------------------------------------------------------------------------------------------------------------|----------------------------------|---------------------------------------------------------------|---------------------------------------------------|----------------|------|
| [Kafka](src/DesignComponents/Kafka)                            | High-Throughput MQ               | Message Queue (Pub-Sub)            | 1000K ( 1 million ) messages ( write ) per second | ~5ms | Yes   |
| [RabbitMQ](src/DesignComponents/Kafka#kafka-vs-rabbitmq)       | Low-Latency MQ                   | Message Queue (Point-2-Point)         | 20K messages ( write ) per second                 | ~1ms |  Yes   |
| [Redis](src/DesignComponents/Redis)                           | In-Memory fast Data-Store        | Caching                          | 100K queries per second                           | -|  Yes   |
| [MySQL](src/DesignComponents/SQLvsNoSQL)                                                                                     | -                                | SQL DB                           | 1000 concurrent requests ( 100 as default )       | [< 10ms ( to get a row from 1 million records )](https://www.quora.com/How-can-we-calculate-the-throughput-of-MySQL?share=1)|Yes|
| [DynomoDB](src/DesignComponents/SQLvsNoSQL/ReadMe.md#dynomodb) | Predictable performance and cost | NoSQL DB as a Service ( AWS )  | More than 20 million requests per second          | less than 10-20 ms | No  |
| [MongoDB](src/DesignComponents/SQLvsNoSQL)                                                                                  | -                                | NoSQL DB                         | -                                                 | -|  No                                      |
| [ElasticSearch](src/DesignComponents/ElasticSearch)           | -                                | Search Engine                    | -                                                 |-|No|
| [Apache](https://apache.org/)                                                                                       | -                                | Web Server                       | 512 concurrent requests                           |-|Yes|

# Tech Guidelines ( from Scalability perspective )
- Develop the microservice based architecture
- Generally, we should aim for `MAXIMAL throughput` with `ACCEPTABLE latency`.
- We must consider `cloud-agnostic approach` ( & onPerm customer approach ) while designing the solution.
- If it's a READ heavy microservice, the best decision would be to use `Redis` or `multi-read database instances`.
- If it's WRITE heavy microservice ( `HIGH throughput` ), the best decision would be to use either `Kafka` ( as message queue ) or `DynamoDB` ( as data store ). 
  - Both can handle `HIGH throughput`.

## Design Components
- [SQL vs NoSQL - MySQL, PostgreSQL, DynomoDB, Casandra, MongoDB etc.](src/DesignComponents/SQLvsNoSQL)
- [MQs like Kafka, RabbitMQ, Amazon MQ, SQS, SNS etc.](src/DesignComponents/Kafka)
- [ElasticSearch - "NoSQL" Search Engine](src/DesignComponents/ElasticSearch)
- [In-Memory Cache like Redis, MemCache etc.](src/DesignComponents/Redis)
- [AWS - Various Components, Guide](src/DesignComponents/AWS/AWS.md)
  - [AWS Storage Options - S3 vs EFS vs EBS](src/DesignComponents/AWS/S3vsEFS)
- [Monolothic to MicroService](src/DesignComponents/MonolothicToMicroservice)
- [Design a system that scales to million of users on AWS](src/DesignComponents/DesignScalableSystemWithRDMS)

## HLD - Design Problems
- [Zomoto HLD Design](src/ZomatoDesign)
- [Twillo Send Message API](src/TwilloSendMessageAPI)
- [Rate Limiter API](src/RateLimiterAPI)
- [Notification System](src/NotificationSystem)
- [Logging Solution](src/LoggingSolution)
- [MakeMyTrip Search](src/MakeMyTripSearch)
- [URL Shortening Service](src/URLShorteningService)

## Engineering Principles
- [SOLID](src/DesignComponents/SOLID.md)
- [OOPS](src/DesignComponents/OOPS.md)
- [Design Patterns](src/DesignComponents/DesignPatterns)
- [DRY](src/DesignComponents/DRY.md)

## LLD - Design Problems
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

## Tech Skills
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
