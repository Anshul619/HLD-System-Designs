# Protecting data using encryption

For [protecting data at rest](https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingEncryption.html) in Amazon S3, you have the following options
- Server-side encryption
- Client-side encryption

# Server-Side Encryption Algo

| Feature                     | [SSE-S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingServerSideEncryption.html)                                 | [SSE-KMS](https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingKMSEncryption.html)                                                                               | [SSE-C](https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html)                                                   |
|-----------------------------|--------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|
| Full-form                   | Server-Side Encryption with Amazon S3-Managed Keys                                                                             | Server-Side Encryption with Customer Master Keys (CMKs), stored in [AWS Key Management Service (KMS)](../../../17_SecurityServices/1_DataProtectionServices/AWSKMS.md) | Server-Side Encryption with Customer-Provided Keys (SSE-C)                                                                                             |
| Default                     | :white_check_mark: Yes                                                                                                         | No                                                                                                                                                                     | No                                                                                                                                                     |
| Audit Trail                 | :x: No                                                                                                                         | :white_check_mark: Yes, an audit trail of when your key was used and by whom.                                                                                          | :x: No                                                                                                                                                 |
| Unique Key for every object | Yes                                                                                                                            | No                                                                                                                                                                     | No                                                                                                                                                     |
| Key Rotation                | Yes, it encrypts the key itself with a root key that it regularly rotates.                                                     | Yes                                                                                                                                                                    | No                                                                                                                                                     |
| Prices                      | Free                                                                                                                           | Billable                                                                                                                                                               | Billable                                                                                                                                               |
| HTTP Header in Upload API   | [s3:x-amz-server-side-encryption:AES256](https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingServerSideEncryption.html) | [s3:x-amz-server-side-encryption:aws:kms](https://docs.aws.amazon.com/AmazonS3/latest/userguide/UsingServerSideEncryption.html)                                        | [x-amz-server-side-encryption-customer-algorithm: AES256](https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html) |

[Read more](https://docs.aws.amazon.com/AmazonS3/latest/userguide/security-best-practices.html#server-side)

# Client-side Encryption Algo
- You can encrypt data on the client-side and upload the encrypted data to [Amazon S3](../Readme.md).
- In this case, the client manages the encryption process, the encryption keys, and related tools.

| Algo                                                                                                                                              |
|---------------------------------------------------------------------------------------------------------------------------------------------------|
| Use a customer master key (CMK) stored in [AWS Key Management Service (AWS KMS)](../../../17_SecurityServices/1_DataProtectionServices/AWSKMS.md) |
| Use a master key you store within your application.                                                                                               |
