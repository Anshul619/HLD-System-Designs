
# [EFS](https://docs.aws.amazon.com/efs/latest/ug/whatisefs.html)

- EFS is essentially `NAS as a service`.
- It is a Network Storage system, underlying it is a `storage array (SAN)` and it offers the standard protocol for multi session `network file systems (NFS)`.
- It's built on high speed `SSD drives` and is intended for shared storage for your ec2 instances.
- EFS is mainly designed for multiple EC2 instances to access the files concurrently ( which can't be done with `EBS`).