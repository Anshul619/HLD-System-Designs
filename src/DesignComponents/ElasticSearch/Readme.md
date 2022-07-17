
# [Architecture](https://res.cloudinary.com/practicaldev/image/fetch/s--pkQ3ztaH--/c_limit,f_auto,fl_progressive,q_auto,w_880/https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/images/za-2-az.png)
<img title="Design1" alt="Alt text" src="assests/design1.png">

# [How does elasticsearch store data?](https://stackoverflow.com/questions/57328151/how-does-elasticsearch-store-data)
- Elastic uses [lucene](https://lucene.apache.org/core/) under the hood.
- Lucene is a text search engine. It stores text in a custom binary format optimized for retrieval purposes. The format is highly optimized and complicated.
- Lucenes uses the concept of "indices containing documents". Internally every index consists of several segments. Segments are saved in several files in the file system. Documents are split up in several lookup structures, residing in the files.
- When you browse the data folder of elastic you see this lucene index and segment structure. There is no storage of json formatted data on the file system level. Instead the files contain optimized binary data and you need to pass through the elastic API to get a JSON representation of a document.

# References - TBD
- [ElasticSearch Interview Questions](https://www.guru99.com/elasticsearch-interview-questions.html)
- https://www.interviewgig.com/elastic-serach-interview-questions-and-answers/
- https://stackoverflow.com/questions/57328151/how-does-elasticsearch-store-data
- [How to dramatically increase your Elasticsearch throughput and concurrency capacity](https://medium.com/explorium-ai/how-to-dramatically-increase-your-elasticsearch-throughput-and-concurrency-capacity-c32d7bb02ac2)
- [ElasticSearch Geo Suppport](https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-geo-bounding-box-query.html)