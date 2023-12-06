# DynamoDB Accelerator (DAX)
- [DynamoDB Accelerator (DAX)](https://aws.amazon.com/dynamodb/dax/) provides caching capabilities for accessing data in microseconds (10 times performance improvement).
- Amazon DynamoDB Accelerator (DAX) is a fully-managed, highly-available, in-memory caching service for [DynamoDB](Readme.md).

![](https://docs.aws.amazon.com/images/amazondynamodb/latest/developerguide/images/dax_high_level.png)

# Integration with DynamoDB
- DAX is tightly integrated with [DynamoDB](Readme.md) - you simply provision a DAX cluster, use the DAX client SDK to point your existing [DynamoDB API calls](Readme.md) at the DAX cluster, and let DAX handle the rest. 
- Because DAX is API-compatible with [DynamoDB](Readme.md), you don't have to make any functional application code changes. 
- DAX is used to natively cache [DynamoDB](Readme.md) reads.

# Use Cases
- Real-time bidding
- Social gaming 
- Trading applications

# Types

| Type        |
|-------------|
| Item Cache  |
| Query Cache |


# References
- [Swiggy - Degraded Performance using DAX](https://bytes.swiggy.com/segmentation-at-swiggy-part-3-final-part-b740f7a3697d)