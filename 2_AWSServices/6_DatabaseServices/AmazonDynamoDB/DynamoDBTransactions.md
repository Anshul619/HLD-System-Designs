# DynamoDB Transactions
- [Amazon DynamoDB transactions](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/transactions.html) simplify the developer experience of making coordinated, all-or-nothing changes to multiple items both within and across tables. 
- Transactions provide [atomicity, consistency, isolation, and durability (ACID)](../../../3_DatabaseServices/1_ACIDTransactions/Readme.md) in DynamoDB, helping you to maintain data correctness in your applications.

# Limitations

| Limitation                                                 |
|------------------------------------------------------------|
| Max 25 items per transaction                               |
| Consume 2x capacity units                                  |
| Can have only one operation per element in the transaction |

> Due to these limitations, it's suggested to avoid transaction in DynamoDB.
> Don’t build your logic around transactions, rather use them if there is no other choice.

# Read more
- :star: [What I’ve Learned From Using AWS DynamoDB in Production for More Than 3 Years?](https://medium.com/aws-tip/what-ive-learned-from-using-aws-dynamodb-in-production-for-more-than-3-years-49a077886b5c)
