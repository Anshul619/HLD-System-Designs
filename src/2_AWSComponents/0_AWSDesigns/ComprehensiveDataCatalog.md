# S3 Data Catalog
- You can create the [comprehensive data catalog](https://docs.aws.amazon.com/whitepapers/latest/building-data-lakes/data-cataloging.html) by using standard AWS services like [AWS Lambda](../3_ComputeServices/AWSLambda), [Amazon DynamoDB](../6_DatabaseServices/AmazonDynamoDB/Readme.md), and [Amazon OpenSearch](../6_DatabaseServices/AmazonOpenSearch.md).
- At a high level, you can use [Lambda triggers](../3_ComputeServices/AWSLambda) to populate [DynamoDB tables](../6_DatabaseServices/AmazonDynamoDB/Readme.md) with object names and metadata.
- When those objects are put into [Amazon S3]() then [Amazon ES](../6_DatabaseServices/AmazonOpenSearch.md) is used to search for specific assets, related metadata, and data classifications.

![](https://docs.aws.amazon.com/images/whitepapers/latest/building-data-lakes/images/storage-best-practices7.png)