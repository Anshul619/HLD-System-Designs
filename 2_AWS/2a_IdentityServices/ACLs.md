# Access Control List 
- [Access Control List (ACLs)](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html) to make individual objects accessible to authorized users.
- [Access control lists (ACLs)]() are service policies that allow you to control which principals in another account can access a resource.
- [ACLs]() are a legacy access control mechanism that predates [IAM](AWSIAM/Readme.md).

# Supported AWS Services

| AWS Service                                                                       | Remarks                                                                                                                |
|-----------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|
| [Amazon S3](../7_StorageServices/3_S3ObjectStorage/Readme.md)                     | Instead of ACL, AWS recommends using [Amazon S3 bucket policies or IAM policies for access control](AWSIAM/Readme.md). |
| [AWS WAF](../2c_SecurityServices/2_InfraProtectionServices/AWSWAF.md)             | -                                                                                                                      |
| [Amazon VPC](../1_NetworkingAndContentDelivery/3_NetworkFoundationsVPC/Readme.md) | -                                                                                                                      |

# IAM Groups for public bucket
- [Amazon S3](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html) considers a bucket or object public if it grants any permissions to the members of the following groups:

| Group                                                                                 | Description                                                                                                                                                                                                                 |
|---------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [AuthenticatedUsers](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups.html) | This group allows all AWS accounts to access the resource. <br/>- This means that any authenticated AWS user, from any AWS account in the world, can access your resource so long as the request is signed (authenticated). |
| [AllUsers](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups.html)           | This group allows anyone in the world access to the resource. <br/>- The requests can be signed (authenticated) or unsigned (anonymous).                                                                                    |