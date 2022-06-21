// Asked in Byju@31May2022
Auto-Scale group
 - Add it in the load balancer

Load Balancer - Apache App server
- App1
    - Only server 1000 requests per sec
    - Load testing
    - Go to APP
- App2
- Execute a script to create a new app server
    - Run a script
        - Create app3 server - API URL
            - “document/upload” -> DocumentUpload
App1
App2

Machine Load
- CPU Utilisation
- Memory utilization
- No of Processes
- Long running processes?

Triggers
- Requests per second
    - apache - server status
    - 1st way
- Servers - Either App1 or App2 - Heartbeat
- Geographic region
- Machine Load - CPU utilisation of the app servers

Cron Job 
- Every 5 seconds, that would go to the app servers, get these stats, push it the Redis ( key -> value )
    - “app1_cpu” => 50%
        - Linux command
    - “app1_
    - filebeat running on app1

Requests per second
- Apache Logs - Timestamp
    - “access_logs” => ElasticSearch
        - Truncation of old logs
    - stats save in the
        - app1_requests => 100
        - app2_requests => 1000
