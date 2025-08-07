# Fault Tolerance
- [Fault Tolerance](https://www.linkedin.com/pulse/high-availability-vs-fault-tolerance-jon-bonso/) has the goal of keeping your application running with `zero downtime`.
- It can tolerate any component fault to avoid any performance impact, data loss, or system crashes by having redundant resources beyond what is typically needed.
- The things that can go wrong are call [faults](https://www.linkedin.com/pulse/high-availability-vs-fault-tolerance-jon-bonso/) & systems that anticipate faults & can cope with them are called [fault-tolerant or resilient](https://www.linkedin.com/pulse/high-availability-vs-fault-tolerance-jon-bonso/).
- [It is an upgraded version of High Availability](Readme.md).
- Conceiving a system that is hundred percent fault-tolerant is practically very difficult.

# Fault tolerance techniques

| Technique     | Description                                                                                                                                                |
|---------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Replication   |                                                                                                                                                            |
| Checkpointing | Checkpointing is a technique that saves the system’s state in stable storage for later retrieval in case of failures due to errors or service disruptions. |
