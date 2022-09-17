
# Apache Zookeeper
- [Apache Zookeeper](https://zookeeper.apache.org/) can manage a Cluster ( new broker, new partition etc. ) and servers coordination.
- Basic metadata can be stored in Zookeeper ( in-memory ), like info about brokers, topics, partitions, partition lead/followers, consumer offset etc.
- Zookeeper is also used in the `Leader Election or Controller election in the Cluster`.
- Zookeeper notifies consumers and producers of the arrival of new broker or failure of existing broker, as well as routing all requests to partition's leaders.

## Real work use cases
- [Apache Kafka](../4_MessageBrokers/Kafka.md)
- [Apache Marathon & Mesos](ApacheMarathon&Mesos.md)