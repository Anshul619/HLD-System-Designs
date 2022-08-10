
# S3 vs EFS vs EBS

| Basis                                 | :star: [S3](AmazonS3.md)         | [EFS](AmazonEFS.md)                    | EBS                                                   |
| ---------------------------------------|--------------------------------------------------------------------------|------------------------------------------------------------------------------|-------------------------------------------------------|
| Storage | Object Storage ( can be mounted using s3fs plugin or accessed over HTTP ) | Actual FileSystem ( NFS interface, which can be shared b/w `EC2 instances` ) |
| IO Speed | Relatively slower than EFS                                               | Faster than S3                                                               |
| Rough Costing | [$0.021/GB-Month](https://aws.amazon.com/s3/pricing/)                    | [$0.30/GB-Month](https://aws.amazon.com/efs/pricing/)                        | [$0.10/GB-month](https://aws.amazon.com/ebs/pricing/) |
| Use Cases | Static Web Content, Media Data ( like image, video, documents )          | Shared Volume b/w EC2 instances                                              | Volume for a single EC2 instance                      |
| Availability | `99.999999999% availability`, durability in at least `3 AZs in S3 Region`  | `99.9% availability`, with multiple AZs                                      | `99.999% availability`, with multiple AZs             |
| Storage Size | No limit                                                                 | No limit                                                                     | Max Storage size of 16TB                              |
| File Size Limitation | Max Object Size of 5TB ( Max Object Size of 5GB through PUT API )        | Max File Size of 48TB                                                        | No Limit                                              |