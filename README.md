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

# Tech Decisions ( Scalability )
- Develope microservice based architecture
- We must consider cloud agnostic approach ( & onPerm customer approach ) while designing the solution.
- **Open Question - Since most cloud apps would be deployed on AWS, shouldn't we consider managed AWS services instead of our own managed instances ( like Amazon SQS instead of Kafka?)**
- If its a read heavy microservice, the best decision would be to use `Redis`
- If its a write heavy microservice, the best decision would be to use either use `Kafka` ( as message queue ) or `DynmoDB`. Both can handle high throughput.

## Design Components
- [SQLvsNoSQL](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/SQLvsNoSQL/ReadMe.md)
- [Kafka](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/Kafka/ReadMe.md)
- [AWS](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/AWS.md)
- [EFSvsS3](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/EFSvsS3/ReadMe.md)
- [Redis](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/Redis/Redis-ReadMe.md)

## Tech Skills
- [Java](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/Java)
- [Spring Boot & Microservices](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/SpringBoot)

## Design Problems
- [Design a system that scales to million of users on AWS](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/DesignScalableSystemWithRDMS)

## System Design Glossaries

### Throughput
- Throughput is the number of actions executed or results produced per unit of time. 
- This is measured in units of whatever is being produced (cars, motorcycles, I/O samples, memory words, iterations) per unit of time.
- Example - 500 transactions per second etc.

### Latency
- Latency is the time required to perform an action or to produce some result. 
- Latency is measured in units of time -- hours, minutes, seconds, nanoseconds or clock periods.
- Example - 50 secs to do a transaction.

### What is TPS ( Transactions per Second )?
- The number of things to be transmitted every second, that is, the number of transactions per second processed by the server.
- The TPS includes a message entry and a message, plus a user database access. (Business TPS = CAPSX per call average TPs)

### What is QPS ( Queries per Second )?
- Every transaction might have multiple queries.
- Hence, QPS is the subset of TPS.

### Atomicity
- Atomicity is a feature of databases systems dictating where a transaction must be all-or-nothing. 
- That is, the transaction must either fully happen, or not happen at all. 
- It must not complete partially.
- Reference - https://www.techopedia.com/definition/24729/atomicity

### Language Agnostic
- We should design the system considering agnostic feature (Language agnostic, AWS agnostic etc.) into the consideration.
- Language-agnostic - Language-agnostic programming or scripting (also called language-neutral, language-independent, or cross-language) is a software development paradigm where a particular language is chosen because of its appropriateness for a particular task (taking into consideration all factors, including ecosystem, developer skill-sets, performance, etc.), and not purely because of the skill-set available within a development team.
- Example - https://en.wikipedia.org/wiki/Language-agnostic

### Durability
- In database systems, durability is the ACID property which guarantees that *transactions that have committed will survive permanently*. 
- For example, if a flight booking reports that a seat has successfully been booked, then the seat will remain booked even if the system crashes.

### [High Availability](https://avinetworks.com/glossary/high-availability/)
- High Availability (HA) describes systems that are dependable enough to operate continuously without failing. 
- They are well-tested and sometimes equipped with redundant components.

# References
- https://www.youtube.com/watch?v=xpDnVSmNFX0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX
- https://www.educative.io/courses/grokking-the-system-design-interview/39RwZr5PBwn
- https://github.com/donnemartin/system-design-primer
- https://leetcode.com/discuss/interview-question/system-design?currentPage=1&orderBy=hot&query=
- https://www.mongodb.com/pricing
- https://stackoverflow.com/questions/20520492/how-to-minimize-the-latency-involved-in-kafka-messaging-framework
- https://www.confluent.io/blog/kafka-fastest-messaging-system/
- https://medium.com/explorium-ai/how-to-dramatically-increase-your-elasticsearch-throughput-and-concurrency-capacity-c32d7bb02ac2
