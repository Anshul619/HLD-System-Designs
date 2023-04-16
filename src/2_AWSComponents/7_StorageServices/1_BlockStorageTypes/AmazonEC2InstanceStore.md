# Amazon EC2 instance store
- [Amazon EC2 instance store](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html) provides temporary block-level storage for an instance.

# Features

| Feature                | Description                                                                                                                            |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------|
| Ephemeral or temporary | If you delete the instance, the instance store is deleted, as well.<br/>- Due to this, instance store is considered ephemeral storage. |
| Speed                  | This storage provides sub-millisecond latency to the associated EC2 instances.                                                         |
| Lifecycle              | This storage is located on disks that are physically attached to the host computer.<br/>- This ties the lifecycle of the data to the lifecycle of the EC2 instance.                                             |
