
| Basis                                                                                    | Applicable Components |
|------------------------------------------------------------------------------------------|-----------------------|
| :star: [Performance - Latency, Throughput](LatencyThroughput.md)                         | ALL                   |
| :star: [High Availability](HighAvailability.md)                                          | ALL                   |
| :star: [Servers Cluster](ServersCluster.md)                                              | ALL                   |
| [Reliability - Fault Tolerance, Disaster Recovery](FaultTolerance&DisasterRecovery.md)   | ALL                   |
| [Load Balancer](LoadBalancer.md)                                                         | ALL                   |
| :star: [App Nodes Scalability](Scalability/AppNodesScalability.md)                       | App Service/Nodes     |
| [Rate Limiting](../../3_HLDDesignProblems/RateLimiterAPI/Readme.md)                      | App Service/Nodes     |
| :star: [Container Orchestration Service](../6a_ContainerOrchestrationServices/Readme.md)   | App Service/Nodes     |
| [Content Delivery Network (CDN)](CDNs/CDNs.md)                                           | App Service/Nodes     |
| :star: [Event Driven Architecture](EventDrivenArchitecture.md)                           | Message Brokers       |
| :star: [DB Scalability](Scalability/DBScalability.md)                                    | Data Stores           |
| :star: [ACID Properties of the Transaction](ACIDPropertyTransaction.md)                  | Data Stores           |
| :star: [CAP Theorem of the Distributed Systems](CAPTheorem.md)                           | Data Stores           |
| :star: [Replication & Data Consistency](ReplicationLagAndDataConsistency.md)                | Data Stores           |
| [Atomicity](Atomicity.md)                                                                | Data Stores           |
| [Durability](Durability.md)                                                              | Data Stores           |
| [Static Content](CDNs/StaticContentWithCDN.md)                                           | Data Stores           |
| [Append Only Data Structure](AppendOnlyDataStructure.md)                                 | Data Stores           |
| [Consistent Hashing](ConsistentHashing.md)                                               | Data Stores           |

# Different Storage Types

![img.png](https://www.ctera.com/wp-content/uploads/2019/02/Ctera-Cool-Medium-Hot-Graphic-051122.jpg)

## Hot Storage
- [Hot storage](https://www.ctera.com/company/blog/differences-hot-warm-cold-file-storage/) is data that is accessed frequently.
- This could be data that is being actively used by employees or customers.
- It needs to be stored on fast storage (like `SSD`) so that it can be accessed quickly.
- Examples - [Amazon Dynamo DB](../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md), [Amazon Aurora](../../2_AWSComponents/6_DatabaseServices/AmazonRDSAurora)

## Warm Storage
- [Warm storage](https://www.ctera.com/company/blog/differences-hot-warm-cold-file-storage/) (like `HDD`) is data that is accessed less frequently.
- This could be data that is used for reporting or analytics.
- It doesn’t need to be accessed as quickly as hot data, so it can be stored on slightly slower, capacity-optimized.

## Cold Storage
- [Cold storage](https://www.ctera.com/company/blog/differences-hot-warm-cold-file-storage/) is data that is rarely accessed.
- This could be data that is archived for compliance reasons.
- It can be stored on even slower, `cheap and deep` storage. (like `Object Storage`)
- Example - [Amazon S3](../../2_AWSComponents/7_StorageServices/AmazonS3.md)

# Stateful vs Stateless

## :star: Stateless Protocol
- [Stateless Protocol](https://www.geeksforgeeks.org/difference-between-stateless-and-stateful-protocol/) does not require the server to retain the server information or session details.
- In a stateless architecture, the server must treat all client requests independently of prior requests or sessions, and should not store any session information locally.
- Stateless applications can scale horizontally, since any request can be handled by any available computing resources (e.g. instances, containers or functions).
- Sharing state with any instances, containers, or functions is possible by using in-memory object caching systems like [Redis](../3_DatabaseComponents/In-Memory-Cache/Redis) or distributed databases like [Cassandra](../3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md) or [Amazon DynamoDB](../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md), depending on the structure of the object and the requirements in terms of performances.

Statelessness - REST APIs
- A system without state is much easier to scale.
- Imagine you have a web server serving requests.
- If you follow [RESTful principles](../2_APITechOptions/REST.md), these servers will be stateless.
- That means that you scale up horizontally by adding extra instances.
- You send traffic to each by putting a [load balancer](LoadBalancer.md) in front.
- That’s a proven and effective strategy that will take you far.

To name another example, let’s consider containers.
- [Container technologies](../6a_ContainerOrchestrationServices/Readme.md), such as [Docker](../6a_ContainerOrchestrationServices/Docker/Readme.md) and [Kubernetes](../6a_ContainerOrchestrationServices/Kubernates.md), are everywhere.
- Spinning up a ton of containers based on automated triggers is something that [Kubernetes](../6a_ContainerOrchestrationServices/Kubernates.md) excels at, especially if there’s no need to hold state.

## Stateful Protocol
- [Stateful Protocol](https://www.geeksforgeeks.org/difference-between-stateless-and-stateful-protocol/) requires server to save the status and session information.

# Domain Driven Architecture
- [Domain Driven Architecture](https://www.geeksforgeeks.org/domain-driven-design-ddd/) - When we are developing software our focus should not be primarily on technology, rather it should be primarily on business/domain.
- Classes, modals, services, microservices, rest apis etc. should be designed according to the domains.

# Web vs App Server

| Features                | Web Server                                                   | App Server                                                                                |
|-------------------------|--------------------------------------------------------------|-------------------------------------------------------------------------------------------|
| Content Type            | Deliver static content.                                      | Delivers dynamic content.                                                                 |
| Protocol                | Content is delivered using the HTTP protocol only.           | Provides business logic to application programs using several protocols (including HTTP). |
| App Type                | Serves only web-based applications.                          | Can serve web and enterprise-based applications.                                          |
| Multi-Threading Support | No support for multi-threading.                              | Uses multi-threading to support multiple requests in parallel.                            |
| Traffic                 | Facilitates web traffic that is not very resource intensive. | Facilitates longer running processes that are very resource-intensive​.                   |

[Read more](https://www.educative.io/answers/web-server-vs-application-server)

# Language Agnostic
- We should design the system considering agnostic feature (Language agnostic, AWS agnostic etc.) into the consideration.
- [Language Agnostic](https://en.wikipedia.org/wiki/Language-agnostic) programming or scripting (also called language-neutral, language-independent, or cross-language) is a software development paradigm where a particular language is chosen because of its appropriateness for a particular task (taking into consideration all factors, including ecosystem, developer skill-sets, performance, etc.), and not purely because of the skill-set available within a development team.

# Source(s) and further reading
- [How to build a multi-region active-active architecture on AWS](https://acloudguru.com/blog/engineering/why-and-how-do-we-build-a-multi-region-active-active-architecture)


