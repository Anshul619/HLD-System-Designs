
# Amazon VPC
- [Amazon Virtual Private Cloud (VPC)](https://aws.amazon.com/vpc/) service creates a private virtual network that cannot be accessed by anyone or anything except the people and systems you authorize.
- You can specify an IP address range for the VPC, [add subnets](Subnets.md), [add gateways](InternetGateway.md), and associate security groups.
- All traffic between two points in the same Amazon VPC is forwarded directly.

![img.png](../../assets/AWS_VPC.png)

# Main Components

| Component                                                      | Remarks                                                        |
|----------------------------------------------------------------|----------------------------------------------------------------|
| [Subnets](Subnets.md)                                          | -                                                              |
| [Route Tables](RouteTables.md)                                 | -                                                              |
| [Internet Gateway](InternetGateway.md)                         | VPC specific service                                           |
| [Network Access Control Lists (ACL)](NetworkACL.md)            | -                                                              |
| :star: [Transit Gateway](../VPCConnection/TransitGateway.md)   | -                                                              |
| [VPC Peering](../VPCConnection/VPCPeering.md)                  | -                                                              |
| [Security Groups](SecurityGroup.md)                            | -                                                              |
| [Network Gateway](NetworkGateway.md)                           | NAT provides Public IP of the whole network, to outside world. |
| [Flow Logs](../../5_Monitoring&Security/VPCFlowLogs.md)                                       | -                                                              |
| [VPC Enpoints](VPCEndpoints.md)                                | -                                                              |

# Features

| Tag                 | Description                                                                                                                                                                       |
|---------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Scope               | Only some AWS services, such as Amazon EC2, require their resources be launched into an Amazon VPC.                                                                               |
| Isolation           | It is logically isolated from other virtual networks in the AWS Cloud.                                                                                                            |
| VPC-1-Region-Launch | An Amazon VPC is launched into one AWS Region and cannot be spread across multiple regions.                                                                                       |
| Default VPC         | By default, a default VPC (in each region), subnet (in each availability zone), an attached internet gateway, a route in the main route table etc. are configured in AWS account. |
| Custom VPC          | If you want, you can also create a [custom VPC](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-getting-started.html#create-configure-vpc).                                  |

# References
- [Key choices in AWS network design: VPC peering vs Transit Gateway and beyond](https://ably.com/blog/aws-vpc-peering-vs-transit-gateway-and-beyond)
- [How Amazon VPC works?](https://docs.aws.amazon.com/vpc/latest/userguide/how-it-works.html)