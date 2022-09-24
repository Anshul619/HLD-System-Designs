
# MongoDB

[MongoDB](https://www.interviewbit.com/mongodb-interview-questions/) is better suited for high write and update throughput operations without draining CPU resources and/or causing disk I/O issues. 
- It is written in C++ and uses a memory map file to map on-disk data files to in-memory byte arrays. 
- It organizes data using a doubly linked data structure: documents contain linked lists to one another and to the `BSON-encoded` data behind the scenes.

![img.png](assests/MongoDB_JSON.png)

# :star: Real world use cases of MongoDB
- [Zomato - HLD Design](../../../../3_HLDDesignProblems/ZomatoDesign/README.md)

# General Use Cases
[MongoDB](https://www.interviewbit.com/mongodb-interview-questions/) is more suitable to manage NoSQL data requiring create, read, update and delete (CRUD) operations. 
- It offers high scalability, reliability, and performance. 
- MongoDB also uses text-based indexes for full-text queries, but the search is slow, and the search server does not provide tokenizers and analyzers like [Elasticsearch](../../Search-Engines/ElasticSearch) does.

# MQL (Mongo Query Language)
- [MongoDB](https://www.interviewbit.com/mongodb-interview-questions/) has a rich query language called MQL. 
- It supports a wide variety of modern native drivers as well as a shell.
- MongoDB supports [fully ACID compliant transactions](../../../0_SystemGlossaries/ACIDPropertyTransaction.md).

# References
- [Cassandra vs MongoDB Comparison](https://www.mongodb.com/compare/cassandra-vs-mongodb)