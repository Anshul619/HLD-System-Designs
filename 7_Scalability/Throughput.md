# Throughput
- Throughput is the number of actions executed or results produced per unit of time (second or minute).
- This is measured in units of whatever is being produced (cars, motorcycles, I/O samples, memory words, iterations) per unit of time.

# Terminologies

| Terminology                   | Type        | Description                                                                                                                                                                                                                                                                                                                   |
|-------------------------------|-------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| QPS - Queries per Second      | Database    | The number of queries, a database server can handle in 1 sec. [Read more](https://support.huaweicloud.com/intl/en-us/waf_faq/waf_01_0179.html#waf_01_0179__table48681616133812)                                                                                                                                               |
| TPS - Transactions per Second | App/Service | The TPS includes a message entry and a message, plus a user database access. <br/>- A transaction might have multiple requests.<br/>- Hence, RPS is the subset of TPS.                                                                                                                                                        |
| RPS - Requests per Second     | App/Service | The number of requests, an app server can handle in 1 sec.                                                                                                                                                                                                                                                                    |
| IOPS                          | Database    | [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html) are a unit of measure representing input/output operations per second.<br/>- The operations are measured in KiB, and the underlying drive technology determines the maximum amount of data that a volume type counts as a single I/O. |

# Principles
- Caching
- Identify Bottlenecks
- More threads, instances
- Spike Management