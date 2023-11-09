# AWS Outposts Rack
- [AWS Outposts rack](https://aws.amazon.com/outposts/rack/) is a fully managed service that extends AWS infrastructure, services, APIs, and tools on premises for a truly consistent hybrid experience.

![](https://d1.awsstatic.com/Products/product-name/Outposts/AWS-Outposts-rack_HIW%402x.6cdd2cc235edbaefe3a54b10c8252fb547cf61a0.png)

# How AWS Outposts work?

![](https://docs.aws.amazon.com/images/outposts/latest/userguide/images/outpost-networking-components.png)

[Read more](https://docs.aws.amazon.com/outposts/latest/userguide/how-outposts-works.html)

# Local Gateways
- One local gateway per Outpost.
- Provides a target in your VPC route tables for on-permises destined traffic.
- Performs NAT for instances that have been assigned addresses from your customer-owned IP pool.

# Available Storages in AWS Outposts
- [Amazon EBS](../7_StorageServices/1_BlockStorageTypes/AmazonEBS/Readme.md)
- [Amazon S3](../7_StorageServices/3_ObjectStorageS3/Readme.md)