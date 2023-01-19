# Apache Zookeeper
- [Apache Zookeeper](https://zookeeper.apache.org/) can manage a Cluster (new broker, new partition etc.) and servers coordination.

![img.png](assets/zookeeper_cluster_meta_data.png)

# Purpose of Zookeeper

| Purpose                                                                            | Remarks                                                                                                                           |
|------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|
| Store Basic metadata (in-memory) of the cluster                                    | Metadata like info about brokers, topics, partitions, mapping of partitions to nodes, partition leader/followers, consumer offset |
| [Leader Election](../0_SystemGlossaries/Database/ReplicationAndDataConsistency.md) | Electing leader in the leader-follower replication.                                                                               |
| [Controller election](../0_SystemGlossaries/ControllerNode.md) in the Cluster      | -                                                                                                                                 |
| Handle new broker/node addition or failure                                         | Notifies consumers, producers, routing tier of the arrival of new broker or failure of existing broker                            |
| Route requests to partition leader                                                 | Route all requests to partition's leaders                                                                                         |

# :star: Real world use cases
- [Apache Kafka](../4_MessageBrokers/Kafka/Readme.md#zookeeper)
- [Apache Marathon & Mesos](../6a_ContainerOrchestrationServices/ApacheMarathon&Mesos.md)
- [Apache HBase](../3_DatabaseComponents/NoSQL-Databases/ApacheHBase.md)
- [Apache SolrCloud](../3_DatabaseComponents/Search-Indexes/ApacheSolr.md)
- [Twitter Hit Counter](../../3_HLDDesignProblems/TwitterHitCounterDesign/Readme.md)