
# Amazon ECS - Containers as a Service
- [Amazon ECS - Containers as a Service](https://aws.amazon.com/ecs/) is a [highly scalable](../../../1_HLDDesignComponents/0_SystemGlossaries/Scalability.md) and fast [container orchestration/management service](../../../1_HLDDesignComponents/0_SystemGlossaries/ContainerOrchestrationService.md).
- You can use it to run, stop, and manage containers on a cluster.
- Amazon ECS reduces the burden of setting up network, compute and security configurations, and managing scalability. 
- Up to `5,000 instances per cluster`, can be launched in ECS.

# Amazon ECS tasks
- With Amazon ECS, your containers are defined in a [task definition](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html) that you use to run an individual task or task within a service.

![img.png](assests/ECS-Tasks.png)

# Integration with ELB
- ECS seamlessly integrates with [ELB](../../1_NetworkingAndContentDelivery/ElasticLoadBalancer/Readme.md).
- [How to configure ELB with ECS?](https://docs.aws.amazon.com/AmazonECS/latest/userguide/create-load-balancer.html)

![img.png](../../1_NetworkingAndContentDelivery/ElasticLoadBalancer/assests/AWS_Elastic_Load_Balancer.png)

# DNS-based service discovery using ECS
- [Amazon ECS]() now includes integrated service discovery that makes it easy for your containerized services to discover and connect with each other.

# Other Links
- [Amazon ECR](AmazonECR.md)
- [Amazon EKS vs ECS vs Fargate](../EKSvsECSvsFargate.md)

# References
- [Containers on AWS Overview: ECS | EKS | Fargate | ECR](https://www.youtube.com/watch?v=AYAh6YDXuho)
- [Application Load Balancer with ECS Fargate](https://stackoverflow.com/questions/64409699/application-load-balancer-with-ecs-fargate)