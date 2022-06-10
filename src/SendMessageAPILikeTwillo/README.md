
# Introduction
- Design Twillo API. Message platform for business.
- Different plans - Basic, Paid etc.

## Basic Plan
- 1000 free messages
- X amount per whatsapp
- Y amount per sms
- 1000 transactions limit per second per team

# Tech Specs
- Kafka can be used to store, process the messages
- 2 different topics for SMS, Whats app

# Open Question 
- How would we design Kakka here?
- What would be different topics? One general topic or multiple topics ( based on communication channel )?
- What would be the different brokers?
- What would be different partitions of the topics?
- Kafka Broker takes message from Producer and push it to the topic.
- Multiple brokers, multiple topics?
- Low level system design of Kafka?
- Reference - https://www.conduktor.io/kafka/kafka-brokers

# DB Design
## Plan
    - Label - Basic, Pro, Business
        - FreeMessages
        - SMS
        - WhatsApp
## Teams
    - id_team
    - name
    - 
## Teams_Active_Plan
    - id_team
    - current_plan
    - start_date
    - end_date
    - updated_at
    - created_at
    - current_free_count => 0
## Teams_Historical_Data
    - History
## Transactions
    - id_team
    - Timestamp
    - Message Type
    - Billing Amount
    
# References
- https://www.youtube.com/watch?v=0q0UF6Nd7ro
