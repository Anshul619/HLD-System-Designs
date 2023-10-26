# Introduction

This repo contains the various system design components info, questions and solutions.
- :star: [System Estimation Tips](src/1_HLDDesignComponents/SystemEstimationTips.md)
- [Key Components of Distributed Systems](src/1_HLDDesignComponents/0_SystemGlossaries/Readme.md)
- [HLD Design Problems](src/3_HLDDesignProblems)
- [LLD Design Problems](src/4_ObjectOrientedDesign/OOPDesignProblems)

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

[//]: # (                <a href="/src/1_HLDDesignComponents/2_APITechOptions/REST.md" target="_blank">)

[//]: # (                  <img src="https://www.snmpcenter.com/wp-content/uploads/2016/10/RESTful-API-logo-for-light-bg-600x205.png" width="150">)

[//]: # (                </a>)
                <a href="/src/1_HLDDesignComponents/2_APITechOptions/gRPC.md" target="_blank">
                  <img src="https://res.cloudinary.com/practicaldev/image/fetch/s--TNgs2Fd7--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/8susytd9w6lxe9sreqvd.jpg" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/2_APITechOptions/GraphQL.md" target="_blank">
                  <img src="https://marmelab.com/images/blog/graphql/logo.png" width="150">
                </a>
                <a href="/src/2_AWSComponents/1_NetworkingAndContentDelivery/1_EdgeNetworking/AmazonCloudFront.md" target="_blank">
                  <img src="https://ericknavarro.io/images/thumbnails/12.png" width="150">
                </a>
            </div>
        </div>
      </td>
      <td rowspan=10 width="150px">
        <a href="src/2_AWSComponents">
          <img src="https://i.pinimg.com/originals/50/bd/c9/50bdc91f32650905e776d6751478928c.png">
        </a>
        <br/><br/>
        <a href="/src/2_AWSComponents/9_InfrastructureAsCode/AWSCloudFormation/Readme.md" target="_blank">
          <img src="https://i0.wp.com/www.australtech.net/wp-content/uploads/2019/05/cloudformation-logo.png" width="150">
        </a>
        <br/><br/>
        <a href="src/1_HLDDesignComponents/6_ContainerOrchestrationServices/Kubernates.md">
          <img src="https://logos-download.com/wp-content/uploads/2018/09/Kubernetes_Logo.png">
        </a>
        <br/><br/>
        <a href="src/1_HLDDesignComponents/6_ContainerOrchestrationServices/Docker/Readme.md">
          <img src="https://www.docker.com/wp-content/uploads/2022/03/vertical-logo-monochromatic.png">
        </a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/3_DatabaseComponents/In-Memory-Cache">In-Memory Cache/DBs</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="/src/1_HLDDesignComponents/3_DatabaseComponents/In-Memory-Cache/Redis/Readme.md" target="_blank">
                  <img src="https://upload.wikimedia.org/wikipedia/en/6/6b/Redis_Logo.svg" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/3_DatabaseComponents/In-Memory-Cache/AeroSpike.md" target="_blank">
                  <img src="https://aerospike.com/wp-content/uploads/2021/03/logo-4.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/4_MessageBrokers">Message brokers</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="/src/1_HLDDesignComponents/4_MessageBrokers/Kafka/Readme.md" target="_blank">
                  <img src="http://i1.wp.com/airisdata.com/wp-content/uploads/2016/01/kafka-logo-600x390.jpg?resize=600%2C390" width="150">
                </a>
                <a href="/src/2_AWSComponents/5_MessageBrokerServices/AmazonKinesisDataStreams.md" target="_blank">
                  <img src="https://intellipaat.com/blog/wp-content/uploads/2022/08/image-75.png" width="150">
                </a>
                <a href="/src/2_AWSComponents/5_MessageBrokerServices/AmazonSQS/Readme.md" target="_blank"><img src="https://i0.wp.com/blog.knoldus.com/wp-content/uploads/2021/09/sqs.png?w=711&ssl=1" width="150"></a>
                <a href="/src/2_AWSComponents/5_MessageBrokerServices/AmazonEventBridge.md" target="_blank"><img src="https://user-images.githubusercontent.com/3268013/149550617-d92fa8ff-f95d-499c-8515-0ed0be976fbf.png" width="150"></a>
                <a href="/src/2_AWSComponents/5_MessageBrokerServices/AmazonSNS.md" target="_blank"><img src="https://miro.medium.com/max/720/0*QjKNs9dEShlQ39VI.png" width="150"></a>
                <a href="/src/1_HLDDesignComponents/4_MessageBrokers/RabbitMQ.md" target="_blank"><img src="https://www.logo.wine/a/logo/RabbitMQ/RabbitMQ-Logo.wine.svg" width="150"></a>
                <a href="/src/1_HLDDesignComponents/4_MessageBrokers/ActiveMQ.md" target="_blank"><img src="https://cdn.icon-icons.com/icons2/2699/PNG/512/apache_activemq_logo_icon_168628.png" width="150"></a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/3_DatabaseComponents/Search-Indexes" target="_blank">Search Engines</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="/src/1_HLDDesignComponents/3_DatabaseComponents/Search-Indexes/ElasticSearch/Readme.md" target="_blank">
                  <img src="https://miro.medium.com/max/1200/1*20yTn7K6c6vcmEdgwAgjSA.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/3_DatabaseComponents/Search-Indexes/ApacheSolr.md" target="_blank">
                  <img src="https://solr.apache.org/theme/images/identity/Solr_Logo_on_white.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/1_MicroServicesSOA/ServiceRegistry&Discovery" target="_blank">MicroServices - Service Registry & Discovery</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="/src/1_HLDDesignComponents/1_MicroServicesSOA/ServiceRegistry&Discovery/Eureka.md" target="_blank">
                  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsLVq3RUn8c7AWSr_559ISKEpHkgVn5U3NKg&usqp=CAU" width="150">
                </a>
                <a href="/src/2_AWSComponents/1_NetworkingAndContentDelivery/2_ApplicationNetworking/AWSCloudMap.md" target="_blank">
                  <img src="https://landscape.cncf.io/logos/aws-cloud-map.svg" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/7_ClusterCoordinationService/etcd.md" target="_blank">
                  <img src="https://cdn.freebiesupply.com/logos/large/2x/etcd-logo-png-transparent.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/7_ClusterCoordinationService/ApacheZookeeper.md" target="_blank">
                  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Apache_ZooKeeper_logo.svg/1200px-Apache_ZooKeeper_logo.svg.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/7_ClusterCoordinationService/Readme.md" target="_blank">Cluster Coordination Service & Config store</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="/src/1_HLDDesignComponents/7_ClusterCoordinationService/ApacheZookeeper.md" target="_blank">
                  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Apache_ZooKeeper_logo.svg/1200px-Apache_ZooKeeper_logo.svg.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/7_ClusterCoordinationService/etcd.md" target="_blank">
                  <img src="https://cdn.freebiesupply.com/logos/large/2x/etcd-logo-png-transparent.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/5_BigDataComponents/ETLServices/BatchProcessing/Readme.md">Batch Processing</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="/src/1_HLDDesignComponents/5_BigDataComponents/ETLServices/BatchProcessing/ApacheHadoop" target="_blank">
                  <img src="https://www.clipartmax.com/png/middle/180-1806192_hadoop-apache-hadoop-logo.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/5_BigDataComponents/ETLServices/StreamProcessing/ApacheSpark.md" target="_blank">
                  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Apache_Spark_logo.svg/1200px-Apache_Spark_logo.svg.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/5_BigDataComponents/ETLServices/StreamProcessing/Readme.md">Stream Processing</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="/src/2_AWSComponents/10_BigDataComponents/ETLServices/StreamProcessing/AmazonKinesis/Readme.md" target="_blank">
                  <img src="https://miro.medium.com/max/1190/0*UQBKjEff1uIsXH8W" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/5_BigDataComponents/ETLServices/StreamProcessing/ApacheSpark.md" target="_blank">
                  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Apache_Spark_logo.svg/1200px-Apache_Spark_logo.svg.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/5_BigDataComponents/ETLServices/StreamProcessing/KafkaStreamsAPI.md" target="_blank">
                  <img src="https://1.bp.blogspot.com/-LIHoqo96Dos/X7wKY2u124I/AAAAAAAAp88/SrC8E6Y-5l4Xil7UPrDRp-RuEx2GioXkQCLcBGAsYHQ/s435/kafka-streams.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/3_DatabaseComponents/Readme.md" target="_blank">Databases</a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheCasandra.md" target="_blank">
                  <img src="https://fontslogo.com/wp-content/uploads/2018/12/Apache-Cassandra-Logo-Font.jpg" width="150">
                </a>
                <a href="src/2_AWSComponents/6_DatabaseServices/AmazonDynamoDB/Readme.md">
                  <img src="https://user-images.githubusercontent.com/6509926/70553550-f033b980-1b40-11ea-9192-759b3b1053b3.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/MongoDB" target="_blank">
                  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/MongoDB_Logo.svg/2560px-MongoDB_Logo.svg.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/ApacheHBase.md" target="_blank">
                  <img src="https://hbase.apache.org/images/hbase_logo_with_orca_large.png" width="150">
                </a>
            </div>
        </div>
      </td>
    </tr>
    <tr>
      <td>
        <a href="src/1_HLDDesignComponents/5_BigDataComponents/ETLServices/BatchProcessing/ApacheHadoop/ApacheHDFS.md" target="_blank">
          Distributed Storage Services (Files, Images etc.)
        </a>
      </td>
      <td>
        <div class="container" style="background:white">
            <div class="block two first">
                <a href="src/2_AWSComponents/7_StorageServices/3_ObjectStorageS3/Readme.md" target="_blank">
                  <img src="https://miro.medium.com/max/580/1*DHe24MbDHtbkOeIJzxrfdA.png" width="150">
                </a>
                <a href="/src/1_HLDDesignComponents/5_BigDataComponents/ETLServices/BatchProcessing/ApacheHadoop/ApacheHDFS.md" target="_blank">
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
        <a href="src/2_AWSComponents/8_MonitoringServices/AmazonCloudWatch/Readme.md">
          <img src="https://miro.medium.com/max/800/1*ffbynFsxn43lPdne2kaHMQ.png" width="150">
        </a>
      </td>
    </tr>
  </tbody>
</table>

# Programming & OOP Design & Problems (LLD)
- :star: [OOP Design](src/4_ObjectOrientedDesign/OOP.md)
- :star: [SOLID Principles](src/4_ObjectOrientedDesign/SOLID.md)
- :star: [Design Tips & Techniques](src/4_ObjectOrientedDesign/TipsAndTechniques.md)
- :star: [Design Patterns](src/4_ObjectOrientedDesign/DesignPatterns)

# Programming Languages
- :star: [GoLang](https://github.com/Anshul619/golang)
- [Spring Boot & Microservices](src/5_ProgrammingLanguages/2_Java/SpringBootAndMicroServices)
- [Java](src/5_ProgrammingLanguages/2_Java)
- [Hibernate](src/5_ProgrammingLanguages/2_Java/Hibernate.md)
- [JavaScript](src/5_ProgrammingLanguages/3_JavaScript)
- [TypeScript](src/5_ProgrammingLanguages/4_FrontEnd/TypeScript.md)
- [Angular8](src/5_ProgrammingLanguages/4_FrontEnd/Angular8.md)

# API Dev, Documentation
- :star: [Swagger](src/1_HLDDesignComponents/2_APITechOptions/API_Documentation/Swagger/Readme.md)
- [Open API Spec](src/1_HLDDesignComponents/2_APITechOptions/API_Documentation/Swagger/OpenAPISpec.md)

# Other Services
- :star: [Open Source Contributions](OpenSourceContributions.md)
- [Monitoring](src/1_HLDDesignComponents/8_MonitoringTools/Readme.md)
- [Apache Marathon & Mesos](src/1_HLDDesignComponents/6_ContainerOrchestrationServices/ApacheMarathon&Mesos.md)
- [Apache Yarn](src/1_HLDDesignComponents/6_ContainerOrchestrationServices/ApacheYarn.md)
- [Testing](src/QATools/Readme.md)
- [System Design Tips](src/1_HLDDesignComponents/SystemDesignTips.md)
- [Engineering Blogs](EngineeringBlogs.md)

# Source(s) and further reading
- [System Design Primer](https://github.com/donnemartin/system-design-primer)
- [Grokking the System Design](https://www.educative.io/courses/grokking-the-system-design-interview/39RwZr5PBwn)
- [System Design by Gaurav Sen](https://www.youtube.com/watch?v=xpDnVSmNFX0&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX)
- [Byte byte go - System Design](https://github.com/ByteByteGoHq/system-design-101/Readme.md)
- [System Design - Interview Questions](https://leetcode.com/discuss/interview-question/system-design?currentPage=1&orderBy=hot&query=)
