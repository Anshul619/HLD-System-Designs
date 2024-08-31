# ElasticSearch with GraphQL
- There are several libraries which expose the [full Elasticsearch API](../3_Databases/9_Search-Databases/ElasticSearch/Readme.md) as a GraphQL API.
- But like traditional [REST APIs](../3_Databases/9_Search-Databases/Features/RESTAPIs.md) with Elasticsearch Backends, we mostly don’t want to expose all the possibilities which the **Elasticsearch Query Language** offers to the end users.
- At the end we have a GraphQL API running on two NodeJS nodes and two Elasticsearch nodes, serving up to **5000rpm in a 50ms**.

![img.png](https://miro.medium.com/max/1400/1*tTkojwYiLDLr-F1srfF2QA.png)

# Denormalizing Datasource for Improved Performance

![img.png](https://miro.medium.com/max/1400/1*f6lCaeOG99suka21ZUpCzw.png)

# References
- [GraphQL and Elasticsearch: A Love Letter](https://blog.smartive.ch/graphql-and-elasticsearch-a-love-letter-9ed64d5c094)