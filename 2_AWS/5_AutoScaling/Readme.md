# AWS Auto-Scaling
- [AWS Auto-scaling Group (ASG)](https://aws.amazon.com/autoscaling/) is a function that allows you to [provision and launch new instances](../2_ComputeServices/AmazonEC2/Readme.md) whenever there is a incoming demand.

# Auto-Scaling for services
- [EC2](EC2/Readme.md)
- [Fargate](Fargate/Readme.md)
- [Aurora Serverless V2](../1_DatabaseServices/AmazonRDS/AmazonAurora/Serverless/Readme.md)
- [Amazon Dynamo DB](../1_DatabaseServices/AmazonDynamoDB/CapacityModes/AutoScaling.md)

# Auto-scaling features

| Feature                                       | Remarks |
|-----------------------------------------------|---------|
| [Scaling Policies](ScalingPolicies/Readme.md) |         |
| [Cooldown periods](CoolingPeriods.md)         |         |

# :thumbsdown: Disadvantages of AutoScaling

| Disadvantage                      | Description                                                                                                                                                                                                                                                                                                                                                  |
|-----------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Difficult to predict              | It would be difficult to optimise the number of instances around the particular demands of the services.<br/>- For example - A whole new EC2 instance could be spun up due to the load on a first instance, but only utilised to 10% CPU.<br/>- This can be resolved using [AWS Fargate - Serverless container service](../2_ComputeServices/AWSFargate.md). |
| Takes a bit of time to auto-scale | During auto-scaling, it may take time (very roughly **30 mins**) to go from [50 to 200 servers](https://youtu.be/mFpqrVxxwKc).                                                                                                                                                                                                                               |

# References
- [AWS Autoscaling | AWS Autoscaling And Load Balancing | AWS Tutorial For Beginners | Simplilearn](https://www.youtube.com/watch?v=4EOaAkY4pNE)
- [Automating Management of Amazon EC2 Instances - March 2017 AWS Online Tech Talks](https://www.youtube.com/watch?v=bSRTAMPqS3E&t=2034s)
- [How to do EC2 autoscaling?](https://docs.aws.amazon.com/autoscaling/ec2/userguide/get-started-with-ec2-auto-scaling.html)
- [Scaling based on Amazon SQS](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html)