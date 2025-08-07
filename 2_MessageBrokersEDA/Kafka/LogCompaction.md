# Log Compaction
- [Log compaction](https://towardsdatascience.com/log-compacted-topics-in-apache-kafka-b1aa1e4665a7) is a mechanism to give finer-grained per-record retention, rather than the coarser-grained time-based retention. 
- The idea is to selectively remove records where we have a more recent update with the same primary key. 
- This way the log is guaranteed to have at least the last state for each key.