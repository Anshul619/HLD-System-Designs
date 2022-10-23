
# Introduction
- AWS manages its [global architecture through region and availability zones](AWS-Global-Architecture-Region-AZ.md).
- [Amazon Resouce Name (ARN)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) uniquely identify AWS resources.

# System Designs

## Design Scalable System on AWS

![img.png](0_AWSDesigns/DesignScalableSystemWithRDMS/assets/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)

[Read more](0_AWSDesigns/DesignScalableSystemWithRDMS/README.md)

## Design Multi-Region Active-Active Architecture On AWS

![img.png](0_AWSDesigns/DesignMultiRegionActiveActiveArchitectureOnAWS/AWS-AZ-Region-HA.drawio.png)

[Read more](0_AWSDesigns/DesignMultiRegionActiveActiveArchitectureOnAWS/README.md)

## Upload Image using Amazon S3 and Lambda

![img.png](0_AWSDesigns/DesignUploadImageAWSLambdaS3/assets/UploadImage-Lambda.drawio.png)

[Read more](0_AWSDesigns/DesignUploadImageAWSLambdaS3/README.md)

## Others
- [Send-SMS-API design - App Internal Clients, Multiple SMS-Providers, AutoScaling](../3_HLDDesignProblems/NotificationSystem/README.md)
- [WP Site with Amazon CloudFront & S3](0_AWSDesigns/WPSiteCloudFront&S3.md)
- [Microservices On AWS](0_AWSDesigns/MicroservicesOnAWS.md)
- [Dropbox Saves Millions by Building a Scalable Metadata Store on Amazon DynamoDB and Amazon S3](0_AWSDesigns/DropboxAmazonDynamoDB/Readme.md)

# AWS Services - Architecture, Features etc.

