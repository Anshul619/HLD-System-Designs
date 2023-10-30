
# Introduction
- [RocksDB](http://rocksdb.org/) uses a [log structured database engine](../../2_DataStructuresDB/AppendOnlyProperty.md), written entirely in C++, for maximum performance. 
- Keys and values are just arbitrarily-sized byte streams.
- Writes in RocksDB, are [append-only](../../2_DataStructuresDB/AppendOnlyProperty.md)
- RocksDB is [optimized for fast, low latency storage](../../../0_SystemGlossaries/Scalability/LatencyThroughput.md) such as flash drives and high-speed disk drives. 
- RocksDB exploits the full potential of high read/write rates offered by flash or RAM.

# Ideal Use Cases
- If the behavior of hot data (getting fetched frequently) is based of time-stamp then [Rocksdb]() would a smart choice.
- But do optimize it for fallback using bloom-filters.

# :star: Real world use cases of RocksDB
- [LinkedIn - Home Feed](../../../../3_HLDDesignProblems/SocialNetworkFacebookInstagramDesign/LinkedInTechStack.md)
- [Facebook - Home Feed](../../../../3_HLDDesignProblems/SocialNetworkFacebookInstagramDesign/FacebookTechStack.md)

# References
- [RocksDB: A High Performance Embedded Key-Value Store for Flash Storage - Data@Scale](https://www.youtube.com/watch?v=V_C-T5S-w8g)
- [Redis vs RocksDB](https://stackoverflow.com/questions/31831706/redis-vs-rocksdb)