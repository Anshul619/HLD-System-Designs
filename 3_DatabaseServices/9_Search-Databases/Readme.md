# Key Characteristics of Search-DBs

| Title                        | Remarks                                                                                                                                                                                                 |
|------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Based on Apache Lucene       | Search-DBs are based on [Apache Lucene - a text-search engine](https://lucene.apache.org/core/).                                                                                                        |
| Used for derived data        | Search-DBs don't provide 100% durability, hence [it should be used for derived data and not as primary source of truth](https://bonsai.io/blog/why-elasticsearch-should-not-be-your-primary-data-store) |
| Tokenizer                    | [Read more](Analysers.md)                                                                                                                                                                               |
| Indices containing documents | Indices is like tables, documents like rows in Search-DBs.                                                                                                                                              |
| Inverted Index               | [Read more](InvertedIndex.md)                                                                                                                                               |

# Various Search-DBs

| Service                                                                     |
|-----------------------------------------------------------------------------|
| [Elastic Search](ElasticSearch/Readme.md)                                   |
| [Apache Solr](ApacheSolr.md)                                                |
| [New Relic - Logs Analysis](../../12_ObservabilityLogsServices/NewRelic/Readme.md) |
| [MongoDB Atlas Search](MongoAtlasSearch.md)                                 |

# :star: Real world usages of Search-DBs

| Use Case                                | Remarks                                                                                |
|-----------------------------------------|----------------------------------------------------------------------------------------|
| Search - Full-text, Partial etc.        | Application search                                                                     |
| Logs-analysis                           | Since data is indexed in Lucene, hence logs analysis is fast in Lucene.                |
| Dashboard, Visualize data, Metrics etc. | Since data aggregation is fast in Lucene, hence data visualization is quick in Lucene. |

# Reference
- [How does elasticsearch store data?](https://stackoverflow.com/questions/57328151/how-does-elasticsearch-store-data)
- [What are the top alternatives to Elasticsearch, and how do they compare?](https://www.quora.com/What-are-the-top-alternatives-to-Elasticsearch-and-how-do-they-compare)