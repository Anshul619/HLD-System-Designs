# AWS Storage Gateway
- [AWS Storage Gateway](https://aws.amazon.com/storagegateway/) is a set of hybrid cloud storage services that provide on-premises access to virtually unlimited cloud storage.

![](https://d1.awsstatic.com/pdp-how-it-works-assets/product-page-diagram_AWS-Storage-Gateway_HIW@2x.6df96d96cdbaa61ed3ce935262431aabcfb9e52d.png)

# Features

| Feature                    | Description                                                                                                                                                                                                                                                                                                                                                                 |
|----------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Regional Service           | The Storage Gateway is deployed to a selected AWS Region.                                                                                                                                                                                                                                                                                                                   |
| Standard Storage Protocols | All Storage Gateway types use standard storage protocols, local caching, and secure and optimized data transfers.                                                                                                                                                                                                                                                           |
| Fully Managed Cache        | The local gateway appliance maintains a cache of recently written or read data so your applications can have low-latency access to data that is stored durably in AWS. <br/>- The gateways use a read-through and write-back cache, committing data locally, acknowledging the write operations, and then asynchronously copying data to AWS, reducing application latency. |
| Local Cache - Limit        | Associate a disk size for the local cache of at least 150 GiB. <br/>- The maximum supported size of the local cache for a gateway running on a VM is 64 TiB. <br/>- You can configure one or more local drives for your cache, up to the maximum capacity.                                                                                                                  |

# Offerings

| Offering                                                                            | Destination                                                                               | Supported Protocols                                       | Description                                                                                                                                                                                                                                                                                                 |
|-------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------|-----------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Volume Gateway](https://aws.amazon.com/storagegateway/volume/)                     | [Amazon S3 bucket](../3_ObjectStorageS3/Readme.md)                                        | iSCSI                                                     | Provides [cloud-backed iSCSI block storage volumes](../1_BlockStorageTypes/AmazonEBS.md) to your on-premises applications.<br/>- Volume Gateway makes copies of your local block volumes and stores them in a service-managed [Amazon S3 bucket](../3_ObjectStorageS3/Readme.md).                           |
| [File Gateway (or S3 file gateway)](https://aws.amazon.com/storagegateway/file/s3/) | [Amazon S3 bucket](../3_ObjectStorageS3/Readme.md)                                        | [NFS and SMB file shares](../Network-Protocol-Support.md) | [Amazon S3 File Gateway](https://aws.amazon.com/storagegateway/file/s3/) connects on-premises [NFS and SMB file shares](https://docs.oracle.com/cd/E19253-01/816-4555/rfsadmin-61/index.html) to customer-managed [Amazon S3 object storage](../3_ObjectStorageS3/Readme.md), through file-based interface. |
| [FSx File Gateway](https://aws.amazon.com/storagegateway/file/fsx/)                 | [AWS FsX for Windows File Server](../2_FileStorageTypes/AmazonFsXForWindowsFileServer.md) | Windows-Based                                             | [Amazon FSx File Gateway](https://aws.amazon.com/storagegateway/file/fsx/) is used to work with your Windows-based applications and workflows.<br/>- Fsx provides native Microsoft Windows file system.                                                                                                     |
| [Tape Gateway](https://aws.amazon.com/storagegateway/vtl/)                          | -                                                                                         | -                                                         | Replaces using physical tapes on premises with virtual tapes in AWS without changing existing backup workflows.                                                                                                                                                                                             |

# Amazon S3 File Gateway
- [S3 File Gateway](https://aws.amazon.com/storagegateway/file/s3/) presents a file-based interface to [Amazon S3](../3_ObjectStorageS3/Readme.md), which appears as a network file share. 
- With it, you can store files that support your latency-sensitive applications and workloads requiring local caching and file protocol access. 
- [S3 File Gateway]() moves your file data into an object format, which is highly durable and cost-efficient.
- [S3 File Gateway]() supports data lakes, backups, and machine learning (ML) workflows. 
- You can store file data as objects in [Amazon S3 cloud storage](../3_ObjectStorageS3/Readme.md) using file protocols such as [NFS and SMB](../Network-Protocol-Support.md). 
- Objects written through S3 File Gateway can be directly accessed in [Amazon S3](../3_ObjectStorageS3/Readme.md).

![](https://d1.awsstatic.com/cloud-storage/Amazon%20S3%20File%20Gateway%20How%20It%20Works%20Diagram.96e9f7180c6ec8b6212b4d6fadc4a9ac4507b421.png)

## Primary Use Cases

| Use Case                                  | Description                                                                                                                                                                              |
|-------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Backing up data to the cloud              | Back up on-premises file data as objects in Amazon S3 (including Microsoft SQL Server and Oracle databases and logs).                                                                    |
| Archiving long-term, retention-based data | There is an ever-growing amount of data, and S3 File Gateway provides an efficient way of archiving this long-term retention-based data to AWS.                                          |
| Building data lakes                       | Using S3 File Gateway, you can ingest and centralize data into the highly available, scalable [Amazon S3 storage service](../3_ObjectStorageS3/Readme.md) to build data lakes and centralize data processing capabilities. |

## Read-Write
When multiple gateways or file shares write to the same S3 bucket, unpredictable results might occur. You can prevent this in two ways:
- Configure your S3 bucket so that only one file share can write to it.
- Conﬁgure a separate, unique object preﬁx for each ﬁle share.
- Multiple clients can mount to the same file share as long as they are using the same file protocol.

# Amazon FSx File Gateway
- [FSx File Gateway](https://aws.amazon.com/storagegateway/file/fsx/) optimizes on-premises access to Windows file shares on Amazon FSx, helping you access FSx for Windows File Server data with low latency and conserving shared bandwidth.
- A local cache of frequently used data that you can access is stored, providing faster performance and reduced data transfer traffic.
- FSx File Gateway stores your data natively as files rather than as objects.
- FSx File Gateway is a solution for replacing on-premises NAS, such as end-user home directories and departmental or group servers, with cloud storage.
- It facilitates user or team file shares and file-based application migration shares in Amazon FSx for Windows File Server, using the SMB protocol.
- Files written through FSx File Gateway can be directly accessed in FSx for Windows File Server

![](https://d1.awsstatic.com/cloud-storage/Amazon%20FSx%20File%20Gateway%20How%20It%20Works%20Diagram.edbf58e4917d47d04e5a5c22132d44bd92733bf5.png)

# Volume Gateway
- [Volume Gateway](https://aws.amazon.com/storagegateway/volume/) provides an iSCSI target, with which you can create block storage volumes and mount them as iSCSI devices from your on-premises or EC2 application servers.

|             | Description                                                                                                                                                                                                                                                 | Use Cases                                                                                          |
|-------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------|
| Cached Mode | The primary data is written to [Amazon S3](../3_ObjectStorageS3/Readme.md), while retaining the frequently accessed data locally in a cache for low-latency access.<br/>- Local disks are needed for cache storage and an upload buffer for a cached volume gateway. | Custom file shares<br/>- Migrating application data into Amazon S3 and transitioning to Amazon EC2 |
| Stored mode | The primary data is stored locally and the entire dataset is available for low-latency access while asynchronously backed up to AWS.                                                                                                                        | Block storage backups<br/>- Migrations or phased migrations<br/>- Cloud-based disaster recovery.   |

![](https://d1.awsstatic.com/cloud-storage/volume-gateway-diagram.eedd58ab3fb8a5dcae088622b5c1595dac21a04b.png)

## Other Features

| Feature                                                                                                  | Description                                                                                                                                                                                                 |
|----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Amazon EBS snapshots in AWS](../1_BlockStorageTypes/AmazonEBSSnapshots.md)                                       | In either mode, point-in-time copies of the volumes, are stored as [Amazon EBS snapshots in AWS](../1_BlockStorageTypes/AmazonEBSSnapshots.md).                                                                      |
| [Dirty data](https://docs.aws.amazon.com/storagegateway/latest/vgw/Main_monitoring-gateways-common.html) | Data that is written to the Storage Gateway cache, but has not been uploaded to AWS, is referred to as [dirty](https://docs.aws.amazon.com/storagegateway/latest/vgw/Main_monitoring-gateways-common.html). |
| Supported host platform for Volume Gateway appliance                                                     | [Amazon EC2](../../3_ComputeServices/AmazonEC2/Readme.md), VMware ESXi VM, A physical hardware appliance.                                                                                                   |


# Pricing

|               | Description                                                                                                                            |
|---------------|----------------------------------------------------------------------------------------------------------------------------------------|
| Storage       | Fees are based on the type of storage that you use with your gateway (for example, Amazon S3 and Amazon EBS) and how it is configured. |
| Requests      | Fees are based on data operations performed through the gateway including data ingest into AWS.                                        |
| Data transfer | Fees are based on data transferred out of the Storage Gateway service and into your Storage Gateway appliance.                         |

# Security
- AWS Storage Gateway supports authentication between your gateway and iSCSI initiators by using [CHAP](https://docs.aws.amazon.com/storagegateway/latest/vgw/GettingStartedConfigureChap.html).

# References
- [AWS DataSync vs Storage Gateway](https://tutorialsdojo.com/aws-datasync-vs-storage-gateway/)
