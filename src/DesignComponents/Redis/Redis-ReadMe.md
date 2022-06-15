
# Key Features of Redis

## Speed - 100K queries per second
- Redis is very fast. It can execute 100K queries per second.
- Since Redis uses in-memory for storage, it is very fast.

## Atomicity - Redis Transaction lock
- Using [RedisTransaction](https://redis.io/docs/reference/patterns/distributed-locks/) lock, we can achieve atomicity on the Redis operations (i.e. set/increase the key, add/remove elements from set, increase counter etc.).

## Multiple data types supported
- [Various data types](https://redis.io/docs/manual/data-types/) like string, hashes, sets, lists, sorted sets etc. are supported in Redis.

## Supported Master-Slave Replication
- Redis supports master-slave replication.
- Master copy is maintained by master-slave and replicated to n other nodes.

## Sharding is supported in Redis

# What is Redis default eviction policy?
- [volatile-lru](https://docs.redis.com/latest/rs/databases/configure/eviction-policy/) - Removes least recently used keys with expire field set to true.

# Which redis data type should be used?
- If we use Redis String ( key, value ) pairs, we would have to do typecast everytime.
- Hence it would be preferred to use Redis Set data type to store JSON values in the Redis.
- The time complexity to get an element from Redis Set would be O(1). ( In case of nested object, time complexity would be more )

# [Redis vs Memcache](https://www.devdude.com/memcached-vs-redis/)
- Mostly Redis can be used in all scenarios.
- Redis is single threaded while memcache is multi-threaded.
- Memcache only supports caching while replication and persistence is supported in Redis ( in addition to caching ).

# References
- https://www.javatpoint.com/redis-interview-questions-and-answers
