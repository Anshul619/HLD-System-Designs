# Sparse Indexes
- For any item in a table, DynamoDB writes a corresponding index entry only if the index sort key value is present in the item. 
- If the sort key doesn't appear in every table item, or if the index partition key is not present in the item, the index is said to be sparse.
- [Read more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-indexes-general-sparse-indexes.html)