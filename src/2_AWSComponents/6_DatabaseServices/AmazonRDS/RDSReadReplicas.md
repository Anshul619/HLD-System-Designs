# RDS Read-Replicas
- [Read replicas](https://aws.amazon.com/rds/features/read-replicas/) helps in handling read traffic on RDS.

![img.png](assests/Multi-AZ/RDS-Multi-AZ-Replica.drawio.png)

# Features

| Features                                                                                                        | Applicable DB Engine?            | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
|-----------------------------------------------------------------------------------------------------------------|----------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Automatic Fail-over Priority](https://aws.amazon.com/blogs/aws/additional-failover-control-for-amazon-aurora/) | [Aurora](AmazonAurora/Readme.md) | In the event of a failover, [Amazon Aurora will promote the Read Replica that has the highest priority (the lowest numbered tier)](https://aws.amazon.com/blogs/aws/additional-failover-control-for-amazon-aurora/).<br/>- If two or more Aurora Replicas share the same priority, then Amazon RDS promotes the replica that is largest in size.<br/>- If two or more Aurora Replicas share the same priority and size, then Amazon Aurora promotes an arbitrary replica in the same promotion tier. |
| [Data transfer charges for data replication](https://aws.amazon.com/rds/faqs/)                                                                      | All RDS engines                  | NO data transfer in replicating data between the source DB instance and read replica within the same AWS Region.<br/>- [Data transfer charges apply across AWS Regions](https://aws.amazon.com/rds/faqs/).                                                                                                                                                                                                                                                                                           |

# Automatic Fail-over Priority
- Each Amazon Aurora Read Replica is associated with a [priority tier (0-15)](https://aws.amazon.com/blogs/aws/additional-failover-control-for-amazon-aurora/).

![](https://media.amazonwebservices.com/blog/2016/aurora_set_failover_priority_1.png)
