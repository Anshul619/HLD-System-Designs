# Scaling Activities

| Activity                | Remarks                                                                                                                                                                                                       |
|-------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Re-balancing Activities | When re-balancing, Amazon EC2 Auto Scaling launches new instances before terminating the old ones, so that re-balancing does not compromise the performance or availability of your application.              |
| Scaling activity        | Auto Scaling creates a new scaling activity for terminating the unhealthy instance and then terminates it. <br/>- Later, another scaling activity launches a new instance to replace the terminated instance. |

[Read more](https://docs.aws.amazon.com/autoscaling/ec2/userguide/auto-scaling-benefits.html)