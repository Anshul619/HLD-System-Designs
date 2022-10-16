# AWS Auto-Scaling
- [AWS Auto-scaling Group (ASG)](https://aws.amazon.com/autoscaling/) is a function that allows you to [provision and launch new instances](../ReadMe.md) whenever there is a incoming demand. 
- It allows you to automatically increase or decrease resource capacity in relation to the demand.
- [AWS EC2 Auto Scaling](https://aws.amazon.com/getting-started/hands-on/ec2-auto-scaling-spot-instances/) enables you to automatically launch or terminate [Amazon EC2 instances](../ReadMe.md) based on user-defined policies, health status checks, and schedules.

# How Auto-Scaling works?
- [Read here](HowAutoScalingWorks.md)

# Steps to configure AutoScaling
- Create a Launch template/configuration.
  - Specify Min. Nodes in the group.
- Create a single-instance [Auto Scaling group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/auto-scaling-groups.html).
- Verify your Auto Scaling group.
- Terminate an instance in your Auto Scaling group.

# Attach a load balancer to your Auto Scaling group
- When you attach an [Application Load Balancer, Network Load Balancer, or Gateway Load Balancer](../../../1_NetworkingAndContentDelivery/ElasticLoadBalancer/Readme.md), you attach a [target group](../../../1_NetworkingAndContentDelivery/ElasticLoadBalancer/Readme.md). 
- [Amazon EC2 Auto Scaling]() adds instances to the attached target group when they are launched. 
- You can attach one or multiple target groups, and configure health checks on a per target group basis.
- [Read more](https://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-load-balancer-asg.html)

# :thumbsdown: Disadvantages of AutoScaling
- It would be difficult to optimise the number of instances around the particular demands of the services. 
- For example - A whole new EC2 instance could be spun up due to the load on a first instance, but only utilised to 10% CPU.
- This can be resolved using [AWS Fargate - Serverless container service](../../AWSFargate.md).
- [During auto-scaling, it may take time ( very roughly 30 mins ) to go from 50 to 200 servers](https://youtu.be/mFpqrVxxwKc).

# Auto-Scaling based on Amazon SQS
- Based on the [Amazon SQS](../../../5_MessageBrokerServices/AmazonSQS.md) queue size, the [auto-scaling of the EC2 instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html) can also be done.
- Example Design - [Send-SMS-API design (App Internal Clients, Multiple SMS-Providers, AutoScaling)](../../../../3_HLDDesignProblems/NotificationSystem)

![img.png](https://docs.aws.amazon.com/autoscaling/ec2/userguide/images/sqs-as-custom-metric-diagram.png)

# References
- [AWS Autoscaling | AWS Autoscaling And Load Balancing | AWS Tutorial For Beginners | Simplilearn](https://www.youtube.com/watch?v=4EOaAkY4pNE)
- [How to do EC2 autoscaling?](https://docs.aws.amazon.com/autoscaling/ec2/userguide/get-started-with-ec2-auto-scaling.html)
- [Scaling based on Amazon SQS](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html)