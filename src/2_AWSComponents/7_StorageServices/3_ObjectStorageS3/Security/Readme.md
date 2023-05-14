# Types of Access Control

| Types of Access Control            | Policy Type           | AWS Account Level Control | User Level Control     |
|------------------------------------|-----------------------|---------------------------|------------------------|
| IAM Policies                       | Identity Policy       | :x: No                    | :white_check_mark: Yes |
| [Bucket Policies](BucketPolicy.md) | Resource-Based Policy | :white_check_mark: Yes    | :white_check_mark: Yes |
| :-1: [ACL (legacy)](../../../2_SecurityAndIdentityServices/1_IdentityServices/ACLs.md)       | NA                    | :white_check_mark: Yes    | :x: No                 |

# Securing Data Access

| Security Mechanism                                                                                                         | Description                                                                                                                                                                                                                                                                                                                                                                                                                               |
|----------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Encryption at rest & in transit](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucket-encryption.html)            | [Amazon S3]() also offers integrations to help prevent breaches by way of PCI-DSS, HIPAA/HITECH, and FedRAMP.                                                                                                                                                                                                                                                                                                                             |
| [AWS IAM](../../../2_SecurityAndIdentityServices/1_IdentityServices/AWSIAM/Readme.md)                                      | IAM is used to create users and manage their respective access to resources, including buckets and objects.                                                                                                                                                                                                                                                                                                                               |
| [Bucket policies](BucketPolicy.md)                                                                                         | [Bucket policies](BucketPolicy.md) are used to configure permissions for all or a subset of objects using tags and prefixes.                                                                                                                                                                                                                                                                                                              |
| [Pre-Signed URLs](https://docs.aws.amazon.com/AmazonS3/latest/userguide/ShareObjectPreSignedURL.html)                      | Pre-Signed URLs are used to grant time-limited access to others with temporary URLs.<br/>- When you share your objects using a presigned URL, the presigned URL works the same for both encrypted and unencrypted objects. <br/>- Additionally, when you list objects in your bucket, the list API returns a list of all objects, regardless of their encryption.                                                                         |
| :-1: [Access Control List (ACLs)](../../../2_SecurityAndIdentityServices/1_IdentityServices/ACLs.md)                                                                                 | [Amazon S3 ACLs](../../../2_SecurityAndIdentityServices/1_IdentityServices/ACLs.md) are a legacy access control mechanism that predates IAM. <br/>- AWS recommends using Amazon S3 bucket policies or IAM policies for access control.                                                                                                                                                                                                                                                              |
| [Block Public Access](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-control-block-public-access.html)       | Block Public Access overrides other S3 access permissions to easily enforce a no-public-access policy.<br/>- Public access policy is available at both AWS account, bucket level.                                                                                                                                                                                                                                                         |
| [Access Points](https://aws.amazon.com/s3/features/access-points/)                                                         | Access points are named network endpoints that are attached to buckets and are used to perform Amazon S3 object operations, such as GetObject and PutObject.                                                                                                                                                                                                                                                                              |
| [Object Ownership](https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html)                      | By default, [Object Ownership](https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html) is set to the Bucket owner enforced setting and all ACLs are disabled.<br/>- Not-Recommended, instead use bucket-policies - If you want to change object ownership to [Object writer](https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html), [enable ACL](../../../2_SecurityAndIdentityServices/1_IdentityServices/ACLs.md) and change the setting. |
| [MFA delete to protect bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiFactorAuthenticationDelete.html) | [MFA delete](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiFactorAuthenticationDelete.html) requires secondary authentication to take place before objects can be permanently deleted from an Amazon S3 bucket. Hence, this is the correct option.                                                                                                                                                                           |
| [Server Access Logs](https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerLogs.html)                                | [Server access logging](https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerLogs.html) provides detailed records for the requests that are made to a bucket. <br/>- Server access logs are useful for many applications. For example, access log information can be useful in security and access audits. <br/>- It can also help you learn about your customer base and understand your Amazon S3 bill.                                                                                                   |

# Encryption Algorithms

| Algo                                                                                                                                                                                           | Audit Trail            | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Default - Server-Side Encryption with Amazon S3-Managed Keys (SSE-S3)](https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingServerSideEncryption.html)                           | ::x: No                | When you use [Server-Side Encryption with Amazon S3-Managed Keys (SSE-S3)](https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingServerSideEncryption.html), each object is encrypted with a unique key.<br/>- As an additional safeguard, it encrypts the key itself with a root key that it regularly rotates.                                                                                                                                                         |
| :star: [Server-Side Encryption with Customer Master Keys (CMKs) Stored in AWS Key Management Service (SSE-KMS)](https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingKMSEncryption.html) | :white_check_mark: Yes | When you use [server-side encryption with AWS KMS (SSE-KMS)](https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingKMSEncryption.html), you can specify a customer-managed CMK that you have already created. <br/>- [To delete a CMK in AWS KMS you schedule key deletion](https://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html). You can set the waiting period from a minimum of 7 days up to a maximum of 30 days. The default waiting period is 30 days. |
| [Server-Side Encryption with Customer-Provided Keys (SSE-C)](https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html)                                      | :x: No                 | With [Server-Side Encryption with Customer-Provided Keys (SSE-C)](https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html), you manage the encryption keys and Amazon S3 manages the encryption, as it writes to disks, and decryption when you access your objects.                                                                                                                                                                               |

[Read more](https://aws.amazon.com/blogs/developer/generating-amazon-s3-pre-signed-urls-with-sse-part-1/)

# Retention Periods on Objects
- Different versions of a single object can have different retention modes and periods.

| Setting                                                                                                                                               | Description                                                                                                                |
|-------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|
| [Bucket default settings](https://docs.aws.amazon.com/AmazonS3/latest/API/API_DefaultRetention.html)                                                  | A duration, in either days or years, can be specified as retention period of the bucket's objects.                         |
| [Setting on object version explicitly](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-retention-periods) | When you apply a retention period to an object version explicitly, you specify a Retain Until Date for the object version. |
