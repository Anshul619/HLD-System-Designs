# Data Lake
- A [data lake](https://aws.amazon.com/big-data/datalakes-and-analytics/what-is-a-data-lake/) is a centralized repository that allows you to store all your structured and unstructured data at any scale. 
- You can store your data as-is, without having to first structure the data, and run different types of analytics—from dashboards and visualizations to big data processing, real-time analytics, and machine learning to guide better decisions.

![](https://d1.awsstatic.com/AWS_Analytics_2021_LakeHouse.337c5d294eae24fe954c1d2e93fcda03233dfba4.png)

# Data Lake vs Data Warehouses

|                   | Data Warehouse                                                                                   | Data Lake                                                                                                         |
|-------------------|--------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| Data              | Relational from transactional systems, operational databases, and line of business applications. | Non-relational and relational from IoT devices, web sites, mobile apps, social media, and corporate applications. |
| Schema            | Designed prior to the DW implementation (schema-on-write).                                       | Written at the time of analysis (schema-on-read).                                                                 |
| Price/Performance | Fastest query results using higher cost storage                                                  | Query results getting faster using low-cost storage                                                               |
| Data Quality      | Highly curated data that serves as the central version of the truth.                             | Any data that may or may not be curated (ie. raw data)                                                            |
| Users             | Business analysts                                                                                | Data scientists, Data developers, and Business analysts (using curated data)                                      |
| Analytics         | Batch reporting, BI and visualizations                                                           | Machine Learning, Predictive analytics, data discovery and profiling.                                             |

# AWS Services

| Service                                                                                         |
|-------------------------------------------------------------------------------------------------|
| [Amazon S3](../../../2_AWSComponents/7_StorageServices/3_ObjectStorageS3/Readme.md) |
| [AWS lake formation](../../../2_AWSComponents/10_BigDataComponents/DataLakes/AWSLakeFormation.md)         |

# Types of zones

| Zone type                                                                                                        | Description                                                                                                                                                                                                                                                                                                                   |
|------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Landing zone](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/)    | Also called the [raw zone, bronze zone or even the swamp](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/) is a place that contains the source data as is, with no transformation, such as a raw log file or a binary file coming from a mainframe.                             |
| [Refinery zone](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/)   | Also called the [silver zone, the pond, the sandbox, the exploration zone](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/), is the place where data can be discovered, explored and experimented with for hypothesis validation and tests.                                     |
| [Production zone](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/) | Also called the [gold zone, the refined zone, the lagoon, operationalization zone](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/), is where clean, well structured data is stored in the optimal format to inform critical business decisions and drive efficient operations. |
