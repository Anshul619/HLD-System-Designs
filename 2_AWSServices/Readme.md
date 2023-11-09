# Amazon Web Services

# Services, Best Practice

| List                                                                | Description                                                                                                                                                                                                                                                                                                                             |
|---------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [AWS - All comparisons list b/w Services](AWS-All-Comparisons.md)   | Comparisons between different services in AWS.                                                                                                                                                                                                                                                                                          |                                                                                                                                                                                                                                                                                                                                         |
| [AWS - All Services List](AWS-All-Services-List.md)                 | List of all services in AWS.                                                                                                                                                                                                                                                                                                            |
| [Maintain resiliency](AWS-Global-Architecture-Region-AZ.md)         | A well-known best practice for cloud architecture is to use [Region-scoped, managed services](AWS-Global-Architecture-Region-AZ.md)<br/>- At a minimum, you should use two AZs.<br/>- [AWS](https://docs.aws.amazon.com) manages its [global architecture through region and availability zones](AWS-Global-Architecture-Region-AZ.md). |
| [AWS Well-Architected Framework](AWS-Well-Architected-Framework.md) | [AWS Well-Architected](https://aws.amazon.com/architecture/well-architected) helps cloud architects build secure, high-performing, resilient, and efficient infrastructure for a variety of applications and workloads.                                                                                                                 |
| [Serverless Architecture](AWS-Serverless-Architecture.md)           | AWS provides easily managed [serverless architecture](AWS-Serverless-Architecture.md).                                                                                                                                                                                                                                                  |
| [Fully Managed Services](AWS-Fully-Managed-Services.md)             |                                                                                                                                                                                                                                                                                                                                         |

# System Designs

## Design Scalable System on AWS

![img.png](../0_HLDUseCasesProblems/AWS_DesignScalableSystemWithRDMS/DesignScalableSystemWithRelationalDBOnAWS.drawio.png)

[Read more](../0_HLDUseCasesProblems/AWS_DesignScalableSystemWithRDMS/Readme.md)

## Design Multi-Region Active-Active Architecture On AWS

![img.png](../0_HLDUseCasesProblems/AWS_DesignMultiRegionActiveActiveArchitecture/AWS-Multi-Region-AZ-HA.drawio.png)

[Read more](../0_HLDUseCasesProblems/AWS_DesignMultiRegionActiveActiveArchitecture/Readme.md)

## Bookstore app on AWS

![](../0_HLDUseCasesProblems/AWS_BookStoreSampleApp/AWS-Bookstore-Demo-App.png)

[Read more](../0_HLDUseCasesProblems/AWS_BookStoreSampleApp/Readme.md)

## Modern Data Architecture on AWS

![](../0_HLDUseCasesProblems/AWS_ModernDataArchitecture/AWS-Data-Architecture-ETL-OLTP-OLAP-DataLake.png)

[Read more](../0_HLDUseCasesProblems/AWS_ModernDataArchitecture/Readme.md)

## Click Stream Analytics on AWS

![](../0_HLDUseCasesProblems/AWS_ClickStreamAnalytics/AWSClickStreamAnalytic.png)

[Read more](../0_HLDUseCasesProblems/AWS_ClickStreamAnalytics/Readme.md)

## Upload Image using Amazon S3 and Lambda

![](../0_HLDUseCasesProblems/AWS_DesignUploadImageLambdaS3/UploadImage-Lambda.drawio.png)

[Read more](../0_HLDUseCasesProblems/AWS_DesignUploadImageLambdaS3/Readme.md)

## Others
- [Send-SMS-API design - App Internal Clients, Multiple SMS-Providers, AutoScaling](../0_HLDUseCasesProblems/TransactionSMSDesign/Readme.md)
- [WP Site with Amazon CloudFront & S3](../0_HLDUseCasesProblems/AWSWebsiteSiteUsingCloudFront&S3.md)
- [Dropbox Saves Millions by Building a Scalable Metadata Store on Amazon DynamoDB and Amazon S3](../1_TechStacksRealApps/Dropbox/DropboxMetaDataStore.md)

# AWS Services - Architecture, Features etc.

<table>
  <tbody>
     <tr>
      <td>
        <a href="1_NetworkingAndContentDelivery">DNS Service, Service Discovery</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div>
                <a href="1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonRoute53/Readme.md" target="_blank">
                  <img src="https://storage.googleapis.com/yama-blog.appspot.com/1/2018/08/eyecatch-route53.png" width="150">
                </a>
                <a href="1_NetworkingAndContentDelivery/2_ApplicationNetworking/AWSCloudMap.md" target="_blank">
                  <img src="https://landscape.cncf.io/logos/aws-cloud-map.svg" width="150">
                </a>
            </div>
        </div>
      </td>
       <td rowspan=16 width="150px">
            <a href="9_InfrastructureAsCode/AWSCloudFormation/Readme.md" target="_blank">
              <img src="https://i0.wp.com/www.australtech.net/wp-content/uploads/2019/05/cloudformation-logo.png" width="400">
            </a>
        </td>
    </tr>
    <tr>
        <td>
            <a href="2_SecurityAndIdentityServices">User Management & Security Services</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="2a_IdentityServices/AWSIAM/Readme.md" target="_blank">
                  <img src="https://i0.wp.com/sra.io/wp-content/uploads/2020/01/AWS-IAM-Exploitation.png?fit=1102%2C620&ssl=1" width="150">
                </a>
                <a href="2c_SecurityServices/2_InfraProtectionServices/AWSShield.md" target="_blank">
                  <img src="https://d33wubrfki0l68.cloudfront.net/de9af514e658d43b6f0b24dc5f063c67df7b394c/82078/images/aws/00-icons/shield.png" width="150">
                </a>
                <a href="2c_SecurityServices/2_InfraProtectionServices/AWSWAF.md" target="_blank">
                  <img src="https://www.trinimbus.com/wp-content/uploads/2016/12/Get-The-Last-WAF-with-AWS-Web-Application-Firewall.jpg" width="150">
                </a>
                <a href="2a_IdentityServices/AWSDirectory/AmazonCognito.md" target="_blank">
                  <img src="https://quintagroup.com/blog/amazon-cognito/@@download/image/Amazon%20Cognito.jpg" width="150">
                </a>
                <a href="2c_SecurityServices/1_DataProtectionServices/AWSSystemManager.md" target="_blank">
                  <img src="https://digitalcloud.training/wp-content/uploads/2022/01/AWS-Systems-Manager.jpg" width="150">
                </a>
                <a href="2c_SecurityServices/1_DataProtectionServices/AWSSecretsManager.md" target="_blank">
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
                <a href="1_NetworkingAndContentDelivery/3_NetworkFoundationsVPC/Readme.md" target="_blank">
                  <img src="https://uxwing.com/wp-content/themes/uxwing/download/brands-and-social-media/aws-vpc-icon.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="1_NetworkingAndContentDelivery">CDN - Static Content (Image, Videos etc.)</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div>
                <a href="1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonCloudFront.md" target="_blank">
                  <img src="https://ericknavarro.io/images/thumbnails/12.png" width="400">
                </a>
                <a href="7_StorageServices/3_ObjectStorageS3/Readme.md" target="_blank">
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
                <a href="1_NetworkingAndContentDelivery/2_ApplicationNetworking/AmazonAPIGateway/Readme.md" target="_blank">
                  <img src="https://www.prolim.com/wp-content/uploads/2019/09/amazon-api-gatewat-1.jpg" width="150">
                </a>
                <a href="1_NetworkingAndContentDelivery/2_ApplicationNetworking/ElasticLoadBalancer/Readme.md" target="_blank">
                  <img src="https://static.wixstatic.com/media/e37c27_65bd886d7d284196a495daa7b2582486~mv2.png/v1/fill/w_560,h_560,al_c,lg_1,q_85,enc_auto/e37c27_65bd886d7d284196a495daa7b2582486~mv2.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
        <td>
            <a href="3_ComputeServices">Compute Services</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="3_ComputeServices/AmazonEC2/Readme.md" target="_blank">
                  <img src="https://miro.medium.com/max/750/1*q6F0j8HFHd8jeYXyQBqrCQ.jpeg" width="150">
                </a>
                <a href="3_ComputeServices/AWSFargate.md" target="_blank">
                  <img src="https://miro.medium.com/v2/resize:fit:786/format:webp/1*BCgeXMygZAH_xXzKG8vvQQ.png" width="100">
                </a>
                <a href="3_ComputeServices/AWSLambda/Readme.md" target="_blank">
                  <img src="https://www.brcline.com/wp-content/uploads/2021/09/aws-lambda-logo.png" width="150">
                </a>
                <a href="3_ComputeServices/AWSStepFunctions.md" target="_blank">
                  <img src="https://miro.medium.com/max/1280/1*vHv5ARJ-CP89si8-FBsFnw.webp" width="150">
                </a>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <a href="4_ContainerOrchestrationServices">Container Orchestration Services</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="4_ContainerOrchestrationServices/AmazonECS/Readme.md" target="_blank">
                  <img src="https://i0.wp.com/miro.medium.com/max/626/1*RmiGt6GAWf4pkO9ohOnRaQ.png?w=810&ssl=1" width="150">
                </a>
                <a href="4_ContainerOrchestrationServices/AmazonEKS.md" target="_blank">
                  <img src="https://d2908q01vomqb2.cloudfront.net/fc074d501302eb2b93e2554793fcaf50b3bf7291/2020/10/15/Kubernetes-control-plane.png" width="150">
                </a>
                <a href="4_ContainerOrchestrationServices/AmazonECR.md" target="_blank">
                  <img src="https://speedmedia.jfrog.com/08612fe1-9391-4cf3-ac1a-6dd49c36b276/https://media.jfrog.com/wp-content/uploads/2022/11/23145958/6053d4dc2f6c53160a53d407_linux-container-updates-iot.png/mxw_2256,s_webp,f_auto" width="150">
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
                <a href="6_DatabaseServices/AmazonElasticCache/Readme.md" target="_blank">
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
                <a href="5_MessageBrokerServices/AmazonSQS/Readme.md" target="_blank">
                  <img src="https://i0.wp.com/blog.knoldus.com/wp-content/uploads/2021/09/sqs.png?w=711&ssl=1" width="150">
                </a>
                <a href="5_MessageBrokerServices/AmazonEventBridge.md" target="_blank">
                  <img src="https://user-images.githubusercontent.com/3268013/149550617-d92fa8ff-f95d-499c-8515-0ed0be976fbf.png" width="150">
                </a>
                <a href="5_MessageBrokerServices/AmazonSNS.md" target="_blank">
                  <img src="https://miro.medium.com/max/720/0*QjKNs9dEShlQ39VI.png" width="150">
                </a>
                <a href="5_MessageBrokerServices/AmazonMSK.md" target="_blank">
                  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcjocd4vh1S29xvfJ_bjgJWb-SR5SzW2Dz2A&usqp=CAU" width="100">
                </a>
                <a href="5_MessageBrokerServices/AmazonKinesis/AmazonKinesisDataStreams.md" target="_blank">
                  <img src="https://intellipaat.com/blog/wp-content/uploads/2022/08/image-75.png" width="100">
                </a>
                <a href="5_MessageBrokerServices/AmazonMQ.md" target="_blank">
                  <img src="https://res.cloudinary.com/practicaldev/image/fetch/s--UbYwdyFm--/c_imagga_scale,f_auto,fl_progressive,h_420,q_auto,w_1000/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/n1uck9jt481r6rcezx57.png" width="150">
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
                <a href="6_DatabaseServices/AmazonRDS/AmazonAurora/Readme.md" target="_blank">
                  <img src="https://allcode.com/wp-content/uploads/2022/12/Amazon-Aurora.jpg" width="150">
                </a>
                <a href="6_DatabaseServices/AmazonRDS/Readme.md" target="_blank">
                  <img src="https://imgs.search.brave.com/I-r9RUsyB0nINGezC2IqUtOkzG21nqHgAFbJOP2tqXU/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9icmFu/ZHNsb2dvcy5jb20v/d3AtY29udGVudC91/cGxvYWRzL2ltYWdl/cy9hd3MtcmRzLWxv/Z28ucG5n" width="50">
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
                <a href="7_StorageServices/3_ObjectStorageS3/Readme.md" target="_blank">
                  <img src="https://miro.medium.com/max/580/1*DHe24MbDHtbkOeIJzxrfdA.png" width="150">
                </a>
                <a href="7_StorageServices/1_BlockStorageTypes/AmazonEBS/Readme.md" target="_blank">
                  <img src="https://res.cloudinary.com/practicaldev/image/fetch/s--8aZcKXVD--/c_imagga_scale,f_auto,fl_progressive,h_900,q_auto,w_1600/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/gt28cinem50gms9dntqk.jpeg" width="150">
                </a>
                <a href="7_StorageServices/2_FileStorageTypes/AmazonEFS.md" target="_blank">
                  <img src="https://www.justaftermidnight247.com/wp-content/uploads/2020/09/EFS-logo.jpg" width="150">
                </a>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <a href="10_BigDataServices/StorageDBs">Data Warehousing</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="10_BigDataServices/StorageDBs/DataWarehouse/AmazonRedshift.md" target="_blank">
                  <img src="https://w7.pngwing.com/pngs/404/507/png-transparent-amazon-com-amazon-redshift-amazon-web-services-amazon-relational-database-service-amazon-elasticache-amazon-redshift-blue-angle-text.png" width="150">
                </a>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <a href="10_BigDataServices/ETLServices/BatchProcessing">Batch Processing</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="10_BigDataServices/ETLServices/BatchProcessing/AmazonEMR.md" target="_blank">
                  <img src="https://www.clipartmax.com/png/small/70-700800_amazon-emr.png" width="80">
                </a>
            </div>
        </td>
    </tr>
    <tr>
        <td>
            <a href="10_BigDataServices/ETLServices/StreamProcessing">Stream Processing</a>
        </td>
        <td>
            <div class="container" style="background:white">
                <a href="10_BigDataServices/ETLServices/StreamProcessing/AmazonKinesis.md" target="_blank">
                  <img src="https://miro.medium.com/max/1190/0*UQBKjEff1uIsXH8W" width="80">
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
                <a href="8_MonitoringServices/AmazonCloudWatch/Readme.md" target="_blank">
                  <img src="https://miro.medium.com/max/800/1*ffbynFsxn43lPdne2kaHMQ.png" width="150">
                </a>
                <a href="8_MonitoringServices/AWSXRay.md" target="_blank">
                  <img src="https://miro.medium.com/max/960/1*kHVLIuXPyE0HAEO0HZ6kwg.webp" width="150">
                </a>
                <a href="8_MonitoringServices/AWSCloudTrail.md" target="_blank">
                  <img src="https://i0.wp.com/blog.knoldus.com/wp-content/uploads/2022/02/feature.png?w=360&ssl=1" width="150">
                </a>
            </div>
        </td>
    </tr>
  </tbody>
</table>

# Terminologies
- [Utility services](https://stackoverflow.com/questions/33125790/why-some-services-are-called-aws-xxx-and-the-others-amazon-xxx) are prefixed with `AWS`, while standalone services are prefixed by `Amazon`.
- [Amazon Resouce Name (ARN)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) uniquely identify AWS resources and publicly accessible.

# Source(s) and further reading
- [AWS Documentation Overview](https://aws.amazon.com/documentation-overview/)
- [AWS Interview Questions](https://www.simplilearn.com/tutorials/aws-tutorial/aws-interview-questions)
- [The Top 10 Most Used AWS Services](https://insider.ssi-net.com/insights/the-top-10-most-used-aws-services)
- [Various AWS Instances Comparisons](https://instances.vantage.sh/)
- [Introduction to AWS Services](https://www.youtube.com/watch?v=Z3SYDTMP3ME)
- [Microservices On AWS](https://docs.aws.amazon.com/whitepapers/latest/microservices-on-aws/microservices-on-aws.html)