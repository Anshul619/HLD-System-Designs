
# AWS Data Services
- [Amazon RDS Aurora vs Other RDS DB engines](AmazonRDS/AmazonAuroraVsRDS.md)
- [Relational Databases](../../1_HLDDesignComponents/3_DatabaseComponents/Readme.md)
- [NoSQL Databases](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Readme.md)

# Server-based architecture

## Benefits of a server-based architecture
- Predictive tasks: For tasks that use constant or predictive compute, it may be more cost-effective to use server-based billing.
- Testing and debugging: Debugging is less complicated because there is visibility into backend processes and the application is not broken up into separate, smaller functions. It's difficult to replicate the serverless environment to see how code will actually perform once deployed.
- Fewer units of integration: Serverless architectures have lots of smaller components than with server-based architectures. This requires extra time to go into organizing the functions so they work in line with your data. 
- Overall control: The company owns and manages the infrastructure, which provides full control over all aspects of the application. 
- Compliance and security: Having full control over the infrastructure allows for full visibility, which may be required for compliance and security standards. 
- Legacy applications: Existing applications may not have the flexibility of decoupling individual parts and may be better suited to migrate to a server-based architecture.

## Server-based architecture - AWS Services
- [Amazon RDS](AmazonRDS/Readme.md)
- [Amazon EC2](../3_ComputeServices/AmazonEC2/Readme.md) - Deploy MySQL db on Amazon EC2.

# Benefits of a serverless architecture
- Server management: Because there is no backend infrastructure to be responsible for, liability is reduced and there is no system administration.
- Scalability: With a serverless architecture, you don’t have to think twice about provisioning infrastructure because of its ability to automatically scale with traffic volumes.
- Application flexibility: You can migrate individual application features or partial workloads to run on serverless as on-demand events. This frees up resources in production to be used for more critical tasks.
- Time to market: Smaller deployable units result in faster delivery of features to market, increasing the ability to adapt to change.
- Cost: The cost of hiring backend infrastructure engineers goes down, along with operational costs.
- Customer obsession: Abstraction from servers allows companies to dedicate more time and resources to developing and improving customer experience.
- Startup friendly: The serverless architecture pay-as-you-go model allows you to build an environment nearly for free and ease into the market without dealing with huge bills for minimum traffic.

## Serverless architecture - AWS Services
- [Amazon Aurora Serverless](AmazonRDS/AuroraServerless.md)
- [Amazon DynamoDB](AmazonDynamoDB/Readme.md)