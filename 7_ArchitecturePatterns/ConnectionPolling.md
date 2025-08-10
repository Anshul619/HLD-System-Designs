# Resource/Connection Pooling Pattern
- DB connections are a pooled resource.
- The pool ([pq](https://github.com/lib/pq), [RDS Proxy](https://github.com/Anshul619/AWS-Services/blob/main/1_Databases/AmazonRDS/RDSProxy.md), HikariCP, PgBouncer) manages allocation, reuse, and cleanup.
- A key aspect is lifecycle management — detecting dead or idle connections and returning them to the pool.
- Timeout handling here ensures no resource is **checked out** forever.