# Database Design Tips | Choosing the Best Database in a System Design

> With modern application design such as [microservice architectures](4_MicroServicesSOA/Readme.md), it is easier to scale and faster to develop applications with a denormalized schema because each service stores and processes data related to a single business function.

![](3_DatabaseServices/assets/DecideDatabase.drawio.png)

# Key Parameters

| Title                  | Remarks                                                                                                                                                        |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: Query Patterns  | How complex are your query patterns? <br/>- Do you just need retrieval by key, or also by various other parameters? Do you also need fuzzy search on the data? |
| Consistency            | Is strong consistency required (read after write, especially when you switch writes to a different data-center) or eventual consistency is OK?                 |
| Storage Capacity       | How much storage capacity is needed?                                                                                                                           |
| Performance            | What is the needed throughput and latency?                                                                                                                     |

# Different NoSQL DB types

![](3_DatabaseServices/NoSQL-Databases/NoSQL-DifferentDBtypes.drawio.png)

[Read more](3_DatabaseServices/NoSQL-Databases/Readme.md)

# PACLEC Theorem

![](3_DatabaseServices/Glossaries/PACELCTheorem/PACELC_Diagram.drawio.png)

[Read more](3_DatabaseServices/Glossaries/PACELCTheorem/Readme.md)

# Other Considerations

| Point                                                                                                |
|------------------------------------------------------------------------------------------------------|
| [SQL vs NoSQL](3_DatabaseServices/SQLvsNoSQL.md)                                                     |
| [DynamoDB vs MongoDB vs Casandra](3_DatabaseServices/NoSQL-Databases/DynamoDBVsMongoDBVsCasandra.md) |
| [Partitioning Key Tip](3_DatabaseServices/Glossaries/PartitioningSharding/PartitionKeyTips.md)       |

# References
- :star: [AWS re:Invent 2021 - Which NoSQL database is right for you?](https://www.youtube.com/watch?v=ivBaro-8PhI)
- :star: [Database Design Tips | Choosing the Best Database in a System Design Interview](https://www.youtube.com/watch?v=cODCpXtPHbQ)
- [How To Choose The Right Database?](https://www.youtube.com/watch?v=kkeFE6iRfMM)
- [AWS re:Invent 2022 - From RDBMS to NoSQL (PRT314)](https://www.youtube.com/watch?v=eEENrNKxCdw)
- [Databases on AWS: The Right Tool for the Right Job](https://www.youtube.com/watch?v=WE8N5BU5MeI&t=3710s)
- [Wix Engineering - How to choose the right database for your service](https://medium.com/wix-engineering/how-to-choose-the-right-database-for-your-service-97b1670c5632)
- [Wix Engineering - 5 Database technologies used by 2000 Wix microservices](https://medium.com/wix-engineering/5-database-technologies-used-by-2000-wix-microservices-e4769638b8c3)