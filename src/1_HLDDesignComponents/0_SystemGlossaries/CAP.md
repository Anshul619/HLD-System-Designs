## :star: [CAP Theorem of the Distributed Systems](https://www.geeksforgeeks.org/the-cap-theorem-in-dbms/)

![img.png](../10_Others_assests/CAP_Theorem_Distributed_Systems.drawio.png)

> The use of the word `Consistency` in `CAP` and its use in `ACID` do not refer to the same identical concept.
> - In CAP, the term consistency refers to the `consistency of the values in different copies of the same data item in a replicated distributed system`.
    > In case of high availability, it takes time for data to be replicated in multiple highly available zones.
    >   - Hence `Consistency` won't be there for those `milliseconds`.
> - In ACID, it refers to the fact that a transaction will not violate the integrity constraints specified on the database schema.