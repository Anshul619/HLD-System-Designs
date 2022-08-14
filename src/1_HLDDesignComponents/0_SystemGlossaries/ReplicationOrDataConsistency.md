
# Replication Or Data Consistency 
- Replication is widely used in the [distributed](README.md#key-characteristics-of-distributed-systems) & [highly available](HighAvailability.md) database management systems (DBMS), usually with a [master-slave](Scalability.md#db---horizontal-scaling-techniques) technique.
- The master server gets all the updates, which then ripple through to the slave servers.
  - It takes time (known as [Replication Lag](https://cloud.google.com/sql/docs/mysql/replication/replication-lag)) for data to be replicated in multiple [highly available zones ( or regions )](../../2_AWSComponents/AWS-Global-Architecture-Region-AZ.md).
  - Hence `Data Consistency won't be there for those milliseconds`.
- Each slave outputs a message stating that it has received the update successfully, thus allowing the sending of subsequent updates.
- Read more about replication lag in [Amazon Aurora vs RDS](../../2_AWSComponents/6_DatabaseServices/AWSAuroraVsRDS.md).

## Various consistency models

### Eventual Consistency Model
- Eventual Consistency Model `maximizes the read throughput`.
- However, it might not reflect the results of a recently completed write.
- Fortunately, all the copies of data usually reach consistency within a second.

### Strong Consistency Model
- This model has a delay in writing the data, but it guarantees that you will always see the updated data every time you read it.

# References
- [Redundancy and Replication](https://github.com/jeremyyew/tech-prep-jeremy.io/blob/master/systems-design/topics/databases/redundancy-and-replication.md)