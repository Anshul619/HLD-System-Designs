
# Atomicity
- [Atomicity](https://www.geeksforgeeks.org/acid-properties-in-dbms/) is a feature of databases systems dictating where a transaction must be `all-or-nothing`.
- That is, the transaction must either fully happen, or not happen at all. It must not complete partially.
- Each transaction is considered as one unit and either runs to completion or is not executed at all.
- In database systems, atomicity is the [ACID property](ACIDPropertyTransaction.md).
- The ability to abort a transaction on error and have all writes from that transaction discarded is the defining feature of [ACID atomicity](ACIDPropertyTransaction.md).

It involves the following two operations.
- [Abort](https://www.geeksforgeeks.org/acid-properties-in-dbms/): If a transaction aborts, changes made to t he database are not visible.
- [Commit](https://www.geeksforgeeks.org/acid-properties-in-dbms/): If a transaction commits, changes made are visible.

## Examples

| Tech                                                                                                                    | Remarks |
|-------------------------------------------------------------------------------------------------------------------------|---------|
| [Redis Transaction Lock](../../3_DatabaseComponents/In-Memory-Cache/Redis/Readme.md#atomicity---redis-transaction-lock) | -       |
