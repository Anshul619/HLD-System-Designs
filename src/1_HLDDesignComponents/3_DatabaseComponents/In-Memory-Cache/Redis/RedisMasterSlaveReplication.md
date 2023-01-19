# Master-Slave Replication (also known as Leader-Follower) Supported in Redis
- Redis supports [master-slave replication](../../../0_SystemGlossaries/Database/ReplicationAndDataConsistency.md).
- Master copy is maintained by master-slave and replicated to n other SLAVE nodes.

![img.png](https://i1.wp.com/www.learnsteps.com/wp-content/uploads/2020/07/masterslave.png?w=840&ssl=1)

# Advantages of Master-Slave replication

| Advantage                                                                                                                                                                              | Description                                                                                                                                                                                                      |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Deliver [High availability](../../../0_SystemGlossaries/Reliability/HighAvailability.md)                                                                                               | If master node goes down, the slave can be immediately promoted, so you don't experience any downtime.                                                                                                           |
| Increased [throughput](../../../0_SystemGlossaries/Scalability/LatencyThroughput.md) & improves [Scalability (Read Queries)](../../../0_SystemGlossaries/Scalability/DBScalability.md) | Under extremely high read load, you could balance the `reads between the master and slave`.<br/>- Although it would be recommended to setup up additional `no persistence, memory only` slaves for that purpose. |

- [Read more](https://redis.io/docs/manual/replication/)

# How to configure master-slave in Redis?
- To configure [basic Redis replication](https://redis.io/docs/manual/replication/) is trivial.
- Just add the following line to the replica configuration file `redis.conf`.
```
replicaof 192.168.1.1 6379
```
