
# Amazon Simple Storage Service (S3)
- [Amazon S3](https://aws.amazon.com/s3/) is an object store, meaning it is a `higher layer data storage system`, essentially [it is a database "blob" storage](https://www.techopedia.com/definition/32166/blob-storage), storing data in an underlying simple database as an object.
- It's designed for `WRITE once READ many access`, perfect for `STATIC website` or `static media data like image, video, documents`.
- It's distributed and offers a very high level of redundancy i.e. [data is stored in 3 AZs within a specific region](../AWS-Global-Architecture-Region-AZ.md).
- Amazon S3 also offers integrations to help prevent breaches by way of `PCI-DSS, HIPAA/HITECH, and FedRAMP`.

# :star: Real world use cases of Amazon S3

## Deploy WordPress Site with Amazon Cloudfront & S3

![img.png](https://d2908q01vomqb2.cloudfront.net/cb4e5208b4cd87268b208e49452ed6e89a68e0b8/2017/11/06/1-1024x576.png)

[Read more](../0_AWSDesigns/WPSiteCloudFront&S3.md)

## Upload Image using Amazon S3 and Lambda

![img.png](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/assets/UploadImage-Lambda.drawio.png)

[Read more](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/README.md)

# Key Features of S3
- Object-based storage
- [Highly durable](../../1_HLDDesignComponents/0_SystemGlossaries/Durability.md)
- [Great for static assets](#star-real-world-use-cases-of-amazon-s3)
- [Infinitely scalable](../../1_HLDDesignComponents/0_SystemGlossaries/Scalability.md)
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

| Command     | Remarks |
|-------------|---------|
| Copy file   |         |
| Move file   |         |
| Sync folder |         |

[Read more](https://docs.aws.amazon.com/cli/latest/reference/s3/)