# DB Scalability Techniques

| Technique                                                                            | Type   | Use Cases                                                                                                                                                                                                                                                                                                                       | Description                                                                                                                                                                                                                                                                                                                                                                         |
|--------------------------------------------------------------------------------------|--------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Single-leader technique](Consistency&Replication/SingleLeaderReplication.md) | Reads  | Almost all data-stores & message brokers use this for read scalability and reliability etc.                                                                                                                                                                                                                                     | Being able to handle a higher volume of reads than a single machine could handle, by performing reads on replicas.                                                                                                                                                                                                                                                                  |
| :star: [Partitioning/Sharding](PartitioningSharding/Readme.md)                       | Writes | [Kafka Cluster](../5_MessageBrokersEDA/Kafka/Readme.md)<br/>- [Redis Cluster](In-Memory-Databases/Redis/RedisCluster.md)<br/>- [Amazon Elastic Cache Cluster](../2_AWSServices/6_DatabaseServices/AmazonElasticCache/ClusterMode.md)<br/>- [ElasticSearch Cluster](Search-Databases/ElasticSearch/ElasticSearchCluster.md) etc. | For very large datasets, or very high query throughput, we would need to break the data up into partitions, also known as sharding<br/>- Instead of one shard for writes, we partition/shard the database based on a partition key which would increase query throughput.<br/>- In order to improve system reliability and read scalability, systems implement replication as well. |
| Vertical Scale-up (not-recommended)                                                  | Writes | SQL-DBs etc.                                                                                                                                                                                                                                                                                                                    | Generally, it's NOT recommended to do vertical scalability (due to cost, other limitations) <br/>- Horizontal scalability is more preferred.                                                                                                                                                                                                                                        |

> A system design can implement one or more of following techniques.

# Amazon RDS Cluster

![](../2_AWSServices/6_DatabaseServices/AmazonRDS/assets/Multi-AZ/RDS-Multi-AZ-Replica.drawio.png)

# Kafka Cluster

![](../5_MessageBrokersEDA/Kafka/assets/Kafka-Architecture.drawio.png)

# ElasticSearch Cluster

![](Search-Databases/ElasticSearch/assests/ElasticSearch-Cluster.png)

# Redis Cluster

![](../2_AWSServices/6_DatabaseServices/AmazonElasticCache/assets/ElasticCache-Multi-AZ.drawio.png)

# References
- [Scalability and High Availability](https://dzone.com/refcardz/scalability)