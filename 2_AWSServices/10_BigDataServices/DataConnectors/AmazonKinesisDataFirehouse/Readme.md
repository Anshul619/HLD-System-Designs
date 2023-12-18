# Amazon Kinesis Data Firehouse
- [Amazon Kinesis Data Firehose](https://aws.amazon.com/kinesis/data-firehose/) is the easiest way to [extract, transform, and load data streams (ETL)](../../../../6_BigDataServices/DataProcessing/ETL.md) into various [data stores](../../../6_DatabaseServices), [data lakes](../../DataStorage/DataLakes) & [analytics services](../../DataConsumption), for near real-time analytics with existing business intelligence tools.
- It is a fully managed service that automatically scales to match the throughput of your data and requires no ongoing administration. 
- It can also batch, compress, and encrypt the data before loading it, minimizing the amount of storage used at the destination and increasing security.
- You cannot set up multiple consumers for Kinesis Data Firehose delivery streams as it can dump data in a single data repository at a time.

![](AWS-Kinesis-Firehouse.drawio.png)

# Supported Data Destinations

| Data Destinations                                                                             | Destination Type                                      |
|-----------------------------------------------------------------------------------------------|-------------------------------------------------------|
| [Amazon S3](../../../7_StorageServices/3_ObjectStorageS3/Readme.md)                           | [AWS data stores](../../../6_DatabaseServices)        |
| [S3 Data Lake](../../DataStorage/DataLakes/S3DataLake.md)                                     | [Data Lakes](../../DataStorage/DataLakes)             |
| [Amazon Redshift](../../DataStorage/DataWarehouses/AmazonRedshift.md)                         | [AWS data stores](../../../6_DatabaseServices)        |
| [Amazon OpenSearch](../../../6_DatabaseServices/Search-Databases/AmazonOpenSearch.md)         | [AWS data stores](../../../6_DatabaseServices)        |
| [NewRelic](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/SubscriptionFilters.html) | Logs/Analytics Tools                                  |
| [MongoDB](../../../../3_DatabaseServices/10_Document-Databases/MongoDB.md)                    | [Open Source data store](../../../6_DatabaseServices) |
| Splunk, Datadog, Dynatrace, Sumo Logic, LogicMonitor etc.                                     | Logs/Analytics Tools                                  |
| HTTP End Point as destination                                                                 | Custom                                                |

[Read more](https://aws.amazon.com/kinesis/data-firehose/faqs/)

# Amazon Kinesis Data Firehouse & Event Bridge

![](../../../5_MessageBrokerServices/assests/eventbridge/EventBridge.png)

> Note
> - When a [Kinesis data stream](../../../5_MessageBrokerServices/AmazonKinesis/AmazonKinesisDataStreams.md) is configured as the source of a Firehose delivery stream, [Firehose’s PutRecord and PutRecordBatch operations](../../../5_MessageBrokerServices/AmazonKinesis/AmazonKinesisDataStreams.md) are disabled and Kinesis Agent cannot write to Firehose delivery stream directly.
> - Data needs to be added to the [Kinesis data stream](../../../5_MessageBrokerServices/AmazonKinesis/AmazonKinesisDataStreams.md) through the [Kinesis Data Streams PutRecord and PutRecords operations](../../../5_MessageBrokerServices/AmazonKinesis/AmazonKinesisDataStreams.md) instead.

# References
- [Delivering Real-time Streaming Data to Amazon S3 Using Amazon Kinesis Data Firehose](https://towardsdatascience.com/delivering-real-time-streaming-data-to-amazon-s3-using-amazon-kinesis-data-firehose-2cda5c4d1efe)