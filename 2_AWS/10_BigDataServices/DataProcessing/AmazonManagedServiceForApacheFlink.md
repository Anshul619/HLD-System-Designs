# Amazon Managed Service for Apache Flink
- [Amazon Managed Service for Apache Flink](https://aws.amazon.com/managed-service-apache-flink/) is the easiest way to analyze streaming data in real-time.
- You can use it to transform and analyze streaming data in real-time with [Apache Flink](../../../6_BigData/DataProcessing/ApacheFlink.md). 
- It provides your application 50 GB of running application storage per [Kinesis Processing Unit (KPU)](https://docs.aws.amazon.com/kinesisanalytics/latest/java/how-scaling.html).

![](https://d1.awsstatic.com/amazon-managed-service-for-apache-flink/Product-Page-Diagram_Amazon-Managed-Service-for-Apache-Flink_V2%402x.05921e8cff707ccc2f80514872e25bb7ea3e02d7.png)

# Steps

|-------------------------------------------------------|
| 1. Setup your streaming data sources                  |
| 2. Develop your SQL queries or streaming applications |
| 3. And set up your destination for processed data.    |

# Supported AWS Services

| AWS Service                                                                                            | Source                 | Destination (for processed data) |
|--------------------------------------------------------------------------------------------------------|------------------------|----------------------------------|
| [Kinesis Data Streams](../../5_MessageBrokerServices/AmazonKinesis/AmazonKinesisDataStreams.md)        | :white_check_mark: Yes | :white_check_mark: Yes           |
| [Amazon MSK (Managed service for Kafka)](../../5_MessageBrokerServices/AmazonMSK.md)                   | :white_check_mark: Yes | :white_check_mark: Yes           |
| [Amazon S3](../../7_StorageServices/3_ObjectStorageS3/Readme.md)                                       | :white_check_mark: Yes | :white_check_mark: Yes           |
| [API Gateway](../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/AmazonAPIGateway/Readme.md) | :white_check_mark: Yes | :x: No                           |