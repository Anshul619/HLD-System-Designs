
# Amazon DynomoDB

## Automated Storage Scaling
- There is no limit to the `amount of data you can store in a DynamoDB table`, and the service automatically allocates more storage, as you store more data using the DynamoDB write APIs.

## Provisioned Throughput
- When creating a table, simply specify how much request capacity you require?
- DynamoDB allocates dedicated resources to your table to meet your performance requirements, and automatically partitions data over a sufficient number of servers to meet your request capacity.
- If your throughput requirements change, simply update your table's request capacity using the AWS Management Console or the Amazon DynamoDB APIs.
- You are still able to achieve your prior throughput levels while scaling is underway.

## Fully Distributed, Shared Nothing Architecture
- Amazon DynamoDB scales horizontally and can seamlessly scale a single table over hundreds of servers.

# References
- [Amazon DynamoDB vs Kafka](https://stackshare.io/stackups/amazon-dynamodb-vs-kafka)