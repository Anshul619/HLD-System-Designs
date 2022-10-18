
# Fully-managed services
- Fully-managed resources are convenient and easy to manage. 
- You don’t have to worry about backups, patches and fixes. 
- AWS takes care of it all, and you can even choose a preferred service window for such tasks.
- When you choose an AWS managed service, [you don’t need to worry about redundancy and failover](../1_HLDDesignComponents/0_SystemGlossaries/FaultTolerance&DisasterRecovery.md). It all falls on Amazon.

# Self-managed environments
- By self-managed I mean a service that is your responsibility from A to Z. 
- For example, in such a service you launch an EC2 instance and run all services you need inside of that instance. 
- You’re entirely responsible for patches, fixes, backups, [high availability](../1_HLDDesignComponents/0_SystemGlossaries/HighAvailability.md), software versions, dependencies, network infrastructure, security, and so on.

Examples
- [Amazon EC2](4_ComputeServices/AmazonEC2/ReadMe.md)
- [Amazon RDS](6_DatabaseServices/AmazonRDS.md) - [EC2 details](4_ComputeServices/AmazonEC2/ReadMe.md) need to be specified when launching a new database instance.
- [Amazon VPC](1_NetworkingAndContentDelivery/AmazonVPC.md)

# References
- [Fully-Managed vs Self-managed Services – Which One Do You Really Need?](https://bluesoft.com/blog/fully-managed-vs-self-managed-services-which-one-do-you-really-need/)