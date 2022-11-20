# Amazon API Gateway
- [Amazon API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/welcome.html) is an AWS service for creating, publishing, maintaining, monitoring, and securing [REST, HTTP, and WebSocket APIs](../../../1_HLDDesignComponents/2_APITechOptions/REST.md) at any scale.
- [API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/welcome.html) allows you to [create your APIs programmatically by importing OpenAPI/Swagger specification](../../../1_HLDDesignComponents/2_APITechOptions/API_Dev_Documentation/Swagger/OpenAPISpec.md), using either the AWS API or the AWS Management Console. 
- [API Gateway serves as a front door to any web application](https://aws.amazon.com/api-gateway/features/) running on [Amazon EC2](../../4_ComputeServices/AmazonEC2), [Amazon ECS](../../4_ComputeServices/AmazonECS), [AWS Lambda](../../4_ComputeServices/AWSLambda/Readme.md), or in any on-premises environment. 
- [An API gateway](https://aws.amazon.com/premiumsupport/knowledge-center/api-gateway-cloudfront-distribution/) provides a single entry point for all API calls that come into an application, whether the app is hosted in an on-premises data center or on the cloud. 
- It accepts requests that come in remotely and returns the requested data.
- [API Gateway vs Elastic Load Balancer](../AmazonAPIGatewayVsELB.md)

![img.png](../../0_AWSDesigns/DesignScalableSystemWithRDMS/assets/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)

[Read more](../../0_AWSDesigns/DesignScalableSystemWithRDMS/README.md)

# How does API Gateway scale according to load?
- By default, [API Gateway]() can handle up to [10,000 requests per second](../../../1_HLDDesignComponents/0_SystemGlossaries/LatencyThroughput.md).
- When integrated with [AWS Lambda](../../4_ComputeServices/AWSLambda/Readme.md), the API Gateway handles the network scaling in a seamless way.
- [AWS Lambda](../../4_ComputeServices/AWSLambda/Readme.md) will scale to match the demand of invocations coming from the API clients.

# Key Features of Amazon API Gateway

![img.png](assets/AmazonAPIGateway_Features.drawio.png)

## Support for RESTful APIs and WebSocket APIs

## Private integrations with AWS ELB & AWS Cloud Map
- With API Gateway, you can route requests to private resources in [your VPC](../AmazonVPC.md). 
- Using HTTP APIs, you can build APIs for services behind [private ALBs, private NLBs](../ElasticLoadBalancer/Readme.md), and IP-based services registered in AWS Cloud Map, such as [ECS tasks](../../4_ComputeServices/AmazonECS/Readme.md).
  
## Resiliency
- API Gateway helps you manage traffic to your backend systems by allowing you to set [throttling rules](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-request-throttling.html) based on the number of requests per second for each HTTP method in your APIs.
- [AWS WAF](../../2_SecurityAndIdentityServices/AWSWAF.md) can also be configured on [API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-control-access-aws-waf.html) to protect the APIs (i.e. Rate Limiting, XSS Attack, SQL Injection etc.)

## AWS Authorization
- To authorize and verify API requests to AWS services, [API Gateway]() can help you leverage signature version 4 for REST APIs and WebSocket APIs. 
- Using signature version 4 authentication, you can use [AWS Identity and Access Management (IAM)](../../2_SecurityAndIdentityServices/AWSUsers&AccessMgmt/AWSIAM.md) and access policies to authorize access to your APIs and all your other AWS resources.
- You can also use [AWS Lambda functions](../../4_ComputeServices/AWSLambda/Readme.md) to verify and authorize bearer tokens such as JWT tokens or SAML assertions.

## Caching of API response
- The [response of the APIs can be cached](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-caching.html) in the API Gateway.

## API Keys for Third-Party Developers
- If you’re using REST APIs, API Gateway helps you manage the ecosystem of third-party developers accessing your APIs.
- You can create API keys on API Gateway, set fine-grained access permissions on each API key, and distribute them to third-party developers to access your APIs. 
- You can also define plans that set throttling and request quota limits for each individual API key. 
- The use of API keys is completely optional and must be enabled on a per-method level.

## API Lifecycle Management
- If you're using REST APIs, API Gateway lets you run multiple versions of the same API simultaneously so that applications can continue to call previous API versions even after the latest versions are published. 
- API Gateway also helps you manage multiple release stages for each API version, such as alpha, beta, and production.

# References
- [AWS re:Invent - I didn’t know Amazon API Gateway did that](https://www.youtube.com/watch?v=yfJZc3sJZ8E)
- [Implementing Microservices on AWS](https://docs.aws.amazon.com/whitepapers/latest/microservices-on-aws/microservices.html)
- [Can AWS API Gateway Act as a Load Balancer?](https://dashbird.io/blog/can-api-gateway-act-load-balancer/)
- [Building API-Driven Microservices with Amazon API Gateway - AWS Online Tech Talks](https://www.youtube.com/watch?v=xkDcBssNd1g)