# PostgreSQL - Write-Ahead Logging (WAL)
- In PostgreSQL, [Write-Ahead Logging (WAL)](https://www.postgresql.org/docs/current/wal-intro.html) is a standard method for ensuring data integrity. 
- Briefly, WAL's central concept is that changes to data files (where tables and indexes reside) must be written only after those changes have been logged, that is, after WAL records describing the changes have been flushed to permanent storage. 
- If we follow this procedure, we do not need to flush data pages to disk on every transaction commit, because we know that in the event of a crash we will be able to recover the database using the log: any changes that have not been applied to the data pages can be redone from the WAL records.

# MySQL - BinLog
- The [binary log](https://dev.mysql.com/doc/refman/8.4/en/binary-log.html) contains “events” that describe database changes such as table creation operations or changes to table data. 
- It also contains events for statements that potentially could have made changes (for example, a DELETE which matched no rows), unless row-based logging is used.