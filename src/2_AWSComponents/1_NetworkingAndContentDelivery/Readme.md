# AWS Networking
- AWS provides [networking and content delivery services](https://aws.amazon.com/products/networking/) to run your network and application workloads. 
- [Network design documents and diagrams](https://docs.aws.amazon.com/whitepapers/latest/establishing-your-cloud-foundation-on-aws/network-designing-and-planning.html) visualize the components of a network, including routers, firewalls, and devices, and also show how those components interact.

| AWS Service                                                                  | Tag                                                                                                                                                      | Remarks                                                                                                                                                  |
|------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| [VPC Peering](3_NetworkFoundations/VPCConnection/VPCPeering.md)                | Network Foundation                                                                                                                                       | VPC Peering offers point-to-point network connectivity between two VPCs.                                                                                 |
| [AWS Cloud WAN](https://aws.amazon.com/cloud-wan/)                           | [Hybrid Connectivity](https://docs.aws.amazon.com/whitepapers/latest/building-scalable-secure-multi-vpc-network-infrastructure/hybrid-connectivity.html) | -                                                                                                                                                        |
| [AWS Cloud VPN](https://aws.amazon.com/vpn/)                                 | [Hybrid Connectivity](https://docs.aws.amazon.com/whitepapers/latest/building-scalable-secure-multi-vpc-network-infrastructure/hybrid-connectivity.html) | AWS Client VPN enables you to securely connect users to AWS or on-premises networks, for example remote employees.                                       |
| [AWS Site-to-Site VPN](4_HybridConnectivity/AWSSiteToSiteVPN.md)               | [Hybrid Connectivity](https://docs.aws.amazon.com/whitepapers/latest/building-scalable-secure-multi-vpc-network-infrastructure/hybrid-connectivity.html) | AWS Site-to-Site VPN enables you to securely connect your on-premises network to Amazon VPC, for example your branch office site.                        |
| [AWS Global Accelerator](1_EdgeNetworking/AWSGlobalAccelerator.md)             | [Edge Networking](https://aws.amazon.com/products/networking/edge-networking/)                                                                           | -                                                                                                                                                        |

# Types of Network Protocols and Their Uses
- [Communication](https://www.geeksforgeeks.org/types-of-network-protocols-and-their-uses/)
- [Management](https://www.geeksforgeeks.org/types-of-network-protocols-and-their-uses/)
- [Security](https://www.geeksforgeeks.org/types-of-network-protocols-and-their-uses/)

# How to reduce network distance?
AWS offers networking features to reduce network distance or jitter.
- [Amazon Route 53 latency routing](1_EdgeNetworking/AmazonRoute53.md)
- [Amazon VPC endpoints](3_NetworkFoundations/AmazonVPC/VPCEndpoints.md)
- [AWS Direct Connect](4_HybridConnectivity/AWSDirectConnect.md)
- [AWS Global Accelerator](1_EdgeNetworking/AWSGlobalAccelerator.md)

# Comparisons

| Comparison                                                                                       |
|--------------------------------------------------------------------------------------------------|
| [VPC Peering vs Transit Gateway](3_NetworkFoundations/VPCConnection/VPCPeeringVsTransitGateway.md) |
| [Site-to-Site VPN vs Direct Connect](4_HybridConnectivity/VPNVsDirectConnect.md)                   |

# Network Design

A life-cycle network design defines the network, removes assumptions, and helps to create a baseline.  The network design process follows these steps:
- Identify initial and new requirements.
- Compare the current network to the requirements.
- Design the network, add in hardware, software, configurations at a high level, then in detail.
- Deploy the network.
- Monitor, review, and improve.









