
# Subnets
- [A subnet](https://docs.aws.amazon.com/vpc/latest/userguide/configure-subnets.html) is a range of IP addresses in your VPC.
- You can launch AWS resources, such as [Amazon EC2 instances](../../3_ComputeServices/AmazonEC2/Readme.md), into a specified subnet.
- You can connect a subnet to the internet, other VPCs, and your own data centers, and route traffic to and from your subnets using [route tables](../../2_SecurityAndIdentityServices/3_InfraProtectionServices/VPC/SubnetRouteTables.md).
- Subnets CANNOT span more than one Availability Zone.

![img.png](assets/AWS_VPC.png)

# Concepts

| Concept        | Description                                                                                                                                           |
|----------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| Public Subnet  | If a subnet is associated with a route table that has a route to an [internet gateway](InternetGateway.md), it's known as a public subnet.            |
| Private Subnet | If a subnet is associated with a route table that does not have a route to an [internet gateway](InternetGateway.md), it's known as a private subnet. |

