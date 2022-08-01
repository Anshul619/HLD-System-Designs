
# What Is Amazon Virtual Private Cloud (VPC) and Why Is It Used?
- A VPC is the best way of connecting to your cloud resources from your own data center. 
- Once you connect your datacenter to the VPC in which your instances are present, each instance is assigned a private IP address that can be accessed from your data center. 
- That way, you can access your public cloud resources as if they were on your own private network.

# Name and explain some security products and features available in VPC?
- `Security groups` - This acts as a firewall for the EC2 instances, controlling inbound and outbound traffic at the instance level.
- `Network access control lists` - It acts as a firewall for the subnets, controlling inbound and outbound traffic at the subnet level.
- `Flow logs` - These capture the inbound and outbound traffic from the network interfaces in your VPC.

# How do you monitor Amazon VPC?
- `CloudWatch`
- `CloudWatch logs`
- `VPC Flow Logs`

# What is IAM?
- AWS IAM allows an administrator to provide multiple users and groups with granular access. 
- Various user groups and users may require varying levels of access to the various resources that have been developed. 
- We may assign roles to users and create roles with defined access levels using IAM. 
- It further gives us Federated Access, which allows us to grant applications and users access to resources without having to create IAM Roles. 