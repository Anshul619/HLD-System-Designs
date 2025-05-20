# How DynamoDB works?
- They do consistent hashing to partition data
- They use virtual nodes to avoid hot shards
- They replicate data across many servers for durability
- They use sloppy quorum for data consistency
- They use vector clocks to find the latest data version
- They allow the client logic to resolve data conflicts
- They use hinted handoff to handle temporary failures
- They use Merkle trees to synchronize servers and handle permanent failures
- They use gossip protocol for service discovery and failure detection

# History of DynamoDB
> [How Amazon’s DynamoDB helped reinvent databases?](https://www.networkworld.com/article/2932313/how-amazon-s-dynamodb-helped-reinvent-databases.html)
> - Amazon DynamoDB is built on the principles of [Dynamo](../../../3_Databases/5_DatabaseInternals/DynamoStyleDatabases.md) and is a hosted service within the AWS infrastructure.
> - However, while [Dynamo](../../../3_Databases/5_DatabaseInternals/DynamoStyleDatabases.md) is based on [leaderless replication](../../../3_Databases/4_Consistency&Replication/Replication.md), DynamoDB uses [single-leader replication](../../../3_Databases/4_Consistency&Replication/Replication.md).