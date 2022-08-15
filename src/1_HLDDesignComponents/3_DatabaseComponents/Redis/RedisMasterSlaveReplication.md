
# [Master-Slave Replication Supported](https://redis.io/docs/manual/replication/)
- Redis supports `master-slave replication`.
- `Master copy` is maintained by master-slave and replicated to `n other SLAVE` nodes.

![img.png](https://i1.wp.com/www.learnsteps.com/wp-content/uploads/2020/07/masterslave.png?w=840&ssl=1)

## [Advantages of Master-Slave replication](https://www.quora.com/Whats-the-point-of-master-slave-replication-in-Redis)
- `Turn off persistence on the master node`, so that you get consistent low latency response time.
    - No forking to disk will be done.
    - No wasted I/O.
- Deliver [High availability](../../0_SystemGlossaries/HighAvailability.md)
    - If master node goes down, the slave can be immediately promoted, so you don't experience any downtime.
- Increased [throughput](../../0_SystemGlossaries/LatencyThroughput.md) & improves [Scalability ( Read Queries )](../../0_SystemGlossaries/Scalability.md)
    - Under extremely high read load, you could balance the `reads between the master and slave`.
    - Although it would be recommended to setup up additional `no persistence, memory only` slaves for that purpose.

## [How to configure master-slave in Redis?](https://redis.io/docs/manual/replication/)
- To configure basic Redis replication is trivial.
- Just add the following line to the replica configuration file `redis.conf`.
```
replicaof 192.168.1.1 6379
```
