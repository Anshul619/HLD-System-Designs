
# Introduction

This repo contains the various system design components info, questions and solutions.
- :star: [System Estimation Tips](src/1_HLDDesignComponents/SystemEstimationTips.md)
- [System Design Tips](src/1_HLDDesignComponents/SystemDesignTips.md)
- [Key Components of Distributed Systems](#key-characteristics-of-distributed-systems)

# System Design - Tech Stack

<table>
  <tbody>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/2_APITechOptions/README.md">API Tech Options (or CDN)</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="/src/1_HLDDesignComponents/2_APITechOptions/REST.md" target="_blank">
                  <img src="https://www.snmpcenter.com/wp-content/uploads/2016/10/RESTful-API-logo-for-light-bg-600x205.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/2_APITechOptions/gRPC.md" target="_blank">
                  <img src="https://res.cloudinary.com/practicaldev/image/fetch/s--TNgs2Fd7--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/8susytd9w6lxe9sreqvd.jpg" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/2_APITechOptions/GraphQL.md" target="_blank">
                  <img src="https://marmelab.com/images/blog/graphql/logo.png" width="150">
                </a>
                <a href="/src/2_AWSComponents/1_NetworkingAndContentDelivery/AmazonCloudFront.md" target="_blank">
                  <img src="https://ericknavarro.io/images/thumbnails/12.png" width="150">
                </a>
            </div>
        </div>
      </td>
      <td rowspan=6 width="150px">
        <a href="src/2_AWSComponents">
          <img src="https://i.pinimg.com/originals/50/bd/c9/50bdc91f32650905e776d6751478928c.png">
        </a>
        <br/><br/>
        <a href="src/1_HLDDesignComponents/6_DevOps/Kubernates.md">
          <img src="https://logos-download.com/wp-content/uploads/2018/09/Kubernetes_Logo.png">
        </a>
        <br/><br/>
        <a href="src/1_HLDDesignComponents/6_DevOps/Docker.md">
          <img src="https://www.docker.com/wp-content/uploads/2022/03/vertical-logo-monochromatic.png">
        </a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis/README.md">In-Memory DBs/Cache</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="/src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis/README.md" target="_blank">
                  <img src="https://upload.wikimedia.org/wikipedia/en/6/6b/Redis_Logo.svg" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/AeroSpike.md" target="_blank">
                  <img src="https://aerospike.com/wp-content/uploads/2021/03/logo-4.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/4_MessageBrokers">Message brokers</a>
        <br><br>
        <a href="src/1_HLDDesignComponents/4_MessageBrokers/KafkaVsRabbitMQVsSQSVsSNS.md">Comparisons</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="/src/1_HLDDesignComponents/4_MessageBrokers/Kafka.md" target="_blank">
                  <img src="http://i1.wp.com/airisdata.com/wp-content/uploads/2016/01/kafka-logo-600x390.jpg?resize=600%2C390" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/4_MessageBrokers/RabbitMQ.md" target="_blank"><img src="https://www.logo.wine/a/logo/RabbitMQ/RabbitMQ-Logo.wine.svg" width="150"></a>
                <a href="/src/2_AWSComponents/5_MessageBrokerServices/AmazonSQS.md" target="_blank"><img src="https://i0.wp.com/blog.knoldus.com/wp-content/uploads/2021/09/sqs.png?w=711&ssl=1" width="150"></a>
                <a href="/src/2_AWSComponents/5_MessageBrokerServices/AmazonSNS.md" target="_blank"><img src="https://miro.medium.com/max/720/0*QjKNs9dEShlQ39VI.png" width="150"></a>
                <a href="/src/1_HLDDesignComponents/4_MessageBrokers/ActiveMQ.md" target="_blank"><img src="https://cdn.icon-icons.com/icons2/2699/PNG/512/apache_activemq_logo_icon_168628.png" width="150"></a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/5_BigDataComponents">BigData Compute Engines</a>
        <br><br>
        <a href="src/1_HLDDesignComponents/5_BigDataComponents/ApacheSparkVsHadoopMapReduce.md">Comparisons</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="/src/1_HLDDesignComponents/5_BigDataComponents/ApacheSpark.md" target="_blank">
                  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Apache_Spark_logo.svg/1200px-Apache_Spark_logo.svg.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/5_BigDataComponents/ApacheStorm.md" target="_blank">
                  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Apache_Storm_logo.svg/1200px-Apache_Storm_logo.svg.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/5_BigDataComponents/ApacheHadoop" target="_blank">
                  <img src="http://viloratech.com/images/course_images_banner/20908.jpg" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/3_DatabaseComponents/ReadMe.md" target="_blank">Databases</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md" target="_blank">
                  <img src="https://fontslogo.com/wp-content/uploads/2018/12/Apache-Cassandra-Logo-Font.jpg" width="150">
                </a>
                <a href="src/2_AWSComponents/6_DatabaseServices/AmazonDynamoDB.md">
                  <img src="https://www.magnitude.com/assets/images/Logos/Data-connector-logos/edit_dynamodb.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ElasticSearch/Readme.md" target="_blank">
                  <img src="https://miro.medium.com/max/1200/1*20yTn7K6c6vcmEdgwAgjSA.png" width="150"></a>
                <a href="/src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/MongoDB" target="_blank">
                  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/MongoDB_Logo.svg/2560px-MongoDB_Logo.svg.png" width="150"></a>
                <a href="/src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheHBase.md" target="_blank">
                  <img src="https://hbase.apache.org/images/hbase_logo_with_orca_large.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/5_BigDataComponents/ApacheHadoop/ApacheHDFS.md" target="_blank">
          Storage Services (Files, Images etc.)
        </a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="src/2_AWSComponents/7_StorageServices/AmazonS3.md" target="_blank">
                  <img src="https://www.freecodecamp.org/news/content/images/size/w2000/2020/08/Screenshot-2020-08-10-at-6.26.31-PM.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/5_BigDataComponents/ApacheHadoop/ApacheHDFS.md" target="_blank">
                  <img src="https://intellipaat.com/mediaFiles/2015/07/hadoop-hdfs.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/7_MonitoringTools/">Monitoring Services</a>
      </td>
      <td>
        <a href="src/1_HLDDesignComponents/7_MonitoringTools/NewRelic.md">
          <img src="https://www.vectorlogo.zone/logos/newrelic/newrelic-ar21.svg" width="150">
        </a>
        <a href="src/1_HLDDesignComponents/7_MonitoringTools/ELK.md">
          <img src="https://miro.medium.com/max/746/1*DbdVXy9_6uJVe8q1NOYVfg.png" width="150">
        </a>
        <br/><br/>
      </td>
    </tr>
  </tbody>
</table>

# HLD - Design Problems

| Problem                                                                                                                                                                                     | Main Components                                                                                                                                                                                                                                                                                                                                                                                                                       |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [Zomoto HLD Design](src/3_HLDDesignProblems/ZomatoDesign/README.md)                                                                                                                  | -                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| :star: [Uber Driver Allocation](src/3_HLDDesignProblems/UberDriverAllocationDesign/README.md)                                                                                               | -                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| :star: [AWS - Design a system that scales to million of users on AWS](src/2_AWSComponents/0_AWSDesigns/DesignScalableSystemWithRDMS)                                                        | -                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| :star: [Personalization at Spotify using Casandra](src/3_HLDDesignProblems/PersonalizationSpotify)                                                                                          | -                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| [AWS - Design Multi-Region Active-Active Architecture On AWS](src/2_AWSComponents/0_AWSDesigns/DesignMultiRegionActiveActiveArchitectureOnAWS)                                              | -                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| [Rate Limiter API](src/3_HLDDesignProblems/RateLimiterAPI)                                                                                                                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [Distributed Logging Solution](src/3_HLDDesignProblems/LoggingSolution)                                                                                                                     | [Kafka](src/1_HLDDesignComponents/4_MessageBrokers/Kafka.md), [Elastic Search](src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ElasticSearch/Readme.md), [ELK](src/1_HLDDesignComponents/7_MonitoringTools/ELK.md)                                                                                                                                                                                                     |
| [Search - Make My Trip](src/3_HLDDesignProblems/MakeMyTripSearch)                                                                                                                           |                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [URL Shortening Service](src/3_HLDDesignProblems/URLShorteningService/README.md)                                                                                                            |                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [Dropbox Design](src/3_HLDDesignProblems/DropboxDesign)                                                                                                                                     |                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [Instagram Design](src/3_HLDDesignProblems/InstagramDesign)                                                                                                                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [Sales Rank By Category](src/3_HLDDesignProblems/SalesRankByCategory)                                                                                                                       |                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [Servers Health System Design](src/3_HLDDesignProblems/ServersHealthSystemDesign)                                                                                                           |                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [YouTube Video Streaming](src/3_HLDDesignProblems/YouTubeVideoStreaming)                                                                                                                    |                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [How Uber Manages a Million Writes Per Second Using Mesos and Cassandra Across Multiple Datacenters?](src/3_HLDDesignProblems/UberCasandraMesos)                                            |                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [AWS - Dropbox Saves Millions by Building a Scalable Metadata Store (for AuditLog Data) on Amazon DynamoDB and Amazon S3](src/2_AWSComponents/0_AWSDesigns/DropboxAmazonDynamoDB/Readme.md) |                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [AWS - Implementing Microservices on AWS](src/2_AWSComponents/0_AWSDesigns/MicroservicesOnAWS.md)                                                                                           |                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [Twillo Send Message API (business customers, high throughput)](src/3_HLDDesignProblems/TwilloSendMessageAPI)                                                                               | [Kafka](src/1_HLDDesignComponents/4_MessageBrokers/Kafka.md), [Redis](src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis/README.md), [Casandra](src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md), [Amazon DynamoDB](src/2_AWSComponents/6_DatabaseServices/AmazonDynamoDB.md)                                                                                                      |
| [AWS - Send-SMS-API design (App Internal Clients, Multiple SMS-Providers, AutoScaling)](src/3_HLDDesignProblems/NotificationSystem/README.md)                                               | [Amazon SQS](src/2_AWSComponents/5_MessageBrokerServices/AmazonSQS.md), [Amazon Load Balancer](src/2_AWSComponents/4_ComputeServices/EC2/AWSEC2AutoScaling.md), [Amazon Load Balancer](src/2_AWSComponents/1_NetworkingAndContentDelivery/ElasticLoadBalancer.md), [Amazon WAF](src/2_AWSComponents/2_SecurityAndIdentityServices/AWSWAF.md), [Redis](src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis/README.md) |
| [AWS - Deploy WordPress Site with Amazon Cloudfront & S3](src/2_AWSComponents/0_AWSDesigns/WPSiteCloudFront&S3.md)                                                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| [AWS - Fanout Pattern using Amazon SQS and SNS](src/2_AWSComponents/0_AWSDesigns/FanoutPatternSNSSQS.md)                                                                                    | [Amazon SQS](src/2_AWSComponents/5_MessageBrokerServices/AmazonSQS.md), SNS                                                                                                                                                                                                                                                                                                                                                           |

# Key Characteristics of Distributed Systems

| Basis                                                                                                                               | Applicable Components              |
|-------------------------------------------------------------------------------------------------------------------------------------|------------------------------------|
| :star: [Efficiency - Latency, Throughput](src/1_HLDDesignComponents/0_SystemGlossaries/LatencyThroughput.md)                        | ALL                                |
| :star: [Scalability](src/1_HLDDesignComponents/0_SystemGlossaries/Scalability.md)                                                   | ALL                                |
| :star: [High Availability](src/1_HLDDesignComponents/0_SystemGlossaries/HighAvailability.md)                                        | ALL                                |
| :star: [Servers Cluster](src/1_HLDDesignComponents/0_SystemGlossaries/ServersCluster.md)                                            | `Data Stores` or `Message Brokers` |
| :star: [Event Driven Architecture](src/1_HLDDesignComponents/0_SystemGlossaries/EventDrivenArchitecture.md)                         | `Message Brokers`                  |
| :star: [ACID Properties of the Transaction](src/1_HLDDesignComponents/0_SystemGlossaries/ACIDPropertyTransaction.md)                | `Data Stores`                      |
| :star: [CAP Theorem of the Distributed Systems](src/1_HLDDesignComponents/0_SystemGlossaries/CAPTheorem.md)                         | `Data Stores`                      |
| :star: [Replication & Data Consistency](src/1_HLDDesignComponents/0_SystemGlossaries/ReplicationAndDataConsistency.md)              | `Data Stores`                      |
| [MicroServices - Modern SOA Architecture](src/1_HLDDesignComponents/1_MicroServicesSOA)                                             | ALL                                |
| [Reliability - Fault Tolerance, Disaster Recovery](src/1_HLDDesignComponents/0_SystemGlossaries/FaultTolerance&DisasterRecovery.md) | ALL                                |
| [Load Balancer](src/1_HLDDesignComponents/0_SystemGlossaries/LoadBalancer.md)                                                       | ALL                                |
| [Atomicity](src/1_HLDDesignComponents/0_SystemGlossaries/Atomicity.md)                                                              | `Data Stores`                      |
| [Durability](src/1_HLDDesignComponents/0_SystemGlossaries/Durability.md)                                                            | `Data Stores`                      |
| [Content Delivery Network (CDN)](src/1_HLDDesignComponents/0_SystemGlossaries/CDNs.md)                                              | `Static Content`                   |
| [Append Only DB Storages](src/1_HLDDesignComponents/0_SystemGlossaries/AppendOnlyDBStorages.md)                                     | `Data Stores`                      |

# OOP Design & Problems (LLD)
- :star: [OOP Design](src/4_ObjectOrientedDesign/OOP.md)
- :star: [SOLID Principles](src/4_ObjectOrientedDesign/SOLID.md)
- :star: [Design Tips & Techniques](src/4_ObjectOrientedDesign/TipsAndTechniques.md)
- :star: [Design Patterns](src/4_ObjectOrientedDesign/DesignPatterns)
- [DRY Principle](src/4_ObjectOrientedDesign/DRY.md)
- [Design Problems](src/4_ObjectOrientedDesign/OOPDesignProblems)
  - [Chess Game](src/4_ObjectOrientedDesign/OOPDesignProblems/ChessGame)
  - [Parking Lot](src/4_ObjectOrientedDesign/OOPDesignProblems/ParkingLot)
  - [Snack & Ladder Game](src/4_ObjectOrientedDesign/OOPDesignProblems/SnackAndLadderGame)
  - [Book My Show](src/4_ObjectOrientedDesign/OOPDesignProblems/BookMyShow)
  - [Car Rental System](src/4_ObjectOrientedDesign/OOPDesignProblems/CarRentalSystem)
  - [Vendor Machine](src/4_ObjectOrientedDesign/OOPDesignProblems/VendingMachine)
  - [Hotel Booking System](src/4_ObjectOrientedDesign/OOPDesignProblems/HotelBookingSystem)
  - [Insurance Agent Flow](src/4_ObjectOrientedDesign/OOPDesignProblems/Others/InsuranceAgentFlow.md)

# Programming Languages
- :star: [GoLang](src/5_ProgrammingLanguages/1_GoLang)
- [Spring Boot & Microservices](src/5_ProgrammingLanguages/2_Java/SpringBootAndMicroServices)
- [Java](src/5_ProgrammingLanguages/2_Java)
- [Hibernate](src/5_ProgrammingLanguages/2_Java/Hibernate.md)
- [JavaScript](src/5_ProgrammingLanguages/3_JavaScript)
- [TypeScript](src/5_ProgrammingLanguages/4_FrontEnd/TypeScript.md)
- [Angular8](src/5_ProgrammingLanguages/4_FrontEnd/Angular8.md)

# Other Components
- :star: [Apache Zookeeper](src/1_HLDDesignComponents/6_DevOps/ApacheZookeeper.md)
- :star: [Open Source Contributions](src/1_HLDDesignComponents/OpenSourceContributions.md)
- [Apache Marathon & Mesos](src/1_HLDDesignComponents/6_DevOps/ApacheMarathon&Mesos.md)
- [Apache Yarn](src/1_HLDDesignComponents/6_DevOps/ApacheYarn.md)
- [Apache Web Server](https://apache.org/)
  - Web Server which can handle 512 concurrent requests.
- [Testing](src/6_Others/QATools/Readme.md)

# Source(s) and further reading
- [System Design Primer](https://github.com/donnemartin/system-design-primer)
- [Grokking the System Design](https://www.educative.io/courses/grokking-the-system-design-interview/39RwZr5PBwn)
- [System Design by Gaurav Sen](https://www.youtube.com/watch?v=xpDnVSmNFX0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX)
- [Benchmarking Apache Kafka, Apache Pulsar, and RabbitMQ: Which is the Fastest?](https://www.confluent.io/blog/kafka-fastest-messaging-system/)
- [System Design - Interview Questions](https://leetcode.com/discuss/interview-question/system-design?currentPage=1&orderBy=hot&query=)
