# :star: PACELC theorem

| Scenario                                                                          | Remarks                                                                   |
|-----------------------------------------------------------------------------------|---------------------------------------------------------------------------|
| If there is a **network partition (P)**                                           | System can trade off between **availability (A)** and **consistency (C)** |
| else E - when the system is running normally in the absence of partition failures | System can trade off between **latency (L)** and **consistency (C)**      |

![img.png](PACELC_Diagram.drawio.png)

# Database PACELC ratings

| DB                                                                                                   | P+A                | P+C                | E+L                | E+C                |
|------------------------------------------------------------------------------------------------------|--------------------|--------------------|--------------------|--------------------|
| [DynamoDB](https://github.com/Anshul619/AWS-Services/tree/main/1_Databases/AmazonDynamoDB/Readme.md) |                    | :white_check_mark: | :white_check_mark: | :white_check_mark: |
| [PostgresSQL](../7_SQL-Databases/Readme.md)                                                          | :white_check_mark: | :white_check_mark: | :white_check_mark: | :white_check_mark: |
| [MongoDB](../10_Document-Databases/MongoAtlas/Readme.md)                                             | :white_check_mark: |                    | :white_check_mark: |                    |
| [Cassandra](../11_WideColumn-Databases/ApacheCasandra.md)                                            | :white_check_mark: | :white_check_mark: |                    |                    |
| [HBase](../11_WideColumn-Databases/ApacheHBase.md)                                                   |                    | :white_check_mark: |                    | :white_check_mark: |

# CAP Theorem
- [Read more](CAPTheorem.md)

# Source(s) and further reading
- [PACELC](https://en.wikipedia.org/wiki/PACELC_theorem)
- [The CAP Theorem in DBMS](https://www.geeksforgeeks.org/the-cap-theorem-in-dbms/)