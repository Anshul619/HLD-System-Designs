
# Intro
- An open source, non-relational, versioned database that runs on top of [Hadoop Distributed File System (HDFS)](../../5_BigDataComponents/ApacheHadoop/ApacheHDFS.md) or [Amazon S3](../../../2_AWSComponents/7_StorageServices/AmazonS3.md) (using [EMRFS](../../../2_AWSComponents/4_ComputeServices/AmazonEMR.md)) or . 
- [Apache HBase](https://hbase.apache.org/) is a massively scalable, distributed big data store built for `random, strictly consistent, real-time access for tables with billions of rows and millions of columns`.

# :star: Real world use cases of HBase

## Inbox Search Feature at Facebook using HBase
- [Facebook](https://www.quora.com/Does-Facebook-use-Apache-Cassandra) originally built Cassandra to power its [Inbox search feature](https://m.facebook.com/nt/screen/?params=%7B%22note_id%22%3A10158772759272200%7D&path=%2Fnotes%2Fnote%2F&paipv=0&eav=AfYuSXXQPZ5fvm0_ScPdSlfj5BEFhRVT3iy_6Rsz7NZDbQ2vfq9opnedmTLSjG1aZBA&_rdr), with over 200 nodes deployed.
- This was abandoned in late 2010 when they built Facebook Messaging platform on [HBase](ApacheHBase.md) as they [found Cassandra's eventual consistency model to be a difficult pattern](ApacheCasandra#supported-consistency-patterns).

# References
- [What is Hadoop?](https://aws.amazon.com/emr/details/hadoop/what-is-hadoop/)
- [Does-Facebook-use-Apache-Cassandra](https://www.quora.com/Does-Facebook-use-Apache-Cassandra)