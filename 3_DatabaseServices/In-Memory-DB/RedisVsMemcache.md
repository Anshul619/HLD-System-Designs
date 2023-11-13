
# Redis vs Memcache

|                                                          | [Redis](Redis/Readme.md) | [Memcache](https://memcached.org/) |
|----------------------------------------------------------|--------------------------|------------------------------------|
| Multi-Threaded?                                          | :x: No (uses async. IO)  | :white_check_mark: Yes             |
| Caching Feature                                          | :white_check_mark: Yes   | :white_check_mark: Yes             |
| Replication (for high availability/Multi-AZ deployments) | :white_check_mark: Yes   | :x: No                             |
| Persistence                                              | :white_check_mark: Yes   | :x: No                             |
| Scalability                                              | :+1: Horizontally        | :-1: Vertically                    |
| Supported Data-types                                     | :+1: Multiple datatypes  | :-1: String datatype only          |

[Read more](https://www.devdude.com/memcached-vs-redis/))

# References
- [Comparing Redis and Memcached](https://aws.amazon.com/elasticache/redis-vs-memcached/)