# Benchmarking Apache Kafka - 2 Million Writes Per Second (On Three Cheap Machines)
- [Read more](https://engineering.linkedin.com/kafka/benchmarking-apache-kafka-2-million-writes-second-three-cheap-machines)

# Machines

| Setup         | Stat                                |
|---------------|-------------------------------------|
| Kafka Cluster | 3 Machines (replication-factor = 3) |
| Zookeeper     | 1 Machine                           |
| Generate Load | 2 Machines                          |

# Each Machine Specs

| Spec                                        |
|---------------------------------------------|
| Intel Xeon 2.5 GHz processor with six cores |
| Six 7200 RPM SATA drives                    |
| 32GB of RAM                                 |
| 1Gb Ethernet                                |

# Test1 - Single producer thread, no replication

## Specs

|          | Spec                                           | Remarks                                                                                                                                                                                                                                                                                                            |
|----------|------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Topic    | A topic with six partitions and no replication |                                                                                                                                                                                                                                                                                                                    |
| Messages | 50 million small (100 byte) records            | The reason for focusing on small records is that it is the harder case for a messaging system (generally). <br/>- It is easy to get good throughput in MB/sec if the messages are large, but much harder to get good throughput when the messages are small, as the overhead of processing each message dominates. |

## Results

|            | Result            |
|------------|-------------------|
| Throughput | 821,557 records/sec |
| Bytes/sec  | 78 MB/sec         |

# Test2 - Single producer thread, 3x asynchronous replication

## Specs

|          | Spec                                           | Remarks                                                                                                                                                                                                                                                                                                            |
|----------|------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Topic    | A topic with six partitions and 3x replication | Each partition has three replicas (so the total data written to network or disk is three times higher)                                                                                                                                                                                                             |
| Messages | 50 million small (100 byte) records            | The reason for focusing on small records is that it is the harder case for a messaging system (generally). <br/>- It is easy to get good throughput in MB/sec if the messages are large, but much harder to get good throughput when the messages are small, as the overhead of processing each message dominates. |

## Results

|              | Result                                                                                                                                                                                              |
|--------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Throughput   | 786,980 records/sec                                                                                                                                                                                 |
| Bytes/sec    | 75 MB/sec                                                                                                                                                                                           |
| Key Takeaway | Replication can be fast.<br/>- The total cluster write capacity is, of course, 3x less with 3x replication (since each write is done three times), but the throughput is still quite good per client. |

# Test3 - Single producer thread, 3x synchronous replication

## Specs

|          | Spec                                           | Remarks                                                                                                                                                                                                                                                                                                            |
|----------|------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Topic    | A topic with six partitions and 3x replication | With synchronous replication we just wait to respond to the producer request until the followers have replicated it.                                                                                                                                                                                                           |
| Messages | 50 million small (100 byte) records            | The reason for focusing on small records is that it is the harder case for a messaging system (generally). <br/>- It is easy to get good throughput in MB/sec if the messages are large, but much harder to get good throughput when the messages are small, as the overhead of processing each message dominates. |

## Results

|              | Result                                                         |
|--------------|----------------------------------------------------------------|
| Throughput   | 421,823 records/sec                                            |
| Bytes/sec    | 40 MB/sec                                                      |
| Key Takeaway | Synchronous replication slows down the latency and throughput. |

# Test4 - Three producers, 3x asynchronous replication

## Specs

|          | Spec                                           | Remarks                                                                                                                                                                                                                                                                                                            |
|----------|------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Topic    | A topic with six partitions and 3x replication | With synchronous replication we just wait to respond to the producer request until the followers have replicated it.                                                                                                                                                                                                           |
| Messages | 50 million small (100 byte) records            | The reason for focusing on small records is that it is the harder case for a messaging system (generally). <br/>- It is easy to get good throughput in MB/sec if the messages are large, but much harder to get good throughput when the messages are small, as the overhead of processing each message dominates. |

## Results

|              | Result                                                         |
|--------------|----------------------------------------------------------------|
| Throughput   | 2,024,032 records/sec                                          |
| Bytes/sec    | 193 MB/sec                                                     |
| Latency      | 2 ms (median), 3 ms (99th percentile)                          |
| Key Takeaway | Synchronous replication slows down the latency and throughput. |


