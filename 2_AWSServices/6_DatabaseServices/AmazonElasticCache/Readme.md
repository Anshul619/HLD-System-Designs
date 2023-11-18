# Amazon Elastic Cache
- [Amazon Elastic Cache](https://aws.amazon.com/elasticache/) is a [fully Managed Memcached or Redis](../../../3_DatabaseServices/In-Memory-Databases/Redis/Readme.md).
- Scale from one to many nodes, using [Cluster](../../../7_PropertiesDistributedSystem/Scalability/ServersCluster.md) and self-heal (automatically replaces dead instance).
- It provides [single-digit millisecond speed (usually)](../../../7_PropertiesDistributedSystem/Scalability/LatencyThroughput.md).

![img.png](assets/ElasticCache-Multi-AZ.drawio.png)

# Features

| Feature                                                                                     | Remarks                                                                                                                                                                                                 |
|---------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Multi-AZ                                                                                    | If Multi-AZ is enabled, replicas would be created in different AZs.<br/>- Can be enabled only if there is atleast 1 replica.                                                                            |
| Auto-failover                                                                               | If Auto-failover is enabled, most up-to-date replica would be promoted as primary in case of primary failure.<br/>- Can be enabled only if there is atleast 1 replica.                                  |
| [Replication - Cluster mode](ClusterMode.md)                                                | If cluster-mode is enabled, sharding would happen.                                                                                                                                                      |
| [Redis AUTH command](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html) | Redis authentication tokens, or passwords, enable Redis to require a password before allowing clients to run commands, thereby improving data security.<br/>- IAM Auth is not supported by ElastiCache. |

# Caching strategies

| Strategy                                                                                            | Description                                                                                                                                                                                | Read-Performance           |
|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------|
| :star: [Write-through](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/Strategies.html) | The [write-through strategy](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/Strategies.html) adds data or updates data in the cache whenever data is written to the database. | Better than "lazy-loading" |
| [Lazy loading](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/Strategies.html)         | [Lazy loading](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/Strategies.html) is a caching strategy that loads data into the cache only when necessary.                      | -                          |

# References
- [Benefits of Fully Managed Redis](https://aws.amazon.com/elasticache/redis/fully-managed-redis/)
- [Connect to the cluster's node](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/GettingStarted.ConnectToCacheNode.html)
- [Mitigating Failures](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/FaultTolerance.html)
- [AWS Redis cluster mode - what is the difference between Auto-failover and Multi-AZ flag?](https://stackoverflow.com/questions/69105387/aws-redis-cluster-mode-what-is-the-difference-between-auto-failover-and-multi)