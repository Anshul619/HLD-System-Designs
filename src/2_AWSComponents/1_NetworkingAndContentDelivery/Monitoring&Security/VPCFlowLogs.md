# VPC Flow Logs
- [VPC Flow logs](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs.html) captures the inbound and outbound traffic from the network interfaces in your VPC.
- VPC Flow Logs help you with a number of tasks, such as troubleshooting why specific traffic is not reaching an instance, which in turn helps you diagnose overly restrictive security group rules. 
- You can use flow logs as a security tool to monitor the traffic that is reaching your instance, to profile your network traffic, and to look for abnormal traffic behaviors.

![](https://d2908q01vomqb2.cloudfront.net/da4b9237bacccdf19c0760cab7aec4a8359010b0/2019/09/13/2019-08-13_10-41-04.png)

# VPC Flow Logs basics

| Concept                 | Description                                                                                                                                            |
|-------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|
| VPC level               | VPC level monitors all the activity of your operations within your cloud environment.                                                                  |
| Subnet level            | Subnet level monitors all activity for a specific subnet.                                                                                              |
| Network interface level | Network interface level monitors specific interfaces on Amazon Elastic Compute Cloud (Amazon EC2) instances and capture flow logs from that interface. |

# Log format
- You can filter flow logs by all, accepted, or rejected traffic.

## Flow log record examples

The following are examples of default [flow log records](https://docs.aws.amazon.com/vpc/latest/userguide/flow-logs-records-examples.html#flow-log-example-accepted-rejected).
- In this example, SSH traffic (destination port 22, TCP protocol) to network interface eni-1235b8ca123456789 in account 123456789010 was allowed.

`2 123456789010 eni-1235b8ca123456789 172.31.16.139 172.31.16.21 20641 22 6 20 4249 1418530010 1418530070 ACCEPT OK`

- In this example, RDP traffic (destination port 3389, TCP protocol) to network interface eni-1235b8ca123456789 in account 123456789010 was rejected.

`2 123456789010 eni-1235b8ca123456789 172.31.9.69 172.31.9.12 49761 338`

## Fields in VPC Flow Logs

| Field                  |
|------------------------|
| Source IP Address      |
| Protocol               |
| Destination IP Address |

# Flow logs limitations
- Changes cannot be made to the configuration of a flow log or the format of a flow log record after they have been created. If the flow log you have created is not gathering the data you expected or if the nature of what you need to gather changes, you have to delete the existing flow log and create a new one. For example, you cannot change the IAM role associated with your flow log after creation. To associate a different IAM role, you would have to recreate the flow log.
- Flow logs can only be configured for VPC peering connections deployed by your account. VPC peering connections deployed by another account cannot be monitored using VPC flow logs even if they have been authorized to link to VPCs within your account.
- Network interfaces for EC2-Classic instances are not supported. This includes instances linked to your VPC through ClassicLink.

# Publish Flow Logs to S3 bucket 
Using [Amazon S3](../../7_StorageServices/AmazonS3/Readme.md) for the storage of your flow logs provides:
- Scalability and log consolidation using Amazon Athena to query the data for analysis. 
- Ingestion from pipelines using S3 bucket notifications, Amazon SQS, and AWS Lambda to provide events to Amazon Elasticsearch Service for real-time monitoring using Kibana.
- For cost optimization and archival storage.
