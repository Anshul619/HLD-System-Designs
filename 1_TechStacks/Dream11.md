# Dream 11 Tech Stack

| Purpose                  | Service                                                          |
|--------------------------|------------------------------------------------------------------|
| Traffic                  | 400K rps (24 million rpm), Avg 45 ms                             |
| Cloud Provider           | AWS                                                              |
| Transaction DB - Write   | VoltDB                                                           |
| Transaction DB - Read    | RDS Aurora (MySQL engine)                                        |
| Leaderboard - NoSQL DB   | Casandra (computer optimized)                                    |
| Leaderboard generation   | Spark cron jobs (every 5 mins) to update leaderboard in casandra |
| InMemory DB              | Aerospike                                                        |
| Caching                  | Redis (Set/Get, Pub-Sub)                                         |
| Backend Languages        | NodeJS, Java, Scala                                              |
| Microservices Frameworks | [Akka](https://akka.io/), [Vertex](https://vertx.io/)            |
| Microservices Pattern    | Synchronous/Request-Response                                     |
| API Option               | REST, GraphQL                                                    |
| Observability            | NewRelic, ELK                                                    |
| Message Broker           | Kafka                                                            |
| Distributed Transaction  | Saga                                                             |
| Real-time streaming      | Spark                                                            |
| Search                   | ElasticSearch                                                    |
| CI/CD                    | Jenkins                                                          |
| Data warehouse           | Redshift                                                         |
| Data Lake                | S3                                                               |

# Key Points
- Load Testing
- Capacity Planning
- Pre-warm ELB
- Make sure end-2-end monitoring/observability/alerts setup
- Sharding (users data)
- Memorization - Group requests and send request to microservice (metadata service)

# References
- [Scaling to serve 100+ million users | Amit Sharma | CTOtalk | Dream11](https://youtu.be/WifL4SWGJQw?si=j1LD7x7MjVz5Ck7S)
- [Dream 11 - Tech Blog](https://tech.dream11.in/blog)