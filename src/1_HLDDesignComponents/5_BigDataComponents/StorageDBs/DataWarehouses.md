# Data Warehouses
- Data warehouse (part of [Online analytical processing - OLAP](../../3_DatabaseComponents/1_Glossaries/OLTPvsOTAP.md)) are used for data analytics (real-time) & insights.
- The process of getting data in Data Warehouse is called [Extract-Transform-Load (ETL)](../ETLServices/Readme.md).
- Data model of a data warehouse is most commonly relational, because [SQL](../../3_DatabaseComponents/SQL-DBs.md) is generally a good fit for analytic queries.
- [Amazon Redshift](../../../2_AWSComponents/10_BigDataComponents/StorageDBs/DataWarehouse/AmazonRedshift.md) is most commonly used data warehouse on AWS.
- This type of database is also known as [Columnar Database](https://aws.amazon.com/nosql/columnar/).

![](../BigData-ETL-OLTP-OLAP-DataLake.png)

# Why Data Warehouses?
- Usually an analytic query needs to scan over a huge number of records, only reading a few columns per record, and calculates aggregate statistics (such as count, sum, or average) rather than returning the raw data to the user.
- Hence, it's better to use separate database for analytics (than transaction database).
- Also, data warehouses are optimized for analytic access patterns ([SQL based](../../3_DatabaseComponents/SQL-DBs.md) with no indexes).
