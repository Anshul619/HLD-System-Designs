
Q: Design a system to monitor the health of a fleet of computers

Scope
* Servers ( online ) - datacenter - 1000 servers
* Live Health ( last 5 mins ) = 300 seconds
* Health
    * CPU ( every 5 mins )
    * HardDisk ( Available vs Used RAM )
    * Disk i/o load
    * RAM ( Available vs Used RAM )
    * More parameters etc.
* Servers
    * Linux Based Servers
    * Windows Based Servers

Throughput
* APIs/min
* 20 seconds

1000 servers
300 seconds

1000/300 = 3.5 TPS
1M/300 = 3333 TPS = 3400 TPS/RPS

Every document = 20 bytes*6 = 120

1 Million Machines every 300 seconds = 120.000.000 bytes = 120MB

Per hour = 120.000.000*12 bytes  = 1440 MB = 1.5GB
Per day = 120.000.000*12*24 bytes = 33750 GB = 33TB
Per year = 33*365 = 12045TB

Per Shard = 10TB ( Ball-mark estimation )

No. of shards = 12045TB/10TB = 1200 shards

Two Options
* Custom Implementation
    * Server - CRON job which will run every 5 mins, and push the health to the remote server ( HTTPS API )
        * CPU
        * HardDisk
        * RAM
        * Timestamp
        * machine_identifier
    * Remote API, which will save those stats in the ElasticSearch
        * MongoDB
            * Document based architecture
            * {
                * Id_document: 500000
                * machine identifier : 5000
                * Stats : {
                  CPU, HardDisk, RAM etc.
* }
* timestamp
  }
* Then we can visualize the health on UI
    * TimeSeries
    *  
* ELK - Beats ( MetricBeats )

Data Sharding
* machine_identifier
* No of shards
    *  
*  
-
Availability Perspective
* Horizontal Scalability of the app servers
    * EC2 instance
        * 4GB RAM
        * 2 vCPU
    * Apache Server
        * 512 concurrent sessions
        *

- What are different search engines?
- Data retention
- No of app servers?
