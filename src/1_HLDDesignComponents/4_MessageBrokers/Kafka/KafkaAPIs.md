# Core APIs in Kafka

[Kafka HTTP APIs](https://www.confluent.io/blog/http-and-rest-api-use-cases-and-architecture-with-apache-kafka/) can be integrated in the client apis, to push the message to the specific topic ( & partition key ).
- [Read more](https://github.com/confluentinc/kafka-rest)

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
- A consumer can subscribe (poll at the given interval) to one or more topics in the Kafka.

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

## Metadata Request
- The producer sends a Metadata request with a list of topics to one of the brokers in the broker-list you supplied when configuring the producer.
- The broker responds with a list of partitions in those topics and the leader for each partition.
- The producer caches this information and knows where to redirect its produce messages.