
# Introduction
- [Apache Spark](https://spark.apache.org) is an open-source framework engine that is known for its speed, easy-to-use nature in the field of `big data processing` and `analysis`.
- It also has built-in modules for graph processing, machine learning, streaming, SQL, etc.
- The spark execution engine supports `in-memory computation` and cyclic data flow.
- It can run either on [cluster mode](../0_SystemGlossaries/ServersCluster.md) or standalone mode.
- It can access diverse data sources like [Kafka](../4_MessageBrokers/Kafka.md), [HBase](../3_DatabaseComponents/NoSQL-Databases/ApacheHBase.md), [HDFS](ApacheHadoop/ApacheHDFS.md), [Cassandra](../3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md) etc.

![img.png](https://www.altexsoft.com/media/2021/06/word-image-14.png)

# What is Spark Streaming and how is it implemented in Spark?
- Data from sources like [Kafka](../4_MessageBrokers/Kafka.md), Kinesis, Flume, etc. are processed and pushed to various destinations like databases, dashboards, machine learning APIs, or as simple as file systems.
- The data is divided into various streams (similar to batches) and is processed accordingly.
- Spark Streaming supports [highly scalable](../0_SystemGlossaries/Scalability.md), [fault-tolerant](../0_SystemGlossaries/FaultTolerance&DisasterRecovery.md) continuous stream processing which is mostly used in cases like fraud detection, website monitoring, website click baits, IoT (Internet of Things) sensors, etc.
- Spark Streaming first divides the data from the data stream into `batches of X seconds which are called Dstreams or Discretized Streams`.
    - They are internally nothing but a sequence of multiple RDDs.
    - The Spark application does the task of processing these RDDs using various Spark APIs and the results of this processing are again returned as batches.

![img.png](assests/apache_spark_spark_streaming.png)

# Spark vs Others
- [Apache Spark vs Hadoop MapReduce](ApacheSparkVsHadoopMapReduce.md) 
- [Apach Spark vs Storm](ApacheStorm.md#apachestorm-vs-spark)

# References
- [Top Spark Interview Questions](https://www.interviewbit.com/spark-interview-questions/)
- [Spark vs Hadoop MapReduce](https://www.integrate.io/blog/apache-spark-vs-hadoop-mapreduce/)