# Point-To-Point Model (Message Queuing)
- Once the message is delivered to the one consumer, it can be removed from Queue.
- The main goal is to distribute messages individually and promptly, ensuring that work is parallelized equitably and messages are handled roughly in the order they came in the queue.

![](assets/Traditional-Message-Patterns.drawio.png)

# Types of messaging

| Type                          | Service                                                                            | Remarks                                                                                                         |
|-------------------------------|------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|
| Fire-And-Forgot               | [Amazon SQS](../../../2_AWSComponents/5_MessageBrokerServices/AmazonSQS/Readme.md) | After pushing the message to the queue, producer doesn't wait for the response from the message queue.          |
| Request-Reply messaging model | [RabbitMQ](../RabbitMQ.md)                                                         | After pushing the message to the queue, producer waits for the reply from the consumer (through message queue). |

# References
- [Implementing enterprise integration patterns with AWS messaging services: point-to-point channels](https://aws.amazon.com/blogs/compute/implementing-enterprise-integration-patterns-with-aws-messaging-services-point-to-point-channels/)