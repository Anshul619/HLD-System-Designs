
# Short & Long Polling in SQS
- [Amazon SQS](https://aws.amazon.com/sqs/faqs/) provides short polling and long polling to receive messages from a queue. 

|              | Short polling                           | Long Poling                                                                                            |
|--------------|-----------------------------------------|--------------------------------------------------------------------------------------------------------|
| Default      | :white_check_mark: Yes                  | No                                                                                                     |
| SQS Response | Instant even if query found no messages | Wait until it collects at least 1 available message<br/>- On wait time expiry, it sends empty message. |
| Pricing      | Normal                                  | :+1: Cheaper than short poling                                                                         |
