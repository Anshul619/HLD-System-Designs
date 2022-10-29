# Fully-managed services
- Fully-managed resources are convenient and easy to manage. 
- [You don’t need to worry about redundancy and failover of AWS managed service](../1_HLDDesignComponents/0_SystemGlossaries/FaultTolerance&DisasterRecovery.md). It all falls on Amazon.
- You don’t have to worry about backups, patches and fixes. 
- AWS takes care of it all, and you can even choose a preferred service window for such tasks.

# Self-managed services
- It would be your responsibility from A to Z, to manage Self-managed resources.
- For example, in such a service you launch an EC2 instance and run all services you need inside that instance. 
- You’re entirely responsible for patches, fixes, backups, [high availability](../1_HLDDesignComponents/0_SystemGlossaries/HighAvailability.md), software versions, dependencies, network infrastructure, security, and so on.

Examples
- [Amazon EC2](4_ComputeServices/AmazonEC2/ReadMe.md)
- [Amazon RDS](6_DatabaseServices/AmazonRDS.md) - AZ, [Instance details](4_ComputeServices/AmazonEC2/ReadMe.md) need to be specified when launching a new database instance.
- [Amazon VPC](1_NetworkingAndContentDelivery/AmazonVPC.md)

# References
- [Fully-Managed vs Self-managed Services – Which One Do You Really Need?](https://bluesoft.com/blog/fully-managed-vs-self-managed-services-which-one-do-you-really-need/)