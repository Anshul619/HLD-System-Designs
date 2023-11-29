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