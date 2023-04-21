# AWS Elastic Beanstalk
- [AWS Elastic Beanstalk](https://aws.amazon.com/elasticbeanstalk/) deploys web applications so that you can focus on your business.
- With Elastic Beanstalk, developers upload their application. 
- Then, Elastic Beanstalk automatically handles the deployment details of capacity provisioning, load balancing, auto-scaling, and application health monitoring. 
- By using Elastic Beanstalk, developers can focus on developing their application and are freed from deployment-oriented tasks, such as provisioning servers, setting up load balancing, or managing scaling.

![](https://d1.awsstatic.com/Product-Page-Diagram_AWS-Elastic-Beanstalk%402x.6027573605a77c0e53606d5264ec7d3053bf26af.png)

# Deployment policies and settings

| Policy                                                                                                                     | Description                                                                                                                                                                                                                                                   |
|----------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Default](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.rolling-version-deploy.html)               | By default, your environment uses all-at-once deployments                                                                                                                                                                                                     |
| [Rolling deployments](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.rolling-version-deploy.html)   | With rolling deployments, Elastic Beanstalk splits the environment's [Amazon EC2 instances](../3_ComputeServices/AmazonEC2/Readme.md) into batches and deploys the new version of the application to one batch at a time.                                                          |
| [Immutable deployments](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.rolling-version-deploy.html) | Immutable deployments perform an immutable update to launch a full set of new instances running the new version of the application in a separate [Auto Scaling group](../3_ComputeServices/AmazonEC2/AutoScalingGroup/Readme.md), alongside the instances running the old version. |

# Remarks
- [Which AWS Elastic Beanstalk Deployment Method Should You Use?](https://blog.shikisoft.com/which_elastic_beanstalk_deployment_should_you_use/)
