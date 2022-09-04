
# [Language Agnostic](https://en.wikipedia.org/wiki/Language-agnostic)
- We should design the system considering agnostic feature (Language agnostic, AWS agnostic etc.) into the consideration.
- Language-agnostic programming or scripting (also called language-neutral, language-independent, or cross-language) is a software development paradigm where a particular language is chosen because of its appropriateness for a particular task (taking into consideration all factors, including ecosystem, developer skill-sets, performance, etc.), and not purely because of the skill-set available within a development team.

# Stateful vs Stateless

## :star: Stateless Protocol
- [Stateless Protocol](https://www.geeksforgeeks.org/difference-between-stateless-and-stateful-protocol/) does not require the server to retain the server information or session details.
- In a stateless architecture, the server must treat all client requests independently of prior requests or sessions, and should not store any session information locally.
- `Stateless applications can scale horizontally, since any request can be handled by any available computing resources (e.g. instances, containers or functions).`
- Sharing state with any instances, containers, or functions is possible by using in-memory object caching systems like [Redis](../3_DatabaseComponents/Redis) or distributed databases like [Cassandra](../3_DatabaseComponents/Casandra.md) or [Amazon DynamoDB](../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB.md), depending on the structure of the object and the requirements in terms of performances.

## Stateful Protocol
- [Stateful Protocol](https://www.geeksforgeeks.org/difference-between-stateless-and-stateful-protocol/) requires server to save the status and session information.

# [Domain Driven Architecture](https://www.geeksforgeeks.org/domain-driven-design-ddd/)
- When we are developing software our focus should not be primarily on technology, rather it should be primarily on business/domain.
- Classes, modals, services, microservices, rest apis etc. should be designed according to the domains.
![img.png](assests/domain_driven_design.png)

# Different Storage Types

## Hot Storage
- [Hot storage](https://www.ctera.com/company/blog/differences-hot-warm-cold-file-storage/) is data that is accessed frequently. 
- This could be data that is being actively used by employees or customers. 
- It needs to be stored on fast storage (like `SSD`) so that it can be accessed quickly.
- Examples - [Amazon Dynamo DB](../../2_AWSComponents/6_DatabaseServices/AmazonDynamoDB.md), [Amazon Aurora](../../2_AWSComponents/6_DatabaseServices/AmazonAurora)

## Warm Storage
- [Warm storage](https://www.ctera.com/company/blog/differences-hot-warm-cold-file-storage/) (like `HDD`) is data that is accessed less frequently. 
- This could be data that is used for reporting or analytics. 
- It doesn’t need to be accessed as quickly as hot data, so it can be stored on slightly slower, capacity-optimized.

## Cold Storage
- [Cold storage](https://www.ctera.com/company/blog/differences-hot-warm-cold-file-storage/) is data that is rarely accessed. 
- This could be data that is archived for compliance reasons. 
- It can be stored on even slower, `cheap and deep` storage. (like `Object Storage`)
- Example - [Amazon S3](../../2_AWSComponents/7_StorageServices/AmazonS3.md)

![img.png](https://www.ctera.com/wp-content/uploads/2019/02/Ctera-Cool-Medium-Hot-Graphic-051122.jpg)

# Source(s) and further reading
- [How to build a multi-region active-active architecture on AWS](https://acloudguru.com/blog/engineering/why-and-how-do-we-build-a-multi-region-active-active-architecture)


