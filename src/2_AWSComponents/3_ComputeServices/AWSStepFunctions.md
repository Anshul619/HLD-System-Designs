
# AWS Step Functions
- [AWS Step Functions](https://docs.aws.amazon.com/step-functions/latest/dg/welcome.html) is a serverless orchestration service that lets you integrate with [AWS Lambda](AWSLambda/Readme.md) functions and other AWS services to build business-critical applications.

![img.png](assests/AWSStepFunctions.png)

# General Use Cases

## Delay Lambda Functions for some time

![](https://advancedweb.hu/assets/posts/call_lambda_delay/relative_execution-d7f222a5e1fe47a637391a70ca9e0dffbb85ce51966a28871314b3ac0c0a8385.png)

[Read more](https://advancedweb.hu/how-to-delay-calling-a-lambda-function-using-step-functions/)

## Handle Partial failure for a transaction in Microservices architecture
- In microservices architecture, step function can be helpful to handle partial failure for a business transaction like order placement,
- With distributed data stores, partial execution failures will happen and Step functions can be helpful to handle those.

![](https://res.cloudinary.com/practicaldev/image/fetch/s--8pTiHkOL--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/rxlewboul549vnzqah11.png)

[Read more](https://dev.to/aws-builders/aws-step-functions-simple-order-flow-6gn)

## Scheduled events like order scheduling, intentional delays in processing etc.

# Scaling considerations for Step functions

| Consideration                                                                                                                                  | Description                                                                                                                                                                                                                            |
|------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Use wait states and callbacks                                                                                                                  | It’s a best practice to use wait states and callbacks to reduce costs when you are waiting on other tasks to finish.                                                                                                                   |
| [Use timeouts](https://docs.aws.amazon.com/step-functions/latest/dg/sfn-stuck-execution.html)                                                  | You also want to use timeouts within Step Functions to avoid stuck executions                                                                                                                                                          |
| Use [Amazon S3](../7_StorageServices/AmazonS3/Readme.md) if payload has the potential to grow beyond the limit for input or output data size   | If your payload has the potential to grow beyond the limit for input or output data size, use [Amazon Simple Storge Service (Amazon S3)](../7_StorageServices/AmazonS3/Readme.md) to store the data and pass the ARN of the S3 bucket. |
| [Limit to StartExecution requests](https://docs.aws.amazon.com/step-functions/latest/apireference/API_StartExecution.html)                     | There is a limit to how many StartExecution requests can be made per second, and requests beyond that level will be throttled.                                                                                                         |

# References
- [Prototyping at speed with AWS Step Functions new Workflow Studio](https://aws.amazon.com/blogs/compute/prototyping-at-speed-with-aws-step-functions-new-workflow-studio/)
- [The Ultimate Guide to AWS Step Functions](https://dashbird.io/blog/ultimate-guide-aws-step-functions/)