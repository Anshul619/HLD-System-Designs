# Disaster Recovery
- In AWS, [Disaster Recovery](https://en.wikipedia.org/wiki/Disaster_recovery) is done through [active-passive failover policy in Route53](../../../2_AWSComponents/1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonRoute53.md#failover-routing-policy) with at-least 2 regions (having same components & architecture).

![](https://d2908q01vomqb2.cloudfront.net/fc074d501302eb2b93e2554793fcaf50b3bf7291/2021/04/02/Figure-2.png)

# Recovery Point Objective (RPO)
- [Recovery Point Objective (RPO)](https://docs.aws.amazon.com/whitepapers/latest/microservices-on-aws/disaster-recovery.html) is the maximum acceptable delay between the interruption of service and restoration of service.
- This objective determines what is considered an acceptable time window when service is unavailable and is defined by the organization.

# Recovery Time Objective (RTO)
- [Recovery Time Objective (RTO)](https://docs.aws.amazon.com/whitepapers/latest/microservices-on-aws/disaster-recovery.html) is the maximum acceptable amount of time since the last data recovery point.
- This objective determines what is considered an acceptable loss of data between the last recovery point and the interruption of service and is defined by the organization.

# Global Architecture

![img.png](../../../2_AWSComponents/6_DatabaseServices/AmazonRDS/assests/AuroraGlobalDB/aurora_global_database_img.png)