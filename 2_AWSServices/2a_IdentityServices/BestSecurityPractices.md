# Best security practices

| Best Practice                                                                                                                                  |
|------------------------------------------------------------------------------------------------------------------------------------------------|
| Enforce the use of complex passwords for member account root user logins.                                                                      |
| Never share your AWS account root user password or access keys with anyone.                                                                    |
| Enforce the use of MFA for the root user logins.                                                                                               |
| Don't use or store Access Key ID and Secret Access Key, for root user logins. These are used to programmatically give access to the resources. |
| [Apply least-privilege permissions](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#grant-least-privilege).               |
| Note - Only AWS root account has the permission to delete the account.                                                                         |