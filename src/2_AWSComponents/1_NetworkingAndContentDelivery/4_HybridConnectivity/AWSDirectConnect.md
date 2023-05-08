# AWS Direct Connect
- [AWS Direct Connect](https://aws.amazon.com/directconnect/) provides a dedicated, private connection between an on-premises data center and an AWS region over a high-speed, low-latency connection, which is facilitated by a direct physical link between the two locations.

![img.png](../3_NetworkFoundationsVPC/assets/AWS_VPC.png)

# Facts
- Direct connect takes significant time (several months) to be provisioned.
- All connections must be dedicated connections and have a port speed of 1 Gbps, 10 Gbps, or 100 Gbps.
- All connections in the LAG must use the same bandwidth.
- You can have a maximum of two 100-Gbps connections in a LAG, or four connections with a port speed less than 100 Gbps. Each connection in the LAG counts toward your overall connection limit for the Region.
- All connections in the LAG must terminate at the same Direct Connect endpoint.
- When you create a LAG, you can download the Letter of Authorization and Connecting Facility Assignment (LOA-CFA) for each new physical connection individually from the Direct Connect console.

# Network requirements 
- Your network is co-located with an existing Direct Connect location.
- You are working with a Direct Connect Partner.
- You are working with an independent service provider to connect to Direct Connect.

# AWS Direct Connect Delivery Partners
- AWS Direct Connect Delivery Partners help you establish network connectivity between AWS Direct Connect locations and their data center, office, or colocation environment via the following models: Dedicated Connections, Hosted Connections, and Hosted Virtual Interfaces.