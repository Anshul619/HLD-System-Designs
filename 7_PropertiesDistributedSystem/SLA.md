# SLA (Service Level Agreement)
An [SLA](https://www.servicenow.com/products/itsm/what-is-sla.html) may state that the service is considered to be up if
- It has a [latency/median response](Scalability/Latency.md) time of less than 200 ms.
- A [99th percentile under 1s](Scalability/Latency.md) (if the response time is longer, it might as well be down).
- And the service may be required to be up [at least 99.9% of the time](Reliability/HighAvailability.md#power-of-9s).
- These metrics set expectations for clients of the service and allow customers to demand a refund if the SLA is not met.