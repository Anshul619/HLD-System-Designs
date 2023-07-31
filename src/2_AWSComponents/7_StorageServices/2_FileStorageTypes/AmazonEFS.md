
# Amazon Elastic File System (EFS)
- [Amazon Elastic File System (EFS)](https://docs.aws.amazon.com/efs/latest/ug/whatisefs.html) is essentially [NAS as a service](https://aws.amazon.com/what-is/nas/).
- It is a Network Storage system, underlying it is a storage array (SAN) and it offers the standard protocol for [multi session network file systems (NFS)](../Network-Protocol-Support.md).
- It is a POSIX compliant file storage system on AWS Cloud.

# Features

| Feature                             | Remarks                                                                                                                                                                                                                                                                                                                                                                                                                  |
|-------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [EFS vs Others](../S3vsEBSvsEFS.md) | -                                                                                                                                                                                                                                                                                                                                                                                                                        |
| Performance mode                    | General Purpose or Max I/O<br/>- [Max I/O performance mode](https://docs.aws.amazon.com/efs/latest/ug/performance.html) is used to scale to higher levels of aggregate throughput and operations per second.                                                                                                                                                                                                             |
| Storage Layer                       | It's built on [high speed SSD drives](https://en.wikipedia.org/wiki/Solid-state_drive)                                                                                                                                                                                                                                                                                                                                   |
| Concurrent operations               | [EFS](https://docs.aws.amazon.com/efs/latest/ug/performance.html) is mainly designed for [multiple EC2 instances](../../3_ComputeServices/AmazonEC2) to access the files concurrently (which can't be done with [EBS](../1_BlockStorageTypes/AmazonEBS/Readme.md)).<br/>- Highly parallelized applications and workloads, such as big data analysis, media processing, and genomic analysis, can benefit from this mode. |

# Storage Classes

|          | EFS Standard   | Standard-IA                    | EFS One Zone              |
|----------|----------------|--------------------------------|---------------------------|
| Use Case | General        | Less Frequently accessed items | Availability in 1 AZ only |
| Pricing  | $0.30/GB-Month | Cheaper than EFS Standard      | Cheaper than Standard-IA  |

[Read more](https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html)

# Throughput Modes

|          | Bursting                   | Provisioned                                       | Elastic |
|----------|----------------------------|---------------------------------------------------|---------|
| Default  | :white_check_mark: Yes     | :x: No                                            | :x: No  |
| Use Case | Spiky file-based workloads | High throughput to storage (MiB/s per TiB) ratios | -       |

# Performance Modes

|         | General                                                                                                                                                                           | Max-IO                                                                                                                                                                                                               |
|---------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Default | :white_check_mark: Yes                                                                                                                                                            | :x: No                                                                                                                                                                                                               |
| Remarks | General Purpose performance mode is ideal for latency-sensitive use cases, like web serving environments, content management systems, home directories, and general file serving. | Max I/O performance mode is used to scale to higher levels of aggregate throughput and operations per second. <br/>- This scaling is done with a tradeoff of slightly higher latencies for file metadata operations. |


# References
- [Is EFS a substitute of HDFS for distributed storage?](https://stackoverflow.com/questions/60698924/is-efs-a-substitute-of-hdfs-for-distributed-storage)