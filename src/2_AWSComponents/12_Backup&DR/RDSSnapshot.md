# RDS Snapshots
- [RDS](../6_DatabaseServices/AmazonRDS/Readme.md) stores the DB snapshots in the [Amazon S3 bucket](../7_StorageServices/3_ObjectStorageS3/Readme.md) belonging to the [same AWS region](../AWS-Global-Architecture-Region-AZ.md) where the [RDS instance](../6_DatabaseServices/AmazonRDS/Readme.md) is located.

# Use Cases

| Use Case                                                                                                                            | Remarks                                                                                                                                                                                                                                              |
|-------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Restore database to a specified time](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIT.html)                        | You can restore a DB instance to a [specific point in time](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIT.html), creating a new DB instance.                                                                                       |
| [Share encrypted snapshots](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ShareSnapshot.html)                         | -                                                                                                                                                                                                                                                    |
| [Enable KMS encryption on unencrypted DB instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Encryption.html) | Create a snapshot of the un-encrypted database.<br/>- Copy the snapshot and enable encryption for the snapshot.<br/>- Restore the database from the encrypted snapshot.<br/>- Migrate applications to the new database, and delete the old database. |

# Share encrypted snapshots

| Steps                                                                                                                                                                                                    |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Share the [AWS KMS key](../2c_SecurityServices/1_DataProtectionServices/AWSKMS.md) that was used to encrypt the snapshot with any accounts that you want to be able to access the snapshot. |
| Use the AWS Management Console, AWS CLI, or [Amazon RDS API](../6_DatabaseServices/AmazonRDS/Readme.md) to share the encrypted snapshot with the other accounts.                                                                                      |

[Read more](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ShareSnapshot.html)

