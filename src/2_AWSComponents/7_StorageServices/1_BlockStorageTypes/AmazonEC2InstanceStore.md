# Amazon EC2 instance store
- [Amazon EC2 instance store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) provides temporary block-level storage for an instance.

[](../../3_ComputeServices/assests/AMI_EC2_Root_Volume.drawio.png)

# Features

| Feature                | Description                                                                                                                                                         |
|------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Ephemeral or temporary | If you delete the instance, the instance store is deleted, as well.                                                                                                 |
| Speed                  | This storage provides sub-millisecond latency to the associated [EC2 instances](../../3_ComputeServices/AmazonEC2/Readme.md).                                       |
| Lifecycle              | This storage is located on disks that are physically attached to the host computer.<br/>- This ties the lifecycle of the data to the lifecycle of the EC2 instance. |
| Pricing                | Instance storage is about half the price of [EBS](AmazonEBS.md) and has much better performance.                                                                    |