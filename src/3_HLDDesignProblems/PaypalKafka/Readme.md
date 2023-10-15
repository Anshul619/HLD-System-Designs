# Kakfka at Paypal

# Use Cases
- Each use-case processing over 100 billion messages per day.

| Use Case                                             |
|------------------------------------------------------|
| First-party tracking                                 |
| Application health metrics streaming and aggregation |
| Database synchronization                             |
| Application log aggregation                          |
| Batch processing                                     |
| Risk detection and management                        |
| Analytics and compliance                             |

# Estimates

| Feature            | Number                   | Remarks                                                                                          |
|--------------------|--------------------------|--------------------------------------------------------------------------------------------------|
| Clusters           | 85+ Kafka clusters       | -                                                                                                |
| Brokers            | 1,500 brokers            | -                                                                                                |
| Topics             | 20,000 topics            | -                                                                                                |
| Mirror Maker nodes | 2,000 Mirror Maker nodes | Used to mirror the data among the clusters, offering 99.99% availability for our Kafka clusters. |

# Reference
- [Scaling Kafka to Support PayPal’s Data Growth](https://medium.com/paypal-tech/scaling-kafka-to-support-paypals-data-growth-a0b4da420fab)