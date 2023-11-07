# Use AWS Fargate and AWS Lambda for serverless compute

| Requirement                                                                                               | [AWS Lambda](AWSLambda/Readme.md) | [AWS Fargate](AWSFargate.md) |
|-----------------------------------------------------------------------------------------------------------|-----------------------------------|------------------------------|
| Workload to "Lift & Shift" with minimal rework                                                            | :x:                               | :white_check_mark:           |
| Longer running processes or larger deployment packages                                                    | :x:                               | :white_check_mark:           |
| Predictable, consistent workload                                                                          | :x:                               | :white_check_mark:           |
| Need more than 3 GB of memory                                                                             | :x:                               | :white_check_mark:           |
| Container image portability with Docker runtime                                                           | :x:                               | :white_check_mark:           |
| Tasks that take less than 15 mins like 3rd-Party-API calls, IT automation, real-time data processing etc. | :white_check_mark:                | :x:                          |
| Spiky, unpredictable demand                                                                               | :white_check_mark:                | :x:                          |

