# Amazon Kinesis Data Analytics
- [Amazon Kinesis Data Analytics](https://aws.amazon.com/kinesis/data-analytics/) is the easiest way to analyze streaming data in real-time.
- You can use [Kinesis Data Analytics]() to transform and analyze streaming data in real-time with [Apache Flink](https://flink.apache.org/). 
- [Kinesis Data Analytics]() for [Apache Flink](https://flink.apache.org/) applications provides your application 50 GB of running application storage per [Kinesis Processing Unit (KPU)](https://docs.aws.amazon.com/kinesisanalytics/latest/java/how-scaling.html).

![](https://d1.awsstatic.com/architecture-diagrams/Product-Page-Diagram_Amazon-Kinesis-Data-Analytics_HIW.82e3aa53a5c87db03c766218b3d51f1a110c60eb.png)

# Steps

| Step                                               |
|----------------------------------------------------|
| Setup your streaming data sources                  |
| Develop your SQL queries or streaming applications |
| And set up your destination for processed data.    |

# Supported AWS Services

| AWS Service                                                                                            | Source | Destination (for processed data) |
|--------------------------------------------------------------------------------------------------------|--------|----------------------------------|
| [Kinesis Data Streams](../../5_MessageBrokerServices/AmazonKinesisDataStreams.md)                      | Yes    | Yes                              |
| [Amazon MSK](../../5_MessageBrokerServices/AmazonMSK.md)                                               | Yes    | Yes                              |
| [API Gateway](../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/AmazonAPIGateway/Readme.md) | Yes    | No                               |
| [Amazon S3](../../7_StorageServices/3_ObjectStorageS3/Readme.md)                                       | Yes    | Yes                              |

# Common Use Cases

| Use Case                                       |
|------------------------------------------------|
| Streaming extract-transform-load (ETL)         |
| Continuous metric generation                   |
| Responsive real-time analytics                 |
| Interactive querying of data streams           |
| Log analytics                                  |
| Clickstream analytics                          |
| Internet of Things (IoT), ad tech, gaming etc. |