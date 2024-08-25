# :star: Stateless Protocol
- [Stateless Protocol](https://www.geeksforgeeks.org/difference-between-stateless-and-stateful-protocol/) does not require the server to retain the server information or session details.
- In a stateless architecture, the server must treat all client requests independently of prior requests or sessions, and should not store any session information locally.
- Stateless applications can scale horizontally, since any request can be handled by any available computing resources (e.g. instances, containers or functions).
- Sharing state with any instances, containers, or functions is possible by using in-memory object caching systems like [Redis](../3_Databases/8_InMemory-Databases/Redis) or distributed databases like [Cassandra](../3_Databases/11_WideColumn-Databases/ApacheCasandra.md) or [Amazon DynamoDB](../2_AWS/6_DatabaseServices/AmazonDynamoDB/Readme.md), depending on the structure of the object and the requirements in terms of performances.

## Examples
- [REST APIs](../8_APIStandards/REST.md)
- [Container technologies](../9_Container&Orchestration/Readme.md) like [Docker](../9_Container&Orchestration/Docker/Readme.md), [Kubernetes](../9_Container&Orchestration/Kubernates/Readme.md) etc.

# Stateful Protocol
- [Stateful Protocol](https://www.geeksforgeeks.org/difference-between-stateless-and-stateful-protocol/) requires server to save the status and session information.