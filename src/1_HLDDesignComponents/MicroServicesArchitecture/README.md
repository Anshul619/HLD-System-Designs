
# Monolothic to Microservices design

## Introduction
- Easy microservice would have separate git code repo.
- `Define contracts between microservices`.
- In a Microservice Architecture, each service is self-contained and implements a single business capability.
- Microservice architecture makes it easier and fastest way to build and work on individual parts of an application, and thus the application as a whole.

![img.png](assests/MonolothicToMicroService.drawio.png)

## Microservices - Design Principles
- Define contracts ( request/response ) between microservices.
- API Gateway to route between microservices.
- Use [message brokers](../MessageBrokers) ([Kafka Cluster](../MessageBrokers/Kafka.md), [RabbitMQ](../MessageBrokers/RabbitMQ.md), [ActiveMQ](../MessageBrokers/ActiveMQ.md) etc.) to asynchronously pass data b/w microservices.
- Use Jenkins, [Docker](../DevOps/Docker.md), [Kubernates](../DevOps/Kubernates.md) for the deployment
- Logging using [ELK](../MonitoringTools/ELK.md), [Kafka Cluster](../MessageBrokers/Kafka.md) etc.

## Benefits of Microservices design

### Separation of Concern
- Scalability would be easy. 
- Each service can be scaled independently and would have its team which owns the micro-service.
- For example - It would be easy to add a new payment gateway in Payment service.

### Engineering becomes easy
- Development becomes easy.
- Each service can be written in its own language or framework, and can have its own database or lack thereof.
- `Dedicated data store for every service` 
  - Every component should be single source of truth. 
  - And whenever needed, the microservice would ask the other microservice for the data. ( through network call )
- `Condense business responsibility to a single place` 
  - Every microservice should have proper responsibility and single purpose. 
  - And it should correspond to the business use case. ( Less is more )

### Deployment is easier
- If one service goes down, not complete product would be down.
- Deployment becomes easy, independent & fast. 
  - Example - With big code base & 100 engineers team in [Airbnb](https://www.infoq.com/presentations/airbnb-culture-soa/), it was taking `1 day to deploy monolothic code`.
- Instead of deploying complete code for any change, only corresponding microservice can be deployed.

## Disadvantages of Microservices design
- `Obviousness` - With large number of services, it would be a bit tricky to find the microservice for the required change.
- `Safety` - The contract should be defined properly between microservices.
- `Resilience` - Client should be able to handle failure scenarios properly.
- `Large Team` - `Monolothic is good for small team` while `Microservice is good for large team`.
- `Dependency` - Micro-servies would be dependent to each other. Sometimes, there can be circular dependencies also.

## Examples of MicroServices
- Search, Start Page, Recommendation etc. as separate components/services.
- Feed, Search, Product Details etc. services in `LinkedIn`.
- [Zomoto Design](../ZomatoDesign)

## References
- [Difference between Microservice and API](https://www.geeksforgeeks.org/difference-between-microservice-and-api/)
- [Moving from Monoliths to Microservices](https://www.youtube.com/watch?v=rckfN7xFig0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX&index=34)
- [The Human Side of Airbnb’s Microservice Architecture](https://www.infoq.com/presentations/airbnb-culture-soa/)