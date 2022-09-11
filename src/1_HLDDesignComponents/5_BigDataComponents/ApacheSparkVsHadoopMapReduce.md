
# How is Apache Spark different from Hadoop MapReduce?

Basis                                 | [Apache Spark](ApacheSpark.md)                                                                        | [Hadoop MapReduce](ApacheHadoop/ApacheMapReduce.md)                                                                                                                    | 
---------------------------------------|-------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
Data Processing | Apache Spark can process the data both in real-time and in batches.                                   | MapReduce does only batch-wise processing of data.                                                                                                                     | 
Speed | Apache Spark runs approximately `100 times faster than MapReduce` for big data processing.            | MapReduce does slow processing of large data                                                                                                                           | 
Memory usage | Spark stores data `in memory (RAM)` which makes it easier and faster to retrieve data when needed.    | Hadoop MapReduce is disk-bound. It stores data in [HDFS (Hadoop Distributed File System)](ApacheHadoop/ApacheHDFS.md) which makes it take a long time to get the data. | 
Latency | Spark supports `in-memory data storage and caching and makes it a low latency computation` framework. | MapReduce highly depends on disk which makes it to be a high latency framework.                                                                                        | 
Scheduler | Spark has its own job scheduler due to the `in-memory data computation`.                              | MapReduce requires an external scheduler for jobs.                                                                                                                     | 
Security | Its security is currently in its infancy                                                              | Better security features                                                                                                                                               |
Graph Processing | Spark comes with a graph computation library called GraphX.                                           | Algorithms like PageRank is used.                                                                                                                                      |
Ease of Use | Easier to use.                                                                                        | Difficult to use.                                                                                                                                                      |

# References
- [Top Spark Interview Questions](https://www.interviewbit.com/spark-interview-questions/)
- [Spark vs Hadoop MapReduce](https://www.integrate.io/blog/apache-spark-vs-hadoop-mapreduce/)
- [Difference Between Hadoop and Apache Spark](https://www.geeksforgeeks.org/difference-between-hadoop-and-apache-spark/?ref=lbp)