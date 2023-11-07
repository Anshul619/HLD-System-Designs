# 3-Tier Architecture
- In the [3-tier architecture example](https://towardsaws.com/3-tier-architecture-in-aws-e1f8aa58b117), the internet-facing Application Load Balancer should be deployed to the public subnets and routed directly to the private (application) subnets.
- Internet gateway -> Application Load Balancer -> Applications -> Data -> Applications -> network address translation (NAT) solution -> internet gateway.

![](https://miro.medium.com/v2/resize:fit:1400/format:webp/1*DvuvxEPeuCgjefJugj4Idg.jpeg)

# IP Address Sequencing
In order of being likely to need the most IP addresses to the least, the three-tier VPC architecture is as follows:
- Private (Applications)
- Private (Data)
- Public

Why?
- Your public subnets should have a minimal attack surface.
- They should also be minimally resource-intensive. 
- Where possible, they should use managed services that do not require as many IP addresses as Amazon EC2 Auto Scaling groups or your data layer.
- Depending on your solution, your data-tier subnets are likely to need more IP addresses than your public subnets, but fewer than your application-tier subnets.