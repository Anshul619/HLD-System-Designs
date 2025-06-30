# Service Mesh
- A [service mesh](https://www.techtarget.com/searchitoperations/definition/service-mesh) is a dedicated infrastructure layer that controls service-to-service communication over a network.

# Various Technologies

| Tech                                                                                           |
|------------------------------------------------------------------------------------------------|
| [AWS App Mesh](../2_AWS/16_NetworkingAndContentDelivery/2_ApplicationNetworking/AWSAppMesh.md) |

# Why service mesh? 

There are common issues with microservices like
- Uniformity of logs, metrics and traces
- Load balancing
- Weight and shift traffic for deployments
- Minimize application code impact
- Decouple service teams

While it’s technically possible to do all of this with just traditional networking practices, the difficulty and time necessary to manage these issues quickly leads us to look for a better solution.
- That solution is a service mesh.
- We install a small, lightweight proxy server next to each and every container, and then wire up a separate overlay network between these proxy servers on top of the existing networking provided by the infrastructure layer such as AWS VPC.

![](https://miro.medium.com/max/1400/1*r6OE8zg_T_Ux5ApJKdS-jw.webp)