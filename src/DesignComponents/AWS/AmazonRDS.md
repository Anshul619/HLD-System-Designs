
# [Amazon RDS](https://aws.amazon.com/rds/) 
- Amazon RDS is a database management service for relational databases. 
- It manages patching, upgrading, and data backups automatically. 
- It’s a database management service for structured data only.

# What is a maintenance window in Amazon RDS? Will your DB instance be available during maintenance events?
- RDS maintenance window lets you decide when DB instance modifications, database engine version upgrades, and software patching have to occur.
- The automatic scheduling is done only for patches that are related to security and durability.
- By default, there is a 30-minute value assigned as the maintenance window and the DB instance will still be available during these events though you might observe a minimal effect on performance.
