# Amazon RedShift
- [Amazon RedShift](https://aws.amazon.com/redshift/) is a [data warehouse service](../../1_HLDDesignComponents/3_DatabaseComponents/DataWarehouses.md) in AWS.

![](https://lucyinthecloud.com/app/uploads/2021/07/amazon-redshift.png)

# General Use Cases
- Improve financial and demand forecasts
- Collaborate and share data
- Optimize your business intelligence
- Increase developer productivity

# SQL based
- The SQL language consists of commands that you use to create and manipulate database objects, run queries, load tables, and modify the data in tables.
- Amazon Redshift is based on [PostgreSQL](../../1_HLDDesignComponents/3_DatabaseComponents/Readme.md). 
- Amazon Redshift and [PostgreSQL](../../1_HLDDesignComponents/3_DatabaseComponents/Readme.md) have a number of important differences that you must be aware of as you design and develop your data warehouse applications.

# Amazon Redshift Spectrum
- A second way to perform in-place querying of data assets in an [Amazon S3-based data lake](../7_StorageServices/3_ObjectStorageTypes/AmazonS3/Readme.md) is to use Amazon Redshift Spectrum. 
- Amazon Redshift is a large-scale, managed data warehouse service used with data assets in [Amazon S3](../7_StorageServices/3_ObjectStorageTypes/AmazonS3/Readme.md). 
- However, data assets must be loaded into Amazon Redshift before queries run. 