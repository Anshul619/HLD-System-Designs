# Latency
- `Latency is the time required to perform an action or to produce some result`.
- Latency is measured in units of time - minutes, seconds, nanoseconds or clock periods.
- [Latency comparison numbers](../SystemEstimationTips.md#latency-comparison-numbers)
- For example - `50 secs to do a request/transaction`.

# Throughput
- Throughput is the number of actions executed or results produced per unit of time ( second or minute ).
- This is measured in units of whatever is being produced (cars, motorcycles, I/O samples, memory words, iterations) per unit of time.
- Typically, throughput is measured through [QPS (Queries per sec)](#qps-queries-per-second), `RPM (Requests per min)`,[TPS(transactions per second)](#tps-transactions-per-second) terms. 

## QPS (Queries per Second)
- [Queries Per Second (QPS)](https://support.huaweicloud.com/intl/en-us/waf_faq/waf_01_0179.html#waf_01_0179__table48681616133812) indicates the number of requests/queries per second.
- For example, an HTTP GET request is also called a query.
- The number of requests is the total number of requests in a specific time range.

## TPS (Transactions per Second)
- For transactions processing systems, throughput is typically measured in `TPS`. Like orders per second in e-commerce.
- The TPS includes a message entry and a message, plus a user database access.
- A transaction might have mutiple requests. Hence, QPS is the subset of TPS.
- For example - `5 transactions per second ( 5 TPS )`.