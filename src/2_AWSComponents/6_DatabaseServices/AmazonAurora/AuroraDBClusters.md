# Aurora DB Clusters

![img.png](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/images/AuroraArch001.png)

## Aurora Multi-master cluster
- About [Aurora Multi-master cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html)

### :thumbsdown: Disadvantages with Aurora Multi-master clusters
- You can have a maximum of `four master DB instances` in a multi-master cluster.
- All DB instances in a multi-master cluster must be in the same AWS Region.
- You can't enable cross-Region replicas from multi-master clusters.
- Multi-master clusters are available in the certain AWS Regions.
- A multi-master cluster doesn't do any load balancing for connections.
  - Application must implement its own connection management logic to distribute read and write operations among multiple DB instance endpoints.