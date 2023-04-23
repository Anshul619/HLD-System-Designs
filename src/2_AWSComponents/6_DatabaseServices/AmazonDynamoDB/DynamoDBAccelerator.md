
# DynamoDB Accelerator (DAX)
- [DynamoDB Accelerator (DAX)](https://aws.amazon.com/dynamodb/dax/) provides caching capabilities for accessing data in microseconds.
- Amazon DynamoDB Accelerator (DAX) is a fully-managed, highly-available, in-memory caching service for DynamoDB.

![](https://docs.aws.amazon.com/images/amazondynamodb/latest/developerguide/images/dax_high_level.png)

# Use Cases
- If your application is really read heavy and requires even lower latency than DynamoDB offers, you can add Amazon DynamoDB Accelerator, called DAX. 
- DAX is an in-memory cache. 
- Things like real-time bidding, social gaming, and trading applications are good candidates for using DAX.