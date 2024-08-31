# REST APIs (JSON based)
- These apis are supported in both [elastic search](../ElasticSearch) and [open search](../OpenSearch.md).

| API name                             | Example URL                    |
|--------------------------------------|--------------------------------|
| Search APIs                          | GET /books/_search             |
| List all indices/tables              | GET /_cat/indices              |
| Create an index/table                | PUT /books                     |
| Find mapping on an index             | GET /books/_mapping?&pretty    |
| Insert a document in the index/table | POST /books/_doc/ -dbooks.json |
| Analyze/Tokenize the index           | POST /books/_analyze?pretty    |
| Delete an index                      | DELETE /books?pretty           |

[Read more](https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-create-index.html)