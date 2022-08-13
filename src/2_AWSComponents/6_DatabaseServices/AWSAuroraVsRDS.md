
# Amazon Aurora vs Amazon RDS

| Basis                                      | :star: [Amazon Aurora](AmazonAurora/Readme.md)                                              | [Amazon RDS](AmazonRDS.md)                                      |
|--------------------------------------------|--------------------------------------------------------------------------------------|-----------------------------------------------------------------|
| Compatible DB Engines                      | Postgres, MySQL                                                                      | Postgres, MySQL, Oracle, MS SQL, Oracle                         |
| Performance                                | `5x faster than RDS MySQL, 3x than RDS Postgres`. High throughput (200K writes/second) | -                                                               |
| Size                                       | Supports upto 128 TB DB size                                                         | Supports upto 64 TB DB size                                     |
| Max Read Replicas                          | Upto `15 read-replicas, across multiple regions`                                     | Upto 5 read-replicas                                            |
| Replica lag                                | ~ 100 ms ( max 1 second ), uses `physical, log-based asynchronous replication`       | ~ few mins                                                      |
| Pricing                                    | 20% costly than RDS                                                                  | -                                                               |
| Crash Recovery                             | Quicker than RDS                                                                     | -                                                               |
| Fail Over                                  | less than 30 secs, in case of AZ or region failure                                   | around 60-120 seconds                                           |
| IOPS (input/output operations per second ) | Greater than 80K IOPS                                                                | Max 80K IOPS                                                    |
| HA ( by default )                          | 6 replicas in 3 AZs                                                                  | Replicas in 2 AZs                                               |
| Storage | Uses a `single, virtual cluster volume` that uses SSDs.                                | Supports `Amazon EBS` solid state drive (SSD)-based storage types |