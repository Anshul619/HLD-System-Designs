# Target Tracing
- [Target value](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-target-tracking.html) that represents the ideal average utilization or throughput level for your application.
- For example, let's say that you currently have an application that runs on two instances, and you want the CPU utilization of the Auto Scaling group to stay at around 50 percent when the load on the application changes. 
- This gives you extra capacity to handle traffic spikes without maintaining an excessive number of idle resources.

# References
- [Request based AutoScaling using AWS Target tracking scaling policies](https://faun.pub/request-based-autoscaling-using-aws-target-tracking-scaling-policies-9a4ce999a3aa)
- [Amazon Elastic Container Service (ECS) Auto Scaling using custom metrics](https://aws.amazon.com/blogs/containers/amazon-elastic-container-service-ecs-auto-scaling-using-custom-metrics/)