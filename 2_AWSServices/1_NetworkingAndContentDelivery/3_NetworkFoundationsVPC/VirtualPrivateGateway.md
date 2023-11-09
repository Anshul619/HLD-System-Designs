# Virtual Private Gateway
- A [virtual private gateway](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html) is the VPN endpoint on the Amazon side of [Site-to-Site VPN](../4_HybridConnectivity/AWSSiteToSiteVPN.md) or [Direct Connect](../4_HybridConnectivity/AWSDirectConnect.md) connection that can be attached to a [single VPC](Readme.md).
- Exactly one virtual private gateway can be attached to a VPC.
- A virtual private gateway does not support equal cost multi-path (ECMP) routing.

![img.png](assets/AWS_VPC.png)