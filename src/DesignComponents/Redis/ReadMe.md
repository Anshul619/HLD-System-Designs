
# Key Features of Redis

## Speed - 100K queries per second
- Redis is very fast. It can execute `100K queries` per second.
- Since Redis uses in-memory for storage, it is very fast.

## [Atomicity - Redis Transaction lock](https://redis.io/docs/reference/patterns/distributed-locks/)
- Using `RedisTransaction` lock, we can achieve atomicity on the Redis operations (i.e. set/increase the key, add/remove elements from set, increase counter etc.).

## [Multiple data types supported](https://redis.io/docs/manual/data-types/)

### [Strings](https://www.w3resource.com/redis/redis-data-types.php)

- Strings are Redis `most basic data type`.
- It is the only data type in Memcached, so it is also very natural for newcomers to use it in Redis.

```
127.0.0.1:6379>  SET newkey "the redis string"
OK
127.0.0.1:6379> GET newkey
"the redis string"
```

### Hashes
- `Redis Hashes` are maps between `string fields` and `string values`, so they are the perfect data type to represent objects (e.g. A User with a number of fields like name, surname, age, and so forth).

```
HMSET user:1000 username antirez password P1pp0 age 34
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

### Sorted sets etc.
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

## [Master-Slave Replication Supported](https://redis.io/docs/manual/replication/)
- Redis supports `master-slave replication`.
- Master copy is maintained by master-slave and replicated to n other SLAVE nodes.

### [How to configure master-slave in Redis?](https://redis.io/docs/manual/replication/)

- To configure basic Redis replication is trivial.
- Just add the following line to the replica configuration file `redis.conf`.

```
replicaof 192.168.1.1 6379
```

## [Rich Client-Side library](https://redis.io/docs/libraries/)
- PHP
- C/C++
- Go
- Java etc.

## [Sharding is supported in Redis](https://redis.io/docs/manual/scaling/)
- Redis scales `horizontally with a deployment topology` called `Redis Cluster`.
- What do you get with `Redis Cluster`?
  - The ability to automatically split your dataset among multiple nodes.
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

# [LRU - default eviction policy in Redis](https://docs.redis.com/latest/rs/databases/configure/eviction-policy/)
- `volatile-lru` - The least recently used keys would be removed with expire field set to true.

# [Redis vs Memcache](https://www.devdude.com/memcached-vs-redis/)
- `Mostly Redis can be used in all scenarios`
- Redis is single threaded while memcache is multi-threaded.
- Memcache only supports caching while replication and persistence is supported in Redis ( in addition to caching ).
- Memcache only supports `String` datatype.

# References
- [Redis Interview Questions & Answers](https://www.javatpoint.com/redis-interview-questions-and-answers)
- [Top Redis Use Cases by Core Data Structure Types](https://scalegrid.io/blog/top-redis-use-cases-by-core-data-structure-types/)