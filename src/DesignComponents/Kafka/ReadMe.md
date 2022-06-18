

# Introduction
- Apache Kafka is an open-source distributed event streaming platform used by thousands of companies for high-performance data pipelines, streaming analytics, data integration, and mission-critical applications.
- Kafka can process a large amount of data in a short amount of time (**1 millions/sec**)
- It also has low latency, making it possible to process data in real-time.
- Kafka is Publish Subscriber Model. And can be used for Event Driven Services.
- Messages ( events ) in the Kafka are immutable and can't be changed once it's pushed.

# Top Features of Kafka

## Scalability 
- Kafka can be horizontally scaled easily across the cluster. 
- A cluster of brokers is used to partition and streamline the data thereby, scaling up the storage capacity.

## Performance 
- High Throughput ( 1 million messages/sec ).
- Each Kafka broker can serve more than 1 million reads/writes per second and can hold TBs of data.
- Default configured message size in Kafka is 1MB.

## High Volume 
- Large amount of data can be stored in the Kafka pool.

## Replication, Durability, Zero Downtime
- The data is kept persistent ( as per retention policy ) and tolerant to any hardware failures by copying the data in the clusters.
- Each partition would be replicated across the brokers/servers in the cluster. ( as per configured replication factor )
- Replication is done using Leader/Follower technique.

## Fault Tolerance
- Kafka connector can handle failures with three strategies summarised as fast-fail, ignore and re-queue(sends to another topic).

## Reliability
- The distributed, partitioned, replicated, and fault-tolerant nature of Kafka makes it very Reliable.

## Extensibility
- Allows multiple ways for applications to plugin and make use of Kafka. 
- Also, it has provisions for new connectors that you can write as needed.

## Data Transformation
- Kafka allows for deriving new data streams using the existing data streams from producers.

# Traditional methods of Message Transfer

<img title="Message-Transfer-Model" alt="Alt text" src="Traditional-Message-Patterns.drawio.png">

## Push Model/Message Queuing ( Point-To-Point, Request-Response technique)
- Once the message is delivered to the consumer, it would be removed from Queue.
- The push model's goal is to distribute messages individually and promptly, ensuring that work is parallelized equitably and messages are handled roughly in the order they came in the queue.
- RabbitMQ supports Point-To-Point model.
- Kafka doesn't support Point-To-Point model.

## Pull Model/Publisher-Subscriber Model
- Unlike point-to-point texting, a message is only removed once it has been consumed by all category subscribers.
- Kafka, ActiveMQ, AmazonMQ, RabbitMQ supports Publisher-Subscriber Model.
- This is completely asynchronous. You can't say for sure when this process will happen and in what order.

# Major Components of Kafka

<img title="Kafka-Architecture" alt="Alt text" src="Kafka-Architecture.drawio.png">

## Topic ( i.e. Category )
- Topic is a category or feed where messages ( or events ) would be saved and published.

## Producer
- Producer writes data into the topics ( 1 or more ) in the Kafka

## Partitioning
- Partitioning allows Kafka producers to serialize, compress, and load balance data among brokers.
- Topics can be parallelized via partitions, which split data into a single topic among numerous brokers.

## Consumer
- A consumer can subscribe ( listen ) to the topics ( 1 or more ) and read data from those in the Kafka.
- Each consumer in a consumer group will be responsible for reading a subset of the partitions of each subject to which they have subscribed.

## Broker ( i.e. Server )
- A Kafka broker is a server that works as part of a Kafka cluster (in other words, a Kafka cluster is made up of a number of brokers)
- Multiple brokers in the Kafka cluster, provides load balancing, reliable redundancy & failover.
- Without sacrificing performance, each broker instance can handle read and write volumes of hundreds of thousands per second (and gigabytes of messages).

## ZooKeeper
- Zookeeper manages Kafka Cluster ( new broker, new partition etc. ) and brokers coordination
- Zookeeper also manages leaders selection in the Kafka Cluster.
- For every partition, there would be 1 leader ( reader/writer of the partition ) and 1 or more follower ( which keeps replicating the leader ).
- Based on configured **replication factor**, the number of followers would be decided.

## Consumer Group
- The name of an application is essentially represented by a consumer group
- A consumer in Kafka can be part of one or more consumer groups.
- A consumer group in Kafka is a collection of consumers who work together to ingest data from the same topic or range of topics.
- The ‘-group' command must be used to consume messages from a consumer group.

## Schema Registry
- Schema Registry holds Avro schemas & ensures that schema used by producer and consumer, are identical.
- Producer sends schema id while pushing the data and consumer look for schema id to get schema.

## What is Partition Key in Kafka?
- Partitioning is done using key in the record
- If we want to sequence the records execution in Kafka, as per the records input time, we should push those in the same partition ( hence same key should be used for the records ).
- If we push those in different partitions, then we can't guarantee of their execution sequence. 

