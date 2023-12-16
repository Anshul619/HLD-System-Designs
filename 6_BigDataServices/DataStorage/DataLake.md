# Data Lake
- A [data lake](https://aws.amazon.com/big-data/datalakes-and-analytics/what-is-a-data-lake/) is a centralized repository that allows you to store all your structured and unstructured data at any scale. 
- You can store your data as-is, without having to first structure the data, and run different types of analytics—from dashboards and visualizations to big data processing, real-time analytics, and machine learning to guide better decisions.

# AWS Services

| Service                                                                                                |
|--------------------------------------------------------------------------------------------------------|
| [Amazon S3](../../2_AWSServices/7_StorageServices/3_ObjectStorageS3/Readme.md)                         |
| [AWS lake formation](../../2_AWSServices/10_BigDataServices/DataStorage/DataLakes/AWSLakeFormation.md) |

# Types of zones

| Zone type                                                                                                        | Description                                                                                                                                                                                                                                                                                                                   |
|------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Landing zone](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/)    | Also called the [raw zone, bronze zone or even the swamp](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/) is a place that contains the source data as is, with no transformation, such as a raw log file or a binary file coming from a mainframe.                             |
| [Refinery zone](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/)   | Also called the [silver zone, the pond, the sandbox, the exploration zone](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/), is the place where data can be discovered, explored and experimented with for hypothesis validation and tests.                                     |
| [Production zone](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/) | Also called the [gold zone, the refined zone, the lagoon, operationalization zone](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/), is where clean, well structured data is stored in the optimal format to inform critical business decisions and drive efficient operations. |
