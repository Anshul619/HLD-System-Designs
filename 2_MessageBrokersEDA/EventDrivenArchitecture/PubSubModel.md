# Publisher-Subscriber Model (Pub/Sub)
- Unlike point-to-point model, a message is only removed once it has been consumed by `all category subscribers` or according to `retention policy`.
- This may be synchronous or asynchronous.

![](Message-Patterns.drawio.png)

# Supported Services

| Service                                                                                    |
|--------------------------------------------------------------------------------------------|
| [Kafka](../Kafka/Readme.md)                                                                |
| [Amazon Kinesis Data Streams](https://github.com/Anshul619/AWS-Services/tree/main/4_MessageBrokers/AmazonKinesis/Readme.md) |
| [Amazon EventBridge](https://github.com/Anshul619/AWS-Services/tree/main/4_MessageBrokers/AmazonEventBridge.md)             |
| [Amazon SNS](https://github.com/Anshul619/AWS-Services/tree/main/4_MessageBrokers/AmazonSNS.md)                             |
| [Active MQ](../ActiveMQ.md)                                                                |

# References
- [Pub/sub pattern](https://docs.aws.amazon.com/prescriptive-guidance/latest/modernization-integrating-microservices/pub-sub.html)
