# AWS GuardDuty
- [Amazon GuardDuty](https://aws.amazon.com/guardduty/) is a threat detection service that continuously monitors your AWS accounts and workloads for malicious activity and delivers detailed security findings for visibility and remediation.
- Amazon GuardDuty is a threat detection service that continuously monitors for malicious activity and unauthorized behavior to protect your AWS accounts, workloads, and data stored in [Amazon S3](../../7_StorageServices/3_ObjectStorageTypes/AmazonS3/Readme.md).

![](https://d1.awsstatic.com/Security/Amazon-GuardDuty/Amazon-GuardDuty_HIW.057a144483974cb73ab5f3f87a50c7c79f6521fb.png)

# Supported AWS data sources

| Service                                                                                               |
|-------------------------------------------------------------------------------------------------------|
| [Amazon S3](../../7_StorageServices/3_ObjectStorageTypes/AmazonS3/Readme.md)                          |
| [Amazon VPC Flow Logs](../../1_NetworkingAndContentDelivery/3_NetworkFoundations/AmazonVPC/Readme.md) |
| [AWS CloudTrail events](../AWSCloudTrail.md)                                  |
| [DNS logs](../../1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonRoute53.md)                    |

# Features

| Feature                                                                                                                       | Description                                                                                                                                                              |
|-------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Disable the service in the general settings](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_suspend-disable.html) | Disabling the service will delete all remaining data, including your findings and configurations before relinquishing the service permissions and resetting the service. |
| [Suspend the service in the general settings](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_suspend-disable.html) | You can stop Amazon GuardDuty from analyzing your data sources at any time by choosing to suspend the service in the general settings.                                   |

