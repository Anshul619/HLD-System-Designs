# Why Kafka is so fast?
- Kafka achieves [low latency](../../4_Scalability/Latency.md) message delivery through [Sequential I/O and Zero Copy Principle](https://twitter.com/alexxubyte/status/1506663791961919488/photo/1).
- Messages (events) in the [Kafka]() are immutable and can't be changed once it's pushed (due to [log based queue nature](../../1_Databases/5_Database-Internals/AppendOnlyProperty.md)).
- The same techniques are commonly used in much other messaging/streaming platforms.

> Kafka is based on [Log Based Queue](../../1_Databases/5_Database-Internals/AppendOnlyProperty.md)
> - :star: Messages are persisted to [append-only log files](../../1_Databases/5_Database-Internals/AppendOnlyProperty.md) by the broker.
> - Producers are [appending these log files (sequential write)](../../1_Databases/5_Database-Internals/AppendOnlyProperty.md) & consumers are reading a range of these files (**sequential reads**).

# Why reading from Kafka is so fast?
- Reading data out of Kafka is very fast thanks to `java.nio.channels.FileChannel#transferTo`.
- This method uses `sendFile` system call which allows for very efficient transfer of data from a file to another file (including sockets).