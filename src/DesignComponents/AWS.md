
# AWS

Component|Description|
-----------|---------------------------------|
CloudWatch| Cloudwatch is a monitoring service that gives you visibility into the performance and health of your AWS resources and applications. Depending on multiple metrics, it participates in triggering alarms. Helps in monitoring the AWS environments like CPU utilization, EC2, Amazon RDS instances, Amazon SQS, S3, Load Balancer, SNS, etc.|
CloudTrail|Cloudtrail is a service that logs AWS account activity and API usage for risk auditing, compliance and monitoring|
[Route 53](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/Welcome.html)| Amazon Route 53 is a highly available and scalable Domain Name System (DNS) web service. You can use Route 53 to perform three main functions in any combination: domain registration, DNS routing, and health checking |
[Availability Zone](https://aws.amazon.com/about-aws/global-infrastructure/regions_az/)| An Availability Zone (AZ) is one or more discrete data centers with redundant power, networking, and connectivity in an AWS Region. AZs give customers the ability to operate production applications and databases that are more highly available, fault tolerant, and scalable than would be possible from a single data center|
Application Load Balancer | Recommended|
Amazon Elastic Cache | Managed Redis or Memcache |
What is AWS CloudFormation? | AWS CloudFormation is a service that helps you model and set up your AWS resources so that you can spend less time managing those resources and more time focusing on your applications that run in AWS. **You create a template that describes all the AWS resources that you want (like Amazon EC2 instances or Amazon RDS DB instances), and CloudFormation takes care of provisioning and configuring those resources for you.** You don't need to individually create and configure AWS resources and figure out what's dependent on what; CloudFormation handles that.|
What is auto-scaling? | Auto-scaling is a function that allows you to provision and launch new instances whenever there is a demand. It allows you to automatically increase or decrease resource capacity in relation to the demand.|
Amazon RDS | Amazon RDS is a database management service for relational databases. It manages patching, upgrading, and data backups automatically. It’s a database management service for structured data only.|
DynamoDB | On the other hand, DynamoDB is a NoSQL database service for dealing with unstructured data. |
Redshift | Redshift is a data warehouse product used in data analysis. |
What is IAM? | AWS IAM allows an administrator to provide multiple users and groups with granular access. Various user groups and users may require varying levels of access to the various resources that have been developed. We may assign roles to users and create roles with defined access levels using IAM. It further gives us Federated Access, which allows us to grant applications and users access to resources without having to create IAM Roles.|
[AmazonMQ](https://aws.amazon.com/amazon-mq/) | Amazon MQ is a managed message broker service for Apache ActiveMQ and RabbitMQ that makes it easy to set up and operate message brokers on AWS. Amazon MQ reduces your operational responsibilities by managing the provisioning, setup, and maintenance of message brokers for you. Because Amazon MQ connects to your current applications with industry-standard APIs and protocols, you can easily migrate to AWS without having to rewrite code.|

# What Is Amazon Virtual Private Cloud (VPC) and Why Is It Used?
- A VPC is the best way of connecting to your cloud resources from your own data center. Once you connect your datacenter to the VPC in which your instances are present, each instance is assigned a private IP address that can be accessed from your data center. That way, you can access your public cloud resources as if they were on your own private network.

# Name and explain some security products and features available in VPC?
- Security groups - This acts as a firewall for the EC2 instances, controlling inbound and outbound traffic at the instance level.
- Network access control lists - It acts as a firewall for the subnets, controlling inbound and outbound traffic at the subnet level.
- Flow logs - These capture the inbound and outbound traffic from the network interfaces in your VPC.

# How do you monitor Amazon VPC?
- CloudWatch and CloudWatch logs
- VPC Flow Logs

# How does Amazon Route 53 provide high availability and low latency?
- Globally Distributed Servers - Amazon is a global service and consequently has DNS services globally. Any customer creating a query from any part of the world gets to reach a DNS server local to them that provides low latency. 
- Dependency - Route 53 provides a high level of dependability required by critical applications.
- Optimal Locations - Route 53 uses a global anycast network to answer queries from the optimal position automatically.

# What is a maintenance window in Amazon RDS? Will your DB instance be available during maintenance events?
- RDS maintenance window lets you decide when DB instance modifications, database engine version upgrades, and software patching have to occur. 
- The automatic scheduling is done only for patches that are related to security and durability. 
- By default, there is a 30-minute value assigned as the maintenance window and the DB instance will still be available during these events though you might observe a minimal effect on performance.

# Amazon EC2 AutoScaling
- Amazon EC2 Auto Scaling enables you to automatically launch or terminate Amazon EC2 instances based on user-defined policies, health status checks, and schedules. You can use a CloudWatch alarm with Amazon EC2 Auto Scaling to scale your EC2 instances based on demand. For more information, see Dynamic Scaling in the Amazon EC2 Auto Scaling User Guide.

# References
- https://www.simplilearn.com/tutorials/aws-tutorial/aws-interview-questions
