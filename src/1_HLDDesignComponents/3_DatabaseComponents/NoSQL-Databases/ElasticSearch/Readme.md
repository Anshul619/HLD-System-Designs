# Introduction
- A distributed, RESTful modern search and analytics engine based on [Apache Lucene](ApacheLucene.md).
- In ElasticSearch, data is stored in the form of `JSONs`.
- We can only interact with ElasticSearch through [REST APIs](../../../2_APITechOptions/REST.md).
- ElasticSearch can be deployed using [Amazon OpenSearch](../../../../2_AWSComponents/6_DatabaseServices/AmazonOpenSearch.md) service, on [AWS](../../../../2_AWSComponents).
- For data analysis, it operates alongside Kibana, and Logstash to form the [ELK stack](../../../7_MonitoringTools/ELK.md).
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

## Data Storage Architecture
- Settings, index mapping, alternative cluster states, and other metadata are saved to Elasticsearch files outside the [Lucene](ApacheLucene.md) environment.
- In Lucene, data updates are resource-intensive operations, because segments are immutable, and every commit creates a new segment, then segments are merged automatically. 
- To avoid this excessive I/O, Elasticsearch creates dedicated transactional index logs, preventing low-level Lucene commits for each indexing procedure. 
- These logs can also be used for recovery in case of data corruption.

## Real world usages of ElasticSearch
- `Search - Full-text, Partial etc.`
- [Logs-analysis with ELK](../../../7_MonitoringTools/ELK.md)
- [Dashboard, Visualize data, Metrics etc. with ELK](../../../7_MonitoringTools/ELK.md)
- [Security, SIEM with ELK](../../../7_MonitoringTools/ELK.md)
- [Read more about usages of Lucene](ApacheLucene.md#real-world-usages-of-apache-lucene)

# Other Points
- [Installation using Docker ELK](https://github.com/deviantony/docker-elk)
- [GraphQL with ElasticSearch](ElasticSearchWithGraphQL.md)

# References
- [ElasticSearch from the Bottom Up](https://www.elastic.co/blog/found-elasticsearch-from-the-bottom-up)
- [ElasticSearch Interview Questions - JavaPoint](https://www.javatpoint.com/elasticsearch-interview-questions)
- [What are the top alternatives to Elasticsearch, and how do they compare?](https://www.quora.com/What-are-the-top-alternatives-to-Elasticsearch-and-how-do-they-compare)