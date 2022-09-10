
# [Redis vs Memcache](https://www.devdude.com/memcached-vs-redis/)
- `Mostly Redis can be used in all scenarios.`
- `Redis is Single threaded` ( uses async. IO ) while MemCache is multi-threaded.
- MemCache only supports caching while `replication and persistence is supported in Redis` ( in addition to caching ).
- `Redis scales well horizontally` while Memcached benefits well on vertical scalability.
- `MemCache only supports String datatype`, while Redis supports multiple data types.

# References
- [Comparing Redis and Memcached](https://aws.amazon.com/elasticache/redis-vs-memcached/)