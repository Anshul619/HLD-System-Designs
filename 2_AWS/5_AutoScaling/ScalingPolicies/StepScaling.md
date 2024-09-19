# Step Scaling
- [Step scaling policies](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html) increase or decrease the current capacity of a scalable target based on a set of scaling adjustments, known as [step adjustments](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html).
- The adjustments vary based on the size of the alarm breach.
- It doesn't wait for cool-down before responding to new alarms.  