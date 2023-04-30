# ELK stack
- [Elasticsearch](../3_DatabaseComponents/Search-Indexes/ElasticSearch) is a `NoSQL database tool`, which is used to store the unstructured data.
- [Logstash](https://www.elastic.co/logstash/) is a `log pipeline tool` to perform transformation on data.
    - It takes input from different sources and performs various transformations on it.
    - At last, it exports the data into various targets.
- [Kibana](https://www.elastic.co/kibana/) is a `data visualization tool`, which provides an interactive UI (User Interface) to the users for data visualization.

![](https://www.guru99.com/images/2/elasticsearch-interview-questions-2.png)

# What are the reason for using ELK stack?
- ELK works best when logs from various Apps of an enterprise converge into a single ELK instance
- It provides amazing insights for this single instance and also eliminates the need to log into a hundred different log data sources. 
- Rapid on-premise installation 
- Easy to deploy Scales vertically and horizontally 
- Elastic offers a host of language clients, which includes Ruby. Python. PHP, Perl, .NET, Java, and JavaScript, and more 
- Availability of libraries for different programming and scripting language

# :star: Real world use cases of ELK
- [Distributed Logging Solution](../../3_HLDDesignProblems/LoggingSolution)

# How filebeat works?
- [Read here](https://www.elastic.co/guide/en/beats/filebeat/current/how-filebeat-works.html)

# Deployment on AWS
- ELK can be deployed using [Amazon OpenSearch](../../2_AWSComponents/6_DatabaseServices/AmazonOpenSearch.md), on [AWS](../../2_AWSComponents).

![open_search.png](https://d1.awsstatic.com/product-page-diagram_HIW_Amazon-OpenSearch.bccd42c9b855877a40e4eb3c55511a8aae1002a4.png)

# Other Notes
- [Installation using Docker ELK](https://github.com/deviantony/docker-elk)
