# Apache Casandra
- [Apache Cassandra](https://cassandra.apache.org/_/index.html) is a free and open-source, distributed & [wide column store](../Readme.md).
- It is a NoSQL database management system designed to handle large amounts of data across many commodity servers, providing [high availability with no single point of failure](../../../7_PropertiesDistributedSystem/Reliability/FaultTolerance.md). 
- [Amazon KeySpaces](../../../2_AWSServices/6_DatabaseServices/AmazonKeySpaces.md) can be used to deploy Casandra on AWS.
- :star: [Casandra vs MongoDB](../DynamoDBVsMongoDBVsCasandra.md)

![](https://www.scylladb.com/wp-content/uploads/Wide-column-Database-diagram.png)

# Features

| Feature                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
|--------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: Low-Latency, Faster Writes                | Since writes in Casandra result in storage in an [append-only structure](../../Glossaries/DataStructuresDB/AppendOnlyProperty.md), writes are generally very fast.<br/>- Casandra provides [low latency](../../../7_PropertiesDistributedSystem/Scalability/LatencyThroughput.md), at the cost of [consistency](../../Glossaries/Consistency&Replication/Readme.md).<br/>- Refer [PACELC theorem](../../Glossaries/PACELCTheorem/Readme.md) for more info.                                                                                                                                                                                                                      |
| Rich data model                                  | [This is column-oriented](../Readme.md).<br/>- It means, Cassandra stores columns based on the column names, leading to very quick slicing.<br/>- Unlike traditional databases, where column names only consist of metadata, in Cassandra, column names can also consist of the actual data.                                                                                                                                                                                                                                                                                                                                             |
| Peer to Peer Architecture                        | There is no single point of failure in Cassandra, since it uses a P2P architecture ([Leaderless replication](../../Glossaries/Consistency&Replication/Replication.md)).<br/>- Any number of servers/nodes can be added to any Cassandra cluster in any of the data centers.                                                                                                                                                                                                                                                                                                                                                                               |
| High Availability, Fault-Tolerance               | Apache Casandra provides [high-availability](../../../7_PropertiesDistributedSystem/Reliability/HighAvailability.md) & [fault-tolerance](../../../7_PropertiesDistributedSystem/Reliability/FaultTolerance.md) with tunable consistency levels.<br/>- Any number of nodes can be added or deleted in the Cassandra cluster without much disturbance.<br/>- As scaling happens, [read and write throughput](../../../7_PropertiesDistributedSystem/Scalability/LatencyThroughput.md) both increase simultaneously with zero downtime or any pause to the applications.<br/>- You don’t have to restart the cluster or change queries related to the Cassandra application while scaling up or down. |
| Scales Horizontally & Linearly                   | Apache Cassandra has a [high-scalability architecture](../../Glossaries/ScalabilityDB.md).<br/>- [Cassandra cluster](../../../7_PropertiesDistributedSystem/Scalability/ServersCluster.md) can be easily scaled-up or scaled-down.<br/>- Generally doubling the size of the cluster, would result in the half [latency](../../../7_PropertiesDistributedSystem/Scalability/LatencyThroughput.md) (both at the median and 99th percentile).                                                                                                                                                                                                                                            |
| Support replication - Cross-site, Data-Centers   | Cassandra offers robust support for [clusters spanning multiple data centers](../../../7_PropertiesDistributedSystem/Scalability/ServersCluster.md), with [asynchronous leaderless replication]() allowing low latency operations for all clients.                                                                                                                                                                                                                                                                                                                                                                                                                     |
| Integration with systems (like Spark, HDFS etc.) | Cassandra offers options for bulk importing data from other data sources (such as [HDFS](../../../11_FileStorageServicesHDFS/ApacheHDFS.md)) into the Cassandra cluster by building entire [SSTables](../../Glossaries/DataStructuresDB/Readme.md) and then streaming the tables into the cluster.<br/>- Streaming the tables into the cluster is much simpler, faster and more efficient than sending millions or more of individual INSERT statements for all the data you want to load into Cassandra.                                                                                                                                         |
| Supported Consistency Patterns                   | [Eventual Consistency Model](../../Glossaries/Consistency&Replication/Readme.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| Casandra Query Language (CGL)                    | By default, Cassandra provides a prompt [Cassandra query language shell (cqlsh)](https://cassandra.apache.org/doc/latest/cassandra/tools/cqlsh.html) that allows users to communicate with it.<br/>- Using this shell, you can execute [Cassandra Query Language (CQL)](https://cassandra.apache.org/doc/latest/cassandra/cql/).<br/>- Using cqlsh, you can define a schema, insert data, and execute a query.<br/>- `Cassandra does not support joins or subqueries` and therefore requires a developer to denormalize the data or duplicate data for efficient access.                                                                                 |

# :star: Ideal Use Cases

| Use Case                                                                             |
|--------------------------------------------------------------------------------------|
| Historical records                                                                   |
| [High-Write, Low-Read](../../../7_PropertiesDistributedSystem/Scalability/LatencyThroughput.md) |
| Processing server logs                                                               |
| Social media posts                                                                   |
| PDF documents                                                                        |
| Emails etc.                                                                          |
| Time Series Data                                                                     |

# :star: Real world use cases of Casandra

## Personalization at Spotify using Cassandra

![](../../../1_TechStacks/PersonalizationSpotify/PersonalizationSpotify.drawio.png)

[Read more](../../../1_TechStacks/PersonalizationSpotify)

## Social Network Design Problem - User Entities like Posts, Comments etc.

![](../../../0_HLDUseCasesProblems/SocialNetworkFacebookInstagram/SocialNetworkDesignProblemHLD.png)

[Read more](../../../0_HLDUseCasesProblems/SocialNetworkFacebookInstagram/Readme.md)

## Flight Booking design problem - Search

![](../../../0_HLDUseCasesProblems/FlightBookingSearchMakeMyTrip/MakeMyTripFlightSearch.drawio.png)

[Read more](../../../0_HLDUseCasesProblems/FlightBookingSearchMakeMyTrip/Readme.md))

## Other UCs
- [How Uber Manages a Million Writes Per Second Using Mesos and Cassandra Across Multiple Datacenters?](../../../1_TechStacks/Uber/UberCasandraMesos)
- [Netflix - Casandra - Time Series Data](../../../1_TechStacks/NetflixTechStack.md)
- [Directi uses Casandra to save HeatMaps (UI activities)](../../../1_TechStacks/DirectITechStack.md)
- [Instagram - Casandra - Social Media Posts](../../../1_TechStacks/InstagramTechStack.md)
- [Twillo - Send Message API Design Problem](../../../0_HLDUseCasesProblems/SendSMSMessageAPITwillo/Readme.md)
- [Twitter Hit Counter](../../../0_HLDUseCasesProblems/HitCounterDesignTwitter/Readme.md)

# Casandra's invention history - Facebook
- Facebook originally built Cassandra to power its [Inbox search feature](https://m.facebook.com/nt/screen/?params=%7B%22note_id%22%3A10158772759272200%7D&path=%2Fnotes%2Fnote%2F&paipv=0&eav=AfYuSXXQPZ5fvm0_ScPdSlfj5BEFhRVT3iy_6Rsz7NZDbQ2vfq9opnedmTLSjG1aZBA&_rdr), with over 200 nodes deployed.
- This was abandoned in late 2010 when they built Facebook Messaging platform on [Apache HBase](ApacheHBase.md) as they [found Cassandra's eventual consistency model to be a difficult pattern](../../Glossaries/Consistency&Replication/Readme.md).
- [Read more](https://www.quora.com/Does-Facebook-use-Apache-Cassandra).

# Sample Apps
- [Example: Deploying Cassandra with a StatefulSet](https://kubernetes.io/docs/tutorials/stateful-application/cassandra/)
- [Building a Performant API using Go and Cassandra](https://getstream.io/blog/building-a-performant-api-using-go-and-cassandra/)

# References
- [Golang Cassandra Example](https://golangdocs.com/golang-cassandra-example)
- [Does-Facebook-use-Apache-Cassandra](https://www.quora.com/Does-Facebook-use-Apache-Cassandra)
- [Casandra - Storage engine](https://docs.datastax.com/en/cassandra-oss/3.x/cassandra/dml/dmlManageOndisk.html)