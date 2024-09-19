# Scaling Policies
- [AWS EC2 Auto Scaling](https://aws.amazon.com/getting-started/hands-on/ec2-auto-scaling-spot-instances/) enables you to automatically launch or terminate [Amazon EC2 instances](../../2_ComputeServices/AmazonEC2/Readme.md) based on user-defined policies, health status checks, and schedules.

| Scaling policy                                                                                                       | Type of Scaling | Remarks                                                                                                                                                                                                   |
|----------------------------------------------------------------------------------------------------------------------|-----------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Target Tracking](TargetTracing.md)                                                                           | Dynamic Scaling |                                                                                                                                                                                                           |
| [Step Scaling](StepScaling.md)                                                                                       | Dynamic Scaling |                                                                                                                                                                                                           |
| [Scheduled scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-scheduled-scaling.html)   | Fleet Scaling   | Best for Auto Scaling your EC2 instances for predictable traffic patterns.<br/>- To use scheduled scaling, you create scheduled actions which are performed automatically as a function of date and time. |
| [Simple Scaling](SimpleScaling.md)                                                                                   | Dynamic Scaling |                                                                                                                                                                                                           |
| [Predictive Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-predictive-scaling.html) | Dynamic Scaling | Predictive scaling works by analyzing historical load data to detect daily or weekly patterns in traffic flows.                                                                                           |

# Termination policy for Scale-In event

![img.png](../EC2/assets/ASG-Default-Termination-Policy.drawio.png)

[Read more](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
