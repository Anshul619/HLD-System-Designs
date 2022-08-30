
# Introduction
- A distributed, RESTful modern search and analytics engine based on [Apache Lucene](../ApacheLucene.md) info.
- Data is stored in the form of `JSONs`, in ElasticSearch.
- We can only interact with elastic search through REST API.
- Main Use Cases are `full-text-search`, `logs-analysis` ( ELK ) etc.

# Key Features of ElasticSearch

## Different data types supported
- Textual
- Numerical
- [GeoSpatial (geo-point, geo-shape data types)](https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-geo-bounding-box-query.html)
- Unstructured etc.

## REST APIs (JSON based)
- Document APIs
- Search APIs
- Aggregation APIs
- Index APIs
- Cluster APIs

## Inverted indexes and Index Terms
- Internally, ElasticSearch stores data in inverted indexes ( term and documents mapped to it ).
- The inverted index maps `terms` to `documents` (and possibly positions in the documents) containing the term.
- Using inverted indexes, we can efficiently find documents given term prefixes.
  - For example - find all documents, starting with `c`.

![img.png](assests/inverted_indexes.png)

## [ElasticSearch Cluster](ElasticSearchCluster.md)

## What is tokenizer in Elasticsearch?
- Tokenizers are used to generate the `tokens from a text string`. 
- It breaks down the text string into tokens where it finds whitespace or other punctuation symbols.

# [GraphQL with ElasticSearch](ESWithGraphQL.md)

- [Docker ELK](https://github.com/deviantony/docker-elk)

# References
- [Elasticsearch from the Bottom Up](https://www.elastic.co/blog/found-elasticsearch-from-the-bottom-up)
- [ElasticSearch Interview Questions - JavaPoint](https://www.javatpoint.com/elasticsearch-interview-questions)
- [TBD - How to dramatically increase your Elasticsearch throughput and concurrency capacity](https://medium.com/explorium-ai/how-to-dramatically-increase-your-elasticsearch-throughput-and-concurrency-capacity-c32d7bb02ac2)
- [TBD - Performance Considerations for Elasticsearch Indexing](https://www.elastic.co/blog/performance-considerations-elasticsearch-indexing)
- [TBD - ElasticSearch vs MongoDB](https://cloud.netapp.com/blog/cvo-blg-elasticsearch-vs-mongodb-6-key-differences)
