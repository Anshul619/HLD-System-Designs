# [Aurora Serverless](https://aws.amazon.com/rds/aurora/serverless/)
- `No need to choose an instance size`. Helpful when you can't predict the workload.
- Available for the Amazon Aurora MySQL-Compatible Edition and PostgreSQL-Compatible Edition.
- DB Cluster starts, shutdown and scales automatically based on CPU/connections.
- Can migrate from [Aurora Cluster](AuroraDBClusters.md) to Aurora Serverless & vice-versa.
- Aurora serverless usage is measured in `ACU ( Aurora Capacity Units )`.
- Billed in 5 mins increment of ACU.
- [Aurora Serverless - Cloudformation template](../../3_InfraAutomation/CloudFormation/templates/aurora_serverless.yml)