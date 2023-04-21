# AWS Key Management Service
- [AWS Key Management Service (AWS KMS)](https://aws.amazon.com/kms/) lets you create, manage, and control cryptographic keys across your applications and more than 100 AWS services. 

![](https://d1.awsstatic.com/Security/aws-kms/Group%2017aws-kms.6dc3dbbbe5b75b46c4f62218d0531e5bed7276ce.png)

# Key policies in AWS KMS
- A [key policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html) is a resource policy for an AWS KMS key. 
- Key policies are the primary way to control access to KMS keys. 
- Every KMS key must have exactly one key policy. 
- The statements in the key policy determine who has permission to use the KMS key and how they can use it. 
- You can also use IAM policies and grants to control access to the KMS key, but every KMS key must have a key policy. 