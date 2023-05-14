# Service
- A [service](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) allows us to run and maintain a specified number (the desired count) of simultaneous tasks in an ECS cluster, configure load balancer, service discovery etc.

# Configurations

| Config name                                                                                                                                                     | Required?                                                             | Description                                                                                                                                                                                                                                                            |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Service Name                                                                                                                                                    | :white_check_mark: Yes                                                | Name of the service                                                                                                                                                                                                                                                    |
| [Task Definition](ECSTask.md)                                                                                                                                   | :negative_squared_cross_mark: No                                      | Selected task definition                                                                                                                                                                                                                                               |
| [Cluster](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/clusters.html)                                                                            | :negative_squared_cross_mark: No                                      | The short name or full Amazon Resource Name (ARN) of the cluster on which to run your service. <br/>- If you do not specify a cluster, the default cluster is assumed.                                                                                                 |
| [VPC & Security Groups](../../1_NetworkingAndContentDelivery/3_NetworkFoundationsVPC/Readme.md)                                                                 | :white_check_mark: Yes                                                | VPC and Security group for service                                                                                                                                                                                                                                     |
| [Service Type](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html)                                                                   | :negative_squared_cross_mark: No                                      | REPLICA or DAEMON                                                                                                                                                                                                                                                      |
| [Health Check grace period](https://aws.amazon.com/about-aws/whats-new/2017/12/amazon-ecs-adds-elb-health-check-grace-period/)                                  | :negative_squared_cross_mark: No                                      | The Amazon Elastic Container Service (Amazon ECS) service scheduler now allows you to define a grace period to prevent premature shutdown of newly instantiated tasks.                                                                                                 |
| [Load Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)                                                       | :negative_squared_cross_mark: No                                      | Amazon ECS service can optionally be configured to use Elastic Load Balancing to distribute traffic evenly across the tasks in your service.                                                                                                                           |
| [Desired Count / Number of tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service_definition_parameters.html)                               | :negative_squared_cross_mark: No                                      | The number of instantiations of the specified task definition to place and keep running on your cluster. <br/>- This parameter is required if the REPLICA scheduling strategy is used. If the service uses the DAEMON scheduling strategy, this parameter is optional. |
| [Connect to load balancer - Target Group name, protocol, Path pattern etc.](https://docs.aws.amazon.com/AmazonECS/latest/userguide/service-load-balancing.html) | :negative_squared_cross_mark: No                                      | ECS seamlessly integrates with [ELB](../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md).                                                                                                                                      |
| [Task Placement](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement.html)                                                               | :negative_squared_cross_mark: No, applicable for EC2 launch type only | When a task that uses the EC2 launch type is launched, Amazon ECS must determine where to place the task based on the requirements specified in the task definition, such as CPU and memory. <br/>- Example - One task per host                                        |
| [Service Discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)                                                         | :negative_squared_cross_mark: No                                      | [AWS CloudMap namespace](../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/AWSCloudMap.md) would be configured in ECS Service Discovery.                                                                                                                    |
| [Service Autoscaling](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-auto-scaling.html)                                                    | :negative_squared_cross_mark: No                                      | Minimum number of tasks, auto-scaling parameters (CPU, memory etc.)                                                                                                                                                                                                    |

- [Read more](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service_definition_parameters.html)

# ECS Service AutoScaling

| Feature             | Remarks                                                                                                                                                                                                                                                                             |
|---------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Scaling policy type | [Target Tracking (Recommended)](../../3_ComputeServices/AmazonEC2/AutoScalingGroup/ScalingPolicies.md)<br/>- OR Step Scaling                                                                                                                                                        |
| ECS service metric  | ECSServiceAverageCPUUtilization - Average CPU utilization of the service<br/>- ECSServiceAverageMemoryUtilization - Average memory utilization of the service<br/>- ALBRequestCountPerTarget - Number of requests completed per target in an Application Load Balancer target group |
| Target value        | Enter the metric value that the policy should maintain. For example, use a target value of 1000 for ALBRequestCountPerTarget, or a target value of 75(%) for ECSServiceAverageCPUUtilization.                                                                                       |

[Read more](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-configure-auto-scaling.html)

# DNS-based service discovery using ECS
- [Amazon ECS](Readme.md) includes [integrated service discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) that makes it easy for your containerized services to discover and connect with each other.
- Services configured to use service discovery have a limit of 1,000 tasks for each service. This is due to a [Route53](../../1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonRoute53/Readme.md) service quota.

## Service Discovery Key Concepts

| Concept                       | Description                                                                                                                                                      |
|-------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Service discovery namespace   | A logical group of service discovery services that share the same domain name, such as `example.com`.                                                            |
| Service discovery service     | Exists within the service discovery namespace and consists of the service name and DNS configuration for the namespace.                                          |
| Service discovery instance    | Exists within the service discovery service and consists of the attributes that are associated with each Amazon ECS service in the service directory.            |
| Amazon ECS health checks      | Amazon ECS performs periodic container-level health checks. If an endpoint doesn't pass the health check, it's removed from DNS routing and marked as unhealthy. |

[Read more](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)