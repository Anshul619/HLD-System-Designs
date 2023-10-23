# Amazon SNS (Amazon Simple Notification Service)
- [Amazon SNS (Simple Notification Service)](https://aws.amazon.com/sns) is a fully managed messaging service for both [application-to-application (A2A)](https://docs.aws.amazon.com/sns/latest/dg/sns-system-to-system-messaging.html) and [application-to-person (A2P)](https://docs.aws.amazon.com/sns/latest/dg/sns-user-notifications.html) communication.
- [The application-to-person (A2P)](https://docs.aws.amazon.com/sns/latest/dg/sns-user-notifications.html) functionality enables you to send messages to users at scale via SMS, mobile push, and email.

Using Amazon SNS topics, your publisher systems can fanout messages to a large number of subscriber systems for parallel processing, including 
- [Amazon SQS queues](AmazonSQS/Readme.md) (cross-region supported as well)
- [AWS Lambda functions](../3_ComputeServices/AWSLambda/Readme.md)
- HTTPS endpoints
- [Amazon Kinesis Data Firehose](../10_BigDataComponents/ETLServices/StreamProcessing/AmazonKinesis/Readme.md)

# Application-to-Application (A2A)

[The application-to-application (A2A) pub/sub functionality](https://docs.aws.amazon.com/sns/latest/dg/sns-system-to-system-messaging.html) provides topics which are helpful in,
- [High-throughput, push-based, many-to-many messaging between distributed systems](../../1_HLDDesignComponents/0_SystemGlossaries/Scalability/LatencyThroughput.md)
- [Microservices, and event-driven serverless](../../1_HLDDesignComponents/1_MicroServicesSOA/Readme.md) applications.

![img.png](assests/sns/FanOutPatternSQSSNS.png)

- This pattern also known as [Fanout-pattern](https://aws.amazon.com/getting-started/hands-on/send-fanout-event-notifications/)

# Available Target Services
- HTTP(s)
- SMS
- SNS Mobile Push
- Email/Email JSON
- [SQS](AmazonSQS/Readme.md)
- [Lambda Functions](../3_ComputeServices/AWSLambda/Readme.md)
- [Amazon Kinesis Data Firehose](../10_BigDataComponents/ETLServices/StreamProcessing/AmazonKinesis/Readme.md)

# General Use Cases
- Monitoring Apps, 
- Workflow systems, 
- Mobile apps, 
- Push notifications to Apple, 
- Android, 
- FireOS, 
- Windows devices,
- Send SMS to mobile users, 
- Send Emails etc.

# Amazon SNS message filtering
- By default, an [Amazon SNS topic]() subscriber receives every message published to the topic. 
- To receive a subset of the messages, [a subscriber must assign a filter policy to the topic subscription](https://docs.aws.amazon.com/sns/latest/dg/sns-message-filtering.html).

# :star: Amazon SNS vs Others
- [Read here](../../1_HLDDesignComponents/4_MessageBrokers/KafkaVsRabbitMQVsSQSVsSNS.md)

# References
- [SQS vs SNS vs Amazon MQ - Comparison - AWS Certification Cheat Sheet](https://cloud.in28minutes.com/aws-certification-sqs-vs-sns-vs-amazon-mq)
- [SNS vs SQS Comparison? Whats the difference?](https://www.youtube.com/watch?v=mXk0MNjlO7A)
- [Choosing between messaging services for serverless applications](https://aws.amazon.com/blogs/compute/choosing-between-messaging-services-for-serverless-applications/)
- [Event-Driven Computing with Amazon SNS and AWS Compute, Storage, Database, and Networking Services](https://aws.amazon.com/blogs/compute/event-driven-computing-with-amazon-sns-compute-storage-database-and-networking-services/)