# Introduction
- [ElasticSearch](https://www.elastic.co/elasticsearch/) is a distributed, [RESTful modern search](../../../8_APIProtocols/REST.md) and analytics engine based on [Apache Lucene](../Readme.md).
- We can only interact with ElasticSearch through [REST APIs](../../../8_APIProtocols/REST.md).
- ElasticSearch can be deployed using [Amazon OpenSearch](../../../2_AWSServices/6_DatabaseServices/AmazonOpenSearch.md) service, on [AWS](../../../2_AWSServices).
- For data analysis, it operates alongside Kibana, and Logstash to form the [ELK stack](../../../12_ObservabilityLogsServices/ELK.md).

# :star: Real world use cases of ElasticSearch
- [Food Ordering - HLD Design](../../../0_HLDUseCasesProblems/FoodOrderingZomatoSwiggy/Readme.md)
- [Uber Driver Allocation - HLD Design](../../../0_HLDUseCasesProblems/DriverAllocationUberGoJek/Readme.md)
- [Logging Solution in Distributed Systems - HLD Design](../../../0_HLDUseCasesProblems/ObervabilityLoggingSolution/LoggingFileAggregation/Readme.md)
- [Flight Booking Search - HLD Design](../../../0_HLDUseCasesProblems/FlightBookingSearchMakeMyTrip/Readme.md)
- [Grab - Search Index Optimization](../../../1_TechStacks/Grab/SearchIndexing.md)
- [Shopify: Powering the search for better help documentation using Elastic Site Search](../../../1_TechStacks/ShopifyTechStack.md)

# :star: General Use Cases of Search-Indexes
- [Search - Full-text, Partial etc.](https://www.elastic.co/guide/en/elasticsearch/reference/current/full-text-queries.html)
- [Search - Fuzzy Query](https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-fuzzy-query.html)
- [Logs-analysis](../../../12_ObservabilityLogsServices/ELK.md)
- [Dashboard, Visualize data, Metrics etc.](../../../12_ObservabilityLogsServices/ELK.md)
- [Security, SIEM with ELK](../../../12_ObservabilityLogsServices/ELK.md)

# Key Features of ElasticSearch

## Different data types supported
- Textual
- Numerical
- [GeoSpatial (geo-point, geo-shape data types etc.)](ElasticSearchGeoSpatialSupport.md)
- Unstructured etc.

## REST APIs (JSON based)

| API name                                                                                   | Example URL                  |
|--------------------------------------------------------------------------------------------|------------------------------|
| [Search APIs](https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html) | GET /my-index-000001/_search |
| Index APIs                                                                                 | GET /_cat/indices            |
| Document APIs                                                                              |                              |
| Aggregation APIs                                                                           |                              |
| Cluster APIs                                                                               |                              |

## :star: ElasticSearch Cluster

![img.png](assests/ElasticSearch-Cluster.png)

[Read more](ElasticSearchCluster.md)

## ElasticSearch Data Streaming

![img.png](assests/ElasticSearch-DataStream.png)

[Read more](ElasticSearchDataStreams.md)

## Data Storage Architecture
- Settings, index mapping, alternative cluster states, and other metadata are saved to Elasticsearch files outside the [Lucene](../Readme.md) environment.
- In [Apache Lucene](../Readme.md), data updates are resource-intensive operations, because segments are immutable, and every commit creates a new segment, then segments are merged automatically. 
- To avoid this excessive I/O, Elasticsearch creates dedicated transactional index logs, preventing low-level Lucene commits for each indexing procedure. 
- These logs can also be used for recovery in case of data corruption.

# What is Ingest node?
- Ingest node is use for pre-process documents before the actual document indexing happens. 
- It helps you to intercepts bulk and index requests.
- It also applies transformations, and then it passes the documents back to the bulk API and index.

# Other Points
- [Installation using Docker ELK](https://github.com/deviantony/docker-elk)
- [GraphQL with ElasticSearch](ElasticSearchWithGraphQL.md)
- [NRT - Near Real-Time Search platform](https://www.elastic.co/guide/en/elasticsearch/reference/current/near-real-time.html)
- [Sample Search Query](SampleSearchQuery.md)
- [ElasticSearch Pricing](https://www.elastic.co/pricing/).

# References
- [ElasticSearch from the Bottom Up](https://www.elastic.co/blog/found-elasticsearch-from-the-bottom-up)
- [ElasticSearch Interview Questions - JavaPoint](https://www.javatpoint.com/elasticsearch-interview-questions)
- [What are the top alternatives to Elasticsearch, and how do they compare?](https://www.quora.com/What-are-the-top-alternatives-to-Elasticsearch-and-how-do-they-compare)