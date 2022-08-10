
# [ElasticSearch with GraphQL](https://blog.smartive.ch/graphql-and-elasticsearch-a-love-letter-9ed64d5c094)
- There are several libraries which expose the full Elasticsearch API as a GraphQL API.
- But like traditional REST APIs with Elasticsearch Backends, we mostly don’t want to expose all the possibilities which the `Elasticsearch Query Language` offers to the end users.
- At the end we have a GraphQL API running on two NodeJS nodes and two Elasticsearch nodes, serving up to `5000rpm in a 50ms`.

![img.png](assests/graphql_with_elasticsearch.png)

## Denormalize Datasource in ElasticSearch for Improved Performance

![img.png](assests/graphQL_denormalized.png)