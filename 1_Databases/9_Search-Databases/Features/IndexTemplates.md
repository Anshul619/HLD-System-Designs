# Index Templates
- [Index templates](https://opensearch.org/docs/latest/im-plugin/index-templates/) let you initialize new indexes with predefined mappings and settings.
- For example, if you continuously index log data, you can define an index template so that all of these indexes have the same number of shards and replicas.

# Example
````
PUT _index_template/daily_logs
{
  "index_patterns": [
    "logs-2020-01-*"
  ],
  "template": {
    "aliases": {
      "my_logs": {}
    },
    "settings": {
      "number_of_shards": 2,
      "number_of_replicas": 1
    },
    "mappings": {
      "properties": {
        "timestamp": {
          "type": "date",
          "format": "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis"
        },
        "value": {
          "type": "double"
        }
      }
    }
  }
}
````