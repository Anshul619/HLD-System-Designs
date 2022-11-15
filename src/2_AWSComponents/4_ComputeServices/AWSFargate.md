
# AWS Fargate
- [AWS Fargate - Serverless compute for containers](https://aws.amazon.com/fargate/) is a serverless compute engine used in conjunction with [Amazon Elastic Container Service (ECS)](AmazonECS/Readme.md). 
- Compatible with both [EKS](AmazonEKS.md) & [ECS](AmazonECS/Readme.md) i.e. these services can run with Fargate as deployment option, instead of [Amazon EC2 instances](AmazonEC2/ReadMe.md).
- You can use it to run containers without managing servers or clusters of [Amazon EC2 instances](AmazonEC2/ReadMe.md). 
- [Fargate has a flexible computing model](https://aws.amazon.com/fargate/faqs/?nc=sn&loc=4), which does not require you to select an instance type or directly configure your cluster. 
- It scales up transparently & you pay according to the CPU and memory resources you actually use.

![img.png](AmazonECS/assests/ECS-Tasks.png)

# ECS-Fargate with ELB

![img.png](../1_NetworkingAndContentDelivery/ElasticLoadBalancer/assests/AWS_Elastic_Load_Balancer.png)

# Source(s) and further reading
- [How to Setup AWS ECS Fargate with a Load Balancer | Step by Step](https://www.youtube.com/watch?v=o7s-eigrMAI)
- [Theoretical cost optimization by Amazon ECS launch type: Fargate vs EC2](https://aws.amazon.com/blogs/containers/theoretical-cost-optimization-by-amazon-ecs-launch-type-fargate-vs-ec2/)
