# Amazon Simple Storage Service (S3)
- [Amazon S3](https://aws.amazon.com/s3/) is an object store, meaning it is a `higher layer data storage system`, essentially [it is a database "blob" storage](https://www.techopedia.com/definition/32166/blob-storage), storing data in an underlying simple database as an object.
- It's designed for [WRITE once READ many access i.e. append-only data structure](../../1_HLDDesignComponents/0_SystemGlossaries/Database/AppendOnlyDataStructure.md), perfect for [Static content](../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/StaticContentWithCDN.md).
- It's distributed and offers a very high level of redundancy i.e. [data is stored in 3 AZs within a specific region](../AWS-Global-Architecture-Region-AZ.md).
- [Amazon S3]() also offers integrations to help prevent breaches by way of `PCI-DSS, HIPAA/HITECH, and FedRAMP`.

# Amazon S3 use cases

| Use Case               | Description                                                                                                                                                                                                |
|------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Backup and storage     | Amazon S3 is a natural place to back up files because it is highly redundant. As mentioned in the last unit, AWS stores your EBS snapshots in S3 to take advantage of its high availability.               |
| Media hosting          | Because you can store unlimited objects, and each individual object can be up to 5 TBs, Amazon S3 is an ideal location to host video, photo, and music uploads.                                            |
| Software delivery      | You can use Amazon S3 to host your software applications that customers can download.                                                                                                                      |
| Data lakes             | Amazon S3 is an optimal foundation for a data lake because of its virtually unlimited scalability. <br/>- You can increase storage from gigabytes to petabytes of content, paying only for what you use.   |
| Static websites        | You can configure your S3 bucket to host a static website of HTML, CSS, and client-side scripts.                                                                                                           |
| Static content         | Because of the limitless scaling, the support for large files, and the fact that you access any object over the web at any time, Amazon S3 is the perfect place to store static content.                   |

# :star: Real world use cases of Amazon S3

## :star: Amazon S3 + Amazon CloudFront: A Match Made in the Cloud
- Instead of [directly accessing the S3 resource](https://aws.amazon.com/blogs/networking-and-content-delivery/amazon-s3-amazon-cloudfront-a-match-made-in-the-cloud/), we should use [CloudFront distribution](../1_NetworkingAndContentDelivery/AmazonCloudFront.md) in the middle (which acts as a [CDN](../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/CDNs.md))

![img.png](https://d2908q01vomqb2.cloudfront.net/5b384ce32d8cdef02bc3a139d4cac0a22bb029e8/2018/06/27/4-v-2.png)

## Upload Image using Amazon S3 and Lambda

![img.png](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/assets/UploadImage-Lambda.drawio.png)

[Read more](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/README.md)

## Hosting a static website using Amazon S3 & CloudFront
- You can use [Amazon S3 to host a static website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html).
- [On a static website, individual webpages include static content](../../1_HLDDesignComponents/0_SystemGlossaries/CDNs/StaticContentWithCDN.md).
- They might also contain client-side scripts.

By contrast, a dynamic website relies on server-side processing, including server-side scripts, such as PHP, JSP, or ASP.NET.
- [Amazon S3]() does not support server-side scripting, but AWS has other resources for hosting dynamic websites.

![img.png](https://d2908q01vomqb2.cloudfront.net/cb4e5208b4cd87268b208e49452ed6e89a68e0b8/2017/11/06/1-1024x576.png)

[Read more](../0_AWSDesigns/WPSiteCloudFront&S3.md)

### WebSite Endpoints

[When you configure your bucket as a static website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteEndpoints.html), the website is available at the AWS Region-specific website endpoint of the bucket.
- s3-website dash (-) Region ‐ http://bucket-name.s3-website-Region.amazonaws.com
- s3-website dot (.) Region ‐ http://bucket-name.s3-website.Region.amazonaws.com

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

# Amazon S3 Storage Classes

| Name                                                                                                                                                           | Description                                                                                                                                                                                                                                                                                                                                                                                                                    |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Amazon S3 Glacier storage classes](https://aws.amazon.com/s3/storage-classes/glacier/)                                                                        | The [Amazon S3 Glacier](https://aws.amazon.com/s3/storage-classes/glacier/) storage classes are purpose-built for data archiving, providing you with the highest performance, most retrieval flexibility, and the lowest cost archive storage in the cloud.                                                                                                                                                                    |
| [Amazon S3 Glacier Deep Archive](https://aws.amazon.com/s3/storage-classes/)                                                                                                                                 | S3 Glacier Deep Archive is Amazon S3’s lowest-cost storage class and supports long-term retention and digital preservation for data that may be accessed once or twice in a year. <br/>- It is designed for customers—particularly those in highly-regulated industries, such as financial services, healthcare, and public sectors—that retain data sets for 7—10 years or longer to meet regulatory compliance requirements. |
| [S3 Standard-Infrequent Access (S3 Standard-IA)](https://aws.amazon.com/s3/storage-classes/)                                                                   | S3 Standard-IA is for data that is accessed less frequently, but requires rapid access when needed. S3 Standard-IA offers the high durability, high throughput, and low latency of S3 Standard, with a low per GB storage price and per GB retrieval charge.                                                                                                                                                                   |
| [S3 One Zone-Infrequent Access](https://aws.amazon.com/about-aws/whats-new/2018/04/announcing-s3-one-zone-infrequent-access-a-new-amazon-s3-storage-class/)    | S3 One Zone-Infrequent Access (S3 One Zone-IA; Z-IA) is a new storage class designed for customers who want a lower-cost option for infrequently accessed data, but do not require the multiple Availability Zone data resilience model of the S3 Standard and S3 Standard-Infrequent Access (S3 Standard-IA; S-IA) storage classes.                                                                                           |

# S3 bucket policy

````json
{
	"Version": "2012-10-17",
	"Statement": [{
		"Sid": "PublicRead",
		"Effect": "Allow",
		"Principal": "*",
		"Action": ["s3:GetObject"],
		"Resource": ["arn:aws:s3:::employeebucket/*"]
	}]
}
````

# References
- [Append data to an S3 object](https://stackoverflow.com/questions/41783903/append-data-to-an-s3-object)