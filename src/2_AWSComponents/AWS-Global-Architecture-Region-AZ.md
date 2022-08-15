
# Region
- A [region](https://aws.amazon.com/about-aws/global-infrastructure/regions_az/) is a `geographic location` where every data center inside the region is called an `availability zone`, AZ in short.
- There are `25 geographic regions` available in AWS, around the world.
- For examples,
  - us-east-1 (US East (N. Virginia))
  - eu-west-1 (Europe (Ireland))
  - eu-north-1 (Europe (Stockholm))
  - ap-south-1 (Asia Pacific (Mumbai))

![img.png](6_DatabaseServices/AmazonAurora/assests/aurora_global_database_img.png)

# Availability Zone
- [An Availability Zone (AZ)](https://aws.amazon.com/about-aws/global-infrastructure/regions_az/) is `one or more discrete data centers` with redundant power, networking, and connectivity in an AWS Region. 
- AZs give customers the ability to operate production applications and databases that are more [highly available](../1_HLDDesignComponents/0_SystemGlossaries/HighAvailability.md), [fault-tolerant](../1_HLDDesignComponents/0_SystemGlossaries/FaultTolerance&DisasterRecovery.md), and [scalable](../1_HLDDesignComponents/0_SystemGlossaries/Scalability.md) than would be possible from a single data center.
- There are `69 availability zones` available in AWS, around the world.
- Every AZ is labeled with a letter a, b, c etc.
- For example - AWS Region eu-central-1 has three availability zones eu-central-1a,1b,1c.

![img.png](0_AWSDesigns/DesignMultiRegionActiveActiveArchitectureOnAWS/AWS-AZ-Region-HA.drawio.png)

# Source(s) and further reading
- [What are the differences AWS Regions and Availability Zones?](https://www.quora.com/What-are-the-differences-AWS-Regions-and-Availability-Zones)

