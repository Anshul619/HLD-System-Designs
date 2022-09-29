
# Amazon Elastic Cache
- [Amazon Elastic Cache](https://aws.amazon.com/elasticache/) is a [fully Managed Memcached or Redis](../../1_HLDDesignComponents/3_DatabaseComponents/In-Memory-Cache/Redis).
- Scale from one to many nodes, using [Cluster](../../1_HLDDesignComponents/0_SystemGlossaries/ServersCluster.md).
- Self-healing ( automatically replaces dead instance )
- [Single-digit millisecond speed](../../1_HLDDesignComponents/0_SystemGlossaries/LatencyThroughput.md) (usually).
- [Multi-AZ deployments for availability](../AWS-Global-Architecture-Region-AZ.md).
- [How to use ElasticCache for Redis?](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Replication.Redis-RedisCluster.html)

![img.png](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/images/ElastiCache-Cluster-Redis.png)

# Redis (Cluster Mode Disabled) vs. Redis (Cluster Mode Enabled)

| Feature                       | [Redis (cluster mode disabled)](../../1_HLDDesignComponents/3_DatabaseComponents/In-Memory-Cache/Redis/RedisMasterSlaveReplication.md)     | [Redis (cluster mode enabled)](../../1_HLDDesignComponents/3_DatabaseComponents/In-Memory-Cache/Redis/RedisCluster.md)                                          |
|-------------------------------|----------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| Modifiable                    | Yes. Supports adding and deleting replica nodes, and scaling up node type. | [Limited](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/scaling-redis-cluster-mode-enabled.html) |
| Data Sharding                 | No                                                                         | Yes                                                                                                            |
| Shards                        | 1                                                                          | 1 to 500                                                                                                       |
| Read Replicas                 | 0 to 5                                                                     | 0 to 5 per shard                                                                                               |
| HA - Multi-AZ                 | Yes, with at least 1 replica. Optional. On by default                      | Yes. Optional. On by default.                                                                                  |
| Snapshots (Backups & Restore) | Yes, single .rdb file                                                      | Yes, unique .rdb file for each shard                                                                           |

