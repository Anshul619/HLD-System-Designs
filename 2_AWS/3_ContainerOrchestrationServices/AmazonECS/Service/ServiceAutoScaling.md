# ECS Service AutoScaling

| Feature             | Remarks                                                                                                                                                                                                                                                                             |
|---------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Scaling policy type | [Target Tracking (Recommended)](../../../5_AutoScaling/ScalingPolicies/Readme.md)<br/>- OR [Step Scaling](../../../5_AutoScaling/ScalingPolicies/Readme.md)                                                                         |
| ECS service metric  | ECSServiceAverageCPUUtilization - Average CPU utilization of the service<br/>- ECSServiceAverageMemoryUtilization - Average memory utilization of the service<br/>- ALBRequestCountPerTarget - Number of requests completed per target in an Application Load Balancer target group |
| Target value        | Enter the metric value that the policy should maintain. <br/>- For example, use a target value of 1000 for ALBRequestCountPerTarget, or a target value of 75(%) for ECSServiceAverageCPUUtilization.                                                                                |

[Read more](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-configure-auto-scaling.html)