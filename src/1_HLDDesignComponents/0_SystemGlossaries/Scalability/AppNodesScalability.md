
# Cluster capacity
- In general, a cluster (for ex. [Kubernates cluster](../../6_DevOps/Kubernates.md)) can be seen as abstracting a set of individual nodes as a big "super node".
- The total compute capacity (in terms of CPU and memory) of this super node is the sum of all the constituent nodes' capacities.

# :star: Recommendation for a startup with less than 10 microservices
- For [high-availability](../HighAvailability.md), have a minimum of 3 worker nodes (i.e. 3-fold replication). As a startup, 3–5 worker nodes is sufficient.
- Set up [horizontal auto-scaling](../../../2_AWSComponents/4_ComputeServices/AmazonEC2/AutoScalingGroup/README.md) to spawn a maximum of 5 worker nodes.
- If you have a [stateless application](../README.md#star-stateless-protocol), turn on [horizontal pod auto scaling (HPA)](../../6_DevOps/Kubernates.md#star-horizontal-pod-autoscaling).
- For the development environment, use nodes of one of the following sizes [t3.medium, t3.large, m5.medium, or m5.large](../../../2_AWSComponents/4_ComputeServices/AmazonEC2/ReadMe.md).
- For a production environment, it’s traffic-dependent. 
- But, if you don’t know better right now, you can start with [an m5 series (1x-4x large)](../../../2_AWSComponents/4_ComputeServices/AmazonEC2/ReadMe.md) in production.

# Different Node Sizing Strategies

Given a desired target capacity (i.e. a combination of CPU cores & RAM) of a cluster, you have three node-sizing strategies to choose from,
- Many Small Nodes: All small nodes of the same capacity
- Few Large Nodes: All large nodes of the same capacity

![img.png](https://learnk8s.io/a/9b6d0691337289c039f1a33201e15a3f.svg)

| Feature                                                         | Few large nodes | :+1: Many small nodes |
|-----------------------------------------------------------------|-----------------|-----------------------|
| [Availability](../HighAvailability.md)                          | :-1: Decreases  | :+1: Increases        |
| [Kubernates Agents Overhead](../../6_DevOps/Kubernates.md#pods) | :-1: Increases  | :+1: Decreases        |
| Master Node Overhead                                            | :+1: Decreases  | :-1: Increases        |
| Cost Efficiency (with auto-scaling)                             | :-1: Decreases  | :+1: Increases        |

# Reference
- [Architecting Kubernetes clusters — choosing a worker node size](https://learnk8s.io/kubernetes-node-size)
- [Choosing an Optimal Kubernetes Worker Node Size for Your Startup](https://blog.devgenius.io/choosing-an-optimal-kubernetes-worker-node-size-e0eacab408c4)