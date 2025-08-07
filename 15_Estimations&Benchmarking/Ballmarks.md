# Ball-mark Parameters
- The best way to do estimations is to have **BASE ballmark parameters** (a bit realistic).

| Basis                                                              | Value                                | Category              |
|--------------------------------------------------------------------|--------------------------------------|-----------------------|
| :star: What is the traffic scale that we are looking at? (5 years) | 500 million users                    | Traffic               |
| :star: What is the daily traffic scale that we are looking at?     | 1 million active users per day (DAU) | Traffic               |
| :star: Avg Machine Capacity                                        | 2 CPU, 8 GB RAM                      | Traffic               |
| :star: Concurrent Active Connections - App Server (like Nginx)     | 100 concurrent connections           | Traffic               |
| :star: Ideal Latency Time (for an API/microservice)                | Less than 100 ms                     | Traffic               |
| :star: Avg Read-Write Ratio (for read heavy systems)               | 100:1 read:write ratio               | Traffic               |
| :star: Avg DB shard size                                           | 1 TB to 10 TB hard disk              | DB Scalability        |
| :star: Avg machine RAM (for Redis, DB instances)                   | 72 GB RAM                            | DB Scalability        |
| :star: Avg Redis Query Time                                        | 1 ms                                 | DB Scalability        |
| :star: Character Representation                                    | 1 byte                               | DB Scalability        |
| Max CPU utilization, for autoscaling                               | 80% max CPU utilization              | Traffic - AutoScaling |
| What is the storage scale that we are looking at?                  | 5 years storage                      | DB Scalability        |
| Avg Id size (bytes)                                                | 8 bytes                              | DB Scalability        |
| Avg URL size (bytes)                                               | 500 bytes                            | DB Scalability        |
| Avg Photo Size (KB)                                                | 200 KB                               | DB Scalability        |

[Read more](https://docs.google.com/spreadsheets/d/15vApko2QrmZmv5qTEIyU_IAWvgY3MD23TR3TuLUiPc8/edit#gid=1844270076)

# References
- [ByteByteGo - Back-Of-The-Envelope Estimation / Capacity Planning](https://www.youtube.com/watch?v=UC5xf8FbdJc)