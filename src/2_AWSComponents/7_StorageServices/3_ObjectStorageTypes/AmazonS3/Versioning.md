# S3 Objects Versioning
- [Versioning](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Versioning.html) is a means of keeping multiple variants of an object in the same bucket.
- If you enable versioning for a bucket, Amazon S3 automatically generates a unique version ID for the object being stored. 
- In one bucket, for example, you can have two objects with the same key, but different version IDs.
- You can use versioning to preserve, retrieve, and restore every version of every object stored in your Amazon S3 bucket. 
- Versioning-enabled buckets enable you to recover objects from accidental deletion or overwrite.
- Note - Once you version-enable a bucket, it can never return to an unversioned state. Versioning can only be suspended once it has been enabled.

![](https://docs.aws.amazon.com/images/AmazonS3/latest/userguide/images/versioning_Enabled.png)