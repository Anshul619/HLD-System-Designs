
# Amazon Aurora vs Amazon RDS

| Basis                                                                                          | :star: [Amazon Aurora](AmazonAurora/Readme.md)                                         | [Amazon RDS](AmazonRDS.md)                                        |
|------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|-------------------------------------------------------------------|
| Compatible DB Engines                                                                          | Postgres, MySQL                                                                        | Postgres, MySQL, Oracle, MS SQL, Oracle                           |
| Performance                                                                                    | `5x faster than RDS MySQL, 3x than RDS Postgres`. High throughput (200K writes/second) | -                                                                 |
| Size                                                                                           | Supports upto 128 TB DB size                                                           | Supports upto 64 TB DB size                                       |
| [Read Replicas](../../1_HLDDesignComponents/0_SystemGlossaries/Scalability.md)                 | Upto `15 read-replicas, across multiple regions`                                       | Upto 5 read-replicas                                              |
| [High Availability](../../1_HLDDesignComponents/0_SystemGlossaries/HighAvailability.md)        | By default, 6 replicas in 3 AZs                                                        | By default, Replicas in 2 AZs                                     |
| [Replica lag](../../1_HLDDesignComponents/0_SystemGlossaries/ReplicationAndDataConsistency.md) | ~100 ms ( max 1 second ), uses `physical, log-based asynchronous replication`          | ~ few mins                                                        |
| Pricing                                                                                        | 20% costly than RDS                                                                    | -                                                                 |
| Crash Recovery                                                                                 | Quicker than RDS                                                                       | -                                                                 |
| [Fail Over](../../1_HLDDesignComponents/0_SystemGlossaries/HighAvailability.md#fail-over-policies)             | less than 30 secs, in case of AZ or region failure                                     | around 60-120 seconds                                             |
| IOPs (input/output operations per second )                                                     | Greater than 80K IOPS                                                                  | Max 80K IOPS                                                      |
| Storage                                                                                        | Uses a `single, virtual cluster volume` that uses SSDs.                                | Supports `Amazon EBS` solid state drive (SSD)-based storage types |


  