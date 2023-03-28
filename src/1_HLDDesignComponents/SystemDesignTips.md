# General System Design Tips

## Understand the system requirements carefully

## Design system with High Throughput & Acceptable Latency
- While designing the solution, generally we should aim for `MAXIMAL throughput` with `ACCEPTABLE latency`.

## Identify Key Components in the system
- Identify key components in the required architecture like `Data Chunking`, `Data Aggregation` etc.

## [Design Microservice Based architecture](1_MicroServicesSOA) ([Event Driven Architecture](0_SystemGlossaries/MessageBrokers/EventDrivenArchitecture.md), loosely coupled architecture)

## Identify Read/Write Ratio of the apis/queries
- If it's a READ heavy microservice, the best decision would be to use [Redis](3_DatabaseComponents/In-Memory-Cache/Redis) or `multi-read database instances`.
- If it's a WRITE heavy microservice (`HIGH throughput`), the best decision would be to use either [Kafka](4_MessageBrokers/Kafka/Readme.md) ( as message broker ) or [DynamoDB](../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md) ( as data store ).
- [How to choose database in the system design?](3_DatabaseComponents/DecideDatabase.md)

## Use Redis for caching layer
- [Redis](3_DatabaseComponents/In-Memory-Cache/Redis) improves the read throughput of the system.
- Putting a cache between application servers and a database is a common mechanism for reducing the read load on the database, which, in turn, may allow resources to be used to support more writes.
- Caches can also improve latency.

## Scalability - Data Sharding of the datastore
- To scale the data store horizontally ( i.e. improve `write throughput` ), shard the databases. (through consistent hashing technique etc. )

## Use Leverage Managed Infrastructures like [Amazon S3](../2_AWSComponents/7_StorageServices/AmazonS3/Readme.md), [Amazon Aurora](../2_AWSComponents/6_DatabaseServices/AmazonRDS/AmazonAurora.md), [DynamoDB](../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md) etc.
- We should use `Leverage Managed Infrastructures` like [Amazon S3](../2_AWSComponents/7_StorageServices/AmazonS3/Readme.md), [Amazon Aurora](../2_AWSComponents/6_DatabaseServices/AmazonRDS/AmazonAurora.md), [DynamoDB](../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md) etc.
- Sometimes, we must have to consider `cloud-agnostic approach` ( & onPerm customer approach ) while designing the solution.

## SQL Queries - Performance Techniques
- [Index the columns](0_SystemGlossaries/Database/Indexing.md) which are used in `where`, `join` etc. clauses.
- `Minimize use of JOINS` in the `SQL queries`.
- `Minimize select columns` in the `SQL Queries`.
- Observe [MySQL Slow Queries logs](https://severalnines.com/blog/how-identify-mysql-performance-issues-slow-queries/) and find out SLOW Queries in it.

## Other Points
- Implement `Pagination` while loading data in the UI pages ( i.e. Page wise scaling )
- Implement `Divide & Conquer` approach in the UI pages ( i.e. data chunking, single responsibility APIs )

## References
- [Uber - Service Oriented Architecture](https://eng.uber.com/service-oriented-architecture/)
- [Scalable Architecture: A Definition and How-To Guide](https://www.sentinelone.com/blog/scalable-architecture/)
