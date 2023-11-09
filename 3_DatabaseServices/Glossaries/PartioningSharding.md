# Partitioning/Sharding
- For very large datasets, or very high query throughput, replication is not sufficient - we need to break the data up into partitions, also known as [sharding](https://aws.amazon.com/what-is/database-sharding/).
- Instead of one shard for writes, we partition/shard the database based on a partition key. 
- This would increase query throughput and overall system write throughput.

> Note - This partitioning is NOTHING related to network partition (in [CAP Theorem](PACELCTheorem/CAPTheorem.md)).

# Key Terminologies

| Terminology                                                             | Examples                                                                                                                          | Description                                                                                                                                                                                            |
|-------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Partition Key                                                           | User ID, Location ID, Photo ID etc.                                                                                               | Partitioning would be done based on a partition key. <br/>- Hence we need to carefully choose this key to distribute the data evenly b/w partitions.                                                   |
| Hash Function                                                           | MD5 as a hash function used in [Casandra](../NoSQL-Databases/WideColumnDB/ApacheCasandra.md), [MongoDB](../NoSQL-Databases/MongoDB/Readme.md). | Hash function helps to determine the partition for a given key.                                                                                                                                        |
| Secondary Indexes                                                       | [Global Secondary Indexes in DynamoDB](../../2_AWSServices/6_DatabaseServices/AmazonDynamoDB/Readme.md)                      | [Read more](../DataStructuresDB/Indexing/Readme.md)                                                                                                                                                         |
| Consistent Hashing                                                      |                                                                                                                                   | This handles data sharding with dynamic number of servers.<br/>- [Read more](https://www.youtube.com/watch?v=UF9Iqmg94tk)                                                                              |
| Record-Unique-ID-Generator (for non-sharding-builtin-DBs like Postgres) | DB Ticket Servers, which generates unique UUIDs.                                                                                  | Since data is being inserted into many databases at the same time, we would have generate unique ID on the application side.<br/>- [Read more](../../0_HLDUseCasesProblems/SocialNetworkFacebookInstagram/Readme.md) |

# Supported Clusters

## Kafka Cluster

![](../../5_MessageBrokers/assets/Kafka-Architecture.drawio.png)

## ElasticSearch Cluster

![](../Search-Databases/ElasticSearch/assests/ElasticSearch-Cluster.png)

## Redis Cluster

![](../../2_AWSServices/6_DatabaseServices/AmazonElasticCache/assets/ElasticCache-Multi-AZ.drawio.png)

[Read more](../../2_AWSServices/6_DatabaseServices/AmazonElasticCache/Readme.md)

## Others
- [Amazon DynamoDB Cluster](../../2_AWSServices/6_DatabaseServices/AmazonDynamoDB/Partioning.md)
- [Apache Casandra](../NoSQL-Databases/WideColumnDB/ApacheCasandra.md) etc.
- [Instagram - Postgres Sharding](../../0_HLDUseCasesProblems/SocialNetworkFacebookInstagram/Readme.md)

# Consistent Hashing

![img.png](assets/consistent_sharding.png)

- [Read more](https://www.toptal.com/big-data/consistent-hashing)

# References
- [How Sharding Works?](https://medium.com/@jeeyoungk/how-sharding-works-b4dec46b3f6)
- [Sharding with Amazon Relational Database Service](https://aws.amazon.com/blogs/database/sharding-with-amazon-relational-database-service/)
- [Interviewbit - Sharding a database](https://www.interviewbit.com/problems/sharding-a-database/)
- [Sharding in MySQL Cluster](https://www.mysql.com/products/cluster/scalability.html)