# DB Scalability
- Generally, the app servers can be scaled out by adding another app server.
- But in case of DB, the horizontal scaling is a bit different (read replicas, sharding etc.), as explained below.

# DB Scalability Techniques

| Technique                                                          | Scalability type | Description                                                                                                                                                                                 | Use Cases                                                                                                                                                                                                                                                                                                                                                                                                              |
|--------------------------------------------------------------------|------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Replication](../Database/ReplicationAndDataConsistency.md) | Reads            | Being able to handle a higher volume of reads than a single machine could handle, by performing reads on replicas.                                                                          | Almost all data-stores & message brokers for read scalability and reliability.                                                                                                                                                                                                                                                                                                                                         |
| :star: [Sharding/Partitioning](../Database/ConsistentHashing.md)   | Writes           | Instead of one shard for writes, we partition/shard the database based on a key.                                                                                                            | [Kafka Cluster](../../4_MessageBrokers/Kafka/Readme.md), [Redis Cluster](../../3_DatabaseComponents/In-Memory-Cache/Redis/RedisCluster.md), [Amazon Elastic Cache Cluster](../../../2_AWSComponents/6_DatabaseServices/AmazonElasticCache.md#redis-cluster-mode-disabled-vs-redis-cluster-mode-enabled), [ElasticSearch Cluster](../../3_DatabaseComponents/Search-Indexes/ElasticSearch/ElasticSearchCluster.md) etc. |
| Vertical Scale-up (not preferred)                                  | Reads+Writes     | - Generally, it's NOT recommended to do vertical scalability (due to cost, other limitations) - :star: Horizontal scalability is more preferred. But it needs initial design think-through. | -                                                                                                                                                                                                                                                                                                                                                                                                                      |

# High level architecture

## Horizontal scalability (Scale Out)

![img.png](../../../2_AWSComponents/0_AWSDesigns/DesignScalableSystemWithRDMS/assets/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)


## Vertical scalability (Scale Up)

![img.png](https://dzone.com/storage/temp/5747695-picture2.png)

# References
- [Scalability and High Availability](https://dzone.com/refcardz/scalability)
- [How Sharding Works](https://medium.com/@jeeyoungk/how-sharding-works-b4dec46b3f6)