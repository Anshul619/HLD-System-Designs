# Layers in modern data architecture

| Layer                   | Description                                                                                  |
|-------------------------|----------------------------------------------------------------------------------------------|
| Data Ingestion          | [Bring your data](../4_MessageBrokersEDA/Kafka/Readme.md) into your data platform.           |
| Data Processing         | Create your [data processing pipelines](DataProcessing).                                     |
| Data Cataloging         | Store your metadata.                                                                         |
| Data Storage            | Store your [structured and unstructured data](DataStorage).                                  |
| Data Consumption        | Enable your user personas for [purpose-built analytics](DataConsumption) and machine learning. |
| Security and governance | Protect your data across the layers and data access management.                              |

# Various Services in Data layers

![](Data-Architecture-ETL-Ingestion-Processing-Analytics.png)

# How can we define big data?

|              | Remarks                                                                                                                                                                              |
|--------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Data Volume  | **100s of TB** to PB-scale and higher                                                                                                                                                |
| Architecture | Parallel Processing often involved using [Hadoop](ApacheHadoop/Readme.md), [Spark](DataProcessing/ApacheSpark.md), [data warehouse](DataStorage/DataWarehouses/Readme.md) platforms. |
| Necessity    | **Processing of data sets too large** for operational databases                                                                                                                      |
| Nominally    | Big data tech sometimes imposed on small data problems                                                                                                                               |

# Read more
- [AWS Summit ASEAN 2023 | Simplify data management with modern data architecture on AWS (INSO203)](https://www.youtube.com/watch?v=hwF0AZaUc6U)