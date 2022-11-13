
# DB Scalability
- Generally, the app servers can be scaled out by adding another app server.
- But in case of DB, the horizontal scaling is a bit different, as explained below.

# Types of DB Scalability

## Horizontal scalability (Scale Out)

![img.png](https://dzone.com/storage/temp/5747694-picture1.png)

### Single-Primary-Instance-Multiple-Read-Replicas Technique
- In this technique, scalability is done through multiple read replicas (with a single primary instance).
- All writes would go to primary instance, while [all reads are load balanced across read replicas](../LoadBalancer.md).

| Tech                                                                                                                                                                   | Remarks                                              |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------|
| [Redis - Master Slave Replication](../../3_DatabaseComponents/In-Memory-Cache/Redis/RedisMasterSlaveReplication.md)                                                    | -                                                    |
| [Amazon Elastic Cache (Cluster Disabled)](../../../2_AWSComponents/6_DatabaseServices/AmazonElasticCache.md#redis-cluster-mode-disabled-vs-redis-cluster-mode-enabled) | Elastic Cache single-master slave (cluster disabled) |
| [Amazon Aurora](../../../2_AWSComponents/6_DatabaseServices/AmazonRDSAurora/Readme.md)                                                                                 | Aurora single-master slave cluster                   |

### Multi-Primary-Instances-Multiple-Read-Replicas Technique (Sharding)

- [Read more about consistent hashing](../ConsistentHashing.md)

| Tech                                                                                                                                                        | Remarks                                                                            |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| [Kafka Cluster](../../4_MessageBrokers/Kafka.md)                                                                                                            | Cluster/Sharding of Topics ( High-Throughput MQ)                                   |                     
| [Redis Cluster](../../3_DatabaseComponents/In-Memory-Cache/Redis/RedisCluster.md)                                                                           | Cluster/Sharding of Redis Nodes ( In-Memory Cache )                                |
| [Amazon Elastic Cache Cluster](../../../2_AWSComponents/6_DatabaseServices/AmazonElasticCache.md#redis-cluster-mode-disabled-vs-redis-cluster-mode-enabled) | Cluster of Redis Nodes, across Multi-AZs ( One cluster per region )                |
| [ElasticSearch Cluster](../../3_DatabaseComponents/Search-Engines/ElasticSearch/ElasticSearchCluster.md)                                                    | Cluster/Sharding of Indexes                                                        |

![img.png](../../../2_AWSComponents/0_AWSDesigns/DesignScalableSystemWithRDMS/assets/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)

## Vertical scalability (Scale Up)
- Generally, it's not recommended to do vertical scalability (due to cost, other limitations). 
- :star: Horizontal scalability is more preferred. But it needs initial design think-through.

![img.png](https://dzone.com/storage/temp/5747695-picture2.png)

# References
- [Scalability and High Availability](https://dzone.com/refcardz/scalability)
- [How Sharding Works](https://medium.com/@jeeyoungk/how-sharding-works-b4dec46b3f6)