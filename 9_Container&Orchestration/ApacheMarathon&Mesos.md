# Apache Marathon (A container orchestration platform for Mesos and DC/OS)
- [Marathon](https://mesosphere.github.io/marathon/) is a [production-grade container orchestration platform](Readme.md) for Mesosphere’s Datacenter Operating System (DC/OS) and [Apache Mesos](https://mesos.apache.org/).

# What is Apache Mesos? 
- [Apache Mesos](https://mesos.apache.org/) is built using the same principles as the Linux kernel, only at a different level of abstraction. 
- The Mesos kernel runs on every machine and provides applications (e.g., [Hadoop](../6_BigData/ApacheHadoop), [Spark](../6_BigData/DataProcessing/ApacheSpark/Readme.md), [Kafka](../4_MessageBrokersEDA/Kafka/Readme.md), [Elasticsearch](../3_Databases/9_Search-Databases/ElasticSearch)) with API’s for resource management and scheduling across entire datacenter and cloud environments.

## Features

### Resource Management using Mesos
- [Apache Mesos](https://mesos.apache.org/) abstracts CPU, memory, storage away from machines
- Program like it's a single of resources.

### Linear Scalability
- [Linear Scalability](../3_Databases/3_ScalabilityTechniques/Readme.md) - Industry proven to easily scale to 10,000s of nodes.

### High availability
- [Fault-tolerant](../7a_HighAvailability/Readme.md) replicated master and agents using [Zookeeper](../10_ClusterCoordination/ApacheZookeeper.md).
- It uses [Zookeeper](../10_ClusterCoordination/ApacheZookeeper.md) for the leader election.
- If the Mesos master is unavailable, existing tasks can continue to execute, but new resources cannot be allocated and new tasks cannot be launched. 
- To reduce the chance of this situation occurring, Mesos has a [high-availability](../7a_HighAvailability/Readme.md) mode that uses multiple Mesos masters
  - One active master (called the leader or leading master) and several backups in case it fails. 
- The masters elect the leader, with [Zookeeper](../10_ClusterCoordination/ApacheZookeeper.md) both coordinating the election and handling leader detection by masters, agents, and scheduler drivers

### Native Support for launching containers 
- Support different containers like [Docker](Docker/Readme.md), [Mesos Container](#mesos-containerization).

### Pluggable resource isolation
- First class isolation support for CPU, memory, disk, ports, GPU, and modules for custom resource isolation.

### Two level scheduling
- Support for running cloud native and legacy applications in the same cluster with pluggable scheduling policies.

### Cross Platform
- Runs on Linux, OSX and Windows. Cloud provider-agnostic.

# Mesos Containerization

# Real World Use Cases

## How Uber Manages a Million Writes Per Second Using Mesos and Cassandra Across Multiple Datacenters?

![](../1_TechStacks/Uber/UberCasandraMesos/assets/uber-casandra-mesos.png)

[Read more](../1_TechStacks/Uber/UberCasandraMesos/Readme.md)