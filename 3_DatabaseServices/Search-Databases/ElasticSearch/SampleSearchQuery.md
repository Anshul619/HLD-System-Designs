# Sort Search Results

API URL - `GET /my-index-000001/_search`

Request Body
````json
{
  "sort" : [
    { "post_date" : {"order" : "asc", "format": "strict_date_optional_time_nanos"}},
    "user",
    { "name" : "desc" },
    { "age" : "desc" },
    "_score"
  ],
  "query" : {
    "term" : { "user" : "kimchy" }
  }
}
````

[Read more](https://www.elastic.co/guide/en/elasticsearch/reference/current/sort-search-results.html)