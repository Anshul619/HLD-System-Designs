# Spot Instances
- A [Spot Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html) is an instance that uses spare EC2 capacity that is available for less than the On-Demand price.
- However, Spot does not guarantee that you can keep your running instances long enough to finish your workloads. 
- Spot also does not guarantee that you can get immediate availability of the instances that you are looking for, or that you can always get the aggregate capacity that you requested.

![](assets/EC2-Spot-Request.png)

# Use Cases

| Use Case                         |
|----------------------------------|
| Big data                         |
| Containerized workloads          |
| CI/CD                            |
| Stateless web servers            |
| High performance computing (HPC) |
| Rendering workloads              |

# Features

| Feature                                                                                          | Remarks                                                                                                                                                                                                                                                                                                             |
|--------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Spot blocks](https://docs.amazonaws.cn/en_us/AWSEC2/latest/UserGuide/how-spot-fleet-works.html) | [Spot blocks](https://docs.amazonaws.cn/en_us/AWSEC2/latest/UserGuide/how-spot-fleet-works.html) are designed not to be interrupted and will run continuously for the duration you select (1 to 6 hours), independent of the Spot market price.<br/>- Note - AWS has stopped offering Spot blocks to new customers. |


# Reference
- [Work with Spot Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html)
