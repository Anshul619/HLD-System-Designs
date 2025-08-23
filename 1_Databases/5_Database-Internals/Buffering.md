# Database Buffers
- A [database buffer](https://www.javatpoint.com/database-buffer) is a temporary storage area in the main memory. 
- It allows storing the data temporarily when moving from one place to another. 
- A database buffer stores a copy of disk blocks. 
- But, the version of block copies on the disk may be older than the version in the buffer.

# Various database buffers

| Buffer                                                                                 | Type  | Database            | Remarks                                                                      |
|----------------------------------------------------------------------------------------|-------|---------------------|------------------------------------------------------------------------------|
| [Shared buffers](https://www.postgresql.org/docs/current/runtime-config-resource.html) | Read  | PostgreSQL          | PostgreSQL recommends you to give 25% of your system memory to shared buffer |
| Buffer Cache                                                                           | Read  | MySQL               |                                                                              |
| [MemTables](DataStructures/LSMTree.md)                                                 | Write | LSM (Casandra etc.) |                                                                              |

# What is stored in read buffer?
- [Indexes (B-Tree)](DataStructures/BTree.md)
- Recently accessed data in tables

# References
- [An Overview of Caching for PostgreSQL](https://severalnines.com/blog/overview-caching-postgresql/)
- [Working with parameters on your RDS for PostgreSQL DB instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.PostgreSQL.CommonDBATasks.Parameters.html)
- [A Comprehensive Guide: PostgreSQL Shared Buffers](https://postgreshelp.com/postgresql_shared_buffers/)