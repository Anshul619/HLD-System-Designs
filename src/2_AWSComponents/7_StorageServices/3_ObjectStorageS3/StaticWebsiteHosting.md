# Hosting a static website using Amazon S3
- [You can use Amazon S3 to host a static website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html). 
- On a static website, individual webpages include [static content](../../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/StaticContentWithCDN.md). They might also contain client-side scripts.

# Virtually hosted URLs
- [Virtual hosting](https://docs.aws.amazon.com/AmazonS3/latest/userguide/VirtualHosting.html) is the practice of serving multiple websites from a single web server.
- One way to differentiate sites is by using the host name (bucket name) of the request.
- In a [virtual-hosted–style URL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/VirtualHosting.html), the bucket name is part of the domain name in the URL, which makes the URL easier to read, and more end-user friendly.

![](https://i0.wp.com/solidfish.com/wp-content/uploads/2018/01/Screen-Shot-2020-01-25-at-6.59.43-PM.png?resize=827%2C396&ssl=1)

[When you configure your bucket as a static website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteEndpoints.html), the website is available at the AWS Region-specific website endpoint of the bucket.
- s3-website dash (-) Region ‐ http://bucket-name.s3-website-Region.amazonaws.com
- s3-website dot (.) Region ‐ http://bucket-name.s3-website.Region.amazonaws.com

# Hosting a static website using Amazon S3 & CloudFront
- You can use [Amazon S3 to host a static website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html).
- [On a static website, individual webpages include static content](../../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/StaticContentWithCDN.md).
- They might also contain client-side scripts.

By contrast, a dynamic website relies on server-side processing, including server-side scripts, such as PHP, JSP, or ASP.NET.
- [Amazon S3]() does not support server-side scripting, but AWS has other resources for hosting dynamic websites.

![img.png](https://d2908q01vomqb2.cloudfront.net/cb4e5208b4cd87268b208e49452ed6e89a68e0b8/2017/11/06/1-1024x576.png)

[Read more](../../0_AWSDesigns/WPSiteCloudFront&S3.md)
