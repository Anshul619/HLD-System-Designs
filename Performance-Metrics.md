

| Component | Throughput (QPS)                 | Latency | Component Type | Free |
|-----------|-----------------------------------------|----------------|----------------|------|
| Kafka     | 1 million messages ( write ) per second | ~5ms |MessageQueue(Pub-Sub) | Yes   |
| RabbitMQ     | 20K messages per second |~1ms|MessageQueue(Point-2-Point) | Yes   |
| Redis     | 100K queries ( write ) per second       | -|Caching        | Yes   |
| DynomoDB  | More than 20 million requests per second | 10-20 ms |NoSQL db       | No  |
|MongoDB| || NoSQL Db       | No                                      |


References
- https://www.mongodb.com/pricing
- https://stackoverflow.com/questions/20520492/how-to-minimize-the-latency-involved-in-kafka-messaging-framework
- https://www.confluent.io/blog/kafka-fastest-messaging-system/
