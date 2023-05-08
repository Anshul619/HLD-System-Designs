# AWS Web Application Firewall (WAF)
- [AWS Web Application Firewall (WAF)](https://aws.amazon.com/waf/) is a web application firewall service that lets you monitor web requests (& protect from web exploitations). 
- You can protect those resources based on conditions that you specify, such as the IP addresses that the requests originate from.
- With [WAF](https://aws.amazon.com/waf/), you can also create custom rules that block common attack patterns.

![img.png](https://d1.awsstatic.com/Product-Page-Diagram_AWS-Web-Application-Firewall%402x.5f24d1b519ed1a88b7278c5d4cf7e4eeaf9b75cf.png)

# Use Cases

| Use Case             | Remarks                                  |
|----------------------|------------------------------------------|
| Allow all requests   | -                                        |
| Prevent all requests | Block certain IP address                 |
| Rate Limiting        | Count all requests for a new policy etc. |

# :star: Supported AWS Services

| AWS Service                                                                                                             |
|-------------------------------------------------------------------------------------------------------------------------|
| [Amazon CloudFront distribution](../../1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonCloudFront.md)             |
| [Application Load Balancer](../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md) |
| [Amazon API Gateway API](../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/AmazonAPIGateway/Readme.md)       |
| [AWS AppSync GraphQL API](../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/AWSAppSync.md)                   |
| [Amazon Cognito user pool](../1_IdentityServices/AWSDirectoryServices/AmazonCognito.md)                                 |

# Configurable Conditions

| Condition                       |
|---------------------------------|
| IP Address & Ranges             |
| Patterns in HTTP Headers & body |
| URL String Patterns             |
| SQL Injection                   |
| Cross-site scripting            |

# WAF Rules

| Rule                                                                                                                       |
|----------------------------------------------------------------------------------------------------------------------------|
| [Rate-based rule statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-rate-based.html) |
| [AND rule statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-and.html)               |

[Read more](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rules.html)

