# SQL Databases
- Relational databases store data in rows and columns.
- Each row contains all the information about one entity and each column contains all the separate data points.

# Most Popular Relational Databases 
- [Amazon Aurora](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonRDS/AmazonAurora/Readme.md)
- Postgres
- MySQL
- Oracle
- MS SQL Server

# Features

| Feature            | Remarks                                                                |
|--------------------|------------------------------------------------------------------------|
| Sharding in SQL DB | [Read more](../3_Scalability-Techniques/PartitioningSharding/Readme.md) |
| SQL Tuning         | [Read more](../3_Scalability-Techniques/SQLTuning.md)                   |
| Indexing           | [Read more](../5_Database-Internals/Indexing.md)                        |

# Postgres vs MySQL

|                   | PostgreSQL                                                                                                                                                                          | MySQL                                                                   |
|-------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------|
| Speed             | [PostgreSQL is twice as fast as MySQL](https://itnext.io/benchmark-databases-in-docker-mysql-postgresql-sql-server-7b129368eed7)                                                    |                                                                         |
| Robustness        | In general, PostgreSQL is a more robust, advanced database management system, well-suited for an organization that needs to perform complex queries in a large environment quickly. |                                                                         |
| Querying          | In general, PostgreSQL is best suited for systems that require execution of complex queries, or data warehousing and data analysis or complex procedures.                           |                                                                         |
| Write Query Speed | Faster                                                                                                                                                                              |                                                                         |
| Security          |                                                                                                                                                                                     | A lot of security features are built in MySQL, and it is highly secure. |
| Scale             |                                                                                                                                                                                     | MySQL starts showing performance issues after 6TB data.                 |

[Read more](https://www.ibm.com/cloud/blog/postgresql-vs-mysql-whats-the-difference)

