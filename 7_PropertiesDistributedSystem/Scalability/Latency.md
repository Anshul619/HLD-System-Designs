# Latency
- [Latency/Response time](https://topic.alibabacloud.com/a/what-is-tps-what-is-qps-and-what-is-the-difference-_-internet_2_60_20293740.html) is the time required to perform an action or to produce some result.
- Latency is measured in units of time - minutes, seconds, nanoseconds or clock periods.
- For example - **50 ms to complete a request/transaction**.
- [Latency comparison numbers](../../SystemEstimationTips.md#latency-comparison-numbers)

# Importance of Latency
- Latency is important as it affects overall business.
- Amazon has observed that a 100 ms increase in latency/response time reduces sales by 1%. 
- And others report that a 1-second slowdown reduces a customer satisfaction metric by 16%.

# Terminologies

| Terminology     | Description                                                | Remarks                                                                                                                              |
|-----------------|------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|
| 95th percentile | Response time that is **slower than 95% of all requests**. | In other words, if you have 100 requests, the 95th percentile response time would be the response time for the 95th slowest request. |
| 99th percentile | Response time that is **slower than 99% of all requests**. | Similarly, this is the response time for the 99th slowest request out of 100 requests.                                               |

[Read more](https://medium.com/@vikaskumar4793/the-95th-and-99th-percentiles-are-the-most-crucial-application-metrics-33085d2d3e34)