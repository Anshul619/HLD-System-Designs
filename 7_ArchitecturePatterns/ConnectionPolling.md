# Resource/Connection Pooling Pattern
- DB connections are a pooled resource.
- The pool () manages allocation, reuse, and cleanup.
- A key aspect is lifecycle management — detecting dead or idle connections and returning them to the pool.
- Timeout handling here ensures no resource is **checked out** forever.

# Various Tools

| Tool                                                                                               | Remarks                                                                                                                                                                    |
|----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [lib/pq](https://github.com/lib/pq)                                                                | pq - A pure Go postgres driver for Go's database/sql package.                                                                                                              |
| [RDS Proxy](https://github.com/Anshul619/AWS-Services/blob/main/1_Databases/AmazonRDS/RDSProxy.md) | Amazon RDS Proxy sits between your application and database to pool and share established database connections, improving database efficiency and application scalability. |
| [ProxySQL](https://proxysql.com/)                                                                  | ProxySQL is an open source high performance, high availability, database protocol aware proxy for MySQL and PostgreSQL.                                                    |
| [HikariCP](https://github.com/brettwooldridge/HikariCP)                                            | Fast, simple, reliable. HikariCP is a "zero-overhead" production ready JDBC connection pool.                                                                               |
| [PgBouncer](https://www.pgbouncer.org/)                                                            | Lightweight connection pooler for PostgreSQL                                                                                                                               |
