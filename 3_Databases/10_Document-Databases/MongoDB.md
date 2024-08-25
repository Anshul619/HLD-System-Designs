
# MongoDB
- [MongoDB](https://www.mongodb.com/) is better suited for [high write and update throughput operations](../../7_Scalability/Throughput.md) without draining CPU resources and/or causing disk I/O issues. 
- It organizes data using a doubly linked data structure: documents contain linked lists to one another and to the **BSON-encoded** data behind the scenes.
- It offers high scalability, reliability, and performance.
- [MongoDB]() is more suitable to manage NoSQL data requiring create, read, update and delete (CRUD) operations.
- :star: [MongoDB vs Casandra vs DynamoDB](../DynamoDBVsMongoDBVsCasandra.md)

# :star: Real world use cases of MongoDB
- [Zomato - HLD Design](../../0_HLDUseCasesProblems/FoodOrderingZomatoSwiggy/Readme.md)

# General Use Cases

| UC                         |
|----------------------------|
| E-commerce                 |
| Content Management         |
| IoT & time-series data     |
| Trading and Payments       |
| Gaming                     |
| Mobile Apps                |
| Real-time analytics and AI |

# MQL (Mongo Query Language)
- [MongoDB]() has a rich query language called [Mongo Query Language (MQL)](https://www.mongodb.com/developer/products/atlas/getting-started-atlas-mongodb-query-language-mql/). 
- It supports a wide variety of modern native drivers as well as a shell.
- MongoDB supports [fully ACID compliant transactions](../1_ACIDTransactions/Readme.md).

# References
- [MongoDB Interview Questions](https://www.interviewbit.com/mongodb-interview-questions/)
- [Split Chunks in a Sharded Cluster](https://www.mongodb.com/docs/manual/tutorial/split-chunks-in-sharded-cluster/)