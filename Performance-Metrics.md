

| Component | Throughput (QPS)                 | Latency | Component Type | Paid |
|-----------|-----------------------------------------|----------------|----------------|------|
| Kafka     | 1 million messages ( write ) per second | ~5ms |MessageQueue(Pub-Sub) | No   |
| RabbitMQ     | 20K messages per second |~1ms|MessageQueue(Point-2-Point) | No   |
| Redis     | 100K queries ( write ) per second       | -|Caching        | No   |
| DynomoDB  | More than 20 million requests per second | 10-20 ms |NoSQL db       | Yes  |
|MongoDB| || NoSQL Db       | Yes                                      |


References
- https://www.mongodb.com/pricing
- https://stackoverflow.com/questions/20520492/how-to-minimize-the-latency-involved-in-kafka-messaging-framework
- https://www.confluent.io/blog/kafka-fastest-messaging-system/
