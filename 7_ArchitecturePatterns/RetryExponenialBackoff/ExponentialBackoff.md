# Exponential Backoff
- Retries failed operations, but waits progressively longer between each attempt.

# Characteristics
- Delay increases exponentially (e.g., 1s, 2s, 4s, 8s...).
- Sometimes includes jitter (randomness) to avoid multiple clients retrying at the same time.
- Helps prevent overwhelming services under stress.

# Examples
- `Try → Fail → Wait 2s → Try again → Fail → Wait 4s → Try again → Fail → Wait 8s →`

## Async Retry library
- [Read more](https://www.npmjs.com/package/async-retry)

````javascript
var operation = retry.operation({
  retries: 5, // The maximum amount of times to retry the operation. Default is 10.
  factor: 3, // The exponential factor to use. Default is 2.
  minTimeout: 1 * 1000, // The number of milliseconds before starting the first retry. Default is 1000.
  maxTimeout: 60 * 1000, // The maximum number of milliseconds between two retries. Default is Infinity.
  randomize: true, // Randomizes the timeouts by multiplying with a factor between 1 to 2. Default is true.
});
````