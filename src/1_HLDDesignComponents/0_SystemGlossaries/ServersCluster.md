# [Server Cluster](https://www.racksolutions.com/news/blog/server-cluster-how-it-works/)
- A server cluster consists of a group of servers working simultaneously under a `single IP address`.
- Server clustering also ensures [Higher Availability](HighAvailability.md) (through replications), proper [Load Balancing](LoadBalancer.md) and [System Scalability](Scalability.md) (through sharding & read replicas).
- In AWS, one cluster ( in multi-AZs ) would be in one Region. Every region would have its own cluster. 

# Few Examples

| Tech                                                                                                | Remarks                                                           |
|-----------------------------------------------------------------------------------------------------|-------------------------------------------------------------------|
| [Kafka Cluster](../4_MessageBrokers/Kafka.md)                                                       | Cluster of Topics ( High-Throughput MQ)        |                     
| [Redis Cluster](../5_Redis/RedisCluster.md)                                                         | Cluster of Redis Nodes ( In-Memory Cache )                        |
| [ElasticSearch Cluster](../3_DatabaseComponents/ElasticSearch/ElasticSearchCluster.md)              | Cluster of Indexes                                                |
| [Amazon Aurora Clusters](../../2_AWSComponents/6_DatabaseServices/AmazonAurora/AuroraDBClusters.md) | Cluster of DB instances, across Multi-AZs ( One cluster per region ). |
| [Amazon Elastic Cache Cluster](../../2_AWSComponents/6_DatabaseServices/AmazonElasicCache.md)       | Cluster of Redis Nodes, across Multi-AZs ( One cluster per region ) |
| [Kubernates Cluster](../6_DevOps/Kubernates.md)                                                     | Cluster of Containers                                             |

![img.png](assests/server_cluster_img.png)