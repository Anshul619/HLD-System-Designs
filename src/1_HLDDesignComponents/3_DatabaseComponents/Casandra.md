
# Casandra
- [Apache Cassandra](https://cassandra.apache.org/_/index.html) is a free and open-source, distributed & wide column store. ( can handle large amount of data )
- It is a NoSQL database management system designed to handle large amounts of data across many commodity servers, providing [high availability with no single point of failure](../0_SystemGlossaries/FaultTolerance&DisasterRecovery.md). 
- Cassandra offers robust support for [clusters spanning multiple data centers](../0_SystemGlossaries/ServersCluster.md), with asynchronous masterless replication allowing low latency operations for all clients.
- Released in 2008 by Facebook and developed initially by Indians Avinash Lakshman and Prashant Malik, Cassandra was initially used in [Facebook’s inbox search feature](https://m.facebook.com/nt/screen/?params=%7B%22note_id%22%3A10158772759272200%7D&path=%2Fnotes%2Fnote%2F&paipv=0&eav=AfYuSXXQPZ5fvm0_ScPdSlfj5BEFhRVT3iy_6Rsz7NZDbQ2vfq9opnedmTLSjG1aZBA&_rdr).
- Cassandra is an ideal mechanism for processing server logs, social media posts, PDF documents, and emails etc.
- [Amazon KeySpaces](../../2_AWSComponents/6_DatabaseServices/AmazonKeySpaces.md) can be used to deploy Casandra on AWS.
- Casandra is based on [Apache Hadoop](https://hadoop.apache.org/).

![img.png](https://www.scylladb.com/wp-content/uploads/Wide-column-Database-diagram.png)

# Why Casandra?

## Peer to Peer Architecture 
– There is no single point of failure in Cassandra, since it uses a P2P architecture, instead of master-slave architecture. 
- Any number of servers/nodes can be added to any Cassandra cluster in any of the data centers.

## Scalability
- Apache Cassandra has a high-performance, [high-availability](../0_SystemGlossaries/FaultTolerance&DisasterRecovery.md), [high-scalability architecture](../0_SystemGlossaries/Scalability.md).
- Cassandra cluster can be easily scaled-up or scaled-down. 
- Interestingly, any number of nodes can be added or deleted in the Cassandra cluster without much disturbance. 
- You don’t have to restart the cluster or change queries related to the Cassandra application while scaling up or down. 
- This is why Cassandra is popular for having a very high throughput for the highest number of nodes. 
- `As scaling happens, read and write throughput both increase simultaneously with zero downtime or any pause to the applications`.

## High-level data model
- This is column-oriented. 
- It means, Cassandra stores columns based on the column names, leading to very quick slicing. 
- Unlike traditional databases, where column names only consist of metadata, in `Cassandra column names can also consist of the actual data`.

## Consistency Models
- [Eventual Consistency Model](../../1_HLDDesignComponents/0_SystemGlossaries/ReplicationAndDataConsistency.md#consistency-patterns)
- [Strong Consistency Model](../../1_HLDDesignComponents/0_SystemGlossaries/ReplicationAndDataConsistency.md#consistency-patterns)

# Casandra Query Language (CGL)
- By default, Cassandra provides a prompt [Cassandra query language shell (cqlsh)](https://cassandra.apache.org/doc/latest/cassandra/tools/cqlsh.html) that allows users to communicate with it. 
- Using this shell, you can execute [Cassandra Query Language (CQL)](https://cassandra.apache.org/doc/latest/cassandra/cql/). 
- Using cqlsh, you can define a schema, insert data, and execute a query.
- `Cassandra does not support joins or subqueries` and therefore requires a developer to denormalize the data or duplicate data for efficient access.

# :star: Real world use cases of Casandra
- [Personalization at Spotify using Cassandra](https://engineering.atspotify.com/2015/01/personalization-at-spotify-using-cassandra/)

# References
- [Redis vs Apache Cassandra: Choosing Between These Real-Time Databases](https://www.upsolver.com/blog/redis-vs-apache-cassandra-choosing-between-these-real-time-databases)
- [Golang Cassandra Example](https://golangdocs.com/golang-cassandra-example)
- [Cassandra vs MongoDB Comparison](https://www.mongodb.com/compare/cassandra-vs-mongodb)