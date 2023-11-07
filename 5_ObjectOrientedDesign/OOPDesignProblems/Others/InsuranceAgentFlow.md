Insurance Form
- Product Selection
- Personal Info
- Medical Info
- Beneficary Info
- Review
- Signing - By Customer
- Signing - By Agent


Flow
- Agent start the application, fill it upto the Review
- Agent would send the application to eSigners for signing
- Customer would receive the email, click on the link, readonly the info ( PDF ), scribble the sign ( enter DOB, Zip Code, email ) and submit
- Agent would receive the email, then sign and submit.
- This completes the process

Scope
- Payment is not part of the scope

Design
- Backend - DB, classes
- UI - REST APIs
- HLD - Deployment


——

DB


user table
- name
- email
- password - hashed()
- role - Agent or Customer
- is_active
- last_updated
- Based on the region
    - Data Sharding of Hyderabad’s in shard
    - SQL Query -> Slow Query, Query Optimize - Min of Joins, Select the REQUIRED attributes, Indexing.

users_role
- id_user
- role

products
- id_product
- price
- etc.

insurance_application_link
- id
- hash(link)
- expiry
- email
- id_insurance
- link_type -> CUSTOMER_LINK, AGENT_LINK
- is_active

insurance application
- id
- id_product
- id_agent ( FKI -> user)
- status - Draft, Pending_for_Customer_Signing, Pending_for_Agent_Signing, Completed
- id_payment
- customer personal info
    - profile name
    - DOB
    - ZIP code
    - email
- Medical info - different attributes
    - DISEASE1
    - DISEASE2
    - DISEASE3
- Beneficary Info - different attributes
    - profile name
    - DOB etc.
    - relationship
- doc_path -> PDF_Path

notifications
- id


Annotation
- PDF Template - Acroform
- Take insurance details
- Merge those insurance details
- create PDF, save the PDF in EFS against “insurance_id”

REST APIs
- Agent create 

# References
- Asked in Surefy interview question, 5thJuly2022
