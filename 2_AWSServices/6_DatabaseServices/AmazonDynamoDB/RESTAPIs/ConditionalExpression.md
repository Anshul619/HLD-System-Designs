# Condition expressions
- To manipulate data in an Amazon DynamoDB table, you use the PutItem, UpdateItem, and DeleteItem operations. (You can also use BatchWriteItem to perform multiple PutItem or DeleteItem operations in a single call.)
- For these data manipulation operations, you can specify a [condition expression](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.ConditionExpressions.html) to determine which items should be modified. If the condition expression evaluates to true, the operation succeeds; otherwise, the operation fails.

````script
aws dynamodb put-item \
    --table-name ProductCatalog \
    --item file://item.json \
    --condition-expression "attribute_not_exists(Id)"
````