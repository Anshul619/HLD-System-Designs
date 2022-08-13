# [Server Cluster](https://www.racksolutions.com/news/blog/server-cluster-how-it-works/)
- A server cluster consists of a group of servers working simultaneously under a single IP address.
- Server clustering also ensures [higher availability](HighAvailability.md), proper load balancing and [System Scalability](Scalability.md).

![img.png](../10_Others_assests/server_cluster_img.png)

# Examples
- [Redis Cluster](../5_Redis#sharding-supported-using-redis-cluster)
- [Kafka Cluster](../4_MessageBrokers/Kafka.md#basic-architecture-of-kafka-cluster)
- [ElasicSearch Cluster](../3_DatabaseComponents/ElasticSearch#elasticsearch-cluster)

## Fail over Policies

### Active-Active policy
- An active-active cluster is typically made up of at least two nodes, both actively running the same kind of service simultaneously.

### Active-Passive policy
- Not all nodes are going to be active at the same time.
- In the case of two nodes, for example, if the first node is already active, the second node must be passive or on standby.