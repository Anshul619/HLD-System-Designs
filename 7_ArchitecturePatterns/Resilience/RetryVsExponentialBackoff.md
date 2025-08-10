# Retry vs Exponential Backoff

| Feature                   | Retry                 | Exponential Backoff               |
|---------------------------|-----------------------|-----------------------------------|
| Retry logic               | Fixed number of tries | Fixed number of tries             |
| Wait time between tries   | Fixed (e.g., 5s)      | Increases (e.g., 1s, 2s, 4s...)   |
| Handles rate limits well? | ❌ No                  | ✅ Yes                             |
| Use case                  | Fast failover         | Network/API throttling/resilience |
| Risk of retry storms      | ✅ High                | ❌ Lower                           |

# When to Use Which?

| Situation                      | Strategy            |
|--------------------------------|---------------------|
| Fast network glitch            | Retry               |
| API rate limiting (HTTP 429)   | Exponential Backoff |
| Intermittent external failures | Exponential Backoff |
| Database/queue deadlocks       | Retry or backoff    |