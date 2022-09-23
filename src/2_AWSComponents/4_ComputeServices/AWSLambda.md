
# AWS Lambda
- `Lambda is a compute service that lets you run code without provisioning or managing servers.` 
- [AWS Lambda](https://aws.amazon.com/lambda/) runs your code on a [high-availability compute infrastructure](../../1_HLDDesignComponents/0_SystemGlossaries/HighAvailability.md) and performs all the administration of compute resources, including server and operating system maintenance, capacity provisioning and automatic scaling, code monitoring and logging. 
- With Lambda, you can run code for virtually any type of application or backend service. 
- All you need to do is supply your code in one of the languages that Lambda supports.

# Who can invoke Lambda Functions? (event resources)
- [Amazon API Gateway](../1_NetworkingAndContentDelivery/AmazonAPIGateway.md)
- [Amazon S3](../7_StorageServices/AmazonS3.md)
- [Amazon SQS](../5_MessageBrokerServices/AmazonSQS.md)
- [Amazon DynamoDB](../6_DatabaseServices/AmazonDynamoDB.md)
- [Manually from code through Amazon EventBridge](https://aws.amazon.com/eventbridge/)
- [Others](https://docs.aws.amazon.com/lambda/latest/dg/lambda-invocation.html)

# What languages does Lambda supports?

![img.png](https://miro.medium.com/max/1400/1*rHZDB-E3ZS8ZBBTHmr8DuA.png)

# AWS Lambda Function Permissions
- An [IAM resource-based policy](../2_SecurityAndIdentityServices/AWSIAM.md) controls the permissions to invoke the function. 
- An IAM execution role defines the permissions that control what the function is allowed to do when interacting with other AWS services.

![img.png](https://miro.medium.com/max/1400/1*_KpXUpdyW8W37wsJjlnobw.jpeg)

# :star: Real world use cases of AWS Lambda

## Upload Image using Amazon S3 and Lambda

![img.png](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/assets/UploadImage-Lambda.drawio.png)

[Read more](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/README.md)

## Backup Jobs
- Lambda can be used to configure backup scripts for the application.

# Reference
- [AWS Lambda (The Heart of Serverless)](https://rochisha-jaiswal70.medium.com/aws-lambda-the-heart-of-serverless-9a5cdcb6e27c)
- [Invoking Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/lambda-invocation.html)


