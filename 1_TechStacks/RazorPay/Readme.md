# Razor Pay

|                         | Description                                                                                           |
|-------------------------|-------------------------------------------------------------------------------------------------------|
| SLO                     | P95 < 50-100 ms, P99 < 200 ms                                                                         |
| Cloud                   | AWS, AI on Azure/Google                                                                               |
| Transaction DB          | MySQL (mostly relational data modeling in RazorPay) with Read-Replicas & RDS Proxy Connection Polling |
| Other DBs               | NoSQL, Redshift, S3                                                                                   |
| Backend                 | GoLang (migrated from monolith PHP)                                                                   |
| Cache                   | Redis (planning to migrate to Aerospike, DynamoDB)                                                    |
| Rate Limiting           | Redis                                                                                                 |
| Message Broker          | Kafka                                                                                                 |
| Container orchestration | Kubernates                                                                                            |
| AutoScaling             | Kubernates Autoscaler                                                                                 |
| Observability           | NewRelic                                                                                              |
| Logging                 | ELK, SumoLogic                                                                                        |
| IaaC                    | Teraform                                                                                              |

# References
- [Tech Blog](https://engineering.razorpay.com/)


