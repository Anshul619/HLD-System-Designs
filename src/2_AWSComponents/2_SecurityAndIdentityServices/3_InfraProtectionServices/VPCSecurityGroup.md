# Security Group
- [Security groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) as a firewall for the [EC2 instances](../../3_ComputeServices/AmazonEC2), controlling inbound and outbound traffic at the instance level.

# Applicable Resources
- [Amazon EC2 Instance](../../3_ComputeServices/AmazonEC2/Readme.md)
- [Amazon RDS Instance](../../6_DatabaseServices/AmazonRDS/Readme.md)

# Example Security rules (Chaining security groups together)

## Web servers
- The following are example rules for a security group for your web servers. 
- The web servers can receive HTTP and HTTPS traffic from all IPv4 and IPv6 addresses and send SQL or MySQL traffic to your database servers.

### Inbound

| Source                                    | Protocol | Port range | Description                                                                              |
|-------------------------------------------|----------|------------|------------------------------------------------------------------------------------------|
| 0.0.0.0/0                                 | TCP      | 443        | Allows inbound HTTPS access from all IPv4 addresses                                      |
| Public IPv4 address range of your network | TCP      | 22         | (Optional) Allows inbound SSH access from IPv4 IP addresses in your network              |

## Outbound

| Destination                                                         | Protocol | Port range | Description                                 |
|---------------------------------------------------------------------|----------|------------|---------------------------------------------|
| ID of the security group for instances running Microsoft SQL Server | TCP      | 1433       | Allows outbound Microsoft SQL Server access |
| ID of the security group for instances running MySQL                | TCP      | 3306       | Allows outbound MySQL access                |

## Database servers
- Database servers require rules that allow inbound specific protocols, such as MySQL or Microsoft SQL Server. 
- For examples, see [Database server rules](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html#sg-rules-db-server) in the Amazon EC2 User Guide. 
- For more information about security groups for Amazon RDS DB instances, see [Controlling access with security groups](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.RDSSecurityGroups.html) in the Amazon RDS User Guide.

# References
- [Security group rules](https://docs.aws.amazon.com/vpc/latest/userguide/security-group-rules.html)