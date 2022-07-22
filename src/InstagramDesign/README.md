## Introduction


## Images MetaData - DB Schema
- Photo table
- User table
- User Follow Table

## Partitioning based on PhotoID

## Tech Decisions
- Images Storage - HDFS
- Images MetaData - Postgres ( since we need joins )

## NewsFeed - Push vs Pull model - Hybrid
- For celebrity user, use Pull model
- For normal user, use Push model ( long polling or websocket )

# References
- https://www.educative.io/courses/grokking-the-system-design-interview/m2yDVZnQ8lG
- https://www.youtube.com/watch?v=QmX2NPkJTKg
