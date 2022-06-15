
# SQL - Intro

Relational databases store data in rows and columns.
- Each row contains all the information about one entity and each column contains all the separate data points.
- Some of the most popular relational databases are AWS RDS, Postgres, MySQL, Oracle, MS SQL Server, SQLite and MariaDB.

<img title="SQL - Different Types" alt="Alt text" src="SQL - Different Types.drawio.png">

# MySQL - Intro, Different NoSQL types

## Key-Value Stores 
- Data is stored in an array of key-value pairs. 
- The ‘key’ is an attribute name which is linked to a ‘value’. 
- Well-known key-value stores include AWS Dynamo, Redis & Voldemort .

## Document Databases 
- In these databases, data is stored in documents (instead of rows and columns in a table) and these documents are grouped together in collections. 
- Each document can have an entirely different structure. 
- Document databases include the CouchDB and MongoDB.

## Wide-Column Databases 
- Instead of ‘tables,’ in column databases we have column families, which are containers for rows. 
- Like HBase

## Graph Databases 
- These databases are used to store data whose relations are best represented in a graph. 
- Data is saved in graph structures with nodes (entities), properties (information about the entities), and lines (connections between the entities).

<img title="NoSQL - Different DB types" alt="Alt text" src="NoSQL - Different DB types.drawio.png">

# NoSQL vs SQL
Basis                                 | SQL                                                                                                                                                                                      | NoSQL                                                                                                               |
---------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
Write Performance | Not good<br/>- Every write is not just an append to a table but also an update to multiple index which might require locking and hence might interfere with other reads and other writes | Very Good<br/>- Writes are cheaper                                                                                  |                                                                                             |
Querying | Very Powerful                                                                                                                                                                            | Okay                                                                                                                |                                                                                             |
Scalability | Vertically Scalable ( increase memory, CPU of machine ) or Master-Slave technique ( 1 write DB, multiple read DBs )                                                                      | Horrizontally Scalable ( through in-built data sharding technique )                                                 |                                                                                             |
Schema | Fixed Schema                                                                                                                                                                             | Dynamic Schema ( with hierarchical storage supported )                                                              |                                                                                             |
Ideal Use Cases | SQL is best suitable for complex queries, multi-row transactions, joins etc. Data is structured ( like e-commerce, financial applications etc.) and also when data reporting is needed.  | NoSQL is best suited for unstructured data or documents ( or large volume of data ). Not ideal for complex queries. |                                                                                             |
Properties | SQL enables ACID(atomicity, consistency, isolation, and durability) properties.                                                                                                          | NonSQL follows CAP (consistency, availability, partition tolerance) properties.                                     |                                                                                             |
Best Features | Secure, Cross Platform Support, Free                                                                                                                                                     | High Performance, Flexible, Easy to use                                                                             |
Built-in Single Machine Failure | Supported | Not-Supported                                                                                                       |

# References
- https://www.educative.io/courses/grokking-the-system-design-interview/YQlK1mDPgpK
- https://www.interviewbit.com/blog/sql-vs-nosql/
- https://aws.amazon.com/blogs/database/scaling-your-amazon-rds-instance-vertically-and-horizontally/