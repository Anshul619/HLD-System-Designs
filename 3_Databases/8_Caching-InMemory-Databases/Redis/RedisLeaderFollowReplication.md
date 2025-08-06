# Redis Replication - Leader-follower technique
- Redis supports [leader-follower replication](https://redis.io/docs/manual/replication/).
- Leader (master) copy is maintained by [leader-follower (master-slave)](../../4_Consistency-Replication/SingleLeaderReplication.md) and replicated to n other follower (slave) nodes.
- [Redis Replication supported in Amazon Elastic Cache](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonElasticCache/Readme.md).

![img.png](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonElasticCache/assets/ElasticCache-Multi-AZ.drawio.png)

# Advantages of Replication

| Advantage                                                             | Description                                                                                                                                                                                                           |
|-----------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [High availability](../../../7a_HighAvailability/Readme.md)           | If leader node goes down, the follower can be immediately promoted, so you don't experience any downtime.                                                                                                             |
| [Scalability (Read Queries)](../../3_Scalability-Techniques/Readme.md) | Under extremely high read load, you could balance the `reads between the master and follower`.<br/>- Although it would be recommended to setup up additional `no persistence, memory only` follower for that purpose. |

# How to configure replication in Redis?
- Just add the following line to the replica configuration file `redis.conf`.

```
replicaof 192.168.1.1 6379
```
