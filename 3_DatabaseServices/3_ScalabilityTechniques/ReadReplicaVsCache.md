# Read Replica vs Cache
- Read replica or [in-memory cache](../8_InMemory-Databases) increases read scalability, but it often creates some irritating due to data inconsistency or [replication lag](../4_Consistency&Replication/ReplicationLag.md).  

|                        | Read Replica                 | In-Memory Cache   |
|------------------------|------------------------------|-------------------|
| Dynamic Query Patterns | :white_check_mark: Preferred | :x: Not-Preferred |
| Replica Lag            | Yes                          | :rocket: No       |
| Data Consistency Bugs  | :white_check_mark: Less      | More              |
