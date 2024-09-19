# Aurora Serverless v2
- [Aurora Serverless v2](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.html) is an on-demand, autoscaling configuration for [Amazon Aurora](../Readme.md). Hence, no need to choose an instance size.
- It helps to automate the processes of monitoring the workload and adjusting the capacity for your databases. 
- Capacity is adjusted automatically based on application demand. 
- You're charged only for the resources that your DB clusters consume. 
- Thus, **Aurora Serverless v2** can help you to stay within budget and avoid paying for computer resources that you don't use.

# Features

| Feature                                                                                                                                 | Description                                                                                                                                                                                                                                              |
|-----------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Use Case                                                                                                                                | When you can't predict the workload (low/normal base load, but spiky peaks).                                                                                                                                                                             |
| Supported DB Versions                                                                                                                   | Available for the [Amazon Aurora MySQL-Compatible Edition](../Readme.md) and [PostgreSQL-Compatible](../Readme.md) editions.                                                                                                                             |
| Scalability                                                                                                                             | DB Cluster scales automatically based on CPU/connections.                                                                                                                                                                                                |
| Migration                                                                                                                               | You can migrate from [Aurora Cluster](../Readme.md) to [Aurora Serverless]() & vice-versa.                                                                                                                                                               |
| [Only Single-Master Aurora cluster is supported](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html) | [Only Single-Master Aurora cluster is supported](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html) in Aurora Serverless i.e. there would be only 1 writer instance and multiple read replicas in different regions. |

# Parameters
- Min ACU
- Max ACU
- Incremental ACU

# References
- [Best practices for working with Amazon Aurora Serverless](https://aws.amazon.com/blogs/database/best-practices-for-working-with-amazon-aurora-serverless/)
- [Amazon Aurora Serverless v2 is Generally Available: Instant Scaling for Demanding Workloads](https://aws.amazon.com/blogs/aws/amazon-aurora-serverless-v2-is-generally-available-instant-scaling-for-demanding-workloads/#:~:text=Aurora%20Serverless%20capacity%20is%20measured,capacity%20supported%20is%20128%20ACU.)
- [Performance and scaling for Aurora Serverless v2](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.setting-capacity.html)