# Introduction
- [Redis (REmote DIctionary Server)](https://redis.com/) is a popular in-memory data platform used as a cache that can be deployed on-premises, across clouds, and hybrid environments.

# General Use Cases

| Use Case                                                                          | Data Type          | Remarks                                                                                                                                                                                                      |
|-----------------------------------------------------------------------------------|--------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Caching](https://redis.com/solutions/use-cases/caching/)                         | All                | One of the advantage of cache is to remember the result of an expensive operation, to speed up the reads.                                                                                                    |
| [Session Storage](https://redis.com/solutions/use-cases/session-management/)      | All                | In order to address scalability and to provide a shared data storage for sessions that can be accessible from any individual web server, you can abstract the HTTP sessions from the web servers themselves. |
| [Distributed Locks](https://redis.io/docs/manual/patterns/distributed-locks/)     | Strings            | We can use a Redis string to acquire locks among distributed services.<br/>- Example - [Twitter Hit Counter](../../../0_UseCaseDesigns/HitCounterDesignTwitter/Readme.md)                                    |
| [Rate Limiting](../../../7_ArchitecturePatterns/Resilience/RateLimiting.md)       | All                | We can apply a rate limiter for certain user IPs.                                                                                                                                                            |
| [Rank/Leaderboard](https://redis.com/solutions/use-cases/leaderboards/)           | SortedSet          | We can use SortedSet to sort the articles.<br/>- Example - Best sellers, ranking etc.                                                                                                                        |
| [GeoSpatial](https://redis.io/docs/data-types/geospatial/)                        | GeoSpatial Indexes | Redis geospatial indexes let you store coordinates and search for them. <br/>- This data structure is useful for finding nearby points within a given radius or bounding box.                                |
| [Message Broker - PubSub model](https://redis.com/solutions/use-cases/messaging/) | Lists              | We can use List for a message queue (with [PubSub](https://redis.io/docs/interact/pubsub/) modal).                                                                                                           |
| Counter                                                                           | All                | We can count how many likes or how many reads for articles.                                                                                                                                                  |
| Calculate user retention                                                          | Bitmap             | We can use Bitmap to represent the user login daily and calculate user retention.                                                                                                                            |
| Shopping cart                                                                     | Hash               | We can use Redis Hash to represent key-value pairs in a shopping cart.                                                                                                                                       |
| Global ID generator                                                               | Int                | We can use Redis Int for global ID.                                                                                                                                                                          |

[Read more](https://www.youtube.com/watch?v=a4yX7RUgTxI)

# :star: Real world use cases of Redis Cache
- [Zomato - HLD Design](../../../0_UseCaseDesigns/FoodOrderingZomatoSwiggy/Readme.md)
- [Twillo Send Message API Design - HLD Design](../../../0_UseCaseDesigns/SendSMSMessageAPITwillo/Readme.md)
- [Transaction SMS - HLD Design](../../../../AWS-Services/0_UseCaseDesigns/TransactionSMSDesign/Readme.md)

# Key Features of Redis

| Supported features                                           | Remarks                                                                                                                                                                                                                                                                   |
|--------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Speed - 100K queries per second                              | Since Redis uses **in-memory** for storage, it is very fast. <br/>- Generally, [Redis is 5 times faster than database](../../../6_Estimations&Benchmarking/LatencyNumbers.md). <br/>- Mostly **O(1) behavior**, to get data from redis.                                   |
| Redis Value - Ideal Size                                     | The ideal size of redis value is less than [100 KB](https://stackoverflow.com/questions/55517224/what-is-the-ideal-value-size-range-for-redis-is-100kb-too-large).                                                                                                        |
| Transaction (atomicity)                                      | Using [Redis Transaction lock](https://redis.io/docs/reference/patterns/distributed-locks/), we can achieve [atomicity](../../1_ACID-Transactions/Atomicity.md) on the Redis operations (i.e. set/increase the key, add/remove elements from set, increase counter etc.). |
| Multiple data types                                          | [Multiple data types](DataTypes.md) are supported in Redis.                                                                                                                                                                                                               |
| [Rich Client-Side library](https://redis.io/docs/libraries/) | Go, Java, PHP, C/C++ etc.                                                                                                                                                                                                                                                 |
| [Single-Leader Replication](RedisLeaderFollowReplication.md) | This helps in both High-Availability and read-scalability of redis.                                                                                                                                                                                                       |
| [Sharding (using Redis Cluster)](RedisCluster.md)            | This helps in write scalability of redis.                                                                                                                                                                                                                                 |
| Data Persistence                                             | It's generally suggested to turn off persistence on the master node, so that you get consistent low latency response time.<br/>- No forking to disk will be done.<br/>- No wasted I/O.                                                                                    |
| LRU Eviction Policy                                          | [LRU is the default eviction policy](https://docs.redis.com/latest/rs/databases/configure/eviction-policy/) in redis.                                                                                                                                                     |
| Redis Pipelining                                             | Redis pipelining is a technique for improving performance by issuing multiple commands at once without waiting for the response to each individual command. <br/>- [Read more](https://redis.io/docs/latest/develop/use/pipelining/)                                      |
| [Redis vs Memcache](../RedisVsMemcache.md)                   |                                                                                                                                                                                                                                                                           |

# References
- [Redis - Glossary Terms](https://redis.com/glossary/)
- [Introduction To Redis](https://www.slideshare.net/dvirsky/introduction-to-redis)
- [Redis Interview Questions & Answers](https://www.javatpoint.com/redis-interview-questions-and-answers)
- [Top Redis Use Cases by Core Data Structure Types](https://scalegrid.io/blog/top-redis-use-cases-by-core-data-structure-types/)
- [What are Redis master-slave and Redis clusters and the difference between them?](https://www.learnsteps.com/what-are-redis-master-slave-and-redis-clusters-and-the-difference-between-them/)
- [Why Migrate a Dynomite Database to a Redis Enterprise Active-Active Database?](https://redis.com/blog/why-migrate-dynomite-database-to-redis-enterprise-active-active-database/)
- [AWS ElastiCache vs RDS ReadReplica](https://stackoverflow.com/questions/24728634/aws-elasticache-vs-rds-readreplica)
- [Design Cache](https://www.interviewbit.com/problems/design-cache/)
- [ByteByteGo - System Design: Why is single-threaded Redis so fast?](https://www.youtube.com/watch?v=5TRFpFBccQM)
- [Achieve over 500 million requests per second per cluster with Amazon ElastiCache for Redis 7.1](https://aws.amazon.com/blogs/database/achieve-over-500-million-requests-per-second-per-cluster-with-amazon-elasticache-for-redis-7-1/)