# NAT gateways
- A [NAT gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html) is a Network Address Translation (NAT) service. 
- You can use a NAT gateway so that instances in a private subnet can connect to service outside your VPC but external services cannot initiate a connection with those instances.
- To access the Internet, one public IP address is needed, but we can use a private IP address in our private network. 
- The idea of [NAT](https://www.geeksforgeeks.org/network-address-translation-nat/) is to allow multiple devices to access the Internet through a single public address. 
- To achieve this, the translation of a private IP address to a public IP address is required.

![](../../assets/AWS_VPC.png)