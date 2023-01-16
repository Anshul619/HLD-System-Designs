# Introduction
- You can use [Amazon CloudWatch Logs](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/WhatIsCloudWatchLogs.html) to monitor, store, and access your log files from [Amazon Elastic Compute Cloud (Amazon EC2) instances](../3_ComputeServices/AmazonEC2/ReadMe.md), [AWS CloudTrail](AWSCloudTrail.md), [Route 53](../1_NetworkingAndContentDelivery/AmazonRoute53.md), and other sources.
- CloudWatch Logs enables you to centralize the logs from all of your systems, applications, and AWS services that you use, in a single, highly scalable service. 
- You can then easily view them, search them for specific error codes or patterns, filter them based on specific fields, or archive them securely for future analysis. 
- CloudWatch Logs enables you to see all of your logs, regardless of their source, as a single and consistent flow of events ordered by time, and you can query them and sort them based on other dimensions, group them by specific fields, create custom computations with a powerful query language, and visualize log data in dashboards.

# Supported Log Sources
- [Amazon Elastic Compute Cloud (Amazon EC2) instances](../3_ComputeServices/AmazonEC2/ReadMe.md)
- [AWS Lambda](../3_ComputeServices/AWSLambda/Readme.md)
- [Amazon Fargate](../3_ComputeServices/AWSFargate.md)
- [Amazon API Gateway](../1_NetworkingAndContentDelivery/AmazonAPIGateway/Readme.md)
- [AWS CloudTrail](AWSCloudTrail.md)
- [Route 53](../1_NetworkingAndContentDelivery/AmazonRoute53.md) etc.

# Supported Subscription Filter Services
- [Kinesis](../5_MessageBrokerServices/AmazonKinesis/Readme.md)
- [Amazon Kinesis Firehouse](../5_MessageBrokerServices/AmazonKinesis/AmazonKinesisDataFirehouse.md)
- [AWS Lambda](../3_ComputeServices/AWSLambda/Readme.md)
- [Amazon OpenSearch](../6_DatabaseServices/AmazonOpenSearch.md)

# Example Use Case
- [ECS-Fargate](../3_ComputeServices/AWSFargate.md) can add logs to a [Cloudwatch log group]().
- [Amazon Kinesis Data Firehouse](../5_MessageBrokerServices/AmazonKinesis/AmazonKinesisDataFirehouse.md) can subscribe to the [Cloudwatch Log Group]().
- And then [Amazon Kinesis Data Firehouse](../5_MessageBrokerServices/AmazonKinesis/AmazonKinesisDataFirehouse.md) can be integrated with [NewRelic for APM, Monitoring & debugging purpose](https://docs.newrelic.com/docs/logs/forward-logs/stream-logs-using-kinesis-data-firehose/).
