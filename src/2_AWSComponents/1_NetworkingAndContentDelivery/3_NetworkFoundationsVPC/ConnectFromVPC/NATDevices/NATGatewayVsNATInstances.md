# NAT Gateways vs NAT Instances

| Attribute                                                     | :+1: NAT gateway       | :-1: NAT instance                                                                                        |
|---------------------------------------------------------------|------------------------|----------------------------------------------------------------------------------------------------------|
| Strongly suggested by AWS                                     | :white_check_mark: Yes | :x: No                                                                                                   |
| Availability                                                  | :+1: Highly available  | Use a script to manage failover between instances.                                                       |
| Maintenance                                                   | :+1: Managed by AWS    | Managed by you, for example, by installing software updates or operating system patches on the instance. |
| [Bastion servers](https://en.wikipedia.org/wiki/Bastion_host) | :x: Not supported      | :white_check_mark: Yes, use as a [bastion server](https://en.wikipedia.org/wiki/Bastion_host).           |
| Port forwarding                                               | :x: Not supported      | :white_check_mark: Yes, manually customize the configuration to support port forwarding.                 |
| Security Groups                                               | :x: Not supported      | :white_check_mark: Yes                                                                                   |

[Read more](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-comparison.html)