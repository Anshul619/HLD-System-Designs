# Event Driven Architecture
- An [event-driven architecture](https://aws.amazon.com/event-driven-architecture/) uses events to trigger and communicate between loosely coupled services and is common in modern applications built with [microservices](../4_MicroServicesSOA/Readme.md).
- [Message brokers]() like [Kafka](Kafka/Readme.md), [Amazon SQS](../2_AWSServices/5_MessageBrokerServices/AmazonSQS/Readme.md), [RabbitMQ](RabbitMQ.md) etc., can be used in the event-driven architecture.

# Architecture

![](https://miro.medium.com/max/1400/1*CZYfnIHSHKE7XiP-zvhAvA.webp)

# Examples of an event
- An update like an item being placed in a shopping cart on an e-commerce website.
- Item purchased, its price, and a delivery address.
- A notification that an order was shipped.

# References
- [Event-Driven Architectures Done Right, Apache Kafka • Tim Berglund](https://www.youtube.com/watch?v=A_mstzRGfIE)
- [Materialized View Pattern](https://medium.com/design-microservices-architecture-with-patterns/materialized-view-pattern-f29ea249f8f8)
- [Event streaming: Build applications that keep up with business](https://tanzu.vmware.com/event-streaming)