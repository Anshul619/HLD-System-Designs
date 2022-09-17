

# Design Problem

Design driver allocation to riders in an Uber-like system
- Assume many riders and drivers are using the system in parellel
- Various solutions and their trade-offs
- What happens when traffic increases?
- Components/ services required

![img.png](assests/UberDriverAllocation.drawio.png)

# User Actors
- Rider
- Driver

# Use Cases

## Rider - Book Cab
- Enter Pick the location, destination location & click `Continue`
- `Search Cab` service would publish message to Kafka `Search Driver` topic
- Consumer would consume from Kafka `Allocation Driver` topic
- "Algo" to find riders for the given {rider, pickup, drop} location msg
- Match the rider pick location with the corresponding location in `DriverLocationDB`
- Push the notification to the matched drivers
- If one of them accepts the trip, then we will create "Trips" database.
  Notify the rider through push notification.

## Driver - Push Location
- Push the current location via kafka "Driver Location" topic (high throughput)
- Consumer would consume from Kafka & then push to elasticSearch geo support

## Driver Match algo
- Area filter
- Availability of driver (not available, busy, schedule)
- location estimate?
  - Distance - High performance intensive (between pickup)
- Special - Give preference ( top rated drivers ) to the premium riders
- filtered drivers, can be done on the end

## Multiple driver accepting trip
- location L requested - 10 drivers are present
- lock TripsDB so only one driver accepts
- if locked/ trip accepted, notify other 9 drivers something

# DB Schemas

## TripsDB - RDBMS
- id_rider
- id_driver
- pick_location
- destination_location
- estimated time
- estimated fare
- current_status
- payment_mode
- id_payment

## ElasticSearch GeoDB - DriverLocationDB
- location : [{driver, timestamp}]
- retaining last x mins of info (`TTL` config)

## GeoDB cache Redis (less accurate but fast)
- location to driver

# How to scale the system?
- 

# References
- [Uber Backend Design - Educative.io](https://www.educative.io/blog/uber-backend-system-design)
- [System Design of Uber App – Uber System Architecture](https://www.geeksforgeeks.org/system-design-of-uber-app-uber-system-architecture/)
- [How Uber Scales Their Real-Time Market Platform](http://highscalability.com/blog/2015/9/14/how-uber-scales-their-real-time-market-platform.html)