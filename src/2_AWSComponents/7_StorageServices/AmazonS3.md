
# Amazon S3
- [Amazon S3](https://aws.amazon.com/s3/) is an object store, meaning it is a `higher layer data storage system`, essentially `it is a database "blob" storage`, storing data in an underlying `simple database as an object`.
- It's designed for `WRITE once READ many access`, perfect for `static website` or `media data like image, video, documents`.
- It's distributed and offers a very high level of redundancy ( like `data is stored in 3 AZs within a specific region` ).
- Amazon S3 also offers integrations to help prevent breaches by way of `PCI-DSS, HIPAA/HITECH, and FedRAMP`.

# Features

## Cross-Region Supported
- Cross-region replication is a bucket-level configuration that enables automatic, asynchronous copying of objects across buckets in different AWS Regions.

![img.png](https://acg-wordpress-content-production.s3.us-west-2.amazonaws.com/app/uploads/2021/01/1_SMawCtVcSkQ6ZaQMZ0Vd7Q.png)

## Automatic event on adding file  
- [Granting permissions in S3 to publish event notification messages to a destination (Lambda, SQS, SNS etc.)](https://docs.aws.amazon.com/AmazonS3/latest/userguide/grant-destinations-permissions-to-s3.html)

# :star: Real world use cases of Amazon S3

## Deploy WordPress Site with Amazon Cloudfront & S3

![img.png](https://d2908q01vomqb2.cloudfront.net/cb4e5208b4cd87268b208e49452ed6e89a68e0b8/2017/11/06/1-1024x576.png)

[Read more](../0_AWSDesigns/WPSiteCloudFront&S3.md)

## Upload Image using Amazon S3 and Lambda

![img.png](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/assets/UploadImage-Lambda.drawio.png)

[Read more](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/README.md)

# [S3 vs Others](S3vsEFSvsEBS.md)

# [S3 Cli](https://docs.aws.amazon.com/cli/latest/reference/s3/)

## Copy file
## Move file
## Sync folder
