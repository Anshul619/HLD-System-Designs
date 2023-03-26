# Amazon Elastic Block Store (EBS)
- [Amazon Elastic Block Store (Amazon EBS)](https://aws.amazon.com/ebs/) is an easy-to-use, scalable, high-performance block-storage service designed for [Amazon Elastic Compute Cloud (Amazon EC2)](../3_ComputeServices/AmazonEC2/Readme.md).

![](https://d1.awsstatic.com/product-marketing/Storage/EBS/Product-Page-Diagram_Amazon-Elastic-Block-Store.5821c6ee4297f3c01cba37e304922451c828fb04.png)

# Amazon EBS use cases
Amazon EBS is useful when you must retrieve data quickly and have data persist long-term. Volumes are commonly used in the following scenarios.
- Operating systems: Boot/root volumes to store an operating system. The root device for an instance launched from an Amazon Machine Image (AMI) is typically an Amazon EBS volume. These are commonly referred to as EBS-backed AMIs.
- Databases: A storage layer for databases running on Amazon EC2 that rely on transactional reads and writes.
- Enterprise applications: Amazon EBS provides reliable block storage to run business-critical applications.
- Throughput-intensive applications: Applications that perform long, continuous reads and writes.

# Amazon EBS benefits
- High availability: When you create an EBS volume, it is automatically replicated in its Availability Zone to prevent data loss from single points of failure. 
- Data persistence: The storage persists even when your instance doesn’t. 
- Data encryption: All EBS volumes support encryption. 
- Flexibility: EBS volumes support on-the-fly changes. You can modify volume type, volume size, and input/output operations per second (IOPS) capacity without stopping your instance. 
- Backups: Amazon EBS provides the ability to create backups of any EBS volume, through snapshots.