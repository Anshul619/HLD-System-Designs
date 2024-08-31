# Index Sharding

|                      | Description                                                                                                                                                                                                          |
|----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Shard size - Search  | 10-30 GB                                                                                                                                                                                                             |
| Shard size - Logs    | 30-50 GB                                                                                                                                                                                                             |
| Shard count          | When you have indexes with multiple shards, try to make the shard count an even multiple of the data node count.<br/>- For example, if you have 12 primary shards, your data node count should be 2, 3, 4, 6, or 12. |
| Shards per data node | Aim for 25 shards or fewer per GiB of heap memory. For example, a node with 32 GiB of heap memory should hold no more than 800 shards.                                                                               |
| Shard to CPU ratio   | Use an initial scale point of 1.5 vCPU per shard. <br/>- If your instance type has 8 vCPUs, set your data node count so that each node has no more than six shards.                                                  |

[Read more](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/bp.html)

# References
- [Sizing Amazon OpenSearch Service domains](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/sizing-domains.html)
