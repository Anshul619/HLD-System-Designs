# AWS Database Migration Service
- [AWS Database Migration Service](https://aws.amazon.com/dms/) helps to migrate other databases to [Amazon RDS](AmazonRDS/Readme.md).

![](assests/AmazonDMS.png)

# Common migration use case examples
- [MongoDB](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/MongoDB/Readme.md) to [Amazon DocumentDB](AmazonDocumentDB.md)
- Oracle and SQL Server to [Amazon Relational Database Service (Amazon RDS)](AmazonRDS/Readme.md) and [Amazon Aurora](AmazonRDS/AmazonAurora.md).
- [Cassandra](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md) to [Amazon DynamoDB](AmazonDynamoDB/Readme.md)
- Terraform to [Amazon Redshift](AmazonRedshift.md).

# AWS Schema Conversion Tool (AWS SCT)
- Heterogenous migrations, where you migrate between different database engines, requires use of the [AWS Schema Conversion Tool (AWS SCT)](https://aws.amazon.com/dms/schema-conversion-tool/) to translate your database schema to the new platform.