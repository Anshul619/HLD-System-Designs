# Key Questions

| Title                 | Remarks                                                                                                                                                        |
|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Priority              | Do you have workloads with different priority levels? For example - Orders (Last 6 months vs Older orders for compliance)                                      |
| Related entities      | Do you have multiple entities that are accessed together?                                                                                                      |

# Tips/Patterns

| Tips                                                     | Description                                                                                                                                                                                                                                                                                          |
|----------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Data that is accessed together should be stored together | Instead of distributing related data items across multiple tables, you should keep related items in your NoSQL system as close together as possible.                                                                                                                                                 |
| Vertical partitioning                                    | Breaks items into multiple items using [partition key](3_PartitioningSharding/PartitionKey/Readme.md) & [sort key](3_PartitioningSharding/PartitionKey/SortKey.md).<br/>- [Read more](https://aws.amazon.com/blogs/database/use-vertical-partitioning-to-scale-data-efficiently-in-amazon-dynamodb/) |
| Use sort order                                           | All items with the same partition key value are stored together, in sorted order by [sort key value](3_PartitioningSharding/PartitionKey/SortKey.md).                                                                                                                                                |
| Distribute Queries                                       | Design [data keys](3_PartitioningSharding/PartitionKey/Readme.md) to distribute traffic evenly across partitions as much as possible, avoiding [hot spots](3_PartitioningSharding/PartitionKey/HotPartition.md).                                                                                     |
| Use secondary indexes                                    | By creating specific [secondary indexes](../2_AWSServices/6_DatabaseServices/AmazonDynamoDB/SecondaryIndexes.md), you can enable different queries than your main table can support, and that are still fast and relatively inexpensive.                                                             |

# Read more
- [AWS re:Invent 2023 - Data modeling core concepts for Amazon DynamoDB](https://www.youtube.com/watch?v=l-Urbf4BaWg)
- [AWS - NoSQL design for DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-general-nosql-design.html)
- [AWS - Modeling data with Amazon DynamoDB](https://docs.aws.amazon.com/prescriptive-guidance/latest/dynamodb-data-modeling/welcome.html)