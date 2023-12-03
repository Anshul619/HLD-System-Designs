# Student-Grades - Many-to-Many Relationship
- 1 table with 1 GSI (without any joins) in [DynamoDB](../Readme.md), instead of 3 tables in [SQL db](../../../../3_DatabaseServices/6_SQLvsNoSQL/Readme.md) for many-many relatioship.

# Base Table

| Id - Partition Key | SK - Sort Key | Email             | Name    | Grade |
|--------------------|---------------|-------------------|---------|-------|
| student-1          | student-1     | joe@example.com   | Joe     |       |
| student-1          | subject-1     |                   |         | 85    |
| student-2          | student-2     | peter@example.com | Peter   |       |
| student-2          | subject-1     |                   |         | 91    |
| student-2          | subject-2     |                   |         | 84    |
| subject-1          | subject-1     |                   | History |       |
| subject-2          | subject-2     |                   | Math    |       |

# GSI

| SK - Primary Key | Id - Sort Key | Email             | Name    | Grade |
|------------------|---------------|-------------------|---------|-------|
| subject-1        | subject-1     |                   | History |       |
| subject-1        | student-1     |                   |         | 85    |
| subject-1        | student-2     |                   |         | 91    |
| subject-2        | subject-2     |                   | Math    |       |
| subject-2        | student-2     |                   |         | 84    |
| student-1        | student-1     | joe@example.com   | Joe     |       |
| student-2        | student-2     | peter@example.com | Peter   |       |

