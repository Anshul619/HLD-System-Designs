
# [MongoDB](https://www.interviewbit.com/mongodb-interview-questions/)

<img title="MongoDB_JSON" alt="Alt text" src="assests/MongoDB_JSON.png">

## Data Storage Architecture

MongoDB is better suited for high write and update throughput operations without draining CPU resources and/or causing disk I/O issues. 
- It is written in C++ and uses a memory map file to map on-disk data files to in-memory byte arrays. 
- It organizes data using a doubly linked data structure: documents contain linked lists to one another and to the `BSON-encoded` data behind the scenes.

## Use Cases

MongoDB is more suitable to manage NoSQL data requiring create, read, update and delete (CRUD) operations. 
- It offers high scalability, reliability, and performance. 
- MongoDB also uses text-based indexes for full-text queries, but the search is slow, and the search server does not provide tokenizers and analyzers like [Elasticsearch](../ElasticSearch) does.