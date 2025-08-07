# Sharding in ES Cluster
- The data stored in an index can be divided into [multiple partitions/shards](../../3_Scalability-Techniques/PartitioningSharding/Readme.md).
- An Elasticsearch index has **5 shards** and **1 replica** by default.
- Each shard is an instance of a [Lucene index](../Readme.md), which you can think of as a self-contained search engine that indexes and handles queries for a subset of the data in an Elasticsearch cluster.

> Tips
> - Avoid having [very large shards as this can negatively affect the cluster's ability](https://www.elastic.co/blog/how-many-shards-should-i-have-in-my-elasticsearch-cluster) to recover from failure.
> - There is no fixed limit on how large shards can be, but a **shard size of 50GB** is often quoted as a limit that has been seen to work for a variety of use-cases.

# Read more
- [Size your shards](https://www.elastic.co/guide/en/elasticsearch/reference/current/size-your-shards.html)