# Serverless Architecture
Every definition of [serverless](https://aws.amazon.com/serverless/) mentions the following four aspects:
- No servers to provision or manage
- Scales with usage
- You never pay for idle resources
- Availability and fault tolerance are built-in

> With serverless, you can spend time on the things that differentiate your application, rather than spend time on ensuring availability, scaling, and managing servers.

# Serverless Services

| Serverless Service                                                                               | Service Type        | Remarks                                                                                |
|--------------------------------------------------------------------------------------------------|---------------------|----------------------------------------------------------------------------------------|
| :star: [AWS Lambda](2_ComputeServices/AWSLambda/Readme.md)                                       | Compute             |                                                                                        |
| [AWS Fargate](2_ComputeServices/AWSFargate.md)                                                   | Compute             | [AWS Fargate vs Lambda](2_ComputeServices/AWSFargateVsLambda.md)                       |
| [AWS Step Functions](2_ComputeServices/AWSStepFunctions/Readme.md)                               | Compute             |                                                                                        |
| [Amazon DynamoDB](1_DatabaseServices/AmazonDynamoDB/Readme.md)                                   | Database            | [DynamoDB - Capacity Modes](1_DatabaseServices/AmazonDynamoDB/CapacityModes/Readme.md) |
| [Amazon Aurora Serverless](1_DatabaseServices/AmazonRDS/AmazonAurora/Serverless/Readme.md)       | Database            |                                                                                        |
| [AWS Batch](10_BigDataServices/DataProcessing/AWSBatch.md)                                       | Big Data Processing |                                                                                        |
| [AWS Glue](10_BigDataServices/DataProcessing/AWSGlue.md)                                         | Big Data Processing |                                                                                        |
| [API Gateway](16_NetworkingAndContentDelivery/2_ApplicationNetworking/AmazonAPIGateway/Readme.md) | API Gateway         |                                                                                        |
| [Amazon SQS](4_MessageBrokerServices/AmazonSQS/Readme.md)                                        | Message Broker      |                                                                                        |


# Considerations for serverless applications

| Consideration                                                                                                                   | Remarks                                                                                                                                                                                                                                                                              |
|---------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Is traffic too much spiky?                                                                                                      |                                                                                                                                                                                                                                                                                      |
| Are you building, testing, and deploying applications frequently and want to focus only on your code and not on infrastructure? |                                                                                                                                                                                                                                                                                      |
| Are your applications less compute intensive?                                                                                   |                                                                                                                                                                                                                                                                                      |
| Are the applications that you are running or building small, simple, or modular?                                                | Simple applications, such as chatbots or to-do lists that people can use to modify a list of things that they need to do, are good choices to move to serverless.                                                                                                                    |
| Will you be using multiple AWS services where one service might need to call another service?                                   | For example, if someone uploads a file to Amazon Simple Storage Service (Amazon S3), will you then need to invoke other workflows to log the update or convert the file to HTML? Serverless is a very appropriate fit when you need one action to invoke other workflows within AWS. |
| Do your applications finish quickly?                                                                                            | Serverless is most suitable for applications that don't run longer than 15 minutes.<br/>- Large, long-running, workloads, are expensive to run on serverless and not an optimal fit for this compute type.                                                                           |

# :star: Benefits of a serverless architecture

| Benefit                 | Description                                                                                                                                                                                     |
|-------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Server management       | Because there is no backend infrastructure to be responsible for, liability is reduced and there is no system administration.                                                                   |
| Scalability             | With a serverless architecture, you don’t have to think twice about provisioning infrastructure because of its ability to automatically scale with traffic volumes.                             |
| Application flexibility | You can migrate individual application features or partial workloads to run on serverless as on-demand events. <br/>- This frees up resources in production to be used for more critical tasks. |
| Time to market          | Smaller deployable units result in faster delivery of features to market, increasing the ability to adapt to change.                                                                            |
| Cost                    | The cost of hiring backend infrastructure engineers goes down, along with operational costs.                                                                                                    |
| Customer obsession      | Abstraction from servers allows companies to dedicate more time and resources to developing and improving customer experience.                                                                  |
| Startup friendly        | The serverless architecture pay-as-you-go model allows you to build an environment nearly for free and ease into the market without dealing with huge bills for minimum traffic.                |
| Example AWS Services    | [Amazon Aurora Serverless](1_DatabaseServices/AmazonRDS/AmazonAurora/Serverless/Readme.md), [Amazon DynamoDB](1_DatabaseServices/AmazonDynamoDB/Readme.md) etc.                                 |

# Benefits of a server-based architecture

| Benefit                    | Description                                                                                                                                                                                             |
|----------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Predictive tasks           | For tasks that use constant or predictive compute, it may be more cost-effective to use server-based billing.                                                                                           |
| Testing and debugging      | Debugging is less complicated because there is visibility into backend processes and the application is not broken up into separate, smaller functions.                                                 |
| Fewer units of integration | Serverless architectures have lots of smaller components than with server-based architectures. <br/>- This requires extra time to go into organizing the functions so they work in line with your data. |
| Overall control            | The company owns and manages the infrastructure, which provides full control over all aspects of the application.                                                                                       |
| Compliance and security    | Having full control over the infrastructure allows for full visibility, which may be required for compliance and security standards.                                                                    |
| Legacy applications        | Existing applications may not have the flexibility of decoupling individual parts and may be better suited to migrate to a server-based architecture.                                                   |
| Example AWS Services       | [Amazon RDS](1_DatabaseServices/AmazonRDS/Readme.md), [Amazon EC2](2_ComputeServices/AmazonEC2/Readme.md) etc.                                                                                          |

# References
- [Building well-architected serverless applications: Optimizing application costs](https://aws.amazon.com/blogs/compute/building-well-architected-serverless-applications-optimizing-application-costs/)
- [AWS Summit ASEAN 2023 | Composing integration patterns in serverless microservices (BOA301)](https://www.youtube.com/watch?v=ldTJaT-aZqU)
- [Serverless Patterns Collection](https://serverlessland.com/)