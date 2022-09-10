
# Intro
- Messages ( events ) in the DB store are immutable and can't be changed once it's pushed.
- Write appends ( `sequential write` ) to the store/logs, without modifying the existing data.
- This makes writes (throughput) generally very fast.

# Supported Databases
- [Casandra](../3_DatabaseComponents/ApacheCasandra.md)
- [Kafka](../4_MessageBrokers/Kafka.md)

# Reference
- [Append-Only-Wiki](https://en.wikipedia.org/wiki/Append-only)