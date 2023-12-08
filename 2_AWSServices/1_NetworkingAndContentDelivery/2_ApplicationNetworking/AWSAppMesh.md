# AWS AppMesh
- [AWS App Mesh](https://aws.amazon.com/app-mesh/) provides application-level networking so your services can communicate across multiple types of compute infrastructure.
- Internally, it uses [AWS Cloud Map](AWSCloudMap.md) for the service discovery.
- Once AWS AppMesh is configured, the service map can be analysed in [AWS X-Ray](../../8_ObservabilityLogsServices/AWSXRay.md).

![](https://miro.medium.com/max/1160/1*GiaSew6ulJAg7Ap9GWOd-w.webp)

# Concepts

| Concept                                                                                               | Description                                                                                                                                                                                                                                                                                                                                                           |
|-------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Service Meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/meshes.html)                   | A service mesh is a logical boundary for network traffic between the services that reside within it.                                                                                                                                                                                                                                                                  |
| [Virtual nodes](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_nodes.html)             | A virtual node acts as a logical pointer to a particular task group, such as an Amazon ECS service or a Kubernetes deployment.                                                                                                                                                                                                                                        |
| [Virtual services](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_services.html)       | A virtual service is an abstraction of a real service that is provided by a virtual node directly or indirectly by means of a virtual router.                                                                                                                                                                                                                         |
| [Virtual routers](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_routers.html)         | Virtual routers handle traffic for one or more virtual services within your mesh. <br/>- After you create a virtual router, you can create and associate routes for your virtual router that direct incoming requests to different virtual nodes.<br/>- Virtual routers helps in the [canary deployments](../../../13_DevOps/DeploymentTechniques.md). |

# References
- [Why do we need 🤔! AWS App Mesh](https://medium.com/@saimsafder14/why-do-we-need-aws-app-mesh-3f670e874f2)