# Message brokers compared to databases

| Feature                                                       | [Message Broker](Readme.md)                                                  | [Database](../3_Databases)                                                                                    |
|---------------------------------------------------------------|------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|
| Core Design                                                   | Designed to handle message streams                                           | Designed for [long-term durability](../3_Databases/1_ACID-Transactions/Durability.md), data search & querying. |
| [Durability](../3_Databases/1_ACID-Transactions/Durability.md) | Data is deleted once its consumed or retained for a certain period.          | Long-term storage<br/>- Data is stored until its explicitly deleted.                                          |
| [Indexing](../3_Databases/5_Database-Internals/Indexing.md)    | :x: Not supported                                                            | :white_check_mark: Support Primary & Secondary indexes for fast search.                                       |
| Querying                                                      | :x: Not supported                                                            | :white_check_mark: Supported                                                                                  |
| Data Mutability                                               | Data is immutable in message brokers i.e. it can't be changed once inserted. | Data is mutable i.e. data can be changed.                                                                     |

# Read more
- [Martin Kleppmann | Kafka Summit London 2019 Keynote | Is Kafka a Database?](https://youtu.be/BuE6JvQE_CY)