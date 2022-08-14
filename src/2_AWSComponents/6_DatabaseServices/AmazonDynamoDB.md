# [Amazon DynamoDB](https://aws.amazon.com/dynamodb/)
- Fully managed NoSQL database service. 
- All data items are stored on Solid State Drives (SSDs), and are replicated across 3 Availability Zones for [high availability](../../1_HLDDesignComponents/0_SystemGlossaries/HighAvailability.md) and [durability](../../1_HLDDesignComponents/0_SystemGlossaries/Durability.md). 
- With DynamoDB, you can offload the administrative burden of operating and scaling a highly available distributed database cluster, while paying a low price for only what you use.

## Key Features
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
- When creating a table, simply specify how much request capacity you require.
- DynamoDB allocates dedicated resources to your table to meet your performance requirements, and automatically partitions data over a sufficient number of servers to meet your request capacity.
- If your throughput requirements change, simply update your table's request capacity using the AWS Management Console or the Amazon DynamoDB APIs.
- You are still able to achieve your prior throughput levels while scaling is underway.

## Fully Distributed, Shared Nothing Architecture
- Amazon DynamoDB scales horizontally and can seamlessly scale a single table over hundreds of servers.

## Consistency Models
- [Eventual Consistency Model](../../1_HLDDesignComponents/0_SystemGlossaries/ReplicationAndDataConsistency.md#consistency-patterns)
- [Strong Consistency Model](../../1_HLDDesignComponents/0_SystemGlossaries/ReplicationAndDataConsistency.md#consistency-patterns)