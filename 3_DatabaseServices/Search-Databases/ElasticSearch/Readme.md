# Introduction
- [ElasticSearch](https://www.elastic.co/elasticsearch/) is a distributed, [RESTful modern search](../../../8_APIProtocols/REST.md) and analytics engine based on [Apache Lucene](../Readme.md).
- ElasticSearch can be deployed using [Amazon OpenSearch](../../../2_AWSServices/6_DatabaseServices/AmazonOpenSearch.md) service, on [AWS](../../../2_AWSServices).

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

|                                 | Remarks                                                                                                                                                                                         |
|---------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| GraphQL support                 | ElasticSearch supports [GraphQL](ElasticSearchCluster.md) in its APIs.                                                                                                                          |
| Default Config                  | An Elasticsearch index has **5 shards** and **1 replica** by default.                                                                                                                           |
| Mapping                         | [Mapping](https://www.elastic.co/guide/en/elasticsearch/reference/current/mapping.html) is the process of defining how a document, and the fields it contains, are stored and indexed.          |
| Sample Search Query             | [Sample Search Query](samples/SampleSearchQuery.md)                                                                                                                                             |
| Ingest Node                     | Ingest node is used for pre-process documents before the actual document indexing happens. <br/>- It helps to intercepts bulk and index requests.                                               |
| Data Storage                    | Settings, index mapping, alternative cluster states, and other metadata are saved to Elasticsearch files outside the [Lucene](../Readme.md) environment. This is to prevent excessive disk I/O. |
| Elastic Stack                   | For data analysis, it operates alongside Kibana, and Logstash to form the [ELK stack](../../../12_ObservabilityLogsServices/ELK.md).                                                            |
| Elastic Near-Real-Time platform | [Read more](https://www.elastic.co/guide/en/elasticsearch/reference/current/near-real-time.html)                                                                                                |
| Pricing                         | [Read more](https://www.elastic.co/pricing/)                                                                                                                                                    |
| Data Streaming                  | [Read more](ElasticSearchDataStreams.md)                                                                                                                                                        |
| REST API interface              | We can only interact with ElasticSearch through [REST APIs](../../../8_APIProtocols/REST.md).                                                                                                   |

# Different data types supported
- Textual
- Numerical
- [GeoSpatial (geo-point, geo-shape data types etc.)](ElasticSearchGeoSpatialSupport.md)
- Unstructured etc.

# :star: ElasticSearch Cluster

![](assests/ElasticSearch-Cluster.png)

[Read more](ElasticSearchCluster.md)

# REST APIs (JSON based)

| API name                                                                                   | Example URL                    |
|--------------------------------------------------------------------------------------------|--------------------------------|
| [Search APIs](https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html) | GET /books/_search             |
| List all indices                                                                           | GET /_cat/indices              |
| Create an index                                                                            | PUT /books                     |
| Find mapping on an index                                                                   | GET /books/_mapping?&pretty    |
| Insert a document in the index                                                             | POST /books/_doc/ -dbooks.json |
| Delete an index                                                                            | DELETE /books?pretty           |
| Aggregation APIs                                                                           |                                |
| Cluster APIs                                                                               |                                |

[Read more](https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-create-index.html)

# References
- [ElasticSearch from the Bottom Up](https://www.elastic.co/blog/found-elasticsearch-from-the-bottom-up)
- [ElasticSearch Interview Questions - JavaPoint](https://www.javatpoint.com/elasticsearch-interview-questions)
- [What are the top alternatives to Elasticsearch, and how do they compare?](https://www.quora.com/What-are-the-top-alternatives-to-Elasticsearch-and-how-do-they-compare)