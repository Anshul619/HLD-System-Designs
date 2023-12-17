
# Amazon S3 Bucket
- An [Amazon S3 Bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingBucket.html) are permanent containers that hold objects.
- It is a versatile storage option with the ability to: host a static web site, retain version information on objects, and employ life-cycle management policies to balance version retention with bucket size and cost.

# Features

| Feature                            | Description                                                                                                                                                                                                                                                                     |
|------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: Bucket Owner                | [Amazon S3 buckets](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucket-owner-condition.html) are owned by the account that creates them and cannot be transferred to other accounts.                                                                                  |
| :star: Bucket names                | Bucket names are globally unique. There can be no duplicate names within the entire S3 infrastructure. [Read more](https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html)                                                                           |
| :x: Bucket renaming - Not possible | Once created, you [cannot change a bucket name](https://bobbyhadz.com/blog/aws-s3-rename-bucket).                                                                                                                                                                               |
| Permanent Entities                 | Buckets are permanent storage entities and only removable when they are empty. <br/>- After deleting a bucket, the name becomes available for reuse by any account after 24 hours if not taken by another account.                                                              |
| Object storage limits              | There’s no limit to the number of objects you can store in a bucket. <br/>- You can store all of your objects in a single bucket, or organize them across several buckets. <br/>- However, you can't create a bucket from within another bucket, also known as nesting buckets. |
| Bucket creation limits             | By default, you can create up to 100 buckets in each of your AWS accounts. <br/>- If you need additional buckets, you can increase your account bucket limit to a maximum of 1,000 buckets by submitting a service limit increase.                                              |

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