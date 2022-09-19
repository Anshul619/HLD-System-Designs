
# NoSQL-DB Comparisons

| Database                                                                                | Strength                                                                                                                                                                               | DB Type        | Pricing Model         |
|-----------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------|-----------------------|
| :star: [Amazon DynamoDB](../../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB.md) | Predictable performance and cost. <br/>- More than 20 million requests per second <br/>- Less than 10-20 ms latency                                                                    | Key-Value      | `AWS Managed Service` |
| :star: [ElasticSearch](ElasticSearch)                                                   | `Full-Text-Search`, `Logs-Analysis (ELK)`, `Metrics, Analysis`                                                                                                                         | Document-DB    | `Open Source`         |
| :star: [Apache Casandra](ApacheCasandra.md)                                             | Handle large amount of data, at [low latency](../../0_SystemGlossaries/LatencyThroughput.md) (with [eventual consistency](../../0_SystemGlossaries/ReplicationAndDataConsistency.md))  | Wide-Column-DB | `Open Source`         |
| [Apache HBase](ApacheHBase.md)                                                          | Handle large amount of data, at [normal latency](../../0_SystemGlossaries/LatencyThroughput.md) (with [strong consistency](../../0_SystemGlossaries/ReplicationAndDataConsistency.md)) | Wide-Column-DB | `Open Source`         |
| [MongoDB](MongoDB)                                                                      | -                                                                                                                                                                                      | Document-DB    | `Open Source`         |
| [RocksDB](RocksDB.md)                                                                   | -                                                                                                                                                                                      | Document-DB    | `Open Source`         |

# NoSQL-DB types

![img.png](assets/NoSQL-DifferentDBtypes.drawio.png)

## Key-Value Stores
- Data is stored in an array of key-value pairs.
- The `key` is an attribute name which is linked to a `value`.
- Well-known key-value stores include [Amazon DynamoDB](../../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB.md), [Redis](Redis), [RocksDB](RocksDB.md) etc.

## Document Databases
- In these databases, data is stored in documents (instead of rows and columns in a table) and these documents are grouped together in collections.
- Each document can have an entirely different structure.
- Document databases include [MongoDB](MongoDB), [ElasticSearch](ElasticSearch), [Amazon DynamoDB](../../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB.md), [CouchDB](https://couchdb.apache.org) etc.

## Wide-Column Databases
- Instead of `tables`, we have column families in column databases, which are containers for rows.
- Examples - [Apache Casandra](ApacheCasandra.md), [Apache HBase](ApacheHBase.md) etc.

## Graph Databases
- These databases are used to store data whose relations are best represented in a graph ( like parent-child relationship of aadhaar etc.)
- Data is saved in graph structures with nodes (entities), properties (information about the entities), and lines (connections between the entities).