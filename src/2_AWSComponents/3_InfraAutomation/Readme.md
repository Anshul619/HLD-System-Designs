
# Introduction

| Basis  | [EKS](AmazonEKS.md)                                                                                                     | [ECS](AmazonECS.md)                                                                 | [Fargate](../4_ComputeServices/AWSFargate.md)                                                                                                                                                |
|--------|-------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Intro  | Fully managed [Kubernetes](../../1_HLDDesignComponents/DevOps/Kubernates.md) service. It is easy to migrate existing Kubernates to AWS. | Fully managed container management service ( with EC2 auto-scaling support ). | Serverless compute for containers. Compatible with both [EKS](AmazonEKS.md) & [ECS](AmazonECS.md) i.e. these services can run with Fargate as deployment option, instead of EC2. |
| Pricing | `$72 per month per cluster` + EC2 instances cost                                                                  | Free AWS Service + EC2 instances cost                                                           | [No Upfront cost. Pay as per vCPU, memory GB usage](https://aws.amazon.com/fargate/pricing/)                                                                         

# References
- [AWS EC2 on ECS vs Fargate | Whats the Difference and When To Use What?](https://www.youtube.com/watch?v=DVrGXjjkpig)
- [AWS ECS vs EKS: 6 Key Differences](https://cloud.netapp.com/blog/aws-cvo-blg-aws-ecs-vs-eks-6-key-differences)
- [Elastic Beanstalk vs CloudFormation vs OpsWorks vs CodeDeploy](https://tutorialsdojo.com/elastic-beanstalk-vs-cloudformation-vs-opsworks-vs-codedeploy/)