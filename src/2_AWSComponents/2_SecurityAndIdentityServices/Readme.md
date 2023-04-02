# Securely Services

| Service                                                              | Description                                                                                                   |
|----------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|
| [AWS IAM](AWSUsers&AccessMgmt/AWSIAM.md)                             | Who can do what in AWS?<br/>- Grant least privileges.                                                         |
| [AWS Identity Center](AWSUsers&AccessMgmt/AWSIAMIdentityCenter.md)   | Single-sign-on for users, Centralized identity provider.                                                      |
| [AWS Secrets Manager](AWSSecretsManager.md)                          | Secure and rotating secrets                                                                                   |
| [Amazon Cognito](AmazonCognito.md)                                   | User signup/login as a service.                                                                               |
| [AWS Config](AWSConfig.md)                                           | Detect any user changes in AWS account and automate remediation.                                              |
| [AWS WAF](AWSWAF.md)                                                 | Apply rate limiting in AWS account                                                                            |
| [Amazon VPC](../1_NetworkingAndContentDelivery/AmazonVPC.md)         | Secure network                                                                                                |
| [AWS KMS](AWSKMS.md)                                                 | AWS key management service creates and controls cryptographic keys used to encrypt or digitally sign your data |
| [AWS ACM](AWSACM.md)                                                 | AWS Certificate manager service.                                                                              |

# Best security practices
- Enforce the use of MFA for the root user logins.
- Enforce the use of complex passwords for member account root user logins.
- Don't use Access Key ID and Secret Access Key, for root user logins. These are used to programmatically give access to the resources.
- [Apply least-privilege permissions](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#grant-least-privilege)
