
# AWS CloudTrail
- [AWS Cloudtrail](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-user-guide.html) is a service that [logs AWS account activity](../2_SecurityAndIdentityServices/1_IdentityServices) and [Amazon Route 53 API](../1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonRoute53/Readme.md) usage for risk auditing, compliance and monitoring.
- CloudTrail records user API activity on your account and allows you to access information about the activity.
- Using CloudTrail, you can get full details about API actions such as the identity of the caller, time of the call, request parameters, and response elements.
- You can use information in the CloudTrail log files to determine which requests were sent to [Amazon Route 53](../1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonRoute53/Readme.md), the IP address that the request was sent from, who sent the request, when it was sent, and more.
- The best part about this service is that it enables you to configure it to [send notifications via AWS SNS](../5_MessageBrokerServices/AmazonSNS.md) when new logs are delivered.

# Features

| Feature                                                                                                                                          | Description                                                                                                                                              |
|--------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Validating CloudTrail log file integrity](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-log-file-validation-intro.html) | To determine whether a log file was modified, deleted, or unchanged after CloudTrail delivered it, you can use CloudTrail log file integrity validation. |
| Storage in S3 bucket                                                                                                                             | CloudTrail saves log files of these requests to an [Amazon S3 bucket](../7_StorageServices/3_ObjectStorageS3/Readme.md).                                 |
| Security Analysis                                                                                                                                | It lets you perform security analysis, resource change tracking, and compliance auditing of your AWS environment as well.                                |

# Example1 - CloudTrail Log

````json
{
  "Records": {
    "eventVersion": "1.05",
    "userIdentity": {
      "type": "IAMUser",
      "principalId": "AIDAQRSTUVWXYZEXAMPLE",
      "arn": "arn:aws:iam::777788889999:user/JohnDoe",
      "accountId": "777788889999",
      "accessKeyId": "AKIAQRSTUVWXYZEXAMPLE",
      "userName": "JohnDoe"
    },
    "eventTime": "2014-07-18T15:07:39Z",
    "eventSource": "sts.amazonaws.com",
    "eventName": "AssumeRole",
    "awsRegion": "us-east-2",
    "sourceIPAddress": "192.0.2.101",
    "userAgent": "aws-cli/1.11.10 Python/2.7.8 Linux/3.2.45-0.6.wd .865 .49 .315.metal1.x86_64 botocore / 1.4 .67 ",
    "requestParameters": {
      "roleArn": "arn:aws:iam::111122223333:role/EC2-dev",
      "roleSessionName": "JohnDoe-EC2-dev",
      "serialNumber": "arn:aws:iam::777788889999:mfa"
    },
    "responseElements": {
      "credentials": {
        "sessionToken": "5fgiewrEXAMPLE",
        "accessKeyId": "AKIAQRSTUVWXYZEXAMPLE",
        "expiration": "Jul 18, 2014 4:07:39 PM"
      },
      "assumedRoleUser": {
        "assumedRoleId": "AIDAQRSTUVWXYZEXAMPLE:JohnDoe-EC2-dev",
        "arn": "arn:aws:sts::111122223333:assumed-role/EC2-dev/JohnDoe-EC2-dev"
      }
    },
    "resources": [{
      "ARN": "arn:aws:iam::111122223333:role/EC2-dev",
      "accountId": "111122223333",
      "type": "AWS::IAM::Role"
    }],
    "requestID": "4EXAMPLE-0e8d-11e4-96e4-e55c0EXAMPLE",
    "sharedEventID": "bEXAMPLE-efea-4a70-b951-19a88EXAMPLE",
    "eventID": "dEXAMPLE-ac7f-466c-a608-4ac8dEXAMPLE",
    "eventType": "AwsApiCall",
    "recipientAccountId": "111122223333"
  }
}
````

# Example2 - Cloudtrail log

````json
{
	"Records": {
		"eventVersion": "1.05",
		"userIdentity": {
			"type": "WebIdentityUser",
			"peincipalId": "accounts.google.com:111.apps.googleusercontent.com:richardroe",
			"userName": "richardroe",
			"identityProvider": "accounts.google.com"
		},
		"eventTime": "2016-03-23T01:39:51Z",
		"eventSource": "sts.amazonaws.com",
		"eventName": "AssumeRoleWithWebIdentity",
		"awsRegion": "us-east-2",
		"sourceIPAddress": "192.0.2.101",
		"userAgent": "aws-cli/1.3.23 Python/2.7.6 Linux/2.6.18-164.el5",
		"requestParameters": {
			"durationSeconds": 3600,
			"roleArn": "arn:aws:iam::444455556666:role/FederatedWebIdentityRole",
			"roleSessionName": "MyAssignedRoleSessionName",
			"principalTags": {
				"CostCenter": "24680",
				"Project": "Pegasus"
			},
			"transitiveTagKeys": [
				"CostCenter",
				"Project"
			]
		},
		"responseElements": {
			"provider": "accounts.google.com",
			"subjectFromWebIdentityToken": "richardroe",
			"audience": "111.apps.googleusercontent.com",
			"credentials": {
				"accessKeyId": "ASIACQRSTUVWRAOEXAMPLE",
				"expiration": "Mar 23, 2016 2:39:51 AM",
				"sessionToken": "43tkjEXAMPLE"
			},
			"assumedRoleUser": {
				"assumedRoleId": "AROACQRSTUVWRAOEXAMPLE:MyAssignedRoleSessionName",
				"arn": "arn:aws:sts::444455556666:assumed-role / FederatedWebIdentityRole / MyAssignedRoleSessionName "
			}
		},
		"resources": [{
			"ARN": "arn:aws:iam::444455556666:role/FederatedWebIdentityRole",
			"accountId": "444455556666",
			"type": "AWS::IAM::Role"
		}],
		"requestID": "6EXAMPLE-e595-11e5-b2c7-c974fEXAMPLE",
		"eventID": "bEXAMPLE-0b30-4246-b28c-e3da3EXAMPLE",
		"eventType": "AwsApiCall",
		"recipientAccountId": "444455556666"
	}
}
````

# Links
- [Analyzing AWS CloudTrail in Amazon CloudWatch](https://aws.amazon.com/blogs/mt/analyzing-cloudtrail-in-cloudwatch/)