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
| [Reliability - Fault Tolerance, Disaster Recovery](src/1_HLDDesignComponents/0_SystemGlossaries/FaultTolerance&DisasterRecovery.md) | ALL                                |
| [Load Balancer](src/1_HLDDesignComponents/0_SystemGlossaries/LoadBalancer.md)                                                       | ALL                                |
| [Atomicity](src/1_HLDDesignComponents/0_SystemGlossaries/Atomicity.md)                                                              | `Data Stores`                      |
| [Durability](src/1_HLDDesignComponents/0_SystemGlossaries/Durability.md)                                                            | `Data Stores`                      |
| [Content Delivery Network (CDN)](src/1_HLDDesignComponents/0_SystemGlossaries/CDNs.md)                                              | `Static Content`                   |
| [Append Only DB Storages](src/1_HLDDesignComponents/0_SystemGlossaries/AppendOnlyDBStorages.md)                                     | `Data Stores`                      |

This repo contains the various system design components info, questions and solutions.
- :star: [AWS Components](src/2_AWSComponents)
- :star: [System Estimation Tips](src/1_HLDDesignComponents/SystemEstimationTips.md)
- [System Design Tips](src/1_HLDDesignComponents/SystemDesignTips.md)
- [MicroServices - Modern SOA Architecture](src/1_HLDDesignComponents/1_MicroServicesSOA)
- [Open Source Contributions](src/1_HLDDesignComponents/OpenSourceContributions.md)
- [Other Glossaries](src/1_HLDDesignComponents/0_SystemGlossaries/README.md)

# HLD Components

<table>
  <tbody>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis/README.md">In-Memory DBs/Cache</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="/src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/Redis" target="_blank">
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
                <a href="/src/1_HLDDesignComponents/5_BigDataComponents/ApacheHadoop" target="_blank">
                  <img src="https://miro.medium.com/max/1400/0*xEggq2GoZSUT9AG6.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/5_BigDataComponents/ApacheStorm.md" target="_blank">
                  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/Apache_Storm_logo.svg/1200px-Apache_Storm_logo.svg.png" width="150">
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
        <a href="src/1_HLDDesignComponents/5_BigDataComponents/ApacheHadoop/ApacheHDFS.md" target="_blank">Storage Services</a>
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
  </tbody>
</table>

# API Technology Options

| API Option                                                         | Description                                                                                                                                                                 |
|--------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| :star: [REST](src/1_HLDDesignComponents/2_APITechOptions/REST.md)  | Used for CRUD style public APis and web app.                                                                                                                                |
| :star: [gPRC](src/1_HLDDesignComponents/2_APITechOptions/gPRC.md)  | Used for communication b/w [microservices](src/1_HLDDesignComponents/1_MicroServicesSOA) or to collect data from IoT devices. It is relatively faster than REST or GraphQL. |
| [GraphQL](src/1_HLDDesignComponents/2_APITechOptions/GraphQL.md)   | Used for public API with customizable request body or to aggregate internal data from multiple sources in a public API.                                                     |

# HLD - Design Problems
- :star: [Zomoto HLD Design](src/3_HLDDesignProblems/ZomatoDesign/README.md)
- :star: [Uber Driver Allocation](src/3_HLDDesignProblems/UberDriverAllocationDesign/README.md)
- :star: [Design a system that scales to million of users on AWS](src/2_AWSComponents/0_AWSDesigns/DesignScalableSystemWithRDMS)
- :star: [Personalization at Spotify using Casandra](src/3_HLDDesignProblems/PersonalizationSpotify)
- [Twillo Send Message API](src/3_HLDDesignProblems/TwilloSendMessageAPI)
- [Rate Limiter API](src/3_HLDDesignProblems/RateLimiterAPI)
- [Notification System](src/3_HLDDesignProblems/NotificationSystem)
- [Logging Solution](src/3_HLDDesignProblems/LoggingSolution)
- [MakeMyTrip Search](src/3_HLDDesignProblems/MakeMyTripSearch)
- [URL Shortening Service](src/3_HLDDesignProblems/URLShorteningService)

# [OOP Design & Problems](src/4_ObjectOrientedDesign)
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

# [Programming Languages](src/5_ProgrammingLanguages)
- :star: [GoLang](src/5_ProgrammingLanguages/1_GoLang)
- [Spring Boot & Microservices](src/5_ProgrammingLanguages/2_Java/SpringBootAndMicroServices)
- [Hibernate](src/5_ProgrammingLanguages/2_Java/Hibernate.md)
- [Java](src/5_ProgrammingLanguages/2_Java)
- [Hibernate](src/5_ProgrammingLanguages/2_Java/Hibernate.md)
- [JavaScript](src/5_ProgrammingLanguages/3_JavaScript)
- [TypeScript](src/5_ProgrammingLanguages/4_FrontEnd/TypeScript.md)
- [Angular8](src/5_ProgrammingLanguages/4_FrontEnd/Angular8.md)

# DevOps Components
- :star: [Kubernates](src/1_HLDDesignComponents/6_DevOps/Kubernates.md)
- :star: [Docker](src/1_HLDDesignComponents/6_DevOps/Docker.md)
- :star: [Apache Zookeeper](src/1_HLDDesignComponents/6_DevOps/ApacheZookeeper.md)
- [Apache Marathon & Mesos](src/1_HLDDesignComponents/6_DevOps/ApacheMarathon&Mesos.md)
- [Apache Yarn](src/1_HLDDesignComponents/6_DevOps/ApacheYarn.md)

# Monitoring Tools
- :star: [New Relic](src/1_HLDDesignComponents/7_MonitoringTools/NewRelic.md)
- [ELK](src/1_HLDDesignComponents/7_MonitoringTools/ELK.md)

# Other Design Components
- [Apache Web Server](https://apache.org/)
  - Web Server which can handle 512 concurrent requests.
- [Testing](src/6_Others/QATools/Readme.md)

# Source(s) and further reading
- [System Design Primer](https://github.com/donnemartin/system-design-primer)
- [Grokking the System Design](https://www.educative.io/courses/grokking-the-system-design-interview/39RwZr5PBwn)
- [System Design by Gaurav Sen](https://www.youtube.com/watch?v=xpDnVSmNFX0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX)
- [Benchmarking Apache Kafka, Apache Pulsar, and RabbitMQ: Which is the Fastest?](https://www.confluent.io/blog/kafka-fastest-messaging-system/)
- [System Design - Interview Questions](https://leetcode.com/discuss/interview-question/system-design?currentPage=1&orderBy=hot&query=)
