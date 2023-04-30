# AWS Global Accelerator
- [AWS Global Accelerator](https://aws.amazon.com/global-accelerator/) is a networking service that helps you improve the availability, performance, and security of your public applications. 
- Global Accelerator provides two global static public IPs that act as a fixed entry point to your application endpoints, such as [Application Load Balancers](../2_ApplicationNetworking/ElasticLoadBalancer/Readme.md), [Network Load Balancers](../2_ApplicationNetworking/ElasticLoadBalancer/Readme.md), [Amazon Elastic Compute Cloud (EC2) instances](../../3_ComputeServices/AmazonEC2/Readme.md), and [elastic IPs](../../3_ComputeServices/AmazonEC2/ElasticIP.md).
- AWS Global Accelerator utilizes the Amazon global network, allowing you to improve the performance of your applications by lowering first-byte latency (the round trip time for a packet to go from a client to your endpoint and back again) and jitter (the variation of latency), and increasing throughput (the amount of time it takes to transfer data) as compared to the public internet.
- Global Accelerator improves performance for a wide range of applications over TCP or UDP by proxying packets at the edge to applications running in one or more AWS Regions. 

![](https://d1.awsstatic.com/product-page-diagram_AWS-Global-Accelerator%402x.dd86ff5885ab5035037ad065d54120f8c44183fa.png)

# Features

| Feature                                                                                                                                           | Description                                                                                                                                                                                                                        |
|---------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Use cases - Good Fit for UDP/TCP applications](https://docs.aws.amazon.com/global-accelerator/latest/dg/introduction-benefits-of-migrating.html) | Global Accelerator is a good fit for non-HTTP use cases, such as gaming (UDP), IoT (MQTT), or Voice over IP, as well as for HTTP use cases that specifically require static IP addresses or deterministic, fast regional failover. |

# AWS Global Accelerator & ELB

![](assets/AWSGlobalAccelerator.png)

|       | AWS Global Accelerator        | ELB                       |
|-------|-------------------------------|---------------------------|
| Scope | :globe_with_meridians: Global | :earth_americas: Regional |

# Read more
- [AWS Global Accelerator FAQs](https://aws.amazon.com/global-accelerator/faqs/)
- [AWS Global Accelerator - Improve Global Application Availability and Performance for Your Traffic](https://www.youtube.com/watch?v=Docl4julOQw)