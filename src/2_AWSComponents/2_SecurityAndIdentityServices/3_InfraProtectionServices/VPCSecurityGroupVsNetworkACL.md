# Security Group vs Network ACL

|               | [Security Group](VPCSecurityGroup.md)                                                                                           | [Network ACL](VPCNetworkACL.md) |
|---------------|------------------------------------------------------------------------------------------------------------------------------|------------------------------|
| Stateliness   | Stateful<br/>- If traffic is allowed in, the outbound response to that traffic is allowed out automatically.                 | Stateless                    |
| Resources     | Applies on [EC2](../../3_ComputeServices/AmazonEC2/Readme.md), [RDS instances](../../6_DatabaseServices/AmazonRDS/Readme.md) | Applies on Subnet            |
| Explicit Deny | Security groups have a hidden explicit deny, which means that anything that is not explicitly allowed is denied.             | -                            |

# References
- [Compare security groups and network ACLs](https://docs.aws.amazon.com/vpc/latest/userguide/infrastructure-security.html#VPC_Security_Comparison)