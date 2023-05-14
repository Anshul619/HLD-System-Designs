# Placement groups
- When you launch a new EC2 instance, the EC2 service attempts to place the instance in such a way that all of your instances are spread out across underlying hardware to minimize correlated failures. 
- You can use [placement groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) to influence the placement of a group of interdependent instances to meet the needs of your workload.

| Placement group strategy                                                                      | Use Case                                                                                                                                                                                                                                                                                                                                  | Description                                                                                                                                                                            |
|-----------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Spread (default)](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) | Reduce correlated failures                                                                                                                                                                                                                                                                                                                | Strictly places a small group of instances across distinct underlying hardware to reduce correlated failures.                                                                          |
| :star: [Cluster](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html)   | High-performance computing (HPC) applications, which need low-latency network performance for tightly coupled node-2-node communication.                                                                                                                                                                                                  | Packs instances close together inside an Availability Zone.                                                                                                                            |
| [Partition](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html)        | Large distributed and replicated workloads, such as [Hadoop](../../../../1_HLDDesignComponents/5_BigDataComponents/BatchProcessing/ApacheHadoop/Readme.md), [Cassandra](../../../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md), and [Kafka](../../../../1_HLDDesignComponents/4_MessageBrokers/Kafka/Readme.md) | Spreads your instances across logical partitions such that groups of instances in one partition do not share the underlying hardware with groups of instances in different partitions. |

# Cluster Placement Group

![](https://docs.aws.amazon.com/images/AWSEC2/latest/UserGuide/images/placement-group-cluster.png)

# Partition placement groups

![](https://docs.aws.amazon.com/images/AWSEC2/latest/UserGuide/images/placement-group-partition.png)

# Spread placement groups

![](https://docs.aws.amazon.com/images/AWSEC2/latest/UserGuide/images/placement-group-spread.png)
