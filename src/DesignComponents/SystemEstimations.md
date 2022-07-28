

# Basic Storage Calculation Parameters

## Ball-mark Parameters

| Basis                                     | Module    | Value                              |
|-------------------------------------------|-----------|------------------------------------|
| What is the scale that we are looking at? | Traffic   | `500 million` active users per day |
| What is the scale that we are looking at? | Storage   | `5 years`                          |
| Avg DB shard size                         | Hard Disk | `4TB to 10TB`                      |
| Avg machine RAM                           | RAM       | `72 GB`                            |
| Max CPU utilization                       | CPU       | `80%`                              |

## Characters Calculation

| Basis               | Value        | 
|---------------------|--------------|
| Single Character    | `1 byte`     |
| 1 KB                | `1000 bytes` |
| 1 MB                | `1000 KB`    |
| 1 GB                | `1000 MB`    |
| 1 TB                | `1000 GB`    |
| 1 PB                | `1000 TB`    |

## Numbers Calculation

| Basis     | Value                         | 
|-----------|-------------------------------|
| 1 Million | `10^6 units`                  |
| 1 Billion | `10^3 million` = `10^9 units` |

# Estimation Tips

- The best way to do estimations is to have `BASE ballmark parameters` ( a bit realistic )

## `No. of shards` decision

`Total Storage Needed`/`Per machine storage available`

where
  - `TOTAL storage` of the data ( for 5 years ).
  - `Per machine storage` available.

## `No. of cache machines` decision

`Max Cache`/`Per machine RAM`

where
  - `Max Cache` data at any time.
  - `Per machine RAM` available.

