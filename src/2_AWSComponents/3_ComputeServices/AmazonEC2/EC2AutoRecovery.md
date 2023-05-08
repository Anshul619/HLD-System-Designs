# Automatic Recovery
- To [automatically recover an instance when a system status check failure occurs](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-recover.html), you can use the default configuration of the instance (i.e.Simplified automatic recovery) or create an [Amazon CloudWatch alarm](../../8_MonitoringServices/AmazonCloudwatch/CloudwatchAlarms.md).
- If an instance becomes unreachable because of an underlying hardware failure or a problem that requires AWS involvement to repair, the instance is automatically recovered.
- The automatic recovery process attempts to recover your instance for up to three separate failures per day. 
- Your instance may subsequently be retired if automatic recovery fails and a hardware degradation is determined to be the root cause for the original system status check failure.

# Retained Attributes

| Instance State                                                          | Retained in Recovery?  |
|-------------------------------------------------------------------------|------------------------|
| Original Instance ([AMI](AmazonMachineImages.md), InstanceID, Metadata) | :white_check_mark: Yes |
| Private, Public, [Elastic IP address](ElasticIP.md)                     | :white_check_mark: Yes |
| Placement Group                                                         | :white_check_mark: Yes |
| In-Memory data                                                          | :x: No                 |

# Limitations

| :x: Limitation                                                                                              | Remarks                                                                                                                                                                    |
|-------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Instance store based EC2 instances](../../7_StorageServices/1_BlockStorageTypes/AmazonEC2InstanceStore.md) | EC2 auto-recovery happens only when EC2 volume is [EBS](../../7_StorageServices/1_BlockStorageTypes/AmazonEBS.md).                                                         |
| [Instance in terminated state](EC2StateLifeCycle.md)                                                        | -                                                                                                                                                                          |
| [Instance in ASG](AutoScalingGroup/Readme.md)                                                               | If your instance is part of an [Auto Scaling group with health checks enabled](AutoScalingGroup/Readme.md), then the instance is replaced by ASG when it becomes impaired. |
| [System Status Check Failed](EC2StatusChecks.md)                                                            | EC2 auto-recovery happens only when system status check is failed.                                                                                                         |
| Metal Instances                                                                                             | -                                                                                                                                                                          |
| AWS Scheduled EC2 maintenance event                                                                         | -                                                                                                                                                                          |
