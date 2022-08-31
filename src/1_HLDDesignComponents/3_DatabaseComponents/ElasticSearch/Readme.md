
# Introduction
- A distributed, RESTful modern search and analytics engine based on [Apache Lucene](ApacheLucene.md).
- In ElasticSearch, data is stored in the form of `JSONs`, .
- We can only interact with ElasticSearch through REST APIs.
- Main Use Cases are `full-text-search`, `logs-analysis` ( ELK ) etc.

# Key Features of ElasticSearch

## Different data types supported
- Textual
- Numerical
- [GeoSpatial (geo-point, geo-shape data types)](https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-geo-bounding-box-query.html)
- Unstructured etc.

## REST APIs (JSON based)
- [Search APIs](https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html) (`GET /my-index-000001/_search`)
- Document APIs
- Aggregation APIs
- Index APIs (`GET /_cat/indices`)
- Cluster APIs

## [ElasticSearch Cluster](ElasticSearchCluster.md)

# [GraphQL with ElasticSearch](ElasticSearchWithGraphQL.md)

# Installation Methods
- [Docker ELK](https://github.com/deviantony/docker-elk)

# References
- [Elasticsearch from the Bottom Up](https://www.elastic.co/blog/found-elasticsearch-from-the-bottom-up)
- [ElasticSearch Interview Questions - JavaPoint](https://www.javatpoint.com/elasticsearch-interview-questions)
- [TBD - How to dramatically increase your Elasticsearch throughput and concurrency capacity](https://medium.com/explorium-ai/how-to-dramatically-increase-your-elasticsearch-throughput-and-concurrency-capacity-c32d7bb02ac2)
- [TBD - Performance Considerations for Elasticsearch Indexing](https://www.elastic.co/blog/performance-considerations-elasticsearch-indexing)
- [TBD - ElasticSearch vs MongoDB](https://cloud.netapp.com/blog/cvo-blg-elasticsearch-vs-mongodb-6-key-differences)
