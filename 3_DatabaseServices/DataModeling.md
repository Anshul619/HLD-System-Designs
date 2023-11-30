# Key Questions

| Title                 | Remarks                                                                                                                                                        |
|-----------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Priority              | Do you have workloads with different priority levels? For example - Orders (Last 6 months vs Older orders for compliance)                                      |
| Related entities      | Do you have multiple entities that are accessed together?                                                                                                      |

# Patterns

| Pattern                                                                                                                                                                                                    | Benefit                           | Type     |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------|----------|
| Data that is accessed together should be stored together                                                                                                                                                   | Minimize Joins                    | NoSQL    |
| [Vertical partitioning](https://aws.amazon.com/blogs/database/use-vertical-partitioning-to-scale-data-efficiently-in-amazon-dynamodb/) - Breaks items into multiple items using partition key and sort key | Performance and Cost optimization | DynamoDB |

# Read more
- [AWS re:Invent 2023 - Data modeling core concepts for Amazon DynamoDB](https://www.youtube.com/watch?v=l-Urbf4BaWg)