# :star: Stateless Protocol
- [Stateless Protocol](https://www.geeksforgeeks.org/difference-between-stateless-and-stateful-protocol/) does not require the server to retain the server information or session details.
- In a stateless architecture, the server must treat all client requests independently of prior requests or sessions, and should not store any session information locally.
- Stateless applications can scale horizontally, since any request can be handled by any available computing resources (e.g. instances, containers or functions).
- Sharing state with any instances, containers, or functions is possible by using in-memory object caching systems like [Redis](../3_DatabaseComponents/In-Memory-DB/Redis) or distributed databases like [Cassandra](../3_DatabaseComponents/NoSQL-Databases/WideColumnDB/ApacheCasandra.md) or [Amazon DynamoDB](../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md), depending on the structure of the object and the requirements in terms of performances.

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

# Stateful Protocol
- [Stateful Protocol](https://www.geeksforgeeks.org/difference-between-stateless-and-stateful-protocol/) requires server to save the status and session information.