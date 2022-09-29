
# Amazon ELB - Elastic Load Balancer
- [Amazon ELB - Elastic Load Balancer](https://docs.aws.amazon.com/elasticloadbalancing) automatically distributes your incoming traffic across multiple targets, such as [EC2 instances](../4_ComputeServices/EC2), [containers](../3_InfraAutomation/AmazonECS), and IP addresses, in [one or more Availability Zones](../AWS-Global-Architecture-Region-AZ.md). 
- It monitors the health of its registered targets and routes traffic only to the healthy targets. 
- You can select the type of [load balancer](https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/introduction.html) that best suits your needs.

# Types of ELB Load Balancers

## :star: Application Load Balancer (Recommended)
- [Application Load Balancer](https://aws.amazon.com/elasticloadbalancing/application-load-balancer/) is [highly available by default](../../1_HLDDesignComponents/0_SystemGlossaries/HighAvailability.md), in AWS. 
- It is used to divide the traffic between app servers.
- [More about Load Balancer](../../1_HLDDesignComponents/0_SystemGlossaries/LoadBalancer.md)

![img.png](assests/AWS_Application_Load_Balancer.drawio.png)

### Key Features
- [Highly available](../../1_HLDDesignComponents/0_SystemGlossaries/HighAvailability.md)
- Health checks
- Session stickiness
- Monitoring/logging
- Content-based routing
- Container based apps
- WebSockets
- HTTP/2

### ELB Load Balancer setup in Multi-Regions & Multi-AZs

![img.png](../0_AWSDesigns/DesignMultiRegionActiveActiveArchitectureOnAWS/AWS-AZ-Region-HA.drawio.png)

## Network Load Balancer
- [TBD](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/introduction.html)

## Gateway Load Balancer
- [TBD](https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/introduction.html)

# References
- [AWS ELB - Elastic Load Balancer | Why and What is ELB? | What are listeners and target groups?](https://www.youtube.com/watch?v=fMgA3rE0aPY)