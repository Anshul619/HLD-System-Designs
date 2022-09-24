
<img title="HLD - Food Ordering System.drawio" alt="Alt text" src="HLD - Food Ordering System.drawio.png">

# Basic Requirements
- Food ordering systems
- User would have name & phoneNumber
- User can search for the restaurants
- User can search for the keywords and get list of restaurants
- Place an order
- Track the order
- Delivery of the order
- Order fulfilment
- User can track the status
- User can track the live location of the delivery
- Location of the restaurant 
- Accounting of the restaurant 
    - User would pay Zomato
    - Zomato would pay to delivery, restaurant

# Design decisions and tech choices

## Cloud platform - AWS

## Kafka Streams
- [Kafka](../../1_HLDDesignComponents/4_MessageBrokers/Kafka.md) is used to achieve high throughput in streaming events between read and write repositories of order management, sending real time or batch events to recommendation engine and publishing approved catalog and products(menu and foods) to elastic search.

## RabbitMQ
- Since we have order work flow, we should use a [RabbitMQ](../../1_HLDDesignComponents/4_MessageBrokers/RabbitMQ.md) to update the transaction status quickly ( like order status etc. ).

## Apache Spark
- [Apache Spark](../../1_HLDDesignComponents/5_BigDataComponents/ApacheSpark.md) is the computing engine.
- For running map-reduce jobs to `select driver for efficient delivery` and generate recommendations based on continuous streams of user activity, order activity, pricing and promo changes, etc.
- It will select the distributed data, create a map and then reduce the values to give proper data.

## Redis Cache
- [Redis cache](../../1_HLDDesignComponents/3_DatabaseComponents/In-Memory-Cache/Redis/README.md) can be used, to store the location and segments information of all the restaurants in the city.
- As this is very frequently read and non-changing data, we had chosen to setup this in Redis to avoid multiple DB calls. 
- For cart also, we will be storing all the selected items in Redis.

## ElasticSearch
- [ElasticSearch](../../1_HLDDesignComponents/3_DatabaseComponents/Search-Engines/ElasticSearch/Readme.md) are used to store all published catalogs and products along with recommended items and placed order queries `to achieve the targeted SLA for search and browse requests`. 
- ElasticSearch will also be used for indexing customer calls records and metadata for the transcription.

## PostgresDB
- To store all transactional data ( like orders, shipment, restaurants, delivery, shipment etc.), we have chosen [PostgresDB](../../1_HLDDesignComponents/3_DatabaseComponents/ReadMe.md) to support native cloud approach but other options like public cloud managed storages can also be considered to achieve high scalability.
- Data sharding/segmentation can be done based on different params like region etc.

## GraphQL
- To decrease the load and send only relevant data to UI, we have used [GraphQL query language](../../1_HLDDesignComponents/2_APITechOptions/GraphQL.md) to query selective data from the tree instead of complete data. Same goes for recommendation engine as well.
- To achieve the targeted SLA, we have designed the system to support different repository for read and write, and have made write repository more aligned towards domain data and read repository towards data that will be requested from UI. 
- To do so, we have bundled all the product and order related data into their respective documents inside the elastic indexes.

## AeroSpike DB
- [Aerospike](../../1_HLDDesignComponents/3_DatabaseComponents/In-Memory-Cache/AeroSpike.md) features a Hybrid Memory Architecture (`In-Memory` + `No-SQL database`), which makes it unique.
- When using a persistent SSD, the index is kept in memory while the data is stored on the disc and then retrieved from the drive, as opposed to when using a non-persistent SSD.
- To support high throughput in read and write in real time.

## NodeJS
- Light weight API(s) exposed to perform quick and efficient IO operations and support scalable traffic with controlled memory. 
- Java Reactive/Spring Webflux can also be considered as alternate.

## Web Sockets
- Will be used to deliver the continuous update of driver location who had picked the delivery, to the customer.

## MongoDB
- To store unstructured data ( that doesn’t have a fixed schema and changed overtime ) like review, ratings, notifications and surveys related data, [MongoDB](../../1_HLDDesignComponents/3_DatabaseComponents/NoSQL-Databases/MongoDB/Readme.md) can be used.

## Other important points
- All these services would have to be scaled horizontally

# Related designs
- [Uber Driver Allocation](../UberDriverAllocationDesign/README.md)

# Reference 
- [System Design of food delivery app (Zomato/Swiggy)](https://www.linkedin.com/pulse/system-design-food-delivery-app-zomatoswiggy-saral-saxena/)
- HLD System Design Interview question asked in Blackbuck, 2ndJune2022