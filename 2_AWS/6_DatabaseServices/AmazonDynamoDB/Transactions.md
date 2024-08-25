# DynamoDB Transactions
- [Amazon DynamoDB transactions](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/transactions.html) simplify the developer experience of making coordinated, all-or-nothing changes to multiple items both within and across tables. 
- Transactions provide [atomicity, consistency, isolation, and durability (ACID)](../../../3_Databases/1_ACIDTransactions/Readme.md) in DynamoDB, helping you to maintain data correctness in your applications.

# Transaction APIs

| API                | Remarks                                                      |
|--------------------|--------------------------------------------------------------|
| TransactWriteItems | Write up to 100 items per transaction, specify precondition. |
| TransactGetItems   | Read up to 100 items together.                               |

[Read more](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/transaction-apis.html)

# Limitations

| Limitation                                                                     |
|--------------------------------------------------------------------------------|
| Max 100 items per transaction                                                  |
| Consume 2x capacity units                                                      |
| Can have only one operation per element in the transaction                     |
| Disabled for global tables by default, can contact AWS support to enable them. |

# Transaction Best Practices

| Best Practice                                                |
|--------------------------------------------------------------|
| Enable Autoscaling                                           |
| Use Client token to ensure idempotency                       |
| Split transactions to smaller transactions, to minimize risk |
| Use BatchWriteItem if possible, instead of Transaction APIs  |

# Read more
- [What I’ve Learned From Using AWS DynamoDB in Production for More Than 3 Years?](https://medium.com/aws-tip/what-ive-learned-from-using-aws-dynamodb-in-production-for-more-than-3-years-49a077886b5c)
