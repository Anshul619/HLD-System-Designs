# Proactive Monitoring
An important aspect of network monitoring is that network monitoring should be proactive. Finding performance issues and bottlenecks proactively helps identify issues at the initial stage. Efficient proactive monitoring can prevent network downtime or failures.
- Monitor the essentials
- Determine the monitoring interval
- Choose the right protocol
- Set proactive thresholds

# Metrics

| Metric                           | Description                                                                                                                      |
|----------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| Bandwidth Capacity               | Bandwidth usage is the maximum data transmission rate possible on a network                                                      |
| Throughput                       | Throughput measures your network’s actual data transmission rate, which can vary wildly through different areas of your network. |
| Latency                          | Latency is the delay that happens between a node or device requesting data and when that data is finished being delivered.       |
| Packet loss                      | Packet loss examines how many data packets are dropped during data transmissions on your network.                                |
| Retransmission                   | Retransmission is when packets are lost. The network needs to retransmit them to complete a data request.                        |
| Availability                     | Network availability, also known as uptime, measures whether the network is currently operational.                               |
| Connectivity                     | Connectivity refers to whether the connections between the nodes on your network are working properly.                           |
| Network and server response time | Many applications today utilize the TCP protocol and are based on a client/server model.                                         |
| CloudWatch metrics               | Metrics tracked in AWS compared to on-premises have different considerations.                                                    |

# Alerts

Alerts should:
- Announce not only when a problem has occurred (or a threshold is being approached), but also whenever a new application or piece of equipment is brought online. 
- Contain information about the device, the issue, and the event that initiated the notification.

At the same time, it’s important to generate only meaningful alerts and to minimize the number of alerts stemming from the same problem or event on the network.

For example, you want the flexibility:
- To configure the monitoring solution so that it doesn’t alert when scheduled maintenance downtime is initiated. 
- To eliminate dependent alerts to more efficiently diagnose the problem if availability to many devices is constrained because of a problem with a router or switch. 

The flexibility of suppressing these dependencies decreases the information you have to assimilate and increases overall confidence in the alerts you do receive.

