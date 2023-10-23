# Main Terms - SQL vs Document-DB vs Search-Index

| SQL-DB              | Document-DB       | Search-Index                                                                          | Remarks                                           |
|---------------------|-------------------|---------------------------------------------------------------------------------------|---------------------------------------------------|
| Table               | Collection        | [Indices](https://www.elastic.co/guide/en/elasticsearch/guide/2.x/_add_an_index.html) | Multiple tables might be joined to form an index. |
| Row                 | Document          | Document (expressed in JSON `(key: value) pair. '{"user": "nullcon"}'`)               |                                                   |
| Column              | Field             |                                                                                       |                                                   |
| Primary key         | Object ID         | Unique-ID                                                                             |                                                   |
| Nested table/object | Embedded document | Embedded document                                                                     |                                                   |