# Apache HBase
- An open source, non-relational, versioned database that runs on top of [Hadoop Distributed File System (HDFS)](../../9_FileStorages/ApacheHDFS.md) or [Amazon S3](https://github.com/Anshul619/AWS-Services/tree/main/6_FileStorages/3_S3ObjectStorage/Readme.md) (using [EMRFS](https://github.com/Anshul619/AWS-Services/tree/main/10_BigData/DataProcessing/AmazonEMR.md)). 
- [Apache HBase](https://hbase.apache.org/) is a massively scalable, distributed big data store built for random, [strongly consistent](../4_Consistency-Replication/Readme.md), real-time access for tables with `billions of rows and millions of columns`.

# Key Features
- [Highly scalable, distributed systems](../3_Scalability-Techniques/Readme.md).
- [High Read/Writes in Apache HBase](../../4_Scalability/Latency.md)
- Linear scalability and modularity
- Aid in exporting metrics through Hadoop metrics subsystem
- Automated fail-over support and sharding of tables
- Effortlessly usable Java API for clients
- Regularity in reads and writes
- Data storage as key or values
- Best fit for range-based scan

# :star: Real world use cases of HBase

## Inbox Search Feature at Facebook using HBase
- [Facebook](https://www.quora.com/Does-Facebook-use-Apache-Cassandra) originally built Cassandra to power its [Inbox search feature](https://m.facebook.com/nt/screen/?params=%7B%22note_id%22%3A10158772759272200%7D&path=%2Fnotes%2Fnote%2F&paipv=0&eav=AfYuSXXQPZ5fvm0_ScPdSlfj5BEFhRVT3iy_6Rsz7NZDbQ2vfq9opnedmTLSjG1aZBA&_rdr), with over 200 nodes deployed.
- This was abandoned in late 2010 when they built Facebook Messaging platform on [HBase](ApacheHBase.md) as they [found Cassandra's eventual consistency model to be a difficult pattern](ApacheCasandra.md).

# References
- [What is Hadoop?](https://aws.amazon.com/emr/details/hadoop/what-is-hadoop/)
- [HBase Vs MongoDB – A Thorough Comparison Between NoSQL Databases](https://simpleprogrammer.com/hbase-vs-mongodb/)
- [Amazon DynamoDB VS HBase](https://stackoverflow.com/questions/10908531/aws-dynamodb-vs-hbase#29381684)
- [Does-Facebook-use-Apache-Cassandra?](https://www.quora.com/Does-Facebook-use-Apache-Cassandra)