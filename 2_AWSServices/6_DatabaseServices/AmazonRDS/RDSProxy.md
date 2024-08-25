# RDS Proxy
- Many applications, including those built on modern architectures capable of horizontal scaling based on ebb and flow of active users, can open a large number of database connections or open and close connections frequently. 
- This can stress the database’s memory and compute, leading to slower performance and limited application scalability. 
- [Amazon RDS Proxy](https://aws.amazon.com/about-aws/whats-new/2023/11/amazon-rds-multi-az-deployments-readable-standbys/) sits between your application and database to pool and share established database connections, improving database efficiency and application scalability. 
- In case of a failure, Amazon RDS Proxy automatically connects to a standby database instance within a region. 
- With Amazon RDS Proxy, database credentials and access can be managed through AWS Secrets Manager and AWS Identity and Access Management (IAM), eliminating the need to embed database credentials in application code.