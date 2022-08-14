# [Amazon DynamoDB](https://aws.amazon.com/dynamodb/)
- Managed NoSQL database
- Provisioned Throughput
- Fast, predictable performance
- JSON Support
- Items up to 400 KB
- TTL
- Streams and triggers
- AWS Application auto scaling
- Global tables
- [DynamoDB Accelerator (DAX)](https://aws.amazon.com/dynamodb/dax/) provides caching capabilities for accessing data in microseconds.

## Automated Storage Scaling
- `There is no limit to the amount of data you can store in a DynamoDB table`, and the service automatically allocates more storage, as you store more data using the DynamoDB write APIs.

## Provisioned Throughput
- When creating a table, simply specify how much request capacity you require?
- DynamoDB allocates dedicated resources to your table to meet your performance requirements, and automatically partitions data over a sufficient number of servers to meet your request capacity.
- If your throughput requirements change, simply update your table's request capacity using the AWS Management Console or the Amazon DynamoDB APIs.
- You are still able to achieve your prior throughput levels while scaling is underway.

## Fully Distributed, Shared Nothing Architecture
- Amazon DynamoDB scales horizontally and can seamlessly scale a single table over hundreds of servers.

# [DynamoDB vs AeroSpike](https://www.quora.com/Who-is-using-Aerospike-and-for-what)
- If you are looking for a `managed service and are already in AWS`, but don't have low latency requirements Dynamo DB may be a good choice for you. 
- If you have `very low latency requirements` or are not using AWS today, Aerospike is likely to be the better choice.

## What are the consistency models in DynamoDB?

### Eventual Consistency Model
- First, there is the Eventual Consistency Model, which `maximizes your read throughput`. 
- However, it might not reflect the results of a recently completed write. 
- `Fortunately, all the copies of data usually reach consistency within a second`.

### Strong Consistency Model
- The second model is called the `Strong Consistency Model`. 
- This model has a delay in writing the data, but it guarantees that you will always see the updated data every time you read it.

# References
- [Amazon DynamoDB vs Kafka](https://stackshare.io/stackups/amazon-dynamodb-vs-kafka)