# Relational Modeling
- Relational modeling is done in DynamoDB, through [edge items](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-modeling-nosql-B.html) in the record.
- And [GSI overloading](../SecondaryIndexes.md) is helpful in this case.

# Examples
- [Employee - Relational Modeling](EmployeeOrdersRelationalModeling.md)
- [Students - Many to Many Relationship](StudentGradesManyToManyRelationship.md)
- [Grab - Order Processing](../../../../1_TechStacks/Grab/OrdersProcessing.md)