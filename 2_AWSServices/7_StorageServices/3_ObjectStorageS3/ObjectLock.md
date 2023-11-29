# Object Lock
- With [S3 Object Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html), you can store objects using a [write-once-read-many (WORM) model](../../../3_DatabaseServices/5_DataStructuresUsedInDB/AppendOnlyProperty.md).
- Object Lock can help prevent objects from being deleted or overwritten for a fixed amount of time or indefinitely.

Object Lock provides two ways to manage object retention: 
- Retention periods
- Legal holds.