# Redis (Cluster Mode Disabled) vs. Redis (Cluster Mode Enabled)

| Feature                       | [Redis (cluster mode disabled)](../../../6_DatabaseServices/In-Memory-DB/Redis/RedisLeaderFollowReplication.md) | [Redis (cluster mode enabled)](../../../6_DatabaseServices/In-Memory-DB/Redis/RedisCluster.md) |
|-------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|
| Modifiable                    | :white_check_mark: Yes. Supports adding and deleting replica nodes, and scaling up node type.                                             | [Limited](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/scaling-redis-cluster-mode-enabled.html)            |
| Data Sharding                 | :x: No                                                                                                                                    | :white_check_mark: Yes                                                                                                    |
| Shards                        | 1                                                                                                                                         | 1 to 500                                                                                                                  |
| Read Replicas                 | 0 to 5                                                                                                                                    | 0 to 5 per shard                                                                                                          |
| Multi-AZ                      | :white_check_mark: Yes, with at least 1 replica.                                                                                          | :white_check_mark: Yes, Multi-AZ is ON by default.                                                                        |
| Snapshots (Backups & Restore) | :white_check_mark: Yes, single .rdb file                                                                                                  | :white_check_mark: Yes, unique .rdb file for each shard.                                                                  |

[Read more](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Replication.Redis-RedisCluster.html)

# References
- [Mitigating Failures](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/FaultTolerance.html)