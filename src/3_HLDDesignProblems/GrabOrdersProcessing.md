# How we store and process millions of orders daily?
- We collected the requirements by analysing query patterns and traffic patterns.

# Key Facts

| Fact                                                                                             |
|--------------------------------------------------------------------------------------------------|
| A million of orders per month                                                                    |
| Strong consistency for transactional queries, and eventually consistency for analytical queries. |

# Requirements

| Use Case                                                     | System                                                                                   |
|--------------------------------------------------------------|------------------------------------------------------------------------------------------|
| Create an order                                              | OLTP/Transactional                                                                       |
| Update an order                                              | OLTP/Transactional                                                                       |
| Get order by id                                              | OLTP/Transactional                                                                       |
| Get ongoing orders by passenger id.                          | OLTP/Transactional                                                                       |
| Get historical orders by various conditions.                 | [OLAP/Analytical](../1_HLDDesignComponents/0_SystemGlossaries/BigData/DataWarehouses.md) |
| Get order statistics (for example, get the number of orders) | [OLAP/Analytical](../1_HLDDesignComponents/0_SystemGlossaries/BigData/DataWarehouses.md) |

# Architecture

![](https://engineering.grab.com/img/how-we-store-millions-orders/image1.png)

# OLTP database - DynamoDB
- The retention period of our DynamoDB data is three months.

![](https://engineering.grab.com/img/how-we-store-millions-orders/image2.png)

## DynamoDB Indexes

| Key        | Type                                                                      | Remarks                                                       |
|------------|---------------------------------------------------------------------------|---------------------------------------------------------------|
| order ID   | Partition Key of main table                                               | We can easily support key-value queries by the partition key. |
| pax_id_gsi | Partition key of Ongoing Orders GSI Table (Secondary Index of main table) | At any time, the GSI table only stores the ongoing orders.                                                              |

# OLAP database - MySQL RDS
- The order table is partitioned by creation time monthly. 
- Since the data access pattern is mostly by month, the partition key can reduce cross-partition queries. 
- Partitions older than six months are dropped at the beginning of each month.

# Data Stream
- A Kafka stream is used to process data in the data ingestion pipeline. We choose the Kafka stream, because it has 99.95% SLA.
- On the stream consumer side, we use back-off retry at both stream and database levels to ensure consistency. In a worst-case scenario, we can rewind the stream events from Kafka.
- Duplicate messages are handled by the database level unique key (for example, order ID + creation time).

# Conclusion
- Cost efficiency is achieved by data retention in both databases.

# References
- [How we store and process millions of orders daily](https://engineering.grab.com/how-we-store-millions-orders)

