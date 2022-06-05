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

## RabbitMQ
- *Open Question - RabbitMQ vs Kafka* - https://stackoverflow.com/questions/42151544/when-to-use-rabbitmq-over-kafka
- To achieve transactions between distributed microservices and avoid data/transaction loss.

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
