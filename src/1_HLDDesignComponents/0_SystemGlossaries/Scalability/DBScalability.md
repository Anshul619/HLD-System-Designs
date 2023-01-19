# DB Scalability
- Generally, the app servers can be scaled out by adding another app server.
- But in case of DB, the horizontal scaling is a bit different (read replicas, sharding etc.), as explained below.

# DB Scalability Techniques

| Technique                                                           | Scalability type | Description                                                                                                                                                                                                                                                                                                                                                                                                   | Use Cases                                                                                                                                                                                                                                                                                                                                                                                                                               |
|---------------------------------------------------------------------|------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Replication](../Database/ReplicationAndDataConsistency.md)  | Reads            | Being able to handle a higher volume of reads than a single machine could handle, by performing reads on replicas.                                                                                                                                                                                                                                                                                            | Almost all data-stores & message brokers for read scalability and reliability.                                                                                                                                                                                                                                                                                                                                                          |
| :star: [Partitioning/Sharding](../Database/ConsistentHashing.md)    | Writes           | For very large datasets, or very high query throughput, that is not sufficient: we need to break the data up into partitions, also known as sharding<br/>- Instead of one shard for writes, we partition/shard the database based on a partition key which would increase query throughput.<br/>- Note - In order to improve system reliability and read scalability, we would implement replication as well. | - [Kafka Cluster](../../4_MessageBrokers/Kafka/Readme.md)<br/>- [Redis Cluster](../../3_DatabaseComponents/In-Memory-Cache/Redis/RedisCluster.md)<br/>- [Amazon Elastic Cache Cluster](../../../2_AWSComponents/6_DatabaseServices/AmazonElasticCache.md#redis-cluster-mode-disabled-vs-redis-cluster-mode-enabled)<br/>- [ElasticSearch Cluster](../../3_DatabaseComponents/Search-Indexes/ElasticSearch/ElasticSearchCluster.md) etc. |
| Vertical Scale-up (not preferred)                                   | Reads+Writes     | Generally, it's NOT recommended to do vertical scalability (due to cost, other limitations) <br/>- Hence, horizontal scalability is more preferred.                                                                                                                                                                                                                                                           | -                                                                                                                                                                                                                                                                                                                                                                                                                                       |

# High level architecture

## Partitioning & Replication

### Kafka Cluster

![](../../4_MessageBrokers/assests/Kafka-Architecture.drawio.png)

### ElasticSearch Cluster

![](../../3_DatabaseComponents/Search-Indexes/ElasticSearch/assests/ElasticSearch-Cluster.png)

### Redis Cluster

![](https://i1.wp.com/www.learnsteps.com/wp-content/uploads/2020/07/cluster.png?w=840&ssl=1)

### Elastic Cache Cluster

![](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/images/ElastiCache-Cluster-Redis.png)

## Vertical scalability (Scale Up)

![img.png](https://dzone.com/storage/temp/5747695-picture2.png)

# References
- [Scalability and High Availability](https://dzone.com/refcardz/scalability)
- [How Sharding Works](https://medium.com/@jeeyoungk/how-sharding-works-b4dec46b3f6)