<table>
  <tbody>
     <tr>
      <td>
        <a href="1_NetworkingAndContentDelivery">DNS Service</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div>
                <a href="1_NetworkingAndContentDelivery/AmazonRoute53.md" target="_blank">
                  <img src="https://storage.googleapis.com/yama-blog.appspot.com/1/2018/08/eyecatch-route53.png" width="150">
                </a>
            </div>
        </div>
      </td>
       <td rowspan=14 width="150px">
            <a href="3_InfraAutomation/AWSCloudFormation/Readme.md" target="_blank">
              <img src="https://i0.wp.com/www.australtech.net/wp-content/uploads/2019/05/cloudformation-logo.png" width="400">
            </a>
            <br/><br/>
        </td>
    </tr>
    <tr>
        <td>
            <a href="2_SecurityAndIdentityServices">Security Services</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="2_SecurityAndIdentityServices/AWSUsers&AccessMgmt/AWSIAM.md" target="_blank">
                  <img src="https://i0.wp.com/sra.io/wp-content/uploads/2020/01/AWS-IAM-Exploitation.png?fit=1102%2C620&ssl=1" width="150">
                </a>
                <a href="2_SecurityAndIdentityServices/AWSShield.md" target="_blank">
                  <img src="https://d33wubrfki0l68.cloudfront.net/de9af514e658d43b6f0b24dc5f063c67df7b394c/82078/images/aws/00-icons/shield.png" width="150">
                </a>
                <a href="2_SecurityAndIdentityServices/AWSWAF.md" target="_blank">
                  <img src="https://www.trinimbus.com/wp-content/uploads/2016/12/Get-The-Last-WAF-with-AWS-Web-Application-Firewall.jpg" width="150">
                </a>
                <a href="2_SecurityAndIdentityServices/AmazonCognito.md" target="_blank">
                  <img src="https://quintagroup.com/blog/amazon-cognito/@@download/image/Amazon%20Cognito.jpg" width="150">
                </a>
                <a href="2_SecurityAndIdentityServices/AWSSecretsManager.md" target="_blank">
                  <img src="https://miro.medium.com/max/1400/0*T_pIoQrYM4cHypvr.png" width="150">
                </a>
            </div>
        </td>
    </tr>
    <tr>
      <td>
        <a href="1_NetworkingAndContentDelivery">VPC - Public, Private Subnet</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="1_NetworkingAndContentDelivery/AmazonVPC.md" target="_blank">
                  <img src="https://www.kamprasad.com/wp-content/uploads/2019/08/aws-vpc.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="1_NetworkingAndContentDelivery">CDN - Static Content (Image, Video)</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div>
                <a href="1_NetworkingAndContentDelivery/AmazonCloudFront.md" target="_blank">
                  <img src="https://ericknavarro.io/images/thumbnails/12.png" width="400">
                </a>
                <a href="7_StorageServices/AmazonS3.md" target="_blank">
                  <img src="https://miro.medium.com/max/580/1*DHe24MbDHtbkOeIJzxrfdA.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="1_NetworkingAndContentDelivery">API Gateway, Load Balancer</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div>
                <a href="1_NetworkingAndContentDelivery/AmazonAPIGateway/Readme.md" target="_blank">
                  <img src="https://www.prolim.com/wp-content/uploads/2019/09/amazon-api-gatewat-1.jpg" width="150">
                </a>
                <a href="1_NetworkingAndContentDelivery/ElasticLoadBalancer/Readme.md" target="_blank">
                  <img src="https://static.wixstatic.com/media/e37c27_65bd886d7d284196a495daa7b2582486~mv2.png/v1/fill/w_560,h_560,al_c,lg_1,q_85,enc_auto/e37c27_65bd886d7d284196a495daa7b2582486~mv2.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
        <td>
            <a href="4_ComputeServices">Compute Services</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="4_ComputeServices/AmazonEC2/ReadMe.md" target="_blank">
                  <img src="https://miro.medium.com/max/750/1*q6F0j8HFHd8jeYXyQBqrCQ.jpeg" width="150">
                </a>
                <a href="4_ComputeServices/AWSFargate.md" target="_blank">
                  <img src="https://www.nclouds.com/img/services/toolkit/fargate.png" width="150">
                </a>
                <a href="4_ComputeServices/AWSLambda/Readme.md" target="_blank">
                  <img src="https://www.brcline.com/wp-content/uploads/2021/09/aws-lambda-logo.png" width="150">
                </a>
                <a href="4_ComputeServices/AmazonEMR.md" target="_blank">
                  <img src="https://www.clipartmax.com/png/small/70-700800_amazon-emr.png" width="80">
                </a>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <a href="4_ComputeServices">Container Orchestration Services</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="4_ComputeServices/AmazonECS/README.md" target="_blank">
                  <img src="https://i0.wp.com/miro.medium.com/max/626/1*RmiGt6GAWf4pkO9ohOnRaQ.png?w=810&ssl=1" width="150">
                </a>
                <a href="4_ComputeServices/AmazonEKS.md" target="_blank">
                  <img src="https://www.turbonomic.com/wp-content/uploads/2020/11/AWS-EKS-logo-no-background.png" width="150">
                </a>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <a href="6_DatabaseServices">In-Memory DB/Cache</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="6_DatabaseServices/AmazonElasticCache.md" target="_blank">
                  <img src="https://www.devopsschool.com/blog/wp-content/uploads/2022/03/amazone_elasticache-740x414.png" width="150">
                </a>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <a href="5_MessageBrokerServices">Message Broker Services</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="5_MessageBrokerServices/AmazonSQS.md" target="_blank">
                  <img src="https://i0.wp.com/blog.knoldus.com/wp-content/uploads/2021/09/sqs.png?w=711&ssl=1" width="150">
                </a>
                <a href="5_MessageBrokerServices/AmazonEventBridge.md" target="_blank">
                  <img src="https://user-images.githubusercontent.com/3268013/149550617-d92fa8ff-f95d-499c-8515-0ed0be976fbf.png" width="150">
                </a>
                <a href="5_MessageBrokerServices/AmazonSNS.md" target="_blank">
                  <img src="https://miro.medium.com/max/720/0*QjKNs9dEShlQ39VI.png" width="150">
                </a>
                <a href="5_MessageBrokerServices/AmazonMQ.md" target="_blank">
                  <img src="https://res.cloudinary.com/practicaldev/image/fetch/s--UbYwdyFm--/c_imagga_scale,f_auto,fl_progressive,h_420,q_auto,w_1000/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/n1uck9jt481r6rcezx57.png" width="150">
                </a>
                <a href="5_MessageBrokerServices/AmazonMSK.md" target="_blank">
                  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcjocd4vh1S29xvfJ_bjgJWb-SR5SzW2Dz2A&usqp=CAU" width="100">
                </a>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <a href="6_DatabaseServices">Search Engine</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="6_DatabaseServices/AmazonOpenSearch.md" target="_blank">
                  <img src="https://d2908q01vomqb2.cloudfront.net/ca3512f4dfa95a03169c5a670a4c91a19b3077b4/2021/07/12/opensearch_logo_1000x500.png" width="150">
                </a>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <a href="6_DatabaseServices">Database Services</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="6_DatabaseServices/AmazonRDSAurora/Readme.md" target="_blank">
                  <img src="https://ty33w2cevsm2b9jau43ym0n6-wpengine.netdna-ssl.com/wp-content/uploads/2021/10/Amazon-Aurora-logo.png" width="150">
                </a>
                <a href="6_DatabaseServices/AmazonRDS.md" target="_blank">
                  <img src="https://secpigeon.com/media/2022/04/RDS.png" width="150">
                </a>
                <a href="6_DatabaseServices/AmazonDynamoDB/Readme.md" target="_blank">
                  <img src="https://user-images.githubusercontent.com/6509926/70553550-f033b980-1b40-11ea-9192-759b3b1053b3.png" width="150">
                </a>
                <a href="6_DatabaseServices/AmazonKeySpaces.md" target="_blank">
                  <img src="https://static.datadoghq.com/static/images/logos/amazon-keyspaces_large.svg" width="150">
                </a>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <a href="7_StorageServices">Storage Services</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="7_StorageServices/AmazonS3.md" target="_blank">
                  <img src="https://miro.medium.com/max/580/1*DHe24MbDHtbkOeIJzxrfdA.png" width="150">
                </a>
                <a href="7_StorageServices/AmazonEFS.md" target="_blank">
                  <img src="https://www.justaftermidnight247.com/wp-content/uploads/2020/09/EFS-logo.jpg" width="150">
                </a>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <a href="6_DatabaseServices">Data Warehousing</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="6_DatabaseServices/AmazonRedshift.md" target="_blank">
                  <img src="https://w7.pngwing.com/pngs/404/507/png-transparent-amazon-com-amazon-redshift-amazon-web-services-amazon-relational-database-service-amazon-elasticache-amazon-redshift-blue-angle-text.png" width="150">
                </a>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <a href="8_MonitoringServices">Monitoring Services</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="8_MonitoringServices/AmazonCloudWatch.md" target="_blank">
                  <img src="https://miro.medium.com/max/800/1*ffbynFsxn43lPdne2kaHMQ.png" width="150">
                </a>
                <a href="8_MonitoringServices/AWSCloudTrail.md" target="_blank">
                  <img src="https://i0.wp.com/blog.knoldus.com/wp-content/uploads/2022/02/feature.png?w=360&ssl=1" width="150">
                </a>
            </div>
        </td>
    </tr>
  </tbody>