<img title="Kafka-Partitioning-Layout" alt="Alt text" src="Kafka-Partitioning-Layout.drawio.png">

Example 
- This is important because we may have to deliver records to customers in the same order that they were made. 
- You want these events to come in the order they were created when a consumer purchases an eBook from your webshop and subsequently cancels the transaction. 
- If you receive a cancellation event before a buy event, the cancellation will be rejected as invalid (since the purchase has not yet been registered in the system), and the system will then record the purchase and send the product to the client (and lose you money). 
- You might use a customer id as the key of these Kafka records to solve this problem and assure ordering. 
- This will ensure that all of a customer's purchase events are grouped together in the same partition.

# Core APIs in Kafka

## Producer API
- Push the message to a topic (1 or more ) in the Kafka
- https://kafka.apache.org/10/javadoc/org/apache/kafka/clients/producer/KafkaProducer.html
- https://github.com/confluentinc/kafka-rest

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
        producer.send(new ProducerRecord<String, String>("my-topic",Integer.toString(i),Integer.toString(i)));
    }

    producer.close();
```

## Consumer API
- A consumer can subscribe ( poll at the given interval ) to one or more topics in the Kafka. 
- https://kafka.apache.org/22/javadoc/org/apache/kafka/clients/consumer/KafkaConsumer.html

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

## Streams API
- The Kafka Streams API allows an application to use a stream processing architecture to process data in Kafka. 
- An application can use this API to take input streams from one or more topics, process them using streams operations, and generate output streams to transmit to one or more topics. 
- The Streams API allows you to convert input streams into output streams in this manner.
- https://hevodata.com/learn/kafka-streams/

## Connect API
- The Kafka Connector API connects Kafka topics to applications. 
- This opens up possibilities for constructing and managing the operations of producers and consumers, as well as establishing reusable links between these solutions. A connector, for example, may capture all database updates and ensure that they are made available in a Kafka topic.


# Real world usages of Kafka
- **As a events/message broker** - Use Kafka when your application has a High throughput (**1 million messages/sec**), i.e. application has to process a large volume of messages, event driven services etc.
- **To monitor metrics, logs of the IT infrastructure** - Various systems in the IT infrastructure can push events/messages/logs in the Kafka. And logstash ( in ELK ) can act as a consumer to the Kafka.
- **For Analytics** - If we want to build own google analytics ( to track app activities, events etc.), we can use Kafka as a broker. 
- **Stream Processing** - Use Kafka when the event stream needs to process data in multi-stage pipelines, the pipelines can generate graphs of the real-time data flows, thus providing real-time monitoring of traffic in the pipelines. Example - Video streaming in YouTube etc.

# How to use Kafka on AWS?
- Amazon Managed Streaming for Apache Kafka (MSK) - https://aws.amazon.com/msk/

# Open Question
- How many partitions/brokers would be needed in real world use case?

# Kafka vs RabbitMQ

 Basis                                 | Kafka                                                                               | RabbitMQ                                                                                                                                                           |
---------------------------------------|-------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|
 Performance | Up to 1 million messages per second                                                 | Up to 10K messages per second ( ie. around 100 nodes are needed to match with 1 kafka broker )                                                                     |                                                                                             |
 Message Transfer Model | Pull Based                                                                          | Push based                                                                                                                                                         |                                                                                             |
 Use Cases | Massive data/high throughput cases ( like analytics )                               | Simple low-latency use cases when message guarantee is needed or some consistent behaviour is needed for every message ( like order workflow, failed orders etc. ) |                                                                                             |
 Event storage structure | Logs                                                                                | Queue                                                                                                                                                              |                                                                                             |
 Data Type | Operational                                                                         | Transactional                                                                                                                                                      |                                                                                             |
 Broker/Publisher Type | Dump                                                                                | Smart ( Consistent transmission of messages to consumers at about the same speed as the broker monitors the consumer's status)                                     |                                                                                             |
 Consumer Type | Smart                                                                               | Dumb                                                                                                                                                               |                                                                                             |
 Ordering Of Messages                  | Supported ( using partition key )                                                   | Not-Supported                                                                                                                                                      |
 Lifetime Of Messages                  | As per retension policy, messages are retained in Kafka. And these can be replayed. | Once message is consumed and acknowledgement is sent, it would be removed from RabbitMQ message queue.                                                             |
 Prioritizing Messages for consumption | Not-Supported.                                                                      | Supported                                                                                                                                                          |                                                                                             |
 Payload Size | Default 1MB limit                                                                   | No constraints                                                                                                                                                     |                                                                                             |
 
# Kafka vs AmazonMQ
- TBD

# References
- https://www.interviewbit.com/kafka-interview-questions/
- https://www.interviewbit.com/blog/rabbitmq-vs-kafka
