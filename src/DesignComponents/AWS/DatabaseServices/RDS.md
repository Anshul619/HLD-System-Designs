
# [Amazon RDS](https://aws.amazon.com/rds/) 
- Amazon RDS is a `database management service for relational databases`. 
- It manages patching, upgrading, and data backups automatically. 
- It’s a database management service for structured data only ( database engines like MySQL, PostgresSQL, SQL Server etc.)

![img.png](../assests/RDS_database_engines.png)

# [Amazon DMS](https://aws.amazon.com/dms/)
- AWS Database Migration Service, to migrate other database to Amazon RDS.

# [Amazon Aurora](https://aws.amazon.com/rds/aurora/)
- Designed for unparalleled high performance and availability at global scale with full MySQL and PostgreSQL compatibility.

# Which type of scaling would you recommend for RDS and why?

## Vertical Scaling
- Vertical scaling lets you vertically scale up your master database with the press of a button. 
- A database can only be scaled vertically, and there are 18 different instances in which you can resize the RDS.

## Horizontal Scaling
- On the other hand, horizontal scaling is good for replicas. 
- `These are read-only replicas that can only be done through Amazon Aurora`.

# What is a maintenance window in Amazon RDS? Will your DB instance be available during maintenance events?
- RDS maintenance window lets you decide when DB instance modifications, database engine version upgrades, and software patching have to occur.
- The automatic scheduling is done only for patches that are related to security and durability.
- By default, there is a 30-minute value assigned as the maintenance window and the DB instance will still be available during these events though you might observe a minimal effect on performance.