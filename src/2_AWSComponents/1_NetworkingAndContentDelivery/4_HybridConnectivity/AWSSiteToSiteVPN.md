# AWS Site to Site VPN
- [AWS Site-to-Site VPN](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html) enables you to securely connect your on-premises network to [Amazon VPC](../3_NetworkFoundationsVPC/Readme.md), for example your branch office site.
- [Site-to-Site VPN - Single and multiple connection examples](https://docs.aws.amazon.com/vpn/latest/s2svpn/Examples.html)

![img.png](../3_NetworkFoundationsVPC/assets/AWS_VPC.png)

# Components

| Component                                                                                    | Use Case                                          | Description                                                                                                                                                                                                                 |
|----------------------------------------------------------------------------------------------|---------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Virtual Private Gateway (VPN gateway)](../3_NetworkFoundationsVPC/VirtualPrivateGateway.md) | Connect to single VPC                             | A [virtual private gateway](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html) is the VPN endpoint on the Amazon side of your Site-to-Site VPN connection that can be attached to a [single VPC]().                |
| [Connect to Transit Gateway](../3_NetworkFoundationsVPC/ConnectBetweenVPCs/TransitGateway.md)                   | Connect to multiple VPCs                          | With [AWS Transit Gateway](../3_NetworkFoundationsVPC/ConnectBetweenVPCs/TransitGateway.md), you can simplify the connectivity between multiple VPCs and also connect to any VPC attached to AWS Transit Gateway with a single VPN connection. |
| [VPN CloudHub](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPN_CloudHub.html)              | Secure Connection b/w different Site-to-Site VPNs | If you have multiple AWS Site-to-Site VPN connections, you can provide secure communication between sites using the [AWS VPN CloudHub](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPN_CloudHub.html).                    |

# Transit Gateway with ECMP over multiple VPN connections
- [Read more](https://repost.aws/knowledge-center/transit-gateway-ecmp-multiple-tunnels)

![](https://assets-pt.media.datacumulus.com/aws-saa-pt/assets/pt3-q18-i1.jpg)