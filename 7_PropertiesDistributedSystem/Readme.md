
# Key Properties of Distributed Systems

| Basis                                                                                                      | Service Type      | System Concern                                                       |
|------------------------------------------------------------------------------------------------------------|-------------------|----------------------------------------------------------------------|
| :star: [Performance - Latency, Throughput](Scalability/LatencyThroughput.md) | ALL               | :rocket: [Scalability](Scalability)    |
| :star: [High Availability](Reliability/HighAvailability.md)                  | ALL               | :handshake: [Reliability](Reliability) |
| [Fault Tolerance, Disaster Recovery](Reliability/FaultTolerance.md)          | ALL               | :handshake: [Reliability](Reliability) |
| :star: [Load Balancer](Scalability/LoadBalancer.md)                          | ALL               | :rocket: [Scalability](Scalability)    |
| :star: [Servers Cluster](Scalability/ServersCluster.md)                      | ALL               | :rocket: [Scalability](Scalability)    |
| [Rate Limiting](../0_HLDUseCasesProblems/RateLimiterAPI/Readme.md)                                            | App Service/Nodes | Others                                                               |
| [Content Delivery Network (CDN)](CDNs/CDNs.md)                               | App Service/Nodes | Others                                                               |
| [Static Content](CDNs/StaticContent.md)                                      | App Service/Nodes | Others                                                               |
| :star: [Event Driven Architecture](../5_MessageBrokers/EventDrivenArchitecture.md)                            | Message Brokers   | Others                                                               |
| :star: [Point to Point Model](../5_MessageBrokers/PatternsModels.md/PointToPointModel.md)                     | Message Brokers   | Others                                                               |
| :star: [Publish Subscriber Model](../5_MessageBrokers/PatternsModels.md/PubSubModel.md)                       | Message Brokers   | Others                                                               |
| :star: [Indexing](../3_DatabaseServices/DataStructuresUsedInDB/Indexing/Readme.md)                            | Databases         | :rocket: [Scalability](Scalability)    |
| :star: [DB Scalability](../3_DatabaseServices/ScalabilityDB.md)                                               | Databases         | :rocket: [Scalability](Scalability)    |
| :star: [ACID Properties of the Transaction](../3_DatabaseServices/ACIDTransactions/Readme.md)                 | Databases         | Others                                                               |
| :star: [PACELC Theorem of the Distributed Systems](../3_DatabaseServices/CAP&PACELCTheorems/Readme.md)        | Databases         | Others                                                               |
| :star: [Replication](../3_DatabaseServices/Consistency&Replication/Replication.md)                            | Databases         | :handshake: [Reliability](Reliability) |
| :star: [Consistency Patterns](../3_DatabaseServices/Consistency&Replication/Readme.md)                        | Databases         | :handshake: [Reliability](Reliability) |
| [Data Structures in DB](../3_DatabaseServices/DataStructuresUsedInDB/Readme.md)                               | Databases         | :rocket: [Scalability](Scalability)    |
| [Partitioning/Sharding](../3_DatabaseServices/PartitioningSharding/Readme.md)                                 | Databases         | :rocket: [Scalability](Scalability)    |
| [Storage Options](../11_FileStorageServicesHDFS/StorageOptions.md)                                            | Databases         | :rocket: [Scalability](Scalability)    |
| [Change Data Capture](../3_DatabaseServices/ChangeDataCapture/Readme.md)                                      | Databases         | Others                                                               |

# References
- [How to build a multi-region active-active architecture on AWS](https://acloudguru.com/blog/engineering/why-and-how-do-we-build-a-multi-region-active-active-architecture)
- [Dealing with Modern Distributed Systems: A Primer](https://thinkingoutcloud.org/2021/01/19/dealing-with-modern-distributed-systems-a-primer/)


