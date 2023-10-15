# MongoDB atlas search
- With [Atlas Search](https://www.mongodb.com/atlas/search), you work with a single, unified API across both your database and search operations, simplifying your queries and reducing development time.

# Dynamic Search Index

```json
{
  "name": "sample_supplies-sales-dynamic",
  "searchAnalyzer": "lucene.standard",
  "analyzer": "lucene.standard",
  "collectionName": "sales",
  "database": "sample_supplies",
  "mappings": {
    "dynamic": true
  }
}
```

# Static Search Index

````json
{
    "name": "sample_supplies-sales-static",
    "searchAnalyzer": "lucene.standard",
    "analyzer": "lucene.standard",
    "collectionName": "sales",
    "database": "sample_supplies",
    "mappings": {
        "dynamic": false,
        "fields": {
            "storeLocation": {
                "type": "string"
            }
        }
    }
}
````

# Facet

````json
{
    "name": "sample_supplies-sales-facets",
    "searchAnalyzer": "lucene.standard",
    "analyzer": "lucene.standard",
    "collectionName": "sales",
    "database": "sample_supplies",
    "mappings": {
        "dynamic": true,
        "fields": {
        "purchaseMethod": [
            {
            "dynamic": true,
            "type": "document"
            },
            {
            "type": "string"
            }
        ],
        "storeLocation": [
            {
            "dynamic": true,
            "type": "document"
            },
            {
            "type": "stringFacet"
            }
        ]
        }
    }
}
````
