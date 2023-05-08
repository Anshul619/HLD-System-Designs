# Deploy WordPress Site with Amazon CloudFront & S3
- Step 1: Upload your content to [a static website enabled Amazon S3 bucket](../7_StorageServices/3_ObjectStorageS3/Readme.md) and grant object permissions.
- Step 2: Create a [CloudFront distribution](../1_NetworkingAndContentDelivery/AmazonCloudFront.md).
- Step 3: Access your content through [CloudFront](../1_NetworkingAndContentDelivery/AmazonCloudFront.md).

![img.png](https://d2908q01vomqb2.cloudfront.net/cb4e5208b4cd87268b208e49452ed6e89a68e0b8/2017/11/06/1-1024x576.png)

# Hosting a static website using Amazon S3 & CloudFront

We can use [Amazon S3 to host a static website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html).
- [On a static website, individual webpages include static content](../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/StaticContentWithCDN.md). 
- They might also contain client-side scripts.

By contrast, a dynamic website relies on server-side processing, including server-side scripts, such as PHP, JSP, or ASP.NET.
- Amazon S3 does not support server-side scripting, but AWS has other resources for hosting dynamic websites.

# References
- [Deploy WordPress Site with Amazon CloudFront & S3](https://aws.amazon.com/blogs/startups/how-to-accelerate-your-wordpress-site-with-amazon-cloudfront/)
- [Getting started with the AWS for WordPress plugin](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/WordPressPlugIn.html)