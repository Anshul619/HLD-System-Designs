# Read Consistency - DynamoDB
- DynamoDB supports [eventually consistent and strongly consistent reads](../../../3_Databases/4_Consistency-Replication/Readme.md).

|                | :star: Eventually Consistent Reads | Strongly Consistent Reads        |
|----------------|------------------------------------|----------------------------------|
| Default        | Yes                                | No                               |
| Data Freshness | May include stale data             | Most-up-data                     |
| RCU            | 1 RCU                              | 2 RCU                            |
| Read Behavior  | Reads from 1 copy of partition     | Reads from 2 copies of partition |
| Recommended    | Yes                                | No                               |

[Read more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadConsistency.html)

# Disadvantages with strong consistency
- A strongly consistent read might not be available if there is a network delay or outage. In this case, DynamoDB may return a server error (HTTP 500).
- Strongly consistent reads may have higher latency than eventually consistent reads.
- Strongly consistent reads are not supported on [global secondary indexes](SecondaryIndexes.md).
- Strongly consistent reads use more throughput capacity than eventually consistent reads. 

# References
- [DynamoDB – Read Consistency](https://www.geeksforgeeks.org/dynamodb-read-consistency/)
- [Amazon - DynamoDB Strong consistent reads, Are they latest and how?](https://stackoverflow.com/questions/20870041/amazon-dynamodb-strong-consistent-reads-are-they-latest-and-how)

