# Zerodha Tech Stack

|                          | Service                         | Remarks                                                                                                                                          |
|--------------------------|---------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| Microservices - Language | Go                              | All of our performance-critical, high throughput services are written in Go.                                                                     |
| Data Language            | Python                          | Data-heavy backoffice systems where realtime performance is not a bottleneck, are written in Python. Django and Flask for certain web apps.      |
| Web app                  | VueJS                           | VueJS for web app applications.                                                                                                                  |
| Mobile apps              | Flutter                         | Flutter for iOS and Android mobile applications.                                                                                                 |
| DB                       | Postgres                        | Self-managed Postgres instances with hundreds of billions of rows.<br/>- MySQL instances with billions of rows as owing to certain dependencies. |
| Cache                    | Redis                           | Self-managed Redis instances in high throughput hotpaths.                                                                                        |
| API Proxy                | HAProxy, Nginx                  | Haproxy and Nginx for proxying, load balancing, and routing.                                                                                     |
| Message Broker           | Kafka                           | Kafka for realtime events and as an organisation-wide message bus.                                                                               |
| Observability            | Sentry, Grafana, and Prometheus | Sentry, Grafana, and Prometheus for infra-wide systems and app metrics and monitoring.                                                           |
| Logs Aggregation         | ELK Stack                       | ELK stack for logs, where storing terabytes of searchable logs for several years is a regulatory requirement.                                    |
| Infra                    | Hybrid infra (AWS + OnPerm)     | Physical racks where numerous exchange leased lines terminate + AWS.                                                                             |

# Read more
- [Hello, World!](https://zerodha.tech/blog/hello-world/)