# AWS Global Architecture

| Component                           | Count |
|-------------------------------------|-------|
| :earth_americas: Geographic Regions | 25    |
| Availability Zones(AZ)              | 69    |
| Points Of Presence                  | 216   |

# :earth_americas: Geographic Regions
- A [region](https://aws.amazon.com/about-aws/global-infrastructure/regions_az/) is a `geographic location` where every data center inside the region is called an `availability zone`, AZ in short.
- There are `25 geographic regions` available in AWS, around the world.
- For examples,
  - us-east-1 (US East (N. Virginia))
  - eu-west-1 (Europe (Ireland))
  - eu-north-1 (Europe (Stockholm))
  - ap-south-1 (Asia Pacific (Mumbai))
- In AWS, every region would have its own cluster.

![img.png](../0_HLDUseCasesProblems/AWS_DesignMultiRegionActiveActiveArchitecture/AWS-Multi-Region-AZ-HA.drawio.png)

# Availability Zones (AZ)
- [An Availability Zone (AZ)](https://aws.amazon.com/about-aws/global-infrastructure/regions_az/) is `one or more discrete data centers` with redundant power, networking, and connectivity in an AWS Region. 
- AZs give customers the ability to operate production applications and databases that are more [highly available](../7a_HighAvailability/Readme.md), [fault-tolerant](../7a_HighAvailability/FaultTolerance.md), and [scalable](../7_Scalability) than would be possible from a single data center.
- [Most Regions]() are home to 2-3 different Availability Zones each, providing adequate redundancy when necessary within a given Region.
- All Availability Zones within a single Region are connected to one another through [private fiber-optic networking](), allowing each Availability Zone to communicate with one another and transfer data quickly and efficiently as required.
- There are `69 availability zones` available in AWS, around the world.

Every AZ is labeled with a letter a, b, c etc.
- For example - AWS Region eu-central-1 has three availability zones [eu-central-1a,1b,1c](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).

![img.png](https://d0.awsstatic.com/global-infrastructure/maps/Global_Infrastructure_5.13.png)

# Points of Presence
- [POPs](https://www.medianova.com/en-blog/what-is-a-pop-and-how-do-we-create-one/) are used for both [Amazon CloudFront](1_NetworkingAndContentDelivery/AmazonCloudFront.md) to deliver content to end users at high speeds, and [Lambda@Edge](3_ComputeServices/AWSLambda/Readme.md) to run Lambda functions with the lowest possible latency. 
- As of April 2020, there are `216 Points of Presence` in 84 cities across 42 countries.

![img.png](https://d2908q01vomqb2.cloudfront.net/5b384ce32d8cdef02bc3a139d4cac0a22bb029e8/2022/06/17/CloudFront_400-1024x580.png)

# Global vs Regional vs Availability Zone Resource locations

| Type                          | Description                                                                        |
|-------------------------------|------------------------------------------------------------------------------------|
| :globe_with_meridians: Global | AWS Service needs to be setup once in the AWS account, irrespective of any region. |
| :earth_americas: Regional     | AWS Service needs to be setup for every region in AWS account                      |
| Availability Zone Resource    | AWS Service needs to be setup for every availability zone, in AWS account          |

![img.png](https://jayendrapatil.com/wp-content/uploads/2016/03/AWS-Global-vs-Regional-vs-AZs.png)

[Read more](https://jayendrapatil.com/aws-global-vs-regional-vs-az-resources/)

# Source(s) and further reading
- [What are the differences AWS Regions and Availability Zones?](https://www.quora.com/What-are-the-differences-AWS-Regions-and-Availability-Zones)

