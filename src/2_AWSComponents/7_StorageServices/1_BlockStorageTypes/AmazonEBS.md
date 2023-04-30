# Amazon Elastic Block Store (EBS)
- [Amazon Elastic Block Store (Amazon EBS)](https://aws.amazon.com/ebs/) is an easy-to-use, scalable, high-performance block-storage service designed for [Amazon Elastic Compute Cloud (Amazon EC2)](../../3_ComputeServices/AmazonEC2/Readme.md).

[](../../3_ComputeServices/assests/AMI_EC2_Root_Volume.drawio.png)

# Amazon EBS use cases

Amazon EBS is useful when you must retrieve data quickly and have data persist long-term. Volumes are commonly used in the following scenarios.

![](../assets/EBS-Use%20Cases.png)

| Use Case                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
|-----------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: Databases                  | A storage layer for databases (like [Casandra](../../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md), [MongoDB](../../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/MongoDB/Readme.md), [Kafka](../../../1_HLDDesignComponents/4_MessageBrokers/Kafka/Readme.md), [Hadoop](../../../1_HLDDesignComponents/5_BigDataComponents/BatchProcessing/ApacheHadoop/Readme.md) etc.) running on [Amazon EC2](../../3_ComputeServices/AmazonEC2/Readme.md) that rely on transactional reads and writes. |
| Operating systems                 | Boot/root volumes to store an operating system. The root device for an instance launched from an Amazon Machine Image (AMI) is typically an Amazon EBS volume. These are commonly referred to as EBS-backed AMIs.                                                                                                                                                                                                                                                                   |
| Enterprise applications           | Amazon EBS provides reliable block storage to run business-critical applications.                                                                                                                                                                                                                                                                                                                                                                                                   |
| Throughput-intensive applications | Applications that perform long, continuous reads and writes.                                                                                                                                                                                                                                                                                                                                                                                                                        |
| Life-&-Shift                      | Lift and shift, self-managed database migrations are best suited for Amazon EBS. The EBS volumes are similar to running the application on dedicated servers on premises.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |

# Amazon EBS benefits

| Benefit                             | Description                                                                                                                                                            |
|-------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: Performance for any workload | Amazon EBS architecture is built for mission critical applications. <br/>- It delivers the right performance for the most demanding workloads.                         |
| High availability                   | When you create an EBS volume, it is automatically replicated in its Availability Zone to prevent data loss from single points of failure.                             |
| Data persistence                    | The storage persists even when your instance doesnt.                                                                                                                   |
| Data encryption                     | All EBS volumes support encryption.                                                                                                                                    |
| Flexibility                         | EBS volumes support on-the-fly changes. You can modify volume type, volume size, and input/output operations per second (IOPS) capacity without stopping your instance. |
| Backups through EBS Snapshots       | Amazon EBS provides the ability to create backups of any EBS volume, through snapshots.                                                                                |

# Features

| Feature                                                                                                    | Short Description                                                                                                                                                                                                        | Description                                                                                                                                                                                                            |
|------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Multi-Attach EBS Volume                                                                                    | [Multi-Attach](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html) is supported exclusively on [Provisioned IOPS SSD (io1 or io2)](https://aws.amazon.com/ebs/volume-types/) volumes.            | -                                                                                                                                                                                                                      |
| Same Availability Zone                                                                                     | [Amazon EC2 instances](../../3_ComputeServices/AmazonEC2/Readme.md) and Amazon EBS volumes must be in the same Availability Zone.                                                                                        | -                                                                                                                                                                                                                      |
| [AWS Compute Optimizer](../../8_MonitoringServices/AWSComputeOptimizer.md) - Recommendation on EBS Volumes | Use [AWS Compute Optimizer](../../8_MonitoringServices/AWSComputeOptimizer.md) for recommendations in Amazon EBS volumes                                                                                                 | -                                                                                                                                                                                                                      |
| Cheaper EBS Volume - gp3                                                                                   | [Amazon EBS gp3 Volume](https://aws.amazon.com/blogs/aws/new-amazon-ebs-gp3-volume-lets-you-provision-performance-separate-from-capacity-and-offers-20-lower-price/) lets you provision performance apart from capacity. | io1, io2, and gp3 volume types have the option to provision IOPS separately from the volume capacity.                                                                                                                  |
| Capacity Planning                                                                                          | To determine the minimum provisioned capacity to support your desired sustained IOPS, you divide the sustained IOPS by the IOPS-to-volume capacity ratio.                                                                | gp2 volumes have a 3 to 1 ratio, io1 volumes have a 50 to 1 ratio, and gp3 and io2 volumes have a 500 to 1 ratio.<br/>- The higher the ratio, the less provisioned capacity is required to support the sustained IOPS. |

# EBS volume types

|                    | Key Strength                        | Description                                                                                                                                                              |
|--------------------|-------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| SSD-backed volumes | High read/write with small I/O size | SSD-backed volumes optimized for transactional workloads involving frequent read/write operations with small I/O size, where the dominant performance attribute is IOPS. |
| HDD-backed volumes | Large I/O size                      | HDD-backed volumes optimized for large streaming workloads where throughput (measured in MiB/s) is a better performance measure than IOPS.                               |


# Amazon EBS Snapshots
- [Amazon EBS Snapshots](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html) create incremental point-in-time copies of your data.
- As a managed AWS service, your snapshots are stored in a managed [Amazon S3 bucket](../3_ObjectStorageTypes/AmazonS3/Readme.md).

# Cost Optimization Tips

| Tip                                                               | Description                                                                                                                                                                                                                                                                                                                                                            |
|-------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Delete inactive or unattached EBS volumes when appropriate.       | -                                                                                                                                                                                                                                                                                                                                                                      |
| Avoid provisioning EBS volumes larger than required.              | AWS recommends that you start small and increase the volume sizes as required over time unless the application requires a static volume size.                                                                                                                                                                                                                          |
| Avoid over-sizing provisioned performance options.                | -                                                                                                                                                                                                                                                                                                                                                                      |
| Use newer volume types when appropriate.                          | Newer volume types either offer lower base pricing or the capability to provision less capacity and still meet your performance goals.                                                                                                                                                                                                                                 |
| Use lower-cost volume types when appropriate.                     | The [pricing is much lower for gp3 volumes than for io1 or io2 volumes](https://aws.amazon.com/ebs/volume-types/) for both capacity and provisioned IOPS.<br/>- For workloads under 16,000 IOPS and under 1,000 MB/s, gp3 volumes offer a significant cost savings compared to older gp2 volumes, and compared to the high IOPS performance io1 and io2 volumes types. |

# Multi-Attach Architecture

![](https://td-mainsite-cdn.tutorialsdojo.com/wp-content/uploads/2020/08/Amazon-EBS-multi-attach1.png)