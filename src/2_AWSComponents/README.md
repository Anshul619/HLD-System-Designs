
# Introduction
- AWS manages its [global architecture](AWS-Global-Architecture-Region-AZ.md) through region and availability zones.
- [Amazon Resouce Name (ARN)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) uniquely identify AWS resources.
- [Utility services](https://stackoverflow.com/questions/33125790/why-some-services-are-called-aws-xxx-and-the-others-amazon-xxx) are prefixed with `AWS`, while standalone services are prefixed by `Amazon`.

![img.png](0_AWSDesigns/DesignMultiRegionActiveActiveArchitectureOnAWS/AWS-AZ-Region-HA.drawio.png)

# Design Scalable System on AWS
![img.png](0_AWSDesigns/DesignScalableSystemWithRDMS/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)

# AWS - System Designs
- :star: [Design Multi-Region Active-Active Architecture On AWS](0_AWSDesigns/DesignMultiRegionActiveActiveArchitectureOnAWS)
- :star: [Design Scalable System on AWS](0_AWSDesigns/DesignScalableSystemWithRDMS)
- [Fanout Pattern with Amazon SNS & SQS](0_AWSDesigns/FanoutPatternSNSSQS.md)
- [WP Site with Amazon CloudFront & S3](0_AWSDesigns/WPSiteCloudFront&S3.md)
- [Microservices On AWS](0_AWSDesigns/MicroservicesOnAWS.md)

# AWS - Comparisons b/w Services
- [Amazon Aurora vs RDS](6_DatabaseServices/AWSAuroraVsRDS.md)
- [Amazon SQS vs SNS](../1_HLDDesignComponents/4_MessageBrokers/KafkaVsRabbitMQVsSQSVsSNS.md)
- [Amazon S3 vs EFS vs EBS](7_StorageServices/S3vsEFSvsEBS.md)
- [Amazon ECS vs EKS vs Fargate](3_InfraAutomation/EKSvsECSvsFargate.md)

# AWS - Various Services

Service| Type                                                                  | Description                                                                                                                                                                   |
-----------|-----------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
:star: [Amazon Route 53](1_NetworkingAndContentDelivery/AmazonRoute53.md)| [Networking & Content Delivery Service](1_NetworkingAndContentDelivery) | `AWS DNS Service`                                                                                                                                                             |
:star: [AWS IAM](2_SecurityAndIdentityServices/AWSIAM.md) | [Security Service](2_SecurityAndIdentityServices)                       | AWS User Management Service                                                                                                                                                   |
:star: [Amazon VPC](2_SecurityAndIdentityServices/AmazonVPC.md) | [Security Service](2_SecurityAndIdentityServices)                       | Define and launch AWS resources in a logically isolated virtual network                                                                                                       |
:star: [Amazon Elastic Load Balancer](1_NetworkingAndContentDelivery/ElasticLoadBalancer.md)| [Networking & Content Delivery Service](1_NetworkingAndContentDelivery) | `AWS Load Balancer Service`                                                                                                                                                   |
:star: [Amazon CloudFront](1_NetworkingAndContentDelivery/AmazonCloudFront.md) | [Networking & Content Delivery Service](1_NetworkingAndContentDelivery) | AWS Low-Latency [CDN Service](../1_HLDDesignComponents/0_SystemGlossaries/CDNs.md), which securely delivers content with `low latency and high transfer speeds`               |
:star: [Amazon S3](7_StorageServices/AmazonS3.md) | [Storage Service](7_StorageServices)                                    | `Object storage` built to retrieve any amount of data from anywhere. `Cost effective & mostly used storage service in AWS`                                                    |
:star: [AWS EC2 AutoScaling](4_ComputeServices/EC2/AWSEC2AutoScaling.md) | [Compute Service](4_ComputeServices)                                    | Auto-scaling of [EC2 instances](4_ComputeServices/EC2/ReadMe.md), based on demand & traffic ( CPU, Memory ).                                                                  |
:star: [Amazon EC2](4_ComputeServices/EC2/ReadMe.md) | [Compute Service](4_ComputeServices)                                    | `Self-Managed Virtual Machine` that run the application in the cloud.                                                                                                         |
:star: [Amazon Aurora](6_DatabaseServices/AmazonAurora/Readme.md) | [Database Service](6_DatabaseServices)                                  | DB management service for Postgres and MySQL ( faster & more reliable than RDS )                                                                                              |
:star: [Amazon Elastic Cache](6_DatabaseServices/AmazonElasicCache.md) | [Database Service](6_DatabaseServices)                                                         | Fully Managed [Redis & Memcache](../1_HLDDesignComponents/3_DatabaseComponents/Redis/README.md) service                                                               |
:star: [Amazon SQS](5_MessageBrokerServices/AmazonSQS.md) | [Message Broker Service](5_MessageBrokerServices)                       | Fully managed Message Queue Service                                                                                                                                           |
:star: [Amazon Dynamo DB](6_DatabaseServices/AmazonDynamoDB.md) | [Database Service](6_DatabaseServices)                                  | Fully managed NoSQL service                                                                                                                                                   |
:star: [Amazon CloudWatch](8_MonitoringServices/AmazonCloudWatch.md) | [Monitoring Service](8_MonitoringServices)                              | Monitor AWS Resources & set Alarms                                                                                                                                            |
:star: [Amazon ECS](3_InfraAutomation/AmazonECS.md) | [AWS Infrastructure Automation](3_InfraAutomation)               | `Containers as a service`.                                                                                                                                                    |
:star: [AWS Fargate ](4_ComputeServices/AWSFargate.md) | [Compute Service](4_ComputeServices)                                    | Serverless compute for containers. Compatible with both [EKS](EKS.md) & [ECS](ECS.md) i.e. these services can run with Fargate as deployment option, instead of EC2.          |
[Amazon EKS](3_InfraAutomation/AmazonEKS.md) | [AWS Infrastructure Automation](3_InfraAutomation)                 | Fully managed [Kubernetes](../1_HLDDesignComponents/6_DevOps/Kubernates.md) service                                                                                           |
[AWS Cloud Formation](3_InfraAutomation/AWSCloudFormation/Readme.md) | [AWS Infrastructure Automation](3_InfraAutomation)                   | `Infrastructure as a CODE`. Configure & manage complete AWS infrastructure through cloudformation templates ( yaml or json ).                                                 |
[Amazon API Gateway](1_NetworkingAndContentDelivery/AmazonAPIGateway.md)| [Networking & Content Delivery Service](1_NetworkingAndContentDelivery) | API Gateway for microservices implementation.                                                                                                                                 |
[Amazon SNS](5_MessageBrokerServices/AmazonSNS.md) | [Message Broker Service](5_MessageBrokerServices)                       | Fully managed pub/sub messaging, SMS, email, and mobile push notifications                                                                                                    |
[Amazon RDS](6_DatabaseServices/AmazonRDS.md) | [Database Service](6_DatabaseServices)                                  | Database management service for relational databases                                                                                                                          |
[Amazon EFS](7_StorageServices/AmazonEFS.md) | [Storage Service](7_StorageServices)                                    | Shared File Storage between [EC2 instances](4_ComputeServices/EC2/ReadMe.md)                                                                                                  |
[AWS Lamdba](4_ComputeServices/AWSLambda.md) | [Compute Service](4_ComputeServices)                                    | Run code without thinking about servers or clusters.                                                                                                                          |
[Amazon CloudTrail](8_MonitoringServices/AWSCloudTrail.md) | [Monitoring Service](8_MonitoringServices)                              | Monitor [Amazon Route 53 API](1_NetworkingAndContentDelivery/AmazonRoute53.md) activities in AWS Account                                                                      |
[Amazon Config](8_MonitoringServices/AWSConfig.md) | [Monitoring Service](8_MonitoringServices)                              | Monitor Configration changes of AWS Resources                                                                                                                                 |
[AWS Shield](2_SecurityAndIdentityServices/AWSShield.md) | [Security Service](2_SecurityAndIdentityServices)                       | DDOS Prevention Service                                                                                                                                                       |
[AWS WAF](2_SecurityAndIdentityServices/AWSWAF.md) | [Security Service](2_SecurityAndIdentityServices)                       | Web Application Firewall Service                                                                                                                                              |
[Amazon MQ](5_MessageBrokerServices/AmazonMQ.md) | [Message Broker Service](5_MessageBrokerServices)                       | Open Source ( [ActiveMQ](../1_HLDDesignComponents/4_MessageBrokers/ActiveMQ.md), [RabbitMQ](../1_HLDDesignComponents/4_MessageBrokers/RabbitMQ.md) ) Queue Migration service  |
[Amazon OpenSearch service](https://aws.amazon.com/opensearch-service/) | [Database Service](6_DatabaseServices)                                  | Successor to Amazon [ElasticSearch](../1_HLDDesignComponents/3_DatabaseComponents/ElasticSearch) Service, includes built in OpenSearch Dashboard and Kibana                   |
[Amazon Redshift](https://aws.amazon.com/redshift/) | Other Service                                                         | Redshift is a data warehouse product used in data analysis.                                                                                                                   |
[AWS Elastic Beanstalk](https://aws.amazon.com/elasticbeanstalk/) | [AWS Infrastructure Automation](3_InfraAutomation)                | Servers Management - Easy to begin, Impossible to outgrow                                                                                                                     |
[Amazon EMR](4_ComputeServices/AmazonEMR.md) | Other Service                                                         | Fully Managed Service for [Apache Spark](../1_HLDDesignComponents/8_BigDataTools/ApacheSpark.md)                                                                              |
[AWS Private Link](https://aws.amazon.com/privatelink) |[Networking & Content Delivery Service](1_NetworkingAndContentDelivery)| Establish private connectivity between [Amazon VPC](2_SecurityAndIdentityServices/AmazonVPC.md) and services hosted on AWS or on-premises, without exposing data to the internet. |

# AWS - Cost Exploration Services
- [Cost Explorer](https://aws.amazon.com/aws-cost-management/aws-cost-explorer/)
- [AWS Budgets](https://aws.amazon.com/aws-cost-management/aws-budgets/)
- [Cost Allocation Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)

# Source(s) and further reading
- [AWS Documentation Overview](https://aws.amazon.com/documentation-overview/)
- [AWS Interview Questions](https://www.simplilearn.com/tutorials/aws-tutorial/aws-interview-questions)
- [The Top 10 Most Used AWS Services](https://insider.ssi-net.com/insights/the-top-10-most-used-aws-services)
- [Is Amazon RDS for PostgreSQL or Amazon Aurora PostgreSQL a better choice for me?](https://aws.amazon.com/blogs/database/is-amazon-rds-for-postgresql-or-amazon-aurora-postgresql-a-better-choice-for-me/)