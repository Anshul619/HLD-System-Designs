# Security Group
- [Security groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) as a firewall for the [EC2 instances](../../../3_ComputeServices/AmazonEC2), controlling inbound and outbound traffic at the instance level.

# Supported AWS Services

| AWS Service                                                                                                            |
|------------------------------------------------------------------------------------------------------------------------|
| [Amazon EC2 Instance](../../../3_ComputeServices/AmazonEC2/Readme.md)                                                  |
| [Amazon RDS Instance](../../../6_DatabaseServices/AmazonRDS/Readme.md)                                                 |
| [Elastic Load Balancer](../../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md) |

# Source/Destination 
- The source (inbound rules) or destination (outbound rules) for the traffic to allow.

| Rule                                                                      | Example                     | Remarks                                                                                                                                                                                                                                                                                                                                        |
|---------------------------------------------------------------------------|-----------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| A single IPv4 address                                                     | 203.0.113.1/32              | You must use the /32 prefix length.                                                                                                                                                                                                                                                                                                            |
| A single IPv6 address                                                     | 2001:db8:1234:1a00::123/128 | You must use the /128 prefix length.                                                                                                                                                                                                                                                                                                           |
| A range of IPv4 addresses, in CIDR block notation                         | 203.0.113.0/24              | -                                                                                                                                                                                                                                                                                                                                              |
| A range of IPv6 addresses, in CIDR block notation                         | 2001:db8:1234:1a00::/64     | -                                                                                                                                                                                                                                                                                                                                              |
| ID of a security group (referred to here as the specified security group) | -                           | For example, the current security group, a security group from the same VPC, or a security group for a peered VPC. <br/>- This allows traffic based on the private IP addresses of the resources associated with the specified security group. <br/>- This does not add rules from the specified security group to the current security group. |

[Read more](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules.html)

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