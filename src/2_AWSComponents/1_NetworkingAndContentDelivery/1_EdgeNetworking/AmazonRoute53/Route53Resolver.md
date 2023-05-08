# Route53 Resolver
- [Amazon Route 53 Resolver](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html) responds recursively to DNS queries from AWS resources for public records, Amazon VPC-specific DNS names, and Amazon Route 53 private hosted zones, and is available by default in all VPCs.

# Connect On-perm DNS server with Route53
- By default, [Route 53 Resolver]() automatically answers DNS queries for local VPC domain names for EC2 instances. 
- You can integrate DNS resolution between Resolver and DNS resolvers on your on-premises network by configuring forwarding rules.

| Endpoints                                                                                                                                                                |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Create an inbound endpoint on Route 53 Resolver and then DNS resolvers on the on-premises network can forward DNS queries to Route 53 Resolver via this endpoint.        |
| Create an outbound endpoint on Route 53 Resolver and then Route 53 Resolver can conditionally forward queries to resolvers on the on-premises network via this endpoint. |

![](https://docs.aws.amazon.com/images/Route53/latest/DeveloperGuide/images/Resolver-redo-final.png)