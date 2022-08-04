
# AWS

Component| Service Type                    | Description                                                                      |
-----------|---------------------------------|----------------------------------------------------------------------------------|
[HA - Region & Availability Zone](HA-Region-AZ.md)| HA-Availability Service         | AWS High Availability services - AWS Region & AWS Availability Zones             |
[Application Load Balancer](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/introduction.html)| Networking Service                  | `Application Load Balancer` is highly available by default, in AWS.              |
[Amazon CloudFront](NetworkingServices/CloudFront.md) | Networking Service              | CDN Service - Securely deliver content with low latency and high transfer speeds |
[Amazon Route 53](NetworkingServices/AmazonRoute53.md)| Networking Service              | AWS DNS Service                                                                  |
[Amazon EC2](ComputingServices/EC2.md) | Computing Service               | Virtual Machine service                                                          |
[AWS Lamdba](ComputingServices/AWSLambda.md) | Computing Service               | Run code without thinking about servers or clusters                              |
[AWS AutoScaling](ComputingServices/AutoScaling.md) | Computing Service               | Auto-scaling of EC2 instances, based on demand & traffic                         |
[Amazon RDS](DatabaseServices/RDS.md) | Database Service                | Database management service for relational databases                             |
[Dynamo DB](DatabaseServices/DynamoDB.md) | Database Service                | NoSQL service                                                                    |
[Amazon S3](FileStorageServices/AmazonS3.md) | File Storage Service            | Object storage built to retrieve any amount of data from anywhere                |
[EFS](FileStorageServices/AmazonEFS.md) | File Storage Service            | Shared File Storage between EC2 instances                                        |
[Amazon CloudWatch](MonitoringServices/CloudWatch.md) | Monitoring Service              | Monitor AWS Resources & set Alarms                                               |
[Amazon CloudTrail](MonitoringServices/CloudTrail.md) | Monitoring Service              | Monitor `Amazon Route 53 API` activities in AWS Account                          |
[Amazon Config](MonitoringServices/Config.md) | Monitoring Service              | Monitor Configration changes of AWS Resources                                    |
[Amazon VPC](SecurityServices/VPC.md) | Security Service                | Define and launch AWS resources in a logically isolated virtual network          |
[IAM](SecurityServices/IAM.md) | Security Service                       | AWS User Management Service                                                      |
[Shield](SecurityServices/Shield.md) | Security Service                       | DDOS Prevention Service                                                          |
[WAF](SecurityServices/WAF.md) | Security Service                       | Web Application Firewall Service                                                 |
[Amazon SNS](MessageBrokerServices/AmazonSNS.md) | Message Broker Service          | Fully managed pub/sub messaging, SMS, email, and mobile push notifications       |
[Amazon SQS](MessageBrokerServices/AmazonSQS.md) | Message Broker Service          | Fully managed Message Queue Service                                              |
[Amazon MQ](MessageBrokerServices/AmazonMQ.md) | Message Broker Service          | Open Source ( ActiveMQ, RabbitMQ ) Queue Migration service                       |
[Amazon Elastic Cache](https://aws.amazon.com/elasticache/) | Cache Service                   | Fully Managed Redis or Memcache                                                  |
[Cloud Formation](AWSResourcesProvisioningServices/CloudFormation.md) | AWS Resource Provisioning Service ||
[Amazon Redshift](https://aws.amazon.com/redshift/) | Other Service                   | Redshift is a data warehouse product used in data analysis.                      |
[AWS Beanstalk](https://aws.amazon.com/elasticbeanstalk/) | Other Service                   | Servers Management - Easy to begin, Impossible to outgrow                        |
[Amazon EMR](ComputingServices/AmazonEMR.md) | Other Service                   | Fully Managed Service for Amazon Spark                                           |

# System Designs Using AWS
- [DesignScalableSystemWithRDMS](../DesignScalableSystemWithRDMS)

# Centralized Logging Solution in AWS
- The essential services that can be used is `Amazon CloudWatch` Logs, store them in `Amazon S3`, and then use `Amazon Elastic Search` to visualize them. 
- Amazon Kinesis Firehose can also be used to move the data from Amazon S3 to Amazon ElasticSearch.

# AWS Cost Exploration Services
- Check the Top Services Table
- Cost Explorer
- AWS Budgets
- Cost Allocation Tags

# References
- [AWS Interview Questions](https://www.simplilearn.com/tutorials/aws-tutorial/aws-interview-questions)
- [The Top 10 Most Used AWS Services](https://insider.ssi-net.com/insights/the-top-10-most-used-aws-services)