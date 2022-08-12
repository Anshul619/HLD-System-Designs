

# Basic Storage Calculation Parameters

## Ball-mark Parameters

| Basis                                             | Module    | Value                             |
|---------------------------------------------------|-----------|-----------------------------------|
| What is the traffic scale that we are looking at? | Traffic   | `500 million active users per day` |
| What is the storage scale that we are looking at? | Storage   | `5 years`                         |
| Avg DB shard size                                 | Hard Disk | `4 TB to 10 TB`                   |
| Avg machine RAM                                   | RAM       | `72 GB`                           |
| Max CPU utilization                               | CPU       | `80% max utilization`             |

## [Latency Comparison Numbers](https://github.com/donnemartin/system-design-primer#latency-numbers-every-programmer-should-know)

| Storage                            | Read latency     | Comparison               |
|------------------------------------|------------------|--------------------------|
| Mutex lock/unlock                  | 25 ns            | -                        |
| :star: RAM/Main Memory reference   | 100 ns           | |
| Read 1 MB sequentially from memory | 250 us (4 GB/sec) | ~`4 times faster than SSD` |
| :star: SSD Reference               | 50 us       | |
| Read 1 MB sequentially from SSD    | 1 ms (1 GB/sec)  | ~`30 times faster than HDD` |
| :star: HDD seek                    | 10 ms            | -                        |
| Read 1 MB sequentially from HDD    | 30 ms (30 MB/sec) | -                        |

Handy Metrics:
- `2,000 round trips per second within a data center`.
- `6-7 world-wide round trips per second`.

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

