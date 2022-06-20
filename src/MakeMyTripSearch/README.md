
# Requirements
- Booking for a date, time. Customer - He wants to Indigo or Spicejet.
- Search ( increasing order of fare, flight duration ), Selection
- Scalability, High Performance

# Events
- Price Update
- Flight booking
- New flight onboarding ( admin )

<img title="MakeMyTrip" alt="Alt text" src="MakeMyTripFlightSearch.drawio.png">

# Scalability
- Each service ( apache ) can handle 1000 concurrent sessions
- 1 million users using at the same time, corresponding servers 1000 servers
- Elastic Search cluster

# Data Modeling
- Search Interface 
  - searchbyDate
- FlightSearch would implement Search Interface 
