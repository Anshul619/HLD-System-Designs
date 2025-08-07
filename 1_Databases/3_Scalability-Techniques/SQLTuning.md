# SQL Tuning

| Title                                | Remarks                                                                                                                                                                                                               |
|--------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: Avoid Expensive Joins         | Everytime you do a join, you kill a CPU cycle. Hence minimise joins.<br/>- Badly written queries with bad joins, logic etc. that take a lot of CPU and memory.                                                        |
| :star: Indexing                      | [Index the columns](../5_Database-Internals/Indexing.md), to improve READ queries performance.                                                                                                                         |
| Minimize select columns              | Minimize select columns in the SQL Queries.                                                                                                                                                                           |
| Profile Slow Query logs              | Observe [Slow Queries logs](https://severalnines.com/blog/how-identify-mysql-performance-issues-slow-queries/) and find out low performing queries.                                                                   |
| Connection Pooling                   | No connection pooling in place, which cause applications to make huge number of connections in an uncontrollable manner.                                                                                              |
| Prevent having JSON columns          | Selecting JSON columns degrades SQL query performance. [Read more](https://stackoverflow.com/questions/71086258/query-on-json-jsonb-column-super-slow-can-i-use-an-index).                                            |
| Materialized Views, De-normalization |                                                                                                                                                                                                                       |
| Understand query planner             | The [PostgreSQL query execution mechanism](https://pganalyze.com/docs/explain/basics-of-postgres-query-planning) is fairly intricate, but important to understand well in order to get the most out of your database. |
| Regular Vaccum                       | [VACUUM](https://www.postgresql.org/docs/current/sql-vacuum.html) — garbage-collect and optionally analyze a database                                                                                                                                                                                                                      |

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
- [How does SQL trigger affect performance?](https://stackoverflow.com/questions/56990262/how-does-sql-trigger-affect-performance)