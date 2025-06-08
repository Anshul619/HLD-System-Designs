# Oracle Globally Distributed DB - 23ai
- [Oracle Globally Distributed Database](https://www.oracle.com/database/distributed-database/) disperses segments of a data set across many databases (shards) onto different computers—on-premises or in the cloud. 
- It enables globally distributed, linearly scalable, multimodel databases. 
- It requires no specialized hardware or software.
- Banks doing POC on oracle globally database
- Zero data loss for replication
- Automatic switch over in case of failure, hence no data loss
- RAFT replication (better than Zookeeper)
- Logically replication (via  Eventual consistency)

# Sharding
- Cross cities, countries ex. US based bank - one shard in India, another in US
- No application code changes
- Local shards as well

# Shard/Query Director
- Single connection, hence no performance issues
- Application calls Shard director, and shard director calls corresponding shard - Single connection only

# Transaction types
- Committed transactions
- Redo logs - [uncommitted transactions](https://asktom.oracle.com/ords/f?p=100:11:0::::P11_QUESTION_ID:1670195800346464273)
- No performance degradation

# Supported data types
- Vector
- JSON
- Graph
- Text
- Document etc.

# Vector data type
- Vector as a “data type” in the same transactions table
- Search the private data, instead of LLM training

# Oracle AI Vector Search
- RAQ
- Vector vs Lexical Search
- ElasticSearch provides lexical search
- Lexical search is outdated, vector is more evolved
- Convergence strategy with Oracle database