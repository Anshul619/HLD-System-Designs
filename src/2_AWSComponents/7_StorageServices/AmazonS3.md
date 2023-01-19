
# Amazon Simple Storage Service (S3)
- [Amazon S3](https://aws.amazon.com/s3/) is an object store, meaning it is a `higher layer data storage system`, essentially [it is a database "blob" storage](https://www.techopedia.com/definition/32166/blob-storage), storing data in an underlying simple database as an object.
- It's designed for [WRITE once READ many access i.e. append-only data structure](../../1_HLDDesignComponents/0_SystemGlossaries/Database/AppendOnlyDataStructure.md), perfect for [Static content](../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/StaticContentWithCDN.md).
- It's distributed and offers a very high level of redundancy i.e. [data is stored in 3 AZs within a specific region](../AWS-Global-Architecture-Region-AZ.md).
- [Amazon S3]() also offers integrations to help prevent breaches by way of `PCI-DSS, HIPAA/HITECH, and FedRAMP`.

# Amazon S3 + Amazon CloudFront: A Match Made in the Cloud
- Instead of [directly accessing the S3 resource](https://aws.amazon.com/blogs/networking-and-content-delivery/amazon-s3-amazon-cloudfront-a-match-made-in-the-cloud/), we should use [CloudFront distribution](../1_NetworkingAndContentDelivery/AmazonCloudFront.md) in the middle (which acts as a [CDN](../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/CDNs.md))

![img.png](https://d2908q01vomqb2.cloudfront.net/5b384ce32d8cdef02bc3a139d4cac0a22bb029e8/2018/06/27/4-v-2.png)

# Hosting a static website using Amazon S3 & CloudFront
- You can use [Amazon S3 to host a static website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html). 
- [On a static website, individual webpages include static content](../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/StaticContentWithCDN.md).
- They might also contain client-side scripts.

By contrast, a dynamic website relies on server-side processing, including server-side scripts, such as PHP, JSP, or ASP.NET. 
- Amazon S3 does not support server-side scripting, but AWS has other resources for hosting dynamic websites. 

![img.png](https://d2908q01vomqb2.cloudfront.net/cb4e5208b4cd87268b208e49452ed6e89a68e0b8/2017/11/06/1-1024x576.png)

[Read more](../0_AWSDesigns/WPSiteCloudFront&S3.md)

## WebSite Endpoints

[When you configure your bucket as a static website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteEndpoints.html), the website is available at the AWS Region-specific website endpoint of the bucket. 
- s3-website dash (-) Region ‐ http://bucket-name.s3-website-Region.amazonaws.com
- s3-website dot (.) Region ‐ http://bucket-name.s3-website.Region.amazonaws.com

# :star: Real world use cases of Amazon S3

## Upload Image using Amazon S3 and Lambda

![img.png](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/assets/UploadImage-Lambda.drawio.png)

[Read more](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/README.md)

# Key Features of S3
- [Highly durable](../../1_HLDDesignComponents/0_SystemGlossaries/Database/Durability.md)
- [Great for static assets](../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/StaticContentWithCDN.md)
- [Infinitely scalable](../../1_HLDDesignComponents/0_SystemGlossaries/Scalability/DBScalability.md)
- Object-based storage
- Objects up to 5TB in size
- Encryption at rest & in transit

# Other Features

## Cross-Region Supported
- [Cross-region replication](../AWS-Global-Architecture-Region-AZ.md) is a bucket-level configuration that enables automatic, asynchronous copying of objects across buckets in different AWS Regions.

![img.png](https://acg-wordpress-content-production.s3.us-west-2.amazonaws.com/app/uploads/2021/01/1_SMawCtVcSkQ6ZaQMZ0Vd7Q.png)

## Automatic event on adding file in S3

[Granting permissions in S3 to publish event notification messages to a destination (Lambda, SQS, SNS etc.)](https://docs.aws.amazon.com/AmazonS3/latest/userguide/grant-destinations-permissions-to-s3.html)

# :star: [S3 vs Others](S3vsEFSvsEBS.md)

# S3 Cli

| Name        | Command                            | Remarks |
|-------------|------------------------------------|---------|
| Copy file   | -                                  |         |
| Move file   | -                                  |         |
| Sync folder | aws s3 sync <source> <destination> |         |

[Read more](https://docs.aws.amazon.com/cli/latest/reference/s3/)

# References
- [Append data to an S3 object](https://stackoverflow.com/questions/41783903/append-data-to-an-s3-object)