# :star: [ACID Properties of the Transaction](https://www.geeksforgeeks.org/acid-properties-in-dbms/)

![img.png](../10_Others_assests/ACID_Property_DBMS.drawio.png)

# [Atomicity](https://www.geeksforgeeks.org/acid-properties-in-dbms/)
- Atomicity is a feature of databases systems dictating where a transaction must be `all-or-nothing`.
- That is, the transaction must either fully happen, or not happen at all. It must not complete partially.
- Each transaction is considered as one unit and either runs to completion or is not executed at all.
- It involves the following two operations.
    - `Abort`: If a transaction aborts, changes made to the database are not visible.
    - `Commit`: If a transaction commits, changes made are visible.

# [Consistency](https://www.geeksforgeeks.org/acid-properties-in-dbms/)
- This means that integrity constraints must be maintained so that the database is consistent before and after the transaction.
- `Consistency` (or `Correctness`) in database systems refers to the requirement that any given database transaction [must change affected data only](https://en.wikipedia.org/wiki/Consistency_(database_systems)) in allowed ways.
- Any data written to the database must be valid according to all defined rules, including constraints, cascades, triggers, and any combination thereof.

# [Isolation](https://www.geeksforgeeks.org/acid-properties-in-dbms/)
- This property ensures that multiple transactions can occur concurrently without leading to the inconsistency of the database state.
- Transactions occur independently without interference.
- Changes occurring in a particular transaction will not be visible to any other transaction until that particular change in that transaction is written to memory or has been committed

# Durability
- In database systems, [durability](https://en.wikipedia.org/wiki/Durability) is the `ACID property` which guarantees that `transactions that have committed will survive permanently`.
- For example, if a flight booking reports that a seat has successfully been booked, then the seat will remain booked even if the system crashes.