# S3 Transfer Acceleration
- [Amazon S3 Transfer Acceleration](https://aws.amazon.com/s3/transfer-acceleration/) can speed up content transfers to and from Amazon S3 by as much as 50-500% for long-distance transfer of larger objects.
- Transfer Acceleration takes advantage of [Amazon CloudFront’s globally distributed edge locations](../../../1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonCloudFront.md). 
- As the data arrives at an edge location, data is routed to Amazon S3 over an optimized network path.

# Pricing
- With S3TA, [you pay only for transfers that are accelerated](https://aws.amazon.com/s3/transfer-acceleration/).
- There are no S3 data transfer charges when data is transferred in from the internet.