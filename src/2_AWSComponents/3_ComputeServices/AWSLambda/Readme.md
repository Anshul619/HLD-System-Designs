# AWS Lambda
- [AWS Lambda](https://aws.amazon.com/lambda/) is a compute service that lets you run code without provisioning or managing servers. 
- AWS Lambda runs your code on a [high-availability compute infrastructure](../../../1_HLDDesignComponents/0_SystemGlossaries/Reliability/HighAvailability.md) and performs all the administration of compute resources, including server and operating system maintenance, capacity provisioning and automatic scaling, code monitoring and logging. 
- With Lambda, you can run code for virtually any type of application or backend service, including data processing, real-time stream processing, machine learning, WebSockets, IoT backends, mobile backends, and web apps, like your corporate directory app!

# Lambda Features

| Feature                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Stateless                                                                                                                                                        | [Lambda is stateless](https://github.com/Ebazhanov/linkedin-skill-assessments-quizzes/blob/main/aws/aws-quiz.md), so it won't remember who a user is in between requests.                                                                                                                                                                                                                                                                                                                                                                                       |
| [Function blueprints](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-features.html#gettingstarted-features-blueprints)                              | When you create [a function](AWSLambdaFunctionHandler.md) in the Lambda console, you can choose to start from scratch, [use a blueprint](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-features.html), or use a container image.<br/>- A blueprint provides sample code that shows how to use Lambda with an AWS service or a popular third-party application.<br/>- Blueprints include sample code and function configuration presets for Node.js and Python runtimes.                                                                           |
| [AWS Lambda Function Permissions](AWSLambdaFunctionPermissions.md)                                                                                               | -                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [Test locally using AWS SAM CLI](AWSSAM.md)                                                                                                                      | [AWS SAM CLI](AWSSAM.md) can be used to test the Lambda function locally.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| Billing granularity                                                                                                                                              | You are charged for the number of times your code is triggered (requests) and for the time your code executes, rounded up to the nearest 1 ms (duration).<br/>- It can be cost effective to run functions whose execution time is very low, such as functions with durations under 100 ms or low latency APIs.<br/>[aws-lambda-power-tuning](https://serverlessrepo.aws.amazon.com/applications/arn:aws:serverlessrepo:us-east-1:451282441545:applications~aws-lambda-power-tuning) can be helpful for lambda billing estimation (to balance power & duration). |
| [AWS Lambda Invocation Methods](AWSLambdaInvocationMethods.md)                                                                                                   | -                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| [Tags](https://docs.aws.amazon.com/lambda/latest/dg/configuration-tags.html)                                                                                     | You can tag AWS Lambda functions to activate attribute-based access control (ABAC) and to organize them by owner, project, or department. <br/>- Tags are free-form key-value pairs that are supported across AWS services for use in ABAC, filtering resources, and adding detail to billing reports.                                                                                                                                                                                                                                                          |
| Security at rest                                                                                                                                                 | [Lambda Handler](AWSLambdaFunctionHandler.md), [Layer](https://docs.aws.amazon.com/lambda/latest/dg/invocation-layers.html), [Environment Variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html) are stored encrypted.                                                                                                                                                                                                                                                                                                             |

# Example Billing Chart

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679778000/8FKtVG5bi16yMwGJwknY-Q/tincan/674187_1676990596_p1gpq6pq781l3ntaa1fcbps6c0t4_zip/assets/9jj9baYx7Ns90EOx_hkx3R-cih9kSP0fG-section5-powertuning_NOPROCESS_.jpg)

# Supported Configuration

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679778000/8FKtVG5bi16yMwGJwknY-Q/tincan/674187_1676990596_p1gpq6pq781l3ntaa1fcbps6c0t4_zip/assets/y70oVlPffJPs8K1E_Me1eX79-DAnkJS3O-section5-memory-timeout-concurency_NOPROCESS_.png)

| Config                                                                                                                | Type                 | Remarks                                                                                                                                                                                                                                                    |
|-----------------------------------------------------------------------------------------------------------------------|----------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: Memory                                                                                                         | General              | Example - 512 MB <br/>- Over provision memory to run your functions faster and reduce your costs (since cost is calculated based on compute time).                                                                                                         |
| :star: Timeout                                                                                                        | General              | Example - 20 sec <br/>- Do not over-provision your function timeout settings.                                                                                                                                                                               |
| [Lambda Handler](AWSLambdaFunctionHandler.md)                                                                         | Code                 | -                                                                                                                                                                                                                                                          |
| Ephemeral storage                                                                                                     | General              | Example - 512 MB                                                                                                                                                                                                                                           |
| [Lambda layer](https://docs.aws.amazon.com/lambda/latest/dg/invocation-layers.html)                                   | Code                 | A Lambda layer is a .zip file archive that can contain additional code or other content, like libraries, config files etc.                                                                                                                                 |
| [AWS KMS key](../../2_SecurityAndIdentityServices/AWSKMS.md)                                                          | Environment Variable | -                                                                                                                                                                                                                                                          |

## Concurrency Types

| Type                                                                                                           | Description                                                                                                                                                                                                                                                                                                                                                                                                                 |
|----------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Unreserved concurrency                                                                                         | The amount of concurrency that is not allocated to any specific set of functions. The minimum is 100 unreserved concurrency. This allows functions that do not have any provisioned concurrency to still be able to run. If you provision all your concurrency to one or two functions, no concurrency is left for any other function. Having at least 100 available allows all your functions to run when they are invoked. |
| [Provisioned concurrency](https://docs.aws.amazon.com/lambda/latest/dg/provisioned-concurrency.html)           | Provisioned concurrency initializes a requested number of execution environments so that they are prepared to respond immediately to your function's invocations. <br/>- Note that configuring provisioned concurrency incurs charges to your AWS account.                                                                                                                                                                  |
| Reserved concurrency                                                                                           | Guarantees the maximum number of concurrent instances for the function. <br/>- When a function has reserved concurrency, no other function can use that concurrency. <br/>- No charge is incurred for configuring reserved concurrency for a function.<br/>- Address invocation errors                                                                                                                                      |
| [Concurrency limit](https://aws.amazon.com/premiumsupport/knowledge-center/lambda-concurrency-limit-increase/) | If we set it to 0, the lambda would stop processing any events. It achieves following<br/>- Limit costs<br/>- Regulate how long it takes you to process a batch of events.<br/>- Match it with a downstream resource that cannot scale as quickly as Lambda, for example - [Support 3rd-party API rate limiting](https://aws.amazon.com/blogs/architecture/rate-limiting-strategies-for-serverless-applications/)                                                                                                              |

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679778000/8FKtVG5bi16yMwGJwknY-Q/tincan/674187_1676990596_p1gpq6pq781l3ntaa1fcbps6c0t4_zip/assets/B8ulyC9jHgwQUzhu_0MyuljYHWRiXxMWL-section5-concurrency-4_NOPROCESS_.jpg)

# :star: Real world use cases of AWS Lambda

## Upload Image using Amazon S3 and Lambda

![img.png](../../0_AWSDesigns/DesignUploadImageAWSLambdaS3/assets/UploadImage-Lambda.drawio.png)

[Read more](../../0_AWSDesigns/DesignUploadImageAWSLambdaS3/README.md)

## Design Scalable System on AWS

![img.png](../../0_AWSDesigns/DesignScalableSystemWithRDMS/assets/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)

[Read more](../../0_AWSDesigns/DesignScalableSystemWithRDMS/README.md)

## Amazon SNS with Lambda

![img.png](../../5_MessageBrokerServices/assests/sns/FanOutPatternSQSSNS.png)

[Read more](../../5_MessageBrokerServices/AmazonSNS.md)

## AWS Step Functions with Lambda

![img.png](../assests/AWSStepFunctions.png)

[Read more](../AWSStepFunctions.md)

## Event Driven Architecture
- [AWS Lambda]() is an example of an [event-driven architecture](../../../1_HLDDesignComponents/0_SystemGlossaries/MessageBrokers/EventDrivenArchitecture.md). 
- Most AWS services generate events and act as an event source for Lambda. 
- Lambda runs custom code (functions) in response to events. 
- Lambda functions are designed to process these events and, once invoked, may initiate other actions or subsequent events.

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679760000/JYmGMwB20J8gK2ybFtJ0GQ/tincan/674187_1676990596_p1gpq6pq781l3ntaa1fcbps6c0t4_zip/assets/n7lPfdz9cXw2nQW4_mhonWP0ZZi0P1EpJ-section1-event-driven-arch-generic_NOPROCESS_.jpg)

## Others
- Backup Jobs - Lambda can be used to configure backup scripts for the application.
- Automatic Jobs - Shutdown AWS resources at certain time.

# :star: Performance Optimization

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679760000/JYmGMwB20J8gK2ybFtJ0GQ/tincan/674187_1676990596_p1gpq6pq781l3ntaa1fcbps6c0t4_zip/assets/9axqeJRv5a0m1AzA_ndk-zUMCnkXBiYf5-Cold-warmstart_NOPROCESS_.jpg)

## Best practice: Minimize cold start times
- After optimizing your function, another way to minimize cold starts is to use provisioned concurrency. 
- Provisioned concurrency is a Lambda feature that prepares concurrent execution environments before invocations.

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679760000/JYmGMwB20J8gK2ybFtJ0GQ/tincan/674187_1676990596_p1gpq6pq781l3ntaa1fcbps6c0t4_zip/assets/ptTBz9VO09hINDRg_VnlzV2MsTOeHU2Am.jpg)

A function with a provisioned concurrency of 6 has 6 runtime environments prepared before the invocations occur. 
- In the time between initialization (blue) and invocation (orange), the runtime environment (green) is prepared and ready.

## Best practice: Write functions to take advantage of warm starts
- Store and reference dependencies locally.
- Limit re-initialization of variables.
- Add code to check for and reuse existing connections.
- Use tmp space as transient cache.
- Check that background processes have completed.

# Monitoring & Troubleshooting

| Feature                                                                                                                                                           | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Tracing of Lambda using [AWS X-Ray](../../8_MonitoringServices/AWSXRay.md)                                                                                        | [AWS X-Ray](../../8_MonitoringServices/AWSXRay.md) can be used to trace Lambda code.<br/>- You can use AWS X-Ray to visualize the components of your application, identify performance bottlenecks, and troubleshoot requests that resulted in an error.                                                                                                                                                                                                                                                                                                         |
| [Logging Lambda API calls with CloudTrail](https://docs.aws.amazon.com/lambda/latest/dg/logging-using-cloudtrail.html)                                            | [AWS Cloudtrail](../../8_MonitoringServices/AWSCloudTrail.md) can be used to monitor invocations of Lambda functions.                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| [Lambda logging](https://docs.aws.amazon.com/lambda/latest/dg/python-logging.html) (stored in [CloudWatch Logs](../../8_MonitoringServices/AmazonCloudWatch.md))  | Lambda logs all requests handled by your function and automatically stores logs generated by your code through [Amazon CloudWatch Logs](../../8_MonitoringServices/AmazonCloudWatch.md). <br/>- To validate your code, instrument it with custom logging statements.                                                                                                                                                                                                                                                                                             |

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679778000/8FKtVG5bi16yMwGJwknY-Q/tincan/674187_1676990596_p1gpq6pq781l3ntaa1fcbps6c0t4_zip/assets/J0D4ybJVxPmbg2cQ_gkYnVRT5uH_n1p7f-section6-lambdaInsightDashboard_NOPROCESS_.jpg)

## Tracing using AWS X-Ray

[](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679778000/8FKtVG5bi16yMwGJwknY-Q/tincan/674187_1676990596_p1gpq6pq781l3ntaa1fcbps6c0t4_zip/assets/bF5I4tGniaVKZVky_QqSePg_IOBQ61jm4.jpg)

# Reference
- [AWS Lambda (The Heart of Serverless)](https://rochisha-jaiswal70.medium.com/aws-lambda-the-heart-of-serverless-9a5cdcb6e27c)
- [Invoking Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/lambda-invocation.html)
- [AWS Fargate vs. Lambda: Comparing Two Serverless Solutions and their Use Cases](https://www.simform.com/blog/aws-fargate-vs-lambda/)


