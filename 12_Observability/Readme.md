
# Monitoring Services & Tools

| Service                                                                                  | Type                  | Open Source | Description                                                                           |
|------------------------------------------------------------------------------------------|-----------------------|-------------|---------------------------------------------------------------------------------------|
| :star: [New Relic](NewRelic/Readme.md)                                                   | Observability, Alerts | No          | Monitor, debug, and improve your entire stack.                                        |
| :star: [PagerDuty](IncidentResponse/PagerDuty.md)                                        | IncidentResponse      | No          | Incident Response & On-Call Management                                                |
| :star: [AWS Cloudwatch](https://github.com/Anshul619/AWS-Services/tree/main/8_ObservabilityLogs/AmazonCloudWatch/Readme.md) | Observability, Alerts | No          | Observe and monitor AWS resources and applications in the cloud and on premises.      |
| [Prometheus](Prometheus.md)                                                              | Observability, Alerts | Yes         | Power your metrics and alerting with the leading open-source monitoring solution.     |
| [Grafana](Grafana.md)                                                                    | Visualization         | Yes         | Compose and scale observability with one or all pieces of the stack.                  |
| [ELK](ELK.md)                                                                            | Observability         | Yes         | Logs Aggregation, Monitoring etc.                                                     |
| [Uptime Robot](https://uptimerobot.com/)                                                 | Alerts                | No          | Uptime monitoring service.                                                            |
| [Splunk](https://www.splunk.com/)                                                        | Observability, Alerts | No          | Splunk is a log aggregator while New Relic is a web application performance profiler. |
| [SumoLogic](https://www.sumologic.com/)                                                  | Observability, Alerts | No          | Cloud-native SaaS analytics.                                                          |
| [Source Code profiling](https://aws.amazon.com/codeguru/)                                | Profiling             | No          |                                                                                       |
| [Nagios](https://www.nagios.org/)                                                        | Observability         | Yes         |                                                                                       |
| [Falcon LogScale](https://library.humio.com/)                                            | Observability         | No          |                                                                                       |

# Terminologies

| Term                           | Description                                                                                                                                                                                                                                                        |
|--------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| MTTD (Mean time to Detection)  | [MTTD](https://www.logicmonitor.com/blog/whats-the-difference-between-mttr-mttd-mttf-and-mtbf) is the amount of time, on average, between the start of an issue and when teams become aware of it. This does not include time spent troubleshooting or fixing the issue.                                                                                     |
| MTTR (Mean time to Resolution) | [MTTR](https://www.logicmonitor.com/blog/whats-the-difference-between-mttr-mttd-mttf-and-mtbf) is the average amount of time between when an issue is detected, and when systems are fixed and operating normally again. <br/>- Ideally this includes both time spent fixing the issue, and implementing proactive steps to prevent it from happening again. |
| Telemetry Data                 | MELT - Metrics, Events, Logs, and Traces.                                                                                                                                                                                                                          |

# References
- [Opportunities in Observability](https://rosslazer.com/posts/opps-in-o11y/)