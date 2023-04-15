# Service Mesh
- A [service mesh](https://www.techtarget.com/searchitoperations/definition/service-mesh) is a dedicated infrastructure layer that controls service-to-service communication over a network.

# Various Technologies

| Tech                                                                               | Description |
|------------------------------------------------------------------------------------|-------------|
| [AWS App Mesh](../../2_AWSComponents/1_NetworkingAndContentDelivery/ApplicationNetworking/AWSAppMesh.md) | -           |

# Common Issues with Microservices
- Uniformity of logs, metrics and traces
- Load balancing
- Weight and shift traffic for deployments
- Minimize application code impact
- Decouple service teams

While it’s technically possible to do all of this with just traditional networking practices, the difficulty and time necessary to manage these issues quickly leads us to look for a better solution.
- That solution is a service mesh.
- We install a small, lightweight proxy server next to each and every container, and then wire up a separate overlay network between these proxy servers on top of the existing networking provided by the infrastructure layer such as AWS VPC.

![](https://miro.medium.com/max/1400/1*r6OE8zg_T_Ux5ApJKdS-jw.webp)

# Features
- First, it sits between all services and manages and observes traffic.
- Secondly, it communicates with the control plane