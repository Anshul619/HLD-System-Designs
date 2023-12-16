
# Apache Spark vs Hadoop MapReduce vs Flink vs Storm

|                 | [Apache Spark](ApacheSpark/Readme.md)        | [Hadoop MapReduce](../ApacheHadoop/Readme.md)          | Storm                        | Flink                          |
|-----------------|----------------------------------------------|--------------------------------------------------------|------------------------------|--------------------------------|
| Processing Type | Micro-batch/Near-Real-Time stream processing | Batch Processing                                       | Real-time stream processing  | Real-time stream processing    |
| Speed           | 2x                                           | x                                                      | 3x                           | 3x                             |
| Data Storage    | In-Memory  storage and caching               | [HDFS](../../11_FileStorageServicesHDFS/ApacheHDFS.md) |                              | In-Memory  storage and caching |
| Ease of Use     | Easier to manage and deploy                  | Harder to operate and deploy                           | Harder to operate and deploy |                                |
| APIs Support    | Python, R, Java, Scala                       |                                                        | Multi-language integration   | Python, Java, Scala            |
| Fault tolerant  | :white_check_mark: Yes                       | :white_check_mark: Yes                                 | :white_check_mark: Yes       | :white_check_mark: Yes         |

# References
- [Top Spark Interview Questions](https://www.interviewbit.com/spark-interview-questions/)
- [Spark vs Hadoop MapReduce](https://www.integrate.io/blog/apache-spark-vs-hadoop-mapreduce/)
- [Difference Between Hadoop and Apache Spark](https://www.geeksforgeeks.org/difference-between-hadoop-and-apache-spark/?ref=lbp)
- [Apache Storm vs. Spark: Side-by-Side Comparison](https://phoenixnap.com/kb/apache-storm-vs-spark)
- [Apache Flink vs Apache Spark: A detailed comparison for data processing](https://dev.to/mage_ai/apache-flink-vs-apache-spark-a-detailed-comparison-for-data-processing-36d3)
- [Spark Streaming vs Flink vs Storm vs Kafka Streams vs Samza : Choose Your Stream Processing Framework](https://medium.com/@chandanbaranwal/spark-streaming-vs-flink-vs-storm-vs-kafka-streams-vs-samza-choose-your-stream-processing-91ea3f04675b)