
# Amazon EventBridge (formerly called Cloudwatch Events)
- [Amazon EventBridge](https://aws.amazon.com/eventbridge/) is a serverless event bus that lets you receive, filter, transform, route, and deliver events. 
- Using [Amazon EventBridge](), we can build [event-driven applications at scale](../../1_HLDDesignComponents/1_MicroServicesSOA) across AWS, existing systems, or SaaS applications.
- It uses the [Amazon CloudWatch Events API](../8_MonitoringServices/AmazonCloudWatch.md), but also includes more functionality, like the ability to ingest events from SaaS apps.

# Amazon EventBridge rules
- [An event bridge rule](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rules.html) matches incoming events and sends them to targets for processing. 
- A single rule can send an event to multiple targets, which then run in parallel. 
- Rules are based either on an event pattern or a schedule. 
- [An event pattern](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) defines the event structure and the fields that a rule matches. 
- Rules that are based on a schedule perform an action at regular intervals.

![img.png](assests/eventbridge/EventBridge.png)

# Other Links
- [Guide to archive Amazon EventBridge events & replay those later.](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-archive-event.html)

# References
- [Reducing custom code by using advanced rules in Amazon EventBridge](https://aws.amazon.com/blogs/compute/reducing-custom-code-by-using-advanced-rules-in-amazon-eventbridge/)
- [Top 5 reasons to use EventBridge instead of SNS](https://lumigo.io/blog/5-reasons-why-you-should-use-eventbridge-instead-of-sns/)
- [Choosing between messaging services for serverless applications](https://aws.amazon.com/blogs/compute/choosing-between-messaging-services-for-serverless-applications/)
- [AWS SQS vs SNS vs Eventbridge – When to Use What?](https://beabetterdev.com/2021/09/10/aws-sqs-vs-sns-vs-eventbridge/)
- [AWS EventBridge - Write Analytics Detail Events to S3](https://developer.genesys.cloud/blueprints/aws-eventbridge-analytics-detail-events-blueprint/index-tmp)
- [Upgrading to Amazon EventBridge from Amazon CloudWatch Events](https://aws.amazon.com/blogs/compute/upgrading-to-amazon-eventbridge-from-amazon-cloudwatch-events/)