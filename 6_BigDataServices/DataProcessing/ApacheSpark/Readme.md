# Apache Spark
- [Apache Spark](https://spark.apache.org) is an open-source framework & compute engine that is known for its speed, easy-to-use nature in the field of **big data processing** and **analysis**.
- It also has built-in modules for **graph processing, machine learning, streaming, SQL** etc.
- The spark execution engine supports **in-memory computation** and cyclic data flow.
- It can select the distributed data, create a map and then reduce the values to give proper data.

# Spark Stack

![](https://www.altexsoft.com/media/2021/06/word-image-14.png)

# :star: Real world use cases of Apache Spark

|                                                                                              | Remarks                                                                                                               |
|----------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| [Zomato - HLD Design](../../../0_HLDUseCasesProblems/FoodOrderingZomatoSwiggy/Readme.md)     | Generate recommendations based on continuous streams of user activity, order activity, pricing and promo changes etc. |
| [Uber Driver Allocation](../../../0_HLDUseCasesProblems/DriverAllocationUberGoJek/Readme.md) | Select driver based on continuous streams of driver locations, user location etc.                                     |

# Features

| Feature                             | Remarks                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
|-------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Resilient Distributed Dataset (RDD) | [RDD](https://spark.apache.org/docs/latest/rdd-programming-guide.html) is a collection of elements partitioned across the nodes of the cluster that can be operated on in parallel.                                                                                                                                                                                                                                                                                                                                        |
| Directed acyclic graph (DAG)        | [Read more](../../WorkflowSchedulers/DAG.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| Accumulator                         | A simpler value of [Accumulable](https://spark.apache.org/docs/1.6.1/api/java/org/apache/spark/Accumulator.html) where the result type being accumulated is the same as the types of elements being merged, i.e. variables that are only "added" to through an associative operation and can therefore be efficiently supported in parallel. They can be used to implement counters (as in MapReduce) or sums. Spark natively supports accumulators of numeric value types, and programmers can add support for new types. |
| Spark UI                            | Apache Spark provides a suite of [web user interfaces (UIs)](https://spark.apache.org/docs/latest/web-ui.html) that you can use to monitor the status and resource consumption of your Spark cluster.                                                                                                                                                                                                                                                                                                                      |
| Spark Core                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| MLlib/GraphX                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| Spark Streaming                     | [Read more](SparkStreaming.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| Spark SQL                           | [Read more](SparkSQL.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| Associative Property                | [Associative property](https://www.splashlearn.com/math-vocabulary/addition/associative-property) is defined as, when more than two numbers are added or multiplied, the result remains the same, irrespective of how they are grouped.                                                                                                                                                                                                                                                                                    |

# Cluster Manager

| Cluster Manager                                                                    |
|------------------------------------------------------------------------------------|
| Standalone cluster manager (spark's own cluster manager)                           |
| [Hadoop Yarn](../../../9_Container&OrchestrationServices/ApacheYarn.md)            |
| [Apache Mesos](../../../9_Container&OrchestrationServices/ApacheMarathon&Mesos.md) |
| [Kubernates](../../../9_Container&OrchestrationServices/Kubernates/Readme.md)      |

[Read more](https://techvidvan.com/tutorials/spark-cluster-manager-yarn-mesos-and-standalone/)

# Data Sources

![](https://miro.medium.com/v2/resize:fit:1368/format:webp/1*kNBQi-vVM_J3vaqHS_HBWw.png)

# Apache Spark vs Others
- [Apache Spark vs Hadoop MapReduce vs Flink vs Storm](../SparkVsMapReduceVsFlinkVsStorm.md)

# References
- [Top Spark Interview Questions](https://www.interviewbit.com/spark-interview-questions/)
- [Spark vs Hadoop MapReduce](https://www.integrate.io/blog/apache-spark-vs-hadoop-mapreduce/)
- [Playing with 80 Million Amazon Product Review Ratings Using Apache Spark](https://minimaxir.com/2017/01/amazon-spark/)