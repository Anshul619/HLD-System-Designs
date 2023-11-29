# Database Design Tips | Choosing the Best Database in a System Design

![](DatabaseDesign.png)

[Read more](https://www.youtube.com/watch?v=cODCpXtPHbQ)

# Key Parameters

| Title                  | Remarks                                                                                                                                                        |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: Query Patterns  | How complex are your query patterns? <br/>- Do you just need retrieval by key, or also by various other parameters? Do you also need fuzzy search on the data? |
| Consistency            | Is strong consistency required (read after write, especially when you switch writes to a different data-center) or eventual consistency is OK?                 |
| Storage Capacity       | How much storage capacity is needed?                                                                                                                           |
| Performance            | What is the needed throughput and latency?                                                                                                                     |

[Read more](https://medium.com/wix-engineering/how-to-choose-the-right-database-for-your-service-97b1670c5632)

# Key Considerations

| Title                                                               | Category | Remarks                                                                                                                                                                                                                                                                         |
|---------------------------------------------------------------------|----------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Microservices - Purpose built DB for each microservice              | General  | With modern application design such as [microservice architectures](../5_MicroServicesSOA/Readme.md), it is easier to scale and faster to develop applications with a denormalized schema because each service stores and processes data related to a single business function. |
| [SQL vs NoSQL](6_SQLvsNoSQL/Readme.md)                              | General  |                                                                                                                                                                                                                                                                                 |
| [All Databases list](All-DBs-List.md)                               | General  |                                                                                                                                                                                                                                                                                 |
| [Sharding of the database](3_PartitioningSharding/Readme.md)        | Sharding | To scale the data store horizontally (& improve write scalability), shard the databases using [consistent hashing technique](3_PartitioningSharding/ConsistentHashing.md).                                                                                                      |
| [Partitioning Key Tips](3_PartitioningSharding/PartitionKeyTips.md) | Sharding | Decide partition key carefully (to prevent hot partition problem).                                                                                                                                                                                                              |
| [DynamoDB vs MongoDB vs Casandra](DynamoDBVsMongoDBVsCasandra.md)   | NoSQL DB |                                                                                                                                                                                                                                                                                 |
| [SQL Tunning](7_SQL-Databases/SQLTuning.md)                         | SQL DB   | Tune queries, to improve performance of SQL Queries.                                                                                                                                                                                                                            |
| [SQL - Read scalability](7_SQL-Databases/ReadReplicaVsCache.md)     | SQL DB   | To improve read scalability of SQL queries, use [Redis](8_InMemory-Databases/Redis) or [single-leader technique](4_Consistency&Replication/SingleLeaderReplication.md).                                                                                                         |

# PACLEC Theorem

![](2_CAP&PACELCTheorems/PACELC_Diagram.drawio.png)

[Read more](2_CAP&PACELCTheorems/Readme.md)

# ACID Transactions

![](1_ACIDTransactions/assets/ACID_Property_DBMS.drawio.png)

[Read more](1_ACIDTransactions/Readme.md)

# References
- :star: [AWS re:Invent 2021 - Which NoSQL database is right for you?](https://www.youtube.com/watch?v=ivBaro-8PhI)
- [How To Choose The Right Database?](https://www.youtube.com/watch?v=kkeFE6iRfMM)
- [AWS re:Invent 2022 - From RDBMS to NoSQL (PRT314)](https://www.youtube.com/watch?v=eEENrNKxCdw)
- [Databases on AWS: The Right Tool for the Right Job](https://www.youtube.com/watch?v=WE8N5BU5MeI&t=3710s)
- [Wix Engineering - How to choose the right database for your service](https://medium.com/wix-engineering/how-to-choose-the-right-database-for-your-service-97b1670c5632)
- [Wix Engineering - 5 Database technologies used by 2000 Wix microservices](https://medium.com/wix-engineering/5-database-technologies-used-by-2000-wix-microservices-e4769638b8c3)
- [AWS - What Is a Document Database?](https://aws.amazon.com/nosql/document/)