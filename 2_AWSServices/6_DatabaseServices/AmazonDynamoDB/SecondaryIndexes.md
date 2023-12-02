# Secondary Indexes
- Using a secondary index, you can query the data in the table using an alternate key and also against the primary key.
- Both [local and global secondary indexes](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/SecondaryIndexes.html) are supported in DynamoDB.

# :star: Global secondary index (GSI)
- An index with a partition key and a sort key that can be different from those on the base table. 
- A [global secondary index](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.html) is considered "global" because queries on the index can span all of the data in the base table, across all partitions. 
- A global secondary index has no size limitations and has its own provisioned throughput settings for read and write activity that are separate from those of the table.
- These are [eventually consistent](../../../3_DatabaseServices/4_Consistency&Replication/Readme.md), and are not guaranteed to return correct results.

# Local Secondary Index
- An index that has the same partition key as the base table, but a different sort key.
- A [local secondary index](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-indexes-general.html) is "local" in the sense that every partition of a local secondary index is scoped to a base table partition that has the same partition key value.
- As a result, the total size of indexed items for any one partition key value can't exceed 10 GB.
- Also, a local secondary index shares provisioned throughput settings for read and write activity with the table it is indexing.

# Disadvantages of secondary indexes

|                  | Remarks                                                                                          |
|------------------|--------------------------------------------------------------------------------------------------|
| Cost             | Additional storage and throughput cost                                                           |
| Write consistent | Hot keys                                                                                         |
| Consistency      | GSI are [eventually consistent](../../../3_DatabaseServices/4_Consistency&Replication/Readme.md) |
| Management       | Create, maintain, update indexes                                                                 |