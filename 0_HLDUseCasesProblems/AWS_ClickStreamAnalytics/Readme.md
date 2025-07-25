# AWS infrastructure for a clickstream data analysis

# Requirements
- Analysing the user's behaviour is very important for making right decisions in application development and maximising business value.
- We expect that clickstream events incoming to our system will be small pieces of data that are generated continuously with high speed and volume.

# System Design

![](AWSClickStreamAnalytic.png)

# Tech Stack

| Service                                                                                                              | Remarks                                                                                                                                                                                                     |
|----------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Amazon API gateway](../../2_AWS/16_NetworkingAndContentDelivery/2_ApplicationNetworking/AmazonAPIGateway/Readme.md) | Amazon API Gateway will automatically scale to handle the amount of traffic your API receives.                                                                                                              |
| [AWS WAF](../../2_AWS/17_SecurityServices/2_InfraProtectionServices/AWSWAF.md)                                       | Rate-limiting with requests validation or protection.                                                                                                                                                       |
| [Amazon Kinesis Data Streams](../../2_AWS/4_MessageBrokerServices/AmazonKinesis/Readme.md)                           | Field `user_id` was also used as a partition key for Kinesis Data Stream to segregate and route records to different shards of a data stream.                                                               |
| [Amazon Managed Apache Flink](../../2_AWS/10_BigDataServices/DataProcessing/AmazonManagedServiceForApacheFlink.md)   | Amazon Kinesis Data Analytics is the easiest way to transform and analyze streaming data in real time. We can use either standard SQL or Apache Flink libraries for complex event processing.               |
| [Amazon Data Firehose](../../2_AWS/10_BigDataServices/DataConnectors/AmazonDataFirehouse/Readme.md)                  | Amazon Kinesis Data Firehose is the easiest way to reliably load streaming data into data lakes, data stores, and analytics services.                                                                       |
| [AWS Lambda](../../2_AWS/2_ComputeServices/AWSLambda/Readme.md)                                                      | AWS Lambda can be used for different compute jobs like update redis etc.                                                                                                                                    |
| [AWS Glue](../../2_AWS/10_BigDataServices/DataProcessing/AWSGlue.md)                                                 | An AWS Glue job encapsulates a script that connects to your source data, processes it, and then writes it out to your data target. <br/>- Typically, a job runs extract, transform, and load (ETL) scripts. |
| [Amazon Athena](../../2_AWS/10_BigDataServices/DataConsumption/AmazonAthena.md)                                      | Amazon Athena can be used to query & analyse data from Amazon S3 bucket, Elastic Cache etc.                                                                                                                 |
| [Amazon Redshift Spectrum](../../2_AWS/10_BigDataServices/DataStorage/DataWarehouses/AmazonRedshiftSpectrum.md)      | Using Amazon Redshift Spectrum, you can efficiently query and retrieve structured and semi-structured data from files in Amazon S3 without having to load the data into Amazon Redshift tables.             |
| [Amazon QuickSight](../../2_AWS/10_BigDataServices/DataConsumption/AmazonQuickSight.md)                              | Amazon QuickSight is a BI tool, through which we can query Amazon Redshift data.                                                                                                                            |
| [Amazon S3](../../2_AWS/10_BigDataServices/DataStorage/DataLakes/S3DataLake.md)                                      | Amazon S3 can be used as data in this big data use case.                                                                                                                                                    |
| [Amazon ElasticCache for Redis](../../2_AWS/1_DatabaseServices/AmazonElasticCache/Readme.md)                         | Amazon Elastic Cache for Redis, can be helpful to store data like user-profile, last-access time etc. (which needs quick access in stream processing).                                                      |
| [Amazon Aurora](../../2_AWS/1_DatabaseServices/AmazonRDS/Readme.md)                                                  | Amazon Aurora can be used to store user information.                                                                                                                                                        |

# Read more
- [AWS infrastructure for clickstream data analysis](https://www.automat-it.com/post/aws-infrastructure-for-a-clickstream-data-analysis)
- [Where to store clickstream data in AWS?](https://www.reddit.com/r/aws/comments/93ezn6/where_to_store_clickstream_data_in_aws/)