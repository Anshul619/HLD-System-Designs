# [Fault Tolerance](https://www.linkedin.com/pulse/high-availability-vs-fault-tolerance-jon-bonso/)
- Fault Tolerance, on the other hand, has the goal of keeping your application running with `zero downtime`. (`upgraded version of High Availability`)
- It can tolerate any component fault to avoid any performance impact, data loss, or system crashes by having redundant resources beyond what is typically needed.

## Comparison with HA
- More complex design
- Higher redundancy
- Higher cost
- `Active-Active fail-over policy` ( instead of `active-passive` policy ) in `AWS HA cluster`
- `If an application is said to be fault-tolerant then it is also considered highly available`. But vice-verse is not true.

![img.png](../10_Others_assests/ha_vs_fault_tolerant.png)

# [Disaster Recovery](https://en.wikipedia.org/wiki/Disaster_recovery)
- In AWS, disaster recovery is done through multi-region replication.
- For example - [Amazon Aurora Global Database](../../2_AWSComponents/6_DatabaseServices/AmazonAurora.md#aurora-global-database)

## [Recovery Point Objective (RPO)](https://docs.aws.amazon.com/whitepapers/latest/microservices-on-aws/disaster-recovery.html)
- Recovery time objective is the maximum acceptable delay between the interruption of service and restoration of service. This objective determines what is considered an acceptable time window when service is unavailable and is defined by the organization.

## [Recovery Time Objective (RTO)](https://docs.aws.amazon.com/whitepapers/latest/microservices-on-aws/disaster-recovery.html)
- Recovery point objective is the maximum acceptable amount of time since the last data recovery point. This objective determines what is considered an acceptable loss of data between the last recovery point and the interruption of service and is defined by the organization.
