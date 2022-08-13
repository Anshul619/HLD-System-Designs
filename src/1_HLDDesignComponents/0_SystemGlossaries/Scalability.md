
# Scalability

# Types of Scalability

## Horizontal scalability ( Scale Out )
- [Load Balancers](https://github.com/ema2159/Grokking-System-Design-Interview-Quizzes/blob/master/Quizzes/Load%20Balancer.org) are used for the horizontal scalability.
- LB helps to spread the traffic across a cluster of servers to improve responsiveness and availability of applications, websites or databases.
- LB also keeps track of the status of all the resources while distributing requests.
- If a server is not available to take new requests or is NOT responding or has elevated error rate, LB will stop sending traffic to such a server.
- In AWS, [Elastic Load Balancer](../2_AWSComponents/1_NetworkingAndContentDelivery/ElasticLoadBalancer.md) is used for the load balancing.

![img.png](https://dzone.com/storage/temp/5747694-picture1.png)

## Master-Slave Technique
- TBD

## Vertical scalability ( Scale Up )

![img.png](https://dzone.com/storage/temp/5747695-picture2.png)

# References
- [Scalability and High Availability](https://dzone.com/refcardz/scalability)