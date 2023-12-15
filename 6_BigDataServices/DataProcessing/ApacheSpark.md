# Apache Spark
- [Apache Spark](https://spark.apache.org) is an open-source framework & compute engine that is known for its speed, easy-to-use nature in the field of **big data processing** and **analysis**.
- It also has built-in modules for **graph processing, machine learning, streaming, SQL** etc.
- The spark execution engine supports **in-memory computation** and cyclic data flow.
- It can run either on [cluster mode](../../7_PropertiesDistributedSystem/Scalability/ServersCluster.md) or standalone mode.
- It can select the distributed data, create a map and then reduce the values to give proper data.

# Spark Stack

![](https://www.altexsoft.com/media/2021/06/word-image-14.png)

# :star: Real world use cases of Apache Spark

|                                                                                           | Remarks                                                                                                               |
|-------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| [Zomato - HLD Design](../../0_HLDUseCasesProblems/FoodOrderingZomatoSwiggy/Readme.md)     | Generate recommendations based on continuous streams of user activity, order activity, pricing and promo changes etc. |
| [Uber Driver Allocation](../../0_HLDUseCasesProblems/DriverAllocationUberGoJek/Readme.md) | Select driver based on continuous streams of driver locations, user location etc.                                     |

# Features

| Feature                             | Remarks                                                                                                                                                                             |
|-------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Resilient Distributed Dataset (RDD) | [RDD](https://spark.apache.org/docs/latest/rdd-programming-guide.html) is a collection of elements partitioned across the nodes of the cluster that can be operated on in parallel. |
| Directed acyclic graph (DAG)        |                                                                                                                                                                                     |

# Data Sources

![](https://miro.medium.com/v2/resize:fit:1368/format:webp/1*kNBQi-vVM_J3vaqHS_HBWw.png)

# Libraries
- Spark Core
- MLlib/GraphX
- SQL
- [Streaming](StreamProcessing/SparkStreaming.md)

# Apache Spark vs Others
- [Apache Spark vs Hadoop MapReduce](ApacheSparkVsMapReduce.md) 
- [Apach Spark vs Storm](StreamProcessing/ApacheStorm.md#apachestorm-vs-spark)

# References
- [Top Spark Interview Questions](https://www.interviewbit.com/spark-interview-questions/)
- [Spark vs Hadoop MapReduce](https://www.integrate.io/blog/apache-spark-vs-hadoop-mapreduce/)
- [Playing with 80 Million Amazon Product Review Ratings Using Apache Spark](https://minimaxir.com/2017/01/amazon-spark/)