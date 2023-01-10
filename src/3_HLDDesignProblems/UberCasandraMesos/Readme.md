
# How Uber Manages a Million Writes Per Second Using Mesos and Cassandra Across Multiple Datacenters?

![img.png](assets/uber-casandra-mesos.png)

# Co-Host services
- A single machine can run services of different kinds. (Co-host services on the single machine)
- Statistically multiplexing services on the same machine can lead to needing 30% fewer machines. This is a finding from an experiment run at Google on Borg.
- If, for example, one services uses a lot of CPU it matches well with a service that uses a lot of storage or memory, then these two services can be efficiently run on the same server. Machine utilization goes up.

# Stats
- As in 2016, Uber had about [20 Cassandra clusters](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md) and planned on having 100 in the future.
  - It’s very hard to get all that in a single shared cluster. 
  - If you, for example, made a [1000 node Cassandra cluster](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md) it would not scale or it would also have performance interference across different clusters.
- ~300 machine across two data centers.
- Largest 2 clusters: `More than a million writes/sec and ~100k reads/sec` 
  - One of the clusters was storing the location that was sent out every 30 seconds by both the driver and rider apps.

# App Provisioning
- Uber use [Docker containers](../../1_HLDDesignComponents/6a_ContainerOrchestrationServices/Docker/Readme.md) on [Mesos](../../1_HLDDesignComponents/6a_ContainerOrchestrationServices/ApacheMarathon&Mesos.md) to run their microservices with consistent configurations scalable, with help from Aurora for long-running services and cron jobs.
- One of Uber infrastructure teams, Application Platform, produced a template library that builds services into shippable [Docker images](../../1_HLDDesignComponents/6a_ContainerOrchestrationServices/Docker/Readme.md).

# References
- [HighScalability - How Uber Manages a Million Writes Per Second Using Mesos and Cassandra Across Multiple Datacenters?](http://highscalability.com/blog/2016/9/28/how-uber-manages-a-million-writes-per-second-using-mesos-and.html)
- [Cassandra on Mesos Across Multiple Datacenters at Uber (Abhishek Verma) | C* Summit 2016](https://www.youtube.com/watch?v=4Ap-1VT2ChU)