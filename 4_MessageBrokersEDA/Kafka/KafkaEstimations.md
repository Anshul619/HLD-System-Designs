# Estimation - How to decide number of partitions in Kafka?

> Rough formula for picking the number of partitions = `MAX(t/p, t/c)`

| Parameter | Title                            | More Description                                                                                  |
|-----------|----------------------------------|---------------------------------------------------------------------------------------------------|
| `t`       | Target Throughput                | Let’s say your target throughput is t.                                                            |
| `p`       | Throughput on a single partition | You measure the throughout that you can achieve on a single partition for production (call it p). |
| `c`       | Consumption Rate                 | And consumption (call it c).                                                                      |

# Partitions - Considerations for estimations

| Consideration                                     | Remarks                                                                                                                                                                                                                     |
|---------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| More partitions lead to `higher throughput`       |                                                                                                                                                                                                                             |
| More partitions requires `more open file handles` | We have seen production Kafka clusters running with more than 30 thousand open file handles per broker.                                                                                                                     |
| More partitions may `increase unavailability`     | It’s probably better to limit the number of partitions per broker to two to four thousand and the total number of partitions in the cluster to low tens of thousand.                                                        |
| More partitions may increase end-to-end latency.  | As a rule of thumb, if you care about latency, it’s probably a good idea to limit the number of partitions per broker to *100 x b x r*, where b is the number of brokers in a Kafka cluster and r is the replication factor. |

# Read more
- [How to Choose the Number of Topics/Partitions in a Kafka Cluster?](https://www.confluent.io/blog/how-choose-number-topics-partitions-kafka-cluster/)
- [Kafka cluster size calculator](https://docs.google.com/spreadsheets/d/1a3uIa8TTRLlN6HTtMzPPqf8p5j5OxflJuAyff-uHLgk/edit?usp=sharing)