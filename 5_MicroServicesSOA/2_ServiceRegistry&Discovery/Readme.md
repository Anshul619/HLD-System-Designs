# Service Registry and Discovery
- One of the primary challenges with [microservices architectures](../Readme.md) is allowing services to discover and interact with each other. 
- The distributed characteristics of [microservices architectures](../Readme.md) not only make it harder for services to communicate, but also presents other challenges, such as checking the health of those systems and announcing when new applications become available. 
- You also must decide how and where to store meta-store information, such as configuration data, that can be used by applications.

![](https://microservices.io/i/servicediscovery/client-side-discovery.jpg)

# Various Technologies for Service Registry & Discovery

| Technology                                                                                                       | Popular Usage                                                                                                                                                                      |
|------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Eureka](Eureka.md)                                                                                       | Good integration with [Spring Boot](https://github.com/Anshul619/Programming-Languages/tree/main/1_Java/SpringBootAndMicroServices/README.md), for service registry and discovery. |                                                                                                                       |
| :star: [AWS CloudMap](../../2_AWSServices/1_NetworkingAndContentDelivery/2_ApplicationNetworking/AWSCloudMap.md) | Service Registry and discovery service by AWS                                                                                                                                      |
| [etcd](../../10_ClusterCoordinationServices/etcd.md)                                                             | Used by [Kubernates](../../9_Container&OrchestrationServices/Kubernates/Readme.md) as Meta-Data, K8s Configuration Store & Service Discovery.                                       |
| [Apache Zookeeper](../../10_ClusterCoordinationServices/ApacheZookeeper.md)                                      |                                                                                                                                                                                    |

> Some systems such as [Kubernetes](../../9_Container&OrchestrationServices/Kubernates/Readme.md), [Marathon](../../9_Container&OrchestrationServices/ApacheMarathon&Mesos.md) and [AWS ELB](../../2_AWSServices/1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md) have an implicit service registry.

# References
- [Eureka! Why You Shouldn’t Use ZooKeeper for Service Discovery](https://medium.com/knerd/eureka-why-you-shouldnt-use-zookeeper-for-service-discovery-4932c5c7e764)