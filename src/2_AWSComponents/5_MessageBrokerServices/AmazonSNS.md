
# Amazon Simple Notification Service (Amazon SNS)
- [Amazon SNS (Simple Notification Service)](https://aws.amazon.com/sns) is a fully managed messaging service for both application-to-application (A2A) and application-to-person (A2P) communication.
- Using Amazon SNS topics, your publisher systems can fanout messages to a large number of subscriber systems, including Amazon SQS queues, AWS Lambda functions, HTTPS endpoints, and Amazon Kinesis Data Firehose, for parallel processing.
- The A2P functionality enables you to send messages to users at scale via SMS, mobile push, and email.
- The A2A pub/sub functionality provides topics for high-throughput, push-based, many-to-many messaging between distributed systems, microservices, and event-driven serverless applications.

![img.png](../0_AWSDesigns/FanOutPatternSNSSQS/assets/FanOutPatternSQSSNS.png)

# :star: Amazon SNS vs Others
- [Read here](../../1_HLDDesignComponents/4_MessageBrokers/KafkaVsRabbitMQVsSQSVsSNS.md)

# References
- [SQS vs SNS vs Amazon MQ - Comparison - AWS Certification Cheat Sheet](https://cloud.in28minutes.com/aws-certification-sqs-vs-sns-vs-amazon-mq)
- [SNS vs SQS Comparison? Whats the difference?](https://www.youtube.com/watch?v=mXk0MNjlO7A)
- [Event-Driven Computing with Amazon SNS and AWS Compute, Storage, Database, and Networking Services](https://aws.amazon.com/blogs/compute/event-driven-computing-with-amazon-sns-compute-storage-database-and-networking-services/)