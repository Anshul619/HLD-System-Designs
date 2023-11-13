
# Monitoring Services & Tools

| Service                                                                                   | Type                  | Open Source | Description                                                                                                                                                                                                                                                         |
|-------------------------------------------------------------------------------------------|-----------------------|-------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [New Relic](NewRelic.md)                                                           | Observability, Alerts | No          | Monitor, debug, and improve your entire stack.                                                                                                                                                                                                                      |
| :star: [PagerDuty](IncidentResponse/PagerDuty.md)                                         | IncidentResponse      | No          | Incident Response & On-Call Management                                                                                                                                                                                                                              |
| :star: [AWS Cloudwatch](../2_AWSServices/8_MonitoringServices/AmazonCloudWatch/Readme.md) | Observability, Alerts | No          | Observe and monitor AWS resources and applications in the cloud and on premises.                                                                                                                                                                                    |
| [Prometheus](Prometheus.md)                                                               | Observability, Alerts | Yes         | Power your metrics and alerting with the leading open-source monitoring solution.                                                                                                                                                                                   |
| [Grafana](https://grafana.com/)                                                           | Visualization         | Yes         | Grafana is an open source interactive data-visualization platform, developed by Grafana Labs, which allows users to see their data via charts and graphs that are unified into one dashboard (or multiple dashboards!) for easier interpretation and understanding. |
| [ELK](ELK.md)                                                                             | Observability         | Yes         | Logs Aggregation, Monitoring etc.                                                                                                                                                                                                                                   |
| [Uptime Robot](https://uptimerobot.com/)                                                  | Alerts                | No          | Uptime monitoring service.                                                                                                                                                                                                                                          |
| [Splunk](https://www.splunk.com/)                                                         | Observability, Alerts | No          | Splunk is a log aggregator while New Relic is a web application performance profiler.                                                                                                                                                                               |
| [SumoLogic](https://www.sumologic.com/)                                                   | Observability, Alerts | No          | Cloud-native SaaS analytics.                                                                                                                                                                                                                                        |
| [Source Code profiling](https://aws.amazon.com/codeguru/)                                 | Profiling             | No          |                                                                                                                                                                                                                                                                     |

# Terminologies

| Term                           | Description                                                                                                                                                                                                                                                        |
|--------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| MTTD (Mean time to Detection)  | MTTD is the amount of time, on average, between the start of an issue and when teams become aware of it. This does not include time spent troubleshooting or fixing the issue.                                                                                     |
| MTTR (Mean time to Resolution) | MTTR is the average amount of time between when an issue is detected, and when systems are fixed and operating normally again. <br/>- Ideally this includes both time spent fixing the issue, and implementing proactive steps to prevent it from happening again. |
| Telemetry Data                 | MELT - Metrics, Events, Logs, and Traces.                                                                                                                                                                                                                          |
