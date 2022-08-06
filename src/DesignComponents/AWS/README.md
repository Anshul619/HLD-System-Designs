
# AWS

Component| Service Type                    | Description                                                                                                |
-----------|---------------------------------|------------------------------------------------------------------------------------------------------------|
[HA - Region & Availability Zone](HA-Region-AZ.md)| HA-Availability Service         | AWS High Availability services - AWS Region & AWS Availability Zones                                       |
[Application Load Balancer](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/introduction.html)| Networking Service              | `Application Load Balancer` is highly available by default, in AWS.                                        |
[Amazon CloudFront](NetworkingServices/CloudFront.md) | Networking Service              | CDN Service - Securely deliver content with low latency and high transfer speeds                           |
[Amazon Route 53](NetworkingServices/AmazonRoute53.md)| Networking Service              | AWS DNS Service                                                                                            |
[Amazon EC2](ComputeServices/EC2.md) | Compute Service                 | Virtual Machine service                                                                                    |
[AWS Lamdba](ComputeServices/AWSLambda.md) | Compute Service                 | Run code without thinking about servers or clusters                                                        |
[AWS AutoScaling](AWSResourceMgmtServices/AutoScaling.md) | Compute Service                 | Auto-scaling of EC2 instances, based on demand & traffic                                                   |
[Amazon RDS](DatabaseServices/RDS.md) | Database Service                | Database management service for relational databases                                                       |
[Amazon Dynamo DB](DatabaseServices/DynamoDB.md) | Database Service                | NoSQL service                                                                                              |
[Amazon S3](StorageServices/AmazonS3.md) | Storage Service                 | Object storage built to retrieve any amount of data from anywhere                                          |
[Amazon EFS](StorageServices/AmazonEFS.md) | Storage Service                 | Shared File Storage between EC2 instances                                                                  |
[Amazon CloudWatch](MonitoringServices/CloudWatch.md) | Monitoring Service              | Monitor AWS Resources & set Alarms                                                                         |
[Amazon CloudTrail](MonitoringServices/CloudTrail.md) | Monitoring Service              | Monitor `Amazon Route 53 API` activities in AWS Account                                                    |
[Amazon Config](MonitoringServices/Config.md) | Monitoring Service              | Monitor Configration changes of AWS Resources                                                              |
[Amazon VPC](SecurityServices/VPC.md) | Security Service                | Define and launch AWS resources in a logically isolated virtual network                                    |
[AWS IAM](SecurityServices/IAM.md) | Security Service                | AWS User Management Service                                                                                |
[AWS Shield](SecurityServices/Shield.md) | Security Service                | DDOS Prevention Service                                                                                    |
[AWS WAF](SecurityServices/WAF.md) | Security Service                | Web Application Firewall Service                                                                           |
[Amazon SNS](MessageBrokerServices/AmazonSNS.md) | Message Broker Service          | Fully managed pub/sub messaging, SMS, email, and mobile push notifications                                 |
[Amazon SQS](MessageBrokerServices/AmazonSQS.md) | Message Broker Service          | Fully managed Message Queue Service                                                                        |
[Amazon MQ](MessageBrokerServices/AmazonMQ.md) | Message Broker Service          | Open Source ( ActiveMQ, RabbitMQ ) Queue Migration service                                                 |
[Amazon Elastic Cache](https://aws.amazon.com/elasticache/) | Cache Service                   | Fully Managed Redis or Memcache                                                                            |
[AWS Cloud Formation](AWSResourceMgmtServices/CloudFormation/CloudFormation.md) :star: | AWS Resource Management Service | Infrastructure as a CODE. Configure & manage complete AWS infrastructure through cloudformation templates. |
[Amazon EKS](AWSResourceMgmtServices/EKS.md) | AWS Resource Management Service | Fully managed Kubernates service                                                                           |
[Amazon ECS](AWSResourceMgmtServices/ECS.md) | AWS Resource Management Service | Containers as a service                                                                                    |
[Amazon Redshift](https://aws.amazon.com/redshift/) | Other Service                   | Redshift is a data warehouse product used in data analysis.                                                |
[AWS Beanstalk](https://aws.amazon.com/elasticbeanstalk/) | Management Service              | Servers Management - Easy to begin, Impossible to outgrow                                                  |
[Amazon EMR](ComputeServices/AmazonEMR.md) | Other Service                   | Fully Managed Service for Amazon Spark                                                                     |

# System Designs Using AWS
- [DesignScalableSystemWithRDMS](../../DesignScalableSystemWithRDMS)

# Centralized Logging Solution in AWS
- The essential services that can be used is `Amazon CloudWatch` logs, store them in `Amazon S3`, and then use `Amazon Elastic Search` to visualize them. 
- Amazon Kinesis Firehose can also be used to move the data from Amazon S3 to Amazon ElasticSearch.

# AWS Cost Exploration Services
- Check the Top Services Table
- Cost Explorer
- AWS Budgets
- Cost Allocation Tags

# [Why some services are called "AWS XXX" and the others "Amazon XXX"?](https://stackoverflow.com/questions/33125790/why-some-services-are-called-aws-xxx-and-the-others-amazon-xxx)
- Utility services are prefixed with AWS, while standalone services are prefixed by "Amazon".

# References
- [AWS Documentation Overview](https://aws.amazon.com/documentation-overview/)
- [AWS Interview Questions](https://www.simplilearn.com/tutorials/aws-tutorial/aws-interview-questions)
- [The Top 10 Most Used AWS Services](https://insider.ssi-net.com/insights/the-top-10-most-used-aws-services)