# Command Query Responsibility Segregation (CQRS)
- Define a view database, which is a read-only replica that is designed to support that query.
- The application keeps the replica up to date by subscribing to Domain events (through [Message Brokers like Kafka](../../4_MessageBrokersEDA/Readme.md)) published by the service that own the data.
- [Read more](https://microservices.io/patterns/data/cqrs.html)

# Architecture

![](https://microservices.io/i/patterns/data/QuerySideService.png)

# Disadvantages
- [Eventually Consistency](../../3_Databases/4_Consistency-Replication/Readme.md)