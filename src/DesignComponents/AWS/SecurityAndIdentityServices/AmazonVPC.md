
# [Amazon Virtual Private Cloud (VPC)](https://aws.amazon.com/vpc/)
- Amazon VPC service creates a private virtual network that cannot be accessed by anyone or anything except the people and systems you authorize.

# How to connect your datacenter with VPC?
- A VPC is the best way of connecting to your cloud resources from your own data center. 
- Once you connect your datacenter to the VPC in which your instances are present, each instance is assigned a private IP address that can be accessed from your data center. 
- That way, you can access your public cloud resources as if they were on your own private network.

# Name and explain some security products and features available in VPC?
- `Security groups` - This acts as a firewall for the EC2 instances, controlling inbound and outbound traffic at the instance level. 
  - Includes `Route Tables`, `IP Ranges`, `Subnets` etc.
- `Network access control lists` - It acts as a firewall for the subnets, controlling inbound and outbound traffic at the subnet level.
- `Flow logs` - These capture the inbound and outbound traffic from the network interfaces in your VPC.

# How do you monitor Amazon VPC?
- `CloudWatch`
- `CloudWatch logs`
- `VPC Flow Logs`