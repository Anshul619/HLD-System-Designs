
# Amazon S3 Bucket
- An [Amazon S3 Bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingBucket.html) are permanent containers that hold objects.
- An [Amazon S3 bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingBucket.html) is a versatile storage option with the ability to: host a static web site, retain version information on objects, and employ life-cycle management policies to balance version retention with bucket size and cost.

# Types of Access Control

| Types of Access Control | Policy Type           | AWS Account Level Control | User Level Control     |
|-------------------------|-----------------------|---------------------------|------------------------|
| IAM Policies            | Identity Policy       | :x: No                    | :white_check_mark: Yes |
| Bucket Policies         | Resource-Based Policy | :white_check_mark: Yes    | :white_check_mark: Yes |
| ACL (legacy)            | -                     | :white_check_mark: Yes    | :x: No                 |

# Bucket Policy
- A [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucket-policies.html) is a resource-based policy that you can use to grant access permissions to your Amazon S3 bucket and the objects in it.
- By default, [all Amazon S3 resources are private](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html), so only the AWS account that created the resources can access them.

| Use Case                                                                                                                                                                                                                       | Remarks                                                                                                                                                                                                                                                      |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Grants other accounts cross-account permissions to upload objects to your S3 bucket while ensuring that the bucket owner has full control](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucket-policies.html) | -                                                                                                                                                                                                                                                            |
| :star: [Require SSE-KMS for all objects written to a bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucket-policies.html)                                                                                       | Bucket policy would require every object that is written to the bucket to be encrypted with server-side encryption using AWS Key Management Service (AWS KMS) keys (SSE-KMS). <br/>- If the object isn't encrypted with SSE-KMS, the request will be denied. |
| [Allow access to only your organization](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucket-policies.html)                                                                                                           | -                                                                                                                                                                                                                                                            |
| [Grant IAM users access to the bucket and the objects in it](https://repost.aws/knowledge-center/lambda-execution-role-s3-bucket)                                                                                              | [Example bucket policy](../../2_SecurityAndIdentityServices/1_IdentityServices/AWSIAM/samplePolicies/ResourcePolicies/buckeyPolicy.json)                                                                                                                  |

# Features

| Feature                                                                                                  | Description                                                                                                                                                                                                                                                                     |
|----------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Bucket Owner](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucket-owner-condition.html) | [Amazon S3 buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucket-owner-condition.html) are owned by the account that creates them and cannot be transferred to other accounts.                                                                                  |
| :star: Object Ownership                                                                                  | By default, an S3 object is owned by the AWS account that uploaded it (Even if bucket is owned by another account).                                                                                                                                                             |
| :star: [Bucket names](https://repost.aws/knowledge-center/s3-access-denied-redshift-unload)              | Bucket names are globally unique. <br/>- There can be no duplicate names within the entire S3 infrastructure.                                                                                                                                                                   |
| Bucket renaming                                                                                          | Once created, you cannot change a bucket name.                                                                                                                                                                                                                                  |
| Permanent Entities                                                                                       | Buckets are permanent storage entities and only removable when they are empty. <br/>- After deleting a bucket, the name becomes available for reuse by any account after 24 hours if not taken by another account.                                                              |
| Object storage limits                                                                                    | There’s no limit to the number of objects you can store in a bucket. <br/>- You can store all of your objects in a single bucket, or organize them across several buckets. <br/>- However, you can't create a bucket from within another bucket, also known as nesting buckets. |
| Bucket creation limits                                                                                   | By default, you can create up to 100 buckets in each of your AWS accounts. <br/>- If you need additional buckets, you can increase your account bucket limit to a maximum of 1,000 buckets by submitting a service limit increase.                                              |

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

# IAM Group for public bucket
- [Amazon S3](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) considers a bucket or object public if it grants any permissions to the members of the following groups:

| Group                                                                                 | Description                                                                                                                                                                                                                 |
|---------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [AuthenticatedUsers](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups.html) | This group allows all AWS accounts to access the resource. <br/>- This means that any authenticated AWS user, from any AWS account in the world, can access your resource so long as the request is signed (authenticated). |
| [AllUsers](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups.html)           | This group allows anyone in the world access to the resource. <br/>- The requests can be signed (authenticated) or unsigned (anonymous).                                                                                    |