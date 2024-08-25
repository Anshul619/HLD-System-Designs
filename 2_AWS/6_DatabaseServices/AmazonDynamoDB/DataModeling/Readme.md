# Data Modeling - Examples
- [Orders - Single Table Design](OrdersSingleTableDesign.md)
- [Employee - Relational Modeling](EmployeeOrdersRelationalModeling.md)
- [Students - Many to Many Relationship](StudentGradesManyToManyRelationship.md)
- [Grab - Order Processing](../../../../1_TechStacks/Grab/OrdersProcessing.md)

# Design Patterns

## Adjacency list design pattern
- When different entities of an application have a many-to-many relationship between them, the relationship can be modeled as an [adjacency list](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-adjacency-graphs.html). 
- In this pattern, all top-level entities (synonymous to nodes in the graph model) are represented using the partition key.

![](https://docs.aws.amazon.com/images/amazondynamodb/latest/developerguide/images/AdjacencyLists_01.png)

# Best Practice
- In general, you should maintain as few tables as possible in a DynamoDB application. 
- Exceptions include cases where high-volume time series data are involved, or datasets that have very different access patterns. 
- A single table with inverted indexes can usually enable simple queries to create and retrieve the complex hierarchical data structures required by your application.

# GSI overloading
- The fact that some of these entities use proper names and others use other entity IDs as [sort key](../../../../3_Databases/3_ScalabilityTechniques/PartitioningSharding/PartitionKey/SortKey.md) values allows the same [global secondary index](../SecondaryIndexes.md) to support multiple types of queries.

