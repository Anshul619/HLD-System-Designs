# SQL Tuning

| Title                   | Remarks                                                                                                                                                        |
|-------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Avoid Expensive Joins   | Everytime you do a join, you kill a CPU cycle. Hence minimise joins.<br/>- Badly written queries with bad joins, logic etc. that take a lot of CPU and memory. |
| :star: Indexing         | [Index the columns](../2_DataStructuresDB/Indexing/Readme.md), to improve READ queries performance.                                                                   |
| Minimize select columns | Minimize select columns in the SQL Queries.                                                                                                                    |
| Profile Slow Query logs | Observe [Slow Queries logs](https://severalnines.com/blog/how-identify-mysql-performance-issues-slow-queries/) and find out low performing queries.            |
| Connection Pooling      | No connection pooling in place, which cause applications to make huge number of connections in an uncontrollable manner.                                       |

# SQL - Which columns should be indexed?

The table columns which are used in following SQL constructs should be indexed.

| Constructs |
|------------|
| WHERE      |
| JOIN       |
| HAVING     |
| ORDER BY   |
| GROUP BY   |

# Read more
- [SQL Tunning - Donnemartin](https://github.com/donnemartin/system-design-primer#sql-tuning)
- [Understanding caching in Postgres - An in-depth guide](https://madusudanan.com/blog/understanding-postgres-caching-in-depth/)
- [Tuning Input/Output (I/O) Operations for PostgreSQL](https://severalnines.com/blog/tuning-io-operations-postgresql/)
- [Secret To Optimizing SQL Queries - Understand The SQL Execution Order](https://www.youtube.com/watch?v=BHwzDmr6d7s)
- [Analyzing Amazon RDS Database Workloads with Performance Insights](https://aws.amazon.com/blogs/database/analyzing-amazon-rds-database-workload-with-performance-insights/)