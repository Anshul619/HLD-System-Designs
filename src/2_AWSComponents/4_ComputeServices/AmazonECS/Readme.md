# Amazon ECS - Containers as a Service
- [Amazon ECS - Containers as a Service](https://aws.amazon.com/ecs/) is a [highly scalable](../../../1_HLDDesignComponents/0_SystemGlossaries/Scalability/DBScalability.md) and fast [container orchestration/management service](../../../1_HLDDesignComponents/0_SystemGlossaries/Scalability/ContainerOrchestrationService.md).
- You can use it to run, stop, and manage containers on a cluster.
- Amazon ECS reduces the burden of setting up network, compute and security configurations, and managing scalability. 
- Up to `5,000 instances per cluster`, can be launched in ECS.

![img.png](assests/ECS-Tasks.png)

# Various Components

| Term                                                                                                             | Description                                                                                                                                                                             |
|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Container Definition](#container-definition)                                                             | Nothing but container image & container level settings.                                                                                                                                 |
| :star: [Task Definition](#task-definition)                                                                       | A blueprint for our application and describes one or more containers through attributes.                                                                                                |
| :star: [Task](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html)                 | A task is the instantiation of task definition in the cluster. Tasks don't share the underlying kernel, CPU resources, memory resources or elastic network interface with another task. |
| :star: [Service](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html)                  | A service allows us to run and maintain a specified number (the desired count) of simultaneous tasks (instances of a task definition) in an ECS cluster.                                |
| [Scheduled Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/scheduling_tasks.html)             | Amazon ECS provides a service scheduler for long-running tasks and applications. It also provides the ability to run tasks manually for batch jobs or single run tasks.                 |
| [Capacity Provider](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-capacity-providers.html) | Amazon ECS capacity providers manage the scaling of infrastructure for tasks in your clusters.                                                                                          |
| [CloudWatch metrics](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cloudwatch-metrics.html)        | You can monitor your Amazon ECS resources using Amazon CloudWatch, which collects and processes raw data from Amazon ECS into readable, near real-time metrics.                         |

![](https://miro.medium.com/max/1400/0*ima_OYQ74yCg_cSN)

# Container Definition

| Param                                      | Description |
|--------------------------------------------|-------------|
| Container Name                             | -           |
| Container Image                            | -           |
| Private Repo / Registry                    | -           |
| Memory Limits                              | -           |
| Port Mappings                              | -           |
| Environment Variables to pass to container | -           |
| Log Configuration                          | -           |

[Read more](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html)

# Task Definition

| Param                                                                                                               | Applicable Launch Type                                | Description                                                                                                                                                                                                                                                                                   |
|---------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Task Definition Name                                                                                                | Both                                                  |                                                                                                                                                                                                                                                                                               |
| [Task IAM Role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html)                    | Both                                                  | [IAM Role](../../2_SecurityAndIdentityServices/AWSUsers&AccessMgmt/AWSIAM.md) that tasks can use to make API requests to authorized AWS resources                                                                                                                                             |
| [Task Execution IAM Role](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html) | Both                                                  | [This IAM role](../../2_SecurityAndIdentityServices/AWSUsers&AccessMgmt/AWSIAM.md) is required by tasks to pull container images and publish container logs to [Amazon Cloudwatch](../../8_MonitoringServices/AmazonCloudWatch.md) on our behalf.                                                                                                                  |
| Launch Type                                                                                                         | Both                                                  | Whether tasks are hosted on [Amazon EC2](../../4_ComputeServices/AmazonEC2/ReadMe.md) or [Fargate](../../4_ComputeServices/AWSFargate.md).                                                                                                                                                    |
| [Container Definitions](#container-definition)                                                                      | [Fargate only](../../4_ComputeServices/AWSFargate.md) | [Docker image](../../../1_HLDDesignComponents/6_DevOps/Docker/Readme.md) to use with each container in your task.                                                                                                                                                                             |
| Task Size (CPU & Memory)                                                                                            | [Fargate only](../../4_ComputeServices/AWSFargate.md) | How much CPU and Memory to use for each task? <br/>- :star: [Container level memory settings](#container-definition) are optional when task size is set.                                                                                                                                      |
| [Networking Mode](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html)                 | Both                                                  | For [fargate](../../4_ComputeServices/AWSFargate.md), we have only option available is AWSVPC in addition to [Docker Bridge](../../../1_HLDDesignComponents/6_DevOps/Docker/Readme.md), [Docker Host Only](../../../1_HLDDesignComponents/6_DevOps/Docker/Readme.md) & None networking modes. |
| [Logging Configuration](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_LogConfiguration.html)        | Both                                                  | -                                                                                                                                                                                                                                                                                             |
| Others                                                                                                              |                                                       | Data Volumes etc.                                                                                                                                                                                                                                                                             |

[Read more](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html)

# Integration with ELB
- ECS seamlessly integrates with [ELB](../../1_NetworkingAndContentDelivery/ElasticLoadBalancer/Readme.md).
- [How to configure ELB with ECS?](https://docs.aws.amazon.com/AmazonECS/latest/userguide/create-load-balancer.html)

![img.png](../../1_NetworkingAndContentDelivery/ElasticLoadBalancer/assests/AWS_Elastic_Load_Balancer.png)

# DNS-based service discovery using ECS
- [Amazon ECS]() now includes [integrated service discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) that makes it easy for your containerized services to discover and connect with each other.
- Services configured to use service discovery have a limit of 1,000 tasks for each service. This is due to a [Route53](../../1_NetworkingAndContentDelivery/AmazonRoute53.md) service quota.

## Service Discovery Key Concepts

| Concept                       | Description                                                                                                                                                      |
|-------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Service discovery namespace   | A logical group of service discovery services that share the same domain name, such as `example.com`.                                                            |
| Service discovery service     | Exists within the service discovery namespace and consists of the service name and DNS configuration for the namespace.                                          |
| Service discovery instance    | Exists within the service discovery service and consists of the attributes that are associated with each Amazon ECS service in the service directory.            |
| Amazon ECS health checks      | Amazon ECS performs periodic container-level health checks. If an endpoint doesn't pass the health check, it's removed from DNS routing and marked as unhealthy. |

[Read more](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)

# Other Links
- [Amazon ECR](AmazonECR.md)
- [Amazon EKS vs ECS vs Fargate](../EKSvsECSvsFargate.md)

# References
- [Containers on AWS Overview: ECS | EKS | Fargate | ECR](https://www.youtube.com/watch?v=AYAh6YDXuho)
- [Application Load Balancer with ECS Fargate](https://stackoverflow.com/questions/64409699/application-load-balancer-with-ecs-fargate)