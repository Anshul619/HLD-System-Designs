# Amazon EC2 - Elastic Compute Cloud
- [Amazon EC2 - Elastic Compute Cloud](https://aws.amazon.com/ec2/) offers the broadest and deepest compute platform, with over 500 instances and choice of the latest processor, storage, networking, operating system, and purchase model to help you best match the needs of your workload.
- So, you don’t have to invest in costly physical services. 
- Instead, you can create virtual machines with [Amazon EC2 - Elastic Compute Cloud](https://aws.amazon.com/ec2/) while managing other server features such as ports, security, and storage. 
- Spend less time maintaining your servers and more time on your strategic projects. 
- Invariably, Amazon EC2 is one of the most popular and fastest-growing of the many AWS services.

![img.png](../../0_AWSDesigns/DesignScalableSystemWithRDMS/assets/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)

# EC2 with ELB

![img.png](../../1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/assests/AWS_Elastic_Load_Balancer.png)

# How EC2 Auto-Scaling works?

![img.png](AutoScalingGroup/assets/Auto-Scaling-ELB.png)

- [Read here](AutoScalingGroup/Readme.md)

# Instance Types

| Type                                                                                                                                                  | Description                                                                                                                                                                                                                                                                                                                                                                                                                                | Example          | Use Cases                                                                                                                                                                                                                                                           |
|-------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star:  [General Purpose - Burstable performance instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html) | The T instance family provides a baseline CPU performance with the ability to burst above the baseline at any time for as long as required.                                                                                                                                                                                                                                                                                                | t2.medium        | Micro-services, low-latency interactive applications, small and medium databases, virtual desktops, development environments, code repositories, and business-critical applications.                                                                                |
| :star: [General Purpose - M family](https://aws.amazon.com/ec2/instance-types/)                                                                       | Amazon EC2 M6g instances are powered by Arm-based AWS Graviton2 processors. <br/>- They deliver up to 40% better price/performance over [current generation M5 instances](https://aws.amazon.com/ec2/instance-types/m5/) and offer a balance of compute, memory, and networking resources for a broad set of workloads.                                                                                                                    | m6g.large        | Applications built on open-source software such as application servers, microservices, gaming servers, mid-size data stores, and caching fleets.                                                                                                                    |
| [Compute Optimized](https://aws.amazon.com/ec2/instance-types/)                                                                                       | Compute Optimized instances are ideal for compute bound applications that benefit from high performance processors. <br/>- Instances belonging to this family are well suited for batch processing workloads, media transcoding, high performance web servers, high performance computing (HPC), scientific modeling, dedicated gaming servers and ad server engines, machine learning inference and other compute intensive applications. | c7g.large        | High performance computing (HPC), batch processing, ad serving, video encoding, gaming, scientific modelling, distributed analytics, and CPU-based machine learning inference.                                                                                      |
| [Memory Optimized](https://aws.amazon.com/ec2/instance-types/)                                                                                        | Memory optimized instances are designed to deliver fast performance for workloads that process large data sets in memory.                                                                                                                                                                                                                                                                                                                  | r6a.large        | Memory-intensive workloads, such as SAP, SQL, and NoSQL databases; distributed web scale in-memory caches, such as Memcached and Redis; in-memory databases and real-time big data analytics, such as Hadoop and Spark clusters; and other enterprise applications. |
| [Accelerated Computing](https://aws.amazon.com/ec2/instance-types/)                                                                                   | Accelerated computing instances use hardware accelerators, or co-processors, to perform functions, such as floating point number calculations, graphics processing, or data pattern matching, more efficiently than is possible in software running on CPUs.                                                                                                                                                                               | p4d.24xlarge 	   | Machine learning, high performance computing, computational fluid dynamics, computational finance, seismic analysis, speech recognition, autonomous vehicles, and drug discovery.                                                                                   |
| Storage Optimized                                                                                                                                     | Designed for workloads that require high, sequential read and write access to large datasets on local storage. <br/>- They are optimized to deliver tens of thousands of low-latency random I/O operations per second (IOPS) to applications that replicate their data across different instances.                                                                                                                                         | -                | NoSQL databases, such as Cassandra, MongoDB, and Redis, in-memory databases, scale-out transactional databases, data warehousing, Elasticsearch, and analytics.                                                                                                     |

Follow these best practices to get the maximum benefit from burstable performance instances.
- Ensure that the instance size you choose passes the minimum memory requirements of your operating system and applications. 
- Operating systems with graphical user interfaces that consume significant memory and CPU resources (for example, Windows) might require a t3.micro or larger instance size for many use cases. As the memory and CPU requirements of your workload grow over time, you have the flexibility with the T instances to scale to larger instance sizes of the same instance type, or to select another instance type.
- Enable [AWS Compute Optimizer](https://aws.amazon.com/compute-optimizer/getting-started/) for your account and review the Compute Optimizer recommendations for your workload. Compute Optimizer can help assess whether instances should be upsized to improve performance or downsized for cost savings.
- Enable [Instance Scheduler on AWS](https://aws.amazon.com/solutions/implementations/instance-scheduler-on-aws/) to configure start and stop schedules for your Amazon EC2 and [Amazon RDS instances](../../6_DatabaseServices/AmazonRDS/Readme.md) to manage costs.

# Pricing Options

| Option                                                                                          | Description                                                                                                                                                                                                                                                                                   |
|-------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: On-Demand                                                                                | With On-Demand Instances, you pay for compute capacity with no long-term commitments. <br/>- Billing begins whenever the instance is running, and billing stops when the instance is in a stopped or terminated state. <br/>- The price per second for a running On-Demand Instance is fixed. |
| Reserved                                                                                        | RIs provide you with a significant discount compared to On-Demand Instance pricing. RIs provide a discounted hourly rate and an optional capacity reservation for EC2 instances.                                                                                                              |
| [Spot Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html) | Another way to pay for EC2 instances is by using Spot Instances. <br/>- Amazon EC2 Spot Instances allow you to take advantage of unused EC2 capacity in the AWS Cloud. <br/>- They are available at up to a 90% discount compared to On-Demand prices.                                        |

# State change events for your instances
- Amazon EC2 sends an [EC2 Instance State-change Notification event](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-instance-state-changes.html) to [Amazon EventBridge](../../5_MessageBrokerServices/AmazonEventBridge.md) when the state of an instance changes.

````json
{
   "id":"7bf73129-1428-4cd3-a780-95db273d1602",
   "detail-type":"EC2 Instance State-change Notification",
   "source":"aws.ec2",
   "account":"123456789012",
   "time":"2021-11-11T21:29:54Z",
   "region":"us-east-1",
   "resources":[
      "arn:aws:ec2:us-east-1:123456789012:instance/i-abcd1111"
   ],
   "detail":{
      "instance-id":"i-abcd1111",
      "state":"pending"
   }
}
````

# References
- [Getting Started with AWS Compute Optimizer](https://aws.amazon.com/compute-optimizer/getting-started/)