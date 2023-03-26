
# Bucket
- Bucket are permanent containers that hold objects.
- An Amazon S3 bucket is a versatile storage option with the ability to: host a static web site, retain version information on objects, and employ life-cycle management policies to balance version retention with bucket size and cost.

# Limitations with Bucket

| Limitation             | Description                                                                                                                                                                                                                                                                     |
|------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Bucket Owner           | Amazon S3 buckets are owned by the account that creates them and cannot be transferred to other accounts.                                                                                                                                                                       |
| Bucket names           | Bucket names are globally unique.  There can be no duplicate names within the entire S3 infrastructure.                                                                                                                                                                         |
| Bucket renaming        | Once created, you cannot change a bucket name.                                                                                                                                                                                                                                  |
| Permanent Entities     | Buckets are permanent storage entities and only removable when they are empty. <br/>- After deleting a bucket, the name becomes available for reuse by any account after 24 hours if not taken by another account.                                                              |
| Object storage limits  | There’s no limit to the number of objects you can store in a bucket. <br/>- You can store all of your objects in a single bucket, or organize them across several buckets. <br/>- However, you can't create a bucket from within another bucket, also known as nesting buckets. |
| Bucket creation limits | By default, you can create up to 100 buckets in each of your AWS accounts. <br/>- If you need additional buckets, you can increase your account bucket limit to a maximum of 1,000 buckets by submitting a service limit increase.                                              |

# Naming buckets

| Convention                                                                                                                                                |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------|
| Be unique across all of Amazon S3                                                                                                                         |
| Be between 3-63 characters long                                                                                                                           |
| Consist only of lowercase letters, numbers, dots (.), and hyphens (-)                                                                                     |
| Start with a lowercase letter or number                                                                                                                   |
| Not begin with xn-- (beginning February 2020)                                                                                                             |
| Not be formatted as an IP address. (i.e. 198.68.10.2)                                                                                                     |
| Use a dot (.) in the name only if the bucket's intended purpose is to host an Amazon S3 static website; otherwise do not use a dot (.) in the bucket name |

# Virtually hosted URLs
- [Virtual hosting](https://docs.aws.amazon.com/AmazonS3/latest/userguide/VirtualHosting.html) is the practice of serving multiple websites from a single web server. 
- One way to differentiate sites is by using the host name (bucket name) of the request. 
- In a [virtual-hosted–style URL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/VirtualHosting.html), the bucket name is part of the domain name in the URL, which makes the URL easier to read, and more end-user friendly.

![](https://i0.wp.com/solidfish.com/wp-content/uploads/2018/01/Screen-Shot-2020-01-25-at-6.59.43-PM.png?resize=827%2C396&ssl=1)

[When you configure your bucket as a static website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteEndpoints.html), the website is available at the AWS Region-specific website endpoint of the bucket.
- s3-website dash (-) Region ‐ http://bucket-name.s3-website-Region.amazonaws.com
- s3-website dot (.) Region ‐ http://bucket-name.s3-website.Region.amazonaws.com

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