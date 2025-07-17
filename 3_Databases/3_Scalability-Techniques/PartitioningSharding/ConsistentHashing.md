# Consistent Hashing
- Consistent Hashing maps data to physical nodes and ensures that only a small set of keys move when servers are added or removed.
- Consistent Hashing stores the data managed by a distributed system in a ring. Each node in the ring is assigned a range of data. Here is an example of the consistent hash ring:

# Problems
- Adding or removing nodes: Adding or removing nodes will result in recomputing the tokens causing a significant administrative overhead for a large cluster.
- Hotspots: Since each node is assigned one large range, if the data is not evenly distributed, some nodes can become hotspots.
- Node rebuilding: Since each node’s data might be replicated (for fault-tolerance) on a fixed number of other nodes, when we need to rebuild a node, only its replica nodes can provide the data. This puts a lot of pressure on the replica nodes and can lead to service degradation.

# Consistent Hashing - Virtual nodes
- Instead of assigning a single token to a node, the hash range is divided into multiple smaller ranges, and each physical node is assigned several of these smaller ranges.
- Each of these subranges is considered a Vnode.
- With Vnodes, instead of a node being responsible for just one token, it is responsible for many tokens (or subranges).

![](consistent_sharding.png)

# References
- [A Guide to Consistent Hashing](https://www.toptal.com/big-data/consistent-hashing)
- [ByteByteGo - Consistent Hashing | Algorithms You Should Know #1](https://www.youtube.com/watch?v=UF9Iqmg94tk)   