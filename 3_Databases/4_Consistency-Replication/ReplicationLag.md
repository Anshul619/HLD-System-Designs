# Replication Lag - A major problem
- It takes time (known as [Replica Lag](https://cloud.google.com/sql/docs/mysql/replication/replication-lag)) for data to be replicated b/w replicas in [multiple highly available zones (or regions)](https://github.com/Anshul619/AWS-Services/tree/main/AWS-Global-Architecture-Region-AZ.md).
- Hence, [data consistency](Readme.md) won't be there for those milliseconds, which is known as [replica lag](https://cloud.google.com/sql/docs/mysql/replication/replication-lag).

# Real-world use cases

| Application                                                                                                                |
|----------------------------------------------------------------------------------------------------------------------------|
| [Replication lag - Amazon Aurora vs RDS](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonRDS/AmazonAuroraVsOtherDBEngines.md) |
| [Flipkart - MySQL Replication Lag Analysis](../../../Real-World-Tech-Stacks/Flipkart/MySQLReplicationLagAnalysis.md)            |