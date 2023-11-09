# AWS Certificate Manager
- Use [AWS Certificate Manager (ACM)](https://aws.amazon.com/certificate-manager/) to provision, manage, and deploy public and private SSL/TLS certificates for use with AWS services and your internal connected resources. 
- ACM removes the time-consuming manual process of purchasing, uploading, and renewing SSL/TLS certificates.

![](https://d1.awsstatic.com/product-page-diagram_AWS-Certificate%20Manager%402x.7b2b51b8a698ccac2bbe4d1d904a8ef501dcdda4.png)

# Certificates Renewable

| Certificate Type        | Automatic Renewable | Notification                                                                                                                                                                                                          |
|-------------------------|---------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| AWS issued certificate  | Yes                 | [AWS Config](https://docs.aws.amazon.com/config/latest/developerguide/acm-certificate-expiration-check.html) can be used to monitor, notify through SNS if a certificate is about expire.                             |
| Third-party certificate | No                  | Monitor `days to expiry` as a metric for ACM certificates through Amazon CloudWatch. <br/>- An Amazon EventBridge expiry event is published for any certificate that is at least 45 days away from expiry by default. |

# Other Links
- [How can I associate an ACM SSL/TLS certificate with a Classic, Application, or Network Load Balancer?](https://aws.amazon.com/premiumsupport/knowledge-center/associate-acm-certificate-alb-nlb/)