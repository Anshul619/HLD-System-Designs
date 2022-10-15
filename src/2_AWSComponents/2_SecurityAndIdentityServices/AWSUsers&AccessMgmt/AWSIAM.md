
# AWS Identity and Access Management (IAM)
- [AWS Identity and Access Management (IAM)](https://aws.amazon.com/iam/) allows an administrator to provide multiple users and groups with granular access.
- Various user groups and users may require varying levels of access to the various resources that have been developed.
- We may assign roles to users and create roles with defined access levels using IAM.
- It further gives us Federated Access, which allows us to grant applications and users access to resources without having to create IAM Roles.

# IAM Policy
- [IAM Policy](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html) helps to define user access (through AWS Console or AWS Cli) for the AWS resources.

## Example User Policy

````json
{
  "Version": "2022-10-09",
  "Statement": [
    {
      "Sid": "CreateFunction",
      "Effect": "Allow",
      "Action": [
        "lambda:CreateFunction"
      ],
      "Resource": "*"
    },
    {
      "Sid": "CreateS3Function",
      "Effect": "Deny",
      "Action": [
        "S3:CreateBucket"
      ],
      "Resource": "*"
    },
    {
      "Sid": "ReadOnlyAccess",
      "Effect": "Allow",
      "Action": [
        "dynamodb:BatchGet",
        "dynamodb:GetItem",
        "dynamodb:Query",
        "dynamodb:Scan"
      ],
      "Resource": "arn:aws:dynamodb:*:*:table/MyTable",
      "Condition": {
        "ForAllValues:StringEquals": {
          "dynamodb:Attributes": [
            "column-name-1",
            "column-name-2",
            "column-name-3"
          ]
        },
        "StringEqualsIfEffects": {"dynamodb:Select": "SPECIFIC_ATTRIBUTES"}
      }
      
    }
  ]
}
````

# IAM Group
- [An IAM user groups](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups.html) is a collection of IAM users. 
- User groups let you specify permissions for multiple users, which can make it easier to manage the permissions for those users.

![img.png](https://docs.aws.amazon.com/IAM/latest/UserGuide/images/Relationship_Between_Entities_Example.diagram.png)

# IAM Roles
- [An IAM Roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html) is an IAM identity that you can create in your account that has specific permissions.
- An IAM role is similar to an IAM user, in that it is an AWS identity with permission policies that determine what the identity can and cannot do in AWS.

# Security Practices
- [Apply least-privilege permissions](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#grant-least-privilege)

# References
- [AWS IAM Identity Center (Successor to AWS SSO) Overview Demo | Amazon Web Services](https://www.youtube.com/watch?v=4yJp5-jGGNk)
- [AWS IAM Core Concepts You NEED to Know](https://www.youtube.com/watch?v=_ZCTvmaPgao)