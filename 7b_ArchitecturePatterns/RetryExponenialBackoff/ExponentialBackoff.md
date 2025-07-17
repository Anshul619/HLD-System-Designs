# Exponential Backoff
- Retries failed operations, but waits progressively longer between each attempt.

# Characteristics
- Delay increases exponentially (e.g., 1s, 2s, 4s, 8s...).
- Sometimes includes jitter (randomness) to avoid multiple clients retrying at the same time.
- Helps prevent overwhelming services under stress.

# Example
- Try → Fail → Wait 2s → Try again → Fail → Wait 4s → Try again → Fail → Wait 8s →