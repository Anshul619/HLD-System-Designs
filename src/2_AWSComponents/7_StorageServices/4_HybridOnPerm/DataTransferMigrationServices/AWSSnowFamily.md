# AWS Snowcone
- [AWS Snowcone](https://aws.amazon.com/snowcone/) is the smallest member of the AWS Snow Family.
- The device weighs under five pounds.
- Its size makes it ideal for use cases with limited space requirements or that require maximum portability.

# AWS Snowball
- [AWS Snowball](https://aws.amazon.com/snowball/) is an edge computing, data migration, and edge storage device. 
- Using [AWS Snowball](https://aws.amazon.com/snowball/), data can be transferred from on-perm to [S3 bucket](../../3_ObjectStorageS3/Readme.md).

![](https://d1.awsstatic.com/hiw_snowball%402x%20(3).afde317ee4d3d8abe9a7ecc4fe52fefb9f454683.png)

## Use Cases
- Data collection
- Machine learning and processing
- Storage in environments with intermittent connectivity or in remote disconnected locations

## Snowball types

| Snowball type                                                                       | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
|-------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Snowball Edge Storage Optimized](https://aws.amazon.com/snowball/features/) | [Snowball Edge Storage Optimized](https://aws.amazon.com/snowball/features/) devices are well suited for large-scale data migrations and recurring transfer workflows, as well as local computing with higher capacity needs.<br/>- You can order [AWS Snowball Edge](https://aws.amazon.com/snowball/features/) devices with compute capabilities as a cluster to increase durability and compute  processing capabilities.<br/>-You can order clusters for local compute and storage only jobs.<br/>- Each Snowball Edge Storage Optimized device can handle 80TB of data. |
| [Snowball Edge Compute Optimized](https://aws.amazon.com/snowball/features/)        | [Snowball Edge Compute Optimized](https://aws.amazon.com/snowball/features/) provides powerful computing resources for use cases such as machine learning, full motion video analysis, analytics, and local computing stacks.                                                                                                                                                                                                                                                                                                                                                |

# AWS Snowmobile
- Each [Snowmobile](https://aws.amazon.com/snowmobile) has a total capacity of up to 100 petabytes. 
- To migrate large datasets of 10PB or more in a single location, you should use Snowmobile. 
- For datasets less than 10PB or distributed in multiple locations, you should use Snowball. 

# Feature Comparisons

![](https://assets-pt.media.datacumulus.com/aws-saa-pt/assets/pt3-q56-i1.jpg)

[Read more](https://aws.amazon.com/snow/#Feature_comparison)