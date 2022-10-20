
# Amazon VPC
- [Amazon Virtual Private Cloud (VPC)](https://aws.amazon.com/vpc/) service creates a private virtual network that cannot be accessed by anyone or anything except the people and systems you authorize.

# Subnets for your VPC
- [A subnet](https://docs.aws.amazon.com/vpc/latest/userguide/configure-subnets.html) is a range of IP addresses in your VPC. 
- You can launch AWS resources into a specified subnet. 
- Use a public subnet for resources that must be connected to the internet, and a private subnet for resources that won't be connected to the internet.

![img.png](https://docs.aws.amazon.com/images/vpc/latest/userguide/images/subnet-diagram.png)

# How to connect your datacenter with VPC?
- A VPC is the best way of connecting to your cloud resources from your own data center. 
- Once you connect your datacenter to the VPC in which your instances are present, each instance is assigned a private IP address that can be accessed from your data center. 
- That way, you can access your public cloud resources as if they were on your own private network.

# Name and explain some security products and features available in VPC?
- [Security groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
  - This acts as a firewall for the [EC2 instances](../4_ComputeServices/AmazonEC2), controlling inbound and outbound traffic at the instance level. 
  - Includes `Route Tables`, `IP Ranges`, `Subnets` etc.
- [Network access control lists](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-network-acls.html)
  - It acts as a firewall for the subnets, controlling inbound and outbound traffic at the subnet level.
- [Flow logs](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html) 
  - These capture the inbound and outbound traffic from the network interfaces in your VPC.

# Transit Gateway
- [A transit gateway](https://docs.aws.amazon.com/vpc/latest/tgw/what-is-transit-gateway.html) is a network transit hub that you can use to interconnect your [virtual private clouds (VPCs)]() and on-premises networks. 
- As your cloud infrastructure expands globally, inter-Region peering connects transit gateways together using the AWS Global Infrastructure. 
- Your data is automatically encrypted and never travels over the public internet.
- [VPC Peering vs Transit Gateway](https://ably.com/blog/aws-vpc-peering-vs-transit-gateway-and-beyond)

![img.png](https://ik.imagekit.io/ably/ghost/prod/2022/09/transit_gateway-1.png?tr=w-1520,q-50)

# How do you monitor Amazon VPC?
- [CloudWatch](../8_MonitoringServices/AmazonCloudWatch.md)
- [CloudWatch logs](../8_MonitoringServices/AmazonCloudWatch.md)
- `VPC Flow Logs`

# References
[Key choices in AWS network design: VPC peering vs Transit Gateway and beyond](https://ably.com/blog/aws-vpc-peering-vs-transit-gateway-and-beyond)