# Data Lake
- A [data lake](https://aws.amazon.com/big-data/datalakes-and-analytics/what-is-a-data-lake/) is a centralized repository that allows you to store all your structured and unstructured data at any scale. 
- You can store your data as-is, without having to first structure the data, and run different types of analytics—from dashboards and visualizations to big data processing, real-time analytics, and machine learning to guide better decisions.

# AWS Services

| Service                                                                                                |
|--------------------------------------------------------------------------------------------------------|
| [Amazon S3](https://github.com/Anshul619/AWS-Services/tree/main/10_BigData/DataStorage/DataLakes/S3DataLake.md)                |
| [AWS lake formation](https://github.com/Anshul619/AWS-Services/tree/main/10_BigData/DataStorage/DataLakes/AWSLakeFormation.md) |

# Types of zones

| Zone type       | Description                                                                                                                                                                                                                                                                                                                   |
|-----------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Landing zone    | Also called the [raw zone, bronze zone or even the swamp](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/) is a place that contains the source data as is, with no transformation, such as a raw log file or a binary file coming from a mainframe.                             |
| Refinery zone   | Also called the [silver zone, the pond, the sandbox, the exploration zone](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/), is the place where data can be discovered, explored and experimented with for hypothesis validation and tests.                                     |
| Production zone | Also called the [gold zone, the refined zone, the lagoon, operationalization zone](https://www.trifacta.com/blog/from-raw-to-refined-the-staging-areas-of-your-data-lake-part-1/), is where clean, well structured data is stored in the optimal format to inform critical business decisions and drive efficient operations. |
