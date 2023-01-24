# Amazon DynamoDB
- [DynamoDB](https://aws.amazon.com/dynamodb/) is a fully managed [NoSQL](../../../1_HLDDesignComponents/3_DatabaseComponents) database service. 
- DynamoDB is a key-value and document database. 
- Every record in a DynamoDB database can be considered as a map of attributes and values with a primary key to retrieve the record.
- All data items are stored on [Solid State Drives (SSDs)](https://www.techtarget.com/searchstorage/definition/SSD-solid-state-drive), and are replicated across [3 Availability Zones](../../AWS-Global-Architecture-Region-AZ.md) for [high availability](../../../1_HLDDesignComponents/0_SystemGlossaries/Reliability/HighAvailability.md) and [durability](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/Durability.md). 
- With DynamoDB, you can offload the administrative burden of operating and scaling a highly available distributed database cluster, while paying a low price for only what you use.

# Amazon DynamoDB & Dynamo Systems
- Amazon DynamoDB is built on the principles of [Dynamo](../../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/DynamoStyleDatabases.md) and is a hosted service within the AWS infrastructure. 
- However, while [Dynamo](../../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/DynamoStyleDatabases.md) is based on [leaderless replication](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/ReplicationAndDataConsistency.md), DynamoDB uses [single-leader replication](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/ReplicationAndDataConsistency.md).

## :star: Real world use cases of DynamoDB
- [Twillo - Send Message API Design](../../../3_HLDDesignProblems/TwilloSendMessageAPI)

## Key Features

| Feature                                                                                                                                                                                                                   | Remarks                                                           |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------|
| Provisioned Throughput                                                                                                                                                                                                    | Dial up or down provisioned read/write capacity.                  |
| Fast, predictable performance                                                                                                                                                                                             | Avg single-digit millisecond latency, 1000s of records per second |
| [Fault tolerant](../../../1_HLDDesignComponents/0_SystemGlossaries/Reliability/FaultTolerance&DisasterRecovery.md), [Highly Available](../../../1_HLDDesignComponents/0_SystemGlossaries/Reliability/HighAvailability.md) | Data replicated across Availability Zones                         |
| [Partitions and data distribution](#partitionssharding-and-data-distribution)                                                                                                                                             | -                                                                 |
| [DynamoDB Global tables](DynamoDBGlobalTables.md)                                                                                                                                                                         | -                                                                 |
| [DynamoDB Accelerator (DAX)](DynamoDBAccelerator.md) provides caching capabilities for accessing data.                                                                                                                    | -                                                                 |
| [PartiQL - a SQL-compatible query language for Amazon DynamoDB](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ql-reference.html)                                                                       | -                                                                 |
| [Time to Live (TTL) supported for the data](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/TTL.html)                                                                                                    | -                                                                 |
| JSON Support                                                                                                                                                                                                              | -                                                                 |
| Items size up to 400 KB                                                                                                                                                                                                   | -                                                                 |
| Monitoring                                                                                                                                                                                                                | Integrated with Cloudwatch                                        |
| Both [Local & Global Secondary Indexing](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/Indexing.md) supported                                                                                                | -                                                                 |

## Automated Storage Scaling
- There is no limit to the amount of data you can store in a DynamoDB table, and the service automatically allocates more storage, as you store more data using the DynamoDB write APIs.

## Provisioned Throughput
- When creating a table, simply specify how much request capacity you require? ([OnDemand or specific number](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.requests))
- DynamoDB allocates dedicated resources to your table to meet your performance requirements, and automatically partitions data over a sufficient number of servers to meet your request capacity.
- If your throughput requirements change, simply update your table's request capacity using the [AWS Management Console](https://aws.amazon.com/console/) or the [Amazon DynamoDB APIs](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.API.html).
- You are still able to achieve your prior throughput levels while scaling is underway.

## Consistency Models
- [Eventual Consistency Model](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/ReplicationAndDataConsistency.md#consistency-patterns)
- [Strong Consistency Model](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/ReplicationAndDataConsistency.md#consistency-patterns)

## Data types supported in DynamoDB

DynamoDB supports a large set of data types for table attributes. 

| Data Type   | Description                                                                                         |
|-------------|-----------------------------------------------------------------------------------------------------|
| Scalar      | These types represent a single value, and include number, string, binary, Boolean, and null.        |
| Document    | These types represent a complex structure possessing nested attributes, and include lists and maps. |
| Set         | These types represent multiple scalars, and include string sets, number sets, and binary sets.      |

## Partitions/Sharding and data distribution
- Amazon DynamoDB scales [horizontally (using data partition/sharding)](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/PartioningSharding.md) and can seamlessly scale a single table over hundreds of servers.
- [Amazon DynamoDB stores data in partitions](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.Partitions.html). 
- A partition is an allocation of storage for a table, backed by [solid state drives (SSDs)](https://www.techtarget.com/searchstorage/definition/SSD-solid-state-drive) and automatically replicated across multiple Availability Zones within an AWS Region. 
- Partition management is handled entirely by DynamoDB — you never have to manage partitions yourself.
- Partition management occurs automatically in the background and is transparent to your applications. 
- Your table remains available throughout and fully supports your provisioned throughput requirements.

### Data distribution: Partition key
- To write an item to the table
  - DynamoDB uses the value of the [partition key](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/PartioningSharding.md) as input to an internal hash function. 
  - The output value from the hash function determines the partition in which the item will be stored.
- To read an item from the table
  - You must specify the [partition key value](../../../1_HLDDesignComponents/0_SystemGlossaries/Database/PartioningSharding.md) for the item. 
  - DynamoDB uses this value as input to its hash function, yielding the partition in which the item can be found.

![img.png](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/images/HowItWorksPartitionKey.png)

### Partition key and sort key
- Referred to as a [composite primary key](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.CoreComponents.html), this type of key is composed of two attributes. The first attribute is the partition key, and the second attribute is the sort key.
- All items with the same partition key value are stored together, in sorted order by sort key value.
- A composite primary key gives you additional flexibility when querying data. 

For example, 
- if you provide only the value for Artist, DynamoDB retrieves all of the songs by that artist. 
- To retrieve only a subset of songs by a particular artist, you can provide a value for Artist along with a range of values for SongTitle.

### Setup Steps - Partition, Sort keys

![img.png](assests/dynamodb_partition_key_setup.png)

## :thumbsdown: What are disadvantages of DynamoDB?
- Deployable only on AWS and cannot be installed on individual desktops/servers
- No server side scripts
- General disadvantages of NoSQL
  - Querying data is extremely limited
  - Table Joins are impossible
  - No triggers
  - No foreign key concept to refer to other table items

# References
- [Top DynamoDB Interview Questions](https://www.javainuse.com/misc/dynamodb-interview-questions)
- [20 DynamoDB Interview Questions and Answers](https://climbtheladder.com/dynamodb-interview-questions/)
- [What I’ve Learned From Using AWS DynamoDB in Production for More Than 3 Years?](https://medium.com/aws-tip/what-ive-learned-from-using-aws-dynamodb-in-production-for-more-than-3-years-49a077886b5c)