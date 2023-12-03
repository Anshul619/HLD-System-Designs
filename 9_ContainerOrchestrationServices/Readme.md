# Container Orchestration Service
- [Container orchestration service](https://www.vmware.com/topics/glossary/content/container-orchestration.html) is the container management service.
- They are also responsible for the allocation of resources/servers to tasks/services. 
- Every task/service needs to specify its required resources (e.g., 3 CPU cores, 2 GiB of RAM). 
- Using the list of requirements for all tasks/services, Orchestrator can bin-pack the tasks over the machines in an optimal way that [also accounts for failure domains](../7_PropertiesDistributedSystem/Reliability/FaultTolerance.md).

# Benefits 
- How many resources are still available on the different machines?
- When to schedule the next container?
- If the docker container is crashed and not running anymore? 
- If replicates need to be removed? How to remove? One by one?

If you’re trying to manage your compute at a large scale, you must know the following:
- How to place your containers on your instances? 
- What happens if your container fails?
- What happens if your instance fails?
- How to monitor deployments of your containers?

This coordination is handled by a [container orchestration services](). 

# Popular Container Orchestration Services

| Component                                                                                  | Strength                                                                                                        | Type                                                                     |
|--------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------|
| :star: [Kubernates](Kubernates/Readme.md)                                                         | Can run 10s of thousands of machines, across multiple clusters                                                  | [Container Orchestration Service](Readme.md)                             |
| :star: [Docker](Docker/Readme.md)                                                          | Mostly used containerization                                                                                    | [Container Orchestration Service](Readme.md)                             |
| :star: [Amazon ECS](../2_AWSServices/4_ContainerOrchestrationServices/AmazonECS/Readme.md) | Flexible, AWS managed service                                                                                   | [Container Orchestration Service](Readme.md)                             |
| [Apache Marathon & Mesos](ApacheMarathon&Mesos.md)                                         | Can run 10s of thousands of machines, across multiple clusters                                                  | [Container Orchestration Service](Readme.md) (with own Containerization) |
| [Apache Yarn](ApacheYarn.md)                                                               | Big-Data Processing (part of [Hadoop](../6_BigDataServices/ApacheHadoop/Readme.md)) | [Container Orchestration Service](Readme.md)                             |
| [Red Hat OpenShift](https://www.redhat.com/en/technologies/cloud-computing/openshift)      |                                                                                                                 | [Container Orchestration Service](Readme.md)                             |

# References
- [Big Misconceptions about Bare Metal, Virtual Machines, and Containers](https://www.youtube.com/watch?v=Jz8Gs4UHTO8)
- [Is Kubernetes going to replace YARN and/or Mesos?](https://www.quora.com/Is-Kubernetes-going-to-replace-YARN-and-or-Mesos)
