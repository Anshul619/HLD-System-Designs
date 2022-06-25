# System-Designs

This repo contains the various system design questions and solutions.

# Various components & Performance Metrices

| Component | Component Type | Very Rough Throughput (QPS)                 | Latency | Free |
|-----------|-----------------------------------------|----------------|----------------|------|
| [Kafka](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/Kafka)     | Message Queue (Pub-Sub) - High-throughput | 1 million messages ( write ) per second | ~5ms | Yes   |
| [RabbitMQ](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/Kafka#kafka-vs-rabbitmq)     | Message Queue (Point-2-Point) | 20K messages per second | ~1ms |  Yes   |
| [Redis](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/Redis)     | Caching        | 100K queries per second       | -|  Yes   |
| [MySQL](https://www.mysql.com/) | SQL DB | 1000 concurrent requests ( 100 as default )| [< 10ms ( to get a row from 1 million records )](https://www.quora.com/How-can-we-calculate-the-throughput-of-MySQL?share=1)|Yes|
| [DynomoDB](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/SQLvsNoSQL/ReadMe.md#dynomodb)  | NoSQL DB as a Service ( AWS ) - Predictable performance and cost| More than 20 million requests per second | less than 10-20 ms | No  |
| MongoDB   | NoSQL DB       | - | -|  No                                      |
| [ElasticSearch](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/ElasticSearch) | Search Engine|-|-|No|
| [Apache](https://apache.org/) | Web Server | 512 concurrent requests|-|Yes|

## Metrices & Glossaries
- [Performance Metrices](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/Performance-Metrics.md)
- [System Design Glossaries](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/System-Design-Terminologies.md)

## Design Components
- [SQLvsNoSQL](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/SQLvsNoSQL/ReadMe.md)
- [EFSvsS3](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/EFSvsS3/ReadMe.md)
- [Kafka](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/Kafka/ReadMe.md)
- [Redis](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/Redis/Redis-ReadMe.md)

## Tech Skills
- [Java](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/Java)
- [Spring Boot & Microservices](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/SpringBoot)

## Design Problems
- [Design a system that scales to million of users on AWS](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/DesignScalableSystemWithRDMS)

# References
- https://www.youtube.com/watch?v=xpDnVSmNFX0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX
- https://www.educative.io/courses/grokking-the-system-design-interview/39RwZr5PBwn
- https://github.com/donnemartin/system-design-primer
- https://leetcode.com/discuss/interview-question/system-design?currentPage=1&orderBy=hot&query=
