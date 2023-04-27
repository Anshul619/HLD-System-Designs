
# Amazon Elastic File System (EFS)
- [Amazon Elastic File System (EFS)](https://docs.aws.amazon.com/efs/latest/ug/whatisefs.html) is essentially [NAS as a service](https://aws.amazon.com/what-is/nas/).
- It is a Network Storage system, underlying it is a storage array (SAN) and it offers the standard protocol for multi session network file systems (NFS).
- It's built on high speed [SSD drives](https://en.wikipedia.org/wiki/Solid-state_drive) and is intended for shared storage for your ec2 instances.
- EFS is mainly designed for [multiple EC2 instances](../../3_ComputeServices/AmazonEC2) to access the files concurrently (which can't be done with [EBS](../1_BlockStorageTypes/AmazonEBS.md)).
- [EFS vs Others](../S3vsEBSvsEFS.md)

# Standard–IA storage class
- The [Standard–IA storage class](https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html) reduces storage costs for files that are not accessed every day. 
- It does this without sacrificing the high availability, high durability, elasticity, and POSIX file system access that Amazon EFS provides. 
- AWS recommends [Standard-IA storage](https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html) if you need your full dataset to be readily accessible and want to automatically save on storage costs for files that are less frequently accessed.

# References
- [Is EFS a substitute of HDFS for distributed storage?](https://stackoverflow.com/questions/60698924/is-efs-a-substitute-of-hdfs-for-distributed-storage)