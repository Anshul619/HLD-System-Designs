# AWS Backup
- Using [AWS Backup](https://aws.amazon.com/backup/), you can centralize and automate data protection across AWS services. 
- AWS Backup offers a cost-effective, fully managed, policy-based service that further simplifies data protection at scale. 
- AWS Backup also helps you support your regulatory compliance or business policies for data protection.
- AWS Backup and native snapshots are stored in [AWS managed Amazon S3 buckets](../7_StorageServices/3_ObjectStorageS3/Readme.md).

[](assets/AWS-Backup.jpg)

# Benefits
- AWS Backup provides additional data durability by creating additional copies of your data. 
- You can store copies of backups for as long as you are required to retain your data. 
- Some compliance regulations require retention and immutable backup copies of your data.

# Offerings

| Offering                                                                               | Description                                                                                                                                                                                                                                                                      |
|----------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Service-native backups and snapshots                                                   | Service-native backups and snapshots are those backups that are tightly integrated with the service they support. <br/>- For example - Amazon EBS, [Amazon RDS](../6_DatabaseServices/AmazonRDS/Readme.md), Amazon DynamoDB, [Amazon S3](../7_StorageServices/3_ObjectStorageS3/Readme.md) etc. |
| Centralized policy-based solution                                                      | With a centralized policy-based solution, you can create, automate, and simplify administration of all backups in your environment.                                                                                                                                              |
| [AWS Elastic Disaster Recovery](https://aws.amazon.com/disaster-recovery/?nc=sn&loc=0) | If you require disaster recovery planning, AWS Elastic Disaster Recovery minimizes downtime and data loss with fast, reliable recovery of on-premises and cloud-based applications using affordable storage, minimal compute, and point-in-time recovery (PITR).                 |


# EC2 Backup
The backup data is stored as an Amazon EBS volume-backed Amazon Machine Image (AMI) and AWS Backup stores certain configuration parameters of the EC2 instance, including:
- Instance type
- Security groups
- Amazon VPC 
- Monitoring configuration 
- Tags 

# Pricing
- With AWS Backup, you only pay for the storage you use in your backup activity. AWS Backup storage pricing is based on the amount of storage your backup data consumes.
- Different services are priced differently, so the pricing is unique to each service. The storage amount billed in a month is based on the average storage space used throughout the month.

# Steps to create backup plan

| Step                | Description                                                                                                                                          |
|---------------------|------------------------------------------------------------------------------------------------------------------------------------------------------|
| Create Backup Plan  | Three options are available to begin building your backup plan: Start from an existing template, build a new plan, or define using JSON expressions. |
| Backup Rule         | Backup frequency, retention period, and backup window are defined within the  backup rule configuration.                                             |
| Resource-assignment | Resource assignment name, IAM role, and resource type are needed to configure resource assignments.                                                  |

# Backup vault
In AWS Backup, a [backup vault](https://docs.aws.amazon.com/aws-backup/latest/devguide/vaults.html) is a container that stores and organizes your backups.
- [AWS Backup Vault Lock](https://docs.aws.amazon.com/aws-backup/latest/devguide/vaults.html) provides vault level protection, WORM (write once read many) storage for regulatory compliance, and protection from accidental deletion or bad actors.

With multiple vaults, you can:
- Secure the vault using vault access policies. 
  - Multiple vaults restrict users from modifying the configuration of a vault or deleting any recovery points and limit access to recovery points within an account. 
- Limit the ability to delete backups from within a vault. 
- Separate permissions; for example, development, test, and production. 
- Ensure that backups cannot be deleted from the native services being protected. 
- Have a unique SNS notification configuration per vault.

# Notifications using SNS

| Job Type       | Event                                                    |
|----------------|----------------------------------------------------------|
| Backup job     | BACKUP_JOB_STARTED, BACKUP_JOB_COMPLETED                 |
| Copy job       | COPY_JOB_STARTED, COPY_JOB_SUCCESSFUL or COPY_JOB_FAILED |
| Restore job    | RESTORE_JOB-STARTED, RESTORE_JOB_COMPLETED               |
| Recovery point | RECOVERY_POINT_MODIFIED                                  |

# AWS Backup Audit Manager
- You can use [AWS Backup Audit Manager](https://docs.aws.amazon.com/aws-backup/latest/devguide/aws-backup-audit-manager.html) to audit the compliance of your AWS Backup policies against controls that you define. 
- A control is a procedure designed to audit the compliance of a backup requirement, such as the backup frequency or the backup retention period.

	
	




	