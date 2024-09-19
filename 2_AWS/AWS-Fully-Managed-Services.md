# Fully-managed Services
- Fully-managed resources are convenient and easy to manage.
- You don’t need to worry about [redundancy and failover](../7a_HighAvailability/FaultTolerance.md) of AWS managed service.
- You don’t have to worry about backups, patches and fixes.
- AWS takes care of it all, and you can even choose a preferred service window for such tasks.

# Self-managed services
- It would be your responsibility from A to Z, to manage Self-managed resources.
- For example, in such a service you launch an EC2 instance and run all services you need inside that instance.
- You’re entirely responsible for patches, fixes, backups, [high availability](../7a_HighAvailability/Readme.md), software versions, dependencies, network infrastructure, security, and so on.

Examples
- [Amazon EC2](2_ComputeServices/AmazonEC2/Readme.md)
- [Amazon RDS](1_DatabaseServices/AmazonRDS/Readme.md)
- [Amazon VPC](16_NetworkingAndContentDelivery/3_NetworkFoundationsVPC/Readme.md)

# References
- [Fully-Managed vs Self-managed Services – Which One Do You Really Need?](https://bluesoft.com/blog/fully-managed-vs-self-managed-services-which-one-do-you-really-need/)
- [Serverless vs Fully Managed Services: What's the Difference?](https://www.freecodecamp.org/news/serverless-fully-managed-service-difference/)