# Amazon Kinesis Data Streams
- [Amazon Kinesis Data Streams](https://aws.amazon.com/kinesis/data-streams/) is the [real-time data streaming service](../../1_HLDDesignComponents/5_BigDataComponents/StreamProcessing/Readme.md) in Amazon Kinesis with high scalability and durability.
- It can help in continuously capturing multiple gigabytes of data every second from multiple sources.
- The higher customizable with [Kinesis Data Streams]() is also one of the profound highlights.
- [Amazon DynamoDB](../6_DatabaseServices/AmazonDynamoDB/Readme.md) is used as a Configuration store in Amazon Kinesis data stream.
- [Amazon Kinesis Data Steams](https://shastri-shankar9.medium.com/apache-kafka-vs-amazon-kinesis-b55821c7f51f) is a managed alternative to [Apache Kafka](../../1_HLDDesignComponents/4_MessageBrokers/Kafka/Readme.md).
- :star: [Comparison between Various Message Brokers](../../1_HLDDesignComponents/4_MessageBrokers/KafkaVsRabbitMQVsSQSVsSNS.md)

![](https://docs.aws.amazon.com/images/streams/latest/dev/images/architecture.png)

# Kinesis Data Streaming and Processing tools

![](https://images.ctfassets.net/ee3ypdtck0rk/3Nj7dlXrWjY6QGLJ2WlLQy/37e85ae7a0581d31792dd05dd0830e50/Screen_Shot_2021-08-27_at_16.31.30.png?w=1853&h=1059&q=50&fm=webp)

# Amazon Kinesis Data Streams and AWS lambda
- Why is my [Lambda IteratorAge metric](https://repost.aws/knowledge-center/lambda-iterator-age) increasing, and how do I decrease it?
- If your Lambda function is not processing records in a timely manner, you will see the IteratorAge metric increase on your Lambda dashboard, and this might indicate that you need to "reshard." 
- With resharding, you can increase the number of shards in your stream to adapt to changes in the rate of data flow. When you reshard, data records that were flowing to the existing shards are re-routed to new shards based on key values.
