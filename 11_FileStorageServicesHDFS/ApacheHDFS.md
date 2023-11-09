# Introduction
- [Apache HDFS (Hadoop Distributed File System)](https://hadoop.apache.org/docs/r1.2.1/hdfs_design.html) is a distributed file system that runs on standard or low-end hardware. (handles large data sets)
- HDFS provides [better data throughput](../7_SystemGlossaries/Scalability/LatencyThroughput.md) than traditional file systems, in addition to [high fault tolerance](../7_SystemGlossaries/Reliability/FaultTolerance.md) and native support of large datasets.

# :+1: Scale in HDFS
- It is used to scale a single Apache Hadoop cluster to hundreds & thousands (and even tens of thousands) of nodes.
- HDFS accommodates applications that have data sets typically gigabytes to terabytes (& even petabytes) in size.

# :star: Real world use cases of HDFS

## Personalization at Spotify using Cassandra & HDFS

![](../1_TechStacksRealApps/PersonalizationSpotify/PersonalizationSpotify.drawio.png)

[Read more](../1_TechStacksRealApps/PersonalizationSpotify/Readme.md)

# References
- [What is Hadoop?](https://aws.amazon.com/emr/details/hadoop/what-is-hadoop/)
- [Storing Apache Hadoop Data on the Cloud - HDFS vs S3](https://www.integrate.io/blog/storing-apache-hadoop-data-cloud-hdfs-vs-s3/)
- [Scale an Apache Hadoop cluster to hundreds of nodes with the Hadoop Distributed File System (HDFS)](https://www.ibm.com/in-en/topics/hdfs)