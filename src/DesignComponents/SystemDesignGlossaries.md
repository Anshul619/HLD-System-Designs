
## System Design Glossaries

### Throughput
- Throughput is the number of actions executed or results produced per unit of time. 
- This is measured in units of whatever is being produced (cars, motorcycles, I/O samples, memory words, iterations) per unit of time.
- Example - `500 transactions per second` etc.

### Latency
- Latency is the time required to perform an action or to produce some result. 
- Latency is measured in units of time -- hours, minutes, seconds, nanoseconds or clock periods.
- Example - `50 secs to do a transaction`.

### What is TPS ( Transactions per Second )?
- The number of things to be transmitted every second, that is, the number of transactions per second processed by the server.
- The TPS includes a message entry and a message, plus a user database access. (Business TPS = CAPSX per call average TPs)

### What is QPS ( Queries per Second )?
- Every transaction might have multiple queries.
- Hence, QPS is the subset of TPS.

### [Atomicity](https://www.techopedia.com/definition/24729/atomicity)
- Atomicity is a feature of databases systems dictating where a transaction must be all-or-nothing. 
- That is, the transaction must either fully happen, or not happen at all. 
- It must not complete partially.

### [Language Agnostic](https://en.wikipedia.org/wiki/Language-agnostic)
- We should design the system considering agnostic feature (Language agnostic, AWS agnostic etc.) into the consideration.
- Language-agnostic - Language-agnostic programming or scripting (also called language-neutral, language-independent, or cross-language) is a software development paradigm where a particular language is chosen because of its appropriateness for a particular task (taking into consideration all factors, including ecosystem, developer skill-sets, performance, etc.), and not purely because of the skill-set available within a development team.

### [Durability](https://en.wikipedia.org/wiki/Durability)
- In database systems, durability is the `ACID property` which guarantees that `transactions that have committed will survive permanently`. 
- For example, if a flight booking reports that a seat has successfully been booked, then the seat will remain booked even if the system crashes.

### [Fault Tolerance](https://www.fortinet.com/resources/cyberglossary/fault-tolerance)
- Fault tolerance is a process that enables an operating system to respond to a failure in hardware or software. 
- This fault-tolerance definition refers to the system’s ability to continue operating despite failures or malfunctions.
- Components of a `Fault-tolerance` system
  - Diversity
  - Redundancy
  - Replication

![img.png](src/assests/fault_tolerance_img.png)

### [High Availability](https://avinetworks.com/glossary/high-availability/)
- High Availability (HA) describes systems that are dependable enough to operate continuously without failing. 
- They are well-tested and sometimes equipped with redundant components.