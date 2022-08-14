
# Replication And Data Consistency 
- Replication is widely used in the [distributed](README.md#key-characteristics-of-distributed-systems) & [highly available](HighAvailability.md) database management systems (DBMS), usually with a [master-slave](Scalability.md#db---horizontal-scaling-techniques) technique.
- The master server gets all the updates, which then ripple through to the slave servers.
- It takes time (known as [Replica Lag](https://cloud.google.com/sql/docs/mysql/replication/replication-lag)) for data to be replicated in [multiple highly available zones ( or regions )](../../2_AWSComponents/AWS-Global-Architecture-Region-AZ.md).
- Hence `Data Consistency won't be there for those milliseconds`.
- Each slave outputs a message stating that it has received the update successfully, thus allowing the sending of subsequent updates.
- Read more about replication lag in [Amazon Aurora vs RDS](../../2_AWSComponents/6_DatabaseServices/AWSAuroraVsRDS.md).

## Consistency patterns

### Eventual Consistency Model
- Eventual Consistency Model `maximizes the read throughput`.
- However, it might not reflect the results of a recently completed write. Data is replicated asynchronously.
- Fortunately, all the copies of data usually reach consistency within milliseconds.

### Strong Consistency
- This model has a delay in writing the data, but it guarantees that you will always see the updated data every time you read it.
- After a write, reads will see it. Data is replicated synchronously.
- This approach is seen in `file systems and RDBMS`. `Strong consistency works well in systems that need transactions`.

### Weak consistency
- After a write, reads may or may not see it. A best effort approach is taken.

# Source(s) and further reading
- [Consistency Patterns](https://github.com/donnemartin/system-design-primer#consistency-patterns)
- [Redundancy and Replication](https://github.com/jeremyyew/tech-prep-jeremy.io/blob/master/systems-design/topics/databases/redundancy-and-replication.md)
- [Google I/O 2009 - Transactions Across Datacenters..](http://snarfed.org/transactions_across_datacenters_io.html)