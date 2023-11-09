
| Basis                                                                                                             | Service Type      | System Concern                                  |
|-------------------------------------------------------------------------------------------------------------------|-------------------|-------------------------------------------------|
| :star: [Performance - Latency, Throughput](Scalability/LatencyThroughput.md)                                      | ALL               | :rocket: [Scalability](Scalability)   |
| :star: [High Availability](Reliability/HighAvailability.md)                                                       | ALL               | :handshake: [Reliability](Reliability) |
| [Fault Tolerance, Disaster Recovery](Reliability/FaultTolerance.md)                                               | ALL               | :handshake: [Reliability](Reliability) |
| :star: [Load Balancer](Scalability/LoadBalancer.md)                                                               | ALL               | :rocket: [Scalability](Scalability)   |
| :star: [Servers Cluster](Scalability/ServersCluster.md)                                                           | ALL               | :rocket: [Scalability](Scalability)   |
| :star: [App Nodes Scalability](Scalability/AppNodesScalability.md)                                                | App Service/Nodes | :rocket: [Scalability](Scalability)   |
| [Rate Limiting](../0_HLDUseCasesProblems/RateLimiterAPI/Readme.md)                                               | App Service/Nodes | Others                                          |
| [Content Delivery Network (CDN)](CDNs/CDNs.md)                                                                    | App Service/Nodes | Others                                          |
| [Static Content](CDNs/StaticContentWithCDN.md)                                                                    | App Service/Nodes | Others                                          |
| :star: [Event Driven Architecture](../5_MicroServicesSOA/EventDrivenArchitecture.md)                              | Message Brokers   | Others                                          |
| :star: [Point to Point Model](../7_MessageBrokers/Glossaries/PointToPointModel.md)                                | Message Brokers   | Others                                          |
| :star: [Publish Subscriber Model](../7_MessageBrokers/Glossaries/PubSubModel.md)                                  | Message Brokers   | Others                                          |
| :star: [Indexing](../6_DatabaseServices/DataStructuresDB/Indexing/Readme.md)                                  | Data Stores       | :rocket: [Scalability](Scalability)   |
| :star: [DB Scalability](../6_DatabaseServices/Glossaries/ScalabilityDB.md)                                    | Data Stores       | :rocket: [Scalability](Scalability)   |
| :star: [ACID Properties of the Transaction](../6_DatabaseServices/Glossaries/ACIDTransactions/Readme.md)      | Data Stores       | Others                                          |
| :star: [CAP Theorem of the Distributed Systems](../6_DatabaseServices/Glossaries/PACELCTheorem/CAPTheorem.md) | Data Stores       | Others                                          |
| :star: [Replication](../6_DatabaseServices/Glossaries/Consistency&Replication/Replication.md)                 | Data Stores       | :handshake: [Reliability](Reliability) |
| :star: [Consistency Patterns](../6_DatabaseServices/Glossaries/Consistency&Replication/Readme.md)             | Data Stores       | :handshake: [Reliability](Reliability) |
| [Atomicity](../6_DatabaseServices/Glossaries/ACIDTransactions/Atomicity.md)                                   | Data Stores       | Others                                          |
| [Durability](../6_DatabaseServices/Glossaries/ACIDTransactions/Durability.md)                                 | Data Stores       | Others                                          |
| [Append Only Data Structure](../6_DatabaseServices/DataStructuresDB/AppendOnlyProperty.md)                    | Data Stores       | :rocket: [Scalability](Scalability)   |
| [Partitioning/Sharding](../6_DatabaseServices/Glossaries/PartioningSharding.md)                               | Data Stores       | Others                                          |
| [Storage Options](../6_DatabaseServices/Glossaries/StorageOptions.md)                                         | Data Stores       | :rocket: [Scalability](Scalability)   |
| [OLTP vs OTAP](../6_DatabaseServices/Glossaries/OLTPvsOTAP.md)                                                | Data Stores       | Others                                          |
| [Change Data Capture](../6_DatabaseServices/Glossaries/ChangeDataCapture.md)                                  | Data Stores       | Others                                          |

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


