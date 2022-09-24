
# [AWS Fargate - Serverless compute for containers](https://aws.amazon.com/fargate/)
- AWS Fargate is a serverless compute engine used in conjunction with [Amazon Elastic Container Service (ECS)](../3_InfraAutomation/AmazonECS/Readme.md). 
- Compatible with both [EKS](../3_InfraAutomation/AmazonEKS.md) & [ECS](../3_InfraAutomation/AmazonECS/Readme.md) i.e. these services can run with Fargate as deployment option, instead of [Amazon EC2 instances](EC2/ReadMe.md).
- You can use it to run containers without managing servers or clusters of [Amazon EC2 instances](EC2/ReadMe.md). 
- `Fargate has a flexible computing model`, which does not require you to select an instance type or directly configure your cluster. 
- It scales up transparently & you pay according to the CPU and memory resources you actually use.

![img.png](assests/aws_ecs_fargate.png)

# Source(s) and further reading
- [Theoretical cost optimization by Amazon ECS launch type: Fargate vs EC2](https://aws.amazon.com/blogs/containers/theoretical-cost-optimization-by-amazon-ecs-launch-type-fargate-vs-ec2/)
