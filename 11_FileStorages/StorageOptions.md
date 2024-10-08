# Storage volume types

| Volume type        | Key Strength                        | Use Cases                                                                                                                                                                |
|--------------------|-------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| SSD-backed volumes | High read/write with small I/O size | SSD-backed volumes optimized for transactional workloads involving frequent read/write operations with small I/O size, where the dominant performance attribute is IOPS. |
| HDD-backed volumes | Large I/O size                      | HDD-backed volumes optimized for large streaming workloads where throughput (measured in MiB/s) is a better performance measure than IOPS.                               |

# Storage Types

![img.png](https://www.ctera.com/wp-content/uploads/2019/02/Ctera-Cool-Medium-Hot-Graphic-051122.jpg)

| Storage type | Application storage option | Examples                                                                                                                                         | Remarks                                                                                                                                                                                                                                               |
|--------------|----------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Hot Storage  | SSD (fast storage)         | [Amazon Dynamo DB](../2_AWS/1_DatabaseServices/AmazonDynamoDB/Readme.md), [Amazon Aurora](../2_AWS/1_DatabaseServices/AmazonRDS) | [Hot storage]() is data that is accessed frequently.<br/>- This could be data that is being actively used by employees or customers.                                                                                                                  |
| Warm Storage | HDD                        |                                                                                                                                                  | [Warm storage]() is data that is accessed less frequently.<br/>- This could be data that is used for reporting or analytics.<br/>- It doesn’t need to be accessed as quickly as hot data, so it can be stored on slightly slower, capacity-optimized. |
| Cold Storage | Object Storage             | [Amazon S3](../2_AWS/6_StorageServices/3_S3ObjectStorage/Readme.md)                                                                      | [Cold storage]() is data that is rarely accessed.<br/>- It can be stored on even slower, `cheap and deep` storage.                                                                                                                                    |

[Read more](https://www.ctera.com/company/blog/differences-hot-warm-cold-file-storage/)

# Read more
- [SSD (solid-state drive)](https://www.techtarget.com/searchstorage/definition/SSD-solid-state-drive)