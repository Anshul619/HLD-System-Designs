# Server Cluster
- A [Server Cluster](https://www.racksolutions.com/news/blog/server-cluster-how-it-works/) consists of a group of servers working simultaneously under a **single IP address**.
- Server clustering also ensures [Higher Availability](../5_HighAvailability/Readme.md) (through [replications](../1_Databases/4_Consistency-Replication/Replication/Readme.md)), proper [Load Balancing](LoadBalancer.md) and [System Scalability](../1_Databases/3_Scalability-Techniques/Readme.md) (through sharding & read replicas).
- Generally, every region would have its own cluster.

# Examples

| Tech                                                                                                                                     | Remarks                                   |
|------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------|
| [Kubernates Cluster](https://github.com/Anshul619/DevOps-SRE/tree/main/2_ContainerOrchestration/Kubernates/Readme.md)                    | Cluster of Containers                     |
| [Kafka Cluster](../2_MessageBrokersEDA/Kafka/Readme.md)                                                                                  | Cluster of Topics (High-Throughput MQ)    |                     
| [Amazon RDS Clusters](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonRDS/RDSDeploymentOptions/MultiAZInstance.md) | Cluster of DB instances, across Multi-AZs |
| [Redis Cluster](../1_Databases/8_Caching-InMemory-Databases/Redis/RedisCluster.md)                                                       | Cluster of Redis Nodes (In-Memory Cache)  |
| [Amazon Elastic Cache Cluster](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonElasticCache/ClusterMode.md)        | Cluster of Redis Nodes, across Multi-AZs  |
| [ElasticSearch Cluster](../1_Databases/9_Search-Databases/ElasticSearch/Cluster.md)                                                      | Cluster of JSON Data, Indexes             |
| [OpenSearch Cluster](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonOpenSearch/Readme.md)                         | Cluster of JSON Data, Indexes             |
| [Casandra Cluster](../1_Databases/11_WideColumn-Databases/ApacheCasandra.md)                                                             | Cluster of wide-columns DBs               |
| [Hadoop Cluster](https://github.com/Anshul619/data-engineering/tree/main/ApacheHadoop)                                                           | Cluster of different components           |

# What is Cluster capacity?
- In general, a cluster (for ex. [Kubernates cluster](https://github.com/Anshul619/DevOps-SRE/tree/main/2_ContainerOrchestration/Kubernates/Readme.md)) can be seen as abstracting a set of individual nodes as a big **super node**.
- The total compute capacity (in terms of CPU and memory) of this super node is the sum of all the constituent nodes' capacities.