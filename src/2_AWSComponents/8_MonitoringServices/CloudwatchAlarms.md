# Cloudwatch Alarms 
- [CloudWatch alarms](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html) are a feature that allows you to watch CloudWatch metrics and to receive notifications when the metrics fall outside of the levels (high or low thresholds) that you configure. 
- You can attach multiple alarms to each metric and each one can have multiple actions.
- Alarm States - OK, ALARM, INSUFFICIENT_DATA.

# Steps to create cloudwatch alarms
- First, choose the metric to monitor.
- Second, choose the metric alarm state (OK, ALARM, INSUFFICIENT_DATA).
- Third and fourth, specify three settings to enable CloudWatch to evaluate when to change the alarm state:
  - Period is the length of time to evaluate the metric or expression to create each individual data point for an alarm. It is expressed in seconds. If you choose one minute as the period, the alarm evaluates the metric once per minute.
  - Evaluation Periods is the number of the most recent periods, or data points, to evaluate when determining alarm state.
  - Datapoints to Alarm is the number of data points within the Evaluation Periods that must be breaching to cause the alarm to go to the ALARM state. The breaching data points don't have to be consecutive, they just must all be within the last number of data points equal to Evaluation Period.
- Fifth, choose when to initiate the alarm and specify what actions an alarm takes when the state changes.