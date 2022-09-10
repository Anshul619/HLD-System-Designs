
# ELK stack
- [Elasticsearch](../3_DatabaseComponents/NoSQL-Databases/ElasticSearch) is a `NoSQL database tool`, which is used to store the unstructured data.
- [Logstash](https://www.elastic.co/logstash/) is a `log pipeline tool` to perform transformation on data.
    - It takes input from different sources and performs various transformations on it.
    - At last, it exports the data into various targets.
- [Kibana](https://www.elastic.co/kibana/) is a `data visualization tool`, which provides an interactive UI (User Interface) to the users for data visualization.
- ELK can be deployed using [Amazon OpenSearch](../../2_AWSComponents/6_DatabaseServices/AmazonOpenSearch.md), on [AWS](../../2_AWSComponents).

![open_search.png](https://d1.awsstatic.com/product-page-diagram_HIW_Amazon-OpenSearch.bccd42c9b855877a40e4eb3c55511a8aae1002a4.png)

# Other Steps
- [Installation using Docker ELK](https://github.com/deviantony/docker-elk)

