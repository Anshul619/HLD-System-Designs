
# [Atomicity](https://www.geeksforgeeks.org/acid-properties-in-dbms/)
- Atomicity is a feature of databases systems dictating where a transaction must be `all-or-nothing`.
- That is, the transaction must either fully happen, or not happen at all. It must not complete partially.
- Each transaction is considered as one unit and either runs to completion or is not executed at all.
- In database systems, atomicity is the [ACID property](ACIDPropertyTransaction.md).

It involves the following two operations.
- `Abort`: If a transaction aborts, changes made to the database are not visible.
- `Commit`: If a transaction commits, changes made are visible.

## Examples

| Tech                                 | Remarks |
|--------------------------------------|---------|
| [Redis Transaction Lock](../3_DatabaseComponents/Redis/README.md#atomicity---redis-transaction-lock) | -       |