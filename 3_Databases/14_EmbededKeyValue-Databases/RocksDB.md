
# Introduction
- [RocksDB](http://rocksdb.org/) is an embedded key-value store and uses a [LSM-Tree](../5_Database-Internals/LSMTree.md), written entirely in C++, for maximum performance.
- Writes in RocksDB, are [append-only](../5_Database-Internals/AppendOnlyProperty.md)
- RocksDB is [optimized for fast, low latency storage](../../7_Scalability/Latency.md) such as flash drives and high-speed disk drives. 
- RocksDB exploits the full potential of high read/write rates offered by flash or RAM.

# Ideal Use Cases
- If the behavior of hot data (getting fetched frequently) is based of time-stamp then [Rocksdb]() would a smart choice.
- But do optimize it for fallback using [bloom-filters](../5_Database-Internals/LSMTree.md).

# :star: Real world use cases of RocksDB
- [LinkedIn - Home Feed](https://github.com/Anshul619/Tech-Stacks-Live-Apps/tree/main/LinkedIn/Readme.md)
- [Facebook - Home Feed](https://github.com/Anshul619/Tech-Stacks-Live-Apps/tree/main/Facebook.md)

# References
- [RocksDB: A High Performance Embedded Key-Value Store for Flash Storage - Data@Scale](https://www.youtube.com/watch?v=V_C-T5S-w8g)
- [Redis vs RocksDB](https://stackoverflow.com/questions/31831706/redis-vs-rocksdb)