
# Rate Limiting in Distributed Systems

[Rate limiting](https://medium.com/geekculture/system-design-basics-rate-limiter-351c09a57d14) refers to preventing the frequency of an operation from exceeding a defined limit. 
- In large-scale systems, rate limiting is commonly used to protect underlying services and resources. 
- Rate limiting is generally used as a defensive mechanism in distributed systems, so that shared resources can maintain availability.
- [AWS WAF](../../2_AWSComponents/2_SecurityAndIdentityServices/AWSWAF.md) can be used to rate limit the APIs in AWS.

![img.png](assets/what-is-rate-limiting.png)

# Distributed Rate limiter implementation for an API
- In distributed systems, Rate limit can be implemented using [Redis ( as centralized data store, to solve inconsistency problem )](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis/README.md)
- Redis would have count of requests, per IP.

![img.png](assets/HLD%20-%20RateLimiter.drawio.png)

## How would it work?
- When a request is made, a new temporary record is stored in [Redis](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis/README.md). 
- This record is defined by the IP address of the request and will expire.
- If a second request is made before the first expires, the record count is incremented.
- For each request made within the rate limit window, the record is incremented.
- If the record count reaches the max limit before expiring, then a 429 error status is returned.

````json
{
  "192.168.4.1": 10,
  "192.168.5.3": 20
}
````

## Two Major Issues

### Inconsistency
- Using the consistent data store ( like [Redis](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis/README.md), [Cassandra](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md) ), we can solve inconsistency problem of current rate limiting in distributed systems.
- This would add a bit of latency.

### Race Conditions
- To solve the race condition while updating the counter in [Redis](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis/README.md), we would have to apply [transaction locks on the read-write operation](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis/README.md#redis-transaction-lock).
- This would make the [counter update as atomic](../../1_HLDDesignComponents/0_SystemGlossaries/Atomicity.md) in Redis.
- But this comes at a performance cost ( as latency would increase ).

## References
- [Groking the system design - Designing an API Rate Limiter](https://akshay-iyangar.github.io/system-design/grokking-system-design/system-design-problems/api-rate-limiter.html)
- [System Design Basics: Rate Limiter](https://medium.com/geekculture/system-design-basics-rate-limiter-351c09a57d14)
- [How Redis can work for Rate Limit](https://github.com/jwerre/rate-limit-redis)
