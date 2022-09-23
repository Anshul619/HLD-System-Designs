# [AWS Auto-scaling](https://aws.amazon.com/autoscaling/)
- Auto-scaling is a function that allows you to provision and launch new instances whenever there is a incoming demand. 
- `It allows you to automatically increase or decrease resource capacity in relation to the demand.`

# [AWS EC2 AutoScaling](https://aws.amazon.com/getting-started/hands-on/ec2-auto-scaling-spot-instances/)
- AWS EC2 Auto Scaling enables you to automatically launch or terminate [Amazon EC2 instances](../../4_ComputeServices/EC2/ReadMe.md)) based on user-defined policies, health status checks, and schedules.
- You can use a [CloudWatch alarm](../../8_MonitoringServices/AmazonCloudWatch.md) with Amazon EC2 Auto Scaling to scale your EC2 instances based on demand. 
- For more information, see [Dynamic Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scale-based-on-demand.html) in the Amazon EC2 Auto Scaling User Guide.

# [How to do EC2 autoscaling?](https://docs.aws.amazon.com/autoscaling/ec2/userguide/get-started-with-ec2-auto-scaling.html)
- Create a Launch template/configuration.
  - Specify Min. Nodes in the group.
- Create a single-instance `Auto Scaling group`.
- Verify your Auto Scaling group.
- Terminate an instance in your Auto Scaling group.

# Scaling based on Amazon SQS
- Based on the [Amazon SQS](../../5_MessageBrokerServices/AmazonSQS.md) queue size, the [auto-scaling of the EC2 instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html) can also be done.
- Example Design - [Send-SMS-API design (App Internal Clients, Multiple SMS-Providers, AutoScaling)](../../../3_HLDDesignProblems/NotificationSystem)

![img.png](https://docs.aws.amazon.com/autoscaling/ec2/userguide/images/sqs-as-custom-metric-diagram.png)

# :thumbsdown: Disadvantages of EC2 AutoScaling
- It would be difficult to optimise the number of instances around the particular demands of the services. 
- For example - A whole new EC2 instance could be spun up due to the load on a first instance, but only utilised to 10% CPU.
- This can be resolved using [AWS Fargate - Serverless container service](../AWSFargate.md).

# References
- [AWS Autoscaling | AWS Autoscaling And Load Balancing | AWS Tutorial For Beginners | Simplilearn](https://www.youtube.com/watch?v=4EOaAkY4pNE)
- [Scaling based on Amazon SQS](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html)