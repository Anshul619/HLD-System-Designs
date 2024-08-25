# Bharat Pe - Tech Stack

| Purpose           | Service                                                                               |
|-------------------|---------------------------------------------------------------------------------------|
| Traffic           | 20 million transactions per day (230 tps)                                             |
| Backend Languages | Java (60%), GoLang (30%), Python (some services)                                      |
| Client Apps       | Hybrid - Native apps for first interaction, then ReactNative apps for different pages. |
| Transactions DB   | MySQL (Amazon Aurora)                                                                 |
| Static DB         | MongoDB (Static info like comments, events/audit trails etc.)                         |
| Microservices     | 250 microservices, each service with own DB ([share-nothing architecture](../7b_ArchitecturePatterns/SharedNothingArchitecture.md))             |
| Message Broker    | Kafka                                                                                 |
| Distributed Cache | Elastic Cache (Redis)                                                                 |
| Orchestrator      | Amazon EKS (k8s)                                                                      |
| Container         | Docker                                                                                |
| CI/CD Tool        | Jenkins, [DevTron](https://devtron.ai/)                                               |
| Observability     | NewRelic, Grafana                                                                     |
| Deployment        | A/B testing, blue/green deployments                                                   |
| Tracing           | `Distributed Tracing` with RequestId in all services                                  |
| Data Science      | Big Query, Looker etc.                                                                |
| Security          | Cloudflare, AWS WAF, Tokenization (with expiry and refresh tokens)                    |
| others            | Static Code Analysis, Regression auto tests, unit testing etc.                        |

# When Golang?
- 3x scale than spring boot
- Use Cases like notification service, blocking operations, computation etc.
- Less learning curve, but lack of golang libraries compared to spring boot/java

# References
- [Tech Blog](https://tech.bharatpe.com/)