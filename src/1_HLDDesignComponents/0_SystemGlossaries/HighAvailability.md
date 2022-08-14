# :star: [High Availability](https://avinetworks.com/glossary/high-availability/)
- High Availability (HA) describes systems that are dependable enough to operate continuously without failing.
- They are well-tested and sometimes equipped with redundant components.
- `99.99% uptime means that website is down only for 52 mins in the complete year`. 
  - This means it is `highly available`.
- In AWS, high availability is achieved through multiple deployments of the app in [different availability zones](../../2_AWSComponents/AWS-Global-Architecture-Region-AZ.md).
- [High Availability vs Fault Tolerance](FaultTolerance&DisasterRecovery.md#fault-tolerance-vs-high-availabilityhighavailabilitymd)

![img.png](../../2_AWSComponents/0_AWSDesigns/DesignScalableSystemWithRDMS/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)

## Components of HA
- `Redundancy` - Ensures that critical system components have another identical components with the same data, that can take over in case of failure.
- `Monitoring` - Identify problems in production systems that may disrupt or degrade service.
- `Failover` - Switch from an active system component to a redundant component in case of failure with degraded performance or functionality.
- `Failback` - Switch back from a redundant component to the primary active component, when it has recovered from failure.

# References
- [Scalability and High Availability](https://dzone.com/refcardz/scalability)