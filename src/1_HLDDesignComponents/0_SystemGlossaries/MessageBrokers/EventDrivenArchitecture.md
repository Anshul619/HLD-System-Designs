# :star: Event Driven Architecture
- An [event-driven architecture](https://aws.amazon.com/event-driven-architecture/) uses events to trigger and communicate between loosely coupled services and is common in modern applications built with [microservices](../../1_MicroServicesSOA).
- [Message brokers](../../4_MessageBrokers) like [Kafka](../../4_MessageBrokers/Kafka/Readme.md), [RabbitMQ](../../4_MessageBrokers/RabbitMQ.md) etc., are used in the event-driven architecture.

![img.png](https://docs.aws.amazon.com/whitepapers/latest/microservices-on-aws/images/image8.png)

## Examples of an event
- An update like an item being placed in a shopping cart on an e-commerce website.
- Item purchased, its price, and a delivery address.
- A notification that an order was shipped.