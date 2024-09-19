
# AWS Step Functions
- [AWS Step Functions](https://docs.aws.amazon.com/step-functions/latest/dg/welcome.html) is a serverless orchestration service that lets you integrate with [AWS Lambda](../AWSLambda/Readme.md) functions and other AWS services to build business-critical applications.
- [AWS Step Functions](https://docs.aws.amazon.com/step-functions/latest/dg/welcome.html) provides serverless orchestration for modern applications. 
- Orchestration centrally manages a workflow by breaking it into multiple steps, adding flow logic, and tracking the inputs and outputs between the steps.

![img.png](assests/AWSStepFunctions.png)

# Features

| Feature                                                                                                             | Description                                                                                                                                                                                                                                                                                                                                             |
|---------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| State                                                                                                               | A task is a state in a workflow that represents a single unit of work that another AWS service performs. Each step in a workflow is a state.                                                                                                                                                                                                            |
| Automatic Scaling                                                                                                   | AWS Step Functions automatically scales the operations and underlying compute to run the steps of your application for you in response to changing workloads.                                                                                                                                                                                           |
| High Availability                                                                                                   | AWS Step Functions has built-in fault tolerance and maintains service capacity across multiple Availability Zones in each region to protect applications against individual machine or data center failures.                                                                                                                                            |
| Pay per use                                                                                                         | With AWS Step Functions, you pay for each transition from one state to the next.                                                                                                                                                                                                                                                                        |
| Security and compliance                                                                                             | AWS Step Functions is integrated with AWS Identity and Access Management (IAM), and recommends a least-privileged IAM policy for all of the resources used in your workflow.                                                                                                                                                                            |
| Built-in error handling                                                                                             | AWS Step Functions automatically handles errors and exceptions with built-in try/catch and retry, whether the task takes seconds or months to complete. <br/>- You can automatically retry failed or timed-out tasks, respond differently to different types of errors, and recover gracefully by falling back to designated cleanup and recovery code. |
| High volume orchestration                                                                                           | AWS Step Functions has Express Workflows to support event rates greater than 100,000 per second, so you can build high volume, short duration workflows.                                                                                                                                                                                                                                                                                                                                                        |
| [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) | The Amazon States Language is a JSON-based, structured language used to define your state machine.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| [AWS Step Functions Workflow Studio](https://docs.aws.amazon.com/step-functions/latest/dg/workflow-studio.html)     | Workflow Studio for AWS Step Functions is a low-code visual workflow designer for Step Functions.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| Unlimited terminable states                                                                                         | Yes, there can be unlimited number of terminal states per state machine. Only one Next or End can be used in a state.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |

# Types of States

| Type           | Description                                                                                                              |
|----------------|--------------------------------------------------------------------------------------------------------------------------|
| Pass state     | A pass state passes its input to its output, without performing work.                                                    |
| Task state     | A task state represents a single unit of work performed by a state machine. Example - AWS Lambda function, ECS task etc. |
| Choice state   | A choice state adds branching logic to a state machine.                                                                  |
| Wait state     | A wait state delays the state machine from continuing for a specified time.                                              |
| Succeed state  | A succeed state stops an activity successfully                                                                           |
| Fail state     | A fail state stops the activity of the state machine & marks it as a failure, unless it is caught by a catch block.      |
| Parallel state | The parallel state can be used to create parallel branches of activity in your state machine.                            |
| Map state      | The map state can be used to run a set of steps for each element of an input array.                                      |

# Scaling considerations for Step functions

| Consideration                                                                                                                                         | Description                                                                                                                                                                                                                            |
|-------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Use wait states and callbacks                                                                                                                         | It’s a best practice to use wait states and callbacks to reduce costs when you are waiting on other tasks to finish.                                                                                                                   |
| [Use timeouts to avoid stuck executions](https://docs.aws.amazon.com/step-functions/latest/dg/sfn-stuck-execution.html)                               | You also want to use timeouts within Step Functions to avoid stuck executions                                                                                                                                                          |
| [Use Amazon S3](../../6_StorageServices/3_S3ObjectStorage/Readme.md) if payload has the potential to grow beyond the limit for input or output data size | If your payload has the potential to grow beyond the limit for input or output data size, use [Amazon Simple Storge Service (Amazon S3)](../../6_StorageServices/3_S3ObjectStorage/Readme.md) to store the data and pass the ARN of the S3 bucket. |
| [Limit to StartExecution requests](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)                            | There is a limit to how many StartExecution requests can be made per second, and requests beyond that level will be throttled.                                                                                                         |

# Standard vs Express Workflows

|                         | Standard workflows                | Express workflows: Synchronous and Asynchronous                                                                             |
|-------------------------|-----------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| Maximum duration        | 1 year                            | 5 mins                                                                                                                      |
| Workflow run start rate | Over 2,000 per second             | Over 100,000 per second                                                                                                     |
| Start transition rate   | Over 4,000 per second per account | Nearly unlimited                                                                                                            |
| Workflow run semantics  | Exactly-once workflow run.        | Asynchronous Express Workflows: At-least-once workflow run.<br/>- Synchronous Express Workflows: At-most-once workflow run. |
| Default cloudwatch logs | No                                | Yes                                                                                                                         |

# General Use Cases

## Delay Lambda Functions for some time

![](https://advancedweb.hu/assets/posts/call_lambda_delay/relative_execution-d7f222a5e1fe47a637391a70ca9e0dffbb85ce51966a28871314b3ac0c0a8385.png)

[Read more](https://advancedweb.hu/how-to-delay-calling-a-lambda-function-using-step-functions/)

## Handle Partial failure for a transaction in Microservices architecture
- In microservices architecture, step function can be helpful to handle partial failure for a business transaction like order placement,
- With distributed data stores, partial execution failures will happen and Step functions can be helpful to handle those.

![](https://res.cloudinary.com/practicaldev/image/fetch/s--8pTiHkOL--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/rxlewboul549vnzqah11.png)

[Read more](https://dev.to/aws-builders/aws-step-functions-simple-order-flow-6gn)

## Transfer Data Records (Lambda, DynamoDB, Amazon SQS)

````json
{
  "Comment" : "An example of the Amazon States Language for reading messages from a DynamoDB table and sending them to SQS",
  "StartAt": "Seed the DynamoDB Table",
  "TimeoutSeconds": 3600,
  "States": {
    "Seed the DynamoDB Table": {
      "Type": "Task",
      "Resource": "arn:aws:lambda:us-east-1:123456789012:function:sqsconnector-SeedingFunction-T3U43VYDU5OQ",
      "ResultPath": "$.List",
      "Next": "For Loop Condition"
    },
    "For Loop Condition": {
      "Type": "Choice",
      "Choices": [
        {
          "Not": {
            "Variable": "$.List[0]",
            "StringEquals": "DONE"
          },
          "Next": "Read Next Message from DynamoDB"
        }
      ],
      "Default": "Succeed"
    },
    "Read Next Message from DynamoDB": {
      "Type": "Task",
      "Resource": "arn:aws:states:::dynamodb:getItem",
      "Parameters": {
        "TableName": "sqsconnector-DDBTable-1CAFOJWP8QD6I",
        "Key": {
          "MessageId": {"S.$": "$.List[0]"}
        }
      },
      "ResultPath": "$.DynamoDB",
      "Next": "Send Message to SQS"
    },
    "Send Message to SQS": {
      "Type": "Task",
      "Resource": "arn:aws:states:::sqs:sendMessage",
      "Parameters": {
        "MessageBody.$": "$.DynamoDB.Item.Message.S",
        "QueueUrl": "https://sqs.us-east-1.amazonaws.com/123456789012/sqsconnector-SQSQueue-QVGQBW134PWK"
      },
      "ResultPath": "$.SQS",
      "Next": "Pop Element from List"
    },
    "Pop Element from List": {
      "Type": "Pass",
      "Parameters": {
        "List.$": "$.List[1:]"
      },
      "Next": "For Loop Condition"
    },
    "Succeed": {
      "Type": "Succeed"
    }
  }
}
````

## Others
- Scheduled events like order scheduling, intentional delays in processing etc.
- Data Processing - You can use AWS Step Functions to produce reports by consolidating data from multiple databases along with validating, processing, and normalizing the data.
- IT Automation - You can build tools for continuous integration and continuous deployment using AWS Step Functions.
- E-commerce - You can implement critical business processes such as order fulfillment or inventory tracking using AWS Step Functions.
- Web Applications - You can use AWS Step Functions to combine Lambda functions to build a web-based application with a human approval.

# References
- [Prototyping at speed with AWS Step Functions new Workflow Studio](https://aws.amazon.com/blogs/compute/prototyping-at-speed-with-aws-step-functions-new-workflow-studio/)
- [The Ultimate Guide to AWS Step Functions](https://dashbird.io/blog/ultimate-guide-aws-step-functions/)
- [Orchestrating high performance computing with AWS Step Functions and AWS Batch](https://aws.amazon.com/blogs/compute/orchestrating-high-performance-computing-with-aws-step-functions-and-aws-batch/)