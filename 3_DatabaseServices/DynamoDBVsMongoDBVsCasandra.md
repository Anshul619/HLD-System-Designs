
# Difference between DynamoDB, MongoDB & Cassandra

| Feature                                                          | [DynamoDB](../2_AWSServices/6_DatabaseServices/AmazonDynamoDB/Readme.md)   | [MongoDB](10_Document-Databases/MongoDB/Readme.md)                                                                                                         | [Casandra](11_WideColumn-Databases/ApacheCasandra.md)                                                                                               |
|------------------------------------------------------------------|----------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|
| DB Type                                                          | Key-Value & Document DB Store (with well-defined query pattern).           | Document DB Store - Maximum data model flexibility & nested data.                                                                                          | Wide-Column DB Store                                                                                                                                |
| Writing Scalability                                              | :rocket: Very high and efficient                                           | Write scalability is limited in MongoDB.                                                                                                                   | :rocket: Writing scalability in Cassandra is very high and efficient (due to [append-only nature](5_DataStructuresUsedInDB/AppendOnlyProperty.md)). |
| Read Performance                                                 | Highly efficient due to fast key lookup                                    | Good read performance, with [eventual consistency](4_Consistency&Replication/Readme.md).                                                                   | :rocket: Read performance is highly efficient in Cassandra as it takes O(1) time.                                                                   |
| Data Format                                                      | Key-Value (JSON)                                                           | MongoDB supports both [JSON and BSON data formats](https://www.mongodb.com/json-and-bson).                                                                 | Cassandra only supports JSON data format.                                                                                                           |
| Horizontal Scalability/Sharding support                          | :+1: Yes                                                                   | :+1: [Yes](https://www.mongodb.com/basics/sharding)                                                                                                        | :+1: Yes                                                                                                                                            |
| Replication Method                                               | [Single-Leader Replication](4_Consistency&Replication/Replication.md)      | [Single-Leader replication](4_Consistency&Replication/Replication.md)                                                                                      | [Leaderless replication](4_Consistency&Replication/Replication.md)                                                                                  |
| [ACID Support](1_ACIDTransactions/Readme.md)                     | :+1: Yes                                                                   | :+1: [MongoDB](10_Document-Databases/MongoDB/Readme.md) provides [Multi-document ACID transactions](1_ACIDTransactions/Readme.md) with snapshot isolation. | :x: [Cassandra does not provides ACID transactions](1_ACIDTransactions/Readme.md) but can be tuned to support ACID properties.                      |
| [Secondary Indexes](5_DataStructuresUsedInDB/Indexing/Readme.md) | :+1: Yes                                                                   | :+1: Yes                                                                                                                                                   | Cassandra has only cursory support for secondary indexes i.e secondary indexing is restricted.                                                      |
| Used by                                                          | Twillo, [Mcafee](https://www.youtube.com/watch?v=ivBaro-8PhI), others etc. | :+1: Famous companies like Adobe, Amadeus, Lyft, ViaVarejo, Craftbase, etc uses MongoDB.                                                                   | Famous companies like Hulu, Instagram, Intuit, Netflix, Reddit, etc uses Cassandra.                                                                 |

# Reference
- :star: [AWS re:Invent 2021 - Which NoSQL database is right for you?](https://www.youtube.com/watch?v=ivBaro-8PhI)
- [Difference between Cassandra and MongoDB](https://www.geeksforgeeks.org/difference-between-cassandra-and-mongodb/)
- [Cassandra vs MongoDB Comparison](https://www.mongodb.com/compare/cassandra-vs-mongodb)