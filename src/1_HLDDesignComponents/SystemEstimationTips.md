# Basic Storage Calculation Parameters

## Ball-mark Parameters

| Basis                                                                                                                                                                                 | Module                       | Value                                                            |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------|------------------------------------------------------------------|
| What is the traffic scale that we are looking at?                                                                                                                                     | Traffic                      | 500 million users                                                |
| DAU - What is the DAILY traffic scale that we are looking at?                                                                                                                         | Traffic                      | 1 million active users per day (DAU)                             |
| Max CPU utilization, for autoscaling                                                                                                                                                  | Traffic - AutoScaling        | 80% max CPU utilization                                          |
| App Node Scalability - Avg Machine Size                                                                                                                                               | Traffic                      | 2 VPU, 8GB RAM                                                   |
| Avg DAU a server can handle                                                                                                                                                           | Traffic                      | [8000](https://www.educative.io/courses/grokking-modern-system-design-interview-for-engineers-managers/RM8v5w9WP9L)                                                             |
| [Web Server (like Nginx) - Concurrent Active Connections](https://www.linode.com/community/questions/22200/nodebalancers-are-supposed-to-handle-10000-maximum-concurrent-connections) | Traffic                      | 1000 concurrent active connections                               |
| Avg Read-Write Ration (for read heavy systems)                                                                                                                                        | Traffic                      | 100:1 read:write ratio                                           |
| What is the storage scale that we are looking at?                                                                                                                                     | DB Scalability               | 5 years storage                                                  |
| Avg DB shard size                                                                                                                                                                     | DB Scalability               | 1 TB to 10 TB hard disk                                          |
| Avg machine RAM (for Redis, DB instances)                                                                                                                                             | DB Scalability               | 72 GB RAM                                                        |
| Avg Photo Size (KB)                                                                                                                                                                   | DB Scalability               | 200 KB                                                           |
| [Avg Redis Query Time](https://redis.io/docs/management/optimization/latency/)                                                                                                        | DB Scalability               | 10 ms                                                            |
| Character Representation                                                                                                                                                              | DB Scalability               | 1 byte                                                           |
| Avg URL size (bytes)                                                                                                                                                                  | DB Scalability               | 500 bytes. [Bytes Calculator](https://mothereff.in/byte-counter) |

## Latency Comparison Numbers

| Storage                                   | [Latency](https://github.com/donnemartin/system-design-primer#latency-numbers-every-programmer-should-know) | Remarks                     |
|-------------------------------------------|------------------------------------------------------------------------------------------------------------|-----------------------------|
| :star: Read 1 MB sequentially from memory | 250 us (`4 GB/sec`)                                                                                        | ~`4 times faster than SSD`  |
| :star: Read 1 MB sequentially from SSD    | 1 ms (`1 GB/sec`)                                                                                          | ~`30 times faster than HDD` |
| Read 1 MB sequentially from HDD           | 30 ms (30 MB/sec)                                                                                          | -                           |
| Mutex lock/unlock                         | 25 ns                                                                                                      | -                           |
| RAM/Main Memory reference                 | 100 ns                                                                                         |                             |
| SSD Reference                             | 50 us                                                                                                      |                             |
| HDD seek                                  | 10 ms                                                                                                      | -                           |

Handy Metrics:
- `2,000 round trips per second within a data center`.
- `6-7 world-wide round trips per second`.

### Example REST API

Client (India) & Server (UK), Simple REST API deployed on AWS.
- `870ms` - Read data from database. 
- `160ms` (5x faster) - Read data from [redis](3_DatabaseComponents/In-Memory-Cache/Redis).

## Size Calculation (Storage, RAM etc.)

| Base             | Value        | 
|------------------|--------------|
| Single Character | `1 byte`     |
| 1 KB             | `1000 bytes` |
| 1 MB             | `1000 KB`    |
| 1 GB             | `1000 MB`    |
| 1 TB             | `1000 GB`    |
| 1 PB             | `1000 TB`    |

## Numbers Calculation ( User counts etc.)

| Base      | Value                         | 
|-----------|-------------------------------|
| 1 Million | `10^6 units`                  |
| 1 Billion | `10^3 million` = `10^9 units` |

## Time Calculation

| Base          | Value             | 
|---------------|-------------------|
| Nano-Seconds  | 1 sec = `10^9 ns` |
| Micro-Seconds | 1 sec = `10^6 us` |
| Milli-Second  | 1 sec = `10^3 ms` |

# Estimation Tips
The best way to do estimations is to have `BASE ballmark parameters` ( a bit realistic ).

## No. of shards ( for scaling purpose )

`Total storage needed`/`Per machine storage available`

where
  - TOTAL needed storage of the data ( for 5 years ).
  - Per machine storage available.

## No. of cache machines

`Max Cache at any time`/`Per machine RAM`

where
  - Max Cache data at any time.
  - Per machine RAM available.

## Round the numbers, to simplify the values

# References
- [Back-Of-The-Envelope Estimation / Capacity Planning](https://www.youtube.com/watch?v=UC5xf8FbdJc)

