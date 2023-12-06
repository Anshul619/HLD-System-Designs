# Message brokers compared to databases

| Feature                                                                     | [Message Broker](Readme.md)                                                  | [Database](../3_DatabaseServices)                                                                                  |
|-----------------------------------------------------------------------------|------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|
| Core Design                                                                 | Designed to handle message streams                                           | Designed for [long-term durability](../3_DatabaseServices/1_ACIDTransactions/Durability.md), data search & querying. |
| [Durability](../3_DatabaseServices/1_ACIDTransactions/Durability.md)          | Data is deleted once its consumed or retained for a certain period.          | Long-term storage<br/>- Data is stored until its explicitly deleted.                                               |
| [Indexing](../3_DatabaseServices/3_ScalabilityTechniques/Indexing.md) | :x: Not supported                                                            | :white_check_mark: Support Primary & Secondary indexes for fast search.                                            |
| Querying                                                                    | :x: Not supported                                                            | :white_check_mark: Supported                                                                                       |
| Data Mutability                                                             | Data is immutable in message brokers i.e. it can't be changed once inserted. | Data is mutable i.e. data can be changed.                                                                          |

# Read more
- [Martin Kleppmann | Kafka Summit London 2019 Keynote | Is Kafka a Database?](https://youtu.be/BuE6JvQE_CY)