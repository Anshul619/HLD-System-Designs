
# Flipkart - MySQL Replication Lag Analysis
- MySQL is one of the most popular and trusted transactional data stores in the world and it should come as no surprise that [Flipkart manages one of India’s largest fleets of MySQL](https://blog.flipkart.tech/mysql-replication-lag-analysis-71ff28443631) because of e-commerce as a domain, which is super heavy on transactional data processing.

# Stats
- Altair (Flipkart’s DBaaS) manages around 700 clusters as of today and out of these, 450 odd clusters are running on MySQL v5.7 and 250 odd clusters are still running on MySQL v.5.6.
- These clusters run different workloads, for example, Order, Shipment and Warehouse management systems, Accounting systems etc.
- As for the data size, these clusters range from 500GB to 3TB.
- [Read about replication lag](../../1_HLDDesignComponents/0_SystemGlossaries/Reliability/ReplicationLagAndDataConsistency.md).

| Deployed Cluster   | Total Count | High Replication Lag Clusters |
|--------------------|-------------|-----------------------------------------|
| MySQL 5.6 Clusters | 250         | 26                                      |
| MySQL 5.7 Clusters | 450         | 3                                       |

# Test - Hardware Details

| Component     | Cores | Memory | Disk Space | Count |
|---------------|-------|--------|------------|-------|
| MySQL Cluster | 8     | 40 GB  | 512 GB     | 1     |
| Replicas      | 8     | 40 GB  | 512 GB     | 1     |

![](https://miro.medium.com/max/1400/0*jDs00U4bEeku60vX.webp)

# Test Results
- 30 mins replication lag was observed on 5.6 clusters whereas 3 min replication lag was seen on 5.7 clusters.
- MySQL v8.0 brings a few more improvements in the replication performance.

## MySQL 5.6 Load QPS and Replication lag

![](https://miro.medium.com/max/1400/0*zK4vkPO-xcH0YOOR)

## MySQL 5.7 Load QPS and Replication lag

![](https://miro.medium.com/max/1400/0*2o1VXGxD12itzywM)

# Recommendations
- Use Row-based replication: 
  - Even when there is a lower speedup, the execution time is much smaller in ROW-based replication with minimal images than in STATEMENT-based replication.
- Use MTS threads frugally: 
  - Too many MTS threads often increase the synchronization effort between threads and reduce the benefits. 
  - While a lot of these decisions are based on workloads, we suggest an estimated usage of 4 to 8 threads for ROW-based replication, a slightly higher number for STATEMENT-based replication, and a few more to accommodate the durability requirements.
- Upgrade MySQL versions incrementally: 
  - Upgrade from MySQL v5.6 to v5.7 and then to v8.0 if you are already using MySQL v5.6. 
  - For new MySQL deployments, directly install v8.0.
- Don’t parallelize too much: 
  - Too many parallel applier threads increase the synchronization effort between threads and may bring reduced benefits.
- Relax the durability setting: 
  - If your replica bottlenecked at high I/O, and high amount of content pending a flush to disk, and If your system can tolerate some data loss under rare conditions, you might decide to relax durability settings like sync_binlog = 0 and ​​innodb_flush_log_at_trx_commit = 0. 
  - This will help reduce overhead when you COMMIT transactions.

# References
- [MySQL Replication Lag Analysis](https://blog.flipkart.tech/mysql-replication-lag-analysis-71ff28443631)