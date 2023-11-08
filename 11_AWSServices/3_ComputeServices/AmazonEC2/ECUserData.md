# Run commands on your Linux instance at launch
- When you launch an instance in [Amazon EC2](Readme.md), you have the option of passing user data to the instance that can be used to perform common automated configuration tasks and even [run scripts after the instance starts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html).

# Features

| Features                                                                                                              | Description                                                                                                                            |
|-----------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------|
| [Types of User Data](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instancedata-add-user-data.html)             | When you launch an instance in [Amazon EC2](Readme.md), you can pass two types of user data - shell scripts and cloud-init directives. |
| Root privilege                                                                                                        | By default, scripts entered as user data are executed with root user privileges.                                                       |
| Boot Cycle                                                                                                            | By default, user data runs only during the boot cycle when you first launch an instance                                                |
| Restart Cycle                                                                                                         | This is not a default configuration of the system. But, can be achieved by explicitly configuring the instance                         |
| Immutable if instance is running                                                                                      | You can't change the user data if the instance is running (even by using root user credentials), but you can view it.                  |
| [Get user data within instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instancedata-data-retrieval.html) | `http://169.254.169.254/latest/user-data/` url can be used to get meta data within instance.                                           |

# Example Script

````shell
#!/bin/bash
yum update -y
amazon-linux-extras install -y lamp-mariadb10.2-php7.2 php7.2
yum install -y httpd mariadb-server
systemctl start httpd
systemctl enable httpd
usermod -a -G apache ec2-user
chown -R ec2-user:apache /var/www
chmod 2775 /var/www
find /var/www -type d -exec chmod 2775 {} \;
find /var/www -type f -exec chmod 0664 {} \;
echo "<?php phpinfo(); ?>" > /var/www/html/phpinfo.php
````
