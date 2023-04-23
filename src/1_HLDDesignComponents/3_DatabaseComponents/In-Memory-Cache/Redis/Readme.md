# Introduction
- [Redis (REmote DIctionary Server)](https://redis.com/) is a popular in-memory data platform used as a cache that can be deployed on-premises, across clouds, and hybrid environments.
- One of the advantage of cache is to remember the result of an expensive operation, to speed uo the reads.
- [LRU is the default eviction policy](https://docs.redis.com/latest/rs/databases/configure/eviction-policy/) in redis

# Top Redis Use Cases

| Use Case                                                                                | Remarks                                                                                                                                                                |
|-----------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Caching](https://redis.com/solutions/use-cases/caching/)                               | -                                                                                                                                                                      |
| [Session Storage](https://redis.com/solutions/use-cases/session-management/)            | -                                                                                                                                                                      |
| [Distributed Locks](https://redis.io/docs/manual/patterns/distributed-locks/)           | [Twitter Hit Counter](../../../../3_HLDDesignProblems/TwitterHitCounterDesign/Readme.md)                                                                               |
| [Rate Limiting](https://redis.com/redis-best-practices/basic-rate-limiting/)            | [Rate Limiting in Distributed Systems](../../../../3_HLDDesignProblems/RateLimiterAPI/Readme.md)                                                                       |
| [Rank/Leaderboard using SortedSet](https://redis.com/solutions/use-cases/leaderboards/) | Example - Best sellers, ranking etc.                                                                                                                                   |
| [GeoSpatial](https://redis.io/docs/data-types/geospatial/)                              | Redis geospatial indexes let you store coordinates and search for them. This data structure is useful for finding nearby points within a given radius or bounding box. |
| [Queues](https://redis.com/solutions/use-cases/messaging/)                              | -                                                                                                                                                                      |

[Read more](https://www.youtube.com/watch?v=a4yX7RUgTxI)

# :star: Real world use cases of Redis Cache
- [Zomato - HLD Design](../../../../3_HLDDesignProblems/ZomatoDesign/README.md)
- [Twillo - Send Message API Design](../../../../3_HLDDesignProblems/TwilloSendMessageAPI/README.md)
- [AWS - Send-SMS-API design (App Internal Clients, Multiple SMS-Providers, AutoScaling)](../../../../3_HLDDesignProblems/NotificationSystem/README.md)

[Read more about Redis Use Cases](https://www.linkedin.com/posts/alexxubyte_systemdesign-coding-interviewtips-activity-7016444408438923264-_pmB?utm_source=share&utm_medium=member_desktop)

# Key Features of Redis

## Speed - 100K queries per second
- Since Redis uses in-memory for storage, it is very fast.
- It can execute [100K queries per second](https://docs.google.com/spreadsheets/d/15vApko2QrmZmv5qTEIyU_IAWvgY3MD23TR3TuLUiPc8/edit#gid=227251411).
- Mostly O(1) behavior, to get data from redis.
- Generally, [Redis is 5 times faster than database](../../../SystemEstimationTips.md#latency-comparison-numbers).

[![img.png](https://pbs.twimg.com/media/FMx3JZRUYAIWWKq?format=jpg&name=4096x4096)](https://www.youtube.com/watch?v=5TRFpFBccQM)

## Redis Transaction lock
- Using [Redis Transaction lock](https://redis.io/docs/reference/patterns/distributed-locks/), we can achieve [atomicity](../../../0_SystemGlossaries/Database/Atomicity.md) on the Redis operations (i.e. set/increase the key, add/remove elements from set, increase counter etc.).

## Multiple data types supported
- [Multiple data types](https://redis.io/docs/manual/data-types/) are supported in Redis

### Strings
- [Strings](https://www.w3resource.com/redis/redis-data-types.php) are Redis `most basic data type`.
- It is the only data type in Memcached, so it is also very natural for newcomers to use it in Redis.
- There are two ways to store JSON in Redis.
  - Option1 - `Stringify and then store JSON` in Redis, as string datatype
  - Option2 - Use [Redis JSON](https://redis.io/docs/stack/json/), which supports JSON value in Redis.
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
- Every member of a [Sorted Set](https://redis.io/docs/data-types/sorted-sets/) is associated with a score, that is used to keep the Sorted Set in order, from the smallest to the greatest score. 
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

## Rich Client-Side library
- PHP
- C/C++
- Go
- Java etc.

[Read more](https://redis.io/docs/libraries/)

## Data Persistence

It's generally suggested to turn off persistence on the master node, so that you get consistent low latency response time.
- No forking to disk will be done.
- No wasted I/O.

## Other Links
- [Master-Slave Replication Supported (Leader & Read Replicas)](RedisMasterSlaveReplication.md)
- [Sharding Supported (using Redis Cluster)](RedisCluster.md)
- [Redis vs Memcache](RedisVsMemCache.md)
- [Redis Graph](RedisGraph.md)

# References
- [Introduction To Redis](https://www.slideshare.net/dvirsky/introduction-to-redis)
- [Redis Interview Questions & Answers](https://www.javatpoint.com/redis-interview-questions-and-answers)
- [Top Redis Use Cases by Core Data Structure Types](https://scalegrid.io/blog/top-redis-use-cases-by-core-data-structure-types/)
- [What are Redis master-slave and Redis clusters and the difference between them?](https://www.learnsteps.com/what-are-redis-master-slave-and-redis-clusters-and-the-difference-between-them/)
- [Why Migrate a Dynomite Database to a Redis Enterprise Active-Active Database?](https://redis.com/blog/why-migrate-dynomite-database-to-redis-enterprise-active-active-database/)
- [AWS ElastiCache vs RDS ReadReplica](https://stackoverflow.com/questions/24728634/aws-elasticache-vs-rds-readreplica)
- [Design Cache](https://www.interviewbit.com/problems/design-cache/)