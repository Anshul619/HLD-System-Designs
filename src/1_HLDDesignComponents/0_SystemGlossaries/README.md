
# Key Characteristics of Distributed Systems

| Basis                                                                                  | Applicable Components              |
|----------------------------------------------------------------------------------------|------------------------------------|
| :star: [Efficiency - Latency, Throughput](LatencyThroughput.md)                        | ALL                                |
| :star: [Scalability](Scalability.md)                                                   | ALL                                |
| :star: [High Availability](HighAvailability.md)                                        | ALL                                |
| [Reliability - Fault Tolerance, Disaster Recovery](FaultTolerance&DisasterRecovery.md) | ALL                                |
| [Load Balancer](LoadBalancer.md)                                                       | ALL                                |
| :star: [Servers Cluster](ServersCluster.md)                                            | `Data Stores` or `Message Brokers` |
| :star: [Event Driven Architecture](EventDrivenArchitecture.md)                         | `Message Brokers`                  |
| :star: [ACID Properties of the Transaction](ACIDPropertyTransaction.md)                | `Data Stores`                      |
| :star: [CAP Theorem of the Distributed Systems](CAPTheorem.md)                         | `Data Stores`                      |
| :star: [Replication & Data Consistency](ReplicationAndDataConsistency.md)              | `Data Stores`                      |
| [Atomicity](Atomicity.md)                                                              | `Data Stores`                      |
| [Durability](Durability.md)                                                            | `Data Stores`                      |
| [Content Delivery Network (CDN)](CDNs.md)                                              | `Static Content`                    |

# [Language Agnostic](https://en.wikipedia.org/wiki/Language-agnostic)
- We should design the system considering agnostic feature (Language agnostic, AWS agnostic etc.) into the consideration.
- Language-agnostic programming or scripting (also called language-neutral, language-independent, or cross-language) is a software development paradigm where a particular language is chosen because of its appropriateness for a particular task (taking into consideration all factors, including ecosystem, developer skill-sets, performance, etc.), and not purely because of the skill-set available within a development team.

# Stateful vs Stateless

## Stateless Protocol
- [Stateless Protocol](https://www.geeksforgeeks.org/difference-between-stateless-and-stateful-protocol/) does not require the server to retain the server information or session details.
- In a stateless architecture, the server must treat all client requests independently of prior requests or sessions, and should not store any session information locally.
- Stateless applications can scale horizontally, since any request can be handled by any available computing resources (e.g. instances, containers or functions).
- Sharing state with any instances, containers, or functions is possible by using in-memory object caching systems like Memcached, Redis, EVCache, or distributed databases like Cassandra or DynamoDB, depending on the structure of your object and your requirements in terms of performances.

## [Stateful Protocol](https://www.geeksforgeeks.org/difference-between-stateless-and-stateful-protocol/) require server to save the status and session information.

# [Domain Driven Architecture](https://www.geeksforgeeks.org/domain-driven-design-ddd/)
- When we are developing software our focus should not be primarily on technology, rather it should be primarily on business/domain.
- Classes, modals, services, microservices, rest apis etc. should be designed according to the domains.
![img.png](assests/domain_driven_design.png)

# References
- [How to build a multi-region active-active architecture on AWS](https://acloudguru.com/blog/engineering/why-and-how-do-we-build-a-multi-region-active-active-architecture)


