
# Amazon Elastic File System (EFS)
- [Amazon Elastic File System (EFS)](https://docs.aws.amazon.com/efs/latest/ug/whatisefs.html) is essentially `NAS as a service`.
- It is a Network Storage system, underlying it is a storage array (SAN) and it offers the standard protocol for multi session network file systems (NFS).
- It's built on high speed `SSD drives` and is intended for shared storage for your ec2 instances.
- EFS is mainly designed for [multiple EC2 instances](../../3_ComputeServices/AmazonEC2) to access the files concurrently (which can't be done with [EBS](../BlockStorageTypes/AmazonEBS.md)).

# [EFS vs Others](../S3vsEBSvsEFS.md)

# References
- [Is EFS a substitute of HDFS for distributed storage?](https://stackoverflow.com/questions/60698924/is-efs-a-substitute-of-hdfs-for-distributed-storage)