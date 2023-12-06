# Data Modeling - Examples
- [Orders - Single Table Design](OrdersSingleTableDesign.md)
- [Employee - Relational Modeling](EmployeeOrdersRelationalModeling.md)
- [Students - Many to Many Relationship](StudentGradesManyToManyRelationship.md)
- [Grab - Order Processing](../../../../1_TechStacks/Grab/OrdersProcessing.md)

# GSI overloading
- The fact that some of these entities use proper names and others use other entity IDs as [sort key](../../../../3_DatabaseServices/3_ScalabilityTechniques/PartitioningSharding/PartitionKey/SortKey.md) values allows the same [global secondary index](../SecondaryIndexes.md) to support multiple types of queries.