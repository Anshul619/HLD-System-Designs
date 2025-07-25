
# Data Streams
- [A data stream](https://www.elastic.co/guide/en/elasticsearch/reference/current/data-streams.html#data-streams) lets you store [append-only time series data across multiple indices](../5_Database-Internals/AppendOnlyProperty.md) while giving you a single named resource for requests.
- Data streams are well-suited for logs, events, metrics, and other continuously generated data.
- You can submit indexing and search requests directly to a data stream. 
- The stream automatically routes the request to backing indices that store the stream’s data. 

![](ElasticSearch-DataStream.png)

# Index lifecycle management (ILM)
- You can use [index lifecycle management (ILM)](https://www.elastic.co/guide/en/elasticsearch/reference/current/index-lifecycle-management.html) to automate the management of these backing indices. 
- For example, you can use ILM to automatically move older backing indices to less expensive hardware and delete unneeded indices. 
- ILM can help you reduce costs and overhead as your data grows.

# Generation of backing index
````
.ds-<data-stream>-<yyyy.MM.dd>-<generation>
````

# Example Use Case
- [Logs in ELK Stack](../../12_Observability/ELK.md)