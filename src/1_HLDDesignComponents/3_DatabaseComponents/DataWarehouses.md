# Data Warehouses
- Data warehouse (also known as [Online analytical processing - OLAP](https://en.wikipedia.org/wiki/Online_analytical_processing)) are used for data analytics (real-time) & insights.
- The process of getting data in Data Warehouse is called [ETL](#ETL).
- Data model of a data warehouse is most commonly relational, because SQL is generally a good fit for analytic queries.
- [Amazon Redshift](../../2_AWSComponents/6_DatabaseServices/AmazonRedshift.md) is most commonly used data warehouse on AWS.

# Why Data Warehouses?
- Usually an analytic query needs to scan over a huge number of records, only reading a few columns per record, and calculates aggregate statistics (such as count, sum, or average) rather than returning the raw data to the user.
- Hence, it's better to use separate database for analytics (than transaction database).
- Also, data warehouses are optimized for analytic access patterns (SQL based, no indexes, [column-oriented storage](https://en.wikipedia.org/wiki/Column-oriented_DBMS))

# ETL
[ETL](https://aws.amazon.com/what-is/etl/) stands for Extract-Transform-Load.

In the world of data warehousing, if you need to bring data from multiple different data sources into one, centralized database, you must first:
- EXTRACT data from its original source
- TRANSFORM data by de-duplicating it, combining it, ensuring quality & best suited for analytics, to then
- LOAD data into the target database.

![](https://rivery.io/wp-content/uploads/2020/05/ETL-Process-for-linkedin3-1024x535.png)