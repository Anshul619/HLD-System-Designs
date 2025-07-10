# PhonePe - Tech Stack

| Purpose                 | Service                                                              |
|-------------------------|----------------------------------------------------------------------|
| API Gateways            | 7 api gateways                                                       |
| Transient Store & Cache | [Aerospike](../3_Databases/8_Caching-InMemory-Databases/AeroSpike.md) |
| Hot Store (Primary)     | MariaDB - MySQL (7 weeks data, 4 Shards with each shard = 500GB)     |
| Cold Store (Historical) | HBase (through Dynamic Replication)                                  |
| Resource Manager        | Mesos                                                                |
| Orchestrator            | Apache Marathon                                                      |
| Container               | Docker                                                               |
| Fraud Event Ingestion   | Schemaless                                                           |
| Observability           | InfluxDB, Grafana                                                    |

# References
- [The Making of the Fintech Disruptor | Phone Pe | CTOtalk | Rahul Chari](https://www.youtube.com/watch?v=L1AKkJlNNgA)
- [Tech Blog](https://tech.phonepe.com/)