# Batch processing systems (offline systems)
- A [batch processing system](https://aws.amazon.com/what-is/batch-processing/) takes a large amount of input data, runs a job to process it, and produces some output data.
- Certain [data processing tasks, such as backups, filtering, and sorting](https://aws.amazon.com/what-is/batch-processing/), can be computed intensive and inefficient to run on individual data transactions.
- Instead, data systems process such tasks in batches, often in off-peak times when computing resources are more commonly available, such as at the end of the day or overnight.
- For example, consider an ecommerce system that receives orders throughout the day. Instead of processing every order as it occurs, the system might collect all orders at the end of each day and share them in one batch with the order fulfillment team.

![](![](https://www.upsolver.com/wp-content/uploads/2019/09/Slide1.png))

# Key Tech

| Tech                                              | Description                                                                                                                                                                                                                                                                  |
|---------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [MapReduce](MapReduce.md)                         | MapReduce is a programming model which is an implementation for processing and generating big data sets with distributed algorithm on a cluster.<br/>- MapReduce can run on HDFS/GFS/NDFS or any other distributed system for example MapR-FS.                               |
| [Hadoop](ApacheHadoop/Readme.md)                  | The Apache Hadoop is a software that allows all the distributed processing of large data sets across clusters of computers using simple programming.<br/>- It internally uses MapReduce for data transformation.<br/>- Hadoop runs on HDFS (Hadoop Distributed File System). |
| [ApacheSpark](../StreamProcessing/ApacheSpark.md) | -                                                                                                                                                                                                                                                                            |

[Read more](https://www.geeksforgeeks.org/difference-between-hadoop-and-mapreduce/)

# :star: General Use Cases of Batch Processing

| UC                                          | Remarks                                                                         |
|---------------------------------------------|---------------------------------------------------------------------------------|
| Recommendation System                       | 50-100 MapReduce jobs                                                           |
| Ranking System                              | -                                                                               |
| Google's Search Indexing (later moved away) | 5-10 MapReduce jobs                                                             |
| Building indexes for Lucene/Solr            | [ApacheHadoop](ApacheHadoop/Readme.md) is used                                  |
| Machine learning systems                    | Example - Classifiers (spam filters, anomaly detection, image recognition etc.) |
| Implement ETL Process                       | -                                                                               |