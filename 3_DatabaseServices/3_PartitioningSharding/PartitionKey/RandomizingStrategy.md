# Randomizing Strategy
- A [randomizing strategy](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-partition-key-sharding.html) in partition key, can greatly improve [write throughput](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-partition-key-sharding.html). 
- But it makes difficult to read a specific item because you don’t know which suffix value was used when writing the item.

# Example Partition key
- Partition key values like 2014-07-09.1, 2014-07-09.2, and so on, through 2014-07-09.200.