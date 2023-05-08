# Amazon RedShift
- [Amazon RedShift](https://aws.amazon.com/redshift/) is a [data warehouse service](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/BigData/DataWarehouses.md) in AWS.
- [Amazon Redshift]() is not designed for continuous ingestion of data in real time.

![](https://lucyinthecloud.com/app/uploads/2021/07/amazon-redshift.png)

# Amazon Redshift & PostgresQL
- [Amazon Redshift]() is based on [PostgreSQL](../../../1_HLDDesignComponents/3_DatabaseComponents/Readme.md).
- [Amazon Redshift]() and [PostgreSQL](../../../1_HLDDesignComponents/3_DatabaseComponents/Readme.md) have a number of important differences that you must be aware of as you design and develop your data warehouse applications.

# General Use Cases

| Use Case                               |
|----------------------------------------|
| Improve financial and demand forecasts |
| Collaborate and share data             |
| Optimize your business intelligence    |
| Increase developer productivity        |

# Data Analytics on Redshift

| Tool              | Description                                                                                                                                            |
|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|
| SQL based queries | The SQL language consists of commands that you use to create and manipulate database objects, run queries, load tables, and modify the data in tables. |
| Third-party tools | Looker, Tableau etc.                                                                                                                                   |

# Amazon Redshift Spectrum
- [Amazon Redshift Spectrum](https://docs.aws.amazon.com/redshift/latest/dg/c-getting-started-using-spectrum.html) can be used to perform in-place querying of data assets in an [Amazon S3-based data lake](../../7_StorageServices/3_ObjectStorageS3/Readme.md). 
- However, data assets must be loaded into Amazon Redshift before queries run. 