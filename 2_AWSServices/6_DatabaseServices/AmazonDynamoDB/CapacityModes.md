# RCU vs WCU - DynamoDB

| Concept                    | Description                                                                                                                                                     |
|----------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Read Capacity Units (RCU)  | One read capacity unit (RCU) represents one strongly consistent read per second, or two eventually consistent reads per second, for an item up to 4 KB in size. |
| Write Capacity Units (WCU) | One write capacity unit (WCU) represents one write per second for an item up to 1 KB in size.                                                                   |

[Read more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughput.html)

# Capacity Modes - DynamoDB

| Mode                | On-Demand                                                                            | Provisioned (default)                                                                                        | [Provisioned with AutoScaling](AutoScaling.md)                                                 |
|---------------------|--------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|
| Capacity Settings   | :x: None                                                                             | Specify Read Capacity Units (RCU) and Write Capacity Units (WCU)                                             | Define lower and upper capacity limits & target utilization percentage                         |
| Scaling Behaviour   | Instantly handles up to double previous traffic peak                                 | All Provisioned capacity is available                                                                        | Scales capacity to handle traffic increases and decreases maintaining target utilization.      |
| Throttling Behavior | Requests may be throttled if new peak is more than double previous within 30 minutes | Requests throttled if provisioned capacity is exceeded                                                       | Very short bursts may be throttled. Scales in response to changes in load testing in few mins. |
| Cost Consideration  | Set amount for each read and write. Able to evaluate cost per transaction.           | Set rate for provisioned capacity. <br/>- Overall costs may be lower if you have steady, consistent traffic. | Same as Provisioned.                                                                           |
| Use Case            | Unknown workload, unpredictable application traffic, pay-per-use.                    | Predictable application traffic & capacity requirements, Consistent traffic.                                 | Same as Provisioned.                                                                           |

[Read more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.ReadWriteCapacityMode.html#HowItWorks.requests)

# References
- [Amazon DynamoDB pricing](https://aws.amazon.com/dynamodb/pricing/)
