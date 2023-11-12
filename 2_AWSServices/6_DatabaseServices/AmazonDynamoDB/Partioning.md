# Partitions and data distribution
- [Amazon DynamoDB](https://aws.amazon.com/blogs/database/choosing-the-right-dynamodb-partition-key/) scales [horizontally (using data partition/sharding)](../../../3_DatabaseServices/Glossaries/PartitioningSharding/Readme.md) and can seamlessly scale a single table over hundreds of servers.
- DynamoDB is [schemaless](https://aws.amazon.com/blogs/database/should-your-dynamodb-table-be-normalized-or-denormalized/): When you create a table in DynamoDB, you specify only the primary key attributes, such as partition key or partition key and sort key. You do not define any other attributes in advance.

![](assests/dynamodb_partition_key_setup.png)

# Key Concepts

| Concept       | Description                                                                                                                                                                                                                                 |
|---------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Partition     | A partition is an allocation of storage for a table, backed by [solid state drives (SSDs)](../../../11_FileStorageServicesHDFS/StorageOptions.md) and automatically replicated across multiple Availability Zones within an AWS Region.     |
| Partition key | DynamoDB uses the value of the [partition key](../../../3_DatabaseServices/Glossaries/PartitioningSharding/PartitionKeyTips.md) as input to an internal hash function. <br/>- Hence it must be specified in both read and write operations. |
| Primary Key   | When you create a table, in addition to the table name, you must specify the primary key of the table. <br/>- The primary key uniquely identifies each item in the table, so that no two items can have the same key.                       |

# Types of primary key

| Primary Key type           | Description                                                                                                                                                                                                                                                                                                                                              |
|----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Partition key only         | We can only use partition key as primary key (must be specified in both read and write operations).                                                                                                                                                                                                                                                      |
| Partition key and sort key | Referred to as a [composite primary key](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.CoreComponents.html), this type of key is composed of two attributes.<br/>- All items with the same partition key value are stored together, in sorted order by sort key value.<br/>- This helps in querying items more efficiently. |

# Key Stats

| Stat                     | Value              |
|--------------------------|--------------------|
| Partition size limit     | 10 GB              |
| Partition capacity limit | 3000 RCU, 1000 WCU |

# References
- [Choosing the Right DynamoDB Partition Key](https://aws.amazon.com/blogs/database/choosing-the-right-dynamodb-partition-key/)
- [Best practices for designing and using partition keys effectively](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-partition-key-design.html#bp-partition-key-partitions-adaptive)
- [NoSQL design for DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-general-nosql-design.html)
- [Choosing the right number of shards for your large-scale Amazon DynamoDB table](https://aws.amazon.com/blogs/database/choosing-the-right-number-of-shards-for-your-large-scale-amazon-dynamodb-table/)
- [A Deep Dive into DynamoDB Partitions](https://shinesolutions.com/2016/06/27/a-deep-dive-into-dynamodb-partitions/)
- [Everything you need to know about DynamoDB Partitions](https://www.alexdebrie.com/posts/dynamodb-partitions/)