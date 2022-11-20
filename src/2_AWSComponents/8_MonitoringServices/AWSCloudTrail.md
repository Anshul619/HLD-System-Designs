
# AWS CloudTrail
- [AWS Cloudtrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-user-guide.html) is a service that [logs AWS account activity](../2_SecurityAndIdentityServices/AWSUsers&AccessMgmt) and [Amazon Route 53 API](../1_NetworkingAndContentDelivery/AmazonRoute53.md) usage for risk auditing, compliance and monitoring.
- CloudTrail records user API activity on your account and allows you to access information about the activity.
- Using CloudTrail, you can get full details about API actions such as the identity of the caller, time of the call, request parameters, and response elements.
- CloudTrail saves log files of these requests to an [Amazon S3 bucket](../7_StorageServices/AmazonS3.md).
- You can use information in the CloudTrail log files to determine which requests were sent to [Amazon Route 53](../1_NetworkingAndContentDelivery/AmazonRoute53.md), the IP address that the request was sent from, who sent the request, when it was sent, and more.
- It lets you perform security analysis, resource change tracking, and compliance auditing of your AWS environment as well. 
- The best part about this service is that it enables you to configure it to [send notifications via AWS SNS](../5_MessageBrokerServices/AmazonSNS.md) when new logs are delivered.

# Links
- [Analyzing AWS CloudTrail in Amazon CloudWatch](https://aws.amazon.com/blogs/mt/analyzing-cloudtrail-in-cloudwatch/)