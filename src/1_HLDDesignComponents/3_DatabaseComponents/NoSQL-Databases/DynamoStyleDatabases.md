# Dynamo (storage system)
- Dynamo is a set of techniques that together can form a highly available key-value structured storage system or a distributed data store. 
- It has properties of both databases and distributed hash tables (DHTs). 
- It was created to help address some scalability issues that Amazon.com's website experienced during the holiday season of 2004.
- By 2007, it was used in Amazon Web Services, such as its [Simple Storage Service (S3)](../../../2_AWSComponents/7_StorageServices/3_ObjectStorageS3/Readme.md).

# Relationship to DynamoDB
[Amazon DynamoDB](../../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md) is built on the principles of [Dynamo]() and is a hosted service within the AWS infrastructure.

However, while [Dynamo](https://en.wikipedia.org/wiki/Dynamo_(storage_system)) is based on [leaderless replication](../1_Glossaries/Replication&Consistency/Replication.md), DynamoDB uses single-leader replication.

# Implementations
- Amazon published the paper on Dynamo, but never released its implementation. 
- The index layer of [Amazon S3](../../../2_AWSComponents/7_StorageServices/3_ObjectStorageS3/Readme.md) implements and extends many core features of Dynamo. 
- Since then, several implementations have been created based on the paper. 
- The paper also inspired many other [NoSQL database](Readme.md) implementations, such as [Apache Cassandra](ApacheCasandra.md), Project Voldemort and Riak.

# References
- [Dynamo (storage system)](https://en.wikipedia.org/wiki/Dynamo_(storage_system))
