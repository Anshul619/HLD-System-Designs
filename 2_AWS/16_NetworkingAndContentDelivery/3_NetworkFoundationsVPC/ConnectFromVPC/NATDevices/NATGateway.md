# Network Address Translation (NAT) gateways
- [NAT gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html) can be used to connect instances in a [private subnet](../../Subnets.md) to service outside your VPC but external services cannot initiate a connection with those instances.

![](../../assets/AWS_VPC.png)

# Use Cases

| Use Case                                                                                          | Remarks                                                                                                                                                                                                                                                                                   |
|---------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Resources in [Private Subnet](../../Subnets.md) needs to connect to Internet                      | Instances in private subnets can connect to the internet through a public NAT gateway.<br/>- You route traffic from the NAT gateway to the [internet gateway for the VPC](../../InternetGateway.md).                                                                                      |
| Resources in [Private Subnet](../../Subnets.md) needs to connect to other VPCs or on-perm network | Instances in private subnets can connect to other VPCs or your on-premises network through a private NAT gateway.<br/>- You can route traffic from the NAT gateway through a [transit gateway](../../ConnectBetweenVPCs/TransitGateway.md) or a [virtual private gateway](../../VirtualPrivateGateway.md). |

# Facts & Concepts

| Concept                                                                                      | Description                                                                                                                                                                                                    |
|----------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Ingress traffic NOT allowed                                                                  | [NAT gateway]() only allow egress network traffic, NOT ingress.                                                                                                                                                |
| Must be created in [Public Subnet](../../Subnets.md)                                         | To create a [NAT gateway](), you must specify the [public subnet](../../Subnets.md) in which the NAT gateway should reside.                                                                                    |
| Must associate [Elastic IP](../../../../2_ComputeServices/AmazonEC2/Networking/ElasticIP.md) | You must also specify an [Elastic IP address](../../../../2_ComputeServices/AmazonEC2/Networking/ElasticIP.md) to associate with the NAT gateway when you create it.                                           |
| Setup Availability Zone-independent architecture                                             | To create an Availability Zone-independent architecture, create a NAT gateway in each Availability Zone and configure your routing to ensure that resources use the NAT gateway in the same Availability Zone. |
