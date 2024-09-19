# Internet Gateway
- [An internet gateway](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Internet_Gateway.html) is a horizontally scaled, redundant, and highly available VPC component that allows communication between your VPC and the internet.
- It supports both IPv4 and IPv6 traffic.
- It does not cause availability risks or bandwidth constraints on your network traffic.

![img.png](assets/AWS_VPC.png)

# Features

| Feature                                                                     | Remarks                                                          |
|-----------------------------------------------------------------------------|------------------------------------------------------------------|
| Enables communication b/w VPC and internet                                  | A target in your VPC route tables for internet-routable traffic. |
| Network Address Translation (NAT) for instances with public IPv4 address    | -                                                                |
| Attached to VPC                                                             | -                                                                |
| Regional service                                                            | -                                                                |
| Highly available                                                            | -                                                                |
| [Egress-only internet gateway](ConnectFromVPC/EgressOnlyInternetGateway.md) | -                                                                |
