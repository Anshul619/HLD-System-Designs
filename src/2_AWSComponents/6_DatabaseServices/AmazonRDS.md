
# [Why Amazon Aurora engine is better than Amazon RDS, for MySQL/Postgres DB engines?](AWSAuroraVsRDS.md)

# [Amazon RDS](https://aws.amazon.com/rds/) 
- Amazon RDS is a `database management service for relational databases`.
- It manages patching, upgrading, and data backups automatically. 
- It’s a database management service for structured data only ( database engines like MySQL, PostgresSQL, SQL Server etc.)
- Amazon RDS can be scaled either through [Vertical Scaling](../../1_HLDDesignComponents/0_SystemGlossaries/Scalability.md#vertical-scalability--scale-up-) or [Horizontal Scaling (master-slave)](../../1_HLDDesignComponents/0_SystemGlossaries/Scalability.md#db---horizontal-scaling-techniques).

![img.png](assests/RDS_database_engines.png)

# What is a maintenance window in Amazon RDS? Will your DB instance be available during maintenance events?
- RDS maintenance window lets you decide when DB instance modifications, database engine version upgrades, and software patching have to occur.
- The automatic scheduling is done only for patches that are related to security and durability.
- By default, there is a 30-minute value assigned as the maintenance window and the DB instance will still be available during these events though you might observe a minimal effect on performance.

# [Amazon DMS](https://aws.amazon.com/dms/)
- AWS Database Migration Service to migrate other databases to Amazon RDS.

# References
- [AWS RDS Max Connections Limit As Per Instance Type](https://sysadminxpert.com/aws-rds-max-connections-limit/)