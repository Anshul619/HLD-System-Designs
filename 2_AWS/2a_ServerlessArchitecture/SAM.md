# AWS Serverless Application
- The [AWS Serverless Application Model (AWS SAM)](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/what-is-sam.html) is an open-source framework that you can use to build serverless applications on AWS.
- A serverless application is a combination of [Lambda functions](../2_ComputeServices/AWSLambda/Readme.md), [event bridge](../4_MessageBrokerServices/AmazonEventBridge.md), and other resources that work together to perform tasks.
- Note that a serverless application is more than just a Lambda function—it can include additional resources such as APIs, databases, and event source mappings.
- Its also helpful to test [Lambda functions](../2_ComputeServices/AWSLambda/Readme.md).

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679778000/8FKtVG5bi16yMwGJwknY-Q/tincan/674187_1676990596_p1gpq6pq781l3ntaa1fcbps6c0t4_zip/assets/EpdBXc9em0dl9j9o_XC7M7dZ1QnL1e53C-section4-sam-transform_NOPROCESS_.jpg)

# SAM features

| Feature          | Description                                                                                                                                                                                                   |
|------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| AWS SAM Template | Streamlined Cloudformation template for serverless applications.<br/>- SAM templates are a superset of Cloudformation. <br/>- Any Cloudformation template can be run through SAM unchanged, and it will work. |
| AWS SAM CLI      | Tool for local testing and debugging of serverless applications                                                                                                                                               |
| Deploy           | AWS SAM CLI command for deploying AWS SAM template                                                                                                                                                            |

# References
- [Introducing AWS SAM Pipelines: Automatically generate deployment pipelines for serverless applications](https://aws.amazon.com/blogs/compute/introducing-aws-sam-pipelines-automatically-generate-deployment-pipelines-for-serverless-applications/)
- [How to test serverless functions and applications?](https://docs.aws.amazon.com/lambda/latest/dg/testing-guide.html)