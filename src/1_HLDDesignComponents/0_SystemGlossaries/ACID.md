# :star: [ACID Properties of the Transaction](https://www.geeksforgeeks.org/acid-properties-in-dbms/)

![img.png](assests/ACID_Property_DBMS.drawio.png)

# [Atomicity](Atomicity.md)

# [Consistency](https://www.geeksforgeeks.org/acid-properties-in-dbms/)
- This means that integrity constraints must be maintained so that the database is consistent before and after the transaction.
- `Consistency` (or `Correctness`) in database systems refers to the requirement that any given database transaction [must change affected data only](https://en.wikipedia.org/wiki/Consistency_(database_systems)) in allowed ways.
- Any data written to the database must be valid according to all defined rules, including constraints, cascades, triggers, and any combination thereof.

# [Isolation](https://www.geeksforgeeks.org/acid-properties-in-dbms/)
- This property ensures that multiple transactions can occur concurrently without leading to the inconsistency of the database state.
- Transactions occur independently without interference.
- Changes occurring in a particular transaction will not be visible to any other transaction until that particular change in that transaction is written to memory or has been committed

# [Durability](Durability.md)