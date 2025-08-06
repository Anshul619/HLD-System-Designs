# :star: Single-Leader replication

![](assets/Leader-Follow-Replication.drawio.png)

# Terminologies

| Term                                                            | Description                                                                                                                                                                                                                                                                                                                                                                                                                                         |
|-----------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Leader (also known as master or primary)                        | One of the replicas is designated the leader (also known as `master or primary`). <br/>- When clients want to write to the database, they must send their requests to the leader, which first writes the new data to its local storage.                                                                                                                                                                                                             |
| Followers (read replicas, slaves, secondaries, or hot standbys) | Whenever the leader writes new data to its local storage, it also sends the data change to all of its followers as part of a [replication log or change stream](https://www.stitchdata.com/docs/replication/replication-methods/log-based-incremental). <br/>- Each follower takes the log from the leader and updates its local copy of the data‐ base accordingly, by applying all writes in the same order as they were processed on the leader. |

> Also known as Leader-Follower, Master-Slave, Primary-Replica replication.

# Supported services

This replication is available as a built-in-feature in various technologies.

| Type                     | Tech                                                                                                                                                                                                                                                 |
|--------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| SQL/Relational Databases | [Amazon Aurora](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonRDS/AmazonAurora/Readme.md), PostgresSQL, MySQL etc.                                                                                                                            |
| NoSQL Databases          | [Amazon Elastic Cache (Cluster Disabled)](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonElasticCache/ClusterMode.md), [Redis - Master Slave Replication](../8_Caching-InMemory-Databases/Redis/RedisLeaderFollowReplication.md), MongoDB, DynamoDB etc. |
| Message Brokers          | [Kafka Cluster](../../4_MessageBrokersEDA/Kafka/Readme.md), RabbitMQ                                                                                                                                                                                 |

# Leader Election Process
- In case of failed leader, new leader would be chosen through an election process (where the leader is chosen by a majority of the remaining replicas), or by a previously [elected controller node](../../10_ClusterCoordination/ControllerNode.md).
- Technologies like [Zookeeper](../../10_ClusterCoordination/ApacheZookeeper.md) service is helpful for coordinating the election process.