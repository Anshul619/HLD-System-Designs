# Latency
- Latency is the time required to perform an action or to produce some result.
- Latency is measured in units of time - minutes, seconds, nanoseconds or clock periods.
- [Latency comparison numbers](../SystemEstimationTips.md#latency-comparison-numbers)
- For example - `50 secs to do a request/transaction`.

# Throughput
- Throughput is the number of actions executed or results produced per unit of time (second or minute).
- This is measured in units of whatever is being produced (cars, motorcycles, I/O samples, memory words, iterations) per unit of time.

| Throughput terminology                                                                                                           | Type          | Description                                                                                                                                                            |
|----------------------------------------------------------------------------------------------------------------------------------|---------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| RPS (Requests per Second)                                                                                                        | App/Service   | The number of requests, an app server can handle in 1 sec.                                                                                                             |
| TPS (Transactions per Second)                                                                                                    | App/Service   | The TPS includes a message entry and a message, plus a user database access. <br/>- A transaction might have multiple requests.<br/>- Hence, RPS is the subset of TPS. |
| [QPS (Queries per Second)](https://support.huaweicloud.com/intl/en-us/waf_faq/waf_01_0179.html#waf_01_0179__table48681616133812) | Database      | The number of queries, a database server can handle in 1 sec.                                                                                                          |

# References
- [What is TPS, what is QPS, and what is the difference?](https://topic.alibabacloud.com/a/what-is-tps-what-is-qps-and-what-is-the-difference-_-internet_2_60_20293740.html)