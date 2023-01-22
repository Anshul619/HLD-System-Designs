
| Basis                                                                                       | System Concern                                       | Applicable Tech     |
|---------------------------------------------------------------------------------------------|------------------------------------------------------|---------------------|
| :star: [Performance - Latency, Throughput](Scalability/LatencyThroughput.md)                | :rocket: [Scalability](Scalability/Readme.md)        | ALL                 |
| :star: [High Availability](Reliability/HighAvailability.md)                                 | :handshake: [Reliability](Reliability/Readme.md)     | ALL                 |
| [Fault Tolerance, Disaster Recovery](Reliability/FaultTolerance&DisasterRecovery.md)        | :handshake: [Reliability](Reliability/Readme.md)     | ALL                 |
| :star: [Load Balancer](Scalability/LoadBalancer.md)                                         | :rocket: [Scalability](Scalability/Readme.md)        | ALL                 |
| :star: [Servers Cluster](Scalability/ServersCluster.md)                                     | :rocket: [Scalability](Scalability/Readme.md)        | ALL                 |
| :star: [App Nodes Scalability](Scalability/AppNodesScalability.md)                          | :rocket: [Scalability](Scalability/Readme.md)        | App Service/Nodes   |
| [Rate Limiting](../../3_HLDDesignProblems/RateLimiterAPI/Readme.md)                         | Others                                               | App Service/Nodes   |
| [Content Delivery Network (CDN)](CDNs/CDNs.md)                                              | Others                                               | App Service/Nodes   |
| [Static Content](CDNs/StaticContentWithCDN.md)                                              | Others                                               | App Service/Nodes   |
| :star: [Event Driven Architecture](MessageBrokers/EventDrivenArchitecture.md)                              | Others                                               | Message Brokers     |
| :star: [DB Scalability](Scalability/DBScalability.md)                                       | :rocket: [Scalability](Scalability/Readme.md)        | Data Stores         |
| :star: [ACID Properties of the Transaction](Database/ACIDPropertyTransaction.md)            | Others                                               | Data Stores         |
| :star: [CAP Theorem of the Distributed Systems](Database/CAPTheorem.md)                     | Others                                               | Data Stores         |
| :star: [Replication & Data Consistency](Database/ReplicationAndDataConsistency.md)          | :handshake: [Reliability](Reliability/Readme.md)     | Data Stores         |
| [Atomicity](Database/Atomicity.md)                                                          | Others                                               | Data Stores         |
| [Durability](Database/Durability.md)                                                        | Others                                               | Data Stores         |
| [Append Only Data Structure](Database/AppendOnlyDataStructure.md)                           | Others                                               | Data Stores         |
| [Consistent Hashing](Database/ConsistentHashing.md)                                         | Others                                               | Data Stores         |

# Why System Reliability is so important?

In some cloud platforms such as [Amazon Web Services (AWS)](../../2_AWSComponents/Readme.md),
- It is fairly common for virtual machine instances to become unavailable without warning, as the platforms are designed to prioritize flexibility and elasticity over single-machine reliability.
- Hence, [Fault-Tolerance](Reliability/FaultTolerance&DisasterRecovery.md), [High Availability](Reliability/HighAvailability.md) plays an important role.

# Other Key Terminologies

| Term                        | Description                                                                                                                                             |
|-----------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Shared-nothing architecture](https://en.wikipedia.org/wiki/Shared-nothing_architecture) | Distributing load across multiple machines is also known as a [shared-nothing architecture](https://en.wikipedia.org/wiki/Shared-nothing_architecture). |
| [Elastic](https://www.merriam-webster.com/dictionary/elastic)                     | Elastic means that they can automatically add computing resources when they detect a load increase.                                                     |

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
- You send traffic to each by putting a [load balancer](Scalability/LoadBalancer.md) in front.
- That’s a proven and effective strategy that will take you far.

To name another example, let’s consider containers.
- [Container technologies](../6_ContainerOrchestrationServices/Readme.md), such as [Docker](../6_ContainerOrchestrationServices/Docker/Readme.md) and [Kubernetes](../6_ContainerOrchestrationServices/Kubernates.md), are everywhere.
- Spinning up a ton of containers based on automated triggers is something that [Kubernetes](../6_ContainerOrchestrationServices/Kubernates.md) excels at, especially if there’s no need to hold state.

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
| Traffic                 | Facilitates web traffic that is not very resource intensive. | Facilitates longer running processes that are very resource-intensive.                    |

[Read more](https://www.educative.io/answers/web-server-vs-application-server)

# Language Agnostic
- We should design the system considering agnostic feature (Language agnostic, AWS agnostic etc.) into the consideration.
- [Language Agnostic](https://en.wikipedia.org/wiki/Language-agnostic) programming or scripting (also called language-neutral, language-independent, or cross-language) is a software development paradigm where a particular language is chosen because of its appropriateness for a particular task (taking into consideration all factors, including ecosystem, developer skill-sets, performance, etc.), and not purely because of the skill-set available within a development team.

# Source(s) and further reading
- [How to build a multi-region active-active architecture on AWS](https://acloudguru.com/blog/engineering/why-and-how-do-we-build-a-multi-region-active-active-architecture)


