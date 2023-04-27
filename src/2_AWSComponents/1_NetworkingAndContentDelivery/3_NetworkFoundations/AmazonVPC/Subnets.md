
# Subnets
- [A subnet](https://docs.aws.amazon.com/vpc/latest/userguide/configure-subnets.html) is a range of IP addresses in your VPC.
- You can launch AWS resources, such as [Amazon EC2 instances](../../../3_ComputeServices/AmazonEC2/Readme.md), into a specified subnet.
- You can connect a subnet to the internet, other VPCs, and your own data centers, and route traffic to and from your subnets using route tables.
- Use a public subnet for resources that must be connected to the internet, and a private subnet for resources that won't be connected to the internet.
- Subnets cannot span more than one Availability Zone.

![img.png](assets/AWS_VPC.png)

# Public vs Private Subnets
- The only architectural difference between a public and private subnet is that a public subnet has a route to an internet gateway.
- If you route a subnet to an internet gateway, that subnet becomes a public subnet.
- With the right configuration, resources within that subnet can then reach and be reached by the internet.

