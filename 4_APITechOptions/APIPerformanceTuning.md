# API performance tuning

| Principle               | Remarks                                                                                                            |
|-------------------------|--------------------------------------------------------------------------------------------------------------------|
| Caching                 | Use [redis](../6_DatabaseServices/In-Memory-DB/Redis/Readme.md), to improve performance of get apis.             |
| Connection Polling      | Maintain a pool of connections, instead of opening a new connection for every API request.                         |
| Avoid N+1 Query pattern | Instead of querying data in N queries (with different ids), query data in 1 query.                                 |
| Pagination              | Break large API response using limit & offset                                                                      |
| JSON Serialization      | Consider fast JSON serialization library, to speed up API performance.                                             |
| Compression             | Data compression can help in decreasing network bandwidth.                                                         |
| Asynchronous logging    | Instead of writing logs in the disk directly, write logs in-memory and then write logs in the disk asynchronously. |

# Read more
- [Top 7 Ways to 10x Your API Performance](https://www.youtube.com/watch?v=zvWKqUiovAM)