
# Apache Spark vs Hadoop MapReduce vs Flink vs Storm

|                 | [Apache Flink](ApacheFlink.md)                                                                                                         | [Apache Spark](ApacheSpark/Readme.md)                                                                                                                           | [Hadoop MapReduce](../ApacheHadoop/Readme.md)                                    | Storm                               | Kafka Streams                       |
|-----------------|----------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------|-------------------------------------|-------------------------------------|
| Processing Type | :chart: Real-time stream processing                                                                                                    | :chart: Micro-batch/Near-Real-Time stream processing                                                                                                            | :open_file_folder: Batch Processing                                              | :chart: Real-time stream processing | :chart: Real-time stream processing |
| Speed           | :rocket: 3x                                                                                                                            | 2x                                                                                                                                                              | x                                                                                | :rocket: 3x                         |                                     |
| Data Storage    | In-Memory storage and caching                                                                                                          | In-Memory storage and caching                                                                                                                                   | :floppy_disk: [HDFS](../../11_FileStorages/ApacheHDFS.md)             |                                     |                                     |
| Ease of Use     |                                                                                                                                        | :+1: Easier to manage and deploy                                                                                                                                | Harder to operate and deploy                                                     | Harder to operate and deploy        |                                     |
| APIs Support    | Python, Java, Scala                                                                                                                    | Python, R, Java, Scala                                                                                                                                          |                                                                                  | Multi-language integration          | Multi-language integration          |
| Fault tolerant  | :white_check_mark: Yes                                                                                                                 | :white_check_mark: Yes                                                                                                                                          | :white_check_mark: Yes                                                           | :white_check_mark: Yes              | :white_check_mark: Yes              |
| AWS Service     | [Amazon Managed Service For Apache Flink](../../2_AWS/10_BigDataServices/DataProcessing/AmazonManagedServiceForApacheFlink.md) | [Amazon EMR](../../2_AWS/10_BigDataServices/DataProcessing/AmazonEMR.md) & [AWS Glue](../../2_AWS/10_BigDataServices/DataProcessing/AWSGlue.md) | [Amazon EMR](../../2_AWS/10_BigDataServices/DataProcessing/AmazonEMR.md) | :x: Not-supported                   | :x: Not-supported                   |

# Others
- [AWS Glue vs Amazon EMR](../../2_AWS/10_BigDataServices/DataProcessing/AWSGlueVsEMRVsBatch.md)

# References
- [Top Spark Interview Questions](https://www.interviewbit.com/spark-interview-questions/)
- [Spark vs Hadoop MapReduce](https://www.integrate.io/blog/apache-spark-vs-hadoop-mapreduce/)
- [Difference Between Hadoop and Apache Spark](https://www.geeksforgeeks.org/difference-between-hadoop-and-apache-spark/?ref=lbp)
- [Apache Storm vs. Spark: Side-by-Side Comparison](https://phoenixnap.com/kb/apache-storm-vs-spark)
- [Apache Flink vs Apache Spark: A detailed comparison for data processing](https://dev.to/mage_ai/apache-flink-vs-apache-spark-a-detailed-comparison-for-data-processing-36d3)
- [Spark Streaming vs Flink vs Storm vs Kafka Streams vs Samza : Choose Your Stream Processing Framework](https://medium.com/@chandanbaranwal/spark-streaming-vs-flink-vs-storm-vs-kafka-streams-vs-samza-choose-your-stream-processing-91ea3f04675b)