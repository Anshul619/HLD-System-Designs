# Route tables
- [A route table](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html) contains a set of rules, called [routes](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html), that determine where network traffic from your subnet or gateway is directed. 
- When the [CIDR blocks for route table](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html) entries overlap, the more specific (smaller range) CIDR block takes priority.

![img.png](../../../1_NetworkingAndContentDelivery/3_NetworkFoundationsVPC/assets/AWS_VPC.png)

# Concepts

| Concept               | Description                                                                                                                                                                                                                         |
|-----------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Destination           | The range of IP addresses where you want traffic to go (destination CIDR). For example, an external corporate network with the CIDR 172.16.0.0/12.                                                                                  |
| Target                | The gateway, network interface, or connection through which to send the destination traffic; for example, an internet gateway.                                                                                                      |
| 0.0.0.0/0 - IP Ranges | Standard default address range used to route all outbound traffic to an [Amazon Virtual Private Cloud (Amazon VPC) internet gateway](../../../1_NetworkingAndContentDelivery/3_NetworkFoundationsVPC/InternetGateway.md). |

[Read more](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html)
