
# AWS Organizations
- [AWS Organizations](https://aws.amazon.com/organizations/) lets you create new AWS accounts at no additional charge.
- More easily allocate resources, group accounts, and apply governance policies to accounts or groups.

![img.png](../1_IdentityServices/assets/AWS-Multiple-Accounts.png)

# Why do I need multiple AWS accounts?
- [AWS accounts](https://docs.aws.amazon.com/accounts/latest/reference/welcome-multiple-accounts.html) serve as the fundamental security boundary in AWS. 
- They serve as a resource container that provides a useful level of isolation. 
- The ability to isolate resources and users is a key requirement to establishing a secure, well governed environment.

Different types of accounts can be setup like,
- Production, Staging, Dev etc.
- Infrastructure, Application, Data etc.

# Benefits

Separating your resources into separate AWS accounts helps you to support the following principles in your cloud environment:
- Security control 
- Isolation
- Many teams
- Data isolation
- Business process 
- Billing
- Quota allocation

All the recommendations and procedures described in this document are in compliance with the [AWS Well-Architected Framework](../../AWS-Well-Architected-Framework.md).

# Steps to move AWS account from one org to another

| Step                                                                                                                                                                                                         |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Remove the member account from the old organization](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#orgs_manage_accounts_remove-from-master)                   |
| [Send an invite to the member account from the new organization](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_invites.html)                                               |
| [Accept the invite to the new organization from the member account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_invites.html#orgs_manage_accounts_accept-decline-invite) |