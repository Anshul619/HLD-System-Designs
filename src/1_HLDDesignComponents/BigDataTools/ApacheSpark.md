
# [What is Apache Spark?](https://spark.apache.org)
- `Apache Spark` is an open-source framework engine that is known for its speed, easy-to-use nature in the field of `big data processing` and `analysis`.
- It also has built-in modules for graph processing, machine learning, streaming, SQL, etc.
- The spark execution engine supports `in-memory computation` and cyclic data flow
- It can run either on cluster mode or standalone mode.
- It can access `diverse data sources like HBase, HDFS, Cassandra,` etc.

# How is Apache Spark different from MapReduce?

Basis                                 | MapReduce                                                                        | Apache Spark                                                                             |
---------------------------------------|---------------------------------------------------------------------------|------------------------------------------------------------------------------------------|
MapReduce | MapReduce does only batch-wise processing of data. | Apache Spark can process the data both in real-time and in batches.                      |
Speed | MapReduce does slow processing of large data                                                | Apache Spark runs approximately `100 times faster than MapReduce` for big data processing. |
Data Processing | MapReduce stores data in `HDFS (Hadoop Distributed File System)` which makes it take a long time to get the data.          | Spark stores data `in memory (RAM)` which makes it easier and faster to retrieve data when needed.                                                         |
Latency | MapReduce highly depends on disk which makes it to be a high latency framework. | Spark supports `in-memory data storage and caching and makes it a low latency computation` framework.                                    |
Scheduler | MapReduce requires an external scheduler for jobs. | Spark has its own job scheduler due to the `in-memory data computation`.                             |

# What is Spark Streaming and how is it implemented in Spark?
- Data from sources like `Kafka`, Kinesis, Flume, etc. are processed and pushed to various destinations like databases, dashboards, machine learning APIs, or as simple as file systems.
- The data is divided into various streams (similar to batches) and is processed accordingly.
- Spark Streaming supports `highly scalable, fault-tolerant` continuous stream processing which is mostly used in cases like fraud detection, website monitoring, website click baits, IoT (Internet of Things) sensors, etc.
- Spark Streaming first divides the data from the data stream into `batches of X seconds which are called Dstreams or Discretized Streams`.
    - They are internally nothing but a sequence of multiple RDDs.
    - The Spark application does the task of processing these RDDs using various Spark APIs and the results of this processing are again returned as batches.

![img.png](../assests/apache_spark_spark_streaming.png)

# References
- [Top Spark Interview Questions](https://www.interviewbit.com/spark-interview-questions/)