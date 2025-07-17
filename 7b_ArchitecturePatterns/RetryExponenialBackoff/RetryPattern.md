# Retry Pattern
- Do only the limited numbers of retry on failure and make a timeout after retry.

# Characteristics
- Simple re-attempt of a failed operation.
- Often used with a fixed delay, e.g., retry after 5 seconds.

# Example
- Try → Fail → Wait 5s → Try again → Fail → Wait 5s → Try again

# Problem
- If the issue is caused by high load or rate-limiting, retrying quickly can make it worse (a “retry storm”).