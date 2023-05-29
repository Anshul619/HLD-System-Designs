# VPC Reachability Analyzer
- [Reachability Analyzer](https://docs.aws.amazon.com/vpc/latest/reachability/what-is-reachability-analyzer.html) is a configuration analysis tool that enables you to perform connectivity testing between a source resource and a destination resource in your [virtual private clouds (VPCs)](../3_NetworkFoundationsVPC/Readme.md).
- It is a network diagnostics tool that troubleshoots reachability between two endpoints in a VPC, or within multiple VPCs.
- It helps you to test connectivity and jump from an initial connection point on your network and iteratively test the connections between that point and a target.

# Supported Services
- Amazon EC2 instances
- VPN gateways
- Network interfaces
- Internet gateways
- VPC endpoints
- VPC peering connections
- Transit gateways

# Steps

| Step                                                  | Description                                                                                                                          |
|-------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|
| Create a path                                         | The first step is to specify the path of communication for the traffic from a source to a destination for any of the endpoint types. |
| Analyze the path                                      | After you create the path, Reachability Analyzer analyzes the path once.                                                             |
| View the results of the path analysis                 | Reachable & Not reachable                                                                                                            |
| Change the network configuration and analyze the path | If the reachability status does not match your intent, you can change your network configuration.                                    |

## Example status page

![](https://docs.aws.amazon.com/images/vpc/latest/reachability/images/unreachable-path.png)