# Cross-Zone Load Balancing

| State                      | Remarks                                                                                                                                                                                      |
|----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :white_check_mark: Enabled | When cross-zone load balancing is enabled, each load balancer node distributes traffic across the registered targets in all enabled Availability Zones. This improves speed and scalability. |
| Disabled                   | When cross-zone load balancing is disabled, each load balancer node distributes traffic only across the registered targets in its Availability Zone.                                         |

[Read more](https://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html)

# Enabled Cross-Zone Load Balancing
- If cross-zone load balancing is enabled, each of the 10 targets receives 10% of the traffic. 
- This is because each load balancer node can route its 50% of the client traffic to all 10 targets.

![](https://docs.aws.amazon.com/images/elasticloadbalancing/latest/userguide/images/cross_zone_load_balancing_enabled.png)

# Disabled Cross-Zone Load Balancing
If cross-zone load balancing is disabled:
- Each of the two targets in Availability Zone A receives 25% of the traffic.
- Each of the eight targets in Availability Zone B receives 6.25% of the traffic.

This is because each load balancer node can route its 50% of the client traffic only to targets in its Availability Zone

![](https://docs.aws.amazon.com/images/elasticloadbalancing/latest/userguide/images/cross_zone_load_balancing_disabled.png)