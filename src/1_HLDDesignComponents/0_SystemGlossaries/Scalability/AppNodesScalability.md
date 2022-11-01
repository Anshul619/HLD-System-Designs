
# Cluster capacity
- In general, a cluster (for ex. [Kubernates cluster](../../6_DevOps/Kubernates.md)) can be seen as abstracting a set of individual nodes as a big "super node".
- The total compute capacity (in terms of CPU and memory) of this super node is the sum of all the constituent nodes' capacities.

There are 2 ways to design the cluster
- Few large nodes
- Many small nodes

![img.png](https://learnk8s.io/a/9b6d0691337289c039f1a33201e15a3f.svg)



# Reference
- [Architecting Kubernetes clusters — choosing a worker node size](https://learnk8s.io/kubernetes-node-size)