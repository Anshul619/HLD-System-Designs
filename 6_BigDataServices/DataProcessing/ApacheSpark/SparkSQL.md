# Spark SQL
- [Spark SQL](https://spark.apache.org/docs/latest/sql-programming-guide.html) is a Spark module for structured data processing. 
- Unlike the basic [Spark RDD API](), the interfaces provided by Spark SQL provide Spark with more information about the structure of both the data and the computation being performed.
- Alternative to [Apache Hive](../../DataConsumption/ApacheHive.md)

# Data Frame
- A table or 2-D array like structure, in which each column contains measurements on one variable, and each row contains one case.

````java
import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.sql.Row
val schema = StructType( Array(
                 StructField("language", StringType,true),
                 StructField("users", StringType,true)
             ))
val rowRDD = rdd.map(attributes => Row(attributes._1, attributes._2))
val dfFromRDD3 = spark.createDataFrame(rowRDD,schema)
````