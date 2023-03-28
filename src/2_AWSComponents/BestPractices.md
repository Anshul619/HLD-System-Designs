# Maintain resiliency
- A well-known best practice for cloud architecture is to use [Region-scoped, managed services]().
- These services come with availability and resiliency built in.
- When that is not possible, make sure your workload is replicated across multiple AZs.
- At a minimum, you should use two AZs.
- That way, if an AZ fails, your application will have infrastructure up and running in a second AZ to take over the traffic.

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679641200/e3b8x-vNw5aXnG1DYUfTwg/tincan/d03722b85f9d2b3a05e4c74bd586ea9b1f52f81a/assets/0cBxVcCitKwasoc4_bwzBuePADmVCRRJI.png)

# Go serverless/Cloud Native
Every definition of [serverless](https://aws.amazon.com/what-is/cloud-native/) mentions the following four aspects:
- No servers to provision or manage
- Scales with usage
- You never pay for idle resources
- Availability and fault tolerance are built-in

With serverless, you can spend time on the things that differentiate your application, rather than spend time on ensuring availability, scaling, and managing servers.

| Serverless Service                                             | Service Type   | Remarks |
|----------------------------------------------------------------|----------------|---------|
| [AWS Lambda](3_ComputeServices/AWSLambda/Readme.md)            | Compute        | -       |
| [AWS Fargate](3_ComputeServices/AWSFargate.md)                 | Compute        | -       |
| [Amazon DynamoDB](6_DatabaseServices/AmazonDynamoDB/Readme.md) | Database       | -       |
| [AWS Step Functions](3_ComputeServices/AWSStepFunctions.md)    | Compute        | -       |
| [AWS Batch](10_BigDataComponents/BatchProcessing/AWSBatch.md)  | Batch          | -       |
| [Amazon RDS](6_DatabaseServices/AmazonRDS/Readme.md)           | Database       | -       |

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679760000/JYmGMwB20J8gK2ybFtJ0GQ/tincan/674187_1676990596_p1gpq6pq781l3ntaa1fcbps6c0t4_zip/assets/EeOATVB6y1r_v8u__1kby3aQeiuXnYa4X-section1-services-in-AWS-serverless-platform_NOPROCESS_.jpg)

## Considerations for serverless applications
- Are you building, testing, and deploying applications frequently and want to focus only on your code and not on infrastructure?
- Are your applications less compute intensive?
- Are the applications that you are running or building small, simple, or modular?
  - Simple applications, such as chatbots or to-do lists that people can use to modify a list of things that they need to do, are good choices to move to serverless.
- Will you be using multiple AWS services where one service might need to call another service? 
  - For example, if someone uploads a file to Amazon Simple Storage Service (Amazon S3), will you then need to invoke other workflows to log the update or convert the file to HTML? Serverless is a very appropriate fit when you need one action to invoke other workflows within AWS.
- Do your applications finish quickly? 
  - Serverless is most suitable for applications that don't run longer than 15 minutes. 
  - Large, long-running, workloads, are expensive to run on serverless and not an optimal fit for this compute type.
