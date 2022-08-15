
# Scalability

# Types of Scalability

## Horizontal scalability ( Scale Out )
- Generally, the app servers can be scaled out by adding another app server.
- In case of DB, the horizontal scaling is a bit different ( single-master, multi-master ), as explained below.

![img.png](https://dzone.com/storage/temp/5747694-picture1.png)

### DB - Horizontal Scaling Techniques

#### Single-Master-Slave Technique

| Tech                                                                                                       | Remarks                                                |
|------------------------------------------------------------------------------------------------------------|--------------------------------------------------------|
| [Redis - Master Slave Replication](../3_DatabaseComponents/Redis/RedisMasterSlaveReplication.md)                              | -                                                      |
| [Amazon Elastic Cache ( Cluster Disabled )](../../2_AWSComponents/6_DatabaseServices/AmazonElasicCache.md#redis-cluster-mode-disabled-vs-redis-cluster-mode-enabled) | Elastic Cache single-master slave ( cluster disabled ) |
| [Amazon Aurora](../../2_AWSComponents/6_DatabaseServices/AmazonAurora)                                     | Aurora single-master slave cluster                     |

#### Multi-Master-Slave Technique ( Sharding )

| Tech                                                                                                                                        | Remarks                                                                            |
|---------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| [Kafka Cluster](../4_MessageBrokers/Kafka.md)                                                                                               | Cluster/Sharding of Topics ( High-Throughput MQ)                                   |                     
| [Redis Cluster](../3_DatabaseComponents/Redis/RedisCluster.md)                                                                                                 | Cluster/Sharding of Redis Nodes ( In-Memory Cache )                                |
| [Amazon Elastic Cache Cluster](../../2_AWSComponents/6_DatabaseServices/AmazonElasicCache.md#redis-cluster-mode-disabled-vs-redis-cluster-mode-enabled)                                               | Cluster of Redis Nodes, across Multi-AZs ( One cluster per region )                |
| [ElasticSearch Cluster](../3_DatabaseComponents/ElasticSearch/ElasticSearchCluster.md)                                                      | Cluster/Sharding of Indexes                                                        |
| [Amazon Aurora Multi-Master Cluster](../../2_AWSComponents/6_DatabaseServices/AmazonAurora/AuroraDBClusters.md#aurora-multi-master-cluster) | Multi-master Cluster of DB instances, across Multi-AZs ( One cluster per region ). |

![img.png](../../2_AWSComponents/0_AWSDesigns/DesignScalableSystemWithRDMS/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)

## Vertical scalability ( Scale Up )
- Generally, it's not recommended to do vertical scalability ( due to cost, license issues ). 
- :star: Horizontal scalability is more preferred. But it needs initial design think-through.

![img.png](https://dzone.com/storage/temp/5747695-picture2.png)

## [CDNs](CDNs.md)

# References
- [Scalability and High Availability](https://dzone.com/refcardz/scalability)