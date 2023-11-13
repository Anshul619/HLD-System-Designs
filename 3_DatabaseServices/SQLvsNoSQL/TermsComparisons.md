# Main Terms - SQL vs DynamoDB vs Document-DB vs Search-Index

| SQL-DB              | DynamoDB    | Document-DB       | Search-DB                                                                             |
|---------------------|-------------|-------------------|---------------------------------------------------------------------------------------|
| Table               | Table       | Collection        | [Indices](https://www.elastic.co/guide/en/elasticsearch/guide/2.x/_add_an_index.html) |
| Row                 | Items       | Document          | Document (expressed in JSON `(key: value) pair. '{"user": "nullcon"}'`)               |
| Column              | Attributes  | Field             |                                                                                       |
| Primary key         | Primary key | Object ID         | Unique-ID                                                                             |
| Nested table/object |             | Embedded document | Embedded document                                                                     |