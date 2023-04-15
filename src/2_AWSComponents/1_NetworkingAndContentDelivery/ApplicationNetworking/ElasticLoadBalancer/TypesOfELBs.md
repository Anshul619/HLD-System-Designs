# Types of ELB Load Balancers

You can select the type of [load balancer](../../../../1_HLDDesignComponents/0_SystemGlossaries/Scalability/LoadBalancer.md) that best suits your needs.
- [Network Load Balancer](#network-load-balancer)
- [Application Load Balancer](#application-load-balancer)
- [Gateway Load Balancer](#gateway-load-balancer)

# Difference b/w Network Load Balancer and Application Load Balancer

| Basis                                                                                           | Network Load Balancer                                                                                  | Application Load Balancer                                                                                                                                                                               |
|-------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Supported Protocols                                                                             | TCP, UDP                                                                                               | HTTP, HTTPs                                                                                                                                                                                             |
| Supported Target Group Types                                                                    | [Instance](../../../3_ComputeServices/AmazonEC2/Readme.md), [IP](../../../3_ComputeServices/AWSFargate.md)   | [Instance](../../../3_ComputeServices/AmazonEC2/Readme.md), [IP](../../../3_ComputeServices/AWSFargate.md), [Lambda](../../../3_ComputeServices/AWSLambda/Readme.md)                                             |
| [Lambda](../../../3_ComputeServices/AWSLambda/Readme.md) as target group                           | :x: Not-Supported                                                                                      | :white_check_mark: Supported                                                                                                                                                                            |                                                                                                                               |
| Routing based on Source IP address, path, host, HTTP headers, HTTP method, and query string     | :x: Not-Supported                                                                                      | :white_check_mark: Supported<br/>- This would help with less number of load balancers and cost reduction.                                                                                               |
| Rough Throughput                                                                                | Millions of requests per second                                                                        | -                                                                                                                                                                                                       |
| Ideally Use Cases                                                                               | Microservices (if API gateway used), other apps                                                        | Microservices, Container-based apps                                                                                                                                                                     |
| Cross-zone Load Balancing                                                                       | Disabled by default                                                                                    | Enabled by default                                                                                                                                                                                      |
| User authentication                                                                             | :x: Not-Supported                                                                                      | :white_check_mark: Supported, ALB can authenticate users before they are allowed to pass through the load balancer.<br/>- Supports OpenID Connect protocol, SAML, LDAP, Microsoft Active Directory etc. |
| Fixed response                                                                                  | :x: Not-Supported                                                                                      | :white_check_mark: Supported, ALB has the ability to reply directly to the client with a fixed response, such as a custom HTML page.                                                                    |

# Network Load Balancer
- Choose a [Network Load Balancer](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/introduction.html) when you need ultra-high performance, TLS offloading at scale, centralized certificate deployment, support for UDP, and static IP addresses for your applications.
- Operating at the [connection level (TCD, UDP)](https://www.diffen.com/difference/TCP_vs_UDP), Network Load Balancers are capable of handling [millions of requests per second securely](../../../../1_HLDDesignComponents/0_SystemGlossaries/Scalability/LatencyThroughput.md) while maintaining [ultra-low latencies](../../../../1_HLDDesignComponents/0_SystemGlossaries/Scalability/LatencyThroughput.md).

# Application Load Balancer
- Choose an [Application Load Balancer](https://aws.amazon.com/elasticloadbalancing/application-load-balancer/) when you need a flexible feature set for your applications with [HTTP and HTTPS traffic](https://www.izooto.com/blog/understanding-http-https-protocols).
- Operating at the request level (HTTP, HTTPs), Application Load Balancers provide advanced routing and visibility features targeted at application architectures, including [microservices](../../../../1_HLDDesignComponents/1_MicroServicesSOA) and [containers](../../../../1_HLDDesignComponents/6_ContainerOrchestrationServices/Readme.md).
- Application Load Balancer allows for multiple applications (using [Content-based routing - /FOO, /BAR](https://aws.amazon.com/blogs/aws/new-advanced-request-routing-for-aws-application-load-balancers/) etc.) to be hosted behind a single load balancer.

## Key Features of ALB
- [Highly available](../../../../1_HLDDesignComponents/0_SystemGlossaries/Reliability/HighAvailability.md)
- [Health checks](https://aws.amazon.com/builders-library/implementing-health-checks/)
- [Session stickiness](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/sticky-sessions.html)
- [Content-based routing](https://aws.amazon.com/blogs/aws/new-advanced-request-routing-for-aws-application-load-balancers/)
- [WebSockets](https://aws.amazon.com/blogs/compute/using-websockets-and-load-balancers-part-two/)
- [Monitoring/logging](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-monitoring.html)
- Container based apps
- HTTP/2

# Gateway Load Balancer
- Choose a [Gateway Load Balancer](https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/introduction.html) when you need to deploy and manage a fleet of third-party virtual appliances that support GENEVE.
- These appliances enable you to improve security, compliance, and policy controls.