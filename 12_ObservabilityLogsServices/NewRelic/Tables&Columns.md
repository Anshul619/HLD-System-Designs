# Tables

| Table Name   | Type            | Description                                   |
|--------------|-----------------|-----------------------------------------------|
| Transaction  | Event_Type      | All API calls, happening in the service       |
| PageView     | Event_Type      |                                               |
| processOrder | Customer Events | Pushed by a microservice                      |
| Span         | OTP event type  | All API calls, collected using open-telemetry |

# Columns

| Column   | Table Name  | Description                                       |
|----------|-------------|---------------------------------------------------|
| appName  | Transaction | Service Name, from which transaction is happening |
| duration | Transaction | Response time/latency of the transaction          |
| Name     | Transaction | Transaction Name i.e. API URL                     |



