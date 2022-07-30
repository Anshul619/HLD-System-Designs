
# [Amazon SQS vs Amazon SNS](https://cloud.in28minutes.com/aws-certification-sqs-vs-sns-vs-amazon-mq)

Basis | Amazon SQS                                                                                           | Amazon SNS                                                                                                                                                   |
------------------------------------|------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|
Paradigm | `Pull Modal`                                                                                           | `Publish-Subscribe (pub-sub) paradigm`                                                                                                                         |
Process | Message would be pushed to the `Queue`. Consumers would consume it and it would be removed from Queue. | When an SNS Topic receives an event notification (from publisher), it is broadcasted to all Subscribers                                                      |
Use Cases | - | Monitoring Apps, workflow systems, mobile apps                                                                                                               |
Web Services | - | Provides mobile and enterprise messaging web services - Push notifications to Apple, Android, FireOS, Windows devices, Send SMS to mobile users, Send Emails |

# [Amazon SQS vs Kafka](https://stackoverflow.com/questions/58970006/are-sqs-and-kafka-same)
- `Amazon SQS is NOT so fast as Kafka` and it doesn't fit to high workload, it's much more suitable for `eventing where count of events per second` is not so much.
- `Amazon SQS` is based on `QUEUE` ( hence message can NOT replayed ) while `Kafka` is based on `LOGS` ( which can be replayed ).
- SQS is an `Amazon managed service` (so you do not have to support infrastructure by yourself).
- SQS is better for eventing when you need to catch some message (event) by some client and then this message will be automatically popped out from the queue.

# [AmazonMQ - Fully Managed Service for open source message brokers](https://aws.amazon.com/amazon-mq/?amazon-mq.sort-by=item.additionalFields.postDateTime&amazon-mq.sort-order=desc)
- Amazon MQ is a managed message broker service for `Apache ActiveMQ` and `RabbitMQ` that makes it easy to set up and operate message brokers on AWS.
- Amazon MQ reduces your operational responsibilities by managing the provisioning, setup, and maintenance of message brokers for you. 
- Because Amazon MQ connects to your current applications with industry-standard APIs and protocols, `you can easily migrate to AWS without having to rewrite code`.