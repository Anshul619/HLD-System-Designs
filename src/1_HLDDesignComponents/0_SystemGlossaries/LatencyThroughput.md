# Latency
- `Latency is the time required to perform an action or to produce some result`.
- Latency is measured in units of time - hours, minutes, seconds, nanoseconds or clock periods.
- [Latency comparison numbers](../SystemEstimationTips.md#latency-comparison-numbers)
- For example - `50 secs to do a transaction`.

# Throughput
- Throughput is the number of actions executed or results produced per unit of time.
- This is measured in units of whatever is being produced (cars, motorcycles, I/O samples, memory words, iterations) per unit of time.

## TPS (Transactions per Second)
- For transactions processing systems, throughput is typically measured in `TPS`.
- The TPS includes a message entry and a message, plus a user database access. (Business TPS = CAPSX per call average TPs)
- For example - `500 transactions per second ( 500 TPS )`.

## QPS (Queries per Second)
- `Every transaction might have multiple queries`.
- Hence, QPS is the subset of TPS.
  - TBD - What is difference b/w TPS and QPS?