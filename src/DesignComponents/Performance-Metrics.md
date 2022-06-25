
# Performance Metrices

| Component | Component Type | Throughput (QPS)                 | Latency | Free |
|-----------|-----------------------------------------|----------------|----------------|------|
| [Kafka](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/Kafka)     | Message Queue (Pub-Sub) - High-throughput | 1 million messages ( write ) per second | ~5ms | Yes   |
| [RabbitMQ](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/Kafka#kafka-vs-rabbitmq)     | Message Queue (Point-2-Point) | 20K messages per second | ~1ms |  Yes   |
| [Redis](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/Redis)     | Caching        | 100K queries per second       | -|  Yes   |
| [DynomoDB](https://github.com/Anshul619/System-Designs/blob/main/src/DesignComponents/SQLvsNoSQL/ReadMe.md#dynomodb)  | NoSQL DB as a Service ( AWS ) - Predictable performance and cost| More than 20 million requests per second | less than 10-20 ms | No  |
| MongoDB   | NoSQL DB       | - | -|  No                                      |
| [ElasticSearch](https://github.com/Anshul619/System-Designs/tree/main/src/DesignComponents/ElasticSearch) | Search Engine|-|-|No|

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
