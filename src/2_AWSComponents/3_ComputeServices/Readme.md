
# Amazon Compute Services

| Service                                                               | Type                    | Remarks                                                                                                |
|-----------------------------------------------------------------------|-------------------------|--------------------------------------------------------------------------------------------------------|
| [Amazon EC2](AmazonEC2/Readme.md)                                     | Compute/Virtual Machine | -                                                                                                      |
| [Amazon ECS](../4_ContainerOrchestrationServices/AmazonECS/Readme.md) | Container Services      | -                                                                                                      |
| [Amazon EKS](../4_ContainerOrchestrationServices/AmazonEKS.md)        | Container Services      | -                                                                                                      |
| [AWS Lambda](AWSLambda/Readme.md)                                     | Serverless Services     | It best fits for tasks which don't need to run all the time, like Inventory Update, Printing jobs etc. |
| [AWS Fargate](AWSFargate.md)                                          | Serverless Services     | -                                                                                                      |
| [AWS Fargate vs Lambda](AWSFargateVsLambda.md)                        | Serverless Services     | -                                                                                                      |

# Defining compute
- Fundamentally, the definition of compute is to calculate or to solve a problem.
- In a physical computer the compute portion is the central processing unit (CPU), or the brains of the computer.

| Compute Resource | Measurement Unit                      | Description                                                                                                              |
|------------------|---------------------------------------|--------------------------------------------------------------------------------------------------------------------------|
| CPU              | Measured in units called milli-cores. | Application developers can specify how many allocated CPUs are required for running their application & to process data. |
| Memory           | Measured in bytes                     | -                                                                                                                        |

# Other links
- [Amazon EMR](../10_BigDataComponents/BatchProcessing/AmazonEMR.md)
- [AWS Step Functions](AWSStepFunctions.md)
