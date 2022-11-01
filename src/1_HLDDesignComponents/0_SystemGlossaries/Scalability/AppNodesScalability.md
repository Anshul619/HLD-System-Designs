
# Cluster capacity
- In general, a cluster (for ex. [Kubernates cluster](../../6_DevOps/Kubernates.md)) can be seen as abstracting a set of individual nodes as a big "super node".
- The total compute capacity (in terms of CPU and memory) of this super node is the sum of all the constituent nodes' capacities.

# Different Node Sizing Strategies

Given a desired target capacity (i.e. a combination of CPU cores & RAM) of a cluster, you have three node-sizing strategies to choose from,
- Many Small Nodes: All small nodes of the same capacity
- Few Large Nodes: All large nodes of the same capacity

![img.png](https://learnk8s.io/a/9b6d0691337289c039f1a33201e15a3f.svg)

| Feature                              | Few large nodes        | Many small nodes     |
|--------------------------------------|------------------------|----------------------|
| [Availability](../HighAvailability.md) | :-1: Decreases         | :+1: Increases       |
| [Kubernates Agents Overhead](../../6_DevOps/Kubernates.md#pods)         | :arrow_down: Increases | :arrow_up: Decreases |
|                                      |                        |                      |
|                                      |                        |                      |


# Reference
- [Architecting Kubernetes clusters — choosing a worker node size](https://learnk8s.io/kubernetes-node-size)
- [Choosing an Optimal Kubernetes Worker Node Size for Your Startup](https://blog.devgenius.io/choosing-an-optimal-kubernetes-worker-node-size-e0eacab408c4)