# Refresh Interval
- Indexes have eventual read consistency. 
- A refresh operation makes all the updates that are performed on an index available for search. 
- The default refresh interval is one second, which means that search-db performs a refresh every second while an index is being written to.
- The recommended setting the **refresh_interval** parameter for all of your indexes to **30 seconds or more**.