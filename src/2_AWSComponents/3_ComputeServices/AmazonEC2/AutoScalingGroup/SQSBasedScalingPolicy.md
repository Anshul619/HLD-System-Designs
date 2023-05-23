# Scaling based on Amazon SQS
- Based on the [Amazon SQS queue size](../../../5_MessageBrokerServices/AmazonSQS/Readme.md), the [auto-scaling of the EC2 instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html) can also be done.

![](https://docs.aws.amazon.com/images/autoscaling/ec2/userguide/images/sqs-as-custom-metric-diagram.png)

# Use Cases

| Use Case                                                                                                                              | Remarks                                                                                                                                                                                                                                                                                                  |
|---------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Image Upload](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html)                                         | Consider a scenario where the image upload app runs on EC2 instances (in ASG) which push the raw bitmap data to SQS for downstream processing.<br/>- In case of spike in the image uploads, we should scale EC2 instances based on SQS queue size.                                                       |
| [Send-SMS-API design (App Internal Clients, Multiple SMS-Providers, AutoScaling)](../../../../3_HLDDesignProblems/NotificationSystem) | -                                                                                                                                                                                                                                                                                                        |
| Orders Placement                                                                                                                      | Consider a scenario where an e-commerce company runs its web application on EC2 instances (in ASG) and it's configured to handle consumer orders in an SQS queue for downstream processing. <br/>- To handle the sudden spike in orders received, we should scale EC2 instances based on SQS queue size. |

# Create a target tracking scaling policy for Amazon EC2 Auto Scaling using metric math
- [Read more](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html)

## Metrics

| ID  | CloudWatch metric                  | Statistic | Period   | Remarks                                                                             |
|-----|------------------------------------|-----------|----------|-------------------------------------------------------------------------------------|
| m1  | ApproximateNumberOfMessagesVisible | Sum       | 1 minute | Length of the SQS queue (number of messages available for retrieval from the queue) |
| m2  | GroupInServiceInstances            | Average   | 1 minute | Number of instances in the InService state in ASG group                             |

## Calculation

| Parameter                              | Formula                                                                                   | Remarks                                                                            |
|----------------------------------------|-------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| Acceptable/Target backlog per instance | Acceptable-Latency/Avg-Time-EC2-Takes-To-Process-Message = 10 secs/0.1 sec = 100 messages | This is target value for target tracking policy.                                   |
| Example - Current Backlog per instance | m1/m2 = 1500 messages/10 instances = 150 messages                                         | Scale-out event will happen by 5 instances to reach target (=1500/15=100 messages) |

## Target Tracking Scaling Policy using metric-math
- [Read more](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-target-tracking-metric-math.html)

````json
{
    "CustomizedMetricSpecification": {
        "Metrics": [
            {
                "Label": "Get the queue size (the number of messages waiting to be processed)",
                "Id": "m1",
                "MetricStat": {
                    "Metric": {
                        "MetricName": "ApproximateNumberOfMessagesVisible",
                        "Namespace": "AWS/SQS",
                        "Dimensions": [
                            {
                                "Name": "QueueName",
                                "Value": "my-queue"
                            }
                        ]
                    },
                    "Stat": "Sum"
                },
                "ReturnData": false
            },
            {
                "Label": "Get the group size (the number of InService instances)",
                "Id": "m2",
                "MetricStat": {
                    "Metric": {
                        "MetricName": "GroupInServiceInstances",
                        "Namespace": "AWS/AutoScaling",
                        "Dimensions": [
                            {
                                "Name": "AutoScalingGroupName",
                                "Value": "my-asg"
                            }
                        ]
                    },
                    "Stat": "Average"
                },
                "ReturnData": false
            },
            {
                "Label": "Calculate the backlog per instance",
                "Id": "e1",
                "Expression": "m1 / m2",
                "ReturnData": true
            }
        ]
    },
    "TargetValue": 100
}
````