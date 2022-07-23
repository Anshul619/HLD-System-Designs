
# What is S3?

- [S3](https://aws.amazon.com/s3/) is an object store, meaning it is a `higher layer data storage system`, essentially `it is a database "blob" storage`, storing data in an underlying `simple database as an object`. 
- It's designed for `WRITE once READ many access`, perfect for `media data like image, video, documents` particularly as it is distributed and offers a very high level of redundancy.

# What is EFS?

- [EFS](https://docs.aws.amazon.com/efs/latest/ug/whatisefs.html) is essentially `NAS as a service`.
- It is a Network Storage system, underlying it is a `storage array (SAN)` and it offers the standard protocol for multi session `network file systems (NFS)`.
- It's built on high speed `SSD drives` and is intended for shared storage for your ec2 instances. 
- EFS is mainly designed for multiple EC2 instances to access the files concurrently ( which can't be done with `EBS`).

# S3 vs EFS

Basis                                 | S3                                                                        | EFS                                                                          |
---------------------------------------|---------------------------------------------------------------------------|------------------------------------------------------------------------------|
Storage | Object Storage ( can be mounted using s3fs plugin or accessed over HTTP ) | Actual FileSystem ( NFS interface, which can be shared b/w `EC2 instances` ) |
IO Speed | Relatively slower than EFS                                                | Faster than S3                                                               |
Costing | [$0.021 per GB](https://aws.amazon.com/s3/pricing/)                       | [$0.043/GB-Month ( 2x as S3 )](https://aws.amazon.com/efs/pricing/)          |
Use Cases | Static Web Content, Media Data ( like image, video, documents )           | Shared Volume b/w EC2 instances                                              |

# References
- [What is difference b/w AWS EFS vs S3](https://stackoverflow.com/questions/29573142/what-is-difference-between-aws-efs-and-s3)
- [EBS vs EFS vs S3 – which one to use when?](https://www.justaftermidnight247.com/insights/ebs-efs-and-s3-when-to-use-awss-three-storage-solutions/)