</table>

## Amazon API Gateway - Features

![img.png](1_NetworkingAndContentDelivery/AmazonAPIGateway/assets/AmazonAPIGateway_Features.drawio.png)

[Read more](1_NetworkingAndContentDelivery/AmazonAPIGateway/Readme.md)

## Amazon Elastic Load Balancer

![img.png](1_NetworkingAndContentDelivery/ElasticLoadBalancer/assests/AWS_Elastic_Load_Balancer.png)

[Read more](1_NetworkingAndContentDelivery/ElasticLoadBalancer/Readme.md)

## Amazon ECS - Tasks, Fargate etc.

![img.png](4_ComputeServices/AmazonECS/assests/ECS-Tasks.png)

[Read more](4_ComputeServices/AmazonECS/README.md)

## Amazon SQS - Queue, Consumers etc.

![img.png](5_MessageBrokerServices/assests/sqs/SQS-DLD-More-Info.png)

[Read more](5_MessageBrokerServices/AmazonSQS.md)

## Amazon EventBridge - Targets, Rules etc.

![img.png](5_MessageBrokerServices/assests/eventbridge/EventBridge.png)

[Read more](5_MessageBrokerServices/AmazonEventBridge.md)

## Amazon SNS - Pub/Sub, Push etc.

![img.png](5_MessageBrokerServices/assests/sns/FanOutPatternSQSSNS.png)

