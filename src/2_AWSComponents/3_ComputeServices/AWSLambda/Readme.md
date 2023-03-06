# AWS Lambda
- [AWS Lambda](https://aws.amazon.com/lambda/) is a compute service that lets you run code without provisioning or managing servers. 
- AWS Lambda runs your code on a [high-availability compute infrastructure](../../../1_HLDDesignComponents/0_SystemGlossaries/Reliability/HighAvailability.md) and performs all the administration of compute resources, including server and operating system maintenance, capacity provisioning and automatic scaling, code monitoring and logging. 
- With Lambda, you can run code for virtually any type of application or backend service. 
- All you need to do is [supply your code in one of the languages that Lambda supports](#supported-code-upload-options--languages).

# Supported Code Upload Options & Languages

![img.png](assets/Lambda-Code-Upload-Options.png)

# Who can invoke Lambda Functions? (event resources)

| Service                                                                                 | Method of Invocation                    | Description                                                                                                                                                                                                                                                                                                                                            |
|-----------------------------------------------------------------------------------------|-----------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Amazon API Gateway](../../1_NetworkingAndContentDelivery/AmazonAPIGateway/Readme.md)   | Event-driven; synchronous invocation    | API Gateway can directly call AWS Lambda function.<br/>- These events are considered synchronous events. Simply put, it means that when somebody is calling an API Gateway, it will trigger your Lambda function. <br/>- It's a synchronous event because your Lambda function has to respond to the client directly at the end of its invocation. |
| [Amazon S3](../../7_StorageServices/AmazonS3.md)                                        | Event-driven; asynchronous invocation   | S3 can be configured so that AWS Lambda function would be invoked automatically when a file is added in S3 bucket.                                                                                                                                                                                                                                 |
| [Amazon SQS](../../5_MessageBrokerServices/AmazonSQS.md)                                | Lambda polling                          | SQS can be configured so that AWS Lambda function would be invoked automatically when a new message arrives in SQS Queue.                                                                                                                                                                                                                          |
| [Amazon DynamoDB Stream](../../6_DatabaseServices/AmazonDynamoDB/DynamoDBStreams.md)    | Lambda polling                          | With [DynamoDB Streams](../../6_DatabaseServices/AmazonDynamoDB/DynamoDBStreams.md), you can trigger a Lambda function to perform additional work each time a DynamoDB table is updated. <br/>- Lambda reads records from the stream and invokes your function synchronously with an event that contains stream records.                                                                                         |
| [Amazon Kinesis](../../10_BigDataComponents/StreamProcessing/AmazonKinesis/Readme.md)   | Lambda polling                          | -                                                                                                                                                                                                                                                                                                                                                  |
| [Amazon EventBridge](../../5_MessageBrokerServices/AmazonEventBridge.md)                | Event-driven; asynchronous invocation   | -                                                                                                                                                                                                                                                                                                                                                  |
| [Amazon SNS](../../5_MessageBrokerServices/AmazonSNS.md)                                | Event-driven; asynchronous invocation   | -                                                                                                                                                                                                                                                                                                                                                  |
| [AWS Step Functions](../AWSStepFunctions.md)                                            | -                                       | AWS Step Function can call AWS Lambda, sequentially or parallel.                                                                                                                                                                                                                                                                                   |
| [Custom Code](https://docs.aws.amazon.com/lambda/latest/dg/lambda-invocation.html)      | -                                       | -                                                                                                                                                                                                                                                                                                                                                  |

[Read more](https://docs.aws.amazon.com/lambda/latest/dg/lambda-services.html)

# Lambda Features

| Name                                                                                                                                                             | Description                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Stateless                                                                                                                                                        | [Lambda is stateless](https://github.com/Ebazhanov/linkedin-skill-assessments-quizzes/blob/main/aws/aws-quiz.md), so it won't remember who a user is in between requests.                                                                                                                                                                                                                                                                              |
| [Function blueprints](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-features.html#gettingstarted-features-blueprints)                              | When you create a function in the Lambda console, you can choose to start from scratch, [use a blueprint](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-features.html), or use a container image.<br/>- A blueprint provides sample code that shows how to use Lambda with an AWS service or a popular third-party application.<br/>- Blueprints include sample code and function configuration presets for Node.js and Python runtimes. |
| [Tags](https://docs.aws.amazon.com/lambda/latest/dg/configuration-tags.html)                                                                                     | You can tag AWS Lambda functions to activate attribute-based access control (ABAC) and to organize them by owner, project, or department. <br/>- Tags are free-form key-value pairs that are supported across AWS services for use in ABAC, filtering resources, and adding detail to billing reports.                                                                                                                                                 |
| Security at rest                                                                                                                                                 | Lambda Handler, Layer, [Environment Variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html) are stored encrypted.                                                                                                                                                                                                                                                                                                          |
| Test locally using [AWS SAM CLI](AWSSAM.md)                                                                                                                      | [AWS SAM CLI](AWSSAM.md) can be used to test the Lambda function locally.                                                                                                                                                                                                                                                                                                                                                                              |
| Tracing of Lambda                                                                                                                                                | [AWS X-Ray](../../8_MonitoringServices/AWSXRay.md) can be used to trace Lambda code.                                                                                                                                                                                                                                                                                                                                                                   |
| [Logging Lambda API calls with CloudTrail](https://docs.aws.amazon.com/lambda/latest/dg/logging-using-cloudtrail.html)                                           | [AWS Cloudtrail](../../8_MonitoringServices/AWSCloudTrail.md) can be used to monitor invocations of Lambda functions.                                                                                                                                                                                                                                                                                                                                  |
| [Lambda logging](https://docs.aws.amazon.com/lambda/latest/dg/python-logging.html) (stored in [CloudWatch Logs](../../8_MonitoringServices/AmazonCloudWatch.md)) | Lambda logs all requests handled by your function and automatically stores logs generated by your code through [Amazon CloudWatch Logs](../../8_MonitoringServices/AmazonCloudWatch.md). <br/>- To validate your code, instrument it with custom logging statements.                                                                                                                                                                                   |
| AWS Lambda Function Permissions                                                                                                                                  | An [IAM resource-based policy](../../2_SecurityAndIdentityServices/AWSUsers&AccessMgmt/AWSIAM.md) controls the permissions to invoke the function.<br/>- An IAM execution role defines the permissions that control what the function is allowed to do when interacting with other AWS services.                                                                                                                                                       |

# Supported Configuration

| Config                                                                                                             | Type                      | Remarks                                                                                                                                                                                                     |
|--------------------------------------------------------------------------------------------------------------------|---------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Memory                                                                                                             | General                   | Example - 512 MB <br/>- Overprovision memory to run your functions faster and reduce your costs (since cost is calculated based on compute time).                                                           |
| Ephemeral storage                                                                                                  | General                   | Example - 512 MB                                                                                                                                                                                            |
| Timeout                                                                                                            | General                   | Example - 20 sec <br/>- Do not overprovision your function timeout settings.                                                                                                                                |
| [Lambda layer](https://docs.aws.amazon.com/lambda/latest/dg/invocation-layers.html)                                | Code                      | A Lambda layer is a .zip file archive that can contain additional code or other content, like libraries, config files etc.                                                                                  |
| [Lambda Handler](https://docs.aws.amazon.com/lambda/latest/dg/python-handler.html)                                 | Code                      | -                                                                                                                                                                                                           |
| [AWS KMS key](../../2_SecurityAndIdentityServices/AWSKMS.md)                                                       | Environment Variable      | -                                                                                                                                                                                                           |
| [Concurrency limit](https://aws.amazon.com/premiumsupport/knowledge-center/lambda-concurrency-limit-increase/)     | Concurrency               | If we set it to 0, the lambda would stop processing any events.                                                                                                                                             |

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

## Others
- Backup Jobs - Lambda can be used to configure backup scripts for the application.
- Automatic Jobs - Shutdown AWS resources at certain time.

# Anatomy of a Lambda function

````java
/*
- Event Object (book) - Data sent during Lambda Function Invocation
- Context Object - Methods available to interact with runtime information (request ID, log group etc.)
 */
public String handleRequest(Book book, Context context) {
    saveBook(book);
    return book.getName() + " saved!";
}
````

# Invoke AWS Lambda using AWS Cli

`aws lambda invoke --function-name ReturnBucketName outputfile.txt`

# Reference
- [AWS Lambda (The Heart of Serverless)](https://rochisha-jaiswal70.medium.com/aws-lambda-the-heart-of-serverless-9a5cdcb6e27c)
- [Invoking Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/lambda-invocation.html)
- [AWS Fargate vs. Lambda: Comparing Two Serverless Solutions and their Use Cases](https://www.simform.com/blog/aws-fargate-vs-lambda/)


