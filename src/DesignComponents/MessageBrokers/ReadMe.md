
# Methods of Message Transfer

<img title="Message-Transfer-Model" alt="Alt text" src="assests/Traditional-Message-Patterns.drawio.png">

## Push Model/Message Queuing ( Point-To-Point, Request-Response technique)
- Once the message is delivered to the consumer, it would be removed from Queue.
- The push model's goal is to distribute messages individually and promptly, ensuring that work is parallelized equitably and messages are handled roughly in the order they came in the queue.
- RabbitMQ, [Amazon SNS ( Simple Notification Service )](https://aws.amazon.com/sns/) support Point-To-Point model.
- Kafka doesn't support Point-To-Point model.

## Pull Model/Publisher-Subscriber Model
- Unlike point-to-point texting, a message is only removed once it has been consumed by all category subscribers.
- Kafka, ActiveMQ, AmazonMQ, RabbitMQ, [Amazon SQS ( Simple Queue Service )](https://aws.amazon.com/sqs/) supports Publisher-Subscriber Model.
- This is completely asynchronous. You can't say for sure when this process will happen and in what order.

## Various Message Brokers
- [Kafka](Kafka.md)
- [RabbitMQ](RabbitMQ.md)
- [ActiveMQ](ActiveMQ.md)
- [Amazon SQS](../AWS/AmazonSQSvsSNSvsMQ.md)
- [Amazon SNS](../AWS/AmazonSQSvsSNSvsMQ.md)
- [Amazon MQ](../AWS/AmazonSQSvsSNSvsMQ.md)