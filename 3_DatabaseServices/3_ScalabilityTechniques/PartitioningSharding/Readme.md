# Partitioning/Sharding
- For very large datasets, or very high query throughput, replication is not sufficient - we need to break the data up into partitions, also known as [sharding](https://aws.amazon.com/what-is/database-sharding/).
- Instead of one shard for writes, we partition/shard the database based on a partition key. 
- This would increase query throughput and overall system write throughput.

> Note - This partitioning is not related to network partition (in [CAP Theorem](../../2_CAP&PACELCTheorems/CAPTheorem.md)).

# Key Terminologies

| Terminology         | Description                                                                                                                                                                                                           |
|---------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Partition Key       | Partitioning would be done based on a partition key. <br/>- Hence we need to carefully [choose this key to distribute the data evenly b/w partitions](PartitionKey/Readme.md).                                        |
| Hash Function       | Hash function helps to determine the partition for a given key.<br/>- MD5 as a hash function used in [Casandra](../../11_WideColumn-Databases/ApacheCasandra.md), [MongoDB](../../10_Document-Databases/MongoDB.md). |
| Secondary Indexes   | [Global Secondary Indexes in DynamoDB](../../../2_AWSServices/6_DatabaseServices/AmazonDynamoDB/Readme.md) <br/>- [Read more](../Indexing.md)                                            |
| Consistent Hashing  | This handles data sharding with dynamic number of servers.                                                                                                                                                            |
| Unique-ID-Generator | Since NoSQL dbs don't generate primary key automatically, we would have generate unique ID on the application side.                                                                                                   |

# Supported Clusters

## Kafka Cluster

![](../../../4_MessageBrokersEDA/Kafka/assets/Kafka-Architecture.drawio.png)

## ElasticSearch Cluster

![](../../9_Search-Databases/ElasticSearch/assests/ElasticSearch-Cluster.png)

## Redis Cluster

![](../../../2_AWSServices/6_DatabaseServices/AmazonElasticCache/assets/ElasticCache-Multi-AZ.drawio.png)

[Read more](../../../2_AWSServices/6_DatabaseServices/AmazonElasticCache/Readme.md)

## Others
- [Amazon DynamoDB Cluster](../../../2_AWSServices/6_DatabaseServices/AmazonDynamoDB/Partioning.md)
- [Apache Casandra](../../11_WideColumn-Databases/ApacheCasandra.md)
- [Instagram - Postgres Sharding](../../../0_HLDUseCasesProblems/SocialNetworkFacebookInstagram/Readme.md)

# References
- [How Sharding Works?](https://medium.com/@jeeyoungk/how-sharding-works-b4dec46b3f6)
- [Sharding with Amazon Relational Database Service](https://aws.amazon.com/blogs/database/sharding-with-amazon-relational-database-service/)
- [Interviewbit - Sharding a database](https://www.interviewbit.com/problems/sharding-a-database/)
- [Sharding in MySQL Cluster](https://www.mysql.com/products/cluster/scalability.html)
- [Amazon RDS - Back to Basics: Database Sharding to Horizontally Scale Databases](https://www.youtube.com/watch?v=9q-ZA6WtVy4)