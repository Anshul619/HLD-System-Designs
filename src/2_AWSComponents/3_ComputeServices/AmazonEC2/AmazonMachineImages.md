# Amazon Machine Image
- An [Amazon Machine Image (AMI)](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIs.html) is a supported and maintained image provided by AWS that provides the information required to launch an instance. 
- You must specify an [AMI](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIs.html) when you launch an instance. 
- You can launch multiple instances from a single AMI when you require multiple instances with the same configuration.

[](assets/AMI_EC2_Root_Volume.drawio.png)

# Features

| Feature                               | Remarks                                                                                                                                                                                                                                                                                                                                                                          |
|---------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Includes Root Volume Storage/Config   | One or more Amazon [Elastic Block Store (Amazon EBS) snapshots](../../12_Backup&DR/EBSSnapshots.md), or, for [instance-store-backed AMIs](../../7_StorageServices/1_BlockStorageTypes/AmazonEC2InstanceStore.md), a template for the root volume of the instance (for example, an operating system, an application server, and applications). |
| Launch Permissions                    | Launch permissions that control which AWS accounts can use the AMI to launch instances.                                                                                                                                                                                                                                                                                          |
| Block Device Mapping                  | A block device mapping that specifies the volumes to attach to the instance when it's launched.                                                                                                                                                                                                                                                                                  |
| Scope - Region bound                  | AMIs are bound to the Region they are created in.                                                                                                                                                                                                                                                                                                                                |
| Copy an AMI across AWS Regions        | When EBS-backed-AMI is copied, corresponding [EBS Snapshot](../../12_Backup&DR/EBSSnapshots.md) are also copied.                                                                                                                                                                                                                              |
| Share an AMI with another AWS Account | You can share an AMI with another AWS account.                                                                                                                                                                                                                                                                                                                                   |
| Golden AMI                            | A Golden AMI is an AMI that you standardize through configuration, consistent security patching, and hardening. <br/>- It also contains agents you approve for logging, security, performance monitoring, etc.                                                                                                                                                                   |

# Copying AMI across AWS Regions

![](https://docs.aws.amazon.com/images/AWSEC2/latest/UserGuide/images/ami_copy.png)

[Read more](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/CopyingAMIs.html)

# Encryption and copying

| Scenario                   | Supported              |
|----------------------------|------------------------|
| Unencrypted-to-Unencrypted | :white_check_mark: Yes |
| Encrypted-to-Encrypted     | :white_check_mark: Yes |
| Unencrypted-to-Encrypted   | :white_check_mark: Yes |
| Encrypted-to-Unencrypted   | :x: No                 |

# References
- [Root Device Volume](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/RootDeviceStorage.html)