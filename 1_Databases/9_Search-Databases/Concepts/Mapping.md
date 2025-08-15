# Mapping
- [Mapping](https://www.elastic.co/guide/en/elasticsearch/reference/current/mapping.html) is the process of defining how a document, and the fields it contains, are stored and indexed. 

# Sample

````
PUT index
{
  "mappings": {
    "dynamic_templates": [
        {
          "fields": {
            "mapping": {
              "type": "short"
            },
            "match_mapping_type": "string",
            "path_match": "status*"
          }
        }
    ]
  }
}
````