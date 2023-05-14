# Amazon CloudWatch
- [Amazon CloudWatch](https://aws.amazon.com/cloudwatch/) is a real-time monitoring service that gives you visibility into the performance and health of your AWS resources and applications. 
- Depending on [multiple metrics](CloudwatchMetrics.md), it participates in triggering [alarms](CloudwatchAlarms.md) and gives actionable insights.

At the core of [CloudWatch](https://aws.amazon.com/cloudwatch/), 
- [Metrics](CloudwatchMetrics.md) are used to filter 
- And [alarms/alert](CloudwatchAlarms.md) on from [metrics](CloudwatchMetrics.md)
- [Metrics](CloudwatchMetrics.md) on logs
- [Metrics](CloudwatchMetrics.md) in events

# Key Features

| Feature                                                                                                       | Remarks                                                                                                                                                                                                                                 |
|---------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Collect Metrics](CloudwatchMetrics.md)                                                                       | -                                                                                                                                                                                                                                       |
| [Collect Logs](CloudwatchLogs.md)                                                                             | -                                                                                                                                                                                                                                       |
| [Monitor - Alarms & dashboards](CloudwatchAlarms.md)                                                          | -                                                                                                                                                                                                                                       |
| [Act - Auto Scaling & events](../../3_ComputeServices/AmazonEC2/AutoScalingGroup/Readme.md)                   | -                                                                                                                                                                                                                                       |
| Analyse - Trends & [metric math](../../3_ComputeServices/AmazonEC2/AutoScalingGroup/SQSBasedScalingPolicy.md) | -                                                                                                                                                                                                                                       |
| Compliance & security                                                                                         | -                                                                                                                                                                                                                                       |
| [Namespaces](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-namespaces.html)                    | All AWS data is contained inside a namespace named AWS/service.<br/>- Metrics in different namespaces are isolated from each other, so that metrics from different applications are not mistakenly aggregated into the same statistics. |

# What AWS resources can be monitored in CloudWatch?

Mostly all AWS resources can be monitored in [AWS Cloudwatch](https://images.ctfassets.net/ee3ypdtck0rk/3Nj7dlXrWjY6QGLJ2WlLQy/37e85ae7a0581d31792dd05dd0830e50/Screen_Shot_2021-08-27_at_16.31.30.png?w=1853&h=1059&q=50&fm=webp).

| AWS Service                                                                                                                                                                     | Remarks                                                                                                                                                                                                        |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Amazon EC2](../../3_ComputeServices/AmazonEC2/Readme.md)                                                                                                                       | CPU, Memory utilization, NetworkIn / Out, DiskReadOps/DiskWriteOps etc.                                                                                                                                        |
| [Amazon RDS](../../6_DatabaseServices/AmazonRDS/Readme.md)                                                                                                                      | Instances, Slow SQL Queries etc.                                                                                                                                                                               |
| [Load Balancer](../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md)                                                                     | Various HTTP Errors, Error Rates etc.                                                                                                                                                                          |
| [CloudFront Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/working_with_metrics.html)                                                                  | Origin Latency, Error Rates etc.                                                                                                                                                                               |
| [Amazon SQS](../../5_MessageBrokerServices/AmazonSQS.md)                                                                                                                        | -                                                                                                                                                                                                              |
| [S3](../../7_StorageServices/3_ObjectStorageS3/Readme.md)                                                                                                           | -                                                                                                                                                                                                              |
| [SNS](../../5_MessageBrokerServices/AmazonSNS.md)                                                                                                                               | -                                                                                                                                                                                                              |
| [Creating a billing alarm to monitor your estimated AWS charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html) | -                                                                                                                                                                                                              |
| [How can I set up a CloudWatch alarm to automatically recover my EC2 instance?z](https://aws.amazon.com/premiumsupport/knowledge-center/automatic-recovery-ec2-cloudwatch/)     | -                                                                                                                                                                                                              |
| [Cloudwatch Agent](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html)                                                                | Not all CloudWatch metrics are not collected by default. In that case, CloudWatch metrics need a CloudWatch agent installed to collect metrics for our Amazon EC2 instances as well as our on-premise servers. |

![img.png](../assests/cloudwatch_img.png)