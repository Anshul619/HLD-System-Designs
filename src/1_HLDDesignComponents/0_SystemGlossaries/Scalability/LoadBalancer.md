
# Load Balancers
- [Load Balancers](https://github.com/ema2159/Grokking-System-Design-Interview-Quizzes/blob/master/Quizzes/Load%20Balancer.org) are used for the [horizontal scalability](Readme.md) & [high availability/fault-tolerance](../Reliability/HighAvailability.md).
- LB helps to spread the traffic across a cluster of servers to improve responsiveness and availability of applications, websites or databases.
- In AWS, [Elastic Load Balancer](../../../2_AWSComponents/1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md) is used for the load balancing.

## Benefits of Load Balancing
- Users experience faster, uninterrupted service.
- Service providers experience less downtime and higher throughput.
- Load balancing makes it easier for system administrators to handle incoming requests while decreasing wait time for users.
- Smart load balancers provide benefits like predictive analytics that determine traffic bottlenecks before they happen.

## Terminologies/Algorithms

### Health Checks 
- Load balancers only forwards traffic to `healthy` backend servers i.e. if a server is not available to take new requests or is NOT responding or has elevated error rate, LB will stop sending traffic to such a server. 
- To monitor the health of a backend server, `health checks` regularly attempt to connect to backend servers to ensure that servers are listening.

### Least Connection Method
- This approach is quite useful when there are a large number of persistent client connections which are unevenly distributed between the servers.

### Redundant Load Balancers
- The load balancer can be a single point of failure; to overcome this, a second load balancer can be connected to the first to form a cluster.

# Reference
- [Load Balancer](https://www.educative.io/courses/grokking-the-system-design-interview/3jEwl04BL7Q)