# NoSQL-DB Comparisons

| Database                                                                                       | Strength                                                                                                                                                                               | DB Type        | Pricing Model         |
|------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------|-----------------------|
| :star: [Amazon DynamoDB](../../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md) | Predictable performance and cost. <br/>- More than 20 million requests per second <br/>- Less than 10-20 ms latency                                                                    | Key-Value      | `AWS Managed Service` |
| :star: [Elastic Search](../Search-Engines/ElasticSearch)                                       | `Full-Text-Search`, `Logs-Analysis (ELK)`, `Metrics, Analysis`                                                                                                                         | Document-DB    | `Open Source`         |
| :star: [Apache Casandra](ApacheCasandra.md)                                                    | Handle large amount of data, at [low latency](../../0_SystemGlossaries/LatencyThroughput.md) (with [eventual consistency](../../0_SystemGlossaries/ReplicationLagAndDataConsistency.md))  | Wide-Column-DB | `Open Source`         |
| [Apache HBase](ApacheHBase.md)                                                                 | Handle large amount of data, at [normal latency](../../0_SystemGlossaries/LatencyThroughput.md) (with [strong consistency](../../0_SystemGlossaries/ReplicationLagAndDataConsistency.md)) | Wide-Column-DB | `Open Source`         |
| [MongoDB](MongoDB/Readme.md)                                                                   | -                                                                                                                                                                                      | Document-DB    | `Open Source`         |
| [Neo4j](Neo4j.md)                                                                              | -                                                                                                                                                                                      | Graph-DB       | `Open Source`         |
| [RocksDB](RocksDB.md)                                                                          | [low latency](../../0_SystemGlossaries/LatencyThroughput.md), key-value data store for timeline use cases (like newsfeed).                                                             | Document-DB    | `Open Source`         |

# NoSQL-DB types

![img.png](assets/NoSQL-DifferentDBtypes.drawio.png)

## Key-Value Databases
- Data is stored in an array of key-value pairs.
- The `key` is an attribute name which is linked to a `value`.
- Examples - [Amazon DynamoDB](../../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md), [Redis](../In-Memory-Cache/Redis), [RocksDB](RocksDB.md) etc.

## Document Databases
- In these databases, data is stored in documents (instead of rows and columns in a table) and these documents are grouped together in collections.
- Each document can have an entirely different structure.
- Examples - [MongoDB](MongoDB), [Elastic Search](../Search-Engines/ElasticSearch), [Amazon DynamoDB](../../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md), [CouchDB](https://couchdb.apache.org) etc.

### General Use Cases - Document DBs
- Mobile Games
- IOT
- Contact Management etc.

## Wide-Column Databases
- Instead of `tables`, we have column families in column databases, which are containers for rows.
- Each row contains a unique identifier (or set of identifiers) as its primary key and a following set of columns. 
- The primary key serves as a partition hash key as data is distributed across the cluster.
- Examples - [Apache Casandra](ApacheCasandra.md), [Apache HBase](ApacheHBase.md) etc.

### General Use Cases - Wide-Column DBs
- [Time Series Data](https://netflixtechblog.com/scaling-time-series-data-storage-part-i-ec2b6d44ba39)
- Historical records
- High-Write, Low-Read etc.

## Graph Databases
- These databases are used to store data whose relations are best represented in a graph (like parent-child relationship of aadhaar etc.)
- Data is saved in graph structures with nodes (entities), properties (information about the entities), and lines (connections between the entities).
- Examples - [Neo4j](Neo4j.md), [Redis Graph](../In-Memory-Cache/Redis/RedisGraph.md)

### General Use Cases - Graph Database
- [Instagram - User Activity Relationship](../../../3_HLDDesignProblems/InstagramDesign/Readme.md)
- [LinkedIn - User Activity Relationship](https://engineering.linkedin.com/blog/2017/06/building-the-activity-graph--part-i)
- Social networks, logistics & spatial data
- Fraud detection & analytics
- Product-recommendation engine
- Identity and access management

# Comparisons
- :star: [Casandra vs MongoDB](CasandraVsMongoDB.md)