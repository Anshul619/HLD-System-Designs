
# [Amazon CloudFront](https://aws.amazon.com/cloudfront/)
- CloudFront helps to improve website speed and access to cloud-based data - `Securely deliver content with low latency and high transfer speeds`.
- CloudFront works as a [Global Content Delivery Service (CDN)](../../1_HLDDesignComponents/0_SystemGlossaries/CDNs.md) to deliver the content efficiently to the end users. 
- You’ll notice a significant increase in web page loading speed with this service. 
- It even pulls website static files from data centers throughout the world.
- Cloudfront is also used to [serve HTTPS requests](https://aws.amazon.com/premiumsupport/knowledge-center/cloudfront-https-requests-s3/) for the [Amazon S3 bucket](../7_StorageServices/AmazonS3.md).

## CloudFront Point-Of-Presence Footprint
- [Read more about Point of presence](../AWS-Global-Architecture-Region-AZ.md#points-of-presence)

![img.png](https://aws.amazon.com/blogs/networking-and-content-delivery/400-amazon-cloudfront-points-of-presence/)

## [Deploy WordPress Site with Amazon Cloudfront & S3](../0_AWSDesigns/WPSiteCloudFront&S3.md)

## What is geo-targeting in CloudFront?
- Geo-Targeting is a concept where `businesses can show personalized content to their audience` based on their geographic location without changing the URL. 
- This helps you create customized content for the audience of a specific geographical area, keeping their needs in the forefront.

# References
- [400 Amazon CloudFront Points of Presence](https://aws.amazon.com/blogs/networking-and-content-delivery/400-amazon-cloudfront-points-of-presence/)
