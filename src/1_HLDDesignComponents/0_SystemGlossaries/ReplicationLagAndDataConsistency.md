# Replication Lag And Data Consistency 
- Replication is widely used in the [distributed](Readme.md) & [highly available](HighAvailability.md) database management systems (DBMS), usually with a [master-slave or Single-Primary-Instance-Multiple-Read-Replicas technique](Scalability/DBScalability.md).
- The master server gets all the updates, which then ripple through to the slave servers.
- It takes time (known as [Replica Lag](https://cloud.google.com/sql/docs/mysql/replication/replication-lag)) for data to be replicated in [multiple highly available zones (or regions)](../../2_AWSComponents/AWS-Global-Architecture-Region-AZ.md).
- Hence Data Consistency won't be there for those milliseconds, which is known as [replica lag](https://cloud.google.com/sql/docs/mysql/replication/replication-lag).
- Each slave outputs a message stating that it has received the update successfully, thus allowing the sending of subsequent updates.
- Read more about replication lag in [Amazon Aurora vs RDS](../../2_AWSComponents/6_DatabaseServices/AmazonAuroraVsRDS.md).

# Consistency patterns

## :star: Eventual Consistency (async replication)
- Eventual Consistency Model [maximizes the read throughput](../../1_HLDDesignComponents/0_SystemGlossaries/LatencyThroughput.md).
- However, it might not reflect the results of a recently completed write. Data is replicated asynchronously.
- Fortunately, all the copies of data usually reach consistency within milliseconds.

## Strong Consistency (sync replication)
- This model has a delay in writing the data, but it guarantees that you will always see the updated data every time you read it.
- After a write, reads will see it. Data is replicated synchronously.
- This approach is seen in file systems and RDBMS. 
- Strong consistency works well in systems that need transactions.

## Weak consistency (not really consistent)
- After a write, reads may or may not see it. A best effort approach is taken.

# Different aspects of replicating data in MySQL
- Using a file/pointer called Binary Logs or a Global Transaction Identifier.
- Using ASYNC or SEMI-SYNC or SYNC modes of syncing this data (each has its pros and cons).

This Replication is done in two phases typically to preserve data integrity:
- Network transfer — also called the IO thread — pulls data from the Source to the Replica into a file called relay log.
- Apply on MySQL — also called the SQL thread — reads from the relay log and writes to MySQL preserving the order.

The [Replication Lag](https://cloud.google.com/sql/docs/mysql/replication/replication-lag) is the addition of the delay caused by both the threads — in terms of time — the difference between the time a query was executed on the Source MySQL and the time it was executed on the Replica MySQL.

# Source(s) and further reading
- [Consistency Patterns](https://github.com/donnemartin/system-design-primer#consistency-patterns)
- [Redundancy and Replication](https://github.com/jeremyyew/tech-prep-jeremy.io/blob/master/systems-design/topics/databases/redundancy-and-replication.md)
- [Google I/O 2009 - Transactions Across Datacenters..](http://snarfed.org/transactions_across_datacenters_io.html)
- [CAP by Jeremyyew](https://github.com/jeremyyew/tech-prep-jeremy.io/tree/master/systems-design/topics/consistency-availability-partition-tolerance-cap)