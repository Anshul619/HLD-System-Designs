

# Basic Storage Calculation Parameters

## Ball-mark Parameters

| Basis                                             | Module    | Value                              |
|---------------------------------------------------|-----------|------------------------------------|
| What is the traffic scale that we are looking at? | Traffic   | `500 million` active users per day |
| What is the storage scale that we are looking at? | Storage   | `5 years`                          |
| Avg DB shard size                                 | Hard Disk | `4TB to 10TB`                      |
| Avg machine RAM                                   | RAM       | `72 GB`                            |
| Max CPU utilization                               | CPU       | `80% max utilization`              |

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

## [Latency Comparison Numbers](https://github.com/donnemartin/system-design-primer#latency-numbers-every-programmer-should-know)

| Storage                | Read latency ( 1 byte ) | Comparison                  |
|------------------------|-----------------------|-----------------------------|
| L1 cache reference     | 0.1 ns                | -                           |
| L2 cache reference     | 2.8 ns                | -                           |
| L3 cache reference     | 12.9 ns               | -                           |
| :star: RAM/Main Memory | 120 ns (4 GB/sec)     | ~`4 times faster than SSD`  |
| :star: SSD             | 50-150 us (1 GB/sec)  | ~`30 times faster than HDD` |
| HDD                    | 1-10 ms (30 MB/sec)   | -                           |

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

