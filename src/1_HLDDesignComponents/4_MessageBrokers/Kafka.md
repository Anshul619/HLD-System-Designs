# :star: Apache Kafka 
- Apache Kafka is an `open-source` [distributed](../0_SystemGlossaries) `event streaming platform` used by thousands of companies for high-performance data pipelines, streaming analytics, data integration, and mission-critical applications.
- Kafka can process a large amount of data in a short amount of time (`1 million messages/sec`).
- It also has low latency, making it possible to process data in real-time.
- Kafka is based on [Publish-Subscriber Model](../4_MessageBrokers#publisher-subscriber-model-pubsub). And can be used for [Event-Driven Architecture](../0_SystemGlossaries/EventDrivenArchitecture.md).
- Messages ( events ) in the Kafka are immutable and can't be changed once it's pushed ( due to `Kafka's log based queue nature` ).
- [Amazon Managed Streaming for Apache Kafka (MSK)](https://aws.amazon.com/msk/) can be used to deploy `Kafka` on [AWS](../../2_AWSComponents).

# [Why Kafka is so fast?](https://twitter.com/alexxubyte/status/1506663791961919488/photo/1)
- Kafka achieves low latency message delivery through `Sequential I/O and Zero Copy Principle`. 
- The same techniques are commonly used in many other messaging/streaming platforms.

![img.png](https://pbs.twimg.com/media/FOi-gjZVgAQdG9B?format=jpg&name=large)

# Reasons of why Kafka has HIGH throughput?

## Kafka is based on Log Based Queue
- :star: `Messages are persisted to append-only log files by the broker`.
- Producers are appending these log files ( `sequential write` ) & consumers are reading a range of these files ( `sequential reads` ).

# Basic Architecture of Kafka Cluster

![img.png](assests/Kafka-Architecture.drawio.png)

# Real world usages of Kafka

## As an events/message broker in [Event-Driven Architecture](../0_SystemGlossaries/EventDrivenArchitecture.md)
- Use Kafka when your application has a High throughput (`1 million messages/sec`), i.e. application has to process a large volume of messages, event driven services etc.

## To monitor metrics, logs of the IT infrastructure
- Various systems in the IT infrastructure can push events/messages/logs in the Kafka. And logstash ( in ELK ) can act as a consumer to the Kafka.

## For Analytics
- If we want to build our own Google Analytics ( to track app activities, events etc.), we can use Kafka as a broker.

## Stream Processing
- Use Kafka when the event stream needs to process data in multi-stage pipelines, the pipelines can generate graphs of the real-time data flows, thus providing real-time monitoring of traffic in the pipelines. 
- Example - Video streaming in YouTube etc.

## Other Examples
- [TwilloSendMessageAPI](../../3_HLDDesignProblems/TwilloSendMessageAPI)

# Top Features of Kafka

## Scalability
- Kafka can be [horizontally scaled](../0_SystemGlossaries/Scalability.md) easily across the cluster.
- A cluster of brokers is used to partition and streamline the data thereby, scaling up the storage capacity.

## Performance - [High Throughput](../0_SystemGlossaries/LatencyThroughput.md#Throughput)
- Each Kafka broker can serve more than `1 million messages per second` and can hold TBs of data.
- Default configured message size in Kafka is `1MB`.

## High Volume
- Large amount of data can be stored in the Kafka pool.

## [Durability](../0_SystemGlossaries/ACIDTransaction.md#Durability)
- The data is kept persistent ( as per retention policy ) and tolerant to any hardware failures by copying the data in the clusters.

## [High Availability](../0_SystemGlossaries/HighAvailability.md), [Fault Tolerance](../0_SystemGlossaries/FaultTolerance&DisasterRecovery.md)
- The `distributed, partitioned, replicated, and fault-tolerant` nature of Kafka makes it very reliable.
- Kafka connector can handle failures with three strategies summarised as `fast-fail`, `ignore` and `re-queue` (sends to another topic).
- Each partition would be replicated across the brokers/servers in the cluster. ( as per configured replication factor )
- Replication is done using `Leader/Follower` technique.

## Extensibility
- `Allows multiple ways for applications to plugin and make use of Kafka`.
- Also, it has provisions for new connectors that you can write as needed.

## Data Transformation
- Kafka allows for deriving new data streams using the existing data streams from producers.

# Major Components of Kafka

## Topic ( i.e. Category or Queue )
- Topic is a category or feed where messages ( or events ) would be saved and published.
- Topics are logically collections of partitions (the physical files).
- A broker contains some partitions for a topic.

## Producer
- Producer writes data into the topics ( 1 or more ) in the Kafka.
- In Kafka 0.7, producers are `fire-&-forgot`.
- In Kafka 0.8, there are 3 ACK levels
    - No ack(0)
    - Ack from N replicas (1...N)
    - Ack from all replicas (-1)

## Sharding/Partitioning
- Partitioning allows Kafka producers to serialize, compress, and load balance data among brokers.
- Topics can be parallelized via partitions, which split data into a single topic among numerous brokers.
- [More partitions](https://www.confluent.io/blog/how-choose-number-topics-partitions-kafka-cluster/) lead to higher throughput.

## Consumer
- A consumer can subscribe ( listen ) to the topics ( 1 or more ) and read data from those in the Kafka.
- Each consumer in a consumer group will be responsible for reading a subset of the partitions of each subject to which they have subscribed.
- Reading data out of Kafka is very fast thanks to `java.nio.channels.FileChannel#transferTo`.
    - This method uses `sendFile` system call which allows for very efficient transfer of data from a file to another file ( including sockets ).

## Broker ( i.e. Server )
- `A Kafka broker` is a server that works as part of a Kafka cluster (in other words, a Kafka cluster is made up of a number of brokers)
- Multiple brokers in the Kafka cluster, provides load balancing, reliable redundancy & fail-over.
- Without sacrificing performance, each broker instance can handle read and write volumes of hundreds of thousands per second (and gigabytes of messages).
- Brokers keep very little state, mostly just open file pointers & connections.

## ZooKeeper
- Zookeeper manages Kafka Cluster ( new broker, new partition etc. ) and brokers coordination.
- Zookeeper also manages leaders selection in the `Kafka Cluster`.
- For every partition, there would be 1 leader ( reader/writer of the partition ) and 1 or more follower ( which keeps replicating the leader ).
- Based on configured `replication factor`, the number of followers would be decided.

## Consumer Group
- The name of an application is essentially represented by a consumer group
- A consumer in Kafka can be part of one or more consumer groups.
- A consumer group in Kafka is a collection of consumers who work together to ingest data from the same topic or range of topics.
- The `-group` command must be used to consume messages from a consumer group.

## Schema Registry
- Schema Registry holds Avro schemas & ensures that schema used by producer and consumer, are identical.
- Producer sends schema id while pushing the data and consumer look for schema id to get schema.

## What is Partition Key in Kafka?

![img.png](assests/Kafka-Partitioning-Layout.drawio.png)

- Partitioning is done using `key` in the record
- If we want to sequence records execution in Kafka, as per the records input time, we should push those in the same partition ( hence same key should be used for the records ).
- If we push those in different partitions, then we can't guarantee of their execution sequence.
- Producers can be configured with a custom routing function ( implementing the `Partitioner interface` ).
- Default message routing is `hash-mod`.

Example
- This is important because we may have to deliver records to customers in the same order that they were made.
- You want these events to come in the order they were created when a consumer purchases an eBook from your webshop and subsequently cancels the transaction.
- If you receive a cancellation event before a buy event, the cancellation will be rejected as invalid (since the purchase has not yet been registered in the system), and the system will then record the purchase and send the product to the client (and lose you money).
- You might use a customer id as the key of these Kafka records to solve this problem and assure ordering.
- This will ensure that all of a customer's purchase events are grouped together in the same partition.

# [Core APIs in Kafka](https://github.com/confluentinc/kafka-rest)

[Kafka HTTP APIs](https://www.confluent.io/blog/http-and-rest-api-use-cases-and-architecture-with-apache-kafka/) can be integrated in the client apis, to push the message to the specific topic ( & partition key ).

## [Producer API](https://kafka.apache.org/10/javadoc/org/apache/kafka/clients/producer/KafkaProducer.html)
- Push the message to a topic (1 or more) in the Kafka.

```java

    Properties props = new Properties();
    props.put("bootstrap.servers","localhost:9092");
    props.put("acks","all");
    props.put("retries",0);
    props.put("batch.size",16384);
    props.put("linger.ms",1);
    props.put("buffer.memory",33554432);
    props.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
    props.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
    
    Producer<String, String> producer = new KafkaProducer<>(props);
    
    for(int i = 0; i < 100; i++) {
        producer.send(new ProducerRecord<String, String>("my-topic", Integer.toString(i), Integer.toString(i)));
    }

    producer.close();
```

## [Consumer API](https://kafka.apache.org/22/javadoc/org/apache/kafka/clients/consumer/KafkaConsumer.html)
- A consumer can subscribe ( poll at the given interval ) to one or more topics in the Kafka.

```java

        Properties props = new Properties();
        props.setProperty("bootstrap.servers", "localhost:9092");
        props.setProperty("group.id", "test");
        props.setProperty("enable.auto.commit", "true");
        props.setProperty("auto.commit.interval.ms", "1000");
        props.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        
        consumer.subscribe(Arrays.asList("foo-topic", "bar-topic"));
        
        while (true) {
            
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
            
            for (ConsumerRecord<String, String> record : records)
                System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
            }
        
        }
```

## [Streams API](https://hevodata.com/learn/kafka-streams/)
- The Kafka Streams API allows an application to use a stream processing architecture to process data in Kafka.
- An application can use this API to take input streams from one or more topics, process them using streams operations, and generate output streams to transmit to one or more topics.
- The Streams API allows you to convert input streams into output streams in this manner.

## Connect API
- The Kafka Connector API connects Kafka topics to applications.
- This opens up possibilities for constructing and managing the operations of producers and consumers, as well as establishing reusable links between these solutions. A connector, for example, may capture all database updates and ensure that they are made available in a Kafka topic.

# [Estimation - How to decide number of partitions in Kafka?](https://www.confluent.io/blog/how-choose-number-topics-partitions-kafka-cluster/)

[Kafka cluster size calculator](https://docs.google.com/spreadsheets/d/1a3uIa8TTRLlN6HTtMzPPqf8p5j5OxflJuAyff-uHLgk/edit?usp=sharing)

Rough formula for picking the number of partitions = `MAX(t/p, t/c)`

Parameter | Title                           | More Description                                                                                |
-----------|---------------------------------|-------------------------------------------------------------------------------------------------|
`t`         | Target Throughput               | Let’s say your target throughput is t. |
`p`         | Thoughput on a single partition | You measure the throughout that you can achieve on a single partition for production (call it p). |
`c`         | Consumption Rate                | And consumption (call it c). |

## Other Points
- More partitions lead to `higher throughput`
- More partitions requires `more open file handles`
    - This is mostly just a configuration issue.
    - We have seen production Kafka clusters running with more than 30 thousand open file handles per broker.
- More partitions may `increase unavailability`
    - It’s probably better to limit the number of partitions per broker to two to four thousand and the total number of partitions in the cluster to low tens of thousand.
- More partitions may increase end-to-end latency
    - As a rule of thumb, if you care about latency, it’s probably a good idea to limit the number of partitions per broker to *100 x b x r*, where b is the number of brokers in a Kafka cluster and r is the replication factor.
- More partitions may require more memory in the client.

## [Kafka Stats in LinkedIn](https://www.slideshare.net/mumrah/kafka-talk-tri-hug)
- Peak writes per second: `460k`
- Average writes per day: `28 billion`
- Average reads per second: `2.3 million`
- `~700 topics`
- `Thousands of producers`
- `~1000 consumers`

# [Kafka vs Others](KafkaVsRabbitMQVsSQSVsSNS.md)

# References
- [Kafka Interview Question](https://www.interviewbit.com/kafka-interview-questions/)
- [How to minimize the latency involved in kafka messaging framework?](https://stackoverflow.com/questions/20520492/how-to-minimize-the-latency-involved-in-kafka-messaging-framework)
- [Apache Kafka on AWS using Amazon MSK](https://aws.amazon.com/msk/what-is-kafka/)
- [Kafka Talk by Tri Hug](https://www.slideshare.net/mumrah/kafka-talk-tri-hug)