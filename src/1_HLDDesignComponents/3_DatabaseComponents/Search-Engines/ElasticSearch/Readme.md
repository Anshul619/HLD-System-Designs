# Introduction
- A distributed, [RESTful](../../../2_APITechOptions/REST.md) modern search and analytics engine based on [Apache Lucene](../ApacheLucene.md).
- In ElasticSearch, data is stored in the form of `JSONs`.
- Data in Elasticsearch is organized into [indices](https://www.elastic.co/guide/en/elasticsearch/guide/2.x/_add_an_index.html). Each index is made up of one or more shards.
- We can only interact with ElasticSearch through [REST APIs](../../../2_APITechOptions/REST.md).
- ElasticSearch can be deployed using [Amazon OpenSearch](../../../../2_AWSComponents/6_DatabaseServices/AmazonOpenSearch.md) service, on [AWS](../../../../2_AWSComponents).
- For data analysis, it operates alongside Kibana, and Logstash to form the [ELK stack](../../../7_MonitoringTools/ELK.md).
- ElasticSearch is [Paid and NOT open-sourced](https://www.elastic.co/pricing/).
- Since ElasticSearch doesn't provide 100% durability, [it shouldn't be used only primary source of truth](https://bonsai.io/blog/why-elasticsearch-should-not-be-your-primary-data-store).

# :star: Real world use cases of ElasticSearch
- [Zomato - HLD Design](../../../../3_HLDDesignProblems/ZomatoDesign)
- [Uber Driver Allocation](../../../../3_HLDDesignProblems/UberDriverAllocationDesign)
- [Logging Solution in Distributed Systems](../../../../3_HLDDesignProblems/LoggingSolution/README.md)
- [Flight Booking Search](../../../../3_HLDDesignProblems/FlightBookingSearch/README.md)
- [Shopify: Powering the search for better help documentation using Elastic Site Search](https://www.elastic.co/customers/shopify)

## :star: General Use Cases of ElasticSearch
- [Search - Full-text, Partial etc.](https://www.elastic.co/guide/en/elasticsearch/reference/current/full-text-queries.html)
- [Search - Fuzzy Query](https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-fuzzy-query.html)
- [Logs-analysis with ELK](../../../7_MonitoringTools/ELK.md)
- [Dashboard, Visualize data, Metrics etc. with ELK](../../../7_MonitoringTools/ELK.md)
- [Security, SIEM with ELK](../../../7_MonitoringTools/ELK.md)
- [Read more about usages of Lucene](../ApacheLucene.md#star-real-world-usages-of-apache-lucene)

# Key Features of ElasticSearch

## Different data types supported
- Textual
- Numerical
- [GeoSpatial (geo-point, geo-shape data types etc.)](#star-elasticsearch-geo-spatial-supportelasticsearchgeospatialsupportmd)
- Unstructured etc.

## REST APIs (JSON based)
- [Search APIs](https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html) (`GET /my-index-000001/_search`)
- Document APIs
- Aggregation APIs
- Index APIs (`GET /_cat/indices`)
- Cluster APIs

## :star: ElasticSearch Cluster

![img.png](assests/ElasticSearch-Cluster.png)

[Read more](ElasticSearchCluster.md)

## ElasticSearch Data Streaming

![img.png](assests/ElasticSearch-DataStream.png)

[Read more](ElasticSearchDataStreams.md)

## :star: [ElasticSearch Geo Spatial Support](ElasticSearchGeoSpatialSupport.md)

## Data Storage Architecture
- Settings, index mapping, alternative cluster states, and other metadata are saved to Elasticsearch files outside the [Lucene](../ApacheLucene.md) environment.
- In [Apache Lucene](../ApacheLucene.md), data updates are resource-intensive operations, because segments are immutable, and every commit creates a new segment, then segments are merged automatically. 
- `To avoid this excessive I/O, Elasticsearch creates dedicated transactional index logs, preventing low-level Lucene commits for each indexing procedure`. 
- These logs can also be used for recovery in case of data corruption.

# Other Points
- [Installation using Docker ELK](https://github.com/deviantony/docker-elk)
- [GraphQL with ElasticSearch](ElasticSearchWithGraphQL.md)

# Sample Queries

## Sort Search Results
- [Read more](https://www.elastic.co/guide/en/elasticsearch/reference/current/sort-search-results.html)

API - `GET /my-index-000001/_search`

Request Body
````json
{
  "sort" : [
    { "post_date" : {"order" : "asc", "format": "strict_date_optional_time_nanos"}},
    "user",
    { "name" : "desc" },
    { "age" : "desc" },
    "_score"
  ],
  "query" : {
    "term" : { "user" : "kimchy" }
  }
}
````

# References
- [ElasticSearch from the Bottom Up](https://www.elastic.co/blog/found-elasticsearch-from-the-bottom-up)
- [ElasticSearch Interview Questions - JavaPoint](https://www.javatpoint.com/elasticsearch-interview-questions)
- [What are the top alternatives to Elasticsearch, and how do they compare?](https://www.quora.com/What-are-the-top-alternatives-to-Elasticsearch-and-how-do-they-compare)