# Hosting a static website using Amazon S3
- [You can use Amazon S3 to host a static website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html). 
- On a static website, individual webpages include [static content](../../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/StaticContentWithCDN.md). 
- They might also contain client-side scripts.

![img.png](https://d2908q01vomqb2.cloudfront.net/cb4e5208b4cd87268b208e49452ed6e89a68e0b8/2017/11/06/1-1024x576.png)

[Read more](../../0_AWSDesigns/WPSiteCloudFront&S3.md)

# Site endpoints

| Type            | [Virtual-hosted–style URL / Endpoint](https://docs.aws.amazon.com/AmazonS3/latest/userguide/VirtualHosting.html) | Format                     |
|-----------------|------------------------------------------------------------------------------------------------------------------|----------------------------|
| Region Specific | http://bucket-name.s3-website-Region.amazonaws.com                                                               | s3-website dash (-) Region |
| Region Specific | http://bucket-name.s3-website.Region.amazonaws.com                                                               | s3-website dot (.) Region  |

