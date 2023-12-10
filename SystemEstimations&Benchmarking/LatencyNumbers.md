# Latency Comparison Numbers

| Storage                                   | Latency           | Remarks                       |
|-------------------------------------------|-------------------|-------------------------------|
| :star: Read 1 MB sequentially from memory | 250 us (4 GB/sec) | ~**4 times faster than SSD**  |
| :star: Read 1 MB sequentially from SSD    | 1 ms (1 GB/sec)   | ~**30 times faster than HDD** |
| Read 1 MB sequentially from HDD           | 30 ms (30 MB/sec) |                               |
| Mutex lock/unlock                         | 25 ns             |                               |
| RAM/Main Memory reference                 | 100 ns            |                               |
| SSD Reference                             | 50 us             |                               |
| HDD seek                                  | 10 ms             |                               |

> Other Metrics:
> - 2,000 round trips per second within a data center.
> - 6-7 world-wide round trips per second.