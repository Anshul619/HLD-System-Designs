# DB Shards - Recommendations

| Service       | Size  | Writes per second, per shard | Reads per second, per shard |
|---------------|-------|------------------------------|-----------------------------|
| DynamoDB      | 10 GB | 1000                         | 3000                        |
| ElasticSearch | 50 GB |                              |                             |

[Read more about sharding](Readme.md)

# Read more
- [Sizing Amazon OpenSearch Service domains](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/sizing-domains.html)