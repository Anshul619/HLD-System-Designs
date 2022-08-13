
# Load Balancers
- [Load Balancers](https://github.com/ema2159/Grokking-System-Design-Interview-Quizzes/blob/master/Quizzes/Load%20Balancer.org) are used for the horizontal scalability & high availability/fault-tolerance.
- LB helps to spread the traffic across a cluster of servers to improve responsiveness and availability of applications, websites or databases.
- LB also keeps track of the status of all the resources while distributing requests.
- If a server is not available to take new requests or is NOT responding or has elevated error rate, LB will stop sending traffic to such a server.
- In AWS, [Elastic Load Balancer](../../2_AWSComponents/1_NetworkingAndContentDelivery/ElasticLoadBalancer.md) is used for the load balancing.