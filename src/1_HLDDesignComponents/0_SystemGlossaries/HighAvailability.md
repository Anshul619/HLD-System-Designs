# :star: [High Availability](https://avinetworks.com/glossary/high-availability/)
- High Availability (HA) describes systems that are dependable enough to operate continuously without failing.
- They are well-tested and sometimes equipped with redundant components.
- :star: `99.99% uptime means that website is down only for 52 mins in the complete year`. This means it is `highly available`.
- In AWS, high availability is achieved through multiple deployments of the app in [different availability zones](../../2_AWSComponents/AWS-Global-Architecture-Region-AZ.md).
- [High Availability vs Fault Tolerance](FaultTolerance&DisasterRecovery.md#fault-tolerance-vs-high-availabilityhighavailabilitymd)

![img.png](https://acg-wordpress-content-production.s3.us-west-2.amazonaws.com/app/uploads/2021/01/1_W7cR3GIoIafVXw1qjJdw1A.png)

## Components of HA
- `Redundancy` - Ensures that critical system components have another identical components with the same data, that can take over in case of failure.
- `Monitoring` - Identify problems in production systems that may disrupt or degrade service.
- `Failover` - Switch from an active system component to a redundant component in case of failure with degraded performance or functionality.
- `Failback` - Switch back from a redundant component to the primary active component, when it has recovered from failure.

## Power of 9s

| Availability         | 9s       | Downtime per year | Categories/Domains                       |
|----------------------|----------|-------------------|------------------------------------------|
| 99% availability     | Two 9s   | 8 hours 45 mins   | Internal tools, projects tracking        |
| :star: 99.9% availability | Three 9s | 8 hr 45 mins      | Online Commerce                          |
| :star: 99.99% availability | Four 9s  | 52 mins           | Video Delivery, Broadcast systems        |
| 99.999% availability | Five 9s  | 5 mins            | Telecom Industry, Bank, ATM Transactions |


## Availability Patterns

### Fail over Policies

#### Active-Active policy
- An active-active cluster is typically made up of at least two nodes, both actively running the same kind of service simultaneously.
- In active-active, both servers are managing traffic, spreading the load between them.
- This would enable application to be [fault-tolerant](FaultTolerance&DisasterRecovery.md).

#### Active-Passive policy
- With active-passive fail-over, only the active server handles traffic & `heartbeats` are sent between the active and the passive server on standby. 
- If the heartbeat is interrupted, the passive server takes over the active's IP address and resumes service.
- The length of downtime is determined by whether the passive server is already running in 'hot' standby or whether it needs to start up from 'cold' standby. 
- `Active-Passive` policy is generally used for the [disaster recovery](FaultTolerance&DisasterRecovery.md#disaster-recoveryhttpsenwikipediaorgwikidisaster_recovery).
- In AWS, active-passive policy can be configured in the [fail-over routing policy](../../2_AWSComponents/1_NetworkingAndContentDelivery/AmazonRoute53.md#failover-routing-policy) in [Route53](../../2_AWSComponents/1_NetworkingAndContentDelivery/AmazonRoute53.md).

#### :thumbsdown: Disadvantages of fail over policies
- Fail-over adds more hardware and additional complexity.
- There is a potential for loss of data if the active system fails before any newly written data can be replicated to the passive.

### Replication & Data Consistency
- [Read here about replication & data consistency](ReplicationAndDataConsistency.md)

# Source(s) and further reading
- [The quest for availability in the cloud](https://acloudguru.com/blog/engineering/the-quest-for-availability?utm_source=medium_blog&utm_medium=redirect&utm_campaign=medium_blog)
- [Scalability and High Availability](https://dzone.com/refcardz/scalability)