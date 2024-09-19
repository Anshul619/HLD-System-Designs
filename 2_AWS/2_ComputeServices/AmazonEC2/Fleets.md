# Fleets
- In a single API call, a [fleet can launch multiple instance types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Fleets.html) across multiple Availability Zones, using the On-Demand Instance, Reserved Instance, and Spot Instance purchasing options together.

# Fleet Types

| Fleet Type                                                                        | Instance Types                                            | Description                                                                                                                                                                                                                                                                                                                                                                                        |
|-----------------------------------------------------------------------------------|-----------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [EC2 Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet.html)   | On-Demand + Reserved + [Spot Instances](SpotInstances.md) | An [EC2 Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet.html) contains the configuration information to launch a fleet—or group—of instances. <br/>- In a single API call, a fleet can launch multiple instance types across multiple Availability Zones, using the On-Demand Instance, Reserved Instance, and [Spot Instance](SpotInstances.md) purchasing options together. |
| [Spot Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet.html) | [Spot](SpotInstances.md) + On-Demand Instances            | A [Spot Fleet](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet.html) is a set of [Spot Instances](SpotInstances.md) and optionally On-Demand Instances that is launched based on criteria that you specify. <br/>- The Spot Fleet selects the Spot capacity pools that meet your needs and launches [Spot Instances](SpotInstances.md) to meet the target capacity for the fleet.   |

# EC2 Fleet

![](https://docs.aws.amazon.com/images/AWSEC2/latest/UserGuide/images/ec2-fleet.png)
