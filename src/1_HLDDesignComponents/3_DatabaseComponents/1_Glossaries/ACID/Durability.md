# Durability
- [Durability](https://en.wikipedia.org/wiki/Durability) guarantees that transactions that have committed will survive permanently.
- In database systems, durability is the [ACID property](Readme.md).
- For example, if a flight booking reports that a seat has successfully been booked, then the seat will remain booked even if the system crashes.

| Durability               | 9s        | Remarks                                                                                                                          |
|--------------------------|-----------|----------------------------------------------------------------------------------------------------------------------------------|
| 99.999999999% durability | eleven 9s | If you store 10,000 objects in a database service, an average expect to incur a loss of a single object once every 10,000 years. |