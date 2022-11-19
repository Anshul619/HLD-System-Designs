
# Design Hit Counter System

# DataStore to use
- DynomoDB ( AWS ) or OnPerm - Casandra or Redis ( HashMap )
    - Redis Cluster
- Permission system as separate service/database
    - UUID of the file system, instead of filename/folder
- Counter Update
    - Counter should be updated asynchronously
    - TransactionLock
    - Follow ACID, CAP theme
- Journaling data changes - https://en.wikipedia.org/wiki/Journaling_file_system
- Crash Recovery, Audit Log

# References
- [Rainbird: Realtime Analytics at Twitter](https://www.slideshare.net/kevinweil/rainbird-realtime-analytics-at-twitter-strata-2011)
- [Dropbox Interview – Design Hit Counter](http://blog.gainlo.co/index.php/2016/09/12/dropbox-interview-design-hit-counter/)
- [Design a Hit Counter - Geeks for geeks](https://www.geeksforgeeks.org/design-a-hit-counter/?ref=lbp)
- [Microsoft virtual | Design distributed counter](https://leetcode.com/discuss/interview-question/system-design/685310/Microsoft-virtual-or-Design-distributed-counter)