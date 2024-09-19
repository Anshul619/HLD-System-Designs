
|                                   | [Secret Manager](AWSSecretsManager.md) | [SSM Parameter Store](AWSSystemManager.md)                                                       |
|-----------------------------------|----------------------------------------|--------------------------------------------------------------------------------------------------|
| Data Limit                        | 64Kb                                   | 4Kb or 8Kb                                                                                       |
| Encryption using [KMS](AWSKMS.md) | :white_check_mark: Yes                 | :white_check_mark: Yes                                                                           |
| Reference in Cloudformation       | :white_check_mark: Yes                 | :white_check_mark: Yes                                                                           |
| Built-In password generator       | :white_check_mark: Yes                 | :x: No                                                                                           |
| Automatic rotation                | :white_check_mark: Yes                 | :x: No                                                                                           |
| Cross-Account Access              | :white_check_mark: Yes                 | :x: No                                                                                           |
| Pricing                           | Not-Free                               | :+1: Free for standard params<br/>- Advanced parameters are charged per param & API transaction. |

[Read more](https://tutorialsdojo.com/aws-secrets-manager-vs-systems-manager-parameter-store/)
