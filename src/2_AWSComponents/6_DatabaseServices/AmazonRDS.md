
# Amazon RDS
- [Amazon RDS](https://aws.amazon.com/rds/) is a database management service for relational databases.
- It manages patching, upgrading, and data backups automatically. 
- It's a database management service for structured data only (database engines like MySQL, PostgresSQL, SQL Server etc.).
- Amazon RDS can be scaled either through [Vertical Scaling](../../1_HLDDesignComponents/0_SystemGlossaries/Scalability/DBScalability.md) or [Horizontal Scaling (master-slave)](../../1_HLDDesignComponents/0_SystemGlossaries/Scalability/DBScalability.md).
- [Why Amazon Aurora engine is better than Amazon RDS, for MySQL/Postgres DB engines?](AmazonAuroraVsRDS.md)

![img.png](assests/RDS_database_engines.png)

# Amazon RDS - High Availability
- For your MySQL, MariaDB, PostgreSQL, Oracle, and SQL Server database (DB) instances, you can use [Amazon RDS Multi-AZ deployments](https://aws.amazon.com/rds/ha/). 
- When [you provision a Multi-AZ DB instance](https://aws.amazon.com/rds/features/multi-az/), Amazon RDS automatically creates a primary DB instance and synchronously replicates the data to a standby instance in a different Availability Zone (AZ). 
- In case of an infrastructure failure, Amazon RDS performs an automatic failover to the standby DB instance. 
- Since the endpoint for your DB instance remains the same after a failover, your application can resume database operation without the need for manual administrative intervention.
- [High availability in Aurora - Read here](AmazonRDSAurora/Readme.md#high-availability)

![img.png](assests/rds_ha_setup_steps.png)

# Security
- Encryption at rest using [AWS KMS](../2_SecurityAndIdentityServices/AWSKMS.md).
- Authentication using [AWS IAM](../2_SecurityAndIdentityServices/AWSUsers&AccessMgmt/AWSIAM.md).
- Automated backups, snapshots & replicas are also encrypted.
- Encryption in flight/transmit using SSL.

# Other Links
- [DB instance classes](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html).
- [AWS Database Migration Service](https://aws.amazon.com/dms/) helps to migrate other databases to Amazon RDS.

# What is a maintenance window in Amazon RDS? Will your DB instance be available during maintenance events?
- RDS maintenance window lets you decide when DB instance modifications, database engine version upgrades, and software patching have to occur.
- The automatic scheduling is done only for patches that are related to security and [durability](../../1_HLDDesignComponents/0_SystemGlossaries/Durability.md).
- By default, there is a 30-minute value assigned as the maintenance window and the DB instance will still be available during these events though you might observe a minimal effect on performance.

# References
- [Amazon RDS High Availability](https://aws.amazon.com/rds/ha/)
- [AWS RDS Max Connections Limit As Per Instance Type](https://sysadminxpert.com/aws-rds-max-connections-limit/)
- [What does it mean by read replica in Amazon RDS? Is that similar to the slave server?](https://www.quora.com/What-does-it-mean-by-read-replica-in-Amazon-RDS-Is-that-similar-to-the-slave-server)
- [Is Amazon RDS for PostgreSQL or Amazon Aurora PostgreSQL a better choice for me?](https://aws.amazon.com/blogs/database/is-amazon-rds-for-postgresql-or-amazon-aurora-postgresql-a-better-choice-for-me/)