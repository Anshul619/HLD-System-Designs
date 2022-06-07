
# Monolothic to Microservices design

## Introduction
- Easy microservice would have separate code repo
- Define contracts between microservices

## Benefits of Microservices design

### Separation of Concern
- For example - Adding a new payment gateway in Payment service, it would be easy.
- Scalability would be easy.

### Engineering is easier
- Development becomes easy
- Sometimes, duplication would be needed in microservice based architecture.

### Deployment is easier
- If one service goes down, not complete product would be down.

### Microservice - Large team
- Monolothic is good for small team.
- Microservice is good for large team

## Microservices - Design Principles
- Define contracts ( request/response ) between microservices
- Routing between microservices
- Use jenkins ( & docker containers ) for the deployment
- Fast Communication between microservices - RabbitMQ, ActiveMQ etc.
- Logging using ELK

## Other Points
- Dedicated data store for every service - Every component should be single source of truth. And whenever needed, the microservice would ask the other microservice for the data. ( through network call )
- Condense business responsibility to a single place - Every microservice should have proper responsibility and single purpose. And it should correspond to the business use case. ( Less is more )

## References
- https://www.youtube.com/watch?v=rckfN7xFig0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX&index=34
