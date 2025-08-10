# Timeout Pattern
- A timeout pattern is a software design approach used to ensure that an operation doesn't keep waiting indefinitely for a response, especially when dealing with unreliable or slow systems like networks, external APIs, or databases.

# Core Idea
- You set a maximum amount of time you’re willing to wait for an operation.
- If the operation doesn’t complete within that time, it’s aborted or handled gracefully.
- This prevents your application from getting stuck or wasting resources.

# Why it’s important?

| Title                         | Description                                          |
|-------------------------------|------------------------------------------------------|
| Avoids resource blocking      | Threads, memory, or connections aren’t held forever. |
| Improves reliability          | Your system can recover from delays or failures.     |
| Enhances user experience      | Users don’t wait endlessly for a response.           |
| Supports fail-fast strategies | Fail quickly and move to alternatives.               |

# Example scenarios

| Scenario                | Description                                                                                   |
|-------------------------|-----------------------------------------------------------------------------------------------|
| Web requests            | If a microservice call takes longer than 2 seconds, cancel it and return a fallback response. |
| Database queries        | If a query doesn’t return in 1 second, stop it and log a performance issue.                   |
| IoT or hardware control | If a sensor doesn’t send data within 500ms, assume it’s offline.                              |

# Common implementation patterns

|                           | Description                                                                                                                                                                                                                            |
|---------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Context propagation       | A design approach where metadata and control signals (e.g. deadlines, cancellation tokens, trace IDs) are passed along with execution flow, enabling consistent behavior across asynchronous boundaries and distributed service calls. |
| Fixed timeout             | Always the same limit (e.g. HTTP client timeout = 5s, DB query timeout)                                                                                                                                                                |
| Dynamic timeout           | Adjust based on system load or historical performance.                                                                                                                                                                                 |
| With retries              | Use timeouts together with retry logic (sometimes with [exponential backoff](ExponentialBackoff.md)).                                                                                                                                  |
| Circuit breaker + timeout | If repeated timeouts occur, stop making requests for a while. ([Circuit Breaker](CircuitBreaker.md))                                                                                                                                   |