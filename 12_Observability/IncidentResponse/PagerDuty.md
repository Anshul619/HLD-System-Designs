# Introduction
- Based on the alarm (by [NewRelic](https://newrelic.com/) or another service), an incident would be reported on various channels (Slack, On-Call, Zoom meeting etc.) & assigned to the dev team.
- Once the incident is fixed, the incident would be marked as `Resolved`.

# Sample Incidents 
- 500 HTTP error, for continuous X mins
- Error percentage above threshold, for continuous X mins 
- Memory above threshold, for continuous X mins
- [Apdex below threshold](https://docs.newrelic.com/docs/apm/new-relic-apm/apdex/apdex-measure-user-satisfaction/)
  - The 0.8 score falls between 0 and 1. 
  - [An excellent score falls in 1.00-0.94](https://www.techtarget.com/searchitoperations/definition/Application-Performance-Index-Apdex)
  - A good score ranks from 0.93-0.85 
  - A fair score hits 0.84-0.70 and a poor one between 0.69 and 0.49. 
  - Any lower number is unacceptable.
- Security Alerts

# Supported Services
- [AWS](https://github.com/Anshul619/AWS-Services/tree/main/)
- [NewRelic](../NewRelic/Readme.md)
- [Splunk](https://www.splunk.com)

# Alternatives
- [Opsgenie](https://www.atlassian.com/software/opsgenie/comparison/pagerduty)