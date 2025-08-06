# Apache Casandra
- [Apache Cassandra](https://cassandra.apache.org/_/index.html) is a free and open-source, distributed & [wide column store]().
- It is a NoSQL database management system designed to handle large amounts of data across many commodity servers, providing [high availability with no single point of failure](../../7a_HighAvailability/FaultTolerance.md). 
- [Amazon KeySpaces](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonKeySpaces.md) can be used to deploy Casandra on AWS.
- :star: [DynamoDB vs Casandra vs MongoDB](../DynamoDBVsMongoDBVsCasandra.md)

![](https://www.scylladb.com/wp-content/uploads/Wide-column-Database-diagram.png)

# Features

| Feature                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
|--------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: Low-Latency, Faster Writes                | Since writes in Casandra result in storage in an [append-only structure](../5_Database-Internals/AppendOnlyProperty.md), writes are generally very fast.<br/>- Casandra provides [low latency](../../7_Scalability/Latency.md), at the cost of [consistency](../4_Consistency-Replication/Readme.md).<br/>- Refer [PACELC theorem](../2_CAP-PACELC-Theorems/Readme.md) for more info.                                                                                                                                                                                        |
| Rich data model                                  | [This is column-oriented]().<br/>- It means, Cassandra stores columns based on the column names, leading to very quick slicing.<br/>- Unlike traditional databases, where column names only consist of metadata, in Cassandra, column names can also consist of the actual data.                                                                                                                                                                                                                                                                                           |
| Peer to Peer Architecture                        | There is no single point of failure in Cassandra, since it uses a P2P architecture ([Leaderless replication](../4_Consistency-Replication/Replication.md)).<br/>- Any number of servers/nodes can be added to any Cassandra cluster in any of the data centers.                                                                                                                                                                                                                                                                                                            |
| High Availability, Fault-Tolerance               | Apache Casandra provides [high-availability](../../7a_HighAvailability/Readme.md) & [fault-tolerance](../../7a_HighAvailability/FaultTolerance.md) with tunable consistency levels.<br/>- Any number of nodes can be added or deleted in the Cassandra cluster without much disturbance.<br/>- As scaling happens, [read and write throughput](../../7_Scalability/Throughput.md) both increase simultaneously with zero downtime or any pause to the applications.                                                                                                        |
| Scales Horizontally & Linearly                   | Apache Cassandra has a [high-scalability architecture](../3_Scalability-Techniques/Readme.md).<br/>- [Cassandra cluster](../../7_Scalability/ServersCluster.md) can be easily scaled-up or scaled-down.<br/>- Generally doubling the size of the cluster, would result in the half [latency](../../7_Scalability/Latency.md) (both at the median and 99th percentile).                                                                                                                                                                                                      |
| Support replication - Cross-site, Data-Centers   | Cassandra offers robust support for [clusters spanning multiple data centers](../../7_Scalability/ServersCluster.md), with [asynchronous leaderless replication]() allowing low latency operations for all clients.                                                                                                                                                                                                                                                                                                                                                        |
| Integration with systems (like Spark, HDFS etc.) | Cassandra offers options for bulk importing data from other data sources (such as [HDFS](../../11_FileStorages/ApacheHDFS.md)) into the Cassandra cluster by building entire [SSTables](../5_Database-Internals/Readme.md) and then streaming the tables into the cluster.<br/>- Streaming the tables into the cluster is much simpler, faster and more efficient than sending millions or more of individual INSERT statements for all the data you want to load into Cassandra.                                                                                           |
| Supported Consistency Patterns                   | [Eventual Consistency Model](../4_Consistency-Replication/Readme.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| Casandra Query Language (CGL)                    | By default, Cassandra provides a prompt [Cassandra query language shell (cqlsh)](https://cassandra.apache.org/doc/latest/cassandra/tools/cqlsh.html) that allows users to communicate with it.<br/>- Using this shell, you can execute [Cassandra Query Language (CQL)](https://cassandra.apache.org/doc/latest/cassandra/cql/).<br/>- Using cqlsh, you can define a schema, insert data, and execute a query.<br/>- **Cassandra does not support joins or subqueries** and therefore requires a developer to denormalize the data or duplicate data for efficient access. |

# :star: Ideal Use Cases

| Use Case                                                                                        |
|-------------------------------------------------------------------------------------------------|
| High-Write, Low-Read use cases                                                                  |
| Historical records                                                                              |
| Processing server logs                                                                          |
| Social media posts                                                                              |
| PDF documents                                                                                   |
| Emails                                                                                          |
| [Time Series Data (with JSON as value)](https://docs.datastax.com/en/tutorials/Time_Series.pdf) |

# :star: Real world use cases of Casandra

## Personalization at Spotify using Cassandra

![](../../../Real-World-Tech-Stacks/Spotify/PersonalizationSpotify.drawio.png)

[Read more](../../../Real-World-Tech-Stacks/Spotify/Readme.md)

## Social Network Design Problem - User Entities like Posts, Comments etc.

![](../../0_UseCaseDesigns/SocialNetworkFacebookInstagram/SocialNetworkDesignProblemHLD.png)

[Read more](../../0_UseCaseDesigns/SocialNetworkFacebookInstagram/Readme.md)

## Flight Booking design problem - Search

![](../../0_UseCaseDesigns/FlightBookingSearchMakeMyTrip/MakeMyTripFlightSearch.drawio.png)

[Read more](../../0_UseCaseDesigns/FlightBookingSearchMakeMyTrip/Readme.md))

## Other UCs
- [How Uber Manages a Million Writes Per Second Using Mesos and Cassandra Across Multiple Datacenters?](../../../Real-World-Tech-Stacks/Uber/UberCasandraMesos)
- [Netflix - Casandra - Time Series Data](../../../Real-World-Tech-Stacks/Netflix/Readme.md)
- [Directi uses Casandra to save HeatMaps (UI activities)](../../../Real-World-Tech-Stacks/DirectI.md)
- [Instagram - Social Media Posts](../../../Real-World-Tech-Stacks/Instagram/Readme.md)
- [Twillo - Send Message API Design Problem](../../0_UseCaseDesigns/SendSMSMessageAPITwillo/Readme.md)
- [Twitter Hit Counter](../../0_UseCaseDesigns/HitCounterDesignTwitter/Readme.md)
- [Discord Migrates Trillions of Messages from Cassandra to ScyllaDB](https://www.infoq.com/news/2023/06/discord-cassandra-scylladb/)

# History - Built by Facebook
- Facebook originally built Cassandra to power its [Inbox search feature](https://m.facebook.com/nt/screen/?params=%7B%22note_id%22%3A10158772759272200%7D&path=%2Fnotes%2Fnote%2F&paipv=0&eav=AfYuSXXQPZ5fvm0_ScPdSlfj5BEFhRVT3iy_6Rsz7NZDbQ2vfq9opnedmTLSjG1aZBA&_rdr), with over 200 nodes deployed.
- This was abandoned in late 2010 when they built Facebook Messaging platform on [Apache HBase](ApacheHBase.md) as they [found Cassandra's eventual consistency model to be a difficult pattern](../4_Consistency-Replication/Readme.md).
- [Read more](https://www.quora.com/Does-Facebook-use-Apache-Cassandra).

# Sample Apps
- [Example: Deploying Cassandra with a StatefulSet](https://kubernetes.io/docs/tutorials/stateful-application/cassandra/)
- [Building a Performant API using Go and Cassandra](https://getstream.io/blog/building-a-performant-api-using-go-and-cassandra/)

# References
- [Golang Cassandra Example](https://golangdocs.com/golang-cassandra-example)
- [Does-Facebook-use-Apache-Cassandra](https://www.quora.com/Does-Facebook-use-Apache-Cassandra)
- [Casandra - Storage engine](https://docs.datastax.com/en/cassandra-oss/3.x/cassandra/dml/dmlManageOndisk.html)