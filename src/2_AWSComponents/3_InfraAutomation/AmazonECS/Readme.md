
# Amazon ECS - Containers as a Service
- [Amazon ECS - Containers as a Service](https://aws.amazon.com/ecs/) is a [highly scalable](../../../1_HLDDesignComponents/0_SystemGlossaries/Scalability.md) and fast container management service.
- You can use it to run, stop, and manage containers on a cluster.
- With Amazon ECS, your containers are defined in a `task definition` that you use to run an individual task or task within a service.
- Amazon ECS reduces the burden of setting up network, compute and security configurations, and managing scalability. 
- Up to 5,000 instances per cluster, can be launched in ECS.
- For example, you don’t need to build a generalized abstraction if you need a load balancer—ECS seamlessly integrates features such as [AWS Application Load Balancer (ALB)](../../1_NetworkingAndContentDelivery/ElasticLoadBalancer.md) and Network Load Balancer (NLB).

![img.png](../assests/ecs_img.png)