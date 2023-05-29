# S3 Objects Versioning
- [Versioning](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Versioning.html) is a means of keeping multiple variants of an object in the same bucket.
- In one bucket, for example, you can have two objects with the same key, but different version IDs.

![](https://docs.aws.amazon.com/images/AmazonS3/latest/userguide/images/versioning_Enabled.png)

# Features

| Feature                          | Remarks                                                                                                                                                                                                                                                                                                           |
|----------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Version ID                       | If you enable versioning for a bucket, Amazon S3 automatically generates a unique version ID for the object being stored.                                                                                                                                                                                         |
| Non-reversible                   | Once you version-enable a bucket, it can never return to an unversioned state. Versioning can only be suspended once it has been enabled.                                                                                                                                                                         |
| Recover Objects                  | Versioning-enabled buckets enable you to recover objects from accidental deletion or overwrite.<br/>- You can use versioning to preserve, retrieve, and restore every version of every object stored in your Amazon S3 bucket.                                                                                    |
| Expiring Objects - Delete Marker | If the current object version is not a [delete marker](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-expire-general-considerations.html), Amazon S3 adds a delete marker with a unique version ID. <br/>- This makes the current version noncurrent, and the delete marker the current version. |
