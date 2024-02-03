# Database Cloning
- By using [Aurora cloning](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Clone.html), you can create a new cluster that initially shares the same data pages as the original, but is a separate and independent volume.

# Features

| Feature                | Remarks                                                                                                                                                                                                                          |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Copy-on-write protocol | Database cloning uses a copy-on-write protocol, in which data is copied only at the time the data changes, either on the source database or the clone database. Cloning is much faster than a manual snapshot of the DB cluster. |
| Cross-Region           | :x: No<br/>- You cannot clone databases across AWS regions. The clone databases must be created in the same region as the source databases.                                                                                      |
| Supported Engine       | Aurora Cluster                                                                                                                                                                                                                   |
| Use Case               | DB Performance Testing, Pre-Release testing etc.                                                                                                                                                                                 |

# How DB cloning works?

![](https://assets-pt.media.datacumulus.com/aws-saa-pt/assets/pt5-q59-i2.jpg)

# References
- [Efficiently synchronizing databases for production-like environment | RDS Aurora](https://medium.com/miq-tech-and-analytics/efficiently-synchronizing-databases-for-production-like-environment-rds-aurora-742fab4c2c47)
- [Getting started with Amazon Aurora Database Cloning- AWS Database in 15](https://www.youtube.com/watch?v=R5-p4HM6MNc)
