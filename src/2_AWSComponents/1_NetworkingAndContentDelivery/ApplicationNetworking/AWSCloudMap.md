# AWS Cloud Map
- [AWS Cloud Map](https://aws.amazon.com/cloud-map/) is a [cloud resource discovery service](../../../1_HLDDesignComponents/1_MicroServicesSOA/2_ServiceRegistry&Discovery/Readme.md). 
- With Cloud Map, you can define custom names for your application resources, and it maintains the updated location of these dynamically changing resources. 
- This increases your application availability because [your web service](../../../1_HLDDesignComponents/1_MicroServicesSOA/Readme.md) always discovers the most up-to-date locations of its resources.
- Cloud Map allows you to register any application resources, such as databases, queues, [microservices](../../../1_HLDDesignComponents/1_MicroServicesSOA/Readme.md), and other cloud resources, with custom names.
- Cloud Map then constantly checks the health of resources to make sure the location is up-to-date.
- The application can then query the registry for the location of the resources needed based on the application version and deployment environment.

![](https://d1.awsstatic.com/r2018/a/product-page-diagram_skymap_before-after.601791b8d5c69fb0c7e96bd6706cfd5320ca8f3d.png)

# AWS Cloud Map Registry

| Term                                                                                                 | Description                                                                                                                                                                                                                                                                                                                    | Example              |
|------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------|
| [Namespace](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-namespaces.html)            | A namespace is a way to group services for an application.<br/>- When you create a namespace, you specify how you want to discover service instances that you register with AWS Cloud Map: using API calls or using DNS queries. <br/>- You also specify the name that you want your application to use to discover instances. | microservices.local  |
| [ECS Service](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-services.html)            | A service is a template for registering service instances, which allow you to locate the resources for an application using DNS queries or the AWS Cloud Map DiscoverInstances API action, depending on how you configured the namespace.                                                                                      | notification-service |
| [ECS Service Instances](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-instances.html) | A service instance (of the ECS Service) contains information about how to locate a resource, such as a web server, for an application. <br/>- After you register instances, you locate them by using DNS queries or the AWS Cloud Map DiscoverInstances API action.                                                            | -                    |

# AWS Cloud Map & Route53
- Service load balancing happens using [Route53 multivalue routing policy](../EdgeNetworking/AmazonRoute53.md#multivalue-answer-routing).
- One service will call other service with service name and those service names are DNS registered in private DNS hosted zone with record set.
- There is no special proxy like [load balancer](ElasticLoadBalancer/Readme.md) in between [two microservices](../../../1_HLDDesignComponents/1_MicroServicesSOA/Readme.md), so no additional network hop which means very good performance improvement using [Service Discovery](../../../1_HLDDesignComponents/1_MicroServicesSOA/2_ServiceRegistry&Discovery/Readme.md).

Example - If we have 3 notification service containers
- 3 private IP addresses we will have for those 3 containers
- 3 recordsets (A Records) will be created in Route53 with name "notification.microservices.local"

This is achieved using [Route53 Multivalue Routing Policy](../EdgeNetworking/AmazonRoute53.md#multivalue-answer-routing).