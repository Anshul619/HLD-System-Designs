
# Introduction
- A distributed, RESTful modern search and analytics engine based on Apache Lucene info.

# Key Features of ElasticSearch

## Stores unstructured data
- ElasticSearch stores data in inverted indexes ( term and documents mapped to it ).
- Main Use Cases are `full-text-search`, `logs-analysis` ( ELK ) etc.

## REST APIs
- Document APIs
- Search APIs
- Aggregation APIs
- Index APIs
- Cluster APIs

## [Based on Apache Lucene](https://stackoverflow.com/questions/57328151/how-does-elasticsearch-store-data)
- ElasticSearch uses [lucene](https://lucene.apache.org/core/) under the hood.
- Lucene is a text search engine. It stores text in a custom binary format optimized for retrieval purposes. The format is highly optimized and complicated.
- Lucene uses the concept of `indices containing documents`. 
  - Internally every index consists of several segments. 
  - Segments are saved in several files in the file system. 
  - Documents are split up in several lookup structures, residing in the files.
- When you browse the data folder of elastic you see this lucene index and segment structure. 
  - There is no storage of json formatted data on the file system level. 
  - The files contain `optimized binary data` and `you need to pass through the elastic API to get a JSON representation of a document`.

## Inverted indexes and Index Terms
- The inverted index maps `terms` to `documents` (and possibly positions in the documents) containing the term.
- Using inverted indexes, we can efficiently find documents given term prefixes.
  - For example - find all documents, starting with `c`.

![img.png](assests/inverted_indexes.png)

## [ElasticSearch Cluster](ElasticSearchCluster.md)

## What is tokenizer in Elasticsearch?
- Tokenizers are used to generate the `tokens from a text string`. 
- It breaks down the text string into tokens where it finds whitespace or other punctuation symbols.

## [GeoLocation Support](https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-geo-bounding-box-query.html)
- TBD

# [GraphQL with ElasticSearch](ESWithGraphQL.md)

# References
- [Elasticsearch from the Bottom Up](https://www.elastic.co/blog/found-elasticsearch-from-the-bottom-up)
- [ElasticSearch Interview Questions - JavaPoint](https://www.javatpoint.com/elasticsearch-interview-questions)
- [TBD - How to dramatically increase your Elasticsearch throughput and concurrency capacity](https://medium.com/explorium-ai/how-to-dramatically-increase-your-elasticsearch-throughput-and-concurrency-capacity-c32d7bb02ac2)
- [TBD - Performance Considerations for Elasticsearch Indexing](https://www.elastic.co/blog/performance-considerations-elasticsearch-indexing)
- [TBD - ElasticSearch vs MongoDB](https://cloud.netapp.com/blog/cvo-blg-elasticsearch-vs-mongodb-6-key-differences)
