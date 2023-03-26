
# AWS Lambda Function Permissions

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679760000/JYmGMwB20J8gK2ybFtJ0GQ/tincan/674187_1676990596_p1gpq6pq781l3ntaa1fcbps6c0t4_zip/assets/QODqDGK0KjcceozK_X6H1_GQmhs5R9lk0-Section3-lambdapermissions_NOPROCESS_.jpg)

| Role                                                                                                         | Short Description                 | Description                                                                                                                                                                                                                          |
|--------------------------------------------------------------------------------------------------------------|-----------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [IAM Execution role](https://docs.aws.amazon.com/lambda/latest/dg/lambda-intro-execution-role.html)          | Controls what function can do     | An IAM execution role defines the permissions that control what the function is allowed to do when interacting with other AWS services.<br/>- A trust policy defines what actions your role can assume.                              |
| [IAM Resource-based policy](https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html) | Permission to invoke the function | A resource policy (also called a function policy) tells the Lambda service which principals have permission to invoke the Lambda function. <br/>- An AWS principal may be a user, role, another AWS service, or another AWS account. |

# Example Execution Role

## IAM policy
- This IAM policy allows the function to perform the `"Action": "dynamodb:PutItem"` action against a DynamoDB table called `"test"` in the us-west-2 region.

````json
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Sid": "Allow PutItem in table/test",
      "Effect": "Allow",
      "Resource": "arn.aws.dynamodb:us-west-2:###:table/test",
      "Action": "dyanomodb.PutItem"
    }
  ]
}
````

## Trust Policy
- This trust policy allows Lambda to use the role's permissions by giving the service principal `lambda.amazonaws.com` permission to call the `AWS Security Token Service (AWS STS) AssumeRole` action.

````json
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Effect": "Allow",
      "Principal": {
        "Service": "lambda.amazonaws.com"
      },
      "Action": "sts.AssumeRole"
    }
  ]
}
````

# Example Resource Policy
- The Principal is the `Amazon S3 "s3.amazonaws.com" service`. 
- This policy is allowing the Amazon S3 service to perform an Action.
- The Action that S3 is allowed to perform is the ability to invoke a `Lambda function "lambda:InvokeFunction" called "my-s3-function"`.

````json
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Sid": "lambda-123",
      "Effect": "Allow",
      "Principal": {
        "Service": "s3.amazonaws.com"
      },
      "Action": "lambda.InvokeFunction",
      "Resource": "aws:lambda:function:my-s3-function",
      "Condition": {
        "StringEquals": {
          "AWS:SourceAccount": ".."
        },
        "ArnLike": {
          "AWS.SourceArn": "arn...lambda"
        }
      }
    }
  ]
}
````