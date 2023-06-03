# Storage volume types

| Volume type        | Key Strength                        | Use Cases                                                                                                                                                                |
|--------------------|-------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| SSD-backed volumes | High read/write with small I/O size | SSD-backed volumes optimized for transactional workloads involving frequent read/write operations with small I/O size, where the dominant performance attribute is IOPS. |
| HDD-backed volumes | Large I/O size                      | HDD-backed volumes optimized for large streaming workloads where throughput (measured in MiB/s) is a better performance measure than IOPS.                               |