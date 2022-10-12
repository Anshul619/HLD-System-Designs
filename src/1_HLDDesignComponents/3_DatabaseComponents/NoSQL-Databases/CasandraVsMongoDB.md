
# Difference between Cassandra and MongoDB

| Basis              | [Casandra](ApacheCasandra.md)                                                                                                                      | [MongoDB](MongoDB/Readme.md)                                                               |
|--------------------|----------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| DB Type            | Document DB Store                                                                                                                                  | Wide-Column DB Store                                                                       |
| Writing Scalablity | Writing scalability in Cassandra is very high and efficient. <br/>- Due to [Append-Only nature](../../0_SystemGlossaries/AppendOnlyDBStorages.md). | Writing scalability is limited in MongoDB.                                                 |
| Read Performance   | Read performance is highly efficient in Cassandra as it takes O(1) time.                                                                           | Read performance is not that fast in MongoDB when compared to Cassandra.                   |
| Data Format        | Cassandra only supports JSON data format.                                                                                                          | MongoDB supports both [JSON and BSON data formats](https://www.mongodb.com/json-and-bson). |
| Replication Method | The replication method that Cassandra supports is Selectable Replication Factor.                                                                   | The replication method that MongoDB supports is Master Slave Replication                   |
| [ACID Support](../../0_SystemGlossaries/ACIDPropertyTransaction.md)     | [Cassandra does not provides ACID transactions](../../0_SystemGlossaries/ACIDPropertyTransaction.md) but can be tuned to support ACID properties.                                                       | MongoDB provides [Multi-document ACID transactions](../../0_SystemGlossaries/ACIDPropertyTransaction.md) with snapshot isolation.               |
| Used by            | Famous companies like Hulu, Instagram, Intuit, Netflix, Reddit, etc uses Cassandra.                                                                | Famous companies like Adobe, Amadeus, Lyft, ViaVarejo, Craftbase, etc uses MongoDB.        |
| Secondary Indexes  | Cassandra has only cursory support for secondary indexes i.e secondary indexing is restricted.                                                     | MongoDB does supports the concept of secondary indexes.                                    |

# Reference
- [Difference between Cassandra and MongoDB](https://www.geeksforgeeks.org/difference-between-cassandra-and-mongodb/)
- [Cassandra vs MongoDB Comparison](https://www.mongodb.com/compare/cassandra-vs-mongodb)