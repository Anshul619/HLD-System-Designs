# ECS - Service Quotas

| Service                                                                                      | Quota                               | Default Value |
|----------------------------------------------------------------------------------------------|-------------------------------------|---------------|
| Application Load Balancer                                                                    | Targets per ALB                     | 1000          |
| Application Load Balancer                                                                    | Targets per target group per region | 1000          |
| Network Load Balancer                                                                        | Targets per AZ per NLB              | 500           |
| [AWS Cloud Map](../../16_NetworkingAndContentDelivery/2_ApplicationNetworking/AWSCloudMap.md) | Instances per service               | 1000          |
| ECS Service                                                                                  | Services per cluster                | 5000          |

# Advanced - Cell-based architecture
- If your workload requirements exceed a hard limit, then you should consider sharding your workloads using a cell-based architecture.
- For more details, see [Guidance for Cell-based Architecture on AWS](https://aws.amazon.com/solutions/guidance/cell-based-architecture-on-aws/).

# Read more
- [Scale to 15,000+ tasks in a single Amazon Elastic Container Service (ECS) cluster](https://aws.amazon.com/blogs/containers/scale-to-15000-tasks-in-a-single-amazon-elastic-container-service-ecs-cluster/)
- [AWS re:Invent 2022 - Scaling containers from one user to millions (CON407)](https://www.youtube.com/watch?v=hItHqzKoBk0)