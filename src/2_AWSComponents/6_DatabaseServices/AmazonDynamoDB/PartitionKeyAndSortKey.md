# Partitions/Sharding and data distribution
- Amazon DynamoDB scales [horizontally (using data partition/sharding)](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/PartioningSharding.md) and can seamlessly scale a single table over hundreds of servers.
- [Amazon DynamoDB stores data in partitions](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.Partitions.html).
- A partition is an allocation of storage for a table, backed by [solid state drives (SSDs)](https://www.techtarget.com/searchstorage/definition/SSD-solid-state-drive) and automatically replicated across multiple Availability Zones within an AWS Region.
- Partition management is handled entirely by DynamoDB — you never have to manage partitions yourself.
- Partition management occurs automatically in the background and is transparent to your applications.
- Your table remains available throughout and fully supports your provisioned throughput requirements.

# Data distribution: Partition key
- To write an item to the table
    - DynamoDB uses the value of the [partition key](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/PartioningSharding.md) as input to an internal hash function.
    - The output value from the hash function determines the partition in which the item will be stored.
- To read an item from the table
    - You must specify the [partition key value](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/PartioningSharding.md) for the item.
    - DynamoDB uses this value as input to its hash function, yielding the partition in which the item can be found.

![img.png](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/images/HowItWorksPartitionKey.png)

# Partition key and sort key
- Referred to as a [composite primary key](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.CoreComponents.html), this type of key is composed of two attributes. The first attribute is the partition key, and the second attribute is the sort key.
- All items with the same partition key value are stored together, in sorted order by sort key value.
- A composite primary key gives you additional flexibility when querying data.

For example,
- if you provide only the value for Artist, DynamoDB retrieves all the songs by that artist.
- To retrieve only a subset of songs by a particular artist, you can provide a value for Artist along with a range of values for SongTitle.

![](https://d2908q01vomqb2.cloudfront.net/887309d048beef83ad3eabf2a79a64a389ab1c9f/2018/09/10/dynamodb-partition-key-1.gif)

# Setup Steps - Partition, Sort keys

![img.png](assests/dynamodb_partition_key_setup.png)

# References
- [Choosing the Right DynamoDB Partition Key](https://aws.amazon.com/blogs/database/choosing-the-right-dynamodb-partition-key/)