
# AWS Private Link
- [AWS PrivateLink](https://aws.amazon.com/privatelink) is a [highly available, scalable technology](../../1_HLDDesignComponents/0_SystemGlossaries/Reliability/HighAvailability.md) that enables you to privately connect [your virtual private cloud (VPC)](AmazonVPC.md) to supported AWS services, services hosted by other AWS accounts (VPC endpoint services), and supported AWS Marketplace partner services. 
- You do not require an internet gateway, network address translation device, public IP address, AWS Direct Connect connection, or VPN connection to communicate with the service. 
- Traffic between your VPC and the service does not leave the Amazon network.

Private links are a great way to [increase the isolation and security of microservices architecture](../../1_HLDDesignComponents/1_MicroServicesSOA). 
- A microservice, for example, could be deployed in a [totally separate VPC](AmazonVPC.md), fronted by a [load balancer](ElasticLoadBalancer/Readme.md), and exposed to other microservices through a [AWS PrivateLink]() endpoint. 
- With this setup, using [AWS PrivateLink](), the network traffic to and from the [microservice](../../1_HLDDesignComponents/1_MicroServicesSOA) never traverses the public internet. 
- One use case for such isolation includes regulatory compliance for services handling sensitive data such as PCI, HIPPA and EU/US Privacy Shield. 
- Additionally, [AWS PrivateLink]() allows connecting microservices across different accounts and [Amazon VPCs](AmazonVPC.md), with no need for firewall rules, path definitions, or route tables; simplifying network management. 
- Utilizing [AWS PrivateLink](), software as a service (SaaS) providers, and ISVs can offer their [microservices-based solutions][microservice](../../1_HLDDesignComponents/1_MicroServicesSOA) with complete operational isolation and secure access, as well.

# Reference
- [Implementing Microservices on AWS](https://docs.aws.amazon.com/whitepapers/latest/microservices-on-aws/microservices.html)