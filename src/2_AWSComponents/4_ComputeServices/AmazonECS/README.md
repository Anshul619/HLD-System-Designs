
# Amazon ECS - Containers as a Service
- [Amazon ECS - Containers as a Service](https://aws.amazon.com/ecs/) is a [highly scalable](../../../1_HLDDesignComponents/0_SystemGlossaries/Scalability.md) and fast [container orchestration/management service](../../../1_HLDDesignComponents/0_SystemGlossaries/ContainerOrchestrationService.md).
- You can use it to run, stop, and manage containers on a cluster.
- Amazon ECS reduces the burden of setting up network, compute and security configurations, and managing scalability. 
- Up to `5,000 instances per cluster`, can be launched in ECS.
- For example, you don’t need to build a generalized abstraction if you need a load balancer—ECS seamlessly integrates features such as [AWS Application Load Balancer (ALB)](../../1_NetworkingAndContentDelivery/ElasticLoadBalancer/Readme.md) and Network Load Balancer (NLB).
- [Amazon EKS vs ECS vs Fargate](../EKSvsECSvsFargate.md)

![img.png](../../1_NetworkingAndContentDelivery/ElasticLoadBalancer/assests/AWS_Application_Load_Balancer.drawio.png)

# Amazon ECS tasks
- With Amazon ECS, your containers are defined in a [task definition](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html) that you use to run an individual task or task within a service.

![img.png](assests/ECS-Tasks.png)

# DNS-based service discovery using ECS
- [Amazon ECS]() now includes integrated service discovery that makes it easy for your containerized services to discover and connect with each other.

# :star: Amazon ECR (Repository for Docker Images)
- [Amazon Elastic Container Registry (Amazon ECR)](https://aws.amazon.com/ecr/) is a fully managed container registry offering high-performance hosting, so you can reliably deploy application images and artifacts anywhere.
- Amazon ECR store, manage & deploy [Docker container images](../../../1_HLDDesignComponents/6_DevOps/Docker.md).
- Amazon ECR is an alternative to [Docker Hub](https://hub.docker.com/).
- [How to push a Docker Image to ECR?](https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-push-ecr-image.html)

# References
- [Containers on AWS Overview: ECS | EKS | Fargate | ECR](https://www.youtube.com/watch?v=AYAh6YDXuho)