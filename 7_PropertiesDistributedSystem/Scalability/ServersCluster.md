# Server Cluster
- A [Server Cluster](https://www.racksolutions.com/news/blog/server-cluster-how-it-works/) consists of a group of servers working simultaneously under a **single IP address**.
- Server clustering also ensures [Higher Availability](../Reliability/HighAvailability.md) (through [replications](../../3_DatabaseServices/4_Consistency&Replication/Replication.md)), [proper Load Balancing](../LoadBalancer.md) and [System Scalability](../../3_DatabaseServices/3_ScalabilityTechniques/Readme.md) (through sharding & read replicas).
- Generally, every region would have its own cluster.

# Examples

| Tech                                                                                                     | Remarks                                   |
|----------------------------------------------------------------------------------------------------------|-------------------------------------------|
| [Kubernates Cluster](../../9_Container&OrchestrationServices/Kubernates/Readme.md)                        | Cluster of Containers                     |
| [Kafka Cluster](../../4_MessageBrokersEDA/Kafka/Readme.md)                                               | Cluster of Topics (High-Throughput MQ)    |                     
| [Amazon RDS Clusters](../../2_AWSServices/6_DatabaseServices/AmazonRDS/MultiAZDeployment.md)             | Cluster of DB instances, across Multi-AZs |
| [Redis Cluster](../../3_DatabaseServices/8_InMemory-Databases/Redis/RedisCluster.md)                     | Cluster of Redis Nodes (In-Memory Cache)  |
| [Amazon Elastic Cache Cluster](../../2_AWSServices/6_DatabaseServices/AmazonElasticCache/ClusterMode.md) | Cluster of Redis Nodes, across Multi-AZs  |
| [ElasticSearch Cluster](../../3_DatabaseServices/9_Search-Databases/ElasticSearch/Cluster.md)            | Cluster of JSON Data, Indexes etc.        |
| [OpenSearch Cluster](../../2_AWSServices/6_DatabaseServices/Search-Databases/AmazonOpenSearch.md)        | Cluster of JSON Data, Indexes etc.        |
| [Casandra Cluster](../../3_DatabaseServices/11_WideColumn-Databases/ApacheCasandra.md)                   | Cluster of wide-columns DBs               |
| [Hadoop Cluster](../../6_BigDataServices/ApacheHadoop)                                                   | Cluster of different components           |

# What is Cluster capacity?
- In general, a cluster (for ex. [Kubernates cluster](../../9_Container&OrchestrationServices/Kubernates/Readme.md)) can be seen as abstracting a set of individual nodes as a big **super node**.
- The total compute capacity (in terms of CPU and memory) of this super node is the sum of all the constituent nodes' capacities.