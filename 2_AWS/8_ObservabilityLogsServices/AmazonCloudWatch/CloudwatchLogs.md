# Introduction
- You can use [Amazon CloudWatch Logs](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/WhatIsCloudWatchLogs.html) to monitor, store, and access your log files from [Amazon Elastic Compute Cloud (Amazon EC2) instances](../../2_ComputeServices/AmazonEC2/Readme.md), [AWS CloudTrail](../AWSCloudTrail.md), [Route 53](../../16_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonRoute53/Readme.md), and other sources.
- It enables you to centralize the logs from all of your systems, applications, and AWS services that you use, in a single, highly scalable service. 
- You can then easily view them, search them for specific error codes or patterns, filter them based on specific fields, or archive them securely for future analysis. 
- It enables you to see all of your logs, regardless of their source, as a single and consistent flow of events ordered by time, and you can query them and sort them based on other dimensions, group them by specific fields, create custom computations with a powerful query language, and visualize log data in dashboards.

# Supported Log Sources
- [Amazon Elastic Compute Cloud (Amazon EC2) instances](../../2_ComputeServices/AmazonEC2/Readme.md)
- [AWS Lambda](../../2_ComputeServices/AWSLambda/Readme.md)
- [Amazon Fargate](../../2_ComputeServices/AWSFargate.md)
- [Amazon API Gateway](../../16_NetworkingAndContentDelivery/2_ApplicationNetworking/AmazonAPIGateway/Readme.md)
- [AWS CloudTrail](../AWSCloudTrail.md)
- [Route 53](../../16_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonRoute53/Readme.md) etc.

# Subscription Filter
- You can use a [subscription filter](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/SubscriptionFilters.html) with [Kinesis](../../4_MessageBrokerServices/AmazonKinesis/Readme.md), [Lambda](../../2_ComputeServices/AWSLambda/Readme.md), or [Data Firehose](../../10_BigDataServices/DataConnectors/AmazonDataFirehouse/Readme.md). 
- Logs that are sent to a receiving service through a subscription filter are base64 encoded and compressed with the gzip format.

## Supported services

| Service                                                                                                     | Description                                                                                                                                                                                                                                              |
|-------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Kinesis](../../4_MessageBrokerServices/AmazonKinesis/Readme.md)                                            |                                                                                                                                                                                                                                                          |
| [Amazon Data Firehouse](../../10_BigDataServices/DataConnectors/AmazonDataFirehouse/Readme.md)              | Using [Amazon Data Firehouse](../../10_BigDataServices/DataConnectors/AmazonDataFirehouse/Readme.md) subscription filter, we can load the logs in [NewRelic](https://docs.newrelic.com/docs/logs/forward-logs/stream-logs-using-kinesis-data-firehose/). |
| [AWS Lambda](../../2_ComputeServices/AWSLambda/Readme.md)                                                   |                                                                                                                                                                                                                                                          |
| [Amazon OpenSearch](../../1_DatabaseServices/AmazonOpenSearch/Readme.md)                                    |                                                                                                                                                                                                                                                          |
| [Publish flow logs to CloudWatch Logs](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs-cwl.html) | Flow logs can publish flow log data directly to Amazon CloudWatch.                                                                                                                                                                                       |

## Example Use Case
- [ECS-Fargate](../../2_ComputeServices/AWSFargate.md) can add logs to a [Cloudwatch log group]().
- [Amazon Data Firehouse](../../10_BigDataServices/DataConnectors/AmazonDataFirehouse/Readme.md) can subscribe to the [Cloudwatch Log Group]().
- And then [Amazon Data Firehouse](../../10_BigDataServices/DataConnectors/AmazonDataFirehouse/Readme.md) can be integrated with [NewRelic for APM, Monitoring & debugging purpose](https://docs.newrelic.com/docs/logs/forward-logs/stream-logs-using-kinesis-data-firehose/).

# Log retention
- By default, [logs](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/WhatIsCloudWatchLogs.html#cloudwatch-logs-features) are kept indefinitely and never expire. 
- You can adjust the retention policy for each log group, keeping the indefinite retention, or choosing a retention period between 10 years and one day.
