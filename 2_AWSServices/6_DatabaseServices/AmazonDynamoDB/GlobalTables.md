# Amazon DynamoDB - Global Tables
- When you create a [DynamoDB global table](https://aws.amazon.com/dynamodb/global-tables/), it consists of multiple replica tables (one per AWS Region) that DynamoDB treats as a single unit.

![](https://d1.awsstatic.com/product-marketing/DynamoDB/DynamoDB_Global-Tables-01.dad2508b80e8b7c544fe1a94a2abd3f770b789da.png)

| Feature                                                                                                                                                         | Description                                                                                                                                                                                                                                       |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Active-Active region configuration](https://aws.amazon.com/blogs/database/how-to-use-amazon-dynamodb-global-tables-to-power-multiregion-architectures/) | Every replica has the same table name and the same primary key schema. <br/>- When an application writes data to a replica table in one Region, DynamoDB propagates the write to the other replica tables in the other AWS Regions automatically. |
| [No failover concept](https://aws.amazon.com/blogs/database/how-to-use-amazon-dynamodb-global-tables-to-power-multiregion-architectures/)                       | Due to the active-active configuration of DynamoDB global tables, there is no concept of failover because the application writes to the table in its region, and then the data is replicated to keep the other regions' table in sync.            |

# How it works?

![](https://d1.awsstatic.com/product-marketing/DynamoDB/DynamoDB_Global-Tables-01.dad2508b80e8b7c544fe1a94a2abd3f770b789da.png)

[Read more](https://aws.amazon.com/dynamodb/global-tables/)