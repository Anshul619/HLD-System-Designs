# AWS Firewall Manager
- [AWS Firewall Manager](https://docs.aws.amazon.com/waf/latest/developerguide/fms-chapter.html) simplifies your administration and maintenance tasks across multiple accounts and resources for a variety of protections.

# Supported AWS Resources

| AWS Resource                                                                                                        |
|---------------------------------------------------------------------------------------------------------------------|
| [AWS WAF](../17_SecurityServices/2_InfraProtectionServices/AWSWAF.md)                                               |
| [AWS Shield Advanced](../17_SecurityServices/2_InfraProtectionServices/AWSShield.md)                                |
| [Amazon VPC security groups](../17_SecurityServices/2_InfraProtectionServices/VPC/SecurityGroup.md)                 |
| AWS Network Firewall                                                                                                |
| [Amazon Route 53 Resolver DNS Firewall](../16_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonRoute53/Readme.md) |

# Features

| Feature                                             | Remarks                                                                                                                                                                                                 |
|-----------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Rules across [AWS Organization](AWSOrganization.md) | AWS Firewall Manager is a security management service which allows you to centrally configure and manage firewall rules across your accounts and applications in [AWS Organization](AWSOrganization.md) |
| Enforce Rules                                       | As new applications are created, Firewall Manager makes it easy to bring new applications and resources into compliance by enforcing a common set of security rules.                                    |