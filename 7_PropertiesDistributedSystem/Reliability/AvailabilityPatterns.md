# Availability Patterns

## Fail over Policies

### Active-Active policy
- An active-active cluster is typically made up of at least two nodes, both actively running the same kind of service simultaneously.
- In active-active, both servers are managing traffic, spreading the load between them.
- This would enable application to be [fault-tolerant](FaultTolerance.md).

### Active-Passive policy
- With active-passive fail-over, only the active server handles traffic & `heartbeats` are sent between the active and the passive server on standby.
- If the heartbeat is interrupted, the passive server takes over the active's IP address and resumes service.
- The length of downtime is determined by whether the passive server is already running in 'hot' standby or whether it needs to start up from 'cold' standby.
- **Active-Passive** policy is generally used for the [disaster recovery](DisasterRecovery.md).
- In AWS, active-passive policy can be configured in the [fail-over routing policy](../../2_AWSServices/1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonRoute53/Readme.md#failover-routing-policy) in [Route53](../../2_AWSServices/1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonRoute53/Readme.md).

### :thumbsdown: Disadvantages of fail over policies
- Fail-over adds more hardware and additional complexity.
- There is a potential for loss of data if the active system fails before any newly written data can be replicated to the passive.

## Replication
- [Read here about replication](../../3_DatabaseServices/Consistency&Replication/Replication.md)