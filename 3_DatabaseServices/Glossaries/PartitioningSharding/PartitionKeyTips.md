# Partitioning Key Tips

![](https://d2908q01vomqb2.cloudfront.net/887309d048beef83ad3eabf2a79a64a389ab1c9f/2018/09/10/dynamodb-partition-key-1.gif)

[Read more](https://aws.amazon.com/blogs/database/choosing-the-right-dynamodb-partition-key/)

# Recommendations for partition keys

| Recommendation                  | Description                                                                                                                                                                                                                                                                                            |
|---------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Use high-cardinality attributes | These are attributes that have distinct values for each item, like emailid, employee_no, customerid, sessionid, orderid, and so on.                                                                                                                                                                    |
| Use composite attributes        | Try to combine more than one attribute to form a unique key, if that meets your access pattern. <br/>- For example, consider an orders table with `customerid#productid#countrycode` as the partition key and `order_date` as the sort key, where the symbol # is used to split different field.       |
| Add random numbers or digits    | A [randomizing strategy](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-partition-key-sharding.html) in partition key, can greatly improve write throughput. But it’s difficult to read a specific item because you don’t know which suffix value was used when writing the item. |
| Keep related data together      | Instead of distributing related data items across multiple tables, you should keep related items in your NoSQL system as close together as possible.                                                                                                                                                   |
| Cache the popular items         | Cache the popular items when there is a high volume of read traffic using [Redis](../../In-Memory-DB/Redis/Readme.md) or [Amazon DynamoDB Accelerator (DAX)](../../../2_AWSServices/6_DatabaseServices/AmazonDynamoDB/DynamoDBAccelerator.md).                                                         |

# Anti-patterns for partition keys

| Anti-pattern                                                                                              | Remarks                                                                                                                                                                |
|-----------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Use sequences or unique IDs generated by the DB engine as the partition key                               | Since sequences are not usually used for accessing the data (in most cases), hence it can lead to performance issues.                                                  |
| Using low-cardinality attributes like `Product_SKU` as the partition key and `Order_Date` as the sort key | This might lead to hot partition issues i.e. If one product is more popular, then the reads and writes for that partition key are high resulting in throttling issues. |