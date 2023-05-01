# Amazon Machine Image
- An [Amazon Machine Image (AMI)](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIs.html) is a supported and maintained image provided by AWS that provides the information required to launch an instance. 
- You must specify an [AMI](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIs.html) when you launch an instance. 
- You can launch multiple instances from a single AMI when you require multiple instances with the same configuration.
- Since AMIs are based on the underlying [EBS snapshots](../../7_StorageServices/1_BlockStorageTypes/AmazonEBS.md), hence when you copy AMI, snapshot is copied automatically.

[](assets/AMI_EC2_Root_Volume.drawio.png)

# References
- [Root Device Volume](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/RootDeviceStorage.html)