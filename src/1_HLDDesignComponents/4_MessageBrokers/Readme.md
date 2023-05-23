# Introduction
- Message brokers are used to decouple & enable [Event Driven Architectures](../0_SystemGlossaries/MessageBrokers/EventDrivenArchitecture.md) i.e. communicate the events & pass the data between [microservices](../1_MicroServicesSOA).
- In modern software architecture, the application needs to be decoupled, high scalability, serving high performance. And message brokers helps in this.
- Most message brokers are designed for small messages.
- [Comparison between Various Message Brokers](KafkaVsRabbitMQVsSQSVsSNS.md)

# Message brokers compared to databases

| Feature                                                    | Message Broker                                                                          | Database                                                                                                   |
|------------------------------------------------------------|-----------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| Core Design                                                | Designed to handle [message streams](../5_BigDataComponents/StreamProcessing/Readme.md) | Designed for [long-term durability](../0_SystemGlossaries/Database/Durability.md), data search & querying. |
| [Durability](../0_SystemGlossaries/Database/Durability.md) | Data is deleted once its consumed or retained for a certain period.                     | Long-term storage<br/>- Data is stored until its explicitly deleted.                                       |
| [Indexing](../0_SystemGlossaries/Database/Indexing.md)     | :x: Not supported                                                                       | :white_check_mark: Support Primary & Secondary indexes for fast search.                                    |
| Querying                                                   | :x: Not supported                                                                       | :white_check_mark: Supported                                                                               |
| Data Mutability                                            | Data is immutable in message brokers i.e. it can't be changed once inserted.            | Data is mutable i.e. data can be changed.                                                                  |