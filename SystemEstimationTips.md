# Basic Storage Calculation Parameters

> The best way to do estimations is to have **BASE ballmark parameters** (a bit realistic).

# Ball-mark Parameters

| Basis                                                         | Value                                                           | Category              |
|---------------------------------------------------------------|-----------------------------------------------------------------|-----------------------|
| What is the traffic scale that we are looking at? (5 years)   | 500 million users                                               | Traffic               |
| DAU - What is the daily traffic scale that we are looking at? | 1 million active users per day (DAU)                            | Traffic               |
| Max CPU utilization, for autoscaling                          | 80% max CPU utilization                                         | Traffic - AutoScaling |
| Avg Machine Capacity                                          | 2 VPU, 8GB RAM                                                  | Traffic               |
| App Server (like Nginx) - Concurrent Active Connections       | 1000 concurrent active connections                              | Traffic               |
| Avg Read-Write Ratio (for read heavy systems)                 | 100:1 read:write ratio                                          | Traffic               |
| What is the storage scale that we are looking at?             | 5 years storage                                                 | DB Scalability        |
| Avg DB shard size                                             | 1 TB to 10 TB hard disk                                         | DB Scalability        |
| Avg machine RAM (for Redis, DB instances)                     | 72 GB RAM                                                       | DB Scalability        |
| Avg Photo Size (KB)                                           | 200 KB                                                          | DB Scalability        |
| Avg Redis Query Time                                          | [10 ms](https://redis.io/docs/management/optimization/latency/) | DB Scalability        |
| Character Representation                                      | 1 byte                                                          | DB Scalability        |
| Avg URL size (bytes)                                          | 500 bytes                                                       | DB Scalability        |
| Avg Id size (bytes)                                           | 8 bytes                                                         | DB Scalability        |
| Ideal Latency Time (for an API/microservice)                  | Less than 100 ms                                                | Traffic               |

# Size Calculation (Storage, RAM etc.)

| Base             | Value      | 
|------------------|------------|
| Single Character | 1 byte     |
| 1 KB             | 1000 bytes |
| 1 MB             | 1000 KB    |
| 1 GB             | 1000 MB    |
| 1 TB             | 1000 GB    |
| 1 PB             | 1000 TB    |

# Numbers Calculation (User counts etc.)

| Base      | Value                     | 
|-----------|---------------------------|
| 1 Million | 10^6 units                |
| 1 Billion | 10^3 million = 10^9 units |

# Time Calculation

| Base          | Value           | 
|---------------|-----------------|
| Nano-Seconds  | 1 sec = 10^9 ns |
| Micro-Seconds | 1 sec = 10^6 us |
| Milli-Second  | 1 sec = 10^3 ms |

# Estimation Tips
- Round the numbers to simplify the values.

|                                     | Formula                                                            |
|-------------------------------------|--------------------------------------------------------------------|
| No. of shards (for scaling purpose) | `Total storage needed for 5 years`/`Per machine storage available` |
| No. of cache machines               | `Max Cache at any time`/`Per machine RAM available`                |

# Latency Comparison Numbers

| Storage                                   | Latency           | Remarks                     |
|-------------------------------------------|-------------------|-----------------------------|
| :star: Read 1 MB sequentially from memory | 250 us (4 GB/sec) | ~`4 times faster than SSD`  |
| :star: Read 1 MB sequentially from SSD    | 1 ms (1 GB/sec)   | ~`30 times faster than HDD` |
| Read 1 MB sequentially from HDD           | 30 ms (30 MB/sec) |                             |
| Mutex lock/unlock                         | 25 ns             |                             |
| RAM/Main Memory reference                 | 100 ns            |                             |
| SSD Reference                             | 50 us             |                             |
| HDD seek                                  | 10 ms             |                             |

> Handy Metrics:
> - 2,000 round trips per second within a data center.
> - 6-7 world-wide round trips per second.

# References
- [Byte byte go - Back-Of-The-Envelope Estimation / Capacity Planning](https://www.youtube.com/watch?v=UC5xf8FbdJc)
- [NgInx - 1000 concurrent sessions](https://www.linode.com/community/questions/22200/nodebalancers-are-supposed-to-handle-10000-maximum-concurrent-connections)
- [Bytes Calculator](https://mothereff.in/byte-counter)
- [Donnemartin - Latency](https://github.com/donnemartin/system-design-primer#latency-numbers-every-programmer-should-know)
