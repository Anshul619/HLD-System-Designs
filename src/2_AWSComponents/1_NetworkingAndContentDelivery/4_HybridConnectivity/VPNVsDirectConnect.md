
# VPN vs Direct Connect

|                     | [AWS Site-to-Site VPN](AWSSiteToSiteVPN.md)                                     | [AWS Direct Connect](AWSDirectConnect.md)                      |
|---------------------|---------------------------------------------------------------------------------|----------------------------------------------------------------|
| Network bandwidth   | Can reach 4 Gbps or less                                                        | Starts from 50 Mbps and expands to 100 Gbps                    |
| Network fluctuation | Connected with shared & public networks, so the bandwidth and latency fluctuate | Network is not fluctuating & provides a consistent experience. |
| Time to establish   | Easy                                                                            | Requires experienced team                                      |
| Security            | Connection is encrypted via IPSec                                               | No encryption by default                                       |

Note - In some cases, both VPN and Direct Connect can be used.
