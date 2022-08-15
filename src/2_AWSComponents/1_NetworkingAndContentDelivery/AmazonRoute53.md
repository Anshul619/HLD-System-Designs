
# [Route 53](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/Welcome.html)

Amazon Route 53 is a `highly available and scalable Domain Name System (DNS)` web service. 

You can use Route 53 to perform three main functions in any combination,
- Domain registration
- DNS routing
- Health checking                                                                                                                                                                                                                                                                                                                                                    |

# How does Amazon Route 53 provide high availability and low latency?

## Globally Distributed Servers
- Amazon is a global service and consequently has DNS services globally.
- Any customer creating a query from any part of the world gets to reach a `DNS server local` to them that provides low latency.

## Optimal Locations
- `Route 53` uses a [global anycast network](https://www.cloudflare.com/learning/cdn/glossary/anycast-network/) to answer queries from the optimal position automatically.

## Dependency
- `Route 53` provides a high level of dependability required by critical applications.

# Routing Policy

## :star: Latency Based Routing
- Latency Based Routing utilizes latency measurements between networks and AWS data centers.
- Latency Based Routing is used when you want to give your customers the lowest latency possible.

## Geo Based DNS routing
- The Geo Based DNS routing takes decisions based on the geographic location of the request.
- Geo Based routing is used when you want to direct the customer to different websites based on the country or region they are browsing from.

## Failover routing policy
- Use when you want to configure [active-passive fail over for disaster recovery](../../1_HLDDesignComponents/0_SystemGlossaries/HighAvailability.md#active-passive-policy).


