# Health check types

| Health check type                                                                                                         | What it checks                                                                                                                     |
|---------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|
| :star: [ELB Health checks](../../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md) | Checks whether the load balancer reports the instance as healthy.                                                                  |
| [EC2 status checks and scheduled events (Default)](../EC2StatusChecks.md)                                                 | Check if [instance is running](../Readme.md) or there is an underlying hardware or software issues that might impair the instance. |
| Custom Health Checks                                                                                                      | Checks for any other problems that might indicate instance health issues, according to the custom health checks.                   |

[Read more](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-health-checks.html)

# ELB & ASG
- When you attach an [Application Load Balancer, Network Load Balancer, or Gateway Load Balancer](../../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md), you attach a [target group](../../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md). 
- [Amazon EC2 Auto Scaling]() adds instances to the attached target group when they are launched.
- You can attach one or multiple target groups, and configure health checks on a per target group basis.

![img.png](../../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/assets/AWS_Elastic_Load_Balancer.png)

# How ELB Health checks work?

![img.png](assets/Auto-Scaling-ELB.png)
