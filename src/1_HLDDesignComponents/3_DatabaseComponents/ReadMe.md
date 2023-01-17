
# SQL vs NoSQL

| Basis                           | SQL                                                                                                                                                                                                                                                                                                                                                | [NoSQL](NoSQL-Databases)                                                                                                                                                     |
|---------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Data Type                       | Normalized, Structured Data                                                                                                                                                                                                                                                                                                                        | Denormalized, Unstructured data                                                                                                                                              |
| Schema                          | :hammer: Fixed Schema                                                                                                                                                                                                                                                                                                                              | Dynamic Schema <br/>(with hierarchical storage supported)                                                                                                                    |
| Write Performance               | Okay<br/>- Every write is not just an append to a table but also an update to multiple index which might require locking and hence might interfere with other reads and other writes.                                                                                                                                                              | :muscle: Very Good<br/>- Writes are cheaper due to [append-only nature](../0_SystemGlossaries/AppendOnlyDataStructure.md)<br/>- Hence [High-Throughput, Low-Latency](../0_SystemGlossaries/Scalability/LatencyThroughput.md)               |
| Querying                        | :muscle: Very Powerful                                                                                                                                                                                                                                                                                                                             | Okay                                                                                                                                                                         |
| Ideal Use Cases                 | SQL is best suitable for complex queries, multi-row transactions, joins etc. <br/>- Data is structured ( like e-commerce, :moneybag: financial applications etc.) and also when data reporting is needed.                                                                                                                                          | NoSQL is best suited for unstructured data or documents (or large volume of data). <br/>- Not ideal for complex queries.<br/>- UCS like Gaming, Analytics, Online Tests etc. |
| Scalability                     | - [Vertically Scalable](../0_SystemGlossaries/Scalability/DBScalability.md#vertical-scalability--scale-up-) (increase memory, CPU of machine) or <br/>- [Single-Master-Multi-Read-Replicas technique](../0_SystemGlossaries/Scalability/DBScalability.md#db---horizontal-scaling-techniques) (1 write DB, multiple read DBs) or <br/>- Sharding based on a business parameter. | [Horizontally Scalable](../0_SystemGlossaries/Scalability/DBScalability.md#db---horizontal-scaling-techniques) (through in-built data sharding technique)                                  |
| Properties                      | [SQL enables ACID (atomicity, consistency, isolation, and durability)](../0_SystemGlossaries/ACIDPropertyTransaction.md) transaction properties.                                                                                                                                                                                                   | [NoSQL follows CAP (consistency, availability, partition tolerance)](../0_SystemGlossaries/CAPTheorem.md) properties of the distributed systems.                             |
| Best Features                   | Secure, Cross Platform Support, Free                                                                                                                                                                                                                                                                                                               | High Performance, Flexible, Easy to use                                                                                                                                      |
| Built-in Single Machine Failure | :x: Not-Supported                                                                                                                                                                                                                                                                                                                                  | :white_check_mark: Supported                                                                                                                                                 |

# How to choose database in the system design?

![img.png](assests/DecideDatabase.drawio.png)

[Read more](DecideDatabase.md)

# SQL - Intro

![img.png](assests/SQLDifferentTypes.png)

Relational databases store data in rows and columns.
- Each row contains all the information about one entity and each column contains all the separate data points.
- Some of the most popular relational databases are [AWS Aurora](../../2_AWSComponents/6_DatabaseServices/AmazonRDSAurora/Readme.md), `Postgres`, `MySQL`, `Oracle`, `MS SQL Server`, `SQLite` and `MariaDB`.
- [Read more about sharding in MySQL Cluster](https://www.mysql.com/products/cluster/scalability.html)

## What is Indexing in SQL?
- Columns that you are querying (SELECT, GROUP BY, ORDER BY, JOIN) could be faster with indices.
- Indexes are used to speed up lookups (log-time instead of scanning the entire table) and to keep the data in memory.
- Indices are usually represented as self-balancing B-tree that keeps data sorted and allows searches, sequential access, insertions, and deletions in logarithmic time.
- Placing an index can keep the data in memory, requiring more space.
- Writes could also be slower since the index also needs to be updated.
- When loading large amounts of data, it might be faster to disable indices, load the data, then rebuild the indices.
- [Read more](https://github.com/donnemartin/system-design-primer#use-good-indices)

# NoSQL - Intro, Different NoSQL types

![img.png](NoSQL-Databases/assets/NoSQL-DifferentDBtypes.drawio.png)

[Read more](NoSQL-Databases/Readme.md)

# SQL - Different Databases

## MySQL vs PostgreSQL
- [PostgreSQL is twice as fast as MySQL](https://itnext.io/benchmark-databases-in-docker-mysql-postgresql-sql-server-7b129368eed7).
- In general, PostgreSQL is a more robust, advanced database management system, well-suited for an organization that needs to perform complex queries in a large environment quickly.
- However, MySQL is an ideal solution for a company more constrained by budget and space.
- A lot of security features are built in MySQL, and it is highly secure.
- [PostgreSQL](https://www.ibm.com/cloud/blog/postgresql-vs-mysql-whats-the-difference) is appropriate for use in large systems where data needs to be authenticated and read/write speeds are critical for success. Moreover, it also supports a number of performance enhancers that are only available in proprietary solutions, including concurrency without read locks, SQL server, and Geospatial data support, among many others. In general, PostgreSQL is best suited for systems that require execution of complex queries, or data warehousing and data analysis.
- MySQL is the first choice for those web-based projects which require a database merely for data transactions and not anything intricate. It works exceptionally well in Online Analytical Processing (OLAP) and Online Transaction Processing (OLTP) systems where only high read speeds are necessary. However, MySQL will start underperforming once it is stressed with heavy loads or complex queries.
- MySQL is ideal for your project if you require an RDBMS for web applications or custom solutions, but not if you need a fully SQL-compliant RDBMS capable of performing complex tasks swiftly. Conversely, PostgreSQL is ideal for your project if your requirements revolve around complex procedures, integration, intricate designs, and data integrity.
- MySQL: SQL syntax's and stored procedures, PostgreSQL: Advanced procedures and stored procedures.

| Component                                                                 | Strength                                | Component Type                | Very Rough Throughput (QPS)                 | Latency                                                                                                                      | Pricing Model                      |
|---------------------------------------------------------------------------|-----------------------------------------|-------------------------------|---------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|------------------------------------|
| [MySQL](src/1_HLDDesignComponents/3_DatabaseComponents)                   | -                                       | SQL DB                        | 1000 concurrent requests ( 100 as default ) | [< 10ms ( to get a row from 1 million records )](https://www.quora.com/How-can-we-calculate-the-throughput-of-MySQL?share=1) | `Open Source` ( [RDS]() on AWS )   |                                                                                       |                                         |                               |                                             |                                                                                                                             |                                                            |


# References
- [Groking the System Design](https://www.educative.io/courses/grokking-the-system-design-interview/YQlK1mDPgpK)
- [SQL vs NoSQL](https://www.interviewbit.com/blog/sql-vs-nosql/)
- [Scaling Your Amazon RDS Instance Vertically and Horizontally](https://aws.amazon.com/blogs/database/scaling-your-amazon-rds-instance-vertically-and-horizontally/)
- [10 use cases where NoSQL will outperform SQL](https://www.networkworld.com/article/2999856/10-use-cases-where-nosql-will-outperform-sql.html)
- [Why is NoSQL faster than SQL?](https://softwareengineering.stackexchange.com/questions/175542/why-is-nosql-faster-than-sql)
- [Why and How to Migrate from Apache Cassandra to Amazon DynamoDB - AWS Online Tech Talks?](https://www.youtube.com/watch?v=WuDGvG_4kC8)
- [7 Database Paradigms](https://www.youtube.com/watch?v=G1rOthIU-uo)