# Amazon Data Firehouse vs AWS Glue vs Amazon EMR vs AWS Batch

| Feature                 | [Amazon Data Firehouse](../DataConnectors/AmazonDataFirehouse/Readme.md) | [AWS Glue](AWSGlue.md)                                                  | [Amazon EMR](AmazonEMR.md)                                                                         | [AWS Batch](AWSBatch.md) |
|-------------------------|--------------------------------------------------------------------------|-------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------|--------------------------|
| Processing Type         | Stream Processing                                                        | Stream & Batch Processing                                               | Batch Processing                                                                                   | Batch Processing         |
| Serverless              | :white_check_mark: Yes                                                   | :white_check_mark: Yes                                                  | :x: No, runs on [Amazon EC2 instances](../../2_ComputeServices/AmazonEC2/Readme.md)                | :white_check_mark: Yes   |
| Underlying Tech         | AWS-Proprietary                                                          | [Apache Spark](../../../6_BigData/DataProcessing/ApacheSpark/Readme.md) | [Apache Hadoop components like Spark, HBase, Hive etc.](../../../6_BigData/ApacheHadoop/Readme.md) |                          |
| Supports custom script? | Yes, through [Lambda](../../2_ComputeServices/AWSLambda/Readme.md)       | :white_check_mark: Yes                                                  | :white_check_mark: Yes                                                                             |                          |

# References
- [AWS - Glue vs DataPipeline vs EMR vs DMS vs Batch vs Kinesis - What should one use ? Where, When and Why?](https://www.linkedin.com/pulse/aws-glue-vs-datapipeline-emr-dms-batch-kinesis-what-ramamurthy/)
- [Comparing AWS Glue and EMR](https://fathomtech.io/blog/aws-emr-versus-glue/)