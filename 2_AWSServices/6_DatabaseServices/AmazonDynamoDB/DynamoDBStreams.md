# DynamoDB Streams
- [DynamoDB Streams](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.CoreComponents.html#HowItWorks.CoreComponents.Streams) captures a [time-ordered sequence of item-level modifications](../../../3_DatabaseServices/Glossaries/ChangeDataCapture.md) in any DynamoDB table and stores this information in a log for up to 24 hours. 
- The data about these events appear in the stream in near real time, and in the order that the events occurred.

![](https://docs.aws.amazon.com/images/amazondynamodb/latest/developerguide/images/HowItWorksStreams.png)

# Use Cases

## Bookstore app

![](../../../0_HLDUseCasesProblems/AWS_BookStoreSampleApp/AWS-Bookstore-Demo-App.png)

[Read more](../../../0_HLDUseCasesProblems/AWS_BookStoreSampleApp/Readme.md)

# Supported events in DynamoDB

| Event                             | Description                                                                                      |
|-----------------------------------|--------------------------------------------------------------------------------------------------|
| A new item is added to the table  | The stream captures an image of the entire item, including all of its attributes.                |
| An item is updated                | The stream captures the before and after image of any attributes that were modified in the item. |
| An item is deleted from the table | The stream captures an image of the entire item before it was deleted.                           |

# Additional Stream Record fields

| Field             |
|-------------------|
| Name of the table |
| Event timestamp   |
| Other metadata    |

# How to turn on streams on DynamoDB?

![img.png](assests/dynamo_strems.png)




