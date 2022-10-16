
# Aurora Serverless
- With [Aurora Serverless](https://aws.amazon.com/rds/aurora/serverless/), there is no need to choose an instance size. 
- It is helpful when you can't predict the workload (low/normal base load, but spiky peaks ).
- Available for the Amazon Aurora MySQL-Compatible Edition and PostgreSQL-Compatible Edition.
- DB Cluster starts, shutdown and scales automatically based on CPU/connections.
- Can migrate from [Aurora Cluster](AuroraDBClusters.md) to [Aurora Serverless]() & vice-versa.
- Aurora serverless usage is measured in [ACU ( Aurora Capacity Units )](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v1.how-it-works.html).

# How AWS internally handles load in Aurora Serverless?

![img.png](https://d2908q01vomqb2.cloudfront.net/887309d048beef83ad3eabf2a79a64a389ab1c9f/2020/11/27/Amazon-Aurora-Serverless-2.jpg)

# Other Links
- [Aurora Serverless - Cloudformation template](../../3_InfraAutomation/AWSCloudFormation/templates/aurora_serverless.yml)

# References
- [Best practices for working with Amazon Aurora Serverless](https://aws.amazon.com/blogs/database/best-practices-for-working-with-amazon-aurora-serverless/)