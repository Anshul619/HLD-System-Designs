# High Availability
- [High Availability (HA)](https://avinetworks.com/glossary/high-availability/) describes systems that are dependable enough to operate continuously without failing.
- In AWS, [high availability]() is achieved through multiple deployments of the app in [different availability zones](../../2_AWSServices/AWS-Global-Architecture-Region-AZ.md).
- [High Availability vs Fault Tolerance](FaultToleranceVsHighAvailability.md)

![](https://acg-wordpress-content-production.s3.us-west-2.amazonaws.com/app/uploads/2021/01/1_W7cR3GIoIafVXw1qjJdw1A.png)

# Components of HA

| Component  | Remarks                                                                                                                              |
|------------|--------------------------------------------------------------------------------------------------------------------------------------|
| Redundancy | Ensures that critical system components have another identical components with the same data, that can take over in case of failure. |
| Monitoring | Identify problems in production systems that may disrupt or degrade service.                                                         |
| Failover   | Switch from an active system component to a redundant component in case of failure with degraded performance or functionality.       |
| Fallback   | Switch back from a redundant component to the primary active component, when it has recovered from failure.                          |

# Power of 9s

| Availability               | 9s       | Error budget/Downtime per year | Categories/Domains                       |
|----------------------------|----------|--------------------------------|------------------------------------------|
| 99% availability           | Two 9s   | 3.65 days                      | Internal tools, projects tracking        |
| :star: 99.9% availability  | Three 9s | 8 hr 45 mins                   | Online Commerce                          |
| :star: 99.99% availability | Four 9s  | 52 mins                        | Video Delivery, Broadcast systems        |
| 99.999% availability       | Five 9s  | 5 mins                         | Telecom Industry, Bank, ATM Transactions |

# Source(s) and further reading
- [The quest for availability in the cloud](https://acloudguru.com/blog/engineering/the-quest-for-availability?utm_source=medium_blog&utm_medium=redirect&utm_campaign=medium_blog)
- [Scalability and High Availability](https://dzone.com/refcardz/scalability)