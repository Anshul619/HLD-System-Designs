# Various Services & Comparison
- [Apache Spark vs MapReduce vs Flink vs Storm vs Kafka Streams](SparkVsMapReduceVsFlinkVsStorm.md)
- [AWS Glue vs Amazon EMR](../../2_AWSServices/10_BigDataServices/DataProcessing/AWSGlueVsEMRVsBatch.md)

# General Use Cases of Big Data Processing

| Use Case                             | Processing Type                                          | Remarks                                                                                                                                                                                                                                                                                                                                  |
|--------------------------------------|----------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: Fraud Detection               | [Stream Processing](ProcessingTypes/StreamProcessing.md) | Fraud detection systems need to determine if the usage patterns of a credit card have unexpectedly changed, and block the card if it is likely to have been stolen.                                                                                                                                                                      |
| :star: Financial Stock Market        | [Stream Processing](ProcessingTypes/StreamProcessing.md) | Trading systems need to examine price changes in a financial market and execute trades according to specified rules.                                                                                                                                                                                                                     |
| Log analytics                        | [Stream Processing](ProcessingTypes/StreamProcessing.md) | Log files generated by server or applications                                                                                                                                                                                                                                                                                            |
| User Events on app like ClickStreams | [Stream Processing](ProcessingTypes/StreamProcessing.md) | Customer interaction data from a web application or mobile application                                                                                                                                                                                                                                                                   |
| Manufacturing Systems                | [Stream Processing](ProcessingTypes/StreamProcessing.md) | Manufacturing systems need to monitor the status of machines in a factory, and quickly identify the problem if there is a malfunction.                                                                                                                                                                                                   |
| Military Systems                     | [Stream Processing](ProcessingTypes/StreamProcessing.md) | Military and intelligence systems need to track the activities of a potential aggregation, and raise the alarm if there are signs of an attack.                                                                                                                                                                                          |
| Stream Analytics                     | [Stream Processing](ProcessingTypes/StreamProcessing.md) | Measuring the rate of some type of event (how often it occurs per time interval)<br/>- Calculating the rolling average of a value over some time period<br/>- Comparing current statistics to previous time intervals (e.g. to detect trends or to alert on metrics that are unusually high or low compared to the same time last week). |
| :star: Data from IoT sensors         | [Stream Processing](ProcessingTypes/StreamProcessing.md) | Internet of Things (IoT), ad tech, gaming etc.                                                                                                                                                                                                                                                                                           |
| Payment Processing Systems           | [Stream Processing](ProcessingTypes/StreamProcessing.md) |                                                                                                                                                                                                                                                                                                                                          |
| :star: ETL Pipeline                  | [Batch Processing](ProcessingTypes/BatchProcessing.md)   | [Read more](ETL.md)                                                                                                                                                                                                                                                                                                                      |
| Building indexes for search DBs      | [Batch Processing](ProcessingTypes/BatchProcessing.md)   | [ApacheHadoop](../ApacheHadoop/Readme.md) can be used to build indexes for [Lucene/Solr](../../3_DatabaseServices/9_Search-Databases/Readme.md).                                                                                                                                                                                         |
| Recommendation System                | [Batch Processing](ProcessingTypes/BatchProcessing.md)   | [50-100 MapReduce jobs](ApacheMapReduce/Readme.md) are used for recommendation system in Google.                                                                                                                                                                                                                                         |
| Ranking System                       | [Batch Processing](ProcessingTypes/BatchProcessing.md)   |                                                                                                                                                                                                                                                                                                                                          |
| Machine learning systems             | [Batch Processing](ProcessingTypes/BatchProcessing.md)   | Example - Classifiers (spam filters, anomaly detection, image recognition etc.)                                                                                                                                                                                                                                                          |