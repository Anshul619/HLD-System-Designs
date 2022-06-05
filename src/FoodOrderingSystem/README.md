# Introduction
- HLD System Design Interview question asked in Blackbuck, 2ndJune2022

# Basic Requirements
- Food ordering systems
- User would have name & phoneNumber
- User can search for the restaurants
- User can search for the keywords and get list of restaurants
- Place a order
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
- Kafka is used to achieve high throughput in streaming events between read and write repositories of order management, sending real time or batch events to recommendation engine and publishing approved catalog and products(menu and foods) to elastic index.

## AmazonMQ
- Since we have order work flow, we should use a MQ to update the transaction status quickly ( like order status etc. ).
- To achieve transactions between distributed microservices and avoid data/transaction loss.
- MQ vs Kafka - https://www.interviewbit.com/blog/rabbitmq-vs-kafka/#difference-between-rabbitmq-and-kafka

## Apache Spark/Beam
- *Open Question - Why is it so?*
-  For running map-reduce jobs to select driver for efficient delivery and generate recommendations based on continuous streams of user activity, order activity, pricing and promo changes, etc.

## Redis Cache
- To store the location and segments information of all the restaurants in the city. As this is very frequently read and non-changing data, we had chose to setup this in Redis to avoid multiple DB calls. For cart also, we will be storing all the selected items in Redis.

## Elastic Search
- Elastic indexes are used to store all published catalogs and products along with recommended items and placed order queries to achieve the targeted SLA for search and browse requests. Elastic search will also be used for indexing customer calls records and metadata for the transcription.
- Elastic Search has caching option enabled. Hence Redis is not needed b/w App and ElasicSearch.

## PostgresDB
- To Store all transactional data ( like orders, shipment, restaurants, delivery, shipment etc.), we have chosen PostgresDB to support native cloud approach but other options like public cloud managed storages can also be considered to achieve high scalability.
- Data sharding/segmentation can be done based on different params like region etc.

## GraphQL - https://graphql.org/
- To decrease the load and send only relevant data to UI, we have used GraphQL query language to query selective data from the tree instead of complete data. Same goes for recommendation engine as well.
- To achieve the targeted SLA, we have designed the system to support different repository for read and write, and have made the write repository more aligned towards domain data and read repository towards data that will be requested from UI. To do so, we have bundled all the product and order related data into their respective documents inside the elastic indexes.

## Web Sockets
- Will be used to deliver the continuous update of driver location who had picked the delivery, to the customer.

## MongoDB
- To store unstrcutred data ( that doesn’t have a fixed schema and changed overtime ) like review, ratings, notifications and surveys related data.

# Other important points
- All these services would have to be scaled horrizontally

# Other Notes

Tasks
- Step1
    - HLD, Services
    - DataStore or use etc.
- Step2
    - Deepdown in the service


User Actors
- Customer
- Delivery Boy
- System SuperAdmin
- Restaurant Owner

Definition of the Regions
- Based on lat, long
- Every delivery boy would have a mapping with the region
- Redis Queue for every region, which would contain orders from that region

Order Status
- Not-Paid
- Paid
- Ongoing - Delivery is selected
- Delivered
- Completed

“Micro-Services”
- Customer-App
    - 1 - Search the restaurant, return list of restaurants
    - 2 - Looking at the restaurant menu
    - 3 - Order Placement
        - Checkout the menu
        - Choose Payment Method ( would be integrated PayTm, RazorPay )
        - Do the Payment
        - Assign to the deliver boy
        - Success Screen would be shown to the user 
        - Order would then be saved in the main transactions database.
            - And based on the user & delivery location, it would be pushed in the region delivery boy QUEUE. ( Redis based )
    - 4 - MyOrders
        - Where i can see my orders
            - Cache - Redis
            - Backend ( NoSQL ) - Apache HBase
- Delivery-Boy-App
    - 4 - List of available orders ( in the nearby zone )
        - Would be shown from the delivery boy QUEUE
    - 5 - Select and chose to deliver
        - Order would be pushed in the particular delivery queue ( Redis )
- Accounting
    - Order is placed/completed
        - Credit & Debit - Mutiple order
            - Order -> Zomoto - Commission ( 5%)
            - Restaurant - Rs100
            - Delivery Boy
        - Monthly, we would monthly 
    - Account Transactions Table
    - Bank Account
        - Restaurant => BankAccountNumber
        - Delivery Boy => BankAccount Number
    - Settlement Table
        - CRON job, asynchronous queue 
            - PG API that we need to pay this much money to X bankaccount
            - Transactions in the settlement table
        - PG would call the Zomato API when payment is settled or failed
        - We would update the status here.

Monitorings
- System level metrics/monitoring
- Business Critical - Third-party Api call alarm
    - Payment Gateway
- All those microservices up and running


Reference 
- https://media-exp1.licdn.com/dms/image/C4D12AQGixkOy-waRJg/article-inline_image-shrink_1000_1488/0/1631931391844?e=1659571200&v=beta&t=E9PS2F7y5iWACrHU1K7T9h_sUUCxJduClOik8QjedX8
- https://www.linkedin.com/pulse/system-design-food-delivery-app-zomatoswiggy-saral-saxena/
