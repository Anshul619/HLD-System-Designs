# Caching
- OpenSearch relies on different [on-heap cache types](https://opensearch.org/docs/latest/search-plugins/caching/index/) to accelerate data retrieval, providing significant improvement in search latency.
- However, cache size is limited by the amount of memory available on a node. 

# Supported on-heap cache types

|                     | Description                                                                                                                                                                      |
|---------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Index request cache | Caches the local results on each shard. This allows frequently used and potentially resource-heavy search requests to return results almost instantaneously.                     |
| Query cache         | Caches common data from similar queries at the shard level. <br/>- The query cache is more granular than the request cache and can cache data to be reused in different queries. |
| Field data cache    | Caches field data and global ordinals, which are both used to support aggregations on certain field types.                                                                       |