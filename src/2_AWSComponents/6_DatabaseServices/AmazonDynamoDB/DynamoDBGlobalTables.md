
# Amazon DynamoDB - Global Tables
- When you create a [DynamoDB global table](https://aws.amazon.com/dynamodb/global-tables/), it consists of multiple replica tables (one per AWS Region) that DynamoDB treats as a single unit.
- Every replica has the same table name and the same primary key schema.
- When an application writes data to a replica table in one Region, DynamoDB propagates the write to the other replica tables in the other AWS Regions automatically.

![img.png](https://d1.awsstatic.com/product-marketing/DynamoDB/DynamoDB_Global-Tables-01.dad2508b80e8b7c544fe1a94a2abd3f770b789da.png)

