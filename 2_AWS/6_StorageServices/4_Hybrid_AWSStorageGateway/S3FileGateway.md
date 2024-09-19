# Amazon S3 File Gateway
- [S3 File Gateway](https://aws.amazon.com/storagegateway/file/s3/) presents a file-based interface to [Amazon S3](../3_S3ObjectStorage/Readme.md), which appears as a network file share.
- With it, you can store files that support your latency-sensitive applications and workloads requiring local caching and file protocol access.
- [S3 File Gateway]() moves your file data into an object format, which is highly durable and cost-efficient.
- [S3 File Gateway]() supports data lakes, backups, and machine learning (ML) workflows.
- You can store file data as objects in [Amazon S3 cloud storage](../3_S3ObjectStorage/Readme.md) using file protocols such as [NFS and SMB](../Network-Protocols.md).
- Objects written through [S3 File Gateway]() can be directly accessed in [Amazon S3](../3_S3ObjectStorage/Readme.md).

![](https://d1.awsstatic.com/cloud-storage/Amazon%20S3%20File%20Gateway%20How%20It%20Works%20Diagram.96e9f7180c6ec8b6212b4d6fadc4a9ac4507b421.png)

# Primary Use Cases

| Use Case                                  | Description                                                                                                                                                                                                                |
|-------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Backing up data to the cloud              | Back up on-premises file data as objects in [Amazon S3](../3_S3ObjectStorage/Readme.md) (including Microsoft SQL Server and Oracle databases and logs).                                                                    |
| Archiving long-term, retention-based data | There is an ever-growing amount of data, and S3 File Gateway provides an efficient way of archiving this long-term retention-based data to AWS.                                                                            |
| Building data lakes                       | Using S3 File Gateway, you can ingest and centralize data into the highly available, scalable [Amazon S3 storage service](../3_S3ObjectStorage/Readme.md) to build data lakes and centralize data processing capabilities. |

# Read-Write
When multiple gateways or file shares write to the same [S3 bucket](../3_S3ObjectStorage/Readme.md), unpredictable results might occur. You can prevent this in two ways:
- Configure your [S3 bucket](../3_S3ObjectStorage/Readme.md) so that only one file share can write to it.
- Conﬁgure a separate, unique object preﬁx for each ﬁle share.
- Multiple clients can mount to the same file share as long as they are using the same file protocol.

# Required prerequisites

| Pre-requist                                                                                                                                                                                                                                                                                                                                                                                                                                     |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Configure Microsoft Active Directory (AD)                                                                                                                                                                                                                                                                                                                                                                                                       |
| Ensure that there is sufficient network bandwidth between the gateway and AWS. A minimum of 100 Mbps is required to successfully download, activate, and update the gateway.                                                                                                                                                                                                                                                                    |
| Configure your private networking, [VPN](../../16_NetworkingAndContentDelivery/4_HybridConnectivity/AWSSiteToSiteVPN.md), or [AWS Direct Connect](../../16_NetworkingAndContentDelivery/4_HybridConnectivity/AWSDirectConnect.md) between your [Amazon Virtual Private Cloud (Amazon VPC)](../../16_NetworkingAndContentDelivery/3_NetworkFoundationsVPC/Readme.md) and the on-premises environment where you are deploying your gateway. |
| Make sure your gateway can resolve the name of your Active Directory Domain Controller.                                                                                                                                                                                                                                                                                                                                                         |