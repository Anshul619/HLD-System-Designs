# Bastion Hosts
- Including [bastion hosts in your VPC environment](https://aws.amazon.com/solutions/implementations/linux-bastion/) enables you to securely connect to your Linux instances without exposing your environment to the Internet. 
- After you set up your bastion hosts, you can access the other instances in your VPC through Secure Shell (SSH) connections on Linux. 
- Bastion hosts are also configured with security groups to provide fine-grained ingress control.
- Bastion Hosts uses the SSH protocol, which is a TCP based protocol on port 22. They must be publicly accessible.

![](https://d1.awsstatic.com/partner-network/QuickStart/datasheets/linux-bastion-architecture.db265b88b1f2846292979b367bd827bdc22ef489.png)