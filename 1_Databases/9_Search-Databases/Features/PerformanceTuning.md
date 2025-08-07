# Performance Tuning of ElasticSearch
- If you're working with [Elasticsearch](../ElasticSearch/Readme.md) in a write-heavy environment, you need to consider architectural and configuration strategies to ensure stability, performance, and data durability. 
- Here’s a breakdown of best practices and potential bottlenecks when [Elasticsearch](../ElasticSearch/Readme.md) is used in a write-heavy scenario.

> Note - We can't increase number of shards dynamically in ElasticSearch. Changing number of shards, would need reindexing whole data.

# Key Considerations for Write-Heavy Workloads

|                         | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
|-------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Indexing Performance    | Bulk Indexing: Use the _bulk API instead of individual document writes to reduce overhead and improve throughput.<br/>- Document Size: Keep documents reasonably small (preferably < 10 KB) to optimize memory and indexing performance.<br/>- [Refresh Interval](RefreshInterval.md): Increase the index.refresh_interval (e.g., 30s or 60s) to reduce how often [Elasticsearch](../ElasticSearch/Readme.md) refreshes segments. This improves indexing speed but delays search visibility. |
| Shard & Index Design    | Fewer Shards: Avoid oversharding. Fewer shards per node reduce overhead.<br/>- [Index Lifecycle Management (ILM)](ILM.md): Use ILM to automate rollover, shrink, and delete policies for time-based indices.<br/>- Routing: If applicable, use custom routing to direct writes to specific shards, reducing scattering.                                                                                                                                                                      |
| Hardware Considerations | Disk Speed: Use fast SSDs. [Elasticsearch](../ElasticSearch/Readme.md) is I/O intensive during flushes and merges.<br/>- Memory: Ensure you have sufficient heap memory (50% of RAM, up to 32 GB). Keep heap pressure < 75%.<br/>- CPU: More cores help parallelize ingestion and merges.                                                                                                                                                                                                    |
| Cluster Sizing          | Dedicated Ingest Nodes: Separate ingest nodes (with ingest pipelines) from data nodes can help in preprocessing.<br/>- Dedicated Master Nodes: Prevent instability under load.<br/>- Hot-Warm Architecture: Use "hot" nodes for heavy indexing and "warm" nodes for longer-term storage.                                                                                                                                                                                                     |

# Configuration Tweaks

|                                              | Description                                         |
|----------------------------------------------|-----------------------------------------------------|
| [index.refresh_interval](RefreshInterval.md) | Set to 30s or more (default is 1s)                  |
| number_of_replicas                           | Set to 0 during heavy indexing, then increase later |
| translog.durability                          | Consider async for higher throughput (risky)        |
| indices.memory.index_buffer_size             | Increase for large indexing operations              |

# Monitoring Metrics
Pay attention to:
- Indexing rate (indexing_total from node stats)
- Merge times 
- Heap usage / GC pressure 
- Threadpool rejection rates (especially write/index)

Use [Kibana or Elastic Stack Monitoring](../../../12_Observability/ELK.md) to visualize these.

# Example Use Case: Time-Series Logging
For a logging system (e.g., log ingestion from Beats/Fluentd):
- Use daily or hourly indices. 
- Rollover indices using [ILM](ILM.md) when document count or size threshold is met. 
- Tune pipelines to be lightweight and non-blocking.

# Summary
If you're operating Elasticsearch in a write-heavy mode:
- Batch writes via _bulk. 
- Tweak index and shard settings. 
- Use fast hardware. 
- Monitor your system. 
- Use [ILM](ILM.md) and hot-warm tiers to manage data growth.

# References
- [AWS OpenSearch - this action would add [10] total shards, but this cluster currently has [3996]/[4000] maximum shards open](https://stackoverflow.com/questions/73411388/aws-opensearch-this-action-would-add-10-total-shards-but-this-cluster-curre)