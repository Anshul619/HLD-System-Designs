# Dead-letter queue
- [Amazon SQS]() supports [dead-letter queues (DLQ)](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html), which other queues (source queues) can target for messages that can't be processed (consumed) successfully.
- These messages can be replayed/re-drive (in case of downstream processing errors).

# Max Receive Count
- After [maxReceiveCount](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html), message would be pushed in the configured dead letter queue.
- For reliability, it's recommended to have it above 3.