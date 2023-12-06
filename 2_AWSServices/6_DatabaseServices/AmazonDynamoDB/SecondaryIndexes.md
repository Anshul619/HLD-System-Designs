# Secondary Indexes - DynamoDB
- Using a secondary index, you can query the data in the table using an alternate key and also against the primary key.

# Types of Secondary Indexes

|                    | :star: Global secondary index (GSI)           | Local Secondary Index (LSI)                                  |
|--------------------|-----------------------------------------------|--------------------------------------------------------------|
| Behaviour          | Different Partition & sort key as base table  | Same partition key, but different sort key as the base table |
| Data Spanning      | All data of base table, across all partitions | Specific partition of base table                             |
| Indexes Limitation | Upto 20 GSIs per table                        | Upto 10 LSIs per table                                       |
| Creation           | Anytime                                       | Only during table creation                                   |

[Read more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/SecondaryIndexes.html)

# Disadvantages of Secondary Indexes

| Disadvantage     | Remarks                                                                                  |
|------------------|------------------------------------------------------------------------------------------|
| Cost             | Additional storage and throughput cost                                                   |
| Consistency      | [Eventually consistent](../../../3_DatabaseServices/4_Consistency&Replication/Readme.md) |
| Management       | Create, maintain, update indexes                                                         |
| Write consistent | Hot keys                                                                                 |