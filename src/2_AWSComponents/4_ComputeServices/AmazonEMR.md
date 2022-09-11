
# Amazon EMR

[Amazon EMR](https://aws.amazon.com/emr/) is a managed service that lets you process and analyze large datasets using the latest versions of big data processing frameworks such as [Apache Hadoop](../../1_HLDDesignComponents/8_BigDataComponents/ApacheHadoop), [Apache Spark](../../1_HLDDesignComponents/8_BigDataComponents/ApacheSpark.md), [HBase](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheHBase.md), and Presto on fully customizable clusters.

[Amazon EMR](https://aws.amazon.com/emr/) can be used to easily run and scale various big data tools.
- [Apache Spark](../../1_HLDDesignComponents/8_BigDataComponents/ApacheSpark.md)
- [Apache Hadoop](../../1_HLDDesignComponents/8_BigDataComponents/ApacheHadoop) 
- [HBase](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheHBase.md)
- Hive, Presto, and other big data workloads.

# EMR File System (EMRFS)
- The [EMR File System (EMRFS)](https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-fs.html) is an implementation of [HDFS](../../1_HLDDesignComponents/8_BigDataComponents/ApacheHadoop/ApacheHDFS.md) that all Amazon EMR clusters use for reading and writing regular files from `Amazon EMR` directly to [Amazon S3](../7_StorageServices/AmazonS3.md). 
- EMRFS provides the convenience of storing persistent data in [Amazon S3](../7_StorageServices/AmazonS3.md) for use with [Hadoop](../../1_HLDDesignComponents/8_BigDataComponents/ApacheHadoop) while also providing features like data encryption.

# References
- [What is Hadoop?](https://aws.amazon.com/emr/details/hadoop/what-is-hadoop/)