
# Amazon EventBridge
- [Amazon EventBridge](https://aws.amazon.com/eventbridge/) is a serverless event bus that lets you receive, filter, transform, route, and deliver events. 
- Using [Amazon EventBridge](), we can build [event-driven applications at scale](../../5_MicroServices) across AWS, existing systems, or SaaS applications.
- It uses the [Amazon CloudWatch Events API](../8_ObservabilityLogsServices/AmazonCloudWatch/Readme.md) but also includes more functionality, like the ability to ingest events from SaaS apps.
- :star: [Amazon EventBridge vs others](../../4_MessageBrokersEDA/KafkaVsRabbitMQVsSQSVsSNS.md)

![](assets/EventBridge.png)

# Key Features

![](https://docs.aws.amazon.com/images/eventbridge/latest/userguide/images/bus-overview_eventbridge_conceptual.svg)

| Feature            | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|--------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Event Bus          | [An event bus](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus.html) is a router that receives events and delivers them to zero or more destinations, or targets. <br/>- Event buses are well-suited for routing events from many sources to many targets, with optional transformation of events prior to delivery to a target.                                                                                                                                                |
| Event Bridge rules | [An event bridge rule](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-rules.html) matches incoming events and sends them to targets for processing.<br/>- A single rule can send an event to multiple targets, which then run in parallel.<br/>- Rules are based either on an [event pattern](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) or [a schedule]((https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-create-rule-schedule.html)). |
| Event Pattern      | [An event pattern](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-patterns.html) defines the event structure and the fields that a rule matches.                                                                                                                                                                                                                                                                                                                                   |
| Event Schedule     | Rules that are based on a [schedule](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-create-rule-schedule.html) perform an action at regular intervals.                                                                                                                                                                                                                                                                                                                                   |
| Archives           | For [disaster recovery](../../7a_HighAvailability/FaultTolerance.md), auditing purposes & replaying purposes event are also set up to be archived.                                                                                                                                                                                                                                                                                                                                                    |
| Replays            | To be able to debug the behaviour of the system based for older events, we can use the [replays](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-replay-archived-event.html).                                                                                                                                                                                                                                                                                                             |

# Available Target Services
- [AWS Lambda](../2_ComputeServices/AWSLambda/Readme.md)
- [Amazon SQS](AmazonSQS/Readme.md)
- [Amazon SNS](AmazonSNS.md)
- [AWS Step Functions](../2_ComputeServices/AWSStepFunctions/Readme.md)
- [Amazon Kinesis Data Streams](AmazonKinesis/Readme.md)
- [Amazon Data Firehouse](../10_BigDataServices/DataConnectors/AmazonDataFirehouse/Readme.md)
- [API Gateway](../16_NetworkingAndContentDelivery/2_ApplicationNetworking/AmazonAPIGateway/Readme.md)
- [Amazon Redshift Clusters](../10_BigDataServices/DataStorage/DataWarehouses/AmazonRedshift.md)
- [SAAS Integrations - Partner Sources](https://aws.amazon.com/eventbridge/integrations/)

# References
- [Reducing custom code by using advanced rules in Amazon EventBridge](https://aws.amazon.com/blogs/compute/reducing-custom-code-by-using-advanced-rules-in-amazon-eventbridge/)
- [AWS EventBridge - Write Analytics Detail Events to S3](https://developer.genesys.cloud/blueprints/aws-eventbridge-analytics-detail-events-blueprint/index-tmp)
- [Upgrading to Amazon EventBridge from Amazon CloudWatch Events](https://aws.amazon.com/blogs/compute/upgrading-to-amazon-eventbridge-from-amazon-cloudwatch-events/)