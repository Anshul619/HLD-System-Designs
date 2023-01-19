# Clusters Coordination Service

| Purpose                                                                            | Remarks                                                                                                                           |
|------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|
| Store Basic metadata (in-memory) of the cluster                                    | Metadata like info about brokers, topics, partitions, mapping of partitions to nodes, partition leader/followers, consumer offset |
| [Leader Election](../0_SystemGlossaries/Database/ReplicationAndDataConsistency.md) | Electing leader in the leader-follower replication.                                                                               |
| [Controller election](../0_SystemGlossaries/ControllerNode.md) in the Cluster      | -                                                                                                                                 |
| Handle new broker/node addition or failure                                         | Notifies consumers, producers, routing tier of the arrival of new broker or failure of existing broker                            |
| Route requests to partition leader                                                 | Route all requests to partition's leaders                                                                                         |