[Read more](5_MessageBrokerServices/AmazonSNS.md)

## AWS Lambda

![img.png](4_ComputeServices/AWSLambda/assets/Lambda-Code-Upload-Options.png)

[Read more](4_ComputeServices/AWSLambda/Readme.md)

## Auto-Scaling - How it works?

![img.png](4_ComputeServices/AmazonEC2/AutoScalingGroup/assets/Auto-Scaling-ELB.png)

[Read more](4_ComputeServices/AmazonEC2/AutoScalingGroup/README.md)

## AWS Step Functions - Lambda

![img.png](4_ComputeServices/assests/AWSStepFunctions.png)

[Read more](4_ComputeServices/AWSStepFunctions.md)

## AWS - Comparisons b/w Services
- [Amazon RDS Aurora vs Other RDS DB engines](6_DatabaseServices/AmazonAuroraVsRDS.md)
- [Amazon SQS vs SNS](../1_HLDDesignComponents/4_MessageBrokers/KafkaVsRabbitMQVsSQSVsSNS.md)
- [Amazon S3 vs EFS vs EBS](7_StorageServices/S3vsEFSvsEBS.md)
- [Amazon ECS vs EKS vs Fargate](4_ComputeServices/EKSvsECSvsFargate.md)
- [Amazon API Gateway vs ELB](1_NetworkingAndContentDelivery/AmazonAPIGatewayVsELB.md)

## AWS - Services List, Table

