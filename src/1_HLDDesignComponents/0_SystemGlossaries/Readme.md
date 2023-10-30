
| Basis                                                                                                      | Service Type      | System Concern                                   |
|------------------------------------------------------------------------------------------------------------|-------------------|--------------------------------------------------|
| :star: [Performance - Latency, Throughput](Scalability/LatencyThroughput.md)                               | ALL               | :rocket: [Scalability](Scalability/Readme.md)    |
| :star: [High Availability](Reliability/HighAvailability.md)                                                | ALL               | :handshake: [Reliability](Reliability/Readme.md) |
| [Fault Tolerance, Disaster Recovery](Reliability/FaultTolerance.md)                                        | ALL               | :handshake: [Reliability](Reliability/Readme.md) |
| :star: [Load Balancer](Scalability/LoadBalancer.md)                                                        | ALL               | :rocket: [Scalability](Scalability/Readme.md)    |
| :star: [Servers Cluster](Scalability/ServersCluster.md)                                                    | ALL               | :rocket: [Scalability](Scalability/Readme.md)    |
| :star: [App Nodes Scalability](Scalability/AppNodesScalability.md)                                         | App Service/Nodes | :rocket: [Scalability](Scalability/Readme.md)    |
| [Rate Limiting](../../3_HLDDesignProblems/RateLimiterAPI/Readme.md)                                        | App Service/Nodes | Others                                           |
| [Content Delivery Network (CDN)](CDNs/CDNs.md)                                                             | App Service/Nodes | Others                                           |
| [Static Content](CDNs/StaticContentWithCDN.md)                                                             | App Service/Nodes | Others                                           |
| :star: [Event Driven Architecture](../4_MessageBrokers/MessageBrokers/EventDrivenArchitecture.md)          | Message Brokers   | Others                                           |
| :star: [Point to Point Model](../4_MessageBrokers/MessageBrokers/PointToPointModel.md)                     | Message Brokers   | Others                                           |
| :star: [Publish Subscriber Model](../4_MessageBrokers/MessageBrokers/PubSubModel.md)                       | Message Brokers   | Others                                           |
| :star: [Indexing](../3_DatabaseComponents/2_DataStructuresDB/Indexing/Readme.md)                                          | Data Stores       | :rocket: [Scalability](Scalability/Readme.md)    |
| :star: [DB Scalability](../3_DatabaseComponents/1_Glossaries/ScalabilityDB.md)                               | Data Stores       | :rocket: [Scalability](Scalability/Readme.md)    |
| :star: [ACID Properties of the Transaction](../3_DatabaseComponents/1_Glossaries/ACIDTransactions/Readme.md) | Data Stores       | Others                                           |
| :star: [CAP Theorem of the Distributed Systems](../3_DatabaseComponents/1_Glossaries/PACELCTheorem/CAPTheorem.md)          | Data Stores       | Others                                           |
| :star: [Replication](../3_DatabaseComponents/1_Glossaries/Consistency&Replication/Replication.md)            | Data Stores       | :handshake: [Reliability](Reliability/Readme.md) |
| :star: [Consistency Patterns](../3_DatabaseComponents/1_Glossaries/Consistency&Replication/Readme.md)   | Data Stores       | :handshake: [Reliability](Reliability/Readme.md) |
| [Atomicity](../3_DatabaseComponents/1_Glossaries/ACIDTransactions/Atomicity.md)                                               | Data Stores       | Others                                           |
| [Durability](../3_DatabaseComponents/1_Glossaries/ACIDTransactions/Durability.md)                                             | Data Stores       | Others                                           |
| [Append Only Data Structure](../3_DatabaseComponents/2_DataStructuresDB/AppendOnlyProperty.md)                | Data Stores       | :rocket: [Scalability](Scalability/Readme.md)    |
| [Partitioning/Sharding](../3_DatabaseComponents/1_Glossaries/PartioningSharding.md)                          | Data Stores       | Others                                           |
| [Storage Options](../3_DatabaseComponents/1_Glossaries/StorageOptions.md)                                    | Data Stores       | :rocket: [Scalability](Scalability/Readme.md)    |
| [OLTP vs OTAP](../3_DatabaseComponents/1_Glossaries/OLTPvsOTAP.md)                                           | Data Stores       | Others                                           |
| [Change Data Capture](../3_DatabaseComponents/1_Glossaries/ChangeDataCapture.md)                             | Data Stores       | Others                                           |

# Other Key Terminologies

| Term                                                                                     | Description                                                                                                                                             |
|------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Shared-nothing architecture](https://en.wikipedia.org/wiki/Shared-nothing_architecture) | Distributing load across multiple machines is also known as a [shared-nothing architecture](https://en.wikipedia.org/wiki/Shared-nothing_architecture). |
| [Elastic](https://www.merriam-webster.com/dictionary/elastic)                            | Elastic means that they can automatically add computing resources when they detect a load increase.                                                     |

# Web vs App Server

| Features                | Web Server                                                   | App Server                                                                                |
|-------------------------|--------------------------------------------------------------|-------------------------------------------------------------------------------------------|
| Content Type            | Deliver static content.                                      | Delivers dynamic content.                                                                 |
| Protocol                | Content is delivered using the HTTP protocol only.           | Provides business logic to application programs using several protocols (including HTTP). |
| App Type                | Serves only web-based applications.                          | Can serve web and enterprise-based applications.                                          |
| Multi-Threading Support | No support for multi-threading.                              | Uses multi-threading to support multiple requests in parallel.                            |
| Traffic                 | Facilitates web traffic that is not very resource intensive. | Facilitates longer running processes that are very resource-intensive.                    |

[Read more](https://www.educative.io/answers/web-server-vs-application-server)

# Language Agnostic
- We should design the system considering agnostic feature (Language agnostic, AWS agnostic etc.) into the consideration.
- [Language Agnostic](https://en.wikipedia.org/wiki/Language-agnostic) programming or scripting (also called language-neutral, language-independent, or cross-language) is a software development paradigm where a particular language is chosen because of its appropriateness for a particular task (taking into consideration all factors, including ecosystem, developer skill-sets, performance, etc.), and not purely because of the skill-set available within a development team.

# Source(s) and further reading
- [How to build a multi-region active-active architecture on AWS](https://acloudguru.com/blog/engineering/why-and-how-do-we-build-a-multi-region-active-active-architecture)
- [Dealing with Modern Distributed Systems: A Primer](https://thinkingoutcloud.org/2021/01/19/dealing-with-modern-distributed-systems-a-primer/)


