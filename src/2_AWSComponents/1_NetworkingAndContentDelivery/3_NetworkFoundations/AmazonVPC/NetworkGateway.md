# Network Address Translation (NAT) gateways
- [NAT gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html) can be used to connect instances in a private subnet to service outside your VPC but external services cannot initiate a connection with those instances.

# Facts & Concepts

| Concept                     | Description                                                                                                                                                                   |
|-----------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Ingress traffic not allowed | [NAT gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html) only allow egress network traffic, not ingress.                                          |
| Single Public IP Address    | The idea of [NAT](https://www.geeksforgeeks.org/network-address-translation-nat/) is to allow multiple devices to access the Internet through a single public address.<br/>- To access the Internet, one public IP address is needed, but we can use a private IP address in our private network.|

![](assets/AWS_VPC.png)