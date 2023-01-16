# Container Orchestration Service
- [Container orchestration service](https://www.vmware.com/topics/glossary/content/container-orchestration.html) is the container management service.

# Benefits 

It helps to know,
- How many resources are still available on the different machines?
- When to schedule the next container?
- If the docker container is crashed and not running anymore? 
- If replicates need to be removed? How to remove? One by one?

# Popular Container Orchestration Services

| Component                                                                                        | Strength                                                                              | Type                                                                     | Remarks |
|--------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------|--------------------------------------------------------------------------|---------|
| :star: [Kubernates](Kubernates.md)                                                               | Can run 10s of thousands of machines, across multiple clusters                        | [Container Orchestration Service](Readme.md)                             | -       |
| :star: [Docker](Docker/Readme.md)                                                                | Mostly used containerization                                                          | [Container Orchestration Service](Readme.md)                             | -       |
| :star: [Amazon ECS](../../2_AWSComponents/4_ContainerOrchestrationServices/AmazonECS/Readme.md) | Flexible, AWS managed service                                                         | [Container Orchestration Service](Readme.md)                             | -       |
| [Apache Marathon & Mesos](ApacheMarathon&Mesos.md)                                               | Can run 10s of thousands of machines, across multiple clusters                        | [Container Orchestration Service](Readme.md) (with own Containerization) | -       |
| [Apache Yarn](ApacheYarn.md)                                                                     | Big-Data Processing (part of [Hadoop](../5_BigDataComponents/ApacheHadoop/Readme.md)) | [Container Orchestration Service](Readme.md)                             | -       |

# References
- [Big Misconceptions about Bare Metal, Virtual Machines, and Containers](https://www.youtube.com/watch?v=Jz8Gs4UHTO8)
- [Is Kubernetes going to replace YARN and/or Mesos?](https://www.quora.com/Is-Kubernetes-going-to-replace-YARN-and-or-Mesos)
