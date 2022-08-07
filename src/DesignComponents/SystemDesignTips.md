
# General System Design Tips

## Understand the system requirements carefully

## Service-Oriented Architecture ( i.e. Microservice, Loosely coupled architecture )
- Develop the service oriented architecture i.e. loosely coupled system, `microservice based architecture`.
- [Read More](MicroServicesArchitecture)

## Asynchronous Processing using message brokers ( [Event Driven Architecture](SystemGlossaries.md) )
- Communicate the events b/w microservices asynchronously.
- As a result, producer & consumer would be loosely coupled.
- [Read more - Kafka, RabbitMQ etc.](../DesignComponents/MessageBrokers)

## Design system with High Throughput & Acceptable Latency
- While designing the solution, generally we should aim for `MAXIMAL throughput` with `ACCEPTABLE latency`.

## Identify Read/Write Ratio of the apis/queries
- If it's a READ heavy microservice, the best decision would be to use [Redis](Redis) or `multi-read database instances`.
- If it's a WRITE heavy microservice ( `HIGH throughput` ), the best decision would be to use either [Kafka](MessageBrokers/Kafka.md) ( as message broker ) or [DynamoDB](AWS/DatabaseServices/DynamoDB.md) ( as data store ).

## Use Leverage Managed Infrastructures like Amazon RDS, DynamoDB etc.
- We must consider `cloud-agnostic approach` ( & onPerm customer approach ) while designing the solution.
- But whenever applicable, we should use `Leverage Managed Infrastructures` like [Amazon S3](AWS/StorageServices/AmazonS3.md), [Amazon RDS](AWS/DatabaseServices/RDS.md), [DynamoDB](AWS/DatabaseServices/DynamoDB.md) etc.

## Identify Key Components in the system
- Identify key components in the required architecture like `Data Chunking`, `Data Aggregation` etc.

## Data Sharding
- To scale the data store horizontally, shard the databases. ( consistent hashing etc. )

## SQL Queries - Performance Techniques
- [Index the columns](https://www.geeksforgeeks.org/indexing-in-databases-set-1/) which are used in `where`, `join` etc. clauses. This will increase performance of SQL queries.
- `Minimize use of JOINS` in the `SQL queries`.
- `Minimize select columns` in the `SQL Queries`.
- `Observe MySQL Slow Queries logs` and find out SLOW Queries in it.

## Use Caching ( like [Redis](Redis) or CDNs )

## Other Points
- Implement `Pagination` while loading data in the UI pages ( i.e. Page wise scaling )
- Implement `Divide & Conquer` approach in the UI pages ( i.e. data chunking, single responsibility APIs )

## References
- [Uber - Service Oriented Architecture](https://eng.uber.com/service-oriented-architecture/)
- [Scalable Architecture: A Definition and How-To Guide](https://www.sentinelone.com/blog/scalable-architecture/)
