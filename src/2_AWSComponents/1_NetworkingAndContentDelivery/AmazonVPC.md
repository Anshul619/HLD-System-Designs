
# Amazon VPC
- [Amazon Virtual Private Cloud (VPC)](https://aws.amazon.com/vpc/) service creates a private virtual network that cannot be accessed by anyone or anything except the people and systems you authorize.
- A virtual private cloud (VPC) is a virtual network dedicated to your AWS account. It is logically isolated from other virtual networks in the AWS Cloud.
- You can specify an IP address range for the VPC, add subnets, add gateways, and associate security groups.

# Default VPC
- If your account was created after 2013-12-04, it comes with a default VPC in each Region.
- A default VPC is configured and ready for you to use.
- For example, it has [a default subnet in each Availability Zone in the Region](../AWS-Global-Architecture-Region-AZ.md), an attached internet gateway, a route in the main route table that sends all traffic to the internet gateway, and DNS settings that provide [EC2 instances](../4_ComputeServices/AmazonEC2/ReadMe.md) with public IP addresses and DNS hostnames.
- Therefore, an [EC2 instance](../4_ComputeServices/AmazonEC2/ReadMe.md) that is launched in a default subnet automatically has access to the internet.
- If you have a default VPC in a Region and you don't specify a subnet when you launch an EC2 instance into that Region, we choose one of the default subnets and launch the instance into that subnet.

# Main Components

## Subnets
- [A subnet](https://docs.aws.amazon.com/vpc/latest/userguide/configure-subnets.html) is a range of IP addresses in your VPC. 
- You can launch AWS resources, such as [Amazon EC2 instances](../4_ComputeServices/AmazonEC2/ReadMe.md), into a specified subnet. 
- You can connect a subnet to the internet, other VPCs, and your own data centers, and route traffic to and from your subnets using route tables.
- Use a public subnet for resources that must be connected to the internet, and a private subnet for resources that won't be connected to the internet.

![img.png](https://docs.aws.amazon.com/images/vpc/latest/userguide/images/subnet-diagram.png)

## Route Tables
- [A route table](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html) contains a set of rules, called routes, that determine where network traffic from your subnet or gateway is directed.

![img.png](https://docs.aws.amazon.com/images/vpc/latest/userguide/images/case-3_updated.png)

## Internet Gateway
- [An internet gateway](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Internet_Gateway.html) is a horizontally scaled, redundant, and highly available VPC component that allows communication between your VPC and the internet. 
- It supports IPv4 and IPv6 traffic. 
- It does not cause availability risks or bandwidth constraints on your network traffic.

## Security

### Security Groups
- [Security groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
- This acts as a firewall for the [EC2 instances](../4_ComputeServices/AmazonEC2), controlling inbound and outbound traffic at the instance level. 
- Includes [Route Tables](#route-tables), [Subnets](#subnets), `IP Ranges` etc.

### Network Access Control Lists
- [Network access control lists](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-network-acls.html)
- It acts as a firewall for the subnets, controlling inbound and outbound traffic at the subnet level.

### Flow Logs
- [Flow logs](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html) 
- These capture the inbound and outbound traffic from the network interfaces in your VPC.

# Monitoring in VPC
- [CloudWatch](../8_MonitoringServices/AmazonCloudWatch.md)
- [CloudWatch logs](../8_MonitoringServices/AmazonCloudWatch.md)
- [VPC Flow Logs](#flow-logs)

# Transit Gateway
- [A transit gateway](https://docs.aws.amazon.com/vpc/latest/tgw/what-is-transit-gateway.html) is a network transit hub that you can use to interconnect your [virtual private clouds (VPCs)]() and on-premises networks.
- As your cloud infrastructure expands globally, inter-Region peering connects transit gateways together using the AWS Global Infrastructure.
- Your data is automatically encrypted and never travels over the public internet.
- [VPC Peering vs Transit Gateway](https://ably.com/blog/aws-vpc-peering-vs-transit-gateway-and-beyond)

![img.png](https://ik.imagekit.io/ably/ghost/prod/2022/09/transit_gateway-1.png?tr=w-1520,q-50)

# How to connect your datacenter with VPC?
- A VPC is the best way of connecting to your cloud resources from your own data center.
- Once you connect your datacenter to the VPC in which your instances are present, each instance is assigned a private IP address that can be accessed from your data center.
- That way, you can access your public cloud resources as if they were on your own private network.

# Building a Modular and Scalable Virtual Network Architecture with Amazon VPC

![img.png](https://docs.aws.amazon.com/images/quickstart/latest/vpc/images/vpc-design.png)

# References
- [Key choices in AWS network design: VPC peering vs Transit Gateway and beyond](https://ably.com/blog/aws-vpc-peering-vs-transit-gateway-and-beyond)
- [How Amazon VPC works?](https://docs.aws.amazon.com/vpc/latest/userguide/how-it-works.html)