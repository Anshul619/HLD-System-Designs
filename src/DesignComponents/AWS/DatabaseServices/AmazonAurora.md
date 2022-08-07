
# [Amazon Aurora](https://aws.amazon.com/rds/aurora/)
- Designed for unparalleled high performance and availability at global scale with full MySQL and PostgreSQL compatibility ( that means your drivers will work as if Aurora was a Postgres or MySQL database).
- Aurora is a proprietary technology from AWS (not open sourced).
- Aurora is `AWS Cloud Optimized` and claims `5x performance improvement over MySQL on RDS`, over `3x performance improvement over Postgres on RDS`.

![img.png](assests/aurora.png)

## Amazon Aurora High Availability & Scaling
- Aurora is highly available and fail over is instantaneous. 
- Aurora supports `Auto Expanding` & its storage automatically grows in increments of 10GB, up to 128 TB.
- It automatically maintains `6 copies of the data across 3 Availability Zones` and automatically backs up data in `Amazon S3`.
- Highly available for writes - `4 copies out of 6` are for writes.
- Highly available for reads - `3 copies out of 6` are for reads.
- One Aurora Instance takes writes (master)
- Automated fail over for master in less than 30 seconds.
- One master can have up to 15 Aurora Read Replicas server reads.
- Support for cross-region replication.
- Read replicas can be auto-scaled.

![img.png](assests/aurora_high_availability_img.png)

## Aurora DB Cluster

![img.png](assests/aurora_db_cluster_img.png)

## Aurora Security ( similar to RDS )
- Encryption at rest using KMS
- Automated backups, snapshots & replicas are also encrypted.
- Encryption in flight/transmit using SSL
- Authentication using IAM

## Aurora Serverless
- No need to choose an instance size
- Only supports MySQL 5.6 (as of Jan 2019) & Postgres ( beta )
- Helpful when you can't predict the workload
- DB Cluster starts, shutdown and scales automatically based on CPU/connections.
- Can migrate from Aurora Cluster to Aurora Serverless & vice-versa.
- Aurora serverless usage is measured in ACU ( Aurora Capacity Units )
- Billed in 5 mins increment of ACU

# Cloudformation template
- [Aurora Serverless - Cloudformation template](../AWSResourceMgmtServices/CloudFormation/templates/aurora_serverless.yml)
- [Amazon Aurora Introduction - By Stephane Maarek](https://www.youtube.com/watch?v=ZCt3ctVfGIk)