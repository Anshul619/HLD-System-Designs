# Latency
- Latency/Response time is the time required to perform an action or to produce some result.
- Latency is measured in units of time - minutes, seconds, nanoseconds or clock periods.
- For example - `50 secs to do a request/transaction`.
- [Latency comparison numbers](../../SystemEstimationTips.md#latency-comparison-numbers)

Latency is important as it affects overall business
- Amazon has observed that a 100 ms increase in latency/response time reduces sales by 1%, 
- And others report that a 1-second slowdown reduces a customer satisfaction metric by 16%.

# SLA (Service Level Agreement)
An [SLA](https://www.servicenow.com/products/itsm/what-is-sla.html) may state that the service is considered to be up if 
- It has a [latency/median response](https://www.servicenow.com/products/itsm/what-is-sla.html) time of less than 200 ms 
- A [99th percentile under 1s](../Reliability/HighAvailability.md#power-of-9s) (if the response time is longer, it might as well be down), 
- And the service may be required to be up [at least 99.9% of the time](../Reliability/HighAvailability.md#power-of-9s). 

These metrics set expectations for clients of the service and allow customers to demand a refund if the SLA is not met.

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