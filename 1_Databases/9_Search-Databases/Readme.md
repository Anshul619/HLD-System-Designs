# Key Characteristics of Search-DBs

| Title                        | Remarks                                                                                                                                                                                                  |
|------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Based on Apache Lucene       | Search-DBs are based on [Apache Lucene - a text-search engine](https://lucene.apache.org/core/).                                                                                                         |
| Used for derived data        | Search-DBs don't provide 100% durability, hence it should be used for [derived data](https://bonsai.io/blog/why-elasticsearch-should-not-be-your-primary-data-store) and not as primary source of truth. |
| General use-cases            | [Read more](SearchUseCases.md)                                                                                                                                                                           |
| Tokenizer                    | [Read more](Internals/Tokenizers.md)                                                                                                                                                                     |
| Inverted Index               | [Read more](Internals/InvertedIndex.md)                                                                                                                                                                  |
| Indices containing documents | Indices is like tables, documents like rows in Search-DBs.                                                                                                                                               |

# Various Search-DBs

| Service                                                                |
|------------------------------------------------------------------------|
| [Elastic Search](ElasticSearch/Readme.md)                              |
| [Open Search](OpenSearch/Readme.md)                                           |
| [Apache Solr](ApacheSolr.md)                                           |
| [MongoDB Atlas Search](MongoAtlasSearch.md)                            |
| [New Relic - Logs Analysis](https://github.com/Anshul619/DevOps-SRE/tree/main/3_Observability/NewRelic/Readme.md) |

# Reference
- [How does elasticsearch store data?](https://stackoverflow.com/questions/57328151/how-does-elasticsearch-store-data)
- [What are the top alternatives to Elasticsearch, and how do they compare?](https://www.quora.com/What-are-the-top-alternatives-to-Elasticsearch-and-how-do-they-compare)