# Amazon EMR
- [Amazon EMR](https://aws.amazon.com/emr/) is a managed service that lets you process and analyze large datasets using the latest versions of big data processing frameworks.
- With EMR you can run Petabyte-scale analysis at less than half of the cost of traditional on-premises solutions and over 3x faster than standard [Apache Spark](../../../../8_BigDataServices/ETLServices/ApacheSpark.md). 
- Amazon EMR uses [Hadoop, an open-source framework](../../../../8_BigDataServices/ETLServices/BatchProcessing/ApacheHadoop/Readme.md), to distribute your data and processing across a resizable cluster of [Amazon EC2 instances](../../../3_ComputeServices/AmazonEC2/Readme.md).

# Supported Big Data Frameworks

| Tool                                                                                                                      |
|---------------------------------------------------------------------------------------------------------------------------|
| [Apache Spark](../../../../8_BigDataServices/ETLServices/ApacheSpark.md)         |
| [Apache Hadoop](../../../../8_BigDataServices/ETLServices/BatchProcessing/ApacheHadoop/Readme.md) |
| [HBase](../../../../6_DatabaseServices/NoSQL-Databases/WideColumnDB/ApacheHBase.md)                            |
| Hive, Presto, and other big data workloads.                                                                               |

# EMR File System (EMRFS)
- The [EMR File System (EMRFS)](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-fs.html) is an implementation of [HDFS](../../../../11_FileStorageServicesHDFS/ApacheHDFS.md) that all Amazon EMR clusters use for reading and writing regular files from [Amazon EMR]() directly to [Amazon S3](../../../7_StorageServices/3_ObjectStorageS3/Readme.md). 
- [EMRFS](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-fs.html) provides the convenience of storing persistent data in [Amazon S3](../../../7_StorageServices/3_ObjectStorageS3/Readme.md) for use with [Hadoop](../../../../8_BigDataServices/ETLServices/BatchProcessing/ApacheHadoop) while also providing features like data encryption.

# Node Types

| Node type                                                                                              | Description                                                                                                                                                      |
|--------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Primary node](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html) | The primary node manages the cluster and typically runs primary components of distributed applications.                                                          |
| [Core nodes](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html)   | Core nodes are managed by the primary node. Core nodes run the Data Node daemon to coordinate data storage as part of the Hadoop Distributed File System (HDFS). |
| [Task nodes](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html)   | You can use task nodes to add power to perform parallel computation tasks on data, such as Hadoop MapReduce tasks and Spark executors.                           |

# References
- [What is Hadoop?](https://aws.amazon.com/emr/details/hadoop/what-is-hadoop/)