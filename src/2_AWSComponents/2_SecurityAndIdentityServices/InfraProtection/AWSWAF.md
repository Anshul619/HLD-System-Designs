# AWS Web Application Firewall (WAF)
- [AWS Web Application Firewall (WAF)](https://aws.amazon.com/waf/) is a web application firewall service that lets you monitor web requests (& protect from web exploitations) that are forwarded to an [Amazon API Gateway API](../../1_NetworkingAndContentDelivery/ApplicationNetworking/AmazonAPIGateway), an [Amazon CloudFront distribution](../../1_NetworkingAndContentDelivery), or an [Application Load Balancer](../../1_NetworkingAndContentDelivery/ApplicationNetworking/ElasticLoadBalancer). 
- You can protect those resources based on conditions that you specify, such as the IP addresses that the requests originate from.
- With WAF, you can also create custom rules that block common attack patterns. 

It can be used for three cases: 
- Allow all requests 
- Prevent all requests
- Count all requests for a new policy etc.

![img.png](https://d1.awsstatic.com/Product-Page-Diagram_AWS-Web-Application-Firewall%402x.5f24d1b519ed1a88b7278c5d4cf7e4eeaf9b75cf.png)

# Configurable AWS Services

| AWS Service                                                                                                 |
|-------------------------------------------------------------------------------------------------------------|
| [Amazon API Gateway API](../../1_NetworkingAndContentDelivery/ApplicationNetworking/AmazonAPIGateway)       |
| [Amazon CloudFront distribution](../../1_NetworkingAndContentDelivery)                                      |
| [Application Load Balancer](../../1_NetworkingAndContentDelivery/ApplicationNetworking/ElasticLoadBalancer) |

# Configurable Conditions

| Condition                       |
|---------------------------------|
| IP Address & Ranges             |
| Patterns in HTTP Headers & body |
| URL String Patterns             |
| SQL Injection                   |
| Cross-site scripting            |

# WAF Rules
- [Rate-based rule statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-rate-based.html)
- [AND rule statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-and.html)
- [Read more](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rules.html)

