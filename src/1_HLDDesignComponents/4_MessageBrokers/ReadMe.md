
# Introduction
- Message brokers are used to decouple & enable [Event Driven Architectures](../0_SystemGlossaries/EventDrivenArchitecture.md) i.e. communicate the events & pass the data between [microservices](../1_MicroServicesSOA).
- In modern software architecture, the application needs to be decoupled, high scalability, serving high performance. 
- Messaging service come in allows us to build that kind of application.

# :star: [Comparison between Various Message Brokers](KafkaVsRabbitMQVsSQSVsSNS.md)

# Methods of Message Transfer

<img title="Message-Transfer-Model" alt="Alt text" src="assests/Traditional-Message-Patterns.drawio.png">

## Point-To-Point Model (Message Queuing)
- Once the message is delivered to the one consumer, it would be removed from Queue.
- The main goal is to `distribute messages individually` and promptly, ensuring that `work is parallelized equitably` and messages are handled roughly in the order they came in the queue.
- [RabbitMQ](RabbitMQ.md), [Amazon SNS](../../2_AWSComponents/5_MessageBrokerServices/AmazonSNS.md) support `Point-To-Point` technique.

### Two types of point-to-point messaging

#### Fire-And-Forgot
- After pushing the message to the queue, producer doesn't wait for the response from the message queue.

#### Request-Reply messaging model
- After pushing the message to the queue, producer waits for the reply from the consumer (through message queue ).

## Publisher-Subscriber Model (Pub/Sub)
- Unlike point-to-point model, a message is only removed once it has been consumed by `all category subscribers` or according to `retention policy`.
- This is `completely asynchronous`. You can't say for sure when this process will happen and in what order.
- [Kafka](Kafka/Readme.md), [Active MQ](ActiveMQ.md), [Amazon SQS](../../2_AWSComponents/5_MessageBrokerServices/AmazonSQS.md) supports `Publisher-Subscriber` Model.

# References
- [Point-to-Point and Publish/Subscribe Messaging model](https://programmingsharing.com/point-to-point-and-publish-subscribe-messaging-model-2efc4d2b6726)
- [Pub-Sub Messaging - Asynchronous event notifications](https://aws.amazon.com/pub-sub-messaging/)
- [RabbitMQ vs Kafka - InterviewBit](https://www.interviewbit.com/blog/rabbitmq-vs-kafka/)
- [Benchmarking Apache Kafka and RabbitMQ: Which is the Fastest?](https://www.confluent.io/blog/kafka-fastest-messaging-system/)