# Global Secondary Indexes
- You can create one or more secondary indexes on a table.
- Using a secondary index, you can query the data in the table using an alternate key and also against the primary key.<br/>
- Both [local and global secondary indexes](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/SecondaryIndexes.html) are supported in DynamoDB.
- [Global secondary indexes](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/GSI.html) in DynamoDB are [eventually consistent](../../../3_DatabaseServices/4_Consistency&Replication/Readme.md), and are not guaranteed to return correct results.
- You can have up to 20 local or global secondary indexes.

# Disadvantages

|                  | Remarks                                                                                          |
|------------------|--------------------------------------------------------------------------------------------------|
| Cost             | Additional storage and throughput cost                                                           |
| Write consistent | Hot keys                                                                                         |
| Consistency      | GSI are [eventually consistent](../../../3_DatabaseServices/4_Consistency&Replication/Readme.md) |
| Management       | Create, maintain, update indexes                                                                 |