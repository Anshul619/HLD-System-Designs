
# Design Multi-Region Active-Active Architecture On AWS

![img.png](AWS-AZ-Region-HA.drawio.png)

# Why bother with multi-region architectures?

## Improve latency for end-users
- [Amazon CloudFront](../../1_NetworkingAndContentDelivery/AmazonCloudFront.md) can be used to speed up delivery static content (static files such as site code, HTML/CSS/JS, photos, and videos etc.) to end-users across the globe.
- Using a globally-distributed network of caching servers, static content is served as if it was local to consumers, thus improving the delivery of that static content.
- However the multi-region setup might be needed for dynamic calls.
  - For example, if you have users in Europe but your backend is in US or Australia, the added latency is respectively approximately 140ms and 300ms. 
  - Those delays would be unacceptable to start with for many popular games, banking requirements, or interactive applications.
![img.png](https://acg-wordpress-content-production.s3.us-west-2.amazonaws.com/app/uploads/2021/01/1_-rGhWmNF23-Hfx4uQWR5LA.png)

## Disaster Recovery
- Multi-Region setup helps in the [disaster recovery](../../../1_HLDDesignComponents/0_SystemGlossaries/FaultTolerance&DisasterRecovery.md#disaster-recoveryhttpsenwikipediaorgwikidisaster_recovery).

## Business Requirements - GDPR, Localization

# How to build multi-region active-active architecture in AWS

## Reliable data replication
- [Eventual consistency](../../../1_HLDDesignComponents/0_SystemGlossaries/ReplicationAndDataConsistency.md#eventual-consistency-async-replication) would be done, as databases are spread across multi-regions. ( 
- And we need to maintain highly availability and partition tolerance in [CAP theorem](../../../1_HLDDesignComponents/0_SystemGlossaries/CAPTheorem.md).

## Global network infrastructure
- [AWS Regions](../../AWS-Global-Architecture-Region-AZ.md) are connected to a private global network backbone, which provides lower cost and more consistent cross-region network latency when compared with the public internet.

## Stateless applications
- [Read more](../../../1_HLDDesignComponents/0_SystemGlossaries/README.md#stateless-protocol)

## Use local resources and avoid cross-regional calls
Amazon Services with [Cross-Region](../../AWS-Global-Architecture-Region-AZ.md) support, should be used like,
- [Amazon S3](../../7_StorageServices/AmazonS3.md#cross-region-supported)
- [Amazon Aurora Global Database](../../6_DatabaseServices/AmazonAurora/AuroraGlobalDatabase.md)
- [Amazon DynamoDB Global Tables](../../6_DatabaseServices/AmazonDynamoDB.md#amazon-dynamodb-global-tableshttpsawsamazoncomdynamodbglobal-tables)

## DNS routing using Amazon Route53
- [Read more](../../1_NetworkingAndContentDelivery/AmazonRoute53.md)

# References
- [How to build a multi-region active-active architecture on AWS?](https://acloudguru.com/blog/engineering/why-and-how-do-we-build-a-multi-region-active-active-architecture)
