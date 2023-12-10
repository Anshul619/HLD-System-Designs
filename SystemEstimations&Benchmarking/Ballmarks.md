# Ball-mark Parameters
- The best way to do estimations is to have **BASE ballmark parameters** (a bit realistic).

| Basis                                                         | Value                                | Category              |
|---------------------------------------------------------------|--------------------------------------|-----------------------|
| What is the traffic scale that we are looking at? (5 years)   | 500 million users                    | Traffic               |
| DAU - What is the daily traffic scale that we are looking at? | 1 million active users per day (DAU) | Traffic               |
| Max CPU utilization, for autoscaling                          | 80% max CPU utilization              | Traffic - AutoScaling |
| Avg Machine Capacity                                          | 2 VPU, 8GB RAM                       | Traffic               |
| App Server (like Nginx) - Concurrent Active Connections       | 1000 concurrent active connections   | Traffic               |
| Avg Read-Write Ratio (for read heavy systems)                 | 100:1 read:write ratio               | Traffic               |
| What is the storage scale that we are looking at?             | 5 years storage                      | DB Scalability        |
| Avg DB shard size                                             | 1 TB to 10 TB hard disk              | DB Scalability        |
| Avg machine RAM (for Redis, DB instances)                     | 72 GB RAM                            | DB Scalability        |
| Avg Photo Size (KB)                                           | 200 KB                               | DB Scalability        |
| Avg Redis Query Time                                          | 1 ms                                 | DB Scalability        |
| Character Representation                                      | 1 byte                               | DB Scalability        |
| Avg URL size (bytes)                                          | 500 bytes                            | DB Scalability        |
| Avg Id size (bytes)                                           | 8 bytes                              | DB Scalability        |
| Ideal Latency Time (for an API/microservice)                  | Less than 100 ms                     | Traffic               |

[Read more](https://docs.google.com/spreadsheets/d/15vApko2QrmZmv5qTEIyU_IAWvgY3MD23TR3TuLUiPc8/edit#gid=1844270076)

# References
- [Donnemartin - Latency](https://github.com/donnemartin/system-design-primer#latency-numbers-every-programmer-should-know)
- [ByteByteGo - Back-Of-The-Envelope Estimation / Capacity Planning](https://www.youtube.com/watch?v=UC5xf8FbdJc)