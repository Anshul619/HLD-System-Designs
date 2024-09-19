
# Subnets
- [A subnet](https://docs.aws.amazon.com/vpc/latest/userguide/configure-subnets.html) is a range of IP addresses in your VPC.
- You can launch AWS resources, such as [Amazon EC2 instances](../../2_ComputeServices/AmazonEC2/Readme.md), into a specified subnet.
- You can connect a subnet to the internet, other VPCs, and your own data centers, and route traffic to and from your subnets using [route tables](../../17_SecurityServices/2_InfraProtectionServices/VPC/RouteTables.md).
- Subnets CANNOT span more than one Availability Zone.

![img.png](assets/AWS_VPC.png)

# Concepts

| Concept        | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
|----------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Public Subnet  | If a subnet is associated with a [route table](../../17_SecurityServices/2_InfraProtectionServices/VPC/RouteTables.md) that has a route to an [internet gateway](InternetGateway.md), it's known as a public subnet.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| Private Subnet | If a subnet is associated with a [route table](../../17_SecurityServices/2_InfraProtectionServices/VPC/RouteTables.md) that does not have a route to an [internet gateway](InternetGateway.md), it's known as a private subnet.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| CIDR of Subnet | The CIDR block of a subnet can be the same as the CIDR block for the VPC (for a single subnet in the VPC), or a subset of the CIDR block for the VPC (to create multiple subnets in the VPC). <br/>- The allowed block size is between a /28 netmask and /16 netmask. <br/>- If you create more than one subnet in a VPC, the CIDR blocks of the subnets cannot overlap.<br/>- For example, if you create a VPC with CIDR block 10.0.0.0/24, it supports 256 IP addresses. You can break this CIDR block into two subnets, each supporting 128 IP addresses. One subnet uses CIDR block 10.0.0.0/25 (for addresses 10.0.0.0 - 10.0.0.127) and the other uses CIDR block 10.0.0.128/25 (for addresses 10.0.0.128 - 10.0.0.255). |
