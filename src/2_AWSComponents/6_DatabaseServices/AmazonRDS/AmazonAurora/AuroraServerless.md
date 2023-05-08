
# Aurora Serverless
- With [Aurora Serverless](https://aws.amazon.com/rds/aurora/serverless/), there is no need to choose an instance size.

![img.png](../assets/Multi-AZ/RDS-Multi-AZ-Replica.drawio.png)

# Features

| Feature                                                                                                                                 | Description                                                                                                                                                                                                                                              |
|-----------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Use Case                                                                                                                                | When you can't predict the workload (low/normal base load, but spiky peaks).                                                                                                                                                                             |
| Supported DB Versions                                                                                                                   | Available for the [Amazon Aurora MySQL-Compatible Edition](Readme.md) and [PostgreSQL-Compatible](Readme.md) Edition.                                                                                                                        |
| Scalability                                                                                                                             | DB Cluster starts, shutdown and scales automatically based on CPU/connections.                                                                                                                                                                           |
| Migration                                                                                                                               | Can migrate from [Aurora Cluster](Readme.md) to [Aurora Serverless]() & vice-versa.                                                                                                                                                                |
| [ACU (Aurora Capacity Units)](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v1.how-it-works.html)      | Aurora serverless usage is measured in [ACU (Aurora Capacity Units)](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v1.how-it-works.html).                                                                               |
| [Only Single-Master Aurora cluster is supported](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html) | [Only Single-Master Aurora cluster is supported](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html) in Aurora Serverless i.e. there would be only 1 writer instance and multiple read replicas in different regions. |

# Other Links
- [Aurora Serverless - Cloudformation template](../../../9_InfrastructureAsCode/AWSCloudFormation/sample_templates/aurora_serverless.yml)

# References
- [Best practices for working with Amazon Aurora Serverless](https://aws.amazon.com/blogs/database/best-practices-for-working-with-amazon-aurora-serverless/)
- [Amazon Aurora Serverless v2 is Generally Available: Instant Scaling for Demanding Workloads](https://aws.amazon.com/blogs/aws/amazon-aurora-serverless-v2-is-generally-available-instant-scaling-for-demanding-workloads/#:~:text=Aurora%20Serverless%20capacity%20is%20measured,capacity%20supported%20is%20128%20ACU.)