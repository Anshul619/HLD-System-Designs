
# [Route 53](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/Welcome.html)

Amazon Route 53 is a `highly available and scalable Domain Name System (DNS)` web service. 

You can use Route 53 to perform three main functions in any combination
- Domain registration
- DNS routing
- Health checking                                                                                                                                                                                                                                                                                                                                                    |

# How does Amazon Route 53 provide high availability and low latency?

## Globally Distributed Servers
- Amazon is a global service and consequently has DNS services globally.
- Any customer creating a query from any part of the world gets to reach a `DNS server local` to them that provides low latency.

## Optimal Locations
- `Route 53` uses a `global anycast network` to answer queries from the optimal position automatically.

## Dependency
- `Route 53` provides a high level of dependability required by critical applications.


