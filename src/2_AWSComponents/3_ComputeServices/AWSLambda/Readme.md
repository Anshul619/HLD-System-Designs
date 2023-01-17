
# AWS Lambda
- [AWS Lambda](https://aws.amazon.com/lambda/) is a compute service that lets you run code without provisioning or managing servers. 
- AWS Lambda runs your code on a [high-availability compute infrastructure](../../../1_HLDDesignComponents/0_SystemGlossaries/Reliability/HighAvailability.md) and performs all the administration of compute resources, including server and operating system maintenance, capacity provisioning and automatic scaling, code monitoring and logging. 
- With Lambda, you can run code for virtually any type of application or backend service. 
- All you need to do is [supply your code in one of the languages that Lambda supports](#supported-code-upload-options--languages).

# Supported Code Upload Options & Languages

![img.png](assets/Lambda-Code-Upload-Options.png)

# :star: Real world use cases of AWS Lambda

## Upload Image using Amazon S3 and Lambda

![img.png](../../0_AWSDesigns/DesignUploadImageAWSLambdaS3/assets/UploadImage-Lambda.drawio.png)

[Read more](../../0_AWSDesigns/DesignUploadImageAWSLambdaS3/README.md)

# Design Scalable System on AWS

![img.png](../../0_AWSDesigns/DesignScalableSystemWithRDMS/assets/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)

[Read more](../../0_AWSDesigns/DesignScalableSystemWithRDMS/README.md)

# Amazon SNS with Lambda

![img.png](../../5_MessageBrokerServices/assests/sns/FanOutPatternSQSSNS.png)

[Read more](../../5_MessageBrokerServices/AmazonSNS.md)

# AWS Step Functions with Lambda

![img.png](../assests/AWSStepFunctions.png)

[Read more](../AWSStepFunctions.md)

## Others
- Backup Jobs - Lambda can be used to configure backup scripts for the application.
- Automatic Jobs - Shutdown AWS resources at certain time.

# Who can invoke Lambda Functions? (event resources)
- [Amazon API Gateway](../../1_NetworkingAndContentDelivery/AmazonAPIGateway/Readme.md) - API Gateway can directly call AWS Lambda function.
- [Amazon S3](../../7_StorageServices/AmazonS3.md) - S3 can be configured so that AWS Lambda function would be invoked automatically when a file is added in S3 bucket.
- [Amazon SQS](../../5_MessageBrokerServices/AmazonSQS.md) - SQS can be configured so that AWS Lambda function would be invoked automatically when a new message arrives in SQS Queue.
- [Amazon DynamoDB](../../6_DatabaseServices/AmazonDynamoDB/Readme.md)
- [Amazon EventBridge](../../5_MessageBrokerServices/AmazonEventBridge.md)
- [Others](https://docs.aws.amazon.com/lambda/latest/dg/lambda-invocation.html)

# AWS Lambda Function Permissions
- An [IAM resource-based policy](../../2_SecurityAndIdentityServices/AWSUsers&AccessMgmt/AWSIAM.md) controls the permissions to invoke the function. 
- An IAM execution role defines the permissions that control what the function is allowed to do when interacting with other AWS services.

![img.png](https://miro.medium.com/max/1400/1*_KpXUpdyW8W37wsJjlnobw.jpeg)

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

# Reference
- [AWS Lambda (The Heart of Serverless)](https://rochisha-jaiswal70.medium.com/aws-lambda-the-heart-of-serverless-9a5cdcb6e27c)
- [Invoking Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/lambda-invocation.html)
- [AWS Fargate vs. Lambda: Comparing Two Serverless Solutions and their Use Cases](https://www.simform.com/blog/aws-fargate-vs-lambda/)


