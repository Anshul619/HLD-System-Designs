# Spark Streaming
- Spark Streaming supports [highly scalable](../../../3_Databases/3_Scalability-Techniques/Readme.md), [fault-tolerant](../../../7a_HighAvailability/FaultTolerance.md) continuous stream processing which is mostly used in cases like fraud detection, website monitoring, website click baits, IoT (Internet of Things) sensors, etc.

# Features

| Feature                         | Remarks                                                                                                                                                                                                                                                                                               |
|---------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Dstreams or Discretized Streams | Spark Streaming first divides the data from the data stream into batches of X seconds which are called **Dstreams or Discretized Streams**.                                                                                                                                                           |
| Data Sources                    | Data from sources like [Kafka](../../../4_MessageBrokersEDA/Kafka/Readme.md), [Kinesis](https://github.com/Anshul619/AWS-Services/tree/main/4_MessageBrokers/AmazonKinesis/Readme.md) etc. are processed and pushed to various destinations like databases, dashboards, machine learning APIs or as simple as file systems. |

# Architecture

![](apache_spark_spark_streaming.png)