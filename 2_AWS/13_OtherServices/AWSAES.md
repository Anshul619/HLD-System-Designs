# Amazon AES
- [Amazon SES](https://aws.amazon.com/ses/) lets you reach customers confidently without an on-premises Simple Mail Transfer Protocol (SMTP) system.

![](https://d1.awsstatic.com/products/simple-email-service/product-page-diagram_Amazon-SES%402x.a001d84fea530fc4dcfca95c2a57e6752524596b.png)

# Configure AWS Lambda for making bounce email accounts
- Configure SES to send all bounce events to an [SNS topic](../4_MessageBrokerServices/AmazonSNS.md). 
- Create a [Lambda function](../2_ComputeServices/AWSLambda/Readme.md) that processes each hard bounce event and automatically flags that account as a bounce in your application to prevent further sending attempts.
- This is needed to maintain a low bounce rate to avoid being put on probation.