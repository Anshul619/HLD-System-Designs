# Circuit Breaker
- A service client should invoke a remote service via a proxy that functions in a similar fashion to an electrical circuit breaker. 
- When the number of consecutive failures crosses a threshold, the circuit breaker trips, and for the duration of a timeout period all attempts to invoke the remote service will fail immediately. 
- After the timeout expires the circuit breaker allows a limited number of test requests to pass through. 
- If those requests succeed the circuit breaker resumes normal operation. 
- Otherwise, if there is a failure the timeout period begins again.
- [Read more](https://microservices.io/patterns/reliability/circuit-breaker.html)

# Query timeout
If a query times out, the system should:
-- Fail fast

Release resources

Avoid retrying indefinitely

These patterns ensure your app doesn’t burn all connections because of slow queries.

