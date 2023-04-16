# Securely Services

| Service                                                                                  | Description                                                                                                    |
|------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| [AWS IAM](1_AuthorizationServices/AWSIAM.md)                                             | Who can do what in AWS?<br/>- Grant least privileges.                                                          |
| [AWS Identity Center](1_AuthorizationServices/AWSIAMIdentityCenter.md)                   | Single-sign-on for users, Centralized identity provider.                                                       |
| [AWS Secrets Manager](2_DataProtectionServices/AWSSecretsManager.md)                     | Secure and rotating secrets                                                                                    |
| [Amazon Cognito](1_AuthorizationServices/AmazonCognito.md)                               | User signup/login as a service.                                                                                |
| [AWS Config](4_Monitoring&DetectionServices/AWSConfig.md)                                | Detect any user changes in AWS account and automate remediation.                                               |
| [AWS WAF](3_InfraProtectionServices/AWSWAF.md)                                           | Apply rate limiting in AWS account                                                                             |
| [Amazon VPC](../1_NetworkingAndContentDelivery/3_NetworkFoundations/AmazonVPC/Readme.md) | Secure network                                                                                                 |
| [AWS KMS](2_DataProtectionServices/AWSKMS.md)                                            | AWS key management service creates and controls cryptographic keys used to encrypt or digitally sign your data |
| [AWS ACM](2_DataProtectionServices/AWSACM.md)                                            | AWS Certificate manager service.                                                                               |

# Best security practices
- Enforce the use of MFA for the root user logins.
- Enforce the use of complex passwords for member account root user logins.
- Don't use Access Key ID and Secret Access Key, for root user logins. These are used to programmatically give access to the resources.
- [Apply least-privilege permissions](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#grant-least-privilege).
- Note - Only AWS root account has the permission to delete the account.
