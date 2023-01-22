# Methods of Message Transfer

![](../../4_MessageBrokers/assests/Traditional-Message-Patterns.drawio.png)

## Point-To-Point Model (Message Queuing)
- Once the message is delivered to the one consumer, it would be removed from Queue.
- The main goal is to distribute messages individually and promptly, ensuring that work is parallelized equitably and messages are handled roughly in the order they came in the queue.
- [RabbitMQ](../../4_MessageBrokers/RabbitMQ.md), [Amazon SNS](../../../2_AWSComponents/5_MessageBrokerServices/AmazonSNS.md) support [Point-To-Point]() technique.

### Two types of point-to-point messaging

#### Fire-And-Forgot
- After pushing the message to the queue, producer doesn't wait for the response from the message queue.

#### Request-Reply messaging model
- After pushing the message to the queue, producer waits for the reply from the consumer (through message queue ).

## Publisher-Subscriber Model (Pub/Sub)
- Unlike point-to-point model, a message is only removed once it has been consumed by `all category subscribers` or according to `retention policy`.
- This is completely asynchronous.
- You can't say for sure when this process will happen and in what order.
- [Kafka](../../4_MessageBrokers/Kafka/Readme.md), [Active MQ](../../4_MessageBrokers/ActiveMQ.md), [Amazon SQS](../../../2_AWSComponents/5_MessageBrokerServices/AmazonSQS.md) supports [Publisher-Subscriber](https://docs.aws.amazon.com/prescriptive-guidance/latest/modernization-integrating-microservices/pub-sub.html) Model.

# References
- [Point-to-Point and Publish/Subscribe Messaging model](https://programmingsharing.com/point-to-point-and-publish-subscribe-messaging-model-2efc4d2b6726)
- [Pub-Sub Messaging - Asynchronous event notifications](https://aws.amazon.com/pub-sub-messaging/)