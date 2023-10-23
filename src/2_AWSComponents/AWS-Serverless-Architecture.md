# Serverless Architecture
Every definition of [serverless](https://aws.amazon.com/what-is/cloud-native/) mentions the following four aspects:
- No servers to provision or manage
- Scales with usage
- You never pay for idle resources
- Availability and fault tolerance are built-in

With serverless, you can spend time on the things that differentiate your application, rather than spend time on ensuring availability, scaling, and managing servers.

# Serverless Services

| Serverless Service                                                                               | Service Type | Remarks                                                                         |
|--------------------------------------------------------------------------------------------------|--------------|---------------------------------------------------------------------------------|
| :star: [AWS Lambda](3_ComputeServices/AWSLambda/Readme.md)                                       | Compute      | -                                                                               |
| [AWS Fargate](3_ComputeServices/AWSFargate.md)                                                   | Compute      | [AWS Fargate vs Lambda](3_ComputeServices/AWSFargateVsLambda.md)                |
| [AWS Step Functions](3_ComputeServices/AWSStepFunctions.md)                                      | Compute      | -                                                                               |
| [Amazon DynamoDB](6_DatabaseServices/AmazonDynamoDB/Readme.md)                                   | Database     | [DynamoDB - Capacity Modes](6_DatabaseServices/AmazonDynamoDB/CapacityModes.md) |
| [Amazon Aurora](6_DatabaseServices/AmazonRDS/AmazonAurora/Readme.md)                             | Database     | -                                                                               |
| [AWS Batch](10_BigDataComponents/ETLServices/BatchProcessing/AWSBatch.md)                                    | Batch        | -                                                                               |
| [API Gateway](1_NetworkingAndContentDelivery/2_ApplicationNetworking/AmazonAPIGateway/Readme.md) | API Gateway  | -                                                                               |

# Considerations for serverless applications

| Consideration                                                                                                                   | Remarks                                                                                                                                                                                                                                                                              |
|---------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Is traffic too much spiky?                                                                                                      | -                                                                                                                                                                                                                                                                                    |
| Are you building, testing, and deploying applications frequently and want to focus only on your code and not on infrastructure? | -                                                                                                                                                                                                                                                                                    |
| Are your applications less compute intensive?                                                                                   | -                                                                                                                                                                                                                                                                                    |
| Are the applications that you are running or building small, simple, or modular?                                                | Simple applications, such as chatbots or to-do lists that people can use to modify a list of things that they need to do, are good choices to move to serverless.                                                                                                                    |
| Will you be using multiple AWS services where one service might need to call another service?                                   | For example, if someone uploads a file to Amazon Simple Storage Service (Amazon S3), will you then need to invoke other workflows to log the update or convert the file to HTML? Serverless is a very appropriate fit when you need one action to invoke other workflows within AWS. |
| Do your applications finish quickly?                                                                                            | Serverless is most suitable for applications that don't run longer than 15 minutes.<br/>- Large, long-running, workloads, are expensive to run on serverless and not an optimal fit for this compute type.                                                                           |

# Server-based vs serverless architecture

## Benefits of a server-based architecture

| Benefit                    | Description                                                                                                                                                                                       |
|----------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Predictive tasks           | For tasks that use constant or predictive compute, it may be more cost-effective to use server-based billing.                                                                                     |
| Testing and debugging      | Debugging is less complicated because there is visibility into backend processes and the application is not broken up into separate, smaller functions.                                           |
| Fewer units of integration | Serverless architectures have lots of smaller components than with server-based architectures. <br/>- This requires extra time to go into organizing the functions so they work in line with your data. |
| Overall control            | The company owns and manages the infrastructure, which provides full control over all aspects of the application.                                                                                 |
| Compliance and security    | Having full control over the infrastructure allows for full visibility, which may be required for compliance and security standards.                                                              |
| Legacy applications        | Existing applications may not have the flexibility of decoupling individual parts and may be better suited to migrate to a server-based architecture.                                             |
| Example AWS Services       | [Amazon RDS](6_DatabaseServices/AmazonRDS/Readme.md)<br/>- [Amazon EC2](3_ComputeServices/AmazonEC2/Readme.md)                                                                                    |

## Benefits of a serverless architecture

| Benefit                  | Description                                                                                                                                                                                     |
|--------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Server management        | Because there is no backend infrastructure to be responsible for, liability is reduced and there is no system administration.                                                                   |
| Scalability              | With a serverless architecture, you don’t have to think twice about provisioning infrastructure because of its ability to automatically scale with traffic volumes.                             |
| Application flexibility  | You can migrate individual application features or partial workloads to run on serverless as on-demand events. <br/>- This frees up resources in production to be used for more critical tasks. |
| Time to market           | Smaller deployable units result in faster delivery of features to market, increasing the ability to adapt to change.                                                                            |
| Cost                     | The cost of hiring backend infrastructure engineers goes down, along with operational costs.                                                                                                    |
| Customer obsession       | Abstraction from servers allows companies to dedicate more time and resources to developing and improving customer experience.                                                                  |
| Startup friendly         | The serverless architecture pay-as-you-go model allows you to build an environment nearly for free and ease into the market without dealing with huge bills for minimum traffic.                |
| Example AWS Services     | [Amazon Aurora Serverless](6_DatabaseServices/AmazonRDS/AmazonAurora/AuroraServerless.md)<br/>- [Amazon DynamoDB](6_DatabaseServices/AmazonDynamoDB/Readme.md)                                               |

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
- [Amazon RDS](6_DatabaseServices/AmazonRDS/Readme.md)
- [Amazon VPC](1_NetworkingAndContentDelivery/3_NetworkFoundationsVPC/Readme.md)

# References
- [Fully-Managed vs Self-managed Services – Which One Do You Really Need?](https://bluesoft.com/blog/fully-managed-vs-self-managed-services-which-one-do-you-really-need/)
- [Building well-architected serverless applications: Optimizing application costs](https://aws.amazon.com/blogs/compute/building-well-architected-serverless-applications-optimizing-application-costs/)