Service                                                                                      | Type                                                                                | [Fully Managed?](FullyManagedVsSelfManaged.md) | [Location - Global vs Regional vs AZ](AWS-Global-Architecture-Region-AZ.md)        | Description                                                                                                                                                                                                                                                                 |
----------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------|------------------------------------------------|------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
:star: [Amazon Route 53](1_NetworkingAndContentDelivery/AmazonRoute53.md)                    | [Networking & Content Delivery Service](1_NetworkingAndContentDelivery)             | :white_check_mark:                             | :globe_with_meridians: Global                                                      | Fully Managed [AWS DNS Service](https://aws.amazon.com/route53/what-is-dns/)                                                                                                                                                                                                |
:star: [AWS IAM](2_SecurityAndIdentityServices/AWSUsers&AccessMgmt/AWSIAM.md)                | [Security Service](2_SecurityAndIdentityServices)                                   | :white_check_mark:                             | :globe_with_meridians: Global                                                      | AWS User & Access Management Service                                                                                                                                                                                                                                        |
:star: [Amazon VPC](1_NetworkingAndContentDelivery/AmazonVPC.md)                             | [Networking & Content Delivery Service](1_NetworkingAndContentDelivery)             | :x:                                            | :earth_americas: Regional                                                          | Define and launch AWS resources in a logically isolated virtual network                                                                                                                                                                                                     |
:star: [Amazon VPC Subnets](1_NetworkingAndContentDelivery/AmazonVPC.md)                             | [Networking & Content Delivery Service](1_NetworkingAndContentDelivery)             | :x:                                            | :classical_building: Availability Zone                                             | -                                                                                                                                                                                                                                                                           |
:star: [AWS Cloud Formation](3_InfraAutomation/AWSCloudFormation/Readme.md)                  | [AWS Infrastructure Automation](3_InfraAutomation)                                  | :white_check_mark:                             | :earth_americas: Regional                                                          | Infrastructure as a CODE <br/>- Configure & manage complete AWS infrastructure through cloudformation templates (yaml or json).                                                                                                                                             |
:star: [Amazon CloudFront](1_NetworkingAndContentDelivery/AmazonCloudFront.md)               | [Networking & Content Delivery Service](1_NetworkingAndContentDelivery)             | :white_check_mark:                             | :globe_with_meridians: Global                                                      | AWS Low-Latency [CDN Service](../1_HLDDesignComponents/0_SystemGlossaries/CDNs.md), which securely delivers content with [low latency and high transfer speeds](../1_HLDDesignComponents/0_SystemGlossaries/LatencyThroughput.md)                                           |
:star: [Amazon API Gateway](1_NetworkingAndContentDelivery/AmazonAPIGateway/Readme.md)       | [Networking & Content Delivery Service](1_NetworkingAndContentDelivery)             | :white_check_mark:                             | :earth_americas: Regional                                                          | Serverless API service for API development.                                                                                                                                                                                                                                 |
:star: [Amazon Elastic Load Balancer](1_NetworkingAndContentDelivery/ElasticLoadBalancer/Readme.md) | [Networking & Content Delivery Service](1_NetworkingAndContentDelivery)             | :white_check_mark:                             | :earth_americas: Regional                                                          | Fully Managed AWS [Load Balancer Service](../1_HLDDesignComponents/0_SystemGlossaries/LoadBalancer.md)                                                                                                                                                                      |
:star: [Amazon EC2](4_ComputeServices/AmazonEC2/ReadMe.md)                                         | [Compute Service](4_ComputeServices)                                                | :x:                                            | :classical_building: Availability Zone                                             | [Self-Managed Virtual Machine](https://www.redhat.com/en/topics/virtualization/what-is-a-virtual-machine) that run the application in the cloud.                                                                                                                            |
:star: [AWS EC2 Auto Scaling Groups](4_ComputeServices/AmazonEC2/AutoScalingGroup/README.md)               | [Compute Service](4_ComputeServices)                                                | :white_check_mark:                             | :earth_americas: Regional                                              | Auto-scaling of [EC2 instances](4_ComputeServices/AutoScalingGroup/README.md), based on demand & traffic (CPU, Memory).                                                                                                                                                     |
[Amazon EBS](https://aws.amazon.com/ebs/)                                                     | [Storage Service](7_StorageServices)                                                | :x:                                            | :classical_building: Availability Zone                                             | -                                                                                                                                                                                                                                                                           |
[Amazon Elastic IP](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html)  | [Networking & Content Delivery Service](1_NetworkingAndContentDelivery)             | :white_check_mark:                             | :earth_americas: Regional                                                          | An Elastic IP address is a static IPv4 address designed for dynamic cloud computing.                                                                                                                                                                                        |
:star: [AWS Fargate ](4_ComputeServices/AWSFargate.md)                                       | [Compute Service](4_ComputeServices)                                                | :white_check_mark:                             | :earth_americas: Regional                                                          | Serverless compute for containers. <br/>- Compatible with both [EKS](4_ComputeServices/AmazonEKS.md) & [ECS](4_ComputeServices/AmazonECS/README.md) i.e. these services can run with Fargate as deployment option, instead of [EC2](4_ComputeServices/AmazonEC2/ReadMe.md). |
:star: [AWS Lambda](4_ComputeServices/AWSLambda/Readme.md)                                          | [Compute Service](4_ComputeServices)                                                | :white_check_mark:                             | :earth_americas: Regional                                                          | Run code without thinking about servers or clusters.                                                                                                                                                                                                                        |
:star: [Amazon ECS](4_ComputeServices/AmazonECS/README.md)                                   | [Container Orchestration Service](4_ComputeServices)                                | :white_check_mark:                             | :earth_americas: Regional                                                          | Full Managed [Container Orchestration Service](../1_HLDDesignComponents/0_SystemGlossaries/ContainerOrchestrationService.md) (Containers as a service).                                                                                                                     |
:star: [Amazon EKS](4_ComputeServices/AmazonEKS.md)                                          | [Container Orchestration Service](4_ComputeServices)                                | :white_check_mark:                             | :earth_americas: Regional                                                          | Fully managed [Kubernetes](../1_HLDDesignComponents/6_DevOps/Kubernates.md) service                                                                                                                                                                                         |
[Amazon RDS](6_DatabaseServices/AmazonRDS.md)                                                | [Database Service](6_DatabaseServices)                                              | :x:                                            | :classical_building: Availability Zone <br/>(Highly Available if Multi-AZ enabled) | Database management service for relational databases                                                                                                                                                                                                                        |
:star: [Amazon RDS Aurora](6_DatabaseServices/AmazonRDSAurora/Readme.md)                            | [Database Service](6_DatabaseServices)                                              | :x:                                            | :classical_building: Availability Zone <br/>(Highly Available if Multi-AZ enabled) | Database service for Postgres and MySQL ( faster & more reliable than RDS )                                                                                                                                                                                                 |
:star: [Amazon Elastic Cache](6_DatabaseServices/AmazonElasticCache.md)                      | [Database Service](6_DatabaseServices)                                              | :white_check_mark:                             | :earth_americas: Regional                                                          | Fully Managed [Redis & Memcache](../1_HLDDesignComponents/3_DatabaseComponents/In-Memory-Cache/Redis/README.md) service                                                                                                                                                     |
:star: [Amazon S3](7_StorageServices/AmazonS3.md)                                            | [Storage Service](7_StorageServices)                                                | :white_check_mark:                             | :globe_with_meridians: Global <br/>(but Data/Bucket is :earth_americas: Regional)  | [Object storage](https://www.netapp.com/data-storage/storagegrid/what-is-object-storage/) built to retrieve any amount of data from anywhere. <br/>- Cost effective & mostly used storage service in AWS.                                                                   |
:star: [Amazon Dynamo DB](6_DatabaseServices/AmazonDynamoDB/Readme.md)                       | [Database Service](6_DatabaseServices)                                              | :white_check_mark:                             | :earth_americas: Regional                                                          | Fully Managed NoSQL service                                                                                                                                                                                                                                                 |
:star: [Amazon SQS](5_MessageBrokerServices/AmazonSQS.md)                                    | [Message Broker Service](5_MessageBrokerServices)                                   | :white_check_mark:                             | :earth_americas: Regional                                                          | Fully Managed Message Queue Service                                                                                                                                                                                                                                         |
:star: [Amazon Event Bridge](5_MessageBrokerServices/AmazonEventBridge.md)                   | [Message Broker Service](5_MessageBrokerServices)                                   | :white_check_mark:                             | :earth_americas: Regional                                                          | Fully Managed Event Bus Service                                                                                                                                                                                                                                             |
:star: [Amazon CloudWatch](8_MonitoringServices/AmazonCloudWatch.md)                         | [Monitoring Service](8_MonitoringServices)                                          | :white_check_mark:                             | :earth_americas: Regional                                                          | To monitor AWS Resources & set Alarms                                                                                                                                                                                                                                       |
:star: [Amazon OpenSearch service](6_DatabaseServices/AmazonOpenSearch.md)                   | [Database Service](6_DatabaseServices)                                              | :white_check_mark:                             | :earth_americas: Regional                                                          | Successor to [Amazon ElasticSearch](../1_HLDDesignComponents/3_DatabaseComponents/Search-Engines/ElasticSearch) Service, includes built in OpenSearch Dashboard and Kibana.                                                                                                 |
[Amazon SNS](5_MessageBrokerServices/AmazonSNS.md)                                           | [Message Broker Service](5_MessageBrokerServices)                                   | :white_check_mark:                             | :earth_americas: Regional                                                          | Fully Managed Pub/Sub messaging, SMS, email, and mobile push notifications                                                                                                                                                                                                  |
[Amazon MQ](5_MessageBrokerServices/AmazonMQ.md)                                             | [Message Broker Service](5_MessageBrokerServices)                                   | :white_check_mark:                             | :earth_americas: Regional                                                          | Open Source ([ActiveMQ](../1_HLDDesignComponents/4_MessageBrokers/ActiveMQ.md), [RabbitMQ](../1_HLDDesignComponents/4_MessageBrokers/RabbitMQ.md)) Queue Migration service                                                                                                  |
[Amazon Kinesis](5_MessageBrokerServices/AmazonKinesis.md)                                   | [Message Broker Service](5_MessageBrokerServices)                                   | :white_check_mark:                             | :earth_americas: Regional                                                          | Easily collect, process, and analyze video and data streams in real time.                                                                                                                                                                                                   |
[Amazon Redshift](6_DatabaseServices/AmazonRedshift.md)                                      | [Data Warehouse Service](6_DatabaseServices)                                        | :white_check_mark:                             | :earth_americas: Regional                                                          | Fully Managed data warehouse service used in data analysis. (Postgres compatible querying layer)                                                                                                                                                                            |
[Amazon KeySpaces](6_DatabaseServices/AmazonKeySpaces.md)                                    | [Database Service](6_DatabaseServices)                                              | :white_check_mark:                             | :earth_americas: Regional                                                          | Fully Managed Service for [Apache Casandra](../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md)                                                                                                                                                |
[AWS WAF](2_SecurityAndIdentityServices/AWSWAF.md)                                           | [Security Service](2_SecurityAndIdentityServices)                                   | :white_check_mark:                             | :globe_with_meridians: Global                                                      | Web Application Firewall Service                                                                                                                                                                                                                                            |
[AWS Shield](2_SecurityAndIdentityServices/AWSShield.md)                                     | [Security Service](2_SecurityAndIdentityServices)                                   | :white_check_mark:                             | :earth_americas: Regional                                                          | DDOS Prevention Service                                                                                                                                                                                                                                                     |
[AWS Secrets Manager](2_SecurityAndIdentityServices/AWSSecretsManager.md)                    | [Security Service](2_SecurityAndIdentityServices)                                   | :white_check_mark:                             | :earth_americas: Regional                                                          | Easily rotate, manage and retrieve secrets throughout their lifecycle.                                                                                                                                                                                                      |
[AWS VPN](2_SecurityAndIdentityServices/AWSUsers&AccessMgmt/AWSVPN.md)                       | [Security Service](2_SecurityAndIdentityServices)                                   | :white_check_mark:                             | :earth_americas: Regional                                                          | Extend your on-premises networks to the cloud and securely access them from anywhere.                                                                                                                                                                                       |
[Amazon Cognito](2_SecurityAndIdentityServices/AmazonCognito.md)                             | [Security Service](2_SecurityAndIdentityServices)                                   | :white_check_mark:                             | :earth_americas: Regional                                                          | Users login/signin service.                                                                                                                                                                                                                                                 |
[Amazon EFS](7_StorageServices/AmazonEFS.md)                                                 | [Storage Service](7_StorageServices)                                                | :white_check_mark:                             | :earth_americas: Regional                                                          | Shared File Storage between [EC2 instances](4_ComputeServices/AmazonEC2/ReadMe.md)                                                                                                                                                                                          |
[Amazon CloudTrail](8_MonitoringServices/AWSCloudTrail.md)                                   | [Monitoring Service](8_MonitoringServices)                                          | :white_check_mark:                             | :earth_americas: Regional                                                          | To monitor [Amazon Route 53 API](1_NetworkingAndContentDelivery/AmazonRoute53.md) activities in AWS Account                                                                                                                                                                 |
[Amazon Config](8_MonitoringServices/AWSConfig.md)                                           | [Monitoring Service](8_MonitoringServices)                                          | :white_check_mark:                             | :earth_americas: Regional                                                          | To monitor Configration changes of AWS Resources                                                                                                                                                                                                                            |
[Amazon EMR](4_ComputeServices/AmazonEMR.md)                                                 | [Compute Service](4_ComputeServices)                                                | :white_check_mark:                             | :earth_americas: Regional                                                          | Fully Managed Service for [Apache Spark](../1_HLDDesignComponents/5_BigDataComponents/ApacheSpark.md)                                                                                                                                                                       |
[AWS Step Functions](4_ComputeServices/AWSStepFunctions.md)                                  | [Compute Service](4_ComputeServices)                                                | :white_check_mark:                             | :earth_americas: Regional                                                          | Low-code, visual workflow service.                                                                                                                                                                                                                                          |
[AWS Private Link](1_NetworkingAndContentDelivery/AWSPrivateLink.md)                         | [Networking & Content Delivery Service](1_NetworkingAndContentDelivery)             | :white_check_mark:                             | :earth_americas: Regional                                                          | Establish private connectivity between [Amazon VPC](1_NetworkingAndContentDelivery/AmazonVPC.md) and services hosted on AWS or on-premises, without exposing data to the internet.                                                                                          |
[AWS Elastic Beanstalk](https://aws.amazon.com/elasticbeanstalk/)                            | [AWS Infrastructure Automation](3_InfraAutomation)                                  | :white_check_mark:                             | :earth_americas: Regional                                                          | Servers Management - Easy to begin, Impossible to outgrow                                                                                                                                                                                                                   |
[Amazon WorkSpaces](https://aws.amazon.com/workspaces/)                                      | [End User Computing](https://aws.amazon.com/products/end-user-computing/)           | :white_check_mark:                             | :classical_building: Availability Zone                                             | Secure, reliable, and scalable access to persistent desktops from any location.                                                                                                                                                                                             |
[AWS Identity Center (successor to AWS SSO)](2_SecurityAndIdentityServices/AWSUsers&AccessMgmt/AWSIAMIdentityCenter.md) | [Security Service](2_SecurityAndIdentityServices)                                   | :white_check_mark:                             | :globe_with_meridians: Global                                                      | Centrally manage workforce access to multiple AWS accounts and applications.                                                                                                                                                                                                |
[AWS Organization](2_SecurityAndIdentityServices/AWSUsers&AccessMgmt/AWSOrganization.md)      | [Security Service](2_SecurityAndIdentityServices)                                   | :white_check_mark:                             | :globe_with_meridians: Global                                                      | Centrally manage your environment as you scale your AWS resources.                                                                                                                                                                                                          |

* [Utility services](https://stackoverflow.com/questions/33125790/why-some-services-are-called-aws-xxx-and-the-others-amazon-xxx) are prefixed with `AWS`, while standalone services are prefixed by `Amazon`.

# Source(s) and further reading
- [AWS Documentation Overview](https://aws.amazon.com/documentation-overview/)
- [AWS Interview Questions](https://www.simplilearn.com/tutorials/aws-tutorial/aws-interview-questions)
- [The Top 10 Most Used AWS Services](https://insider.ssi-net.com/insights/the-top-10-most-used-aws-services)
- [Is Amazon RDS for PostgreSQL or Amazon Aurora PostgreSQL a better choice for me?](https://aws.amazon.com/blogs/database/is-amazon-rds-for-postgresql-or-amazon-aurora-postgresql-a-better-choice-for-me/)