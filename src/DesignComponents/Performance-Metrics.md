
# Performance Metrices

| Component | Throughput (QPS)                 | Latency | Component Type | Free |
|-----------|-----------------------------------------|----------------|----------------|------|
| Kafka     | 1 million messages ( write ) per second | ~5ms | MessageQueue(Pub-Sub) | Yes   |
| RabbitMQ     | 20K messages per second | ~1ms | MessageQueue(Point-2-Point) | Yes   |
| Redis     | 100K queries per second       | -| Caching        | Yes   |
| DynomoDB  | More than 20 million requests per second | less than 10-20 ms | NoSQL db       | No  |
| MongoDB   | || NoSQL Db       | No                                      |
| ElasticSearch |||Search Engine|No|

# Concurrent Requests Metrices

Based on tuning, the below metrices can vary.

| Component | Concurrent Requests |
|-----------|-----------------------------------------|
| Apache | 512 |
| MySQL | 1000 ( 100 is default )|


# Tech Decisions ( Scalability )
- Develope microservice based architecture
- We must consider cloud agnostic approach ( & onPerm customer approach ) while designing the solution.
- **Open Question - Since most cloud apps would be deployed on AWS, shouldn't we consider managed AWS services instead of our own managed instances ( like Amazon SQS instead of Kafka?)**
- If its a read heavy microservice, the best decision would be to use Redis
- If its a write heavy microservice, the best decision would be to use either use Kafka ( as message queue ) or DynmoDB. Both can handle high throughput.

# References
- https://www.mongodb.com/pricing
- https://stackoverflow.com/questions/20520492/how-to-minimize-the-latency-involved-in-kafka-messaging-framework
- https://www.confluent.io/blog/kafka-fastest-messaging-system/
- https://medium.com/explorium-ai/how-to-dramatically-increase-your-elasticsearch-throughput-and-concurrency-capacity-c32d7bb02ac2
