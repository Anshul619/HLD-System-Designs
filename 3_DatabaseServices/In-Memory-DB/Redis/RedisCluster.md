# Sharding Supported (using Redis Cluster)
- Redis scales horizontally with a deployment topology called [Redis Cluster](https://redis.io/docs/manual/scaling/).
- [Redis cluster supported in Amazon Elastic Cache](../../../11_AWSServices/6_DatabaseServices/AmazonElasticCache/Readme.md).

![img.png](https://i1.wp.com/www.learnsteps.com/wp-content/uploads/2020/07/cluster.png?w=840&ssl=1)

# Advantages of Redis Cluster
- The ability to automatically `split your dataset` among multiple nodes.
- The ability to continue operations when a subset of the nodes are experiencing failures or are unable to communicate with the rest of the cluster.

# How to enable Redis Cluster?
- Go to [redis.conf](https://redis.io/docs/manual/scaling/) file and add following lines.

```
port 7000
cluster-enabled yes
cluster-config-file nodes.conf
cluster-node-timeout 5000
appendonly yes
```