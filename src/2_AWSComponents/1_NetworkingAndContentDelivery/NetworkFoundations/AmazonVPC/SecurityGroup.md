# Security Group
- [Security groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) as a firewall for the [EC2 instances](../../../3_ComputeServices/AmazonEC2), controlling inbound and outbound traffic at the instance level.

# Security Group vs Network ACL

|               | Security Group                                                                                                   | Network ACL       |
|---------------|------------------------------------------------------------------------------------------------------------------|-------------------|
| Stateliness   | Stateful<br/>- If traffic is allowed in, the outbound response to that traffic is allowed out automatically.     | Stateless         |
| Resources     | Applies on EC2, RDS instances                                                                                    | Applies on Subnet |
| Explicit Deny | Security groups have a hidden explicit deny, which means that anything that is not explicitly allowed is denied. | -                 |

# Chaining security groups together
Chaining together security groups adds layered security.
- Allow port 22 [Secure Shell (SSH)] access to every tier for administration.
- Only allow your web servers to have port 80 (HTTP) or port 443 (HTTPS) open to the internet.
- Your application servers would only allow traffic that originated from the web server security group.
- Your database servers would only allow traffic that originated from the application server security group.

In this way, your security groups are chained together from web server to application server to database, preventing unauthorized access that didn't follow that pattern.

# Applicable Resources
- [Amazon EC2 Instance](../../../3_ComputeServices/AmazonEC2/Readme.md)
- [Amazon RDS Instance](../../../6_DatabaseServices/AmazonRDS/Readme.md)