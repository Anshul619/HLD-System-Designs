# Maintain resiliency
- A well-known best practice for cloud architecture is to use [Region-scoped, managed services]().
- These services come with availability and resiliency built in.
- When that is not possible, make sure your workload is replicated across multiple AZs.
- At a minimum, you should use two AZs.
- That way, if an AZ fails, your application will have infrastructure up and running in a second AZ to take over the traffic.

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679641200/e3b8x-vNw5aXnG1DYUfTwg/tincan/d03722b85f9d2b3a05e4c74bd586ea9b1f52f81a/assets/0cBxVcCitKwasoc4_bwzBuePADmVCRRJI.png)

# Go serverless/Cloud Native
Every definition of [serverless](https://aws.amazon.com/what-is/cloud-native/) mentions the following four aspects:
- No servers to provision or manage
- Scales with usage
- You never pay for idle resources
- Availability and fault tolerance are built-in

With serverless, you can spend time on the things that differentiate your application, rather than spend time on ensuring availability, scaling, and managing servers.

| Serverless Service                                             | Remarks |
|----------------------------------------------------------------|---------|
| [AWS Lambda](3_ComputeServices/AWSLambda/Readme.md)            | -       |
| [AWS Fargate](3_ComputeServices/AWSFargate.md)                 | -       |
| [Amazon DynamoDB](6_DatabaseServices/AmazonDynamoDB/Readme.md) | -       |

![](https://explore.skillbuilder.aws/files/a/w/aws_prod1_docebosaas_com/1679760000/JYmGMwB20J8gK2ybFtJ0GQ/tincan/674187_1676990596_p1gpq6pq781l3ntaa1fcbps6c0t4_zip/assets/EeOATVB6y1r_v8u__1kby3aQeiuXnYa4X-section1-services-in-AWS-serverless-platform_NOPROCESS_.jpg)
