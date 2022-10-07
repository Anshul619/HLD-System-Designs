# How does API Gateway compare with a Load Balancer?
- API Gateway can manage and balance out network traffic just as a [Load Balancer](ElasticLoadBalancer), just in a different way.
- Instead of distributing requests evenly to a set of backend resources (e.g. [a cluster of servers](../../1_HLDDesignComponents/0_SystemGlossaries/ServersCluster.md)), an API Gateway can be configured to direct requests to specific resources based on the endpoints being requested.
- It plays an [important role in microservices architectures](../../1_HLDDesignComponents/1_MicroServicesSOA), for example.
- Multiple services can be connected to the Gateway and mapped to particular HTTP endpoint representations.
- The Gateway is responsible for routing each request, on-demand, to the appropriate backend service.

# References
- [Can AWS API Gateway Act as a Load Balancer?](https://dashbird.io/blog/can-api-gateway-act-load-balancer/)