
# Replication Or Consistency 
- Replication is widely used in the [distributed](README.md#key-characteristics-of-distributed-systems) & [highly available](HighAvailability.md) database management systems (DBMS), usually with a [master-slave](Scalability.md#db---horizontal-scaling-techniques) technique.
- The master server gets all the updates, which then ripple through to the slave servers.
  - It takes time (known as [Replication Lag](https://cloud.google.com/sql/docs/mysql/replication/replication-lag)) for data to be replicated in multiple highly available zones ( or regions ).
  - Hence `Consistency` won't be there for those `milliseconds`.
- Each slave outputs a message stating that it has received the update successfully, thus allowing the sending of subsequent updates.

# References
- [Redundancy and Replication](https://github.com/jeremyyew/tech-prep-jeremy.io/blob/master/systems-design/topics/databases/redundancy-and-replication.md)