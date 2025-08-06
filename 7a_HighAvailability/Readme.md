# High Availability
- [High Availability (HA)](https://avinetworks.com/glossary/high-availability/) describes systems that are dependable enough to operate continuously without failing.
- In AWS, [high availability]() is achieved through multiple deployments of the app in [different availability zones](https://github.com/Anshul619/AWS-Services/tree/main/AWS-Global-Architecture-Region-AZ.md).
- [High Availability vs Fault Tolerance](FaultToleranceVsHighAvailability.md)

# Components of HA

| Component  | Description                                                                                                                          |
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

# How availability is measured?
- Each service provider may start measuring availability at different points in time. 
- Some cloud providers start measuring it when they first offer the service, while some measure it for specific clients when they start using the service. 
- Some providers might not reduce their reported availability numbers if their service was not down for all the clients.
- Therefore, we should carefully understand how a specific provider calculates their availability numbers.

## Excluded
- The planned downtimes are excluded. 
- Downtime due to cyberattacks might not be incorporated into the calculation of availability. 

# Source(s) and further reading
- [The quest for availability in the cloud](https://acloudguru.com/blog/engineering/the-quest-for-availability?utm_source=medium_blog&utm_medium=redirect&utm_campaign=medium_blog)
- [Scalability and High Availability](https://dzone.com/refcardz/scalability)