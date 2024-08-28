# Hotstar - Scaling for Tsunami traffic (with own auto-scaler)

| Title                        | Remarks                                                                                                                    |
|------------------------------|----------------------------------------------------------------------------------------------------------------------------|
| Pre-scaling before the event | We use auto-scaling to ensure the right amount of servers always exist in a pool, but we’re always scaled up for the peak. |
| No-dump clients              | Caching, exponential back-offs and panic protocols.                                                                        |


# Scaling Policies

| Policy          | Remarks                                                                                                                                                                                                                                                                                |
|-----------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Scaling Trigger | Some services can be scaled up based on CPU utilization, others can be scaled based on the number of messages in the queue.<br/>- However, the most common scaling approach is to scale up based on the number of requests being processed by the service (**Traffic based scaling**). |
| Scale-up Time   | This is the time from when the scaling decision is made to the time when new infra starts serving traffic.<br/>- This includes, time to add more infrastructure, scheduling and spinning up new instances and the application start time (along with any pre-warming time required).   |
| Scaling Buffers | This is the maximum traffic surge expected by the service during the **Scale-up Time**.                                                                                                                                                                                                |

# Infradashboard - Auto-scaling system

![](https://miro.medium.com/v2/resize:fit:2000/format:webp/1*JRkMdEWKOHInk2XXUsbKnQ.png)

# Parameters
- For ladder based scaling, we add 2 million as Concurrency buffer. 
- For Traffic based scaling, we add 30% as Traffic Scaling buffer.

# Read more
- [Scaling for Tsunami traffic](https://blog.hotstar.com/scaling-for-tsunami-traffic-2ec290c37504)
- [Scaling Is Not An Accident](https://blog.hotstar.com/scaling-is-not-an-accident-895140ac84c0)
- [De-bottlenecking Aurora MySQL for 19 Million concurrent users](https://blog.hotstar.com/de-bottlenecking-aurora-mysql-for-19-million-concurrent-users-ee98d6247cfe)
- [AWS re:Invent 2019: Scaling Hotstar.com for 25 million concurrent viewers (CMY302)](https://www.youtube.com/watch?v=mFpqrVxxwKc&t=1419s)
- [Hotstar Platform & Scaling Strategy : Cloud DevOps Perspective](https://www.linkedin.com/pulse/hotstar-platform-scaling-strategy-cloud-devops-zia-tahir/)