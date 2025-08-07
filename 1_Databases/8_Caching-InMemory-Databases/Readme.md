# Caching
- Caches take advantage of the locality of reference principle: recently requested data is likely to be requested again.
- They are used in almost every computing layer: hardware, operating systems, web browsers, web applications, and more.
- A cache is like a short-term memory: it has a limited amount of space, but is typically faster than the original data source and contains the most recently accessed items.

# Caching strategies

| Strategy                                                                                                 | Ideal Use Case  | Limitation                | Tag         | Description                                                                               |
|----------------------------------------------------------------------------------------------------------|-----------------|---------------------------|-------------|-------------------------------------------------------------------------------------------|
| [Read-through/Lazy loading](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/Strategies.html) | Write-heavy app | Few cache misses on reads | Mostly-used | Its a caching strategy that loads data into the cache only when necessary (i.e. on read). |
| [Write-through](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/Strategies.html)             | Read-heavy app  | Increases write latency   |             | It adds or updates data in the cache whenever data is written to the database.            |

# Challenges

|                    | Description                                                                                                                   |
|--------------------|-------------------------------------------------------------------------------------------------------------------------------|
| Cache Invalidation | While caching is fantastic, it requires some maintenance to keep the cache coherent with the source of truth (e.g. database). |

# Cache Eviction Policies
- LRU ( Least Recently Used ) - Default, Most popular. The element evicted is the ones which has the oldest last access time.
- First In First Out (FIFO)
- Last In First Out (LIFO)
- LFU ( Least Frequently Used )

