# AWS infrastructure for a clickstream data analysis

# Requirements
- Analysing the user's behaviour is very important for making right decisions in application development and maximising business value.
- We expect that clickstream events incoming to our system will be small pieces of data that are generated continuously with high speed and volume.

# System Design

![](AWSClickStreamAnalytic.png)

# Tech Stack

| Service                                                                                                                                             | Remarks                                                                                                                                                                                                     |
|-----------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Amazon API gateway](../../11_AWSServices/1_NetworkingAndContentDelivery/2_ApplicationNetworking/AmazonAPIGateway/Readme.md)                       | Amazon API Gateway will automatically scale to handle the amount of traffic your API receives.                                                                                                              |
| [AWS WAF](../../11_AWSServices/2c_SecurityServices/2_InfraProtectionServices/AWSWAF.md)                                                            | Rate-limiting with requests validation or protection.                                                                                                                                                       |
| [Amazon Kinesis Data Streams](../../11_AWSServices/5_MessageBrokerServices/AmazonKinesis/AmazonKinesisDataStreams.md)                                            | Field `user_id` was also used as a partition key for Kinesis Data Stream to segregate and route records to different shards of a data stream.                                                               |
| [Amazon Kinesis Data Analytics](../../11_AWSServices/10_BigDataServices/DataAnalytics/AmazonManagedServiceForApacheFlink.md)                             | Amazon Kinesis Data Analytics is the easiest way to transform and analyze streaming data in real time. We can use either standard SQL or Apache Flink libraries for complex event processing.               |
| [Amazon Kinesis Data Firehose](../../11_AWSServices/10_BigDataServices/ETLServices/StreamProcessing/AmazonKinesisDataFirehouse/Readme.md) | Amazon Kinesis Data Firehose is the easiest way to reliably load streaming data into data lakes, data stores, and analytics services.                                                                       |
| [AWS Lambda](../../11_AWSServices/3_ComputeServices/AWSLambda/Readme.md)                                                                           | AWS Lambda can be used for different compute jobs like update redis etc.                                                                                                                                    |
| [AWS Glue](../../11_AWSServices/10_BigDataServices/ETLServices/StreamProcessing/AWSGlue.md)                                                      | An AWS Glue job encapsulates a script that connects to your source data, processes it, and then writes it out to your data target. <br/>- Typically, a job runs extract, transform, and load (ETL) scripts. |
| [Amazon Athena](../../11_AWSServices/10_BigDataServices/DataAnalytics/AmazonAthena.md)                                                           | Amazon Athena can be used to query & analyse data from Amazon S3 bucket, Elastic Cache etc.                                                                                                                 |
| [Amazon Redshift Spectrum](../../11_AWSServices/10_BigDataServices/StorageDBs/DataWarehouse/AmazonRedshiftSpectrum.md)                           | Using Amazon Redshift Spectrum, you can efficiently query and retrieve structured and semi-structured data from files in Amazon S3 without having to load the data into Amazon Redshift tables.             |
| [Amazon QuickSight](../../11_AWSServices/10_BigDataServices/DataAnalytics/AmazonQuickSight.md)                                                   | Amazon QuickSight is a BI tool, through which we can query Amazon Redshift data.                                                                                                                            |
| [Amazon S3](../../11_AWSServices/10_BigDataServices/StorageDBs/DataLakes/S3DataLake.md)                                                          | Amazon S3 can be used as data in this big data use case.                                                                                                                                                    |
| [Amazon ElasticCache for Redis](../../11_AWSServices/6_DatabaseServices/AmazonElasticCache/Readme.md)                                              | Amazon Elastic Cache for Redis, can be helpful to store data like user-profile, last-access time etc. (which needs quick access in stream processing).                                                      |
| [Amazon Aurora](../../11_AWSServices/6_DatabaseServices/AmazonRDS/Readme.md)                                                                       | Amazon Aurora can be used to store user information.                                                                                                                                                        |

# Read more
- [AWS infrastructure for clickstream data analysis](https://www.automat-it.com/post/aws-infrastructure-for-a-clickstream-data-analysis)
- [Where to store clickstream data in AWS?](https://www.reddit.com/r/aws/comments/93ezn6/where_to_store_clickstream_data_in_aws/)