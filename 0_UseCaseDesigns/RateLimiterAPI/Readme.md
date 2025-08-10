# Rate Limiting in Distributed Systems

# Functional Requirements
- Limit the number of requests an entity can send to an API within a time window, e.g., 15 requests per second.
- The APIs are accessible through a cluster, so the rate limit should be considered across different servers. 
- The user should get an error message whenever the defined threshold is crossed within a single server or across a combination of servers.

# Non-functional requirements:
- The system should be highly available. The rate limiter should always work since it protects our service from external attacks.
- Our rate limiter should not introduce substantial latencies affecting the user experience.

# High level design for Rate Limiter

Rate Limiter will be responsible for deciding which request will be served by the API servers and which request will be declined.
- Once a new request arrives, the Web Server first asks the Rate Limiter to decide if it will be served or throttled.
- If the request is not throttled, then it’ll be passed to the API servers.

For each unique user, we would keep a count representing how many requests the user has made and a timestamp when we started counting the requests.

# Distributed Rate limiter implementation for an API
- In distributed systems, Rate limit can be implemented using [Redis (as centralized data store, to solve inconsistency problem)](../../1_Databases/8_Caching-InMemory-Databases/Redis/Readme.md)

![img.png](assets/HLD%20-%20RateLimiter.drawio.png)

Note:
- If we are using [Redis](../../1_Databases/8_Caching-InMemory-Databases/Redis/Readme.md) to store our key-value, one solution to resolve the atomicity problem is to use [Redis lock](../../1_Databases/8_Caching-InMemory-Databases/Redis/Readme.md) for the duration of the read-update operation.
- This, however, would come at the expense of slowing down concurrent requests from the same user and introducing another layer of complexity

# Should we rate limit by IP or by user?

## Rate limit by IP
- In this scheme, we throttle requests per-IP; although it’s not optimal in terms of differentiating between ‘good’ and ‘bad’ actors, it’s still better than not have rate limiting at all. 
- The biggest problem with IP based throttling is when multiple users share a single public IP like in an internet cafe or smartphone users that are using the same gateway. 
- One bad user can cause throttling to other users. 
- Another issue could arise while caching IP-based limits, as there are a huge number of IPv6 addresses available to a hacker from even one computer, it’s trivial to make a server run out of memory tracking IPv6 addresses!

## Rate limit by user
- Rate limiting can be done on APIs after user authentication. 
- Once authenticated, the user will be provided with a token which the user will pass with each request. 
- This will ensure that we will rate limit against a particular API that has a valid authentication token. 
- But what if we have to rate limit on the login API itself? 
- The weakness of this rate-limiting would be that a hacker can perform a denial of service attack against a user by entering wrong credentials up to the limit; after that the actual user will not be able to log-in.

## How would it work?
- When a request is made, a new temporary record is stored in [Redis](../../1_Databases/8_Caching-InMemory-Databases/Redis/Readme.md). 
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

## Two Major Issues & Solution

### Race Conditions
- To solve the race condition while updating the counter in [Redis](../../1_Databases/8_Caching-InMemory-Databases/Redis/Readme.md), we would have to apply [transaction locks on the read-write operation](../../1_Databases/8_Caching-InMemory-Databases/Redis/Readme.md#redis-transaction-lock).
- This would make the [counter update as atomic](../../1_Databases/1_ACID-Transactions/Atomicity.md) in Redis.
- But this comes at a performance cost ( as latency would increase ).

### Inconsistency
- Using the consistent data store (like [Redis](../../1_Databases/8_Caching-InMemory-Databases/Redis/Readme.md), [Cassandra](../../1_Databases/11_WideColumn-Databases/ApacheCasandra.md)), we can solve inconsistency problem of current rate limiting in distributed systems.
- This would add a bit of latency.

# Estimation
- [Read here](https://docs.google.com/spreadsheets/d/15vApko2QrmZmv5qTEIyU_IAWvgY3MD23TR3TuLUiPc8/edit#gid=695176044)

## References
- [Groking the system design - Designing an API Rate Limiter](https://akshay-iyangar.github.io/system-design/grokking-system-design/system-design-problems/api-rate-limiter.html)
- [System Design Basics: Rate Limiter](https://medium.com/geekculture/system-design-basics-rate-limiter-351c09a57d14)
- [How Redis can work for Rate Limit](https://github.com/jwerre/rate-limit-redis)
- [Stripe - Scaling your API with rate limiters](https://stripe.com/blog/rate-limiters)
- [API Throttling and Rate Limiting](https://mytechblogs.medium.com/api-throttling-and-rate-limiting-4835ce901857)
