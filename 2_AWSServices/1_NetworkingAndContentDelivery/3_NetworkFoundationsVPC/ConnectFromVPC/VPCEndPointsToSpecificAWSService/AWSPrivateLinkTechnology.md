
# AWS Private Link
- [AWS PrivateLink](https://aws.amazon.com/privatelink) is a [highly available, scalable TECHNOLOGY](../../../../../7a_HighAvailability/HighAvailability.md) that enables you to privately connect [your virtual private cloud (VPC)](../../Readme.md) to supported AWS services, services hosted by other AWS accounts (VPC endpoint services), and supported AWS Marketplace partner services. 
- You do not require an internet gateway, network address translation device, public IP address, AWS Direct Connect connection, or VPN connection to communicate with the service. 
- Traffic between [your VPC](../../Readme.md) and the service does not leave the Amazon network.
- Private Link is leveraged to create a private connection between an application that is fronted by an [NLB in an account](../../../2_ApplicationNetworking/ElasticLoadBalancer/Readme.md), and an Elastic Network Interface (ENI) in another account, without the need of VPC peering and allowing the connections between the two to remain within the AWS network.

![](https://docs.aws.amazon.com/images/whitepapers/latest/building-scalable-secure-multi-vpc-network-infrastructure/images/aws-privatelink.png)

# Reference
- [Implementing Microservices on AWS](https://docs.aws.amazon.com/whitepapers/latest/microservices-on-aws/microservices.html)