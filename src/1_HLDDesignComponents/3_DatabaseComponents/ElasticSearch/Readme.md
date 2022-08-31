
# Introduction
- A distributed, RESTful modern search and analytics engine based on [Apache Lucene](ApacheLucene.md).
- In ElasticSearch, data is stored in the form of `JSONs`.
- We can only interact with ElasticSearch through [REST APIs](../../2_APITechOptions/REST.md).
- ElasticSearch can be deployed using `Amazon OpenSearch` service, on [AWS](../../../2_AWSComponents).
- ElasticSearch is [paid and not open-sourced](https://www.elastic.co/pricing/).

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

## Real world usages of ElasticSearch
- `Search - Full-text, Partial etc.`
- [Logs-analysis with ELK](../../7_MonitoringTools/ELK.md)
- [Dashboard, Visualize data, Metrics etc. with ELK](../../7_MonitoringTools/ELK.md)
- [Read about usages of Lucene](ApacheLucene.md#real-world-usages-of-apache-lucene)

# [GraphQL with ElasticSearch](ElasticSearchWithGraphQL.md)

# Installation Methods
- [Docker ELK](https://github.com/deviantony/docker-elk)

# References
- [Elasticsearch from the Bottom Up](https://www.elastic.co/blog/found-elasticsearch-from-the-bottom-up)
- [ElasticSearch Interview Questions - JavaPoint](https://www.javatpoint.com/elasticsearch-interview-questions)
- [What are the top alternatives to Elasticsearch, and how do they compare?](https://www.quora.com/What-are-the-top-alternatives-to-Elasticsearch-and-how-do-they-compare)
