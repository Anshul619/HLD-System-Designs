# SQL - Intro

![img.png](assets/SQL-DifferentDBtypes.drawio.png)

Relational databases store data in rows and columns.
- Each row contains all the information about one entity and each column contains all the separate data points.
- Some of the most popular relational databases are [AWS Aurora](../../2_AWSComponents/6_DatabaseServices/AmazonRDS/AmazonAurora/Readme.md), `Postgres`, `MySQL`, `Oracle`, `MS SQL Server` etc.
- [Read more about sharding in MySQL Cluster](https://www.mysql.com/products/cluster/scalability.html)
- Columns that you are querying (SELECT, GROUP BY, ORDER BY, JOIN) could be faster with [indices](2_DataStructuresDB/Indexing.md).

# Key Points

| Title                   | Remarks                                                                                                                                                        |
|-------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Joins                   | Everytime you do a join, you kill a CPU cycle. Hence minimise joins.<br/>- Badly written queries with bad joins, logic etc. that take a lot of CPU and memory. |
| :star: Indexing         | [Index the columns](2_DataStructuresDB/Indexing.md) which are used in `where`, `join`, `group by`, `order by` etc. clauses.                        |
| Minimize select columns | Minimize select columns in the SQL Queries.                                                                                                                    |
| Monitor Slow Query logs | Observe [MySQL Slow Queries logs](https://severalnines.com/blog/how-identify-mysql-performance-issues-slow-queries/) and find out SLOW Queries in it.          |
| Connection Pooling      | No connection pooling in place, which cause applications to make huge number of connections in an uncontrollable manner.                                       |

# Postgres vs MySQL

| Feature           | PostgreSQL                                                                                                                                                                         | MySQL                                                                   |
|-------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------|
| Speed             | [PostgreSQL is twice as fast as MySQL](https://itnext.io/benchmark-databases-in-docker-mysql-postgresql-sql-server-7b129368eed7)                                                   | -                                                                       |
| Robustness        | In general, PostgreSQL is a more robust, advanced database management system, well-suited for an organization that needs to perform complex queries in a large environment quickly. | -                                                                       |
| Querying          | In general, PostgreSQL is best suited for systems that require execution of complex queries, or data warehousing and data analysis or complex procedures.                          | -                                                                       |
| Write Query Speed | Faster                                                                                                                                                                             | -                                                                       |
| Security          |                                                                                                                                                                                    | A lot of security features are built in MySQL, and it is highly secure. |

[Read more](ttps://www.ibm.com/cloud/blog/postgresql-vs-mysql-whats-the-difference)

# References
- [Tuning Input/Output (I/O) Operations for PostgreSQL](https://severalnines.com/blog/tuning-io-operations-postgresql/)

