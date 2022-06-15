

| Component | Throughput (QPS)                 | Latency | Component Type | Paid |
|-----------|-----------------------------------------|----------------|----------------|------|
| Kafka     | 1 million messages ( write ) per second | -|MessageQueue(Pub-Sub) | No   |
| Redis     | 100K queries ( write ) per second       | -|Caching        | No   |
| DynomoDB  | More than 20 million requests per second | 10-20 ms |NoSQL db       | Yes  |
|MongoDB| || NoSQL Db       | Yes                                      |


References
- https://www.mongodb.com/pricing
