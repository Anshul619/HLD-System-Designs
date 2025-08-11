# Partitioning/Sharding
- For very large datasets, or very high query throughput, replication is not sufficient - we need to break the data up into partitions, also known as [sharding](https://aws.amazon.com/what-is/database-sharding/).
- Instead of one shard for writes, we partition/shard the database based on a partition key. 
- This would increase query throughput and overall system write throughput.

> Note - This partitioning is not related to network partition (in [CAP Theorem](../../2_CAP-PACELC-Theorems/CAPTheorem.md)).

# Key Terminologies

| Terminology         | Description                                                                                                                                                                                                                    |
|---------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Partition Key       | Partitioning would be done based on a partition key. <br/>- Hence we need to carefully [choose this key](PartitionKey/Readme.md) to distribute the data evenly b/w partitions.                                                 |
| Hash Function       | Hash function helps to determine the partition for a given key.<br/>- MD5 as a hash function used in [Casandra](../../11_WideColumn-Databases/ApacheCasandra.md), [MongoDB](../../10_Document-Databases/MongoAtlas/Readme.md). |
| Secondary Indexes   | [Read more](../../5_Database-Internals/Indexing.md)                                                                                                                                                                            |
| Consistent Hashing  | This handles data sharding with dynamic number of servers.                                                                                                                                                                     |
| Unique-ID-Generator | Since NoSQL dbs don't generate primary key automatically, we would have generate unique ID on the application side.                                                                                                            |

# Common Problems of Data Partitioning

|                           | Description                                                                                                                                                                                                                                                                                             |
|---------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Joins and Denormalization | A common workaround for this problem is to denormalize the database so that queries that previously required joins can be performed from a single table. <br/>- Of course, the service now has to deal with denormalization’s perils, such as data inconsistency.                                       |
| Referential integrity     | This means, applications that require referential integrity on partitioned databases often have to enforce it in application code. <br/>- Often in such cases, applications have to run regular SQL jobs to clean up dangling references.                                                               |
| Rebalancing               | Doing this without incurring downtime is extremely difficult. Using a scheme like directory-based Partitioning does make re-balancing a more palatable experience at the cost of increasing the complexity of the system and creating a new single point of failure (i.e. the lookup service/database). |

# Clusters & Examples
- [Kafka Cluster](../../../2_MessageBrokersEDA/Kafka/assets/Kafka-Architecture.drawio.png)
- [Amazon DynamoDB Cluster](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonDynamoDB/Partioning.md)
- [ElasticSearch Cluster](../../9_Search-Databases/ElasticSearch/Sharding.md)
- [Redis Cluster](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonElasticCache/ClusterMode.md)
- [Apache Casandra](../../11_WideColumn-Databases/ApacheCasandra.md)
- [OpenSearch Cluster](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonOpenSearch/ManagedCluster.md)
- [MySql Sharding @ Pinterest](https://github.com/Anshul619/Tech-Stacks-Live-Apps/tree/main/Pinterest/Readme.md)
- [PostgreSQL Sharding @ Instagram](https://github.com/Anshul619/Tech-Stacks-Live-Apps/tree/main/Instagram/PostgreSharding.md)
- [PostgreSQL Sharding - System Design](../../../0_UseCaseDesigns/SocialNetworkFacebookInstagram/Readme.md)

# References
- [How Sharding Works?](https://medium.com/@jeeyoungk/how-sharding-works-b4dec46b3f6)
- [Sharding with Amazon Relational Database Service](https://aws.amazon.com/blogs/database/sharding-with-amazon-relational-database-service/)
- [Interviewbit - Sharding a database](https://www.interviewbit.com/problems/sharding-a-database/)
- [Amazon RDS - Back to Basics: Database Sharding to Horizontally Scale Databases](https://www.youtube.com/watch?v=9q-ZA6WtVy4)
- [Database Sharding: Concepts and Examples](https://www.mongodb.com/resources/products/capabilities/database-sharding-explained)