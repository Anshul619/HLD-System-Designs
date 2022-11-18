# Server Cluster
- A [Server Cluster](https://www.racksolutions.com/news/blog/server-cluster-how-it-works/) consists of a group of servers working simultaneously under a `single IP address`.
- Server clustering also ensures [Higher Availability](HighAvailability.md) (through replications), [proper Load Balancing](LoadBalancer.md) and [System Scalability](Scalability/DBScalability.md) (through sharding & read replicas).
- Generally, every region would have its own cluster.

# Few Examples

| Tech                                                                                                  | Remarks                                     |
|-------------------------------------------------------------------------------------------------------|---------------------------------------------|
| [Kubernates Cluster](../6_DevOps/Kubernates.md)                                                       | Cluster of Containers                       |
| [Kafka Cluster](../4_MessageBrokers/Kafka/Readme.md)                                                         | Cluster of Topics (High-Throughput MQ)      |                     
| [Amazon Aurora Clusters](../../2_AWSComponents/6_DatabaseServices/AmazonRDSAurora/Readme.md)          | Cluster of DB instances, across Multi-AZs   |
| [Redis Cluster](../3_DatabaseComponents/In-Memory-Cache/Redis/RedisCluster.md)                        | Cluster of Redis Nodes (In-Memory Cache)    |
| [Amazon Elastic Cache Cluster](../../2_AWSComponents/6_DatabaseServices/AmazonElasticCache.md)        | Cluster of Redis Nodes, across Multi-AZs    |
| [ElasticSearch Cluster](../3_DatabaseComponents/Search-Engines/ElasticSearch/ElasticSearchCluster.md) | Cluster of JSON Data, Indexes etc.          |
| [OpenSearch Cluster](../../2_AWSComponents/6_DatabaseServices/AmazonOpenSearch.md)                    | Cluster of JSON Data, Indexes etc.          |
| [Casandra Cluster](../3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md)                         | Cluster of wide-columns DBs                 |
| [Hadoop Cluster](../5_BigDataComponents/ApacheHadoop)                                                 | Cluster of different components             |


![img.png](assests/server_cluster_img.png)