# Partitioning
- For very large datasets, or very high query throughput, replication is not sufficient - we need to break the data up into partitions, also known as sharding.
- Instead of one shard for writes, we partition/shard the database based on a partition key. 
- This would increase query throughput and overall system write throughput.

Note - This partitioning is nothing related to network partition (in [CAP Theorem](CAPTheorem.md)).

# Key Terminologies

| Terminology   | Description                                                                                                                                    | Examples                                       |
|---------------|------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------|
| Partition Key | Partitioning would be done based on a partition key. <br/>- We need to carefully choose this key to distribute the data evenly b/w partitions. | User ID, Location ID, Photo ID etc.            |
| Hash Function | Hash function helps to determine the paritition for a given key.                                                                               | [Casandra](../../3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md), [MongoDB](../../3_DatabaseComponents/NoSQL-Databases/MongoDB/Readme.md) uses MD5 as a hash function. |
|               |                                                                                                                                                |                                                |
|               |                                                                                                                                                |                                                |

# Supported Clusters
- [Kafka Cluster](../../4_MessageBrokers/Kafka/Readme.md)
- [Redis Cluster](../../3_DatabaseComponents/In-Memory-Cache/Redis/RedisCluster.md)
- [Amazon Elastic Cache Cluster](../../../2_AWSComponents/6_DatabaseServices/AmazonElasticCache.md#redis-cluster-mode-disabled-vs-redis-cluster-mode-enabled)
- [ElasticSearch Cluster](../../3_DatabaseComponents/Search-Indexes/ElasticSearch/ElasticSearchCluster.md) etc.

# Partitioning & Leader-follower Replication

## Kafka Cluster

![](../../4_MessageBrokers/assests/Kafka-Architecture.drawio.png)

## ElasticSearch Cluster

![](../../3_DatabaseComponents/Search-Indexes/ElasticSearch/assests/ElasticSearch-Cluster.png)

## Redis Cluster

![](https://i1.wp.com/www.learnsteps.com/wp-content/uploads/2020/07/cluster.png?w=840&ssl=1)

## Elastic Cache Cluster

![](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/images/ElastiCache-Cluster-Redis.png)