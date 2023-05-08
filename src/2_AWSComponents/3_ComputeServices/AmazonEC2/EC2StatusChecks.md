# EC2 Status Check for your instances
- [Amazon EC2 performs automated status checks on every running EC2 instance](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/monitoring-system-instance-status-check.html) to identify hardware and software issues.
- Status checks are performed every minute, returning a pass or a fail status. 
- Status checks are built into [Amazon EC2](), so they cannot be disabled or deleted.

![](assets/EC2_Instance_LifeCycle.drawio.png)

# Instance Overall Status

| Status Check Result     | Instance Status       |
|-------------------------|-----------------------|
| All checks pass         | :white_check_mark: OK |
| One or more checks fail | :x: Impaired          |

# Types of Status Checks

![](https://docs.aws.amazon.com/images/AWSEC2/latest/WindowsGuide/images/status-check-tab.png)

|                   | System status checks                                                                                                                                                            | Instance status checks                                                                                                                                                                                                                                                                                                                                                                            |
|-------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Responsible       | AWS<br/>- These checks detect underlying problems with your instance that require AWS involvement to repair.                                                                    | Developer<br/>- These checks detect problems that require your involvement to repair.                                                                                                                                                                                                                                                                                                             |
| Examples          | Loss of network connectivity <br/>- Loss of system power<br/>- Software issues on the physical host<br/>- Hardware issues on the physical host that impact network reachability | Failed system status checks<br/>- Incorrect networking or startup configuration<br/>- Exhausted memory<br/>- Corrupted file system                                                                                                                                                                                                                                                                |
| Cloudwatch Metric | [StatusCheckFailed_System](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/viewing_metrics_with_cloudwatch.html#status-check-metrics)                                    | [StatusCheckFailed_Instance](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/viewing_metrics_with_cloudwatch.html#status-check-metrics)                                                                                                                                                                                                                                                    |
| Troubleshooting   | When a system status check fails, you can choose to wait for AWS to fix the issue, or you can resolve it yourself. Or configure [EC2 Auto-Recovery](EC2AutoRecovery.md).        | For instances backed by [Amazon EBS](../../7_StorageServices/1_BlockStorageTypes/AmazonEBS.md), you can stop and start the instance yourself, which in most cases results in the instance being migrated to a new host. <br/>- For Linux instances backed by [instance store](../../7_StorageServices/1_BlockStorageTypes/AmazonEC2InstanceStore.md), you can terminate and replace the instance. |