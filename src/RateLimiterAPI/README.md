
# Distributed Rate limiter implementation for an API
- Rate limit can be implemented using Redis
- Redis would have count of requests

## How it works?
- When a request is made, a new temporary record is stored in Redis. This record is defined by the IP address of the request and will expire.
- If a second request is made before the first expires, the record count is incremented.
- For each request made within the rate limit window, the record is incremented.
- If the record count reaches the max limit before expiring, then a 429 error status is returned.

## References
- https://github.com/jwerre/rate-limit-redis
- https://akshay-iyangar.github.io/system-design/grokking-system-design/system-design-problems/api-rate-limiter.html
