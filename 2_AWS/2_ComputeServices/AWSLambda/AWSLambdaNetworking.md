# AWS lambda networking
- Lambda functions always operate from an AWS-owned VPC.
- By default, your function has full ability to make network requests to any public internet address — this includes access to any of the public AWS APIs.

![](https://d2908q01vomqb2.cloudfront.net/fc074d501302eb2b93e2554793fcaf50b3bf7291/2019/07/02/lambda-develope-mao-1024x484.jpg)

# VPC-enabled
- Once your function is [VPC-enabled](../../16_NetworkingAndContentDelivery/3_NetworkFoundationsVPC/Readme.md), all network traffic from your function is subject to the routing rules of your [VPC/Subnet](../../16_NetworkingAndContentDelivery/3_NetworkFoundationsVPC/Readme.md).
- If your function needs to interact with a public resource, you will need a route through a [NAT gateway in a public subnet](../../16_NetworkingAndContentDelivery/3_NetworkFoundationsVPC/Readme.md).

# References
- [Best Practices for Developing on AWS Lambda](https://aws.amazon.com/blogs/architecture/best-practices-for-developing-on-aws-lambda/)
- [How do I give internet access to a Lambda function that's connected to an Amazon VPC?](https://repost.aws/knowledge-center/internet-access-lambda-function)