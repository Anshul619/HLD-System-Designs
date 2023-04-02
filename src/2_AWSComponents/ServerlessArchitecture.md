# Serverless Architecture
Every definition of [serverless](https://aws.amazon.com/what-is/cloud-native/) mentions the following four aspects:
- No servers to provision or manage
- Scales with usage
- You never pay for idle resources
- Availability and fault tolerance are built-in

With serverless, you can spend time on the things that differentiate your application, rather than spend time on ensuring availability, scaling, and managing servers.

| Serverless Service                                                       | Service Type | Remarks                                                            |
|--------------------------------------------------------------------------|--------------|--------------------------------------------------------------------|
| :star: [AWS Lambda](3_ComputeServices/AWSLambda/Readme.md)               | Compute      | -                                                                  |
| [AWS Fargate](3_ComputeServices/AWSFargate.md)                           | Compute      | [AWS Fargate vs Lambda](3_ComputeServices/AWSFargateVsLambda.md)   |
| [AWS Step Functions](3_ComputeServices/AWSStepFunctions.md)              | Compute      | -                                                                  |
| [Amazon DynamoDB](6_DatabaseServices/AmazonDynamoDB/Readme.md)           | Database     | [Scaling Serverless DB](6_DatabaseServices/ScalingServerlessDB.md) |
| [Amazon Aurora](6_DatabaseServices/AmazonRDS/AmazonAurora.md)            | Database     | -                                                                  |
| [AWS Batch](10_BigDataComponents/BatchProcessing/AWSBatch.md)            | Batch        | -                                                                  |
| [API Gateway](1_NetworkingAndContentDelivery/AmazonAPIGateway/Readme.md) | API Gateway  | -                                                                  |


# Considerations for serverless applications

| Consideration                                                                                                                     | Remarks                                                                                                                                                                                                                                                                              |
|-----------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Are you building, testing, and deploying applications frequently and want to focus only on your code and not on infrastructure?   | -                                                                                                                                                                                                                                                                                    |
| Are your applications less compute intensive?                                                                                     | -                                                                                                                                                                                                                                                                                    |
| Are the applications that you are running or building small, simple, or modular?                                                  | Simple applications, such as chatbots or to-do lists that people can use to modify a list of things that they need to do, are good choices to move to serverless.                                                                                                                    |
| Will you be using multiple AWS services where one service might need to call another service?                                     | For example, if someone uploads a file to Amazon Simple Storage Service (Amazon S3), will you then need to invoke other workflows to log the update or convert the file to HTML? Serverless is a very appropriate fit when you need one action to invoke other workflows within AWS. |
| Do your applications finish quickly?                                                                                              | Serverless is most suitable for applications that don't run longer than 15 minutes.- Large, long-running, workloads, are expensive to run on serverless and not an optimal fit for this compute type.                                                                                |

# Fully-managed vs Self-Managed services

## Fully-managed Services
- Fully-managed resources are convenient and easy to manage.
- [You don’t need to worry about redundancy and failover of AWS managed service](../1_HLDDesignComponents/0_SystemGlossaries/Reliability/FaultTolerance.md). It all falls on Amazon.
- You don’t have to worry about backups, patches and fixes.
- AWS takes care of it all, and you can even choose a preferred service window for such tasks.

## Self-managed services
- It would be your responsibility from A to Z, to manage Self-managed resources.
- For example, in such a service you launch an EC2 instance and run all services you need inside that instance.
- You’re entirely responsible for patches, fixes, backups, [high availability](../1_HLDDesignComponents/0_SystemGlossaries/Reliability/HighAvailability.md), software versions, dependencies, network infrastructure, security, and so on.

Examples
- [Amazon EC2](3_ComputeServices/AmazonEC2/Readme.md)
- [Amazon RDS](6_DatabaseServices/AmazonRDS/Readme.md) - AZ, [Instance details](3_ComputeServices/AmazonEC2/Readme.md) need to be specified when launching a new database instance.
- [Amazon VPC](1_NetworkingAndContentDelivery/AmazonVPC.md)

# References
- [Fully-Managed vs Self-managed Services – Which One Do You Really Need?](https://bluesoft.com/blog/fully-managed-vs-self-managed-services-which-one-do-you-really-need/)