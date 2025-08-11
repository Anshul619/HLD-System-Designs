
# Redis vs Memcache

| Feature                                                  | [Redis](Redis/Readme.md) | [Memcache](https://memcached.org/) |
|----------------------------------------------------------|--------------------------|------------------------------------|
| Multi-Threading                                          | :x: No (uses async. IO)  | :white_check_mark: Yes             |
| Caching Feature                                          | :white_check_mark: Yes   | :white_check_mark: Yes             |
| Replication (for high availability/Multi-AZ deployments) | :white_check_mark: Yes   | :x: No                             |
| Persistence                                              | :white_check_mark: Yes   | :x: No                             |
| Scalability                                              | :+1: Horizontal          | :-1: Vertical                      |
| Supported Data-types                                     | :+1: Multiple datatypes  | :-1: String datatype only          |

[Read more](https://www.devdude.com/memcached-vs-redis/)

# References
- [Comparing Redis and Memcached](https://aws.amazon.com/elasticache/redis-vs-memcached/)