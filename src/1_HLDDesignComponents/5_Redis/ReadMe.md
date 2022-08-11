
# Introduction
- Popular in-memory data platform used as a cache that can be deployed on-premises, across clouds, and hybrid environments.
- LRU is the [default eviction policy](https://docs.redis.com/latest/rs/databases/configure/eviction-policy/) in redis

# Key Features of Redis ( REmote DIctionary Server)

## Speed - 100K queries per second
- Redis is very fast. It can execute `100K queries per second`.
- Since Redis uses in-memory for storage, it is very fast.
- Mostly `O(1)` behavior, to get data from redis.

[![img.png](https://pbs.twimg.com/media/FMx3JZRUYAIWWKq?format=jpg&name=4096x4096)](https://www.youtube.com/watch?v=5TRFpFBccQM)

## [Atomicity - Redis Transaction lock](https://redis.io/docs/reference/patterns/distributed-locks/)
- Using `RedisTransaction` lock, we can achieve atomicity on the Redis operations (i.e. set/increase the key, add/remove elements from set, increase counter etc.).

## [Multiple data types supported](https://redis.io/docs/manual/data-types/)

### [Strings](https://www.w3resource.com/redis/redis-data-types.php)
- Strings are Redis `most basic data type`.
- It is the only data type in Memcached, so it is also very natural for newcomers to use it in Redis.
- There are two ways to store JSON in Redis.
  - Option1 - `Stringify and then store JSON` in Redis, as string datatype
  - Option2 - Use [RedisJSON](https://redis.io/docs/stack/json/), which supports JSON value in Redis.
- Commands
  - `SET <KEY> <VALUE>`
  - `GET <KEY>`

```
SET newkey "the redis string"
> OK
GET newkey
> "the redis string"
MGET foo bar
> 1. "a"
> 2. "b"
```

### Hashes
- `Redis Hashes` are maps between `string fields` and `string values`, so they are the perfect data type to `represent objects` (e.g. A User with a number of fields like name, surname, age, and so forth).
```
HSET user:1000 username antirez password P1pp0 age 34
HGETALL user:1000
HSET user:1000 password 12345
HGETALL user:1000
```

### Sets
- Redis Sets are an unordered collection of Strings
- It is possible to add, remove, and test for existence of members in `O(1)` (constant time regardless of the number of elements contained inside the Set).
- Practically speaking this means that adding a member does not require a check if exists then add operation.

### Lists
- Redis Lists are simply lists of strings, sorted by `insertion order`.
- It is possible to add elements to a Redis List pushing new elements on the head (on the left) or on the tail (on the right) of the list.
- The main features of Redis Lists from the point of view of time complexity are the `support for constant time ( O(1) ) insertion and deletion of elements near the head and tail`, even with many millions of inserted items.
- Accessing elements is very fast near the extremes of the list but is slow if you try accessing the middle of a very big list, as it is an O(N) operation.

```
LPUSH mylist a   # now the list is "a"
LPUSH mylist b   # now the list is "b","a"
RPUSH mylist c   # now the list is "b","a","c" (RPUSH was used this time)
```

### Sorted sets
- Every member of a Sorted Set is associated with a score, that is used to keep the Sorted Set in order, from the smallest to the greatest score. 
- While members are unique, scores may be repeated.

```
redis 127.0.0.1:6379> zadd w3resourcelist 0 redis
(integer) 1
redis 127.0.0.1:6379> zadd w3resourcelist 0 mongodb
(integer) 1
redis 127.0.0.1:6379> zadd w3resourcelist 0 rabitmq
(integer) 1
redis 127.0.0.1:6379> zadd w3resourcelist 0 rabitmq
(integer) 0
redis 127.0.0.1:6379> ZRANGEBYSCORE w3resourcelist 0 1000

1) "redis"
2) "mongodb"
3) "rabitmq"
```

### [Redis Graph](https://redis.com/nosql/graph-databases/)
- Graph database from Redis
- Use Cases for graph database
  - Social networks, logistics & spatial data
  - Fraud detection & analytics
  - Product-recommendation engine
  - Identity and access management

## [HA - Master-Slave Replication Supported](https://redis.io/docs/manual/replication/)
- Redis supports `master-slave replication`.
- `Master copy` is maintained by master-slave and replicated to `n other SLAVE` nodes.

![img.png](https://i1.wp.com/www.learnsteps.com/wp-content/uploads/2020/07/masterslave.png?w=840&ssl=1)

### [Advantages of Master-Slave replication](https://www.quora.com/Whats-the-point-of-master-slave-replication-in-Redis)
- Turn off persistence on the master node, so that you get consistent low latency response time. No forking to disk will be done. No wasted I/O.
- Deliver `High availability`
  - If master node goes down, the slave can be immediately promoted, so you don't experience any down time.
- Increased throughput
  - Under extremely high load, you could balance the `reads between the master and slave`. 
  - Although it would be recommended to setup up additional `no persistence, memory only` slaves for that purpose.

### [How to configure master-slave in Redis?](https://redis.io/docs/manual/replication/)
- To configure basic Redis replication is trivial.
- Just add the following line to the replica configuration file `redis.conf`.
```
replicaof 192.168.1.1 6379
```

## [Scaling - Sharding supported, using Redis Cluster](https://redis.io/docs/manual/scaling/)
- Redis scales `horizontally with a deployment topology called Redis Cluster`.

![img.png](https://i1.wp.com/www.learnsteps.com/wp-content/uploads/2020/07/cluster.png?w=840&ssl=1)

### Advantages of Redis Cluster
- The ability to automatically `split your dataset` among multiple nodes.
- The ability to continue operations when a subset of the nodes are experiencing failures or are unable to communicate with the rest of the cluster.

### [How to enable Redis Cluster?](https://redis.io/docs/manual/scaling/)
- Go to `redis.conf` file and add following lines
```
port 7000
cluster-enabled yes
cluster-config-file nodes.conf
cluster-node-timeout 5000
appendonly yes
```

## [Rich Client-Side library](https://redis.io/docs/libraries/)
- PHP
- C/C++
- Go
- Java etc.

# [Redis vs Memcache](RedisVsMemCache.md)

# References
- [Introduction To Redis](https://www.slideshare.net/dvirsky/introduction-to-redis)
- [Redis Interview Questions & Answers](https://www.javatpoint.com/redis-interview-questions-and-answers)
- [Top Redis Use Cases by Core Data Structure Types](https://scalegrid.io/blog/top-redis-use-cases-by-core-data-structure-types/)
- [What are Redis master-slave and Redis clusters and the difference between them?](https://www.learnsteps.com/what-are-redis-master-slave-and-redis-clusters-and-the-difference-between-them/)