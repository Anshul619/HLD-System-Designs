# InfluxDB
- [InfluxDB](https://www.influxdata.com/) is a scalable [time-series datastore](https://en.wikipedia.org/wiki/Time_series_database) for metrics, dashboards, events, and real-time analytics. 
- It has a built-in HTTP API, so you don't have to write any server side code to get up and running. 
- InfluxDB is designed to be scalable, simple to install and manage, and fast to get data in and out.

# Sample Query
- With a time range, for name xyz, find all the book title for which # of page < 400.

````
[ 
  { "timestamp": "2021-09-06T12:51:00Z",
    "name": "Name1",
    "books": [
        { "title": "Book1", "page": 100 },
        { "title": "Book2", "page": 280 },
    ]
  },
 { "timestamp": "2021-09-06T12:52:00Z",
   "name": "Name2",
   "books": [
       { "title": "Book1", "page": 320},
       { "title": "Book2", "page": 530 },
       { "title": "Book3", "page": 150 },
   ]
 }
]
````

# Alternatives
- [Timescale - PostgreSQL ++ for time series and events](https://www.timescale.com/)