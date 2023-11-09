# Redis Replication - Leader-follower technique
- Redis supports [leader-follower replication](https://redis.io/docs/manual/replication/).
- Leader (master) copy is maintained by [leader-follower (master-slave)](../../Glossaries/Consistency&Replication/Replication.md) and replicated to n other follower (slave) nodes.
- [Redis Replication supported in Amazon Elastic Cache](../../../2_AWSServices/6_DatabaseServices/AmazonElasticCache/Readme.md).

![img.png](../../../2_AWSServices/6_DatabaseServices/AmazonElasticCache/assets/ElasticCache-Multi-AZ.drawio.png)

# Advantages of Replication

| Advantage                                                                        | Description                                                                                                                                                                                                           |
|----------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [High availability](../../../3_SystemGlossaries/Reliability/HighAvailability.md) | If leader node goes down, the follower can be immediately promoted, so you don't experience any downtime.                                                                                                             |
| [Scalability (Read Queries)](../../Glossaries/ScalabilityDB.md)                  | Under extremely high read load, you could balance the `reads between the master and follower`.<br/>- Although it would be recommended to setup up additional `no persistence, memory only` follower for that purpose. |

# How to configure replication in Redis?
- Just add the following line to the replica configuration file `redis.conf`.

```
replicaof 192.168.1.1 6379
```
