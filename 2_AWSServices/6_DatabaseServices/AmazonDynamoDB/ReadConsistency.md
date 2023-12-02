# DynamoDB - Read Consistency
- DynamoDB supports [eventually consistent and strongly consistent reads](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadConsistency.html).

# :star: Eventually Consistent Reads
- [Eventually consistent](../../../3_DatabaseServices/4_Consistency&Replication/Readme.md) is the default read consistent model for all read operations.
- When you read data from a DynamoDB table, the response might not reflect the results of a recently completed write operation. 
- The response might include some stale data. 
- If you repeat your read request after a short time, the response should return the latest data.

# Strongly Consistent Reads
- When you request a [strongly consistent read](../../../3_DatabaseServices/4_Consistency&Replication/Readme.md), DynamoDB returns a response with the most up-to-date data, reflecting the updates from all prior write operations that were successful. 

However, this consistency comes with some disadvantages:
- A strongly consistent read might not be available if there is a network delay or outage. In this case, DynamoDB may return a server error (HTTP 500).
- Strongly consistent reads may have higher latency than eventually consistent reads.
- Strongly consistent reads are not supported on global secondary indexes.
- Strongly consistent reads use more throughput capacity than eventually consistent reads. 

# References
- [DynamoDB – Read Consistency](https://www.geeksforgeeks.org/dynamodb-read-consistency/)
- [Amazon - DynamoDB Strong consistent reads, Are they latest and how?](https://stackoverflow.com/questions/20870041/amazon-dynamodb-strong-consistent-reads-are-they-latest-and-how)

