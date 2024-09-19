# AWS Data Sync
- [AWS DataSync](https://aws.amazon.com/datasync/) provides data copy services between on-premises storage and [AWS Cloud storage](#supported-aws-destinations).

[](assets/AWS-Data-Sync.png)

# Supported AWS Destinations

| AWS Service                                                                                                       |
|-------------------------------------------------------------------------------------------------------------------|
| [Amazon S3](../6_StorageServices/3_S3ObjectStorage/Readme.md)                                                  |
| [Amazon EFS](../6_StorageServices/2_FileStorageTypes/AmazonEFS.md)                                             |
| [Amazon FSx for Windows File Server](../6_StorageServices/2_FileStorageTypes/AmazonFsXForWindowsFileServer.md) |

# Features

| Feature                     | Remarks                                                                                                                                                                                                            |
|-----------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Supported Protocols         | Data and file systems include [NFS file shares](../6_StorageServices/Network-Protocols.md), [SMB file shares](../6_StorageServices/Network-Protocols.md), and [self-managed object storage](). |
| Asynchronous data transfers | [AWS DataSync]() supports asynchronous or one-direction at a time transfers between on-premises file systems to [supported AWS Storage services](#supported-aws-destinations) in the AWS Cloud.                    |

# Transferring files from on premises to AWS and back without leaving your VPC using AWS DataSync

![](https://d2908q01vomqb2.cloudfront.net/e1822db470e60d090affd0956d743cb0e7cdf113/2019/10/14/configuring-DataSync-to-use-Private-IPs-with-AWS-resources-mentioned-at-different-steps.png)

[Read more](https://aws.amazon.com/blogs/storage/transferring-files-from-on-premises-to-aws-and-back-without-leaving-your-vpc-using-aws-datasync/)