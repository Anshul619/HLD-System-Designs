
# Introduction
- [RocksDB](http://rocksdb.org/) uses a [log structured database engine](../../0_SystemGlossaries/AppendOnlyDataStructure.md), written entirely in C++, for maximum performance. 
- Keys and values are just arbitrarily-sized byte streams.
- Writes in RocksDB, are [append-only](../../0_SystemGlossaries/AppendOnlyDataStructure.md)
- RocksDB is [optimized for fast, low latency storage](../../0_SystemGlossaries/Scalability/LatencyThroughput.md) such as flash drives and high-speed disk drives. 
- RocksDB exploits the full potential of high read/write rates offered by flash or RAM.

# Ideal Use Cases
- If the behavior of hot data (getting fetched frequently) is based of time-stamp then [Rocksdb]() would a smart choice.
- But do optimize it for fallback using bloom-filters.

# :star: Real world use cases of Apache Casandra
- [FollowFeed: LinkedIn's Feed Made Faster and Smarter](https://engineering.linkedin.com/blog/2016/03/followfeed--linkedin-s-feed-made-faster-and-smarter)
- [ELI5: RocksDB - Fast Data Storage](https://developers.facebook.com/blog/post/2021/08/09/eli5-rocksdb-fast-data-storage/)

# References
- [Redis vs RocksDB](https://stackoverflow.com/questions/31831706/redis-vs-rocksdb)