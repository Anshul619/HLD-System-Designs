
# Site-to-Site VPN vs Direct Connect

| Feature             | [AWS Direct Connect](AWSDirectConnect.md)                                         | [AWS Site-to-Site VPN](AWSSiteToSiteVPN.md)                                     |
|---------------------|-----------------------------------------------------------------------------------|---------------------------------------------------------------------------------|
| Network bandwidth   | :white_check_mark: Starts from 50 Mbps and expands to 100 Gbps                    | Can reach 4 Gbps or less (low throughput)                                       |
| Network fluctuation | :white_check_mark: Network is not fluctuating & provides a consistent experience. | Connected with shared & public networks, so the bandwidth and latency fluctuate |
| Time to establish   | Requires experienced team, takes months to setup                                  | :white_check_mark: Easy                                                         |
| Connection type     | Private                                                                           | Encrypted connection over internet                                              |
| Security            | :x: No encryption by default                                                      | :white_check_mark: Connection is encrypted via IPSec                            |

# AWS Direct Connect plus VPN
- With [AWS Direct Connect](AWSDirectConnect.md) plus [VPN](AWSSiteToSiteVPN.md), you can combine [one or more AWS Direct Connect](AWSDirectConnect.md) dedicated network connections with the [Amazon VPC VPN](AWSSiteToSiteVPN.md).
- This combination provides an IPsec-encrypted private connection that also reduces network costs, increases bandwidth throughput, and provides a more consistent network experience than internet-based VPN connections.
- This solution combines the AWS managed benefits of the [VPN solution](AWSSiteToSiteVPN.md) with low latency, increased bandwidth, more consistent benefits of the [AWS Direct Connect solution](AWSDirectConnect.md), and an end-to-end, secure IPsec connection.
- [Read more](https://docs.aws.amazon.com/whitepapers/latest/aws-vpc-connectivity-options/aws-direct-connect-site-to-site-vpn.html)

![](https://docs.aws.amazon.com/images/whitepapers/latest/aws-vpc-connectivity-options/images/image10.png)