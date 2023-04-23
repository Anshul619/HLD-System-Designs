# Amazon Kinesis Data Streams
- [Amazon Kinesis Data Streams](https://aws.amazon.com/kinesis/data-streams/) is the [real-time data streaming service](../../1_HLDDesignComponents/5_BigDataComponents/StreamProcessing/Readme.md) in Amazon Kinesis with high scalability and durability.
- KDS can continuously capture gigabytes of data per second from hundreds of thousands of sources.
- The data collected is available in milliseconds, enabling real-time analytics.
- It provides ordering of records, as well as the ability to read and/or replay records in the same order to multiple Amazon Kinesis Applications.
- The [Amazon Kinesis Client Library (KCL)](https://docs.aws.amazon.com/streams/latest/dev/shared-throughput-kcl-consumers.html) delivers all records for a given partition key to the same record processor, making it easier to build multiple applications reading from the same [Amazon Kinesis data stream]() (for example, to perform counting, aggregation, and filtering).
- [Amazon DynamoDB](../6_DatabaseServices/AmazonDynamoDB/Readme.md) is used as a Configuration store in Amazon Kinesis data stream.
- [Amazon Kinesis Data Steams](https://shastri-shankar9.medium.com/apache-kafka-vs-amazon-kinesis-b55821c7f51f) is a managed alternative to [Apache Kafka](../../1_HLDDesignComponents/4_MessageBrokers/Kafka/Readme.md).
- :star: [Comparison between Various Message Brokers](../../1_HLDDesignComponents/4_MessageBrokers/KafkaVsRabbitMQVsSQSVsSNS.md)

![](https://docs.aws.amazon.com/images/streams/latest/dev/images/architecture.png)

# Use Cases
- AWS recommends Amazon Kinesis Data Streams for use cases with requirements that are similar to the following:

| Use Case                                                                         | Description                                                                                                                                                                                                                                                                     |
|----------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Routing related records to the same record processor (as in streaming MapReduce) | For example, counting and aggregation are simpler when all records for a given key are routed to the same record processor.                                                                                                                                                     |
| Ordering of records.                                                             | For example, you want to transfer log data from the application host to the processing/archival host while maintaining the order of log statements.                                                                                                                             |
| Ability for multiple applications to consume the same stream concurrently.       | For example, you have one application that updates a real-time dashboard and another that archives data to Amazon Redshift. You want both applications to consume data from the same stream concurrently and independently.                                                     |
| Ability to consume records in the same order a few hours later.                  | For example, you have a billing application and an audit application that runs a few hours behind the billing application. Because Amazon Kinesis Data Streams stores data for up to 365 days, you can run the audit application up to 365 days behind the billing application. |

# Kinesis Data Streaming and Processing tools

![](https://images.ctfassets.net/ee3ypdtck0rk/3Nj7dlXrWjY6QGLJ2WlLQy/37e85ae7a0581d31792dd05dd0830e50/Screen_Shot_2021-08-27_at_16.31.30.png?w=1853&h=1059&q=50&fm=webp)

# Amazon Kinesis Data Streams and AWS DynamoDB
    
[](../7_StorageServices/assets/AWS-IOT-Data-Capture.png)

[Read more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/kds.html)

# Amazon Kinesis Data Streams and AWS lambda
- If your Lambda function is not processing records in a timely manner, you will see the [IteratorAge metric](https://repost.aws/knowledge-center/lambda-iterator-age) increase on your Lambda dashboard, and this might indicate that you need to "reshard." 
- With resharding, you can increase the number of shards in your stream to adapt to changes in the rate of data flow. 
- When you reshard, data records that were flowing to the existing shards are re-routed to new shards based on key values.


