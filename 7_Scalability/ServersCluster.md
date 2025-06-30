# Server Cluster
- A [Server Cluster](https://www.racksolutions.com/news/blog/server-cluster-how-it-works/) consists of a group of servers working simultaneously under a **single IP address**.
- Server clustering also ensures [Higher Availability](../7a_HighAvailability/Readme.md) (through [replications](../3_Databases/4_Consistency&Replication/Replication.md)), [proper Load Balancing](LoadBalancer.md) and [System Scalability](../3_Databases/3_ScalabilityTechniques/Readme.md) (through sharding & read replicas).
- Generally, every region would have its own cluster.

# Examples

| Tech                                                                                                 | Remarks                              |
|------------------------------------------------------------------------------------------------------|--------------------------------------|
| [Kubernates Cluster](../9_Container&Orchestration/Kubernates/Readme.md)                              | Cluster of Containers                |
| [Kafka Cluster](../4_MessageBrokersEDA/Kafka/Readme.md)                                              | Cluster of Topics (High-Throughput MQ) |                     
| [Amazon RDS Clusters](../2_AWS/1_DatabaseServices/AmazonRDS/RDSDeploymentOptions/MultiAZInstance.md) | Cluster of DB instances, across Multi-AZs |
| [Redis Cluster](../3_Databases/8_InMemory-Databases/Redis/RedisCluster.md)                           | Cluster of Redis Nodes (In-Memory Cache) |
| [Amazon Elastic Cache Cluster](../2_AWS/1_DatabaseServices/AmazonElasticCache/ClusterMode.md)        | Cluster of Redis Nodes, across Multi-AZs |
| [ElasticSearch Cluster](../3_Databases/9_Search-Databases/ElasticSearch/Cluster.md)                  | Cluster of JSON Data, Indexes        |
| [OpenSearch Cluster](../2_AWS/1_DatabaseServices/AmazonOpenSearch/Readme.md)                         | Cluster of JSON Data, Indexes   |
| [Casandra Cluster](../3_Databases/11_WideColumn-Databases/ApacheCasandra.md)                         | Cluster of wide-columns DBs          |
| [Hadoop Cluster](../6_BigData/ApacheHadoop)                                                          | Cluster of different components      |

# What is Cluster capacity?
- In general, a cluster (for ex. [Kubernates cluster](../9_Container&Orchestration/Kubernates/Readme.md)) can be seen as abstracting a set of individual nodes as a big **super node**.
- The total compute capacity (in terms of CPU and memory) of this super node is the sum of all the constituent nodes' capacities.