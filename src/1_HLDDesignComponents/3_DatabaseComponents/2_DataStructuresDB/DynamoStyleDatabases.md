# Dynamo (storage system)
- [Dynamo](https://en.wikipedia.org/wiki/Dynamo_(storage_system)) is a set of techniques that together can form a highly available key-value structured storage system or a distributed data store. 
- It was created to help address some scalability issues that Amazon.com's website experienced during the holiday season of 2004.

# Features

| Feature                                                                          | Remarks                                                                 |
|----------------------------------------------------------------------------------|-------------------------------------------------------------------------|
| [Leaderless replication](../1_Glossaries/Consistency&Replication/Replication.md) | Dynamo is based on leaderless replication.                              |
| Both database and distributed hashTable                                          | It has properties of both databases and distributed hash tables (DHTs). |

# Supported Services

| Service                                                                                 | Remarks                                                                                                                                                                                                                         |
|-----------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Amazon DynamoDB](../../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md) | [Amazon DynamoDB](../../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md) is built on the principles of [Dynamo](), but with [Single-leader replication](../1_Glossaries/Consistency&Replication/Replication.md). |
| [Amazon S3](../../../2_AWSComponents/7_StorageServices/3_ObjectStorageS3/Readme.md)     | The index layer of [Amazon S3](../../../2_AWSComponents/7_StorageServices/3_ObjectStorageS3/Readme.md) implements and extends many core features of Dynamo.                                                                     |
| [Apache Cassandra](../NoSQL-Databases/ApacheCasandra.md)                                | -                                                                                                                                                                                                                               |
| Others NoSQL-DBs like Project Voldemort and Riak etc.                                   | -                                                                                                                                                                                                                               |

# References
- [Dynamo vs Cassandra : Systems Design of NoSQL Databases](https://sujithjay.com/data-systems/dynamo-cassandra/)
