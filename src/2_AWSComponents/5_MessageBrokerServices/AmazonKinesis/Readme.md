# Amazon Kinesis
- [Amazon Kinesis](https://aws.amazon.com/kinesis/) makes it easy to collect, process, and analyze real-time, streaming data, so you can get timely insights and react quickly to new information.
- Amazon Kinesis offers key capabilities to cost-effectively process streaming data at any scale, along with the flexibility to choose the tools that best suit the requirements of your application. 
- With Amazon Kinesis, you can ingest real-time data such as video, audio, application logs, website clickstreams, and IoT telemetry data for machine learning, analytics, and other applications. 
- Amazon Kinesis enables you to process and analyze data as it arrives and respond instantly instead of having to wait until all your data is collected before the processing can begin.

# Amazon Kinesis Components
- [Amazon Kinesis Data Streams](AmazonKinesisDataStreams.md)
- [Amazon Kinesis Data Firehouse](AmazonKinesisDataFirehouse.md)

# Kinesis vs Kafka

| Parameters          | Amazon Kinesis                                                                                                                            | [Apache Kafka](../../../1_HLDDesignComponents/4_MessageBrokers/Kafka/Readme.md)                                                           |
|---------------------|-------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|
| Architecture        | The basic architecture consists of Producers, Consumers, and [Kinesis Data Streams](AmazonKinesisDataStreams.md). Messages are pushed into KDS for conversion to shards. | The basic architecture consists of Producers, Consumers, and Topics. Messages are pushed into topics for conversion to partitions. |
| Event Processing    | Around thousands of events per second                                                                                                     | :sunglasses: More than thousands of events per second                                                                              |
| Configuration Store | [Amazon DynamoDB](../../6_DatabaseServices/AmazonDynamoDB/Readme.md)                                                                      | [Apache Zookeeper](../../../1_HLDDesignComponents/7_ClusterCoordinationService/ApacheZookeeper.md)                                                     |
| Scalability         | Users can make use of an API call for increasing number of shards.                                                                        | Users can add on increasing number of partitions to a topic.                                                                       |
| Components          | Video Streams, [Data Streams](AmazonKinesisDataStreams.md), Data Analytics, [Data Firehose](AmazonKinesisDataFirehouse.md).               | Kafka Streams, Kafka Connect.                                                                                                      |
| Storage of Data     | Data is stored in shards. Stores data for 24 hours to 7 days.                                                                             | Data is stored in partitions. Stores data for as much time as needed.                                                              |
| Setting Up          | Takes a couple of hours. (Since its managed by AWS)                                                                                       | Takes a few weeks                                                                                                                  |
| Retention Period    | Data is accessible from 24 hours to about 365 days                                                                                        | Data is accessible for 7 days and can be changed later.                                                                            |
| Fan-out             | Typical fan-out of 5x or less.                                                                                                            | :sunglasses: Designed for very high fan-out.                                                                                       |

Read more
- [Kinesis vs Kafka: Comparing Two Popular Streaming Analytics Tools](https://www.spec-india.com/blog/kinesis-vs-kafka)
- [Kafka vs Kinesis: How to Choose](https://rockset.com/blog/kafka-vs-kinesis-choosing-the-best-data-streaming-solution/)

# References
- [AWS Kinesis Data Streams vs AWS Kinesis Data Firehose](https://www.whizlabs.com/blog/aws-kinesis-data-streams-vs-aws-kinesis-data-firehose/)