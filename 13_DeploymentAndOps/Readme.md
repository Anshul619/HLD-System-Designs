# Deployment Techniques

| Technique                                                                                                                 | Remarks                                                                                                                                                                                                                                                                                                                                                                                                                                     |
|---------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Canary Deployments](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.concept.canary-deployment.en.html) | [Canary or Staged Deployments or Rolling Upgrades](https://wa.aws.amazon.com/wellarchitected/2020-07-02T19-33-23/wat.concept.canary-deployment.en.html) are a pattern for rolling out releases to a subset of users or servers.<br/>- The idea is to first deploy the change to a small subset of servers, test it and then rollout the change out to rest of the servers.                                                                  |
| [Blue-Green Deployment](https://circleci.com/blog/canary-vs-blue-green-downtime/)                                         | [Blue-green deployment](https://circleci.com/blog/canary-vs-blue-green-downtime/) splits the application environment into two equally-resourced sections, Blue and Green. <br/>- You serve the current application on one half of your environment (Blue) using your load balancer to direct traffic. <br/>- You can then deploy your new application to the other half of your environment (Green) without affecting the blue environment. |
| Simple Deployment                                                                                                         | Simple deployment with new version, updating on old versions.                                                                                                                                                                                                                                                                                                                                                                               |

# Blue-Green Deployment

![](https://webplutora.wpenginepowered.com/wp-content/uploads/2022/05/Asset-159Deployment-Methods-1536x477.png)

# Canary Deployment

![](https://webplutora.wpenginepowered.com/wp-content/uploads/2022/05/Asset-160Deployment-Methods-931x1024.png)

# AWS Supported Services for Canary or Blue-Green deployment

| AWS Service                                                                                                                                                | Remarks |
|------------------------------------------------------------------------------------------------------------------------------------------------------------|---------|
| [Route53 Weighted Routing Policy](https://github.com/Anshul619/AWS-Services/tree/main/16_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonRoute53/Readme.md) |         |
| [Global Accelerator](https://github.com/Anshul619/AWS-Services/tree/main/16_NetworkingAndContentDelivery/1_EdgeNetworking/AWSGlobalAccelerator.md)         |         |
| [Elastic Load Balancer](https://github.com/Anshul619/AWS-Services/tree/main/16_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md) |         |
| [Code Deploy](https://github.com/Anshul619/AWS-Services/tree/main/9_InfrastructureAsCode/AWSCodePipeline.md)                                               |         |

# Reference
- [Canary vs blue-green deployment to reduce enterprise downtime](https://circleci.com/blog/canary-vs-blue-green-downtime/)
