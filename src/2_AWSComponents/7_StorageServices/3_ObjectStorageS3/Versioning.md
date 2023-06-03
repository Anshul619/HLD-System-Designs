# S3 Objects Versioning
- [Versioning](https://docs.aws.amazon.com/AmazonS3/latest/userguide/Versioning.html) is a means of keeping multiple variants of an object in the same bucket.
- In one bucket, for example, you can have two objects with the same key, but different version IDs.

![](https://docs.aws.amazon.com/images/AmazonS3/latest/userguide/images/versioning_Enabled.png)

# Features

| Feature                          | Remarks                                                                                                                                                                                                                                                                                                           |
|----------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Version ID                       | If you enable versioning for a bucket, Amazon S3 automatically generates a unique version ID for the object being stored.                                                                                                                                                                                         |
| Non-reversible                   | Once you version-enable a bucket, it can never return to an unversioned state. <br/>- Versioning can only be suspended once it has been enabled.                                                                                                                                                                  |
| Recover Objects                  | Versioning-enabled buckets enable you to recover objects from accidental deletion or overwrite.<br/>- You can use versioning to preserve, retrieve, and restore every version of every object stored in your Amazon S3 bucket.                                                                                    |
| Expiring Objects - Delete Marker | If the current object version is not a [delete marker](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-expire-general-considerations.html), Amazon S3 adds a delete marker with a unique version ID. <br/>- This makes the current version noncurrent, and the delete marker the current version. |

# Retention Periods on Objects
- You can place a retention period on an object version either explicitly or through a bucket default setting.
- Different versions of a single object can have different retention modes and periods.

| Setting                                                                                                                                               | Description                                                                                                                                                                         |
|-------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Bucket default settings](https://docs.aws.amazon.com/AmazonS3/latest/API/API_DefaultRetention.html)                                                  | A duration, in either days or years, can be specified as retention period of the bucket's objects.                                                                                  |
| [Setting on object version explicitly](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-retention-periods) | When you apply a retention period to an object version explicitly, you specify a `Retain Until Date` for the object version.<br/>- It would then override the bucket level setting. |

