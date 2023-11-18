# Server Cluster
- A [Server Cluster](https://www.racksolutions.com/news/blog/server-cluster-how-it-works/) consists of a group of servers working simultaneously under a `single IP address`.
- Server clustering also ensures [Higher Availability](../Reliability/HighAvailability.md) (through [replications](../../3_DatabaseServices/Consistency&Replication/Replication.md)), [proper Load Balancing](LoadBalancer.md) and [System Scalability](../../3_DatabaseServices/ScalabilityDB.md) (through sharding & read replicas).
- Generally, every region would have its own cluster.

# Examples

| Tech                                                                                                     | Remarks                                   |
|----------------------------------------------------------------------------------------------------------|-------------------------------------------|
| [Kubernates Cluster](../../9_ContainerOrchestrationServices/Kubernates.md)                               | Cluster of Containers                     |
| [Kafka Cluster](../../5_MessageBrokers/Kafka/Readme.md)                                                  | Cluster of Topics (High-Throughput MQ)    |                     
| [Amazon RDS Clusters](../../2_AWSServices/6_DatabaseServices/AmazonRDS/MultiAZDeployment.md)             | Cluster of DB instances, across Multi-AZs |
| [Redis Cluster](../../3_DatabaseServices/In-Memory-Databases/Redis/RedisCluster.md)                             | Cluster of Redis Nodes (In-Memory Cache)  |
| [Amazon Elastic Cache Cluster](../../2_AWSServices/6_DatabaseServices/AmazonElasticCache/ClusterMode.md) | Cluster of Redis Nodes, across Multi-AZs  |
| [ElasticSearch Cluster](../../3_DatabaseServices/Search-Databases/ElasticSearch/ElasticSearchCluster.md) | Cluster of JSON Data, Indexes etc.        |
| [OpenSearch Cluster](../../2_AWSServices/6_DatabaseServices/AmazonOpenSearch.md)                         | Cluster of JSON Data, Indexes etc.        |
| [Casandra Cluster](../../3_DatabaseServices/NoSQL-Databases/WideColumnDB/ApacheCasandra.md)              | Cluster of wide-columns DBs               |
| [Hadoop Cluster](../../6_BigDataServices/ETLServices/BatchProcessing/ApacheHadoop)                       | Cluster of different components           |

# What is Cluster capacity?
- In general, a cluster (for ex. [Kubernates cluster](../../9_ContainerOrchestrationServices/Kubernates.md)) can be seen as abstracting a set of individual nodes as a big "super node".
- The total compute capacity (in terms of CPU and memory) of this super node is the sum of all the constituent nodes' capacities.