# AWS Key Management Service
- [AWS Key Management Service (AWS KMS)](https://aws.amazon.com/kms/) lets you create, manage, and control cryptographic keys across your applications and more than 100 AWS services. 

![](https://d1.awsstatic.com/Security/aws-kms/Group%2017aws-kms.6dc3dbbbe5b75b46c4f62218d0531e5bed7276ce.png)

# Key policies in AWS KMS
- A [key policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html) is a resource policy for an AWS KMS key. 
- Key policies are the primary way to control access to KMS keys. 
- Every KMS key must have exactly one key policy. 
- The statements in the key policy determine who has permission to use the KMS key and how they can use it. 
- You can also use [IAM policies and grants](../../2a_IdentityServices/AWSIAM/Readme.md) to control access to the KMS key, but every KMS key must have a key policy. 

# Multi-Region keys in AWS KMS
- [AWS KMS supports multi-Region keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html), which are AWS KMS keys in different AWS Regions that can be used interchangeably – as though you had the same key in multiple Regions.
- Each set of related multi-region keys has the same key material and key ID, so you can encrypt data in one AWS region and decrypt it in a different AWS region without re-encrypting or making a cross-region call to AWS KMS.
- You can use multi-region AWS KMS keys in [Amazon S3](../../7_StorageServices/3_ObjectStorageS3/Readme.md). 
- However, [Amazon S3](../../7_StorageServices/3_ObjectStorageS3/Readme.md) currently treats multi-region keys as though they were single-region keys, and does not use the multi-region features of the key.