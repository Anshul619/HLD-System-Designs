# Rate Limiting
- [Rate limiting](https://medium.com/geekculture/system-design-basics-rate-limiter-351c09a57d14) refers to preventing the frequency of an operation from exceeding a defined limit.
- In large-scale systems, rate limiting is commonly used to protect underlying services and resources.
- Rate limiting is generally used as a defensive mechanism in distributed systems, so that shared resources can maintain availability.
- [AWS WAF](https://github.com/Anshul619/AWS-Services/tree/main/17_Security/2_InfraProtection/AWSWAF.md) can be used to rate limit the APIs in AWS.

![img.png](assets/what-is-rate-limiting.png)

Imagine we have a service which is receiving a huge number of requests, but it can only serve a limited number of requests per second.
- To handle this problem we would need some kind of throttling or rate limiting mechanism that would allow only a certain number of requests so our service can respond to all of them.
- A rate limiter, at a high-level, limits the number of events an entity (user, device, IP, etc.) can perform in a particular time window.

For example:
- A user can send only one message per second.
- A user is allowed only three failed credit card transactions per day.
- A single IP can only create twenty accounts per day.

In general, a rate limiter caps how many requests a sender can issue in a specific time window. It then blocks requests once the cap is reached.

# Main purposes

|                          | Description                                                                  |
|--------------------------|------------------------------------------------------------------------------|
| Prevent overload         | Stop a service from being overwhelmed by too many requests at once.          |
| Fairness                 | Ensure one client doesn’t hog all the resources.                             |
| Protection against abuse | Limit denial-of-service attacks, brute-force logins, or excessive API usage. |

# Definition parameters

| Parameter | Description                                                             |
|-----------|-------------------------------------------------------------------------|
| Limit     | e.g. **100 requests per minute**.                                       |
| Scope     | Per user, per IP, per API key, or global.                               |
| Window    | Fixed window (reset every X seconds/minutes) or rolling/sliding window. |

# Expected actions

If a client exceeds the limit:
- The request is blocked or delayed.
- The server may return a 429 Too Many Requests HTTP status.
- Sometimes a Retry-After header tells the client when to try again.

# What are different types of algorithms used for Rate Limiting?

## Fixed Window Algorithm
- In this algorithm, the time window is considered from the start of the time-unit to the end of the time-unit.

## Rolling Window Algorithm
- In this algorithm, the time window is considered from the fraction of the time at which the request is made plus the time window length.

## :star: Sliding Window algorithm

We can maintain a sliding window if we can keep track of each request per user.
- We can store the timestamp of each request in a [Redis Sorted Set](../../1_Databases/8_Caching-InMemory-Databases/Redis/Readme.md) in our ‘value’ field of hash-table.
- This is like Priority Queue Implementation.

Let’s assume our rate limiter is allowing three requests per minute per user, so, whenever a new request comes in, the Rate Limiter will perform following steps:
- Remove all the timestamps from the Sorted Set that are older than “CurrentTime - 1 minute”.
- Count the total number of elements in the sorted set.
- Reject the request if this count is greater than our throttling limit of “3”.
- Insert the current time in the sorted set and accept the request.

Sliding Window Algorithm takes a lot of memory compared to the Fixed Window; this would be a scalability issue.
- If we need to track one million users at any time, total memory we would need would be 12GB.

What if we keep track of request counts for each user using multiple fixed time windows, e.g., 1/60th the size of our rate limit’s time window.
- We can store our counters in a [Redis Hash](../../1_Databases/8_Caching-InMemory-Databases/Redis/Readme.md) since it offers incredibly efficient storage for fewer than 100 keys.
- When each request increments a counter in the hash, it also sets the hash to expire an hour later.
- We will normalize each ‘time’ to a minute.

# Types of Throttling

## Hard Throttling
- The number of API requests cannot exceed the throttle limit.

## Soft Throttling
- In this type, we can set the API request limit to exceed a certain percentage.

For example
- If we have rate-limit of 100 messages a minute and 10% exceed-limit, our rate limiter will allow up to 110 messages per minute.

## Elastic or Dynamic Throttling
- Under Elastic throttling, the number of requests can go beyond the threshold if the system has some resources available.

For example
- If a user is allowed only 100 messages a minute, we can let the user send more than 100 messages a minute when there are free resources available in the system.