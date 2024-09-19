# Scaling based on Amazon SQS
- Based on the [Amazon SQS queue size](../../4_MessageBrokerServices/AmazonSQS/Readme.md), the [auto-scaling of the EC2 instances](../Readme.md) can also be done.
- [Read more](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-target-tracking-metric-math.html)

![](https://docs.aws.amazon.com/images/autoscaling/ec2/userguide/images/sqs-as-custom-metric-diagram.png)

# Use Cases

| Use Case                                                                                                                                                | Remarks                                                                                                                                                                                                                                                                                                  |
|---------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Send-SMS-API design - Workers (EC instances) autoscaling using SQS queue](../../../0_HLDUseCasesProblems/TransactionSMSDesign/Readme.md)                |                                                                                                                                                                                                                                                                                                          |
| [Image Upload using SQS, EC2](https://aws.amazon.com/blogs/compute/running-cost-effective-queue-workers-with-amazon-sqs-and-amazon-ec2-spot-instances/) | Consider a scenario where the image upload app runs on EC2 instances (in ASG) which push the raw bitmap data to SQS for downstream processing.<br/>- In case of spike in the image uploads, we should scale EC2 instances based on SQS queue size.                                                       |
| Orders Placement                                                                                                                                        | Consider a scenario where an e-commerce company runs its web application on EC2 instances (in ASG) and it's configured to handle consumer orders in an SQS queue for downstream processing. <br/>- To handle the sudden spike in orders received, we should scale EC2 instances based on SQS queue size. |

# Target Tracking Scaling Policy
- [Calculator - ASG using SQS](https://docs.google.com/spreadsheets/d/15vApko2QrmZmv5qTEIyU_IAWvgY3MD23TR3TuLUiPc8/edit#gid=1238283914)

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

[Read more](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-target-tracking-metric-math.html)