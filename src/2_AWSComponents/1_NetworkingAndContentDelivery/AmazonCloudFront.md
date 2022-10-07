# Amazon CloudFront
- [Amazon CloudFront](https://aws.amazon.com/cloudfront/) helps to improve website speed and access to cloud-based static data - [Securely deliver content with low latency and high transfer speeds](../../1_HLDDesignComponents/0_SystemGlossaries/LatencyThroughput.md).
- CloudFront works as a [Global Content Delivery Service (CDN)](../../1_HLDDesignComponents/0_SystemGlossaries/CDNs.md) to deliver the content efficiently to the end users.
- CloudFront is perfect for `Static content like WebSite, Media, Image, Video, Songs, Documents etc.` ( stored in [Amazon S3 bucket](../7_StorageServices/AmazonS3.md), for example)

# :star: Real world use cases of Amazon CloudFront

## Design Scalable System on AWS

![img.png](../0_AWSDesigns/DesignScalableSystemWithRDMS/assets/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)

[Read more](../0_AWSDesigns/DesignScalableSystemWithRDMS/README.md)

## Upload Image using Amazon S3 and Lambda

![img.png](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/assets/UploadImage-Lambda.drawio.png)

[Read more](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/README.md)

## Deploy WordPress Site with Amazon CloudFront & S3

![img.png](https://d2908q01vomqb2.cloudfront.net/cb4e5208b4cd87268b208e49452ed6e89a68e0b8/2017/11/06/1-1024x576.png)

[Read more](../0_AWSDesigns/WPSiteCloudFront&S3.md)

# Key Features of CloudFront
- [Cache content for faster delivery (i.e. CDN)](../../1_HLDDesignComponents/0_SystemGlossaries/CDNs.md)
- Lower Load upon origin
- Static content ( like WebSite, Media, Image, Video, Songs, Documents etc.)
- Streaming audio or video
- Custom SSL certificates
- Short time-to-live (TTL) (as little as 0 seconds, for dynamic content)
- Optimized for AWS

# CloudFront Point-Of-Presence Footprint
- [Read more about Point of presence](../AWS-Global-Architecture-Region-AZ.md#points-of-presence)

![img.png](https://d2908q01vomqb2.cloudfront.net/5b384ce32d8cdef02bc3a139d4cac0a22bb029e8/2022/06/17/CloudFront_400-1024x580.png)

# What is geo-targeting in CloudFront?
- [Geo-Targeting](https://aws.amazon.com/blogs/networking-and-content-delivery/leverage-amazon-cloudfront-geolocation-headers-for-state-level-geo-targeting/) is a concept where `businesses can show personalized content to their audience` based on their geographic location without changing the URL. 
- This helps you create customized content for the audience of a specific geographical area, keeping their needs in the forefront.

# References
- [How do I use CloudFront to serve HTTPS requests for my Amazon S3 bucket?](https://aws.amazon.com/premiumsupport/knowledge-center/cloudfront-https-requests-s3/)
- [400 Amazon CloudFront Points of Presence](https://aws.amazon.com/blogs/networking-and-content-delivery/400-amazon-cloudfront-points-of-presence/)
- [Serving Dynamic Websites with Amazon CloudFront](https://blog.shikisoft.com/serving-dynamic-website-with-amazon-cloudfront/)