
# Dropbox Saves Millions by Building a Scalable Metadata Store (for AuditLog Data) on Amazon DynamoDB and Amazon S3
- [Read more](https://aws.amazon.com/solutions/case-studies/dropbox-dynamodb-case-study/?pg=dynamodb&sec=cs#dropbox)

## Building Hot and Cold Metadata Stores Using AWS Solutions
- [Amazon DynamoDB](../../6_DatabaseServices/AmazonDynamoDB.md) acts as the [hot storage layer](../../../1_HLDDesignComponents/0_SystemGlossaries/README.md#hot-storage), `ingesting audit logging data to six DynamoDB tables at 4,000–6,000 writes per second per table`. 
- Then each of these tables stores `50–80 GB daily`. 
- At the end of each day, the team offloads the metadata from these tables into [Amazon S3](../../7_StorageServices/AmazonS3.md) for permanent storage, after which the tables in [Amazon DynamoDB](../../6_DatabaseServices/AmazonDynamoDB.md) are deleted.
- We could scale `100–1,000 times on AWS` without designing the system ahead of time.

## Continuing to Create a Superior User Storage Experience
- The Alki team is exploring how it might use [Amazon EMR](../../4_ComputeServices/AmazonEMR.md) to `more efficiently offload the data from Amazon DynamoDB to Amazon S3`, a process that is currently handled by Dropbox’s own batch processing system. 

![img.png](DropboxAmazonDynamoDB.drawio.png)