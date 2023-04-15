
|                             | [Secret Manager](AWSSecretsManager.md) | [SSM Parameter Store](AWSSystemManager.md)                                                  |
|-----------------------------|----------------------------------------|---------------------------------------------------------------------------------------------|
| Data Limit                  | 64Kb                                   | 4Kb or 8Kb                                                                                  |
| Encryption using KMS        | Yes                                    | Yes                                                                                         |
| Reference in Cloudformation | Yes                                    | Yes                                                                                         |
| Built-In password generator | Yes                                    | No                                                                                          |
| Automatic rotation          | Yes                                    | No                                                                                          |
| Cross-Account Access        | Yes                                    | No                                                                                          |
| Pricing                     | Yes                                    | Free for standard params<br/>- Advanced parameters are charged per param & API transaction. |


[Read more](https://tutorialsdojo.com/aws-secrets-manager-vs-systems-manager-parameter-store/)
