# AWS Global Architecture

| Component                           | Count | Remarks                                |
|-------------------------------------|-------|----------------------------------------|
| :earth_americas: Geographic Regions | 25    |                                        |
| Availability Zones(AZ)              | 69    |                                        |
| Points Of Presence                  | 216   |                                        |
| Local Zones                         |       | AWS data centers are located globally. |

![img.png](https://d0.awsstatic.com/global-infrastructure/maps/Global_Infrastructure_5.13.png)

# :earth_americas: Geographic Regions
- A [region](https://aws.amazon.com/about-aws/global-infrastructure/regions_az/) is a `geographic location` where every data center inside the region is called an `availability zone`, AZ in short.
- There are 25 geographic regions available in AWS, around the world.
- For examples,
  - us-east-1 (US East (N. Virginia))
  - eu-west-1 (Europe (Ireland))
  - eu-north-1 (Europe (Stockholm))
  - ap-south-1 (Asia Pacific (Mumbai))
- [In AWS, every region would have its own cluster](../7_SystemGlossaries/Scalability/ServersCluster.md).

![img.png](../0_HLDUseCasesProblems/AWS_DesignMultiRegionActiveActiveArchitecture/AWS-Multi-Region-AZ-HA.drawio.png)

## :star: AWS Region Consideration

| Aspect               | Remarks                                                                                                                                                                                                                                                                                                                                                             |
|----------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Data Compliance      | Enterprise companies often must comply with regulations that require customer data to be stored in a specific geographic territory. <br/>- If applicable, choose a Region that meets your compliance requirements.                                                                                                                                                  |
| Latency              | If your application is sensitive to latency (the delay between a request for data and the response), choose a Region that is close to your user base.                                                                                                                                                                                                               |
| Pricing              | Due to the local economy and the physical nature of operating data centers, prices vary from one Region to another. <br/>- Internet connectivity, imported equipment costs, customs, real estate, and other factors impact a Region's pricing. <br/>- Instead of charging a flat rate worldwide, AWS charges based on the financial factors specific to each Region. |
| Service Availability | Some services might not be available in some Regions. The AWS documentation provides a table that shows the services available in each Region.                                                                                                                                                                                                                                                                                                                                                                    |

# Availability Zones (AZ)
- [An Availability Zone (AZ)](https://aws.amazon.com/about-aws/global-infrastructure/regions_az/) is one or more discrete data centers with redundant power, networking, and connectivity in an AWS Region. 
- AZs give customers the ability to operate production applications and databases that are more [highly available](../7_SystemGlossaries/Reliability/HighAvailability.md), [fault-tolerant](../7_SystemGlossaries/Reliability/FaultTolerance.md), and [scalable](../3_DatabaseServices/Glossaries/ScalabilityDB.md) than would be possible from a single data center.

| Concept                                                                                                   | Remarks                                                                                                                                                                                                                                                                                                                                                                                                                      |
|-----------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| AZ Name                                                                                                   | Every AZ is labeled with a letter a, b, c etc.<br/>- For example - [AWS Region eu-central-1 has three availability zones eu-central-1a,1b,1c](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html).                                                                                                                                                                             |
| [AZ ID](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#az-ids) | To coordinate [Availability Zones across accounts](2c_SecurityServices/4_MultipleAccounts), you must use the [AZ ID](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#az-ids), which is a unique and consistent identifier for an Availability Zone. <br/>- For example, usw2-az2 is an AZ ID for the us-west-2 region and it has the same location in every AWS account. |
| [Private fiber-optic networking]() across AZs in same region                                              | All Availability Zones within a single Region are connected to one another through [private fiber-optic networking](), allowing each Availability Zone to communicate with one another and transfer data quickly and efficiently as required.                                                                                                                                                                                |
| 69 AZs across world                                                                                       | There are 69 availability zones available in AWS, around the world.                                                                                                                                                                                                                                                                                                                                                          |
| 2-3 different AZs in each region                                                                          | [Most Regions]() are home to 2-3 different Availability Zones each, providing adequate redundancy when necessary within a given Region.                                                                                                                                                                                                                                                                                      |

## AZ IDs in multiple accounts

![](https://docs.aws.amazon.com/images/AWSEC2/latest/UserGuide/images/availability-zone-mapping.png)

[Read more](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#az-ids)

# Points of Presence
- [POPs](https://www.medianova.com/en-blog/what-is-a-pop-and-how-do-we-create-one/) are used for both [Amazon CloudFront](1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonCloudFront.md) to deliver content to end users at high speeds, and [Lambda@Edge](3_ComputeServices/AWSLambda/Readme.md) to run Lambda functions with the lowest possible latency. 
- As of April 2020, there are 216 Points of Presence in 84 cities across 42 countries.

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

