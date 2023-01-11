# Service Registry and Discovery
- One of the primary challenges with [microservices architectures](../Readme.md) is allowing services to discover and interact with each other. 
- The distributed characteristics of [microservices architectures](../Readme.md) not only make it harder for services to communicate, but also presents other challenges, such as checking the health of those systems and announcing when new applications become available. 
- You also must decide how and where to store meta-store information, such as configuration data, that can be used by applications.

![](https://microservices.io/i/servicediscovery/client-side-discovery.jpg)

# Types of Service Discovery
- [Client Side Discovery](https://microservices.io/patterns/client-side-discovery.html)
- [Server Side Discovery](https://microservices.io/patterns/server-side-discovery.html)

# Various Technologies for Service Registry & Discovery

| Technology                                                                                    | Popular Usage                                                                                                                                         | Remarks                                                                                                                 |
|-----------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------|
| :star: [Eureka](Eureka.md)                                                                    | Good integration with [Spring Boot](../../../5_ProgrammingLanguages/2_Java/SpringBootAndMicroServices/README.md), for service registry and discovery. | -                                                                                                                       |                                                                                                                       |
| :star: [AWS CloudMap](../../../2_AWSComponents/1_NetworkingAndContentDelivery/AWSCloudMap.md) | Service Registry and discovery service by AWS                                                                                                         | -                                                                                                                       |
| [etcd](etcd.md)                                                                               | Used by [Kubernates](../../6a_ContainerOrchestrationServices/Kubernates.md) as Meta-Data, Configuration Store & Service Discovery                     | [etcd](https://etcd.io/) is a distributed, reliable key-value store for the most critical data of a distributed system. |
| [Apache Zookeeper](../../6_DevOps/ApacheZookeeper.md)                                         | -                                                                                                                                                     | -                                                                                                                       |

Some systems such as [Kubernetes](../../6a_ContainerOrchestrationServices/Kubernates.md), [Marathon](../../6a_ContainerOrchestrationServices/ApacheMarathon&Mesos.md) and [AWS ELB](../../../2_AWSComponents/1_NetworkingAndContentDelivery/ElasticLoadBalancer/Readme.md) have an implicit service registry.

# References
- [Eureka! Why You Shouldn’t Use ZooKeeper for Service Discovery](https://medium.com/knerd/eureka-why-you-shouldnt-use-zookeeper-for-service-discovery-4932c5c7e764)