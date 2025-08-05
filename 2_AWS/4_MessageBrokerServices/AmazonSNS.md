# Amazon SNS (Amazon Simple Notification Service)
- [Amazon SNS (Simple Notification Service)](https://aws.amazon.com/sns) is a fully managed messaging service for both **application-to-application (A2A)** and **application-to-person (A2P)** communication.
- [Amazon SNS vs other message brokers](../../4_MessageBrokersEDA/KafkaVsRabbitMQVsSQSVsSNS.md)

# Application-to-Person (A2P)
- It enables applications to send messages to users at scale via SMS, mobile push, and email.
- [Read more](https://docs.aws.amazon.com/sns/latest/dg/sns-user-notifications.html)

# Application-to-Application (A2A)
- It provides high-throughput, push-based, many-to-many messaging between distributed systems.
- It can be implemented in [microservices, and event-driven serverless](../../5_MicroServices/Readme.md) applications.
- This pattern also known as [Fanout-pattern](https://aws.amazon.com/getting-started/hands-on/send-fanout-event-notifications/)
- [Read more](https://docs.aws.amazon.com/sns/latest/dg/sns-system-to-system-messaging.html)

![](assets/FanOutPatternSQSSNS.png)

# Available Target Services
- HTTP(s)
- SMS
- SNS Mobile Push
- Email/Email JSON
- [Amazon SQS queues](AmazonSQS/Readme.md)
- [AWS Lambda Functions](../2_ComputeServices/AWSLambda/Readme.md)
- [Amazon Kinesis Data Firehose](AmazonKinesis/Readme.md)

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
- To receive a subset of the messages, a subscriber must assign a filter policy to the topic subscription.
- [Read more](https://docs.aws.amazon.com/sns/latest/dg/sns-message-filtering.html)

# References
- [SQS vs SNS vs Amazon MQ - Comparison - AWS Certification Cheat Sheet](https://cloud.in28minutes.com/aws-certification-sqs-vs-sns-vs-amazon-mq)
- [SNS vs SQS Comparison? Whats the difference?](https://www.youtube.com/watch?v=mXk0MNjlO7A)
- [Choosing between messaging services for serverless applications](https://aws.amazon.com/blogs/compute/choosing-between-messaging-services-for-serverless-applications/)
- [Event-Driven Computing with Amazon SNS and AWS Compute, Storage, Database, and Networking Services](https://aws.amazon.com/blogs/compute/event-driven-computing-with-amazon-sns-compute-storage-database-and-networking-services/)