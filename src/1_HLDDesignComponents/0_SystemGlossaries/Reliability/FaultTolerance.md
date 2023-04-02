# Fault Tolerance
- [Fault Tolerance](https://www.linkedin.com/pulse/high-availability-vs-fault-tolerance-jon-bonso/) has the goal of keeping your application running with `zero downtime`. 
- It is an upgraded version of [High Availability](HighAvailability.md).
- It can tolerate any component fault to avoid any performance impact, data loss, or system crashes by having redundant resources beyond what is typically needed.
- The things that can go wrong are call `faults` & systems that anticipate faults & can cope with them are called `fault-tolerant or resilient`.

# Fault Tolerance vs High Availability
- More complex design.
- Higher redundancy.
- Higher cost.
- If an application is said to be fault-tolerant then it is also considered highly available. But vice-verse is not true.
- In AWS, 100% fault tolerance (zero downtime) can be achieved through [active-active routing policy in Route53](../../../2_AWSComponents/1_NetworkingAndContentDelivery/AmazonRoute53.md#routing-policy) with at-least 2 regions (having same components & architecture).

![img.png](../assets/ha_vs_fault_tolerant.png)