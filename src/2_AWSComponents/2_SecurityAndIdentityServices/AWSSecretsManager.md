# AWS Secrets Manager
- [AWS Secrets Manager](https://aws.amazon.com/secrets-manager/) helps you manage, retrieve, and rotate database credentials, API keys, and other secrets throughout their lifecycles.

# How it works?
- Use [AWS Secrets Manager](https://aws.amazon.com/secrets-manager/) to store, rotate, monitor and control access to secrets such as database credentials, API keys and OAuth tokens. 
- Enable secret rotation using built-in integration for MySQL, PostgreSQL and [Amazon Aurora on Amazon RDS](../6_DatabaseServices/AmazonRDS). 
- You can also enable rotation for other secrets using [AWS Lambda functions](../3_ComputeServices/AWSLambda/Readme.md). 
- To retrieve secrets, you simply replace hard-coded secrets in applications with a call to Secrets Manager APIs, eliminating the need to expose plaintext secrets.

![img.png](../0_AWSDesigns/DesignUploadImageAWSLambdaS3/assets/UploadImage-Lambda.drawio.png)

# References
- [AWS Certified Solutions Architect Professional — Security — Secrets Manager](https://medium.com/codex/aws-certified-solutions-architect-professional-security-secrets-manager-f39137c72211)