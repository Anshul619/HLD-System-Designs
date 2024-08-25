# REST APIs (JSON based)

| API name                       | Example URL                    | Request Parameters                  | Remarks                                                                                  |
|--------------------------------|--------------------------------|-------------------------------------|------------------------------------------------------------------------------------------|
| Search APIs                    | GET /books/_search             |                                     | [Read more](https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html) |
| List all indices               | GET /_cat/indices              |                                     |                                                                                          |
| Create an index                | PUT /books                     |                                     |                                                                                          |
| Find mapping on an index       | GET /books/_mapping?&pretty    |                                     |                                                                                          |
| Insert a document in the index | POST /books/_doc/ -dbooks.json | JSON                                |                                                                                          |
| Analyze/Tokenize the index     | POST /books/_analyze?pretty    | analyzer (standard or custom), text |                                                                                          |
| Delete an index                | DELETE /books?pretty           |                                     |                                                                                          |

[Read more](https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-create-index.html)