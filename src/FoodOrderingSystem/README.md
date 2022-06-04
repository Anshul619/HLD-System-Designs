
Reference - https://media-exp1.licdn.com/dms/image/C4D12AQGixkOy-waRJg/article-inline_image-shrink_1000_1488/0/1631931391844?e=1659571200&v=beta&t=E9PS2F7y5iWACrHU1K7T9h_sUUCxJduClOik8QjedX8

Asked in Blackbuck, 2ndJune2022

- Food ordering systems
- Name, PhoneNumber
- Search for the restaurants
- Keywords
- Restaurant
- Place a order
- Track the order
- Delivery the order
- Order fulfilment
- User can track the status
- User can track the live location of the delivery
- Location of the restaurant 
- Accounting of the restaurant 
    - User would pay Zomato
    - Zomato would pay to delivery, restaurant

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

