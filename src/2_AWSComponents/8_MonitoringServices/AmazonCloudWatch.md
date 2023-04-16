
# Amazon CloudWatch
- [Amazon CloudWatch](https://aws.amazon.com/cloudwatch/) is a real-time monitoring service that gives you visibility into the performance and health of your AWS resources and applications. 
- Depending on multiple metrics, it participates in triggering alarms and gives actionable insights.
- At the core of [CloudWatch](https://aws.amazon.com/cloudwatch/), metrics are used to filter and alert on from metrics, metrics on logs, and metrics in events.

# Key Features

| Feature                                                                                                                                     | Remarks                                                                                                                                                               |
|---------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Collect - Metrics & Logs](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/viewing_metrics_with_cloudwatch.html#ec2-cloudwatch-metrics) | [Different metrices retention periods](https://aws.amazon.com/about-aws/whats-new/2016/11/cloudwatch-extends-metrics-retention-and-new-user-interface/) in cloudwatch |
| [Monitor - Alarms & dashboards](CloudwatchAlarms.md)                                                                                        | -                                                                                                                                                                     |
| Act - Auto Scaling & events                                                                                                                 | -                                                                                                                                                                     |
| Analyse - Trends & metric math                                                                                                              | -                                                                                                                                                                     |
| Compliance & security                                                                                                                       | -                                                                                                                                                                     |
| [Namespaces](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-namespaces.html)                                                  | All AWS data is contained inside a namespace named AWS/service.<br/>- Metrics in different namespaces are isolated from each other, so that metrics from different applications are not mistakenly aggregated into the same statistics.                                                                                                 |

# What AWS resources can be monitored in CloudWatch?

Mostly all AWS resources can be monitored in [AWS Cloudwatch](https://images.ctfassets.net/ee3ypdtck0rk/3Nj7dlXrWjY6QGLJ2WlLQy/37e85ae7a0581d31792dd05dd0830e50/Screen_Shot_2021-08-27_at_16.31.30.png?w=1853&h=1059&q=50&fm=webp).

| AWS Service                                                                                                                                                                     | Remarks                                                                 |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------|
| [Amazon EC2](../3_ComputeServices/AmazonEC2/Readme.md)                                                                                                                          | CPU, Memory utilization, NetworkIn / Out, DiskReadOps/DiskWriteOps etc. |
| [Amazon RDS](../6_DatabaseServices/AmazonRDS/Readme.md)                                                                                                                         | Instances, Slow SQL Queries etc.                                        |
| [Load Balancer](../1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md)                                                                          | Various HTTP Errors, Error Rates etc.                                   |
| [CloudFront Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/working_with_metrics.html)                                                                  | Origin Latency, Error Rates etc.                                        |
| [Amazon SQS](../5_MessageBrokerServices/AmazonSQS.md)                                                                                                                           | -                                                                       |
| [S3](../7_StorageServices/3_ObjectStorageTypes/AmazonS3/Readme.md)                                                                                                                                   | -                                                                       |
| [SNS](../5_MessageBrokerServices/AmazonSNS.md)                                                                                                                                  | -                                                                       |
| [Creating a billing alarm to monitor your estimated AWS charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html) | -                                                                       |
| [How can I set up a CloudWatch alarm to automatically recover my EC2 instance?z](https://aws.amazon.com/premiumsupport/knowledge-center/automatic-recovery-ec2-cloudwatch/)     | -                                                                       |
| [Cloudwatch Agent](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Install-CloudWatch-Agent.html)                                                                | Not all CloudWatch metrics are not collected by default. In that case, CloudWatch metrics need a CloudWatch agent installed to collect metrics for our Amazon EC2 instances as well as our on-premise servers.                                                                        |

![img.png](assests/cloudwatch_img.png)

# CloudWatch's metrics for the Elastic Load Balancer

![img.png](https://www.splunk.com/content/dam/splunk-blogs/signalfx-assets/blog-images/ELB-CloudWatch-1024x457.png)

[Read more](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-cloudwatch-metrics.html)

# CloudWatch's metrics for Elastic Cache

![img.png](https://d2908q01vomqb2.cloudfront.net/887309d048beef83ad3eabf2a79a64a389ab1c9f/2019/07/26/ClusterModeElasticache10.png)