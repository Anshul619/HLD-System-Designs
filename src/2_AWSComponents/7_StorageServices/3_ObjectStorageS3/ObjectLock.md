# Object Lock
- With [S3 Object Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html), you can store objects using a [write-once-read-many (WORM) model](../../../1_HLDDesignComponents/3_DatabaseComponents/1_Glossaries/AppendOnlyProperty.md).
- Object Lock can help prevent objects from being deleted or overwritten for a fixed amount of time or indefinitely.

Object Lock provides two ways to manage object retention: 
- Retention periods
- Legal holds.