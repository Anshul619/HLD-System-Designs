# Container Orchestration Service
- [Container orchestration service](https://www.vmware.com/topics/glossary/content/container-orchestration.html) is the container management service.
- They are also responsible for the allocation of resources/servers to tasks/services. 
- Every task/service needs to specify its [required resources](../7_PropertiesDistributedSystem/Scalability/Compute.md) (e.g. 3 CPU cores, 2 GiB of RAM). 
- Using the list of requirements for all tasks/services, [Orchestrator]() can bin-pack the tasks over the machines in an optimal way that [also accounts for failure domains](../7_PropertiesDistributedSystem/Reliability/FaultTolerance.md).

# Why container orchestration service needed?
- It helps to answer key questions related to scale, reliability of containers.

| Key Question                                                                                                       |
|--------------------------------------------------------------------------------------------------------------------|
| How many resources are still available on the different machines?                                                  |
| How to place your containers on your instances? And how many?                                                      |
| What happens if your container or instance fails? i.e. If the docker container is crashed and not running anymore? |
| When to schedule the next container?                                                                               |
| How to monitor deployments of your containers?                                                                     |

# Popular Container Orchestration Services

| Component                                                                                  | Strength                                                                            | Type                                                                     |
|--------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| :star: [Kubernates](Kubernates/Readme.md)                                                  | Can run 10s of thousands of machines, across multiple clusters                      | [Container Orchestration Service](Readme.md)                             |
| :star: [Docker](Docker/Readme.md)                                                          | Mostly used containerization                                                        | [Container Orchestration Service](Readme.md)                             |
| :star: [Amazon ECS](../2_AWSServices/4_ContainerOrchestrationServices/AmazonECS/Readme.md) | Flexible, AWS managed service                                                       | [Container Orchestration Service](Readme.md)                             |
| [Apache Marathon & Mesos](ApacheMarathon&Mesos.md)                                         | Can run 10s of thousands of machines, across multiple clusters                      | [Container Orchestration Service](Readme.md) (with own Containerization) |
| [Apache Yarn](ApacheYarn.md)                                                               | Big-Data Processing (part of [Hadoop](../6_BigDataServices/ApacheHadoop/Readme.md)) | [Container Orchestration Service](Readme.md)                             |
| [Red Hat OpenShift](https://www.redhat.com/en/technologies/cloud-computing/openshift)      |                                                                                     | [Container Orchestration Service](Readme.md)                             |

# Other Key Links

| Link                                                        |
|-------------------------------------------------------------|
| [Containers vs Virtual Machines](ContainerVsVMs.md)         |
| [Container Registry Services](ContainerRegistryServices.md) |
 
# When not to use containers?

| Use Case                                                                      | Description                                                                                                                                                                                                                                                |
|-------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| When applications need persistent data storage                                | Persistent storage requirements increase the security and storage complexity and also make the containers less portable. <br/>- If the container is moved, the storage needs to be reconfigured and secured.                                               |
| When applications have complex networking, routing, or security requirements? | Containers are portable and can be moved through different environments (testing, staging, production). If the application requires a complex configuration for networking, routing, storage, and so on, the containers are much more challenging to move. |

# References
- [Is Kubernetes going to replace YARN and/or Mesos?](https://www.quora.com/Is-Kubernetes-going-to-replace-YARN-and-or-Mesos)
