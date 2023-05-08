
|                       | [Transit Gateway](TransitGateway.md)                        | [VPC Peering](VPCPeering.md)                                            |
|-----------------------|-------------------------------------------------------------|-------------------------------------------------------------------------|
| Allowed connection    | 1-to-many VPC connection                                    | 1-to-1 VPC connection                                                   |
| Topology              | Hub-&-Spot network                                          | Full mesh network                                                       |
| :moneybag: Pricing    | VPC connection and data transmission charges                | Only data transmission charges                                          |
| Add or Remove VPC     | Easy<br/>- New VPC only needs to connect to transit gateway | Complex<br/>- All other VPCs would need a change to connect to new VPC. |
| Best Case             | Large organization with more than 10 VPCs                   | Less than 10 VPCs                                                       |
| Additional hoping     | Yes, hence might increase connection latency                | No                                                                      |
| Bandwidth Restriction | Restricted                                                  | No Restriction                                                          |

# References
- [AWS Connectivity - PrivateLink, VPC-Peering, Transit-gateway and Direct-connect](http://chinomsoikwuagwu.com/2020/04/02/AWS-Connectivity_PrivateLink_VPC-Peering_Transit-gateway_and_Direct-